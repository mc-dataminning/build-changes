import java.util.Optional;

public abstract class edb extends edc {
   private final edb.a d;
   private final int e;
   private final int f;

   protected edb(edb.a $$0, int $$1, int $$2, edc.c $$3) {
      super($$3);
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
   }

   @Override
   public Optional<edc.b> a(edc.a $$0) {
      return a($$0, this.e, this.f) < $$0.b().e() ? Optional.empty() : a($$0, dsm.a.a, $$1 -> this.a($$1, $$0));
   }

   private void a(edu $$0, edc.a $$1) {
      cwg $$2 = $$1.h();
      $$0.a(this.d.construct($$1.f(), $$2.d(), $$2.e()));
   }

   @FunctionalInterface
   protected interface a {
      edg construct(dtl var1, int var2, int var3);
   }
}
