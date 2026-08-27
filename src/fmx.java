import com.mojang.authlib.GameProfile;

public class fmx extends fmt {
   private ehd ck = ehd.b;
   private int cl;

   public fmx(fin $$0, GameProfile $$1) {
      super($$0, $$1);
      this.t(1.0F);
      this.af = true;
   }

   @Override
   public boolean a(double $$0) {
      double $$1 = this.cG().a() * 10.0;
      if (Double.isNaN($$1)) {
         $$1 = 1.0;
      }

      $$1 *= 64.0 * cz();
      return $$0 < $$1 * $$1;
   }

   @Override
   public boolean a(bhg $$0, float $$1) {
      return true;
   }

   @Override
   public void l() {
      super.l();
      this.q(false);
   }

   @Override
   public void b_() {
      if (this.bn > 0) {
         this.a(this.bn, this.bo, this.bp, this.bq, this.br, this.bs);
         this.bn--;
      }

      if (this.bu > 0) {
         this.a(this.bu, this.bt);
         this.bu--;
      }

      if (this.cl > 0) {
         this.g(new ehd((this.ck.c - this.dn().c) / (double)this.cl, (this.ck.d - this.dn().d) / (double)this.cl, (this.ck.e - this.dn().e) / (double)this.cl));
         this.cl--;
      }

      this.bT = this.bU;
      this.eO();
      float $$1;
      if (this.aA() && !this.eu()) {
         $$1 = (float)Math.min(0.1, this.dn().h());
      } else {
         $$1 = 0.0F;
      }

      this.bU = this.bU + ($$1 - this.bU) * 0.4F;
      this.dK().ad().a("push");
      this.fg();
      this.dK().ad().c();
   }

   @Override
   public void l(double $$0, double $$1, double $$2) {
      this.ck = new ehd($$0, $$1, $$2);
      this.cl = this.ag().p() + 1;
   }

   @Override
   protected void fK() {
   }

   @Override
   public void a(tf $$0) {
      eql $$1 = eql.O();
      $$1.l.d().a($$0);
   }
}
