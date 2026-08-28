import java.util.EnumSet;
import java.util.List;
import javax.annotation.Nullable;

public abstract class cpa extends coz {
   private static final boolean a = false;
   private static final boolean b = false;
   @Nullable
   private iv c;
   private boolean d = false;
   private boolean e = false;

   protected cpa(bxc<? extends cpa> $$0, djx $$1) {
      super($$0, $$1);
   }

   @Override
   protected void D() {
      super.D();
      this.bF.a(4, new cpa.a<>(this, 0.7, 0.595));
   }

   @Override
   public void b(tz $$0) {
      super.b($$0);
      $$0.b("patrol_target", iv.a, this.c);
      $$0.a("PatrolLeader", this.d);
      $$0.a("Patrolling", this.e);
   }

   @Override
   public void a(tz $$0) {
      super.a($$0);
      this.c = $$0.<iv>a("patrol_target", iv.a).orElse(null);
      this.d = $$0.b("PatrolLeader", false);
      this.e = $$0.b("Patrolling", false);
   }

   public boolean t() {
      return true;
   }

   @Nullable
   @Override
   public bym a(dko $$0, bup $$1, bxb $$2, @Nullable bym $$3) {
      if ($$2 != bxb.p && $$2 != bxb.h && $$2 != bxb.d && $$0.G_().i() < 0.06F && this.t()) {
         this.d = true;
      }

      if (this.gv()) {
         this.a(bxd.f, ctn.a(this.dX().f(mh.aF)));
         this.a(bxd.f, 2.0F);
      }

      if ($$2 == bxb.p) {
         this.e = true;
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   public static boolean b(bxc<? extends cpa> $$0, djy $$1, bxb $$2, iv $$3, azx $$4) {
      return $$1.a(dkg.b, $$3) > 8 ? false : c($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public boolean h(double $$0) {
      return !this.e || $$0 > 16384.0;
   }

   public void h(iv $$0) {
      this.c = $$0;
      this.e = true;
   }

   public iv x() {
      return this.c;
   }

   public boolean gu() {
      return this.c != null;
   }

   public void w(boolean $$0) {
      this.d = $$0;
      this.e = true;
   }

   public boolean gv() {
      return this.d;
   }

   public boolean gy() {
      return true;
   }

   public void gz() {
      this.c = this.dv().b(-500 + this.ae.a(1000), 0, -500 + this.ae.a(1000));
      this.e = true;
   }

   protected boolean gA() {
      return this.e;
   }

   protected void x(boolean $$0) {
      this.e = $$0;
   }

   public static class a<T extends cpa> extends ceq {
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
         this.a(EnumSet.of(ceq.a.a));
      }

      @Override
      public boolean b() {
         boolean $$0 = this.b.dV().ae() < this.e;
         return this.b.gA() && this.b.f() == null && !this.b.cX() && this.b.gu() && !$$0;
      }

      @Override
      public void d() {
      }

      @Override
      public void e() {
      }

      @Override
      public void a() {
         boolean $$0 = this.b.gv();
         che $$1 = this.b.O();
         if ($$1.k()) {
            List<cpa> $$2 = this.h();
            if (this.b.gA() && $$2.isEmpty()) {
               this.b.x(false);
            } else if ($$0 && this.b.x().a(this.b.dt(), 10.0)) {
               this.b.gz();
            } else {
               ffq $$3 = ffq.c(this.b.x());
               ffq $$4 = this.b.dt();
               ffq $$5 = $$4.d($$3);
               $$3 = $$5.b(90.0F).c(0.4).e($$3);
               ffq $$6 = $$3.d($$4).d().c(10.0).e($$4);
               iv $$7 = iv.a((jp)$$6);
               $$7 = this.b.dV().a(ehd.a.f, $$7);
               if (!$$1.a((double)$$7.u(), (double)$$7.v(), (double)$$7.w(), $$0 ? this.d : this.c)) {
                  this.i();
                  this.e = this.b.dV().ae() + 200L;
               } else if ($$0) {
                  for (cpa $$8 : $$2) {
                     $$8.h($$7);
                  }
               }
            }
         }
      }

      private List<cpa> h() {
         return this.b.dV().a(cpa.class, this.b.cR().g(16.0), $$0 -> $$0.gy() && !$$0.u(this.b));
      }

      private boolean i() {
         azx $$0 = this.b.dY();
         iv $$1 = this.b.dV().a(ehd.a.f, this.b.dv().b(-8 + $$0.a(16), 0, -8 + $$0.a(16)));
         return this.b.O().a((double)$$1.u(), (double)$$1.v(), (double)$$1.w(), this.c);
      }
   }
}
