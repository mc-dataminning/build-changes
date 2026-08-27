import javax.annotation.Nullable;

public class cgb extends cfg implements cfl, cid {
   private static final aim<Boolean> b = aiq.a(cgb.class, aio.k);
   private static final int e = 5;
   private static final int bX = 300;
   private static final float bY = 1.6F;
   private final bnl bZ = new bnl(5);

   public cgb(bpc<? extends cgb> $$0, cwz $$1) {
      super($$0, $$1);
   }

   @Override
   protected void z() {
      super.z();
      this.bR.a(0, new bwf(this));
      this.bR.a(2, new cke.a(this, 10.0F));
      this.bR.a(3, new bxm<>(this, 1.0, 8.0F));
      this.bR.a(8, new bxi(this, 0.6));
      this.bR.a(9, new bwt(this, cis.class, 15.0F, 1.0F));
      this.bR.a(10, new bwt(this, bpq.class, 15.0F));
      this.bS.a(1, new byd(this, cke.class).a());
      this.bS.a(2, new bye<>(this, cis.class, true));
      this.bS.a(3, new bye<>(this, cia.class, false));
      this.bS.a(3, new bye<>(this, cbp.class, true));
   }

   public static bqu.a s() {
      return cfy.gt().a(bqv.r, 0.35F).a(bqv.q, 24.0).a(bqv.c, 5.0).a(bqv.k, 32.0);
   }

   @Override
   protected void a(aiq.a $$0) {
      super.a($$0);
      $$0.a(b, false);
   }

   @Override
   public boolean a(cra $$0) {
      return $$0 == cqn.vQ;
   }

   public boolean gn() {
      return this.an.a(b);
   }

   @Override
   public void b(boolean $$0) {
      this.an.a(b, $$0);
   }

   @Override
   public void a() {
      this.be = 0;
   }

   @Override
   public void b(ta $$0) {
      super.b($$0);
      this.a_($$0);
   }

   @Override
   public cfg.a r() {
      if (this.gn()) {
         return cfg.a.f;
      } else if (this.b(cqn.vQ)) {
         return cfg.a.e;
      } else {
         return this.gf() ? cfg.a.b : cfg.a.h;
      }
   }

   @Override
   public void a(ta $$0) {
      super.a($$0);
      this.c($$0);
      this.s(true);
   }

   @Override
   public float a(ib $$0, cxc $$1) {
      return 0.0F;
   }

   @Override
   public int fO() {
      return 1;
   }

   @Nullable
   @Override
   public bqg a(cxo $$0, bna $$1, bps $$2, @Nullable bqg $$3) {
      axd $$4 = $$0.E_();
      this.a($$4, $$1);
      this.b($$4, $$1);
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(axd $$0, bna $$1) {
      this.a(bpd.a, new cqk(cqn.vQ));
   }

   @Override
   protected void a(axd $$0, float $$1) {
      super.a($$0, $$1);
      if ($$0.a(300) == 0) {
         cqk $$2 = this.eU();
         if ($$2.a(cqn.vQ)) {
            $$2.a(cux.K, 1);
            this.a(bpd.a, $$2);
         }
      }
   }

   @Override
   protected atx v() {
      return aty.tr;
   }

   @Override
   protected atx n_() {
      return aty.tt;
   }

   @Override
   protected atx d(bnv $$0) {
      return aty.tu;
   }

   @Override
   public void a(bpo $$0, float $$1) {
      this.b(this, 1.6F);
   }

   @Override
   public void a(bpo $$0, cqk $$1, cjk $$2, float $$3) {
      this.a(this, $$0, $$2, $$3, 1.6F);
   }

   @Override
   public bnl y() {
      return this.bZ;
   }

   @Override
   protected void b(cfd $$0) {
      cqk $$1 = $$0.p();
      if ($$1.d() instanceof coc) {
         super.b($$0);
      } else if (this.n($$1)) {
         this.a($$0);
         cqk $$2 = this.bZ.a($$1);
         if ($$2.b()) {
            $$0.am();
         } else {
            $$1.f($$2.M());
         }
      }
   }

   private boolean n(cqk $$0) {
      return this.gC() && $$0.a(cqn.uM);
   }

   @Override
   public bqf a_(int $$0) {
      int $$1 = $$0 - 300;
      return $$1 >= 0 && $$1 < this.bZ.b() ? bqf.a(this.bZ, $$1) : super.a_($$0);
   }

   @Override
   public void a(int $$0, boolean $$1) {
      ckd $$2 = this.gB();
      boolean $$3 = this.ag.i() <= $$2.w();
      if ($$3) {
         cqk $$4 = new cqk(cqn.vQ);
         if ($$0 > $$2.a(bmz.c)) {
            $$4.a(cux.J, 2);
         } else if ($$0 > $$2.a(bmz.b)) {
            $$4.a(cux.J, 1);
         }

         $$4.a(cux.I, 1);
         this.a(bpd.a, $$4);
      }
   }

   @Override
   public atx ae_() {
      return aty.ts;
   }
}
