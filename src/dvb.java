import java.util.Optional;

public abstract class dvb extends dvc {
   private final dvb.a d;
   private final int e;
   private final int f;

   protected dvb(dvb.a $$0, int $$1, int $$2, dvc.c $$3) {
      super($$3);
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
   }

   @Override
   public Optional<dvc.b> a(dvc.a $$0) {
      return a($$0, this.e, this.f) < $$0.b().e() ? Optional.empty() : a($$0, dkm.a.a, $$1 -> this.a($$1, $$0));
   }

   private void a(dvu $$0, dvc.a $$1) {
      cpi $$2 = $$1.h();
      $$0.a(this.d.construct($$1.f(), $$2.d(), $$2.e()));
   }

   @FunctionalInterface
   protected interface a {
      dvg construct(dll var1, int var2, int var3);
   }
}
