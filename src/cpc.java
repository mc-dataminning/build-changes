import javax.annotation.Nullable;

public class cpc extends cof implements col, crh {
   private static final akl<Boolean> a = akp.a(cpc.class, akn.k);
   private static final int b = 5;
   private static final int e = 300;
   private final buy bI = new buy(5);

   public cpc(bxc<? extends cpc> $$0, djx $$1) {
      super($$0, $$1);
   }

   @Override
   protected void D() {
      super.D();
      this.bF.a(0, new cek(this));
      this.bF.a(1, new cdx<>(this, cqd.class, 8.0F, 1.0, 1.2));
      this.bF.a(2, new cto.a(this, 10.0F));
      this.bF.a(3, new cfr<>(this, 1.0, 8.0F));
      this.bF.a(8, new cfn(this, 0.6));
      this.bF.a(9, new cey(this, crx.class, 15.0F, 1.0F));
      this.bF.a(10, new cey(this, bxw.class, 15.0F));
      this.bG.a(1, new cgi(this, cto.class).a());
      this.bG.a(2, new cgj<>(this, crx.class, true));
      this.bG.a(3, new cgj<>(this, cre.class, false));
      this.bG.a(3, new cgj<>(this, cka.class, true));
   }

   public static byz.a m() {
      return coz.gx().a(bza.v, 0.35F).a(bza.s, 24.0).a(bza.c, 5.0).a(bza.m, 32.0);
   }

   @Override
   protected void a(akp.a $$0) {
      super.a($$0);
      $$0.a(a, false);
   }

   @Override
   public boolean a(dat $$0) {
      return $$0 == dac.xg;
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
      this.bd = 0;
   }

   @Override
   public axt<czu> Y() {
      return axm.bW;
   }

   @Override
   public void b(tz $$0) {
      super.b($$0);
      this.b($$0, this.dX());
   }

   @Override
   public cof.a j() {
      if (this.q()) {
         return cof.a.f;
      } else if (this.b(dac.xg)) {
         return cof.a.e;
      } else {
         return this.gl() ? cof.a.b : cof.a.h;
      }
   }

   @Override
   public void a(tz $$0) {
      super.a($$0);
      this.a($$0, this.dX());
      this.a_(true);
   }

   @Override
   public float a(iv $$0, dka $$1) {
      return 0.0F;
   }

   @Override
   public int fX() {
      return 1;
   }

   @Nullable
   @Override
   public bym a(dko $$0, bup $$1, bxb $$2, @Nullable bym $$3) {
      azx $$4 = $$0.G_();
      this.a($$4, $$1);
      this.a($$0, $$4, $$1);
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(azx $$0, bup $$1) {
      this.a(bxd.a, new czy(dac.xg));
   }

   @Override
   protected void b(dko $$0, azx $$1, bup $$2) {
      super.b($$0, $$1, $$2);
      if ($$1.a(300) == 0) {
         czy $$3 = this.fb();
         if ($$3.a(dac.xg)) {
            dgn.a($$3, $$0.J_(), dhz.b, $$2, $$1);
         }
      }
   }

   @Override
   protected awo u() {
      return awp.uJ;
   }

   @Override
   protected awo l_() {
      return awp.uL;
   }

   @Override
   protected awo e(bvi $$0) {
      return awp.uM;
   }

   @Override
   public void a(bxu $$0, float $$1) {
      this.b(this, 1.6F);
   }

   @Override
   public buy n() {
      return this.bI;
   }

   @Override
   protected void a(ars $$0, coc $$1) {
      czy $$2 = $$1.f();
      if ($$2.h() instanceof cye) {
         super.a($$0, $$1);
      } else if (this.i($$2)) {
         this.a($$1);
         czy $$3 = this.bI.b($$2);
         if ($$3.f()) {
            $$1.aq();
         } else {
            $$2.e($$3.M());
         }
      }
   }

   private boolean i(czy $$0) {
      return this.gI() && $$0.a(dac.wa);
   }

   @Override
   public byl a_(int $$0) {
      int $$1 = $$0 - 300;
      return $$1 >= 0 && $$1 < this.bI.b() ? byl.a(this.bI, $$1) : super.a_($$0);
   }

   @Override
   public void a(ars $$0, int $$1, boolean $$2) {
      ctn $$3 = this.gF();
      boolean $$4 = this.ae.i() <= $$3.s();
      if ($$4) {
         czy $$5 = new czy(dac.xg);
         alh<dht> $$6;
         if ($$1 > $$3.a(buo.c)) {
            $$6 = dhz.d;
         } else if ($$1 > $$3.a(buo.b)) {
            $$6 = dhz.c;
         } else {
            $$6 = null;
         }

         if ($$6 != null) {
            dgn.a($$5, $$0.J_(), $$6, $$0.d_(this.dv()), this.dY());
            this.a(bxd.a, $$5);
         }
      }
   }

   @Override
   public awo ai_() {
      return awp.uK;
   }
}
