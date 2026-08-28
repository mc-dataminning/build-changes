import javax.annotation.Nullable;

public class cky extends ckc implements cki, cna {
   private static final akg<Boolean> b = akk.a(cky.class, aki.k);
   private static final int c = 5;
   private static final int bZ = 300;
   private final brr ca = new brr(5);

   public cky(btq<? extends cky> $$0, dds $$1) {
      super($$0, $$1);
   }

   @Override
   protected void D() {
      super.D();
      this.bT.a(0, new caw(this));
      this.bT.a(2, new cpd.a(this, 10.0F));
      this.bT.a(3, new ccd<>(this, 1.0, 8.0F));
      this.bT.a(8, new cbz(this, 0.6));
      this.bT.a(9, new cbk(this, cnp.class, 15.0F, 1.0F));
      this.bT.a(10, new cbk(this, buh.class, 15.0F));
      this.bU.a(1, new ccu(this, cpd.class).a());
      this.bU.a(2, new ccv<>(this, cnp.class, true));
      this.bU.a(3, new ccv<>(this, cmx.class, false));
      this.bU.a(3, new ccv<>(this, cgh.class, true));
   }

   public static bvl.a t() {
      return ckv.gu().a(bvm.v, 0.35F).a(bvm.s, 24.0).a(bvm.c, 5.0).a(bvm.m, 32.0);
   }

   @Override
   protected void a(akk.a $$0) {
      super.a($$0);
      $$0.a(b, false);
   }

   @Override
   public boolean a(cwi $$0) {
      return $$0 == cvo.vX;
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
      this.bc = 0;
   }

   @Override
   public void b(uf $$0) {
      super.b($$0);
      this.b($$0, this.dU());
   }

   @Override
   public ckc.a q() {
      if (this.go()) {
         return ckc.a.f;
      } else if (this.b(cvo.vX)) {
         return ckc.a.e;
      } else {
         return this.gf() ? ckc.a.b : ckc.a.h;
      }
   }

   @Override
   public void a(uf $$0) {
      super.a($$0);
      this.a($$0, this.dU());
      this.a_(true);
   }

   @Override
   public float a(je $$0, ddv $$1) {
      return 0.0F;
   }

   @Override
   public int fR() {
      return 1;
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
      this.a(btr.a, new cvl(cvo.vX));
   }

   @Override
   protected void b(dei $$0, azk $$1, bri $$2) {
      super.b($$0, $$1, $$2);
      if ($$1.a(300) == 0) {
         cvl $$3 = this.eW();
         if ($$3.a(cvo.vX)) {
            day.a($$3, $$0.F_(), dck.b, $$2, $$1);
         }
      }
   }

   @Override
   protected awc w() {
      return awd.tW;
   }

   @Override
   protected awc n_() {
      return awd.tY;
   }

   @Override
   protected awc d(bsb $$0) {
      return awd.tZ;
   }

   @Override
   public void a(buf $$0, float $$1) {
      this.b(this, 1.6F);
   }

   @Override
   public brr y() {
      return this.ca;
   }

   @Override
   protected void b(cjz $$0) {
      cvl $$1 = $$0.m();
      if ($$1.h() instanceof cti) {
         super.b($$0);
      } else if (this.o($$1)) {
         this.a($$0);
         cvl $$2 = this.ca.b($$1);
         if ($$2.f()) {
            $$0.as();
         } else {
            $$1.e($$2.J());
         }
      }
   }

   private boolean o(cvl $$0) {
      return this.gF() && $$0.a(cvo.uR);
   }

   @Override
   public buw a_(int $$0) {
      int $$1 = $$0 - 300;
      return $$1 >= 0 && $$1 < this.ca.b() ? buw.a(this.ca, $$1) : super.a_($$0);
   }

   @Override
   public void a(arg $$0, int $$1, boolean $$2) {
      cpc $$3 = this.gC();
      boolean $$4 = this.af.i() <= $$3.v();
      if ($$4) {
         cvl $$5 = new cvl(cvo.vX);
         ala<dce> $$6;
         if ($$1 > $$3.a(brh.c)) {
            $$6 = dck.d;
         } else if ($$1 > $$3.a(brh.b)) {
            $$6 = dck.c;
         } else {
            $$6 = null;
         }

         if ($$6 != null) {
            day.a($$5, $$0.F_(), $$6, $$0.d_(this.ds()), this.dV());
            this.a(btr.a, $$5);
         }
      }
   }

   @Override
   public awc ah_() {
      return awd.tX;
   }
}
