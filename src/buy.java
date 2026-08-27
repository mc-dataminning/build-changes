import javax.annotation.Nullable;
import org.joml.Vector3f;

public class buy extends bur {
   public buy(biu<? extends buy> $$0, cpv $$1) {
      super($$0, $$1);
   }

   @Override
   protected void z() {
      this.bO.a(0, new bpv(this));
      this.bO.a(1, new bqu(this, 2.0));
      this.bO.a(2, new bpn(this, 1.0));
      this.bO.a(3, new brj(this, 1.25, cmg.a(cji.oI), false));
      this.bO.a(4, new bqa(this, 1.25));
      this.bO.a(5, new bro(this, 1.0));
      this.bO.a(6, new bqj(this, cbu.class, 6.0F));
      this.bO.a(7, new bqw(this));
   }

   public static bkl.a s() {
      return bji.A().a(bkm.a, 10.0).a(bkm.d, 0.2F);
   }

   @Override
   protected apd w() {
      return ape.eZ;
   }

   @Override
   protected apd d(bho $$0) {
      return ape.fb;
   }

   @Override
   protected apd l_() {
      return ape.fa;
   }

   @Override
   protected void b(gw $$0, dfj $$1) {
      this.a(ape.fd, 0.15F, 1.0F);
   }

   @Override
   protected float eV() {
      return 0.4F;
   }

   @Override
   public bgy b(cbu $$0, bgx $$1) {
      cjf $$2 = $$0.b($$1);
      if ($$2.a(cji.pK) && !this.m_()) {
         $$0.a(ape.fc, 1.0F, 1.0F);
         cjf $$3 = cjh.a($$2, $$0, cji.pQ.ai_());
         $$0.a($$1, $$3);
         return bgy.a(this.dL().B);
      } else {
         return super.b($$0, $$1);
      }
   }

   @Nullable
   public buy b(akr $$0, bil $$1) {
      return biu.t.a((cpv)$$0);
   }

   @Override
   protected float b(bjs $$0, bir $$1) {
      return this.m_() ? $$1.b * 0.95F : 1.3F;
   }

   @Override
   protected Vector3f a(biq $$0, bir $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b - 0.03125F * $$2, 0.0F);
   }
}
