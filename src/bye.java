import javax.annotation.Nullable;
import org.joml.Vector3f;

public class bye extends bxx {
   public bye(bly<? extends bye> $$0, cto $$1) {
      super($$0, $$1);
   }

   @Override
   protected void B() {
      this.bO.a(0, new bta(this));
      this.bO.a(1, new btz(this, 2.0));
      this.bO.a(2, new bss(this, 1.0));
      this.bO.a(3, new buo(this, 1.25, cpy.a(cna.pt), false));
      this.bO.a(4, new btf(this, 1.25));
      this.bO.a(5, new but(this, 1.0));
      this.bO.a(6, new bto(this, cfh.class, 6.0F));
      this.bO.a(7, new bub(this));
   }

   public static bnp.a u() {
      return bmm.C().a(bnq.l, 10.0).a(bnq.m, 0.2F);
   }

   @Override
   protected arq y() {
      return arr.fy;
   }

   @Override
   protected arq d(bks $$0) {
      return arr.fA;
   }

   @Override
   protected arq n_() {
      return arr.fz;
   }

   @Override
   protected void b(hx $$0, djg $$1) {
      this.a(arr.fC, 0.15F, 1.0F);
   }

   @Override
   protected float eW() {
      return 0.4F;
   }

   @Override
   public bka b(cfh $$0, bjz $$1) {
      cmx $$2 = $$0.b($$1);
      if ($$2.a(cna.qv) && !this.o_()) {
         $$0.a(arr.fB, 1.0F, 1.0F);
         cmx $$3 = cmz.a($$2, $$0, cna.qB.am_());
         $$0.a($$1, $$3);
         return bka.a(this.dM().B);
      } else {
         return super.b($$0, $$1);
      }
   }

   @Nullable
   public bye b(and $$0, blp $$1) {
      return bly.u.a((cto)$$0);
   }

   @Override
   protected float b(bmw $$0, blv $$1) {
      return this.o_() ? $$1.b * 0.95F : 1.3F;
   }

   @Override
   protected Vector3f a(blu $$0, blv $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b - 0.03125F * $$2, 0.0F);
   }
}
