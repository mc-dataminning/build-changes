import java.util.Optional;

public abstract class eqh extends eqi {
   private final eqh.a d;
   private final int e;
   private final int f;

   protected eqh(eqh.a $$0, int $$1, int $$2, eqi.c $$3) {
      super($$3);
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
   }

   @Override
   public Optional<eqi.b> a(eqi.a $$0) {
      return a($$0, this.e, this.f) < $$0.b().f() ? Optional.empty() : a($$0, efn.a.a, $$1 -> this.a($$1, $$0));
   }

   private void a(era $$0, eqi.a $$1) {
      dhw $$2 = $$1.h();
      $$0.a(this.d.construct($$1.f(), $$2.d(), $$2.e()));
   }

   @FunctionalInterface
   protected interface a {
      eqm construct(egm var1, int var2, int var3);
   }
}
