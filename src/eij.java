import java.util.Optional;

public abstract class eij extends eik {
   private final eij.a d;
   private final int e;
   private final int f;

   protected eij(eij.a $$0, int $$1, int $$2, eik.c $$3) {
      super($$3);
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
   }

   @Override
   public Optional<eik.b> a(eik.a $$0) {
      return a($$0, this.e, this.f) < $$0.b().f() ? Optional.empty() : a($$0, dxu.a.a, $$1 -> this.a($$1, $$0));
   }

   private void a(ejc $$0, eik.a $$1) {
      dbf $$2 = $$1.h();
      $$0.a(this.d.construct($$1.f(), $$2.d(), $$2.e()));
   }

   @FunctionalInterface
   protected interface a {
      eio construct(dyt var1, int var2, int var3);
   }
}
