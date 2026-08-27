import javax.annotation.Nullable;
import org.joml.Vector3f;

public class bup extends bui {
   public bup(bik<? extends bup> $$0, cpk $$1) {
      super($$0, $$1);
   }

   @Override
   protected void w() {
      this.bO.a(0, new bpm(this));
      this.bO.a(1, new bql(this, 2.0));
      this.bO.a(2, new bpe(this, 1.0));
      this.bO.a(3, new bra(this, 1.25, clw.a(ciz.oI), false));
      this.bO.a(4, new bpr(this, 1.25));
      this.bO.a(5, new brf(this, 1.0));
      this.bO.a(6, new bqa(this, cbl.class, 6.0F));
      this.bO.a(7, new bqn(this));
   }

   public static bkc.a p() {
      return biy.x().a(bkd.a, 10.0).a(bkd.d, 0.2F);
   }

   @Override
   protected aot r() {
      return aou.eZ;
   }

   @Override
   protected aot d(bhe $$0) {
      return aou.fb;
   }

   @Override
   protected aot h_() {
      return aou.fa;
   }

   @Override
   protected void b(gv $$0, dey $$1) {
      this.a(aou.fd, 0.15F, 1.0F);
   }

   @Override
   protected float eU() {
      return 0.4F;
   }

   @Override
   public bgo b(cbl $$0, bgn $$1) {
      ciw $$2 = $$0.b($$1);
      if ($$2.a(ciz.pK) && !this.i_()) {
         $$0.a(aou.fc, 1.0F, 1.0F);
         ciw $$3 = ciy.a($$2, $$0, ciz.pQ.ae_());
         $$0.a($$1, $$3);
         return bgo.a(this.dK().B);
      } else {
         return super.b($$0, $$1);
      }
   }

   @Nullable
   public bup b(aki $$0, bib $$1) {
      return bik.t.a((cpk)$$0);
   }

   @Override
   protected float b(bji $$0, bih $$1) {
      return this.i_() ? $$1.b * 0.95F : 1.3F;
   }

   @Override
   protected Vector3f a(big $$0, bih $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b - 0.03125F * $$2, 0.0F);
   }
}
