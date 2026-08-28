import java.util.Optional;

public abstract class eoj extends eok {
   private final eoj.a d;
   private final int e;
   private final int f;

   protected eoj(eoj.a $$0, int $$1, int $$2, eok.c $$3) {
      super($$3);
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
   }

   @Override
   public Optional<eok.b> a(eok.a $$0) {
      return a($$0, this.e, this.f) < $$0.b().f() ? Optional.empty() : a($$0, edq.a.a, $$1 -> this.a($$1, $$0));
   }

   private void a(epc $$0, eok.a $$1) {
      dgo $$2 = $$1.h();
      $$0.a(this.d.construct($$1.f(), $$2.d(), $$2.e()));
   }

   @FunctionalInterface
   protected interface a {
      eoo construct(eep var1, int var2, int var3);
   }
}
