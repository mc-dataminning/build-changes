import javax.annotation.Nullable;

public class cfj extends ceo implements cet, chl {
   private static final aii<Boolean> b = ail.a(cfj.class, aik.k);
   private static final int e = 5;
   private static final int bV = 300;
   private static final float bW = 1.6F;
   private final bmu bX = new bmu(5);

   public cfj(bol<? extends cfj> $$0, cwe $$1) {
      super($$0, $$1);
   }

   @Override
   protected void B() {
      super.B();
      this.bP.a(0, new bvo(this));
      this.bP.a(2, new cjk.a(this, 10.0F));
      this.bP.a(3, new bwv<>(this, 1.0, 8.0F));
      this.bP.a(8, new bwr(this, 0.6));
      this.bP.a(9, new bwc(this, cia.class, 15.0F, 1.0F));
      this.bP.a(10, new bwc(this, boz.class, 15.0F));
      this.bQ.a(1, new bxm(this, cjk.class).a());
      this.bQ.a(2, new bxn<>(this, cia.class, true));
      this.bQ.a(3, new bxn<>(this, chi.class, false));
      this.bQ.a(3, new bxn<>(this, cay.class, true));
   }

   public static bqd.a w() {
      return cfg.gr().a(bqe.o, 0.35F).a(bqe.n, 24.0).a(bqe.c, 5.0).a(bqe.i, 32.0);
   }

   @Override
   protected void c_() {
      super.c_();
      this.am.a(b, false);
   }

   @Override
   public boolean a(cqg $$0) {
      return $$0 == cpt.vP;
   }

   public boolean gl() {
      return this.am.b(b);
   }

   @Override
   public void b(boolean $$0) {
      this.am.b(b, $$0);
   }

   @Override
   public void a() {
      this.bc = 0;
   }

   @Override
   public void b(sy $$0) {
      super.b($$0);
      this.a_($$0);
   }

   @Override
   public ceo.a u() {
      if (this.gl()) {
         return ceo.a.f;
      } else if (this.b(cpt.vP)) {
         return ceo.a.e;
      } else {
         return this.gd() ? ceo.a.b : ceo.a.h;
      }
   }

   @Override
   public void a(sy $$0) {
      super.a($$0);
      this.c($$0);
      this.s(true);
   }

   @Override
   public float a(ib $$0, cwh $$1) {
      return 0.0F;
   }

   @Override
   public int fM() {
      return 1;
   }

   @Nullable
   @Override
   public bpp a(cwt $$0, bmj $$1, bpb $$2, @Nullable bpp $$3) {
      awt $$4 = $$0.F_();
      this.a($$4, $$1);
      this.b($$4, $$1);
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(awt $$0, bmj $$1) {
      this.a(bom.a, new cpq(cpt.vP));
   }

   @Override
   protected void a(awt $$0, float $$1) {
      super.a($$0, $$1);
      if ($$0.a(300) == 0) {
         cpq $$2 = this.eR();
         if ($$2.a(cpt.vP)) {
            $$2.a(cuc.K, 1);
            this.a(bom.a, $$2);
         }
      }
   }

   @Override
   protected ato y() {
      return atp.to;
   }

   @Override
   protected ato n_() {
      return atp.tq;
   }

   @Override
   protected ato d(bne $$0) {
      return atp.tr;
   }

   @Override
   public void a(box $$0, float $$1) {
      this.b(this, 1.6F);
   }

   @Override
   public void a(box $$0, cpq $$1, cis $$2, float $$3) {
      this.a(this, $$0, $$2, $$3, 1.6F);
   }

   @Override
   public bmu A() {
      return this.bX;
   }

   @Override
   protected void b(cel $$0) {
      cpq $$1 = $$0.q();
      if ($$1.d() instanceof cni) {
         super.b($$0);
      } else if (this.n($$1)) {
         this.a($$0);
         cpq $$2 = this.bX.a($$1);
         if ($$2.b()) {
            $$0.am();
         } else {
            $$1.f($$2.M());
         }
      }
   }

   private boolean n(cpq $$0) {
      return this.gA() && $$0.a(cpt.uL);
   }

   @Override
   public bpo a_(int $$0) {
      int $$1 = $$0 - 300;
      return $$1 >= 0 && $$1 < this.bX.b() ? bpo.a(this.bX, $$1) : super.a_($$0);
   }

   @Override
   public void a(int $$0, boolean $$1) {
      cjj $$2 = this.gz();
      boolean $$3 = this.af.i() <= $$2.w();
      if ($$3) {
         cpq $$4 = new cpq(cpt.vP);
         if ($$0 > $$2.a(bmi.c)) {
            $$4.a(cuc.J, 2);
         } else if ($$0 > $$2.a(bmi.b)) {
            $$4.a(cuc.J, 1);
         }

         $$4.a(cuc.I, 1);
         this.a(bom.a, $$4);
      }
   }

   @Override
   public ato ag_() {
      return atp.tp;
   }
}
