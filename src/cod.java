import javax.annotation.Nullable;

public abstract class cod extends cpa {
   private final cen a;

   protected cod(cen $$0, dca.d $$1) {
      super($$1);
      this.a = $$0;
   }

   @Override
   public boolean a(dcb $$0) {
      return true;
   }

   @Override
   public czn a(gu $$0, dcb $$1) {
      return new czd($$0, $$1, this.a);
   }

   @Override
   public void a(cmm $$0, gu $$1, dcb $$2, @Nullable bfz $$3, cfz $$4) {
      if ($$0.B) {
         $$0.a($$1, czp.t).ifPresent($$1x -> $$1x.b($$4));
      } else if ($$4.A()) {
         $$0.a($$1, czp.t).ifPresent($$1x -> $$1x.a($$4.y()));
      }
   }

   @Override
   public cfz a(cls $$0, gu $$1, dcb $$2) {
      czn $$3 = $$0.c_($$1);
      return $$3 instanceof czd ? ((czd)$$3).f() : super.a($$0, $$1, $$2);
   }

   public cen a() {
      return this.a;
   }
}
