import javax.annotation.Nullable;

public class cmz extends cmd implements cmj, cpg {
   private static final alc<Boolean> a = alg.a(cmz.class, ale.k);
   private static final int b = 5;
   private static final int bZ = 300;
   private final btp ca = new btp(5);

   public cmz(bvq<? extends cmz> $$0, dhh $$1) {
      super($$0, $$1);
   }

   @Override
   protected void B() {
      super.B();
      this.bT.a(0, new ccx(this));
      this.bT.a(1, new cck<>(this, coa.class, 8.0F, 1.0, 1.2));
      this.bT.a(2, new crk.a(this, 10.0F));
      this.bT.a(3, new cee<>(this, 1.0, 8.0F));
      this.bT.a(8, new cea(this, 0.6));
      this.bT.a(9, new cdl(this, cpw.class, 15.0F, 1.0F));
      this.bT.a(10, new cdl(this, bwh.class, 15.0F));
      this.bU.a(1, new cev(this, crk.class).a());
      this.bU.a(2, new cew<>(this, cpw.class, true));
      this.bU.a(3, new cew<>(this, cpd.class, false));
      this.bU.a(3, new cew<>(this, cii.class, true));
   }

   public static bxm.a p() {
      return cmw.gr().a(bxn.v, 0.35F).a(bxn.s, 24.0).a(bxn.c, 5.0).a(bxn.m, 32.0);
   }

   @Override
   protected void a(alg.a $$0) {
      super.a($$0);
      $$0.a(a, false);
   }

   @Override
   public boolean a(cyk $$0) {
      return $$0 == cxs.wL;
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
   public void b(ux $$0) {
      super.b($$0);
      this.b($$0, this.dX());
   }

   @Override
   public cmd.a m() {
      if (this.x()) {
         return cmd.a.f;
      } else if (this.b(cxs.wL)) {
         return cmd.a.e;
      } else {
         return this.gb() ? cmd.a.b : cmd.a.h;
      }
   }

   @Override
   public void a(ux $$0) {
      super.a($$0);
      this.a($$0, this.dX());
      this.a_(true);
   }

   @Override
   public float a(jh $$0, dhk $$1) {
      return 0.0F;
   }

   @Override
   public int ad() {
      return 1;
   }

   @Nullable
   @Override
   public bwy a(dhy $$0, btg $$1, bvp $$2, @Nullable bwy $$3) {
      bam $$4 = $$0.H_();
      this.a($$4, $$1);
      this.a($$0, $$4, $$1);
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(bam $$0, btg $$1) {
      this.a(bvr.a, new cxo(cxs.wL));
   }

   @Override
   protected void b(dhy $$0, bam $$1, btg $$2) {
      super.b($$0, $$1, $$2);
      if ($$1.a(300) == 0) {
         cxo $$3 = this.eX();
         if ($$3.a(cxs.wL)) {
            dea.a($$3, $$0.K_(), dfm.b, $$2, $$1);
         }
      }
   }

   @Override
   protected axe u() {
      return axf.up;
   }

   @Override
   protected axe o_() {
      return axf.ur;
   }

   @Override
   protected axe e(btz $$0) {
      return axf.us;
   }

   @Override
   public void a(bwf $$0, float $$1) {
      this.b(this, 1.6F);
   }

   @Override
   public btp t() {
      return this.ca;
   }

   @Override
   protected void a(ash $$0, cma $$1) {
      cxo $$2 = $$1.l();
      if ($$2.h() instanceof cvr) {
         super.a($$0, $$1);
      } else if (this.i($$2)) {
         this.a($$1);
         cxo $$3 = this.ca.b($$2);
         if ($$3.f()) {
            $$1.at();
         } else {
            $$2.e($$3.L());
         }
      }
   }

   private boolean i(cxo $$0) {
      return this.gC() && $$0.a(cxs.vF);
   }

   @Override
   public bwx a_(int $$0) {
      int $$1 = $$0 - 300;
      return $$1 >= 0 && $$1 < this.ca.b() ? bwx.a(this.ca, $$1) : super.a_($$0);
   }

   @Override
   public void a(ash $$0, int $$1, boolean $$2) {
      crj $$3 = this.gz();
      boolean $$4 = this.ae.i() <= $$3.v();
      if ($$4) {
         cxo $$5 = new cxo(cxs.wL);
         aly<dfg> $$6;
         if ($$1 > $$3.a(btf.c)) {
            $$6 = dfm.d;
         } else if ($$1 > $$3.a(btf.b)) {
            $$6 = dfm.c;
         } else {
            $$6 = null;
         }

         if ($$6 != null) {
            dea.a($$5, $$0.K_(), $$6, $$0.d_(this.dv()), this.dY());
            this.a(bvr.a, $$5);
         }
      }
   }

   @Override
   public axe ak_() {
      return axf.uq;
   }
}
