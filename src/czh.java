import javax.annotation.Nullable;

public class czh extends cxg {
   private final bwj<? extends bxb> a;
   private final awk b;

   public czh(bwj<? extends bxb> $$0, evu $$1, awk $$2, cyo.a $$3) {
      super($$1, $$3);
      this.a = $$0;
      this.b = $$2;
   }

   @Override
   public void a(@Nullable bwz $$0, dip $$1, cys $$2, iu $$3) {
      if ($$1 instanceof aro) {
         this.a((aro)$$1, $$2, $$3);
         $$1.a($$0, eeo.t, $$3);
      }
   }

   @Override
   protected void a(@Nullable bwz $$0, diq $$1, iu $$2) {
      $$1.a($$0, $$2, this.b, awm.g, 1.0F, 1.0F);
   }

   private void a(aro $$0, cys $$1, iu $$2) {
      bxb $$3 = this.a.b($$0, bwj.a($$0, $$1, null), $$2, bwi.l, true, false);
      if ($$3 instanceof ciq $$4) {
         dba $$5 = $$1.a(kj.Z, dba.a);
         $$4.h($$5.d());
         $$4.w(true);
      }

      if ($$3 != null) {
         $$0.a_($$3);
         $$3.T();
      }
   }
}
