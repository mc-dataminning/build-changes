import java.util.EnumSet;
import javax.annotation.Nullable;

public class cif extends chr implements bsc {
   public static final float b = 45.836624F;
   public static final int c = axw.f((float) (Math.PI * 5.0 / 4.0));
   protected static final ajk<Byte> d = ajo.a(cif.class, ajm.a);
   private static final int e = 1;
   @Nullable
   brg bY;
   @Nullable
   private im bZ;
   private boolean ca;
   private int cb;

   public cif(bqr<? extends cif> $$0, czu $$1) {
      super($$0, $$1);
      this.bP = new cif.c(this);
      this.bN = 3;
   }

   @Override
   public boolean aT() {
      return this.ai % c == 0;
   }

   @Override
   public void a(brj $$0, etf $$1) {
      super.a($$0, $$1);
      this.aQ();
   }

   @Override
   public void l() {
      this.ag = true;
      super.l();
      this.ag = false;
      this.f(true);
      if (this.ca && --this.cb <= 0) {
         this.cb = 20;
         this.a(this.dO().i(), 1.0F);
      }
   }

   @Override
   protected void z() {
      super.z();
      this.bS.a(0, new bxv(this));
      this.bS.a(4, new cif.a());
      this.bS.a(8, new cif.d());
      this.bS.a(9, new byj(this, ckl.class, 3.0F, 1.0F));
      this.bS.a(10, new byj(this, brg.class, 8.0F));
      this.bT.a(1, new bzt(this, clx.class).a());
      this.bT.a(2, new cif.b(this));
      this.bT.a(3, new bzu<>(this, ckl.class, true));
   }

   public static bsk.a r() {
      return chr.gv().a(bsl.q, 14.0).a(bsl.c, 4.0);
   }

   @Override
   protected void a(ajo.a $$0) {
      super.a($$0);
      $$0.a(d, (byte)0);
   }

   @Override
   public void a(ty $$0) {
      super.a($$0);
      if ($$0.e("BoundX")) {
         this.bZ = new im($$0.h("BoundX"), $$0.h("BoundY"), $$0.h("BoundZ"));
      }

      if ($$0.e("LifeTicks")) {
         this.b($$0.h("LifeTicks"));
      }
   }

   @Override
   public void w(bql $$0) {
      super.w($$0);
      if ($$0 instanceof cif $$1) {
         this.bY = $$1.y();
      }
   }

   @Override
   public void b(ty $$0) {
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
   public brg y() {
      return this.bY;
   }

   @Nullable
   public im gp() {
      return this.bZ;
   }

   public void i(@Nullable im $$0) {
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

   public boolean gq() {
      return this.c(1);
   }

   public void w(boolean $$0) {
      this.a(1, $$0);
   }

   public void a(brg $$0) {
      this.bY = $$0;
   }

   public void b(int $$0) {
      this.ca = true;
      this.cb = $$0;
   }

   @Override
   protected auy v() {
      return auz.Ay;
   }

   @Override
   protected auy o_() {
      return auz.AA;
   }

   @Override
   protected auy d(bpj $$0) {
      return auz.AB;
   }

   @Override
   public float br() {
      return 1.0F;
   }

   @Nullable
   @Override
   public brw a(daj $$0, boo $$1, bri $$2, @Nullable brw $$3) {
      ayd $$4 = $$0.E_();
      this.a($$4, $$1);
      this.b($$4, $$1);
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(ayd $$0, boo $$1) {
      this.a(bqs.a, new csd(csg.pa));
      this.a(bqs.a, 0.0F);
   }

   class a extends byb {
      public a() {
         this.a(EnumSet.of(byb.a.a));
      }

      @Override
      public boolean a() {
         bre $$0 = cif.this.p();
         return $$0 != null && $$0.bB() && !cif.this.H().b() && cif.this.ah.a(b(7)) == 0 ? cif.this.g($$0) > 4.0 : false;
      }

      @Override
      public boolean b() {
         return cif.this.H().b() && cif.this.gq() && cif.this.p() != null && cif.this.p().bB();
      }

      @Override
      public void c() {
         bre $$0 = cif.this.p();
         if ($$0 != null) {
            etf $$1 = $$0.bv();
            cif.this.bP.a($$1.c, $$1.d, $$1.e, 1.0);
         }

         cif.this.w(true);
         cif.this.a(auz.Az, 1.0F, 1.0F);
      }

      @Override
      public void d() {
         cif.this.w(false);
      }

      @Override
      public boolean R_() {
         return true;
      }

      @Override
      public void e() {
         bre $$0 = cif.this.p();
         if ($$0 != null) {
            if (cif.this.cI().c($$0.cI())) {
               cif.this.C($$0);
               cif.this.w(false);
            } else {
               double $$1 = cif.this.g($$0);
               if ($$1 < 9.0) {
                  etf $$2 = $$0.bv();
                  cif.this.bP.a($$2.c, $$2.d, $$2.e, 1.0);
               }
            }
         }
      }
   }

   class b extends cab {
      private final cbu b = cbu.b().d().e();

      public b(brm $$0) {
         super($$0, false);
      }

      @Override
      public boolean a() {
         return cif.this.bY != null && cif.this.bY.p() != null && this.a(cif.this.bY.p(), this.b);
      }

      @Override
      public void c() {
         cif.this.h(cif.this.bY.p());
         super.c();
      }
   }

   class c extends bxe {
      public c(cif $$0) {
         super($$0);
      }

      @Override
      public void a() {
         if (this.k == bxe.a.b) {
            etf $$0 = new etf(this.e - cif.this.ds(), this.f - cif.this.du(), this.g - cif.this.dy());
            double $$1 = $$0.f();
            if ($$1 < cif.this.cI().a()) {
               this.k = bxe.a.a;
               cif.this.g(cif.this.dq().a(0.5));
            } else {
               cif.this.g(cif.this.dq().e($$0.a(this.h * 0.05 / $$1)));
               if (cif.this.p() == null) {
                  etf $$2 = cif.this.dq();
                  cif.this.r(-((float)axw.d($$2.c, $$2.e)) * (180.0F / (float)Math.PI));
                  cif.this.aZ = cif.this.dD();
               } else {
                  double $$3 = cif.this.p().ds() - cif.this.ds();
                  double $$4 = cif.this.p().dy() - cif.this.dy();
                  cif.this.r(-((float)axw.d($$3, $$4)) * (180.0F / (float)Math.PI));
                  cif.this.aZ = cif.this.dD();
               }
            }
         }
      }
   }

   class d extends byb {
      public d() {
         this.a(EnumSet.of(byb.a.a));
      }

      @Override
      public boolean a() {
         return !cif.this.H().b() && cif.this.ah.a(b(7)) == 0;
      }

      @Override
      public boolean b() {
         return false;
      }

      @Override
      public void e() {
         im $$0 = cif.this.gp();
         if ($$0 == null) {
            $$0 = cif.this.dn();
         }

         for (int $$1 = 0; $$1 < 3; $$1++) {
            im $$2 = $$0.b(cif.this.ah.a(15) - 7, cif.this.ah.a(11) - 5, cif.this.ah.a(15) - 7);
            if (cif.this.dN().u($$2)) {
               cif.this.bP.a((double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, 0.25);
               if (cif.this.p() == null) {
                  cif.this.G().a((double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, 180.0F, 20.0F);
               }
               break;
            }
         }
      }
   }
}
