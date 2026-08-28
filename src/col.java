import java.util.EnumSet;
import java.util.List;
import javax.annotation.Nullable;

public abstract class col extends cok {
   @Nullable
   private iv a;
   private boolean b;
   private boolean c;

   protected col(bwr<? extends col> $$0, djh $$1) {
      super($$0, $$1);
   }

   @Override
   protected void D() {
      super.D();
      this.bD.a(4, new col.a<>(this, 0.7, 0.595));
   }

   @Override
   public void b(tz $$0) {
      super.b($$0);
      $$0.b("patrol_target", iv.a, this.a);
      $$0.a("PatrolLeader", this.b);
      $$0.a("Patrolling", this.c);
   }

   @Override
   public void a(tz $$0) {
      super.a($$0);
      this.a = $$0.<iv>a("patrol_target", iv.a).orElse(null);
      this.b = $$0.o("PatrolLeader");
      this.c = $$0.o("Patrolling");
   }

   public boolean t() {
      return true;
   }

   @Nullable
   @Override
   public byb a(djy $$0, bue $$1, bwq $$2, @Nullable byb $$3) {
      if ($$2 != bwq.p && $$2 != bwq.h && $$2 != bwq.d && $$0.C_().i() < 0.06F && this.t()) {
         this.b = true;
      }

      if (this.gu()) {
         this.a(bws.f, csz.a(this.dW().f(mh.aF)));
         this.a(bws.f, 2.0F);
      }

      if ($$2 == bwq.p) {
         this.c = true;
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   public static boolean b(bwr<? extends col> $$0, dji $$1, bwq $$2, iv $$3, azv $$4) {
      return $$1.a(djq.b, $$3) > 8 ? false : c($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public boolean h(double $$0) {
      return !this.c || $$0 > 16384.0;
   }

   public void h(iv $$0) {
      this.a = $$0;
      this.c = true;
   }

   public iv x() {
      return this.a;
   }

   public boolean gt() {
      return this.a != null;
   }

   public void w(boolean $$0) {
      this.b = $$0;
      this.c = true;
   }

   public boolean gu() {
      return this.b;
   }

   public boolean gx() {
      return true;
   }

   public void gy() {
      this.a = this.du().b(-500 + this.ae.a(1000), 0, -500 + this.ae.a(1000));
      this.c = true;
   }

   protected boolean gz() {
      return this.c;
   }

   protected void x(boolean $$0) {
      this.c = $$0;
   }

   public static class a<T extends col> extends cef {
      private static final int a = 200;
      private final T b;
      private final double c;
      private final double d;
      private long e;

      public a(T $$0, double $$1, double $$2) {
         this.b = $$0;
         this.c = $$1;
         this.d = $$2;
         this.e = -1L;
         this.a(EnumSet.of(cef.a.a));
      }

      @Override
      public boolean b() {
         boolean $$0 = this.b.dU().ae() < this.e;
         return this.b.gz() && this.b.f() == null && !this.b.cW() && this.b.gt() && !$$0;
      }

      @Override
      public void d() {
      }

      @Override
      public void e() {
      }

      @Override
      public void a() {
         boolean $$0 = this.b.gu();
         cgt $$1 = this.b.O();
         if ($$1.k()) {
            List<col> $$2 = this.h();
            if (this.b.gz() && $$2.isEmpty()) {
               this.b.x(false);
            } else if ($$0 && this.b.x().a(this.b.ds(), 10.0)) {
               this.b.gy();
            } else {
               fex $$3 = fex.c(this.b.x());
               fex $$4 = this.b.ds();
               fex $$5 = $$4.d($$3);
               $$3 = $$5.b(90.0F).c(0.4).e($$3);
               fex $$6 = $$3.d($$4).d().c(10.0).e($$4);
               iv $$7 = iv.a((jp)$$6);
               $$7 = this.b.dU().a(egn.a.f, $$7);
               if (!$$1.a((double)$$7.u(), (double)$$7.v(), (double)$$7.w(), $$0 ? this.d : this.c)) {
                  this.i();
                  this.e = this.b.dU().ae() + 200L;
               } else if ($$0) {
                  for (col $$8 : $$2) {
                     $$8.h($$7);
                  }
               }
            }
         }
      }

      private List<col> h() {
         return this.b.dU().a(col.class, this.b.cQ().g(16.0), $$0 -> $$0.gx() && !$$0.u(this.b));
      }

      private boolean i() {
         azv $$0 = this.b.dX();
         iv $$1 = this.b.dU().a(egn.a.f, this.b.du().b(-8 + $$0.a(16), 0, -8 + $$0.a(16)));
         return this.b.O().a((double)$$1.u(), (double)$$1.v(), (double)$$1.w(), this.c);
      }
   }
}
