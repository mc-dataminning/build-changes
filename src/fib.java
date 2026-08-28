import com.mojang.blaze3d.systems.RenderSystem;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class fib extends fmy {
   private static final alb a = new alb("popup/background");
   private static final int b = 12;
   private static final int c = 18;
   private static final int d = 6;
   private static final int r = 130;
   private static final int s = 64;
   private static final int u = 250;
   private final fmy v;
   @Nullable
   private final alb w;
   private final xl x;
   private final List<fib.b> y;
   @Nullable
   private final Runnable z;
   private final int A;
   private final fkq B = fkq.d();

   fib(fmy $$0, int $$1, @Nullable alb $$2, xl $$3, xl $$4, List<fib.b> $$5, @Nullable Runnable $$6) {
      super($$3);
      this.v = $$0;
      this.w = $$2;
      this.x = $$4;
      this.y = $$5;
      this.z = $$6;
      this.A = $$1 - 36;
   }

   @Override
   public void aG_() {
      super.aG_();
      this.v.o();
   }

   @Override
   protected void aN_() {
      this.B.a(12).c().b();
      this.B.a(new fht(this.l.f().a(n.r), this.p).d(this.A).b(true));
      if (this.w != null) {
         this.B.a(fhm.a(130, 64, this.w, 130, 64));
      }

      this.B.a(new fht(this.x, this.p).d(this.A).b(true));
      this.B.a(this.m());
      this.B.a($$1 -> {
         fgx var10000 = this.c($$1);
      });
      this.c();
   }

   private fkq m() {
      int $$0 = 6 * (this.y.size() - 1);
      int $$1 = Math.min((this.A - $$0) / this.y.size(), 150);
      fkq $$2 = fkq.e();
      $$2.a(6);

      for (fib.b $$3 : this.y) {
         $$2.a(fgz.a($$3.a(), $$1x -> $$3.b().accept(this)).a($$1).a());
      }

      return $$2;
   }

   @Override
   protected void c() {
      this.v.a(this.m, this.n, this.o);
      this.B.a();
      fkk.a(this.B, this.G());
   }

   @Override
   public void b(fgm $$0, int $$1, int $$2, float $$3) {
      this.v.a($$0, -1, -1, $$3);
      $$0.e();
      RenderSystem.clear(256, ffa.a);
      this.b($$0);
      $$0.a(a, this.B.C() - 18, this.B.D() - 18, this.B.x() + 36, this.B.v() + 36);
   }

   @Override
   public xl i() {
      return xk.a(this.l, this.x);
   }

   @Override
   public void d() {
      if (this.z != null) {
         this.z.run();
      }

      this.m.a(this.v);
   }

   public static class a {
      private final fmy a;
      private final xl b;
      private xl c = xk.a;
      private int d = 250;
      @Nullable
      private alb e;
      private final List<fib.b> f = new ArrayList<>();
      @Nullable
      private Runnable g = null;

      public a(fmy $$0, xl $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public fib.a a(int $$0) {
         this.d = $$0;
         return this;
      }

      public fib.a a(alb $$0) {
         this.e = $$0;
         return this;
      }

      public fib.a a(xl $$0) {
         this.c = $$0;
         return this;
      }

      public fib.a a(xl $$0, Consumer<fib> $$1) {
         this.f.add(new fib.b($$0, $$1));
         return this;
      }

      public fib.a a(Runnable $$0) {
         this.g = $$0;
         return this;
      }

      public fib a() {
         if (this.f.isEmpty()) {
            throw new IllegalStateException("Popup must have at least one button");
         } else {
            return new fib(this.a, this.d, this.e, this.b, this.c, List.copyOf(this.f), this.g);
         }
      }
   }

   static record b(xl a, Consumer<fib> b) {
   }
}
