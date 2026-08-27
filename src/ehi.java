import java.util.Optional;

public abstract class ehi extends ehj {
   private final ehi.a d;
   private final int e;
   private final int f;

   protected ehi(ehi.a $$0, int $$1, int $$2, ehj.c $$3) {
      super($$3);
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
   }

   @Override
   public Optional<ehj.b> a(ehj.a $$0) {
      return a($$0, this.e, this.f) < $$0.b().e() ? Optional.empty() : a($$0, dwt.a.a, $$1 -> this.a($$1, $$0));
   }

   private void a(eib $$0, ehj.a $$1) {
      dae $$2 = $$1.h();
      $$0.a(this.d.construct($$1.f(), $$2.d(), $$2.e()));
   }

   @FunctionalInterface
   protected interface a {
      ehn construct(dxs var1, int var2, int var3);
   }
}
