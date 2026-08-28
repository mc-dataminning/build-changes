import java.util.EnumSet;
import javax.annotation.Nullable;

public class clj extends ckv implements bvd {
   public static final float b = 45.836624F;
   public static final int c = azc.f((float) (Math.PI * 5.0 / 4.0));
   protected static final akg<Byte> d = akk.a(clj.class, aki.a);
   private static final int e = 1;
   @Nullable
   buh bZ;
   @Nullable
   private je ca;
   private boolean cb;
   private int cc;

   public clj(btq<? extends clj> $$0, dds $$1) {
      super($$0, $$1);
      this.bQ = new clj.c(this);
      this.bO = 3;
   }

   @Override
   public boolean aZ() {
      return this.ag % c == 0;
   }

   @Override
   protected boolean aJ() {
      return !this.dN();
   }

   @Override
   public void l() {
      this.ae = true;
      super.l();
      this.ae = false;
      this.f(true);
      if (this.cb && --this.cc <= 0) {
         this.cc = 20;
         this.a(this.dT().j(), 1.0F);
      }
   }

   @Override
   protected void D() {
      super.D();
      this.bT.a(0, new caw(this));
      this.bT.a(4, new clj.a());
      this.bT.a(8, new clj.d());
      this.bT.a(9, new cbk(this, cnp.class, 3.0F, 1.0F));
      this.bT.a(10, new cbk(this, buh.class, 8.0F));
      this.bU.a(1, new ccu(this, cpd.class).a());
      this.bU.a(2, new clj.b(this));
      this.bU.a(3, new ccv<>(this, cnp.class, true));
   }

   public static bvl.a q() {
      return ckv.gu().a(bvm.s, 14.0).a(bvm.c, 4.0);
   }

   @Override
   protected void a(akk.a $$0) {
      super.a($$0);
      $$0.a(d, (byte)0);
   }

   @Override
   public void a(uf $$0) {
      super.a($$0);
      if ($$0.e("BoundX")) {
         this.ca = new je($$0.h("BoundX"), $$0.h("BoundY"), $$0.h("BoundZ"));
      }

      if ($$0.e("LifeTicks")) {
         this.b($$0.h("LifeTicks"));
      }
   }

   @Override
   public void x(btj $$0) {
      super.x($$0);
      if ($$0 instanceof clj $$1) {
         this.bZ = $$1.t();
      }
   }

   @Override
   public void b(uf $$0) {
      super.b($$0);
      if (this.ca != null) {
         $$0.a("BoundX", this.ca.u());
         $$0.a("BoundY", this.ca.v());
         $$0.a("BoundZ", this.ca.w());
      }

      if (this.cb) {
         $$0.a("LifeTicks", this.cc);
      }
   }

   @Nullable
   public buh t() {
      return this.bZ;
   }

   @Nullable
   public je y() {
      return this.ca;
   }

   public void h(@Nullable je $$0) {
      this.ca = $$0;
   }

   private boolean c(int $$0) {
      int $$1 = this.am.a(d);
      return ($$1 & $$0) != 0;
   }

   private void a(int $$0, boolean $$1) {
      int $$2 = this.am.a(d);
      if ($$1) {
         $$2 |= $$0;
      } else {
         $$2 &= ~$$0;
      }

      this.am.a(d, (byte)($$2 & 0xFF));
   }

   public boolean go() {
      return this.c(1);
   }

   public void x(boolean $$0) {
      this.a(1, $$0);
   }

   public void a(buh $$0) {
      this.bZ = $$0;
   }

   public void b(int $$0) {
      this.cb = true;
      this.cc = $$0;
   }

   @Override
   protected awc w() {
      return awd.AU;
   }

   @Override
   protected awc n_() {
      return awd.AW;
   }

   @Override
   protected awc d(bsb $$0) {
      return awd.AX;
   }

   @Override
   public float bx() {
      return 1.0F;
   }

