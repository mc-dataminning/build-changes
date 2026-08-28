import java.util.Optional;

public abstract class eii extends eij {
   private final eii.a d;
   private final int e;
   private final int f;

   protected eii(eii.a $$0, int $$1, int $$2, eij.c $$3) {
      super($$3);
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
   }

   @Override
   public Optional<eij.b> a(eij.a $$0) {
      return a($$0, this.e, this.f) < $$0.b().f() ? Optional.empty() : a($$0, dxt.a.a, $$1 -> this.a($$1, $$0));
   }

   private void a(ejb $$0, eij.a $$1) {
      dbe $$2 = $$1.h();
      $$0.a(this.d.construct($$1.f(), $$2.d(), $$2.e()));
   }

   @FunctionalInterface
   protected interface a {
      ein construct(dys var1, int var2, int var3);
   }
}
