import java.util.Optional;

public abstract class esm extends esn {
   private final esm.a d;
   private final int e;
   private final int f;

   protected esm(esm.a $$0, int $$1, int $$2, esn.c $$3) {
      super($$3);
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
   }

   @Override
   public Optional<esn.b> a(esn.a $$0) {
      return a($$0, this.e, this.f) < $$0.b().f() ? Optional.empty() : a($$0, ehp.a.a, $$1 -> this.a($$1, $$0));
   }

   private void a(etf $$0, esn.a $$1) {
      djo $$2 = $$1.h();
      $$0.a(this.d.construct($$1.f(), $$2.d(), $$2.e()));
   }

   @FunctionalInterface
   protected interface a {
      esr construct(eio var1, int var2, int var3);
   }
}
