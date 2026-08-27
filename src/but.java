import javax.annotation.Nullable;
import org.joml.Vector3f;

public class but extends bum {
   public but(bip<? extends but> $$0, cpq $$1) {
      super($$0, $$1);
   }

   @Override
   protected void w() {
      this.bO.a(0, new bpq(this));
      this.bO.a(1, new bqp(this, 2.0));
      this.bO.a(2, new bpi(this, 1.0));
      this.bO.a(3, new bre(this, 1.25, cmb.a(cjd.oI), false));
      this.bO.a(4, new bpv(this, 1.25));
      this.bO.a(5, new brj(this, 1.0));
      this.bO.a(6, new bqe(this, cbp.class, 6.0F));
      this.bO.a(7, new bqr(this));
   }

   public static bkg.a p() {
      return bjd.x().a(bkh.a, 10.0).a(bkh.d, 0.2F);
   }

   @Override
   protected aoy r() {
      return aoz.eZ;
   }

   @Override
   protected aoy d(bhj $$0) {
      return aoz.fb;
   }

   @Override
   protected aoy h_() {
      return aoz.fa;
   }

   @Override
   protected void b(gw $$0, dfe $$1) {
      this.a(aoz.fd, 0.15F, 1.0F);
   }

   @Override
   protected float eU() {
      return 0.4F;
   }

   @Override
   public bgt b(cbp $$0, bgs $$1) {
      cja $$2 = $$0.b($$1);
      if ($$2.a(cjd.pK) && !this.i_()) {
         $$0.a(aoz.fc, 1.0F, 1.0F);
         cja $$3 = cjc.a($$2, $$0, cjd.pQ.ad_());
         $$0.a($$1, $$3);
         return bgt.a(this.dK().B);
      } else {
         return super.b($$0, $$1);
      }
   }

   @Nullable
   public but b(akn $$0, big $$1) {
      return bip.t.a((cpq)$$0);
   }

   @Override
   protected float b(bjn $$0, bim $$1) {
      return this.i_() ? $$1.b * 0.95F : 1.3F;
   }

   @Override
   protected Vector3f a(bil $$0, bim $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b - 0.03125F * $$2, 0.0F);
   }
}