   @Nullable
   @Override
   public bux a(dei $$0, bri $$1, btp $$2, @Nullable bux $$3) {
      azk $$4 = $$0.C_();
      this.a($$4, $$1);
      this.a($$0, $$4, $$1);
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(azk $$0, bri $$1) {
      this.a(btr.a, new cvl(cvo.pc));
      this.a(btr.a, 0.0F);
   }

   class a extends cbc {
      public a() {
         this.a(EnumSet.of(cbc.a.a));
      }

      @Override
      public boolean b() {
         buf $$0 = clj.this.m();
         return $$0 != null && $$0.bI() && !clj.this.M().b() && clj.this.af.a(b(7)) == 0 ? clj.this.g($$0) > 4.0 : false;
      }

      @Override
      public boolean c() {
         return clj.this.M().b() && clj.this.go() && clj.this.m() != null && clj.this.m().bI();
      }

      @Override
      public void d() {
         buf $$0 = clj.this.m();
         if ($$0 != null) {
            eye $$1 = $$0.bC();
            clj.this.bQ.a($$1.d, $$1.e, $$1.f, 1.0);
         }

         clj.this.x(true);
         clj.this.a(awd.AV, 1.0F, 1.0F);
      }

      @Override
      public void e() {
         clj.this.x(false);
      }

      @Override
      public boolean T_() {
         return true;
      }

      @Override
      public void a() {
         buf $$0 = clj.this.m();
         if ($$0 != null) {
            if (clj.this.cO().c($$0.cO())) {
               clj.this.E($$0);
               clj.this.x(false);
            } else {
               double $$1 = clj.this.g($$0);
               if ($$1 < 9.0) {
                  eye $$2 = $$0.bC();
                  clj.this.bQ.a($$2.d, $$2.e, $$2.f, 1.0);
               }
            }
         }
      }
   }

   class b extends cdc {
      private final cev b = cev.b().d().e();

      public b(final bun $$0) {
         super($$0, false);
      }

      @Override
      public boolean b() {
         return clj.this.bZ != null && clj.this.bZ.m() != null && this.a(clj.this.bZ.m(), this.b);
      }

      @Override
      public void d() {
         clj.this.h(clj.this.bZ.m());
         super.d();
      }
   }

   class c extends caf {
      public c(final clj $$0) {
         super($$0);
      }

      @Override
      public void a() {
         if (this.k == caf.a.b) {
            eye $$0 = new eye(this.e - clj.this.dx(), this.f - clj.this.dz(), this.g - clj.this.dD());
            double $$1 = $$0.g();
            if ($$1 < clj.this.cO().a()) {
               this.k = caf.a.a;
               clj.this.h(clj.this.dv().c(0.5));
            } else {
               clj.this.h(clj.this.dv().e($$0.c(this.h * 0.05 / $$1)));
               if (clj.this.m() == null) {
                  eye $$2 = clj.this.dv();
                  clj.this.v(-((float)azc.d($$2.d, $$2.f)) * (180.0F / (float)Math.PI));
                  clj.this.aU = clj.this.dI();
               } else {
                  double $$3 = clj.this.m().dx() - clj.this.dx();
                  double $$4 = clj.this.m().dD() - clj.this.dD();
                  clj.this.v(-((float)azc.d($$3, $$4)) * (180.0F / (float)Math.PI));
                  clj.this.aU = clj.this.dI();
               }
            }
         }
      }
   }

   class d extends cbc {
      public d() {
         this.a(EnumSet.of(cbc.a.a));
      }

      @Override
      public boolean b() {
         return !clj.this.M().b() && clj.this.af.a(b(7)) == 0;
      }

      @Override
      public boolean c() {
         return false;
      }

      @Override
      public void a() {
         je $$0 = clj.this.y();
         if ($$0 == null) {
            $$0 = clj.this.ds();
         }

         for (int $$1 = 0; $$1 < 3; $$1++) {
            je $$2 = $$0.b(clj.this.af.a(15) - 7, clj.this.af.a(11) - 5, clj.this.af.a(15) - 7);
            if (clj.this.dS().u($$2)) {
               clj.this.bQ.a((double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, 0.25);
               if (clj.this.m() == null) {
                  clj.this.K().a((double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, 180.0F, 20.0F);
               }
               break;
            }
         }
      }
   }
}
