import javax.annotation.Nullable;
import org.joml.Vector3f;

public class byf extends bxy {
   public byf(blz<? extends byf> $$0, ctp $$1) {
      super($$0, $$1);
   }

   @Override
   protected void B() {
      this.bO.a(0, new btb(this));
      this.bO.a(1, new bua(this, 2.0));
      this.bO.a(2, new bst(this, 1.0));
      this.bO.a(3, new bup(this, 1.25, cpz.a(cnb.pt), false));
      this.bO.a(4, new btg(this, 1.25));
      this.bO.a(5, new buu(this, 1.0));
      this.bO.a(6, new btp(this, cfi.class, 6.0F));
      this.bO.a(7, new buc(this));
   }

   public static bnq.a u() {
      return bmn.C().a(bnr.l, 10.0).a(bnr.m, 0.2F);
   }

   @Override
   protected arr y() {
      return ars.fy;
   }

   @Override
   protected arr d(bkt $$0) {
      return ars.fA;
   }

   @Override
   protected arr n_() {
      return ars.fz;
   }

   @Override
   protected void b(hx $$0, djh $$1) {
      this.a(ars.fC, 0.15F, 1.0F);
   }

   @Override
   protected float eW() {
      return 0.4F;
   }

   @Override
   public bkb b(cfi $$0, bka $$1) {
      cmy $$2 = $$0.b($$1);
      if ($$2.a(cnb.qv) && !this.o_()) {
         $$0.a(ars.fB, 1.0F, 1.0F);
         cmy $$3 = cna.a($$2, $$0, cnb.qB.am_());
         $$0.a($$1, $$3);
         return bkb.a(this.dM().B);
      } else {
         return super.b($$0, $$1);
      }
   }

   @Nullable
   public byf b(and $$0, blq $$1) {
      return blz.u.a((ctp)$$0);
   }

   @Override
   protected float b(bmx $$0, blw $$1) {
      return this.o_() ? $$1.b * 0.95F : 1.3F;
   }

   @Override
   protected Vector3f a(blv $$0, blw $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b - 0.03125F * $$2, 0.0F);
   }
}
