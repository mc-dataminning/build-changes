import java.util.EnumSet;
import javax.annotation.Nullable;

public class ckq extends ckc implements bun {
   public static final float b = 45.836624F;
   public static final int c = ayy.f((float) (Math.PI * 5.0 / 4.0));
   protected static final akj<Byte> d = akn.a(ckq.class, akl.a);
   private static final int e = 1;
   @Nullable
   btq bY;
   @Nullable
   private iz bZ;
   private boolean ca;
   private int cb;

   public ckq(bsz<? extends ckq> $$0, dbx $$1) {
      super($$0, $$1);
      this.bP = new ckq.c(this);
      this.bN = 3;
   }

   @Override
   public boolean aV() {
      return this.ai % c == 0;
   }

   @Override
   public void a(btt $$0, evq $$1) {
      super.a($$0, $$1);
      this.aS();
   }

   @Override
   public void l() {
      this.ag = true;
      super.l();
      this.ag = false;
      this.f(true);
      if (this.ca && --this.cb <= 0) {
         this.cb = 20;
         this.a(this.dQ().i(), 1.0F);
      }
   }

   @Override
   protected void z() {
      super.z();
      this.bS.a(0, new cag(this));
      this.bS.a(4, new ckq.a());
      this.bS.a(8, new ckq.d());
      this.bS.a(9, new cau(this, cmw.class, 3.0F, 1.0F));
      this.bS.a(10, new cau(this, btq.class, 8.0F));
      this.bT.a(1, new cce(this, coi.class).a());
      this.bT.a(2, new ckq.b(this));
      this.bT.a(3, new ccf<>(this, cmw.class, true));
   }

   public static buv.a u() {
      return ckc.gw().a(buw.q, 14.0).a(buw.c, 4.0);
   }

   @Override
   protected void a(akn.a $$0) {
      super.a($$0);
      $$0.a(d, (byte)0);
   }

   @Override
   public void a(ur $$0) {
      super.a($$0);
      if ($$0.e("BoundX")) {
         this.bZ = new iz($$0.h("BoundX"), $$0.h("BoundY"), $$0.h("BoundZ"));
      }

      if ($$0.e("LifeTicks")) {
         this.b($$0.h("LifeTicks"));
      }
   }

   @Override
   public void w(bst $$0) {
      super.w($$0);
      if ($$0 instanceof ckq $$1) {
         this.bY = $$1.y();
      }
   }

   @Override
   public void b(ur $$0) {
      super.b($$0);
      if (this.bZ != null) {
         $$0.a("BoundX", this.bZ.u());
         $$0.a("BoundY", this.bZ.v());
         $$0.a("BoundZ", this.bZ.w());
      }

      if (this.ca) {
         $$0.a("LifeTicks", this.cb);
      }
   }

   @Nullable
   public btq y() {
      return this.bY;
   }

   @Nullable
   public iz gq() {
      return this.bZ;
   }

   public void i(@Nullable iz $$0) {
      this.bZ = $$0;
   }

   private boolean c(int $$0) {
      int $$1 = this.ao.a(d);
      return ($$1 & $$0) != 0;
   }

   private void a(int $$0, boolean $$1) {
      int $$2 = this.ao.a(d);
      if ($$1) {
         $$2 |= $$0;
      } else {
         $$2 &= ~$$0;
      }

      this.ao.a(d, (byte)($$2 & 0xFF));
   }

   public boolean gr() {
      return this.c(1);
   }

   public void w(boolean $$0) {
      this.a(1, $$0);
   }

   public void a(btq $$0) {
      this.bY = $$0;
   }

   public void b(int $$0) {
      this.ca = true;
      this.cb = $$0;
   }

   @Override
   protected avy v() {
      return avz.AK;
   }

   @Override
   protected avy o_() {
      return avz.AM;
   }

   @Override
   protected avy d(brm $$0) {
      return avz.AN;
   }

   @Override
   public float bt() {
      return 1.0F;
   }

