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

public class afl {
   private static final tm a = tm.c("commands.debug.function.noRecursion");
   private static final aex b = new aex("tick");
   private static final aex c = new aex("load");
   final MinecraftServer d;
   @Nullable
   private afl.a e;
   private List<dp> f = ImmutableList.of();
   private boolean g;
   private afk h;

   public afl(MinecraftServer $$0, afk $$1) {
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

   private void a(Collection<dp> $$0, aex $$1) {
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

   public int a(dp $$0, dt $$1, @Nullable afl.c $$2, @Nullable qy $$3) throws dv {
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
            this.e = new afl.a($$2);
            var6 = this.e.b($$4, $$1);
         } finally {
            this.e = null;
         }

         return var6;
      }
   }

   public void a(afk $$0) {
      this.h = $$0;
      this.b($$0);
   }

   private void b(afk $$0) {
      this.f = ImmutableList.copyOf($$0.b(b));
      this.g = true;
   }

   public dt d() {
      return this.d.aD().a(2).a();
   }

   public Optional<dp> a(aex $$0) {
      return this.h.a($$0);
   }

   public Collection<dp> b(aex $$0) {
      return this.h.b($$0);
   }

   public Iterable<aex> e() {
      return this.h.a().keySet();
   }

   public Iterable<aex> f() {
      return this.h.b();
   }

   class a {
      private int b;
      @Nullable
      private final afl.c c;
      private final Deque<afl.b> d = Queues.newArrayDeque();
      private final List<afl.b> e = Lists.newArrayList();
      boolean f = false;

      a(@Nullable afl.c $$0) {
         this.c = $$0;
      }

      void a(dp $$0, dt $$1) {
         int $$2 = afl.this.a();
         dt $$3 = this.a($$1);
         if (this.d.size() + this.e.size() < $$2) {
            this.e.add(new afl.b($$3, this.b, new dp.e($$0)));
         }
      }

      private dt a(dt $$0) {
         IntConsumer $$1 = $$0.p();
         return $$1 instanceof afl.a.a ? $$0 : $$0.a(new afl.a.a($$1));
      }

      int b(dp $$0, dt $$1) {
         int $$2 = afl.this.a();
         dt $$3 = this.a($$1);
         int $$4 = 0;
         dp.d[] $$5 = $$0.b();

         for (int $$6 = $$5.length - 1; $$6 >= 0; $$6--) {
            this.d.push(new afl.b($$3, 0, $$5[$$6]));
         }

         while (!this.d.isEmpty()) {
            try {
               afl.b $$7 = this.d.removeFirst();
               afl.this.d.aM().a($$7::toString);
               this.b = $$7.b;
               $$7.a(afl.this, this.d, $$2, this.c);
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
               afl.this.d.aM().c();
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

      public void a(afl $$0, Deque<afl.b> $$1, int $$2, @Nullable afl.c $$3) {
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

      void a(int var1, aex var2, int var3);
   }
}
