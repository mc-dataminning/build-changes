import java.util.Optional;

public abstract class ehk extends ehl {
   private final ehk.a d;
   private final int e;
   private final int f;

   protected ehk(ehk.a $$0, int $$1, int $$2, ehl.c $$3) {
      super($$3);
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
   }

   @Override
   public Optional<ehl.b> a(ehl.a $$0) {
      return a($$0, this.e, this.f) < $$0.b().e() ? Optional.empty() : a($$0, dwv.a.a, $$1 -> this.a($$1, $$0));
   }

   private void a(eid $$0, ehl.a $$1) {
      dag $$2 = $$1.h();
      $$0.a(this.d.construct($$1.f(), $$2.d(), $$2.e()));
   }

   @FunctionalInterface
   protected interface a {
      ehp construct(dxu var1, int var2, int var3);
   }
}
