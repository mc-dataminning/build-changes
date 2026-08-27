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

public class afd {
   private static final te a = te.c("commands.debug.function.noRecursion");
   private static final aep b = new aep("tick");
   private static final aep c = new aep("load");
   final MinecraftServer d;
   @Nullable
   private afd.a e;
   private List<dn> f = ImmutableList.of();
   private boolean g;
   private afc h;

   public afd(MinecraftServer $$0, afc $$1) {
      this.d = $$0;
      this.h = $$1;
      this.b($$1);
   }

   public int a() {
      return this.d.aI().c(cpg.w);
   }

   public CommandDispatcher<ds> b() {
      return this.d.aC().a();
   }

   public void c() {
      if (this.g) {
         this.g = false;
         Collection<dn> $$0 = this.h.b(c);
         this.a($$0, c);
      }

      this.a(this.f, b);
   }

   private void a(Collection<dn> $$0, aep $$1) {
      this.d.aN().a($$1::toString);

      for (dn $$2 : $$0) {
         this.a($$2, this.d());
      }

      this.d.aN().c();
   }

   public int a(dn $$0, ds $$1) {
      try {
         return this.a($$0, $$1, null, null);
      } catch (du var4) {
         return 0;
      }
   }

   public int a(dn $$0, ds $$1, @Nullable afd.c $$2, @Nullable qs $$3) throws du {
      dn $$4 = $$0.a($$3, this.b(), $$1);
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
            this.e = new afd.a($$2);
            var6 = this.e.b($$4, $$1);
         } finally {
            this.e = null;
         }

         return var6;
      }
   }

   public void a(afc $$0) {
      this.h = $$0;
      this.b($$0);
   }

   private void b(afc $$0) {
      this.f = ImmutableList.copyOf($$0.b(b));
      this.g = true;
   }

   public ds d() {
      return this.d.aD().a(2).a();
   }

   public Optional<dn> a(aep $$0) {
      return this.h.a($$0);
   }

   public Collection<dn> b(aep $$0) {
      return this.h.b($$0);
   }

   public Iterable<aep> e() {
      return this.h.a().keySet();
   }

   public Iterable<aep> f() {
      return this.h.b();
   }

   class a {
      private int b;
      @Nullable
      private final afd.c c;
      private final Deque<afd.b> d = Queues.newArrayDeque();
      private final List<afd.b> e = Lists.newArrayList();
      boolean f = false;

      a(@Nullable afd.c $$0) {
         this.c = $$0;
      }

      void a(dn $$0, ds $$1) {
         int $$2 = afd.this.a();
         ds $$3 = this.a($$1);
         if (this.d.size() + this.e.size() < $$2) {
            this.e.add(new afd.b($$3, this.b, new dn.e($$0)));
         }
      }

      private ds a(ds $$0) {
         IntConsumer $$1 = $$0.p();
         return $$1 instanceof afd.a.a ? $$0 : $$0.a(new afd.a.a($$1));
      }

      int b(dn $$0, ds $$1) {
         int $$2 = afd.this.a();
         ds $$3 = this.a($$1);
         int $$4 = 0;
         dn.d[] $$5 = $$0.b();

         for (int $$6 = $$5.length - 1; $$6 >= 0; $$6--) {
            this.d.push(new afd.b($$3, 0, $$5[$$6]));
         }

         while (!this.d.isEmpty()) {
            try {
               afd.b $$7 = this.d.removeFirst();
               afd.this.d.aN().a($$7::toString);
               this.b = $$7.b;
               $$7.a(afd.this, this.d, $$2, this.c);
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
               afd.this.d.aN().c();
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
      private final ds a;
      final int b;
      private final dn.d c;

      public b(ds $$0, int $$1, dn.d $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      public void a(afd $$0, Deque<afd.b> $$1, int $$2, @Nullable afd.c $$3) {
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

      void a(int var1, aep var2, int var3);
   }
}
