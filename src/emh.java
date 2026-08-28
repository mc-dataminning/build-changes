import java.util.Optional;

public abstract class emh extends emi {
   private final emh.a d;
   private final int e;
   private final int f;

   protected emh(emh.a $$0, int $$1, int $$2, emi.c $$3) {
      super($$3);
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
   }

   @Override
   public Optional<emi.b> a(emi.a $$0) {
      return a($$0, this.e, this.f) < $$0.b().f() ? Optional.empty() : a($$0, ebq.a.a, $$1 -> this.a($$1, $$0));
   }

   private void a(ena $$0, emi.a $$1) {
      des $$2 = $$1.h();
      $$0.a(this.d.construct($$1.f(), $$2.d(), $$2.e()));
   }

   @FunctionalInterface
   protected interface a {
      emm construct(ecp var1, int var2, int var3);
   }
}
