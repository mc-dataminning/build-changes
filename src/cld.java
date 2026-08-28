import javax.annotation.Nullable;

public class cld extends ckh implements ckn, cnf {
   private static final akg<Boolean> b = akk.a(cld.class, aki.k);
   private static final int c = 5;
   private static final int bY = 300;
   private final brw bZ = new brw(5);

   public cld(btv<? extends cld> $$0, deg $$1) {
      super($$0, $$1);
   }

   @Override
   protected void D() {
      super.D();
      this.bS.a(0, new cbb(this));
      this.bS.a(2, new cpj.a(this, 10.0F));
      this.bS.a(3, new cci<>(this, 1.0, 8.0F));
      this.bS.a(8, new cce(this, 0.6));
      this.bS.a(9, new cbp(this, cnu.class, 15.0F, 1.0F));
      this.bS.a(10, new cbp(this, bum.class, 15.0F));
      this.bT.a(1, new ccz(this, cpj.class).a());
      this.bT.a(2, new cda<>(this, cnu.class, true));
      this.bT.a(3, new cda<>(this, cnc.class, false));
      this.bT.a(3, new cda<>(this, cgm.class, true));
   }

   public static bvq.a t() {
      return cla.gv().a(bvr.v, 0.35F).a(bvr.s, 24.0).a(bvr.c, 5.0).a(bvr.m, 32.0);
   }

   @Override
   protected void a(akk.a $$0) {
      super.a($$0);
      $$0.a(b, false);
   }

   @Override
   public boolean a(cwl $$0) {
      return $$0 == cvt.vX;
   }

   public boolean gp() {
      return this.am.a(b);
   }

   @Override
   public void b(boolean $$0) {
      this.am.a(b, $$0);
   }

   @Override
   public void a() {
      this.bb = 0;
   }

   @Override
   public void b(uf $$0) {
      super.b($$0);
      this.b($$0, this.dU());
   }

   @Override
   public ckh.a q() {
      if (this.gp()) {
         return ckh.a.f;
      } else if (this.b(cvt.vX)) {
         return ckh.a.e;
      } else {
         return this.gg() ? ckh.a.b : ckh.a.h;
      }
   }

   @Override
   public void a(uf $$0) {
      super.a($$0);
      this.a($$0, this.dU());
      this.a_(true);
   }

   @Override
   public float a(je $$0, dej $$1) {
      return 0.0F;
   }

   @Override
   public int fS() {
      return 1;
   }

   @Nullable
   @Override
   public bvc a(dew $$0, brn $$1, btu $$2, @Nullable bvc $$3) {
      azl $$4 = $$0.C_();
      this.a($$4, $$1);
      this.a($$0, $$4, $$1);
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(azl $$0, brn $$1) {
      this.a(btw.a, new cvp(cvt.vX));
   }

   @Override
   protected void b(dew $$0, azl $$1, brn $$2) {
      super.b($$0, $$1, $$2);
      if ($$1.a(300) == 0) {
         cvp $$3 = this.eW();
         if ($$3.a(cvt.vX)) {
            dbm.a($$3, $$0.F_(), dcy.b, $$2, $$1);
         }
      }
   }

   @Override
   protected awd w() {
      return awe.tW;
   }

   @Override
   protected awd n_() {
      return awe.tY;
   }

   @Override
   protected awd d(bsg $$0) {
      return awe.tZ;
   }

   @Override
   public void a(buk $$0, float $$1) {
      this.b(this, 1.6F);
   }

   @Override
   public brw y() {
      return this.bZ;
   }

   @Override
   protected void b(cke $$0) {
      cvp $$1 = $$0.m();
      if ($$1.h() instanceof cto) {
         super.b($$0);
      } else if (this.m($$1)) {
         this.a($$0);
         cvp $$2 = this.bZ.b($$1);
         if ($$2.f()) {
            $$0.as();
         } else {
            $$1.e($$2.J());
         }
      }
   }

   private boolean m(cvp $$0) {
      return this.gG() && $$0.a(cvt.uR);
   }

   @Override
   public bvb a_(int $$0) {
      int $$1 = $$0 - 300;
      return $$1 >= 0 && $$1 < this.bZ.b() ? bvb.a(this.bZ, $$1) : super.a_($$0);
   }

   @Override
   public void a(arh $$0, int $$1, boolean $$2) {
      cpi $$3 = this.gD();
      boolean $$4 = this.af.i() <= $$3.v();
      if ($$4) {
         cvp $$5 = new cvp(cvt.vX);
         alb<dcs> $$6;
         if ($$1 > $$3.a(brm.c)) {
            $$6 = dcy.d;
         } else if ($$1 > $$3.a(brm.b)) {
            $$6 = dcy.c;
         } else {
            $$6 = null;
         }

         if ($$6 != null) {
            dbm.a($$5, $$0.F_(), $$6, $$0.d_(this.ds()), this.dV());
            this.a(btw.a, $$5);
         }
      }
   }

   @Override
   public awd ah_() {
      return awe.tX;
   }
}
