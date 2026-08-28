import java.util.Optional;

public abstract class eoc extends eod {
   private final eoc.a d;
   private final int e;
   private final int f;

   protected eoc(eoc.a $$0, int $$1, int $$2, eod.c $$3) {
      super($$3);
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
   }

   @Override
   public Optional<eod.b> a(eod.a $$0) {
      return a($$0, this.e, this.f) < $$0.b().f() ? Optional.empty() : a($$0, edj.a.a, $$1 -> this.a($$1, $$0));
   }

   private void a(eov $$0, eod.a $$1) {
      dgf $$2 = $$1.h();
      $$0.a(this.d.construct($$1.f(), $$2.d(), $$2.e()));
   }

   @FunctionalInterface
   protected interface a {
      eoh construct(eei var1, int var2, int var3);
   }
}
