import java.util.Optional;

public abstract class eqs extends eqt {
   private final eqs.a d;
   private final int e;
   private final int f;

   protected eqs(eqs.a $$0, int $$1, int $$2, eqt.c $$3) {
      super($$3);
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
   }

   @Override
   public Optional<eqt.b> a(eqt.a $$0) {
      return a($$0, this.e, this.f) < $$0.b().f() ? Optional.empty() : a($$0, efy.a.a, $$1 -> this.a($$1, $$0));
   }

   private void a(erl $$0, eqt.a $$1) {
      dic $$2 = $$1.h();
      $$0.a(this.d.construct($$1.f(), $$2.d(), $$2.e()));
   }

   @FunctionalInterface
   protected interface a {
      eqx construct(egx var1, int var2, int var3);
   }
}
