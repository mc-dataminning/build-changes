import javax.annotation.Nullable;

public class cnm extends cmq implements cmw, cps {
   private static final akg<Boolean> a = akk.a(cnm.class, aki.k);
   private static final int b = 5;
   private static final int bE = 300;
   private final btx bF = new btx(5);

   public cnm(bwb<? extends cnm> $$0, dhp $$1) {
      super($$0, $$1);
   }

   @Override
   protected void D() {
      super.D();
      this.bB.a(0, new cdh(this));
      this.bB.a(1, new ccu<>(this, coo.class, 8.0F, 1.0, 1.2));
      this.bB.a(2, new crw.a(this, 10.0F));
      this.bB.a(3, new ceo<>(this, 1.0, 8.0F));
      this.bB.a(8, new cek(this, 0.6));
      this.bB.a(9, new cdv(this, cqi.class, 15.0F, 1.0F));
      this.bB.a(10, new cdv(this, bwt.class, 15.0F));
      this.bC.a(1, new cff(this, crw.class).a());
      this.bC.a(2, new cfg<>(this, cqi.class, true));
      this.bC.a(3, new cfg<>(this, cpp.class, false));
      this.bC.a(3, new cfg<>(this, cis.class, true));
   }

   public static bxw.a m() {
      return cnj.gt().a(bxx.v, 0.35F).a(bxx.s, 24.0).a(bxx.c, 5.0).a(bxx.m, 32.0);
   }

   @Override
   protected void a(akk.a $$0) {
      super.a($$0);
      $$0.a(a, false);
   }

   @Override
   public boolean a(cyt $$0) {
      return $$0 == cyc.wZ;
   }

   public boolean q() {
      return this.al.a(a);
   }

   @Override
   public void b(boolean $$0) {
      this.al.a(a, $$0);
   }

   @Override
   public void a() {
      this.bc = 0;
   }

   @Override
   public axp<cxu> Y() {
      return axi.bV;
   }

   @Override
   public void b(tw $$0) {
      super.b($$0);
      this.b($$0, this.dX());
   }

   @Override
   public cmq.a j() {
      if (this.q()) {
         return cmq.a.f;
      } else if (this.b(cyc.wZ)) {
         return cmq.a.e;
      } else {
         return this.gh() ? cmq.a.b : cmq.a.h;
      }
   }

   @Override
   public void a(tw $$0) {
      super.a($$0);
      this.a($$0, this.dX());
      this.a_(true);
   }

   @Override
   public float a(jj $$0, dhs $$1) {
      return 0.0F;
   }

   @Override
   public int ai() {
      return 1;
   }

   @Nullable
   @Override
   public bxj a(dig $$0, bto $$1, bwa $$2, @Nullable bxj $$3) {
      azs $$4 = $$0.C_();
      this.a($$4, $$1);
      this.a($$0, $$4, $$1);
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(azs $$0, bto $$1) {
      this.a(bwc.a, new cxy(cyc.wZ));
   }

   @Override
   protected void b(dig $$0, azs $$1, bto $$2) {
      super.b($$0, $$1, $$2);
      if ($$1.a(300) == 0) {
         cxy $$3 = this.fa();
         if ($$3.a(cyc.wZ)) {
            dej.a($$3, $$0.F_(), dfv.b, $$2, $$1);
         }
      }
   }

   @Override
   protected awj u() {
      return awk.uF;
   }

   @Override
   protected awj l_() {
      return awk.uH;
   }

   @Override
   protected awj e(buh $$0) {
      return awk.uI;
   }

   @Override
   public void a(bwr $$0, float $$1) {
      this.b(this, 1.6F);
   }

   @Override
   public btx n() {
      return this.bF;
   }

   @Override
   protected void a(arn $$0, cmn $$1) {
      cxy $$2 = $$1.f();
      if ($$2.h() instanceof cwc) {
         super.a($$0, $$1);
      } else if (this.j($$2)) {
         this.a($$1);
         cxy $$3 = this.bF.b($$2);
         if ($$3.f()) {
            $$1.at();
         } else {
            $$2.e($$3.M());
         }
      }
   }

   private boolean j(cxy $$0) {
      return this.gE() && $$0.a(cyc.vT);
   }

   @Override
   public bxi a_(int $$0) {
      int $$1 = $$0 - 300;
      return $$1 >= 0 && $$1 < this.bF.b() ? bxi.a(this.bF, $$1) : super.a_($$0);
   }

   @Override
   public void a(arn $$0, int $$1, boolean $$2) {
      crv $$3 = this.gB();
      boolean $$4 = this.ae.i() <= $$3.v();
      if ($$4) {
         cxy $$5 = new cxy(cyc.wZ);
         alc<dfp> $$6;
         if ($$1 > $$3.a(btn.c)) {
            $$6 = dfv.d;
         } else if ($$1 > $$3.a(btn.b)) {
            $$6 = dfv.c;
         } else {
            $$6 = null;
         }

         if ($$6 != null) {
            dej.a($$5, $$0.F_(), $$6, $$0.d_(this.dv()), this.dY());
            this.a(bwc.a, $$5);
         }
      }
   }

   @Override
   public awj ad_() {
      return awk.uG;
   }
}
