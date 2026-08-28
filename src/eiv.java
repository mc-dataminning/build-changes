import java.util.Optional;

public abstract class eiv extends eiw {
   private final eiv.a d;
   private final int e;
   private final int f;

   protected eiv(eiv.a $$0, int $$1, int $$2, eiw.c $$3) {
      super($$3);
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
   }

   @Override
   public Optional<eiw.b> a(eiw.a $$0) {
      return a($$0, this.e, this.f) < $$0.b().f() ? Optional.empty() : a($$0, dyf.a.a, $$1 -> this.a($$1, $$0));
   }

   private void a(ejo $$0, eiw.a $$1) {
      dbm $$2 = $$1.h();
      $$0.a(this.d.construct($$1.f(), $$2.d(), $$2.e()));
   }

   @FunctionalInterface
   protected interface a {
      eja construct(dze var1, int var2, int var3);
   }
}
