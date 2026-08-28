import javax.annotation.Nullable;

public class daz extends cyy {
   private final bxn<? extends byh> a;
   private final awx b;

   public daz(bxn<? extends byh> $$0, exz $$1, awx $$2, dag.a $$3) {
      super($$1, $$3);
      this.a = $$0;
      this.b = $$2;
   }

   @Override
   public void a(@Nullable byf $$0, dkj $$1, dak $$2, iw $$3) {
      if ($$1 instanceof asb) {
         this.a((asb)$$1, $$2, $$3);
         $$1.a($$0, egq.t, $$3);
      }
   }

   @Override
   protected void a(@Nullable byf $$0, dkk $$1, iw $$2) {
      $$1.a($$0, $$2, this.b, awz.g, 1.0F, 1.0F);
   }

   private void a(asb $$0, dak $$1, iw $$2) {
      byh $$3 = this.a.b($$0, bxn.a($$0, $$1, null), $$2, bxm.l, true, false);
      if ($$3 instanceof cjx $$4) {
         dcs $$5 = $$1.a(kl.Z, dcs.a);
         $$4.d($$5.d());
         $$4.w(true);
      }

      if ($$3 != null) {
         $$0.a_($$3);
         $$3.S();
      }
   }
}
