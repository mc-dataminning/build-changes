import javax.annotation.Nullable;

public class cfj extends cfc {
   private static final bst ca = bsw.w.n().a(0.5F).b(0.665F);

   public cfj(bsw<? extends cfj> $$0, dcu $$1) {
      super($$0, $$1);
   }

   @Override
   protected void z() {
      this.bU.a(0, new cae(this));
      this.bU.a(1, new cbd(this, 2.0));
      this.bU.a(2, new bzw(this, 1.0));
      this.bU.a(3, new cbs(this, 1.25, $$0 -> $$0.a(awm.aa), false));
      this.bU.a(4, new caj(this, 1.25));
      this.bU.a(5, new cbx(this, 1.0));
      this.bU.a(6, new cas(this, cmv.class, 6.0F));
      this.bU.a(7, new cbf(this));
   }

   @Override
   public boolean o(cuo $$0) {
      return $$0.a(awm.aa);
   }

   public static but.a s() {
      return btn.A().a(buu.s, 10.0).a(buu.v, 0.2F);
   }

   @Override
   protected avn v() {
      return avo.gb;
   }

   @Override
   protected avn d(brj $$0) {
      return avo.gd;
   }

   @Override
   protected avn n_() {
      return avo.gc;
   }

   @Override
   protected void b(jd $$0, dta $$1) {
      this.a(avo.gf, 0.15F, 1.0F);
   }

   @Override
   protected float fb() {
      return 0.4F;
   }

   @Override
   public bqq b(cmv $$0, bqp $$1) {
      cuo $$2 = $$0.b($$1);
      if ($$2.a(cur.qy) && !this.o_()) {
         $$0.a(avo.ge, 1.0F, 1.0F);
         cuo $$3 = cuq.a($$2, $$0, cur.qE.w());
         $$0.a($$1, $$3);
         return bqq.a(this.dQ().B);
      } else {
         return super.b($$0, $$1);
      }
   }

   @Nullable
   public cfj b(aqt $$0, bsk $$1) {
      return bsw.w.a((dcu)$$0);
   }

   @Override
   public bst e(bty $$0) {
      return this.o_() ? ca : super.e($$0);
   }
}
