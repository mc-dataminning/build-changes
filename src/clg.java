import javax.annotation.Nullable;

public class clg extends ckk implements ckq, cni {
   private static final akh<Boolean> b = akl.a(clg.class, akj.k);
   private static final int c = 5;
   private static final int bY = 300;
   private final brz bZ = new brz(5);

   public clg(bty<? extends clg> $$0, dej $$1) {
      super($$0, $$1);
   }

   @Override
   protected void D() {
      super.D();
      this.bS.a(0, new cbe(this));
      this.bS.a(2, new cpm.a(this, 10.0F));
      this.bS.a(3, new ccl<>(this, 1.0, 8.0F));
      this.bS.a(8, new cch(this, 0.6));
      this.bS.a(9, new cbs(this, cnx.class, 15.0F, 1.0F));
      this.bS.a(10, new cbs(this, bup.class, 15.0F));
      this.bT.a(1, new cdc(this, cpm.class).a());
      this.bT.a(2, new cdd<>(this, cnx.class, true));
      this.bT.a(3, new cdd<>(this, cnf.class, false));
      this.bT.a(3, new cdd<>(this, cgp.class, true));
   }

   public static bvt.a t() {
      return cld.gu().a(bvu.v, 0.35F).a(bvu.s, 24.0).a(bvu.c, 5.0).a(bvu.m, 32.0);
   }

   @Override
   protected void a(akl.a $$0) {
      super.a($$0);
      $$0.a(b, false);
   }

   @Override
   public boolean a(cwo $$0) {
      return $$0 == cvw.vX;
   }

   public boolean go() {
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
   public void b(ug $$0) {
      super.b($$0);
      this.b($$0, this.dU());
   }

   @Override
   public ckk.a q() {
      if (this.go()) {
         return ckk.a.f;
      } else if (this.b(cvw.vX)) {
         return ckk.a.e;
      } else {
         return this.gf() ? ckk.a.b : ckk.a.h;
      }
   }

   @Override
   public void a(ug $$0) {
      super.a($$0);
      this.a($$0, this.dU());
      this.a_(true);
   }

   @Override
   public float a(jf $$0, dem $$1) {
      return 0.0F;
   }

   @Override
   public int fS() {
      return 1;
   }

   @Nullable
   @Override
   public bvf a(dez $$0, brq $$1, btx $$2, @Nullable bvf $$3) {
      azn $$4 = $$0.D_();
      this.a($$4, $$1);
      this.a($$0, $$4, $$1);
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(azn $$0, brq $$1) {
      this.a(btz.a, new cvs(cvw.vX));
   }

   @Override
   protected void b(dez $$0, azn $$1, brq $$2) {
      super.b($$0, $$1, $$2);
      if ($$1.a(300) == 0) {
         cvs $$3 = this.eW();
         if ($$3.a(cvw.vX)) {
            dbp.a($$3, $$0.G_(), ddb.b, $$2, $$1);
         }
      }
   }

   @Override
   protected awf w() {
      return awg.tW;
   }

   @Override
   protected awf o_() {
      return awg.tY;
   }

   @Override
   protected awf d(bsj $$0) {
      return awg.tZ;
   }

   @Override
   public void a(bun $$0, float $$1) {
      this.b(this, 1.6F);
   }

   @Override
   public brz y() {
      return this.bZ;
   }

   @Override
   protected void b(ckh $$0) {
      cvs $$1 = $$0.m();
      if ($$1.h() instanceof ctr) {
         super.b($$0);
      } else if (this.m($$1)) {
         this.a($$0);
         cvs $$2 = this.bZ.b($$1);
         if ($$2.f()) {
            $$0.as();
         } else {
            $$1.e($$2.K());
         }
      }
   }

   private boolean m(cvs $$0) {
      return this.gF() && $$0.a(cvw.uR);
   }

   @Override
   public bve a_(int $$0) {
      int $$1 = $$0 - 300;
      return $$1 >= 0 && $$1 < this.bZ.b() ? bve.a(this.bZ, $$1) : super.a_($$0);
   }

   @Override
   public void a(arj $$0, int $$1, boolean $$2) {
      cpl $$3 = this.gC();
      boolean $$4 = this.af.i() <= $$3.v();
      if ($$4) {
         cvs $$5 = new cvs(cvw.vX);
         ald<dcv> $$6;
         if ($$1 > $$3.a(brp.c)) {
            $$6 = ddb.d;
         } else if ($$1 > $$3.a(brp.b)) {
            $$6 = ddb.c;
         } else {
            $$6 = null;
         }

         if ($$6 != null) {
            dbp.a($$5, $$0.G_(), $$6, $$0.d_(this.ds()), this.dV());
            this.a(btz.a, $$5);
         }
      }
   }

   @Override
   public awf ai_() {
      return awg.tX;
   }
}
