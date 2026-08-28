import javax.annotation.Nullable;

public class cfk extends cfd {
   private static final bsv bY = bsy.w.n().a(0.5F).b(0.665F);

   public cfk(bsy<? extends cfk> $$0, dbw $$1) {
      super($$0, $$1);
   }

   @Override
   protected void z() {
      this.bS.a(0, new caf(this));
      this.bS.a(1, new cbe(this, 2.0));
      this.bS.a(2, new bzx(this, 1.0));
      this.bS.a(3, new cbt(this, 1.25, $$0 -> $$0.a(awx.aa), false));
      this.bS.a(4, new cak(this, 1.25));
      this.bS.a(5, new cby(this, 1.0));
      this.bS.a(6, new cat(this, cmv.class, 6.0F));
      this.bS.a(7, new cbg(this));
   }

   @Override
   public boolean o(cun $$0) {
      return $$0.a(awx.aa);
   }

   public static buu.a s() {
      return btp.A().a(buv.q, 10.0).a(buv.r, 0.2F);
   }

   @Override
   protected avy v() {
      return avz.gb;
   }

   @Override
   protected avy d(brl $$0) {
      return avz.gd;
   }

   @Override
   protected avy o_() {
      return avz.gc;
   }

   @Override
   protected void b(iz $$0, dsa $$1) {
      this.a(avz.gf, 0.15F, 1.0F);
   }

   @Override
   protected float fe() {
      return 0.4F;
   }

   @Override
   public bqs b(cmv $$0, bqr $$1) {
      cun $$2 = $$0.b($$1);
      if ($$2.a(cuq.qy) && !this.p_()) {
         $$0.a(avz.ge, 1.0F, 1.0F);
         cun $$3 = cup.a($$2, $$0, cuq.qE.w());
         $$0.a($$1, $$3);
         return bqs.a(this.dP().B);
      } else {
         return super.b($$0, $$1);
      }
   }

   @Nullable
   public cfk b(are $$0, bsm $$1) {
      return bsy.w.a((dbw)$$0);
   }

   @Override
   public bsv e(btz $$0) {
      return this.p_() ? bY : super.e($$0);
   }
}
