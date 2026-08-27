import javax.annotation.Nullable;
import org.joml.Vector3f;

public class bxd extends bww {
   public bxd(bkz<? extends bxd> $$0, csf $$1) {
      super($$0, $$1);
   }

   @Override
   protected void B() {
      this.bO.a(0, new bsa(this));
      this.bO.a(1, new bsz(this, 2.0));
      this.bO.a(2, new brs(this, 1.0));
      this.bO.a(3, new bto(this, 1.25, coq.a(clr.pt), false));
      this.bO.a(4, new bsf(this, 1.25));
      this.bO.a(5, new btt(this, 1.0));
      this.bO.a(6, new bso(this, cdz.class, 6.0F));
      this.bO.a(7, new btb(this));
   }

   public static bmq.a u() {
      return bln.C().a(bmr.l, 10.0).a(bmr.m, 0.2F);
   }

   @Override
   protected aqu y() {
      return aqv.fp;
   }

   @Override
   protected aqu d(bjt $$0) {
      return aqv.fr;
   }

   @Override
   protected aqu n_() {
      return aqv.fq;
   }

   @Override
   protected void b(hx $$0, dhn $$1) {
      this.a(aqv.ft, 0.15F, 1.0F);
   }

   @Override
   protected float eX() {
      return 0.4F;
   }

   @Override
   public bjb b(cdz $$0, bja $$1) {
      clo $$2 = $$0.b($$1);
      if ($$2.a(clr.qv) && !this.o_()) {
         $$0.a(aqv.fs, 1.0F, 1.0F);
         clo $$3 = clq.a($$2, $$0, clr.qB.an_());
         $$0.a($$1, $$3);
         return bjb.a(this.dN().B);
      } else {
         return super.b($$0, $$1);
      }
   }

   @Nullable
   public bxd b(ami $$0, bkq $$1) {
      return bkz.t.a((csf)$$0);
   }

   @Override
   protected float b(blx $$0, bkw $$1) {
      return this.o_() ? $$1.b * 0.95F : 1.3F;
   }

   @Override
   protected Vector3f a(bkv $$0, bkw $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b - 0.03125F * $$2, 0.0F);
   }
}
