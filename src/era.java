import java.util.Optional;

public abstract class era extends erb {
   private final era.a d;
   private final int e;
   private final int f;

   protected era(era.a $$0, int $$1, int $$2, erb.c $$3) {
      super($$3);
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
   }

   @Override
   public Optional<erb.b> a(erb.a $$0) {
      return a($$0, this.e, this.f) < $$0.b().f() ? Optional.empty() : a($$0, egg.a.a, $$1 -> this.a($$1, $$0));
   }

   private void a(ert $$0, erb.a $$1) {
      dih $$2 = $$1.h();
      $$0.a(this.d.construct($$1.f(), $$2.d(), $$2.e()));
   }

   @FunctionalInterface
   protected interface a {
      erf construct(ehf var1, int var2, int var3);
   }
}
