import javax.annotation.Nullable;

public class cju extends ciy implements cje, clw {
   private static final ajp<Boolean> b = ajt.a(cju.class, ajr.k);
   private static final int e = 5;
   private static final int ca = 300;
   private final bqq cb = new bqq(5);

   public cju(bsn<? extends cju> $$0, dcg $$1) {
      super($$0, $$1);
   }

   @Override
   protected void z() {
      super.z();
      this.bU.a(0, new bzu(this));
      this.bU.a(2, new cnx.a(this, 10.0F));
      this.bU.a(3, new cbb<>(this, 1.0, 8.0F));
      this.bU.a(8, new cax(this, 0.6));
      this.bU.a(9, new cai(this, cml.class, 15.0F, 1.0F));
      this.bU.a(10, new cai(this, bte.class, 15.0F));
      this.bV.a(1, new cbs(this, cnx.class).a());
      this.bV.a(2, new cbt<>(this, cml.class, true));
      this.bV.a(3, new cbt<>(this, clt.class, false));
      this.bV.a(3, new cbt<>(this, cfe.class, true));
   }

   public static buj.a t() {
      return cjr.gt().a(buk.v, 0.35F).a(buk.s, 24.0).a(buk.c, 5.0).a(buk.m, 32.0);
   }

   @Override
   protected void a(ajt.a $$0) {
      super.a($$0);
      $$0.a(b, false);
   }

   @Override
   public boolean a(cuw $$0) {
      return $$0 == cug.vW;
   }

   public boolean gn() {
      return this.ao.a(b);
   }

   @Override
   public void b(boolean $$0) {
      this.ao.a(b, $$0);
   }

   @Override
   public void a() {
      this.bg = 0;
   }

   @Override
   public void b(tx $$0) {
      super.b($$0);
      this.b($$0, this.dT());
   }

   @Override
   public ciy.a s() {
      if (this.gn()) {
         return ciy.a.f;
      } else if (this.b(cug.vW)) {
         return ciy.a.e;
      } else {
         return this.ge() ? ciy.a.b : ciy.a.h;
      }
   }

   @Override
   public void a(tx $$0) {
      super.a($$0);
      this.a($$0, this.dT());
      this.a_(true);
   }

   @Override
   public float a(ja $$0, dcj $$1) {
      return 0.0F;
   }

   @Override
   public int af() {
      return 1;
   }

   @Nullable
   @Override
   public btv a(dcv $$0, bqf $$1, btg $$2, @Nullable btv $$3) {
      ayo $$4 = $$0.E_();
      this.a($$4, $$1);
      this.a($$0, $$4, $$1);
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(ayo $$0, bqf $$1) {
      this.a(bso.a, new cud(cug.vW));
   }

   @Override
   protected void b(dcv $$0, ayo $$1, bqf $$2) {
      super.b($$0, $$1, $$2);
      if ($$1.a(300) == 0) {
         cud $$3 = this.eV();
         if ($$3.a(cug.vW)) {
            czo.a($$3, $$0.H_(), daz.b, $$2, $$1);
         }
      }
   }

   @Override
   protected avg v() {
      return avh.tV;
   }

   @Override
   protected avg n_() {
      return avh.tX;
   }

   @Override
   protected avg d(bra $$0) {
      return avh.tY;
   }

   @Override
   public void a(btc $$0, float $$1) {
      this.b(this, 1.6F);
   }

   @Override
   public bqq x() {
      return this.cb;
   }

   @Override
   protected void b(civ $$0) {
      cud $$1 = $$0.p();
      if ($$1.g() instanceof crz) {
         super.b($$0);
      } else if (this.n($$1)) {
         this.a($$0);
         cud $$2 = this.cb.b($$1);
         if ($$2.e()) {
            $$0.aq();
         } else {
            $$1.e($$2.H());
         }
      }
   }

   private boolean n(cud $$0) {
      return this.gE() && $$0.a(cug.uP);
   }

   @Override
   public btu a_(int $$0) {
      int $$1 = $$0 - 300;
      return $$1 >= 0 && $$1 < this.cb.b() ? btu.a(this.cb, $$1) : super.a_($$0);
   }

   @Override
   public void a(aqm $$0, int $$1, boolean $$2) {
      cnw $$3 = this.gB();
      boolean $$4 = this.ah.i() <= $$3.v();
      if ($$4) {
         cud $$5 = new cud(cug.vW);
         akj<dat> $$6;
         if ($$1 > $$3.a(bqe.c)) {
            $$6 = daz.d;
         } else if ($$1 > $$3.a(bqe.b)) {
            $$6 = daz.c;
         } else {
            $$6 = null;
         }

         if ($$6 != null) {
            czo.a($$5, $$0.H_(), $$6, $$0.d_(this.dr()), this.dU());
            this.a(bso.a, $$5);
         }
      }
   }

   @Override
   public avg ae_() {
      return avh.tW;
   }
}
