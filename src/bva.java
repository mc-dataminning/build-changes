import javax.annotation.Nullable;
import org.joml.Vector3f;

public class bva extends but {
   public bva(biw<? extends bva> $$0, cpx $$1) {
      super($$0, $$1);
   }

   @Override
   protected void z() {
      this.bO.a(0, new bpx(this));
      this.bO.a(1, new bqw(this, 2.0));
      this.bO.a(2, new bpp(this, 1.0));
      this.bO.a(3, new brl(this, 1.25, cmi.a(cjk.oI), false));
      this.bO.a(4, new bqc(this, 1.25));
      this.bO.a(5, new brq(this, 1.0));
      this.bO.a(6, new bql(this, cbw.class, 6.0F));
      this.bO.a(7, new bqy(this));
   }

   public static bkn.a s() {
      return bjk.A().a(bko.a, 10.0).a(bko.d, 0.2F);
   }

   @Override
   protected ape w() {
      return apf.eZ;
   }

   @Override
   protected ape d(bhq $$0) {
      return apf.fb;
   }

   @Override
   protected ape l_() {
      return apf.fa;
   }

   @Override
   protected void b(gw $$0, dfl $$1) {
      this.a(apf.fd, 0.15F, 1.0F);
   }

   @Override
   protected float eV() {
      return 0.4F;
   }

   @Override
   public bha b(cbw $$0, bgz $$1) {
      cjh $$2 = $$0.b($$1);
      if ($$2.a(cjk.pK) && !this.m_()) {
         $$0.a(apf.fc, 1.0F, 1.0F);
         cjh $$3 = cjj.a($$2, $$0, cjk.pQ.ai_());
         $$0.a($$1, $$3);
         return bha.a(this.dL().B);
      } else {
         return super.b($$0, $$1);
      }
   }

   @Nullable
   public bva b(aks $$0, bin $$1) {
      return biw.t.a((cpx)$$0);
   }

   @Override
   protected float b(bju $$0, bit $$1) {
      return this.m_() ? $$1.b * 0.95F : 1.3F;
   }

   @Override
   protected Vector3f a(bis $$0, bit $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b - 0.03125F * $$2, 0.0F);
   }
}
