import java.util.Optional;

public abstract class esa extends esb {
   private final esa.a d;
   private final int e;
   private final int f;

   protected esa(esa.a $$0, int $$1, int $$2, esb.c $$3) {
      super($$3);
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
   }

   @Override
   public Optional<esb.b> a(esb.a $$0) {
      return a($$0, this.e, this.f) < $$0.b().f() ? Optional.empty() : a($$0, ehd.a.a, $$1 -> this.a($$1, $$0));
   }

   private void a(est $$0, esb.a $$1) {
      djc $$2 = $$1.h();
      $$0.a(this.d.construct($$1.f(), $$2.d(), $$2.e()));
   }

   @FunctionalInterface
   protected interface a {
      esf construct(eic var1, int var2, int var3);
   }
}
