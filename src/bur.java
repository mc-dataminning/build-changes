import javax.annotation.Nullable;
import org.joml.Vector3f;

public class bur extends buk {
   public bur(bim<? extends bur> $$0, cpm $$1) {
      super($$0, $$1);
   }

   @Override
   protected void w() {
      this.bO.a(0, new bpo(this));
      this.bO.a(1, new bqn(this, 2.0));
      this.bO.a(2, new bpg(this, 1.0));
      this.bO.a(3, new brc(this, 1.25, cly.a(cjb.oI), false));
      this.bO.a(4, new bpt(this, 1.25));
      this.bO.a(5, new brh(this, 1.0));
      this.bO.a(6, new bqc(this, cbn.class, 6.0F));
      this.bO.a(7, new bqp(this));
   }

   public static bke.a p() {
      return bja.x().a(bkf.a, 10.0).a(bkf.d, 0.2F);
   }

   @Override
   protected aov r() {
      return aow.eZ;
   }

   @Override
   protected aov d(bhg $$0) {
      return aow.fb;
   }

   @Override
   protected aov h_() {
      return aow.fa;
   }

   @Override
   protected void b(gu $$0, dfa $$1) {
      this.a(aow.fd, 0.15F, 1.0F);
   }

   @Override
   protected float eU() {
      return 0.4F;
   }

   @Override
   public bgq b(cbn $$0, bgp $$1) {
      ciy $$2 = $$0.b($$1);
      if ($$2.a(cjb.pK) && !this.i_()) {
         $$0.a(aow.fc, 1.0F, 1.0F);
         ciy $$3 = cja.a($$2, $$0, cjb.pQ.ae_());
         $$0.a($$1, $$3);
         return bgq.a(this.dK().B);
      } else {
         return super.b($$0, $$1);
      }
   }

   @Nullable
   public bur b(akk $$0, bid $$1) {
      return bim.t.a((cpm)$$0);
   }

   @Override
   protected float b(bjk $$0, bij $$1) {
      return this.i_() ? $$1.b * 0.95F : 1.3F;
   }

   @Override
   protected Vector3f a(bii $$0, bij $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b - 0.03125F * $$2, 0.0F);
   }
}
