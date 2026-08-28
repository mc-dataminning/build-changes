import javax.annotation.Nullable;

public class czn extends cxm {
   private final bwm<? extends bxe> a;
   private final awm b;

   public czn(bwm<? extends bxe> $$0, ewf $$1, awm $$2, cyu.a $$3) {
      super($$1, $$3);
      this.a = $$0;
      this.b = $$2;
   }

   @Override
   public void a(@Nullable bxc $$0, div $$1, cyy $$2, iu $$3) {
      if ($$1 instanceof arq) {
         this.a((arq)$$1, $$2, $$3);
         $$1.a($$0, eez.t, $$3);
      }
   }

   @Override
   protected void a(@Nullable bxc $$0, diw $$1, iu $$2) {
      $$1.a($$0, $$2, this.b, awo.g, 1.0F, 1.0F);
   }

   private void a(arq $$0, cyy $$1, iu $$2) {
      bxe $$3 = this.a.b($$0, bwm.a($$0, $$1, null), $$2, bwl.l, true, false);
      if ($$3 instanceof ciu $$4) {
         dbg $$5 = $$1.a(kj.Z, dbg.a);
         $$4.h($$5.d());
         $$4.w(true);
      }

      if ($$3 != null) {
         $$0.a_($$3);
         $$3.T();
      }
   }
}
