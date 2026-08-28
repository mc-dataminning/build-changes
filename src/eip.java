import java.util.Optional;

public abstract class eip extends eiq {
   private final eip.a d;
   private final int e;
   private final int f;

   protected eip(eip.a $$0, int $$1, int $$2, eiq.c $$3) {
      super($$3);
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
   }

   @Override
   public Optional<eiq.b> a(eiq.a $$0) {
      return a($$0, this.e, this.f) < $$0.b().f() ? Optional.empty() : a($$0, dxz.a.a, $$1 -> this.a($$1, $$0));
   }

   private void a(eji $$0, eiq.a $$1) {
      dbk $$2 = $$1.h();
      $$0.a(this.d.construct($$1.f(), $$2.d(), $$2.e()));
   }

   @FunctionalInterface
   protected interface a {
      eiu construct(dyy var1, int var2, int var3);
   }
}
