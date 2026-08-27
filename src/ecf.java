import java.util.Optional;

public abstract class ecf extends ecg {
   private final ecf.a d;
   private final int e;
   private final int f;

   protected ecf(ecf.a $$0, int $$1, int $$2, ecg.c $$3) {
      super($$3);
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
   }

   @Override
   public Optional<ecg.b> a(ecg.a $$0) {
      return a($$0, this.e, this.f) < $$0.b().e() ? Optional.empty() : a($$0, drq.a.a, $$1 -> this.a($$1, $$0));
   }

   private void a(ecy $$0, ecg.a $$1) {
      cvl $$2 = $$1.h();
      $$0.a(this.d.construct($$1.f(), $$2.d(), $$2.e()));
   }

   @FunctionalInterface
   protected interface a {
      eck construct(dsp var1, int var2, int var3);
   }
}
