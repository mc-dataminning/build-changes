import javax.annotation.Nullable;
import org.joml.Vector3f;

public class bwq extends bwj {
   public bwq(bkm<? extends bwq> $$0, crs $$1) {
      super($$0, $$1);
   }

   @Override
   protected void z() {
      this.bO.a(0, new brn(this));
      this.bO.a(1, new bsm(this, 2.0));
      this.bO.a(2, new brf(this, 1.0));
      this.bO.a(3, new btb(this, 1.25, coc.a(cle.oI), false));
      this.bO.a(4, new brs(this, 1.25));
      this.bO.a(5, new btg(this, 1.0));
      this.bO.a(6, new bsb(this, cdm.class, 6.0F));
      this.bO.a(7, new bso(this));
   }

   public static bmd.a s() {
      return bla.A().a(bme.l, 10.0).a(bme.m, 0.2F);
   }

   @Override
   protected aqm w() {
      return aqn.eZ;
   }

   @Override
   protected aqm d(bjg $$0) {
      return aqn.fb;
   }

   @Override
   protected aqm m_() {
      return aqn.fa;
   }

   @Override
   protected void b(ht $$0, dgw $$1) {
      this.a(aqn.fd, 0.15F, 1.0F);
   }

   @Override
   protected float eV() {
      return 0.4F;
   }

   @Override
   public biq b(cdm $$0, bip $$1) {
      clb $$2 = $$0.b($$1);
      if ($$2.a(cle.pK) && !this.n_()) {
         $$0.a(aqn.fc, 1.0F, 1.0F);
         clb $$3 = cld.a($$2, $$0, cle.pQ.al_());
         $$0.a($$1, $$3);
         return biq.a(this.dL().B);
      } else {
         return super.b($$0, $$1);
      }
   }

   @Nullable
   public bwq b(ama $$0, bkd $$1) {
      return bkm.t.a((crs)$$0);
   }

   @Override
   protected float b(blk $$0, bkj $$1) {
      return this.n_() ? $$1.b * 0.95F : 1.3F;
   }

   @Override
   protected Vector3f a(bki $$0, bkj $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b - 0.03125F * $$2, 0.0F);
   }
}
