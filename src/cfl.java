import javax.annotation.Nullable;

public class cfl extends cfe {
   private static final bsw bY = bsz.w.n().a(0.5F).b(0.665F);

   public cfl(bsz<? extends cfl> $$0, dbx $$1) {
      super($$0, $$1);
   }

   @Override
   protected void z() {
      this.bS.a(0, new cag(this));
      this.bS.a(1, new cbf(this, 2.0));
      this.bS.a(2, new bzy(this, 1.0));
      this.bS.a(3, new cbu(this, 1.25, $$0 -> $$0.a(awx.aa), false));
      this.bS.a(4, new cal(this, 1.25));
      this.bS.a(5, new cbz(this, 1.0));
      this.bS.a(6, new cau(this, cmw.class, 6.0F));
      this.bS.a(7, new cbh(this));
   }

   @Override
   public boolean o(cuo $$0) {
      return $$0.a(awx.aa);
   }

   public static buv.a s() {
      return btq.A().a(buw.q, 10.0).a(buw.r, 0.2F);
   }

   @Override
   protected avy v() {
      return avz.gb;
   }

   @Override
   protected avy d(brm $$0) {
      return avz.gd;
   }

   @Override
   protected avy o_() {
      return avz.gc;
   }

   @Override
   protected void b(iz $$0, dsb $$1) {
      this.a(avz.gf, 0.15F, 1.0F);
   }

   @Override
   protected float fe() {
      return 0.4F;
   }

   @Override
   public bqt b(cmw $$0, bqs $$1) {
      cuo $$2 = $$0.b($$1);
      if ($$2.a(cur.qy) && !this.p_()) {
         $$0.a(avz.ge, 1.0F, 1.0F);
         cuo $$3 = cuq.a($$2, $$0, cur.qE.w());
         $$0.a($$1, $$3);
         return bqt.a(this.dP().B);
      } else {
         return super.b($$0, $$1);
      }
   }

   @Nullable
   public cfl b(are $$0, bsn $$1) {
      return bsz.w.a((dbx)$$0);
   }

   @Override
   public bsw e(bua $$0) {
      return this.p_() ? bY : super.e($$0);
   }
}
