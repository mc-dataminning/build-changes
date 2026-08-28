import java.util.Optional;

public abstract class eie extends eif {
   private final eie.a d;
   private final int e;
   private final int f;

   protected eie(eie.a $$0, int $$1, int $$2, eif.c $$3) {
      super($$3);
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
   }

   @Override
   public Optional<eif.b> a(eif.a $$0) {
      return a($$0, this.e, this.f) < $$0.b().e() ? Optional.empty() : a($$0, dxp.a.a, $$1 -> this.a($$1, $$0));
   }

   private void a(eix $$0, eif.a $$1) {
      dba $$2 = $$1.h();
      $$0.a(this.d.construct($$1.f(), $$2.d(), $$2.e()));
   }

   @FunctionalInterface
   protected interface a {
      eij construct(dyo var1, int var2, int var3);
   }
}
