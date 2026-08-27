import javax.annotation.Nullable;
import org.joml.Vector3f;

public class bwy extends bwr {
   public bwy(bku<? extends bwy> $$0, csa $$1) {
      super($$0, $$1);
   }

   @Override
   protected void B() {
      this.bO.a(0, new brv(this));
      this.bO.a(1, new bsu(this, 2.0));
      this.bO.a(2, new brn(this, 1.0));
      this.bO.a(3, new btj(this, 1.25, cok.a(clm.pt), false));
      this.bO.a(4, new bsa(this, 1.25));
      this.bO.a(5, new bto(this, 1.0));
      this.bO.a(6, new bsj(this, cdu.class, 6.0F));
      this.bO.a(7, new bsw(this));
   }

   public static bml.a u() {
      return bli.C().a(bmm.l, 10.0).a(bmm.m, 0.2F);
   }

   @Override
   protected aqq y() {
      return aqr.fp;
   }

   @Override
   protected aqq d(bjo $$0) {
      return aqr.fr;
   }

   @Override
   protected aqq m_() {
      return aqr.fq;
   }

   @Override
   protected void b(ht $$0, dhi $$1) {
      this.a(aqr.ft, 0.15F, 1.0F);
   }

   @Override
   protected float eX() {
      return 0.4F;
   }

   @Override
   public bix b(cdu $$0, biw $$1) {
      clj $$2 = $$0.b($$1);
      if ($$2.a(clm.qv) && !this.n_()) {
         $$0.a(aqr.fs, 1.0F, 1.0F);
         clj $$3 = cll.a($$2, $$0, clm.qB.al_());
         $$0.a($$1, $$3);
         return bix.a(this.dN().B);
      } else {
         return super.b($$0, $$1);
      }
   }

   @Nullable
   public bwy b(ame $$0, bkl $$1) {
      return bku.t.a((csa)$$0);
   }

   @Override
   protected float b(bls $$0, bkr $$1) {
      return this.n_() ? $$1.b * 0.95F : 1.3F;
   }

   @Override
   protected Vector3f a(bkq $$0, bkr $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b - 0.03125F * $$2, 0.0F);
   }
}
