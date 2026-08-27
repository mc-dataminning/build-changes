import javax.annotation.Nullable;
import org.joml.Vector3f;

public class bve extends bux {
   public bve(bja<? extends bve> $$0, cqb $$1) {
      super($$0, $$1);
   }

   @Override
   protected void z() {
      this.bO.a(0, new bqb(this));
      this.bO.a(1, new bra(this, 2.0));
      this.bO.a(2, new bpt(this, 1.0));
      this.bO.a(3, new brp(this, 1.25, cmm.a(cjo.oI), false));
      this.bO.a(4, new bqg(this, 1.25));
      this.bO.a(5, new bru(this, 1.0));
      this.bO.a(6, new bqp(this, cca.class, 6.0F));
      this.bO.a(7, new brc(this));
   }

   public static bkr.a s() {
      return bjo.A().a(bks.l, 10.0).a(bks.m, 0.2F);
   }

   @Override
   protected apf w() {
      return apg.eZ;
   }

   @Override
   protected apf d(bhu $$0) {
      return apg.fb;
   }

   @Override
   protected apf l_() {
      return apg.fa;
   }

   @Override
   protected void b(gw $$0, dfd $$1) {
      this.a(apg.fd, 0.15F, 1.0F);
   }

   @Override
   protected float eV() {
      return 0.4F;
   }

   @Override
   public bhe b(cca $$0, bhd $$1) {
      cjl $$2 = $$0.b($$1);
      if ($$2.a(cjo.pK) && !this.m_()) {
         $$0.a(apg.fc, 1.0F, 1.0F);
         cjl $$3 = cjn.a($$2, $$0, cjo.pQ.ai_());
         $$0.a($$1, $$3);
         return bhe.a(this.dL().B);
      } else {
         return super.b($$0, $$1);
      }
   }

   @Nullable
   public bve b(akt $$0, bir $$1) {
      return bja.t.a((cqb)$$0);
   }

   @Override
   protected float b(bjy $$0, bix $$1) {
      return this.m_() ? $$1.b * 0.95F : 1.3F;
   }

   @Override
   protected Vector3f a(biw $$0, bix $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b - 0.03125F * $$2, 0.0F);
   }
}
