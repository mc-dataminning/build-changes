import java.util.Optional;

public abstract class erm extends ern {
   private final erm.a d;
   private final int e;
   private final int f;

   protected erm(erm.a $$0, int $$1, int $$2, ern.c $$3) {
      super($$3);
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
   }

   @Override
   public Optional<ern.b> a(ern.a $$0) {
      return a($$0, this.e, this.f) < $$0.b().f() ? Optional.empty() : a($$0, egs.a.a, $$1 -> this.a($$1, $$0));
   }

   private void a(esf $$0, ern.a $$1) {
      dir $$2 = $$1.h();
      $$0.a(this.d.construct($$1.f(), $$2.d(), $$2.e()));
   }

   @FunctionalInterface
   protected interface a {
      err construct(ehr var1, int var2, int var3);
   }
}
