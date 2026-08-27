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

public class afk {
   private static final tl a = tl.c("commands.debug.function.noRecursion");
   private static final aew b = new aew("tick");
   private static final aew c = new aew("load");
   final MinecraftServer d;
   @Nullable
   private afk.a e;
   private List<dp> f = ImmutableList.of();
   private boolean g;
   private afj h;

   public afk(MinecraftServer $$0, afj $$1) {
      this.d = $$0;
      this.h = $$1;
      this.b($$1);
   }

   public int a() {
      return this.d.aI().c(cpr.w);
   }

   public CommandDispatcher<dt> b() {
      return this.d.aC().a();
   }

   public void c() {
      if (this.g) {
         this.g = false;
         Collection<dp> $$0 = this.h.b(c);
         this.a($$0, c);
      }

      this.a(this.f, b);
   }

   private void a(Collection<dp> $$0, aew $$1) {
      this.d.aM().a($$1::toString);

      for (dp $$2 : $$0) {
         this.a($$2, this.d());
      }

      this.d.aM().c();
   }

   public int a(dp $$0, dt $$1) {
      try {
         return this.a($$0, $$1, null, null);
      } catch (dv var4) {
         return 0;
      }
   }

   public int a(dp $$0, dt $$1, @Nullable afk.c $$2, @Nullable qw $$3) throws dv {
      dp $$4 = $$0.a($$3, this.b(), $$1);
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
            this.e = new afk.a($$2);
            var6 = this.e.b($$4, $$1);
         } finally {
            this.e = null;
         }

         return var6;
      }
   }

   public void a(afj $$0) {
      this.h = $$0;
      this.b($$0);
   }

   private void b(afj $$0) {
      this.f = ImmutableList.copyOf($$0.b(b));
      this.g = true;
   }

   public dt d() {
      return this.d.aD().a(2).a();
   }

   public Optional<dp> a(aew $$0) {
      return this.h.a($$0);
   }

   public Collection<dp> b(aew $$0) {
      return this.h.b($$0);
   }

   public Iterable<aew> e() {
      return this.h.a().keySet();
   }

   public Iterable<aew> f() {
      return this.h.b();
   }

   class a {
      private int b;
      @Nullable
      private final afk.c c;
      private final Deque<afk.b> d = Queues.newArrayDeque();
      private final List<afk.b> e = Lists.newArrayList();
      boolean f = false;

      a(@Nullable afk.c $$0) {
         this.c = $$0;
      }

      void a(dp $$0, dt $$1) {
         int $$2 = afk.this.a();
         dt $$3 = this.a($$1);
         if (this.d.size() + this.e.size() < $$2) {
            this.e.add(new afk.b($$3, this.b, new dp.e($$0)));
         }
      }

      private dt a(dt $$0) {
         IntConsumer $$1 = $$0.p();
         return $$1 instanceof afk.a.a ? $$0 : $$0.a(new afk.a.a($$1));
      }

      int b(dp $$0, dt $$1) {
         int $$2 = afk.this.a();
         dt $$3 = this.a($$1);
         int $$4 = 0;
         dp.d[] $$5 = $$0.b();

         for (int $$6 = $$5.length - 1; $$6 >= 0; $$6--) {
            this.d.push(new afk.b($$3, 0, $$5[$$6]));
         }

         while (!this.d.isEmpty()) {
            try {
               afk.b $$7 = this.d.removeFirst();
               afk.this.d.aM().a($$7::toString);
               this.b = $$7.b;
               $$7.a(afk.this, this.d, $$2, this.c);
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
               afk.this.d.aM().c();
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
      private final dt a;
      final int b;
      private final dp.d c;

      public b(dt $$0, int $$1, dp.d $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      public void a(afk $$0, Deque<afk.b> $$1, int $$2, @Nullable afk.c $$3) {
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

      void a(int var1, aew var2, int var3);
   }
}
