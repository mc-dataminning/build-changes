import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.Queues;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.Collection;
import java.util.Deque;
import java.util.List;
import java.util.Optional;
import java.util.function.IntConsumer;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public class aff {
   private static final tf a = tf.c("commands.debug.function.noRecursion");
   private static final aer b = new aer("tick");
   private static final aer c = new aer("load");
   final MinecraftServer d;
   @Nullable
   private aff.a e;
   private List<dm> f = ImmutableList.of();
   private boolean g;
   private afe h;

   public aff(MinecraftServer $$0, afe $$1) {
      this.d = $$0;
      this.h = $$1;
      this.b($$1);
   }

   public int a() {
      return this.d.aI().c(cpi.w);
   }

   public CommandDispatcher<dr> b() {
      return this.d.aC().a();
   }

   public void c() {
      if (this.g) {
         this.g = false;
         Collection<dm> $$0 = this.h.b(c);
         this.a($$0, c);
      }

      this.a(this.f, b);
   }

   private void a(Collection<dm> $$0, aer $$1) {
      this.d.aN().a($$1::toString);

      for (dm $$2 : $$0) {
         this.a($$2, this.d());
      }

      this.d.aN().c();
   }

   public int a(dm $$0, dr $$1) {
      try {
         return this.a($$0, $$1, null, null);
      } catch (dt var4) {
         return 0;
      }
   }

   public int a(dm $$0, dr $$1, @Nullable aff.c $$2, @Nullable qr $$3) throws dt {
      dm $$4 = $$0.a($$3, this.b(), $$1);
      if (this.e != null) {
         if ($$2 != null) {
            this.e.a(a.getString());
            return 0;
         } else {
            this.e.a($$4, $$1);
            return 0;
         }
      } else {
         int var6;
         try {
            this.e = new aff.a($$2);
            var6 = this.e.b($$4, $$1);
         } finally {
            this.e = null;
         }

         return var6;
      }
   }

   public void a(afe $$0) {
      this.h = $$0;
      this.b($$0);
   }

   private void b(afe $$0) {
      this.f = ImmutableList.copyOf($$0.b(b));
      this.g = true;
   }

   public dr d() {
      return this.d.aD().a(2).a();
   }

   public Optional<dm> a(aer $$0) {
      return this.h.a($$0);
   }

   public Collection<dm> b(aer $$0) {
      return this.h.b($$0);
   }

   public Iterable<aer> e() {
      return this.h.a().keySet();
   }

   public Iterable<aer> f() {
      return this.h.b();
   }

   class a {
      private int b;
      @Nullable
      private final aff.c c;
      private final Deque<aff.b> d = Queues.newArrayDeque();
      private final List<aff.b> e = Lists.newArrayList();
      boolean f = false;

      a(@Nullable aff.c $$0) {
         this.c = $$0;
      }

      void a(dm $$0, dr $$1) {
         int $$2 = aff.this.a();
         dr $$3 = this.a($$1);
         if (this.d.size() + this.e.size() < $$2) {
            this.e.add(new aff.b($$3, this.b, new dm.e($$0)));
         }
      }

      private dr a(dr $$0) {
         IntConsumer $$1 = $$0.p();
         return $$1 instanceof aff.a.a ? $$0 : $$0.a(new aff.a.a($$1));
      }

      int b(dm $$0, dr $$1) {
         int $$2 = aff.this.a();
         dr $$3 = this.a($$1);
         int $$4 = 0;
         dm.d[] $$5 = $$0.b();

         for (int $$6 = $$5.length - 1; $$6 >= 0; $$6--) {
            this.d.push(new aff.b($$3, 0, $$5[$$6]));
         }

         while (!this.d.isEmpty()) {
            try {
               aff.b $$7 = this.d.removeFirst();
               aff.this.d.aN().a($$7::toString);
               this.b = $$7.b;
               $$7.a(aff.this, this.d, $$2, this.c);
               if (!this.f) {
                  if (!this.e.isEmpty()) {
                     Lists.reverse(this.e).forEach(this.d::addFirst);
                  }
               } else {
                  while (!this.d.isEmpty() && this.d.peek().b >= this.b) {
                     this.d.removeFirst();
                  }

                  this.f = false;
               }

               this.e.clear();
            } finally {
               aff.this.d.aN().c();
            }

            if (++$$4 >= $$2) {
               return $$4;
            }
         }

         return $$4;
      }

      public void a(String $$0) {
         if (this.c != null) {
            this.c.b(this.b, $$0);
         }
      }

      class a implements IntConsumer {
         private final IntConsumer b;

         a(IntConsumer $$0) {
            this.b = $$0;
         }

         @Override
         public void accept(int $$0) {
            this.b.accept($$0);
            a.this.f = true;
         }
      }
   }

   public static class b {
      private final dr a;
      final int b;
      private final dm.d c;

      public b(dr $$0, int $$1, dm.d $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      public void a(aff $$0, Deque<aff.b> $$1, int $$2, @Nullable aff.c $$3) {
         try {
            this.c.execute($$0, this.a, $$1, $$2, this.b, $$3);
         } catch (CommandSyntaxException var6) {
            if ($$3 != null) {
               $$3.b(this.b, var6.getRawMessage().getString());
            }
         } catch (Exception var7) {
            if ($$3 != null) {
               $$3.b(this.b, var7.getMessage());
            }
         }
      }

      @Override
      public String toString() {
         return this.c.toString();
      }
   }

   public interface c {
      void a(int var1, String var2);

      void a(int var1, String var2, int var3);

      void b(int var1, String var2);

      void a(int var1, aer var2, int var3);
   }
}
