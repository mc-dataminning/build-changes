import javax.annotation.Nullable;

public class czs extends cxr {
   private final bwo<? extends bxg> a;
   private final awm b;

   public czs(bwo<? extends bxg> $$0, ewn $$1, awm $$2, cyz.a $$3) {
      super($$1, $$3);
      this.a = $$0;
      this.b = $$2;
   }

   @Override
   public void a(@Nullable bxe $$0, dja $$1, czd $$2, iu $$3) {
      if ($$1 instanceof arq) {
         this.a((arq)$$1, $$2, $$3);
         $$1.a($$0, efh.t, $$3);
      }
   }

   @Override
   protected void a(@Nullable bxe $$0, djb $$1, iu $$2) {
      $$1.a($$0, $$2, this.b, awo.g, 1.0F, 1.0F);
   }

   private void a(arq $$0, czd $$1, iu $$2) {
      bxg $$3 = this.a.b($$0, bwo.a($$0, $$1, null), $$2, bwn.l, true, false);
      if ($$3 instanceof ciw $$4) {
         dbl $$5 = $$1.a(kj.Z, dbl.a);
         $$4.h($$5.d());
         $$4.w(true);
      }

      if ($$3 != null) {
         $$0.a_($$3);
         $$3.T();
      }
   }
}
