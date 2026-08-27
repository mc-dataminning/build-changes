import javax.annotation.Nullable;
import org.joml.Vector3f;

public class bwb extends bvu {
   public bwb(bjx<? extends bwb> $$0, cqz $$1) {
      super($$0, $$1);
   }

   @Override
   protected void z() {
      this.bO.a(0, new bqy(this));
      this.bO.a(1, new brx(this, 2.0));
      this.bO.a(2, new bqq(this, 1.0));
      this.bO.a(3, new bsm(this, 1.25, cnk.a(ckm.oI), false));
      this.bO.a(4, new brd(this, 1.25));
      this.bO.a(5, new bsr(this, 1.0));
      this.bO.a(6, new brm(this, ccx.class, 6.0F));
      this.bO.a(7, new brz(this));
   }

   public static blo.a s() {
      return bkl.A().a(blp.l, 10.0).a(blp.m, 0.2F);
   }

   @Override
   protected aqc w() {
      return aqd.eZ;
   }

   @Override
   protected aqc d(bir $$0) {
      return aqd.fb;
   }

   @Override
   protected aqc m_() {
      return aqd.fa;
   }

   @Override
   protected void b(ht $$0, dgb $$1) {
      this.a(aqd.fd, 0.15F, 1.0F);
   }

   @Override
   protected float eV() {
      return 0.4F;
   }

   @Override
   public bib b(ccx $$0, bia $$1) {
      ckj $$2 = $$0.b($$1);
      if ($$2.a(ckm.pK) && !this.n_()) {
         $$0.a(aqd.fc, 1.0F, 1.0F);
         ckj $$3 = ckl.a($$2, $$0, ckm.pQ.al_());
         $$0.a($$1, $$3);
         return bib.a(this.dL().B);
      } else {
         return super.b($$0, $$1);
      }
   }

   @Nullable
   public bwb b(alq $$0, bjo $$1) {
      return bjx.t.a((cqz)$$0);
   }

   @Override
   protected float b(bkv $$0, bju $$1) {
      return this.n_() ? $$1.b * 0.95F : 1.3F;
   }

   @Override
   protected Vector3f a(bjt $$0, bju $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b - 0.03125F * $$2, 0.0F);
   }
}
