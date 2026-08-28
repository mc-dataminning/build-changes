import javax.annotation.Nullable;

public class dap extends cyo {
   private final bxe<? extends bxy> a;
   private final awq b;

   public dap(bxe<? extends bxy> $$0, exp $$1, awq $$2, czw.a $$3) {
      super($$1, $$3);
      this.a = $$0;
      this.b = $$2;
   }

   @Override
   public void a(@Nullable bxw $$0, djz $$1, daa $$2, iw $$3) {
      if ($$1 instanceof aru) {
         this.a((aru)$$1, $$2, $$3);
         $$1.a($$0, egg.t, $$3);
      }
   }

   @Override
   protected void a(@Nullable bxw $$0, dka $$1, iw $$2) {
      $$1.a($$0, $$2, this.b, aws.g, 1.0F, 1.0F);
   }

   private void a(aru $$0, daa $$1, iw $$2) {
      bxy $$3 = this.a.b($$0, bxe.a($$0, $$1, null), $$2, bxd.l, true, false);
      if ($$3 instanceof cjo $$4) {
         dci $$5 = $$1.a(kl.Z, dci.a);
         $$4.d($$5.d());
         $$4.w(true);
      }

      if ($$3 != null) {
         $$0.a_($$3);
         $$3.T();
      }
   }
}
