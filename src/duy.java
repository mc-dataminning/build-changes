import java.util.Optional;

public abstract class duy extends duz {
   private final duy.a d;
   private final int e;
   private final int f;

   protected duy(duy.a $$0, int $$1, int $$2, duz.c $$3) {
      super($$3);
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
   }

   @Override
   public Optional<duz.b> a(duz.a $$0) {
      return a($$0, this.e, this.f) < $$0.b().e() ? Optional.empty() : a($$0, dkj.a.a, $$1 -> this.a($$1, $$0));
   }

   private void a(dvr $$0, duz.a $$1) {
      cot $$2 = $$1.h();
      $$0.a(this.d.construct($$1.f(), $$2.d(), $$2.e()));
   }

   @FunctionalInterface
   protected interface a {
      dvd construct(dli var1, int var2, int var3);
   }
}
