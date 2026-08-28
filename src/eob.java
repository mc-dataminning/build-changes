import java.util.Optional;

public abstract class eob extends eoc {
   private final eob.a d;
   private final int e;
   private final int f;

   protected eob(eob.a $$0, int $$1, int $$2, eoc.c $$3) {
      super($$3);
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
   }

   @Override
   public Optional<eoc.b> a(eoc.a $$0) {
      return a($$0, this.e, this.f) < $$0.b().f() ? Optional.empty() : a($$0, edi.a.a, $$1 -> this.a($$1, $$0));
   }

   private void a(eou $$0, eoc.a $$1) {
      dgg $$2 = $$1.h();
      $$0.a(this.d.construct($$1.f(), $$2.d(), $$2.e()));
   }

   @FunctionalInterface
   protected interface a {
      eog construct(eeh var1, int var2, int var3);
   }
}
