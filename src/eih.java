import java.util.Optional;

public abstract class eih extends eii {
   private final eih.a d;
   private final int e;
   private final int f;

   protected eih(eih.a $$0, int $$1, int $$2, eii.c $$3) {
      super($$3);
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
   }

   @Override
   public Optional<eii.b> a(eii.a $$0) {
      return a($$0, this.e, this.f) < $$0.b().f() ? Optional.empty() : a($$0, dxs.a.a, $$1 -> this.a($$1, $$0));
   }

   private void a(eja $$0, eii.a $$1) {
      dbd $$2 = $$1.h();
      $$0.a(this.d.construct($$1.f(), $$2.d(), $$2.e()));
   }

   @FunctionalInterface
   protected interface a {
      eim construct(dyr var1, int var2, int var3);
   }
}
