import javax.annotation.Nullable;

public class cmb extends clf implements cll, cog {
   private static final ajy<Boolean> a = akc.a(cmb.class, aka.k);
   private static final int b = 5;
   private static final int bY = 300;
   private final bsr bZ = new bsr(5);

   public cmb(bus<? extends cmb> $$0, dgi $$1) {
      super($$0, $$1);
   }

   @Override
   protected void E() {
      super.E();
      this.bS.a(0, new cbz(this));
      this.bS.a(1, new cbm<>(this, cnc.class, 8.0F, 1.0, 1.2));
      this.bS.a(2, new cql.a(this, 10.0F));
      this.bS.a(3, new cdg<>(this, 1.0, 8.0F));
      this.bS.a(8, new cdc(this, 0.6));
      this.bS.a(9, new ccn(this, cox.class, 15.0F, 1.0F));
      this.bS.a(10, new ccn(this, bvj.class, 15.0F));
      this.bT.a(1, new cdx(this, cql.class).a());
      this.bT.a(2, new cdy<>(this, cox.class, true));
      this.bT.a(3, new cdy<>(this, cod.class, false));
      this.bT.a(3, new cdy<>(this, chk.class, true));
   }

   public static bwo.a p() {
      return cly.gx().a(bwp.v, 0.35F).a(bwp.s, 24.0).a(bwp.c, 5.0).a(bwp.m, 32.0);
   }

   @Override
   protected void a(akc.a $$0) {
      super.a($$0);
      $$0.a(a, false);
   }

   @Override
   public boolean a(cxl $$0) {
      return $$0 == cwt.wV;
   }

   public boolean x() {
      return this.al.a(a);
   }

   @Override
   public void b(boolean $$0) {
      this.al.a(a, $$0);
   }

   @Override
   public void a() {
      this.bf = 0;
   }

   @Override
   public axf<cwl> Z() {
      return awy.bU;
   }

   @Override
   public void b(tq $$0) {
      super.b($$0);
      this.b($$0, this.dX());
   }

   @Override
   public clf.a m() {
      if (this.x()) {
         return clf.a.f;
      } else if (this.b(cwt.wV)) {
         return clf.a.e;
      } else {
         return this.gh() ? clf.a.b : clf.a.h;
      }
   }

   @Override
   public void a(tq $$0) {
      super.a($$0);
      this.a($$0, this.dX());
      this.a_(true);
   }

   @Override
   public float a(ji $$0, dgl $$1) {
      return 0.0F;
   }

   @Override
   public int aj() {
      return 1;
   }

   @Nullable
   @Override
   public bwa a(dgz $$0, bsi $$1, bur $$2, @Nullable bwa $$3) {
      azh $$4 = $$0.H_();
      this.a($$4, $$1);
      this.a($$0, $$4, $$1);
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(azh $$0, bsi $$1) {
      this.a(but.a, new cwp(cwt.wV));
   }

   @Override
   protected void b(dgz $$0, azh $$1, bsi $$2) {
      super.b($$0, $$1, $$2);
      if ($$1.a(300) == 0) {
         cwp $$3 = this.eZ();
         if ($$3.a(cwt.wV)) {
            ddb.a($$3, $$0.K_(), den.b, $$2, $$1);
         }
      }
   }

   @Override
   protected avz u() {
      return awa.uv;
   }

   @Override
   protected avz o_() {
      return awa.ux;
   }

   @Override
   protected avz e(btb $$0) {
      return awa.uy;
   }

   @Override
   public void a(bvh $$0, float $$1) {
      this.b(this, 1.6F);
   }

   @Override
   public bsr t() {
      return this.bZ;
   }

   @Override
   protected void a(ard $$0, clc $$1) {
      cwp $$2 = $$1.l();
      if ($$2.h() instanceof cus) {
         super.a($$0, $$1);
      } else if (this.i($$2)) {
         this.a($$1);
         cwp $$3 = this.bZ.b($$2);
         if ($$3.f()) {
            $$1.at();
         } else {
            $$2.e($$3.M());
         }
      }
   }

   private boolean i(cwp $$0) {
      return this.gI() && $$0.a(cwt.vP);
   }

   @Override
   public bvz a_(int $$0) {
      int $$1 = $$0 - 300;
      return $$1 >= 0 && $$1 < this.bZ.b() ? bvz.a(this.bZ, $$1) : super.a_($$0);
   }

   @Override
   public void a(ard $$0, int $$1, boolean $$2) {
      cqk $$3 = this.gF();
      boolean $$4 = this.ae.i() <= $$3.v();
      if ($$4) {
         cwp $$5 = new cwp(cwt.wV);
         aku<deh> $$6;
         if ($$1 > $$3.a(bsh.c)) {
            $$6 = den.d;
         } else if ($$1 > $$3.a(bsh.b)) {
            $$6 = den.c;
         } else {
            $$6 = null;
         }

         if ($$6 != null) {
            ddb.a($$5, $$0.K_(), $$6, $$0.d_(this.dv()), this.dY());
            this.a(but.a, $$5);
         }
      }
   }

   @Override
   public avz aj_() {
      return awa.uw;
   }
}
