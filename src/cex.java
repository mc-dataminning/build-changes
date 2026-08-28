import javax.annotation.Nullable;

public class cex extends ces {
   private static final bsk ci = bsn.t.n().a(0.5F).b(0.2975F);
   public float ca;
   public float cb;
   public float cd;
   public float ce;
   public float cf = 1.0F;
   private float cj = 1.0F;
   public int cg = this.ah.a(6000) + 6000;
   public boolean ch;

   public cex(bsn<? extends cex> $$0, dcg $$1) {
      super($$0, $$1);
      this.a(epa.j, 0.0F);
   }

   @Override
   protected void z() {
      this.bU.a(0, new bzu(this));
      this.bU.a(1, new cat(this, 1.4));
      this.bU.a(2, new bzm(this, 1.0));
      this.bU.a(3, new cbi(this, 1.0, $$0 -> $$0.a(awf.ak), false));
      this.bU.a(4, new bzz(this, 1.1));
      this.bU.a(5, new cbn(this, 1.0));
      this.bU.a(6, new cai(this, cml.class, 6.0F));
      this.bU.a(7, new cav(this));
   }

   @Override
   public bsk e(bto $$0) {
      return this.o_() ? ci : super.e($$0);
   }

   public static buj.a s() {
      return bte.A().a(buk.s, 4.0).a(buk.v, 0.25);
   }

   @Override
   public void m_() {
      super.m_();
      this.ce = this.ca;
      this.cd = this.cb;
      this.cb = this.cb + (this.aG() ? -1.0F : 4.0F) * 0.3F;
      this.cb = ayg.a(this.cb, 0.0F, 1.0F);
      if (!this.aG() && this.cf < 1.0F) {
         this.cf = 1.0F;
      }

      this.cf *= 0.9F;
      ewh $$0 = this.du();
      if (!this.aG() && $$0.d < 0.0) {
         this.j($$0.d(1.0, 0.6, 1.0));
      }

      this.ca = this.ca + this.cf * 2.0F;
      if (!this.dR().B && this.bF() && !this.o_() && !this.t() && --this.cg <= 0) {
         this.a(avh.eT, 1.0F, (this.ah.i() - this.ah.i()) * 0.2F + 1.0F);
         this.a(cug.qR);
         this.a(dxh.t);
         this.cg = this.ah.a(6000) + 6000;
      }
   }

   @Override
   protected boolean aX() {
      return this.ab > this.cj;
   }

   @Override
   protected void aW() {
      this.cj = this.ab + this.cb / 2.0F;
   }

   @Override
   protected avg v() {
      return avh.eR;
   }

   @Override
   protected avg d(bra $$0) {
      return avh.eU;
   }

   @Override
   protected avg n_() {
      return avh.eS;
   }

   @Override
   protected void b(ja $$0, dsl $$1) {
      this.a(avh.eV, 0.15F, 1.0F);
   }

   @Nullable
   public cex b(aqm $$0, bsb $$1) {
      return bsn.t.a((dcg)$$0);
   }

   @Override
   public boolean o(cud $$0) {
      return $$0.a(awf.ak);
   }

   @Override
   protected int ei() {
      return this.t() ? 10 : super.ei();
   }

   @Override
   public void a(tx $$0) {
      super.a($$0);
      this.ch = $$0.q("IsChickenJockey");
      if ($$0.e("EggLayTime")) {
         this.cg = $$0.h("EggLayTime");
      }
   }

   @Override
   public void b(tx $$0) {
      super.b($$0);
      $$0.a("IsChickenJockey", this.ch);
      $$0.a("EggLayTime", this.cg);
   }

   @Override
   public boolean h(double $$0) {
      return this.t();
   }

   @Override
   protected void a(bsh $$0, bsh.b $$1) {
      super.a($$0, $$1);
      if ($$0 instanceof btc) {
         ((btc)$$0).aZ = this.aZ;
      }
   }

   public boolean t() {
      return this.ch;
   }

   public void w(boolean $$0) {
      this.ch = $$0;
   }
}