   @Nullable
   @Override
   public buh a(dcm $$0, bqr $$1, bts $$2, @Nullable buh $$3) {
      azg $$4 = $$0.E_();
      this.a($$4, $$1);
      this.b($$4, $$1);
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(azg $$0, bqr $$1) {
      this.a(bta.a, new cuo(cur.pa));
      this.a(bta.a, 0.0F);
   }

   class a extends cam {
      public a() {
         this.a(EnumSet.of(cam.a.a));
      }

      @Override
      public boolean a() {
         bto $$0 = ckq.this.p();
         return $$0 != null && $$0.bD() && !ckq.this.H().b() && ckq.this.ah.a(b(7)) == 0 ? ckq.this.g($$0) > 4.0 : false;
      }

      @Override
      public boolean b() {
         return ckq.this.H().b() && ckq.this.gr() && ckq.this.p() != null && ckq.this.p().bD();
      }

      @Override
      public void c() {
         bto $$0 = ckq.this.p();
         if ($$0 != null) {
            evq $$1 = $$0.bx();
            ckq.this.bP.a($$1.c, $$1.d, $$1.e, 1.0);
         }

         ckq.this.w(true);
         ckq.this.a(avz.AL, 1.0F, 1.0F);
      }

      @Override
      public void d() {
         ckq.this.w(false);
      }

      @Override
      public boolean R_() {
         return true;
      }

      @Override
      public void e() {
         bto $$0 = ckq.this.p();
         if ($$0 != null) {
            if (ckq.this.cK().c($$0.cK())) {
               ckq.this.C($$0);
               ckq.this.w(false);
            } else {
               double $$1 = ckq.this.g($$0);
               if ($$1 < 9.0) {
                  evq $$2 = $$0.bx();
                  ckq.this.bP.a($$2.c, $$2.d, $$2.e, 1.0);
               }
            }
         }
      }
   }

   class b extends ccm {
      private final cef b = cef.b().d().e();

      public b(final btx $$0) {
         super($$0, false);
      }

      @Override
      public boolean a() {
         return ckq.this.bY != null && ckq.this.bY.p() != null && this.a(ckq.this.bY.p(), this.b);
      }

      @Override
      public void c() {
         ckq.this.h(ckq.this.bY.p());
         super.c();
      }
   }

   class c extends bzp {
      public c(final ckq $$0) {
         super($$0);
      }

      @Override
      public void a() {
         if (this.k == bzp.a.b) {
            evq $$0 = new evq(this.e - ckq.this.du(), this.f - ckq.this.dw(), this.g - ckq.this.dA());
            double $$1 = $$0.f();
            if ($$1 < ckq.this.cK().a()) {
               this.k = bzp.a.a;
               ckq.this.h(ckq.this.ds().a(0.5));
            } else {
               ckq.this.h(ckq.this.ds().e($$0.a(this.h * 0.05 / $$1)));
               if (ckq.this.p() == null) {
                  evq $$2 = ckq.this.ds();
                  ckq.this.r(-((float)ayy.d($$2.c, $$2.e)) * (180.0F / (float)Math.PI));
                  ckq.this.aY = ckq.this.dF();
               } else {
                  double $$3 = ckq.this.p().du() - ckq.this.du();
                  double $$4 = ckq.this.p().dA() - ckq.this.dA();
                  ckq.this.r(-((float)ayy.d($$3, $$4)) * (180.0F / (float)Math.PI));
                  ckq.this.aY = ckq.this.dF();
               }
            }
         }
      }
   }

   class d extends cam {
      public d() {
         this.a(EnumSet.of(cam.a.a));
      }

      @Override
      public boolean a() {
         return !ckq.this.H().b() && ckq.this.ah.a(b(7)) == 0;
      }

      @Override
      public boolean b() {
         return false;
      }

      @Override
      public void e() {
         iz $$0 = ckq.this.gq();
         if ($$0 == null) {
            $$0 = ckq.this.dp();
         }

         for (int $$1 = 0; $$1 < 3; $$1++) {
            iz $$2 = $$0.b(ckq.this.ah.a(15) - 7, ckq.this.ah.a(11) - 5, ckq.this.ah.a(15) - 7);
            if (ckq.this.dP().u($$2)) {
               ckq.this.bP.a((double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, 0.25);
               if (ckq.this.p() == null) {
                  ckq.this.G().a((double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, 180.0F, 20.0F);
               }
               break;
            }
         }
      }
   }
}
