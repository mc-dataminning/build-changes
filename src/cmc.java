import javax.annotation.Nullable;

public class cmc extends clg implements clm, coh {
   private static final ajy<Boolean> a = akc.a(cmc.class, aka.k);
   private static final int b = 5;
   private static final int bY = 300;
   private final bss bZ = new bss(5);

   public cmc(but<? extends cmc> $$0, dgj $$1) {
      super($$0, $$1);
   }

   @Override
   protected void E() {
      super.E();
      this.bS.a(0, new cca(this));
      this.bS.a(1, new cbn<>(this, cnd.class, 8.0F, 1.0, 1.2));
      this.bS.a(2, new cqm.a(this, 10.0F));
      this.bS.a(3, new cdh<>(this, 1.0, 8.0F));
      this.bS.a(8, new cdd(this, 0.6));
      this.bS.a(9, new cco(this, coy.class, 15.0F, 1.0F));
      this.bS.a(10, new cco(this, bvk.class, 15.0F));
      this.bT.a(1, new cdy(this, cqm.class).a());
      this.bT.a(2, new cdz<>(this, coy.class, true));
      this.bT.a(3, new cdz<>(this, coe.class, false));
      this.bT.a(3, new cdz<>(this, chl.class, true));
   }

   public static bwp.a p() {
      return clz.gx().a(bwq.v, 0.35F).a(bwq.s, 24.0).a(bwq.c, 5.0).a(bwq.m, 32.0);
   }

   @Override
   protected void a(akc.a $$0) {
      super.a($$0);
      $$0.a(a, false);
   }

   @Override
   public boolean a(cxm $$0) {
      return $$0 == cwu.wV;
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
   public axf<cwm> Z() {
      return awy.bU;
   }

   @Override
   public void b(tq $$0) {
      super.b($$0);
      this.b($$0, this.dX());
   }

   @Override
   public clg.a m() {
      if (this.x()) {
         return clg.a.f;
      } else if (this.b(cwu.wV)) {
         return clg.a.e;
      } else {
         return this.gh() ? clg.a.b : clg.a.h;
      }
   }

   @Override
   public void a(tq $$0) {
      super.a($$0);
      this.a($$0, this.dX());
      this.a_(true);
   }

   @Override
   public float a(ji $$0, dgm $$1) {
      return 0.0F;
   }

   @Override
   public int aj() {
      return 1;
   }

   @Nullable
   @Override
   public bwb a(dha $$0, bsj $$1, bus $$2, @Nullable bwb $$3) {
      azh $$4 = $$0.H_();
      this.a($$4, $$1);
      this.a($$0, $$4, $$1);
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(azh $$0, bsj $$1) {
      this.a(buu.a, new cwq(cwu.wV));
   }

   @Override
   protected void b(dha $$0, azh $$1, bsj $$2) {
      super.b($$0, $$1, $$2);
      if ($$1.a(300) == 0) {
         cwq $$3 = this.eZ();
         if ($$3.a(cwu.wV)) {
            ddc.a($$3, $$0.K_(), deo.b, $$2, $$1);
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
   protected avz e(btc $$0) {
      return awa.uy;
   }

   @Override
   public void a(bvi $$0, float $$1) {
      this.b(this, 1.6F);
   }

   @Override
   public bss t() {
      return this.bZ;
   }

   @Override
   protected void a(ard $$0, cld $$1) {
      cwq $$2 = $$1.l();
      if ($$2.h() instanceof cut) {
         super.a($$0, $$1);
      } else if (this.i($$2)) {
         this.a($$1);
         cwq $$3 = this.bZ.b($$2);
         if ($$3.f()) {
            $$1.at();
         } else {
            $$2.e($$3.M());
         }
      }
   }

   private boolean i(cwq $$0) {
      return this.gI() && $$0.a(cwu.vP);
   }

   @Override
   public bwa a_(int $$0) {
      int $$1 = $$0 - 300;
      return $$1 >= 0 && $$1 < this.bZ.b() ? bwa.a(this.bZ, $$1) : super.a_($$0);
   }

   @Override
   public void a(ard $$0, int $$1, boolean $$2) {
      cql $$3 = this.gF();
      boolean $$4 = this.ae.i() <= $$3.v();
      if ($$4) {
         cwq $$5 = new cwq(cwu.wV);
         aku<dei> $$6;
         if ($$1 > $$3.a(bsi.c)) {
            $$6 = deo.d;
         } else if ($$1 > $$3.a(bsi.b)) {
            $$6 = deo.c;
         } else {
            $$6 = null;
         }

         if ($$6 != null) {
            ddc.a($$5, $$0.K_(), $$6, $$0.d_(this.dv()), this.dY());
            this.a(buu.a, $$5);
         }
      }
   }

   @Override
   public avz aj_() {
      return awa.uw;
   }
}
