import java.util.Optional;

public abstract class dux extends duy {
   private final dux.a d;
   private final int e;
   private final int f;

   protected dux(dux.a $$0, int $$1, int $$2, duy.c $$3) {
      super($$3);
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
   }

   @Override
   public Optional<duy.b> a(duy.a $$0) {
      return a($$0, this.e, this.f) < $$0.b().e() ? Optional.empty() : a($$0, dki.a.a, $$1 -> this.a($$1, $$0));
   }

   private void a(dvq $$0, duy.a $$1) {
      cos $$2 = $$1.h();
      $$0.a(this.d.construct($$1.f(), $$2.d(), $$2.e()));
   }

   @FunctionalInterface
   protected interface a {
      dvc construct(dlh var1, int var2, int var3);
   }
}
