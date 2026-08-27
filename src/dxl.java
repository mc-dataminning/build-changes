import java.util.Optional;

public abstract class dxl extends dxm {
   private final dxl.a d;
   private final int e;
   private final int f;

   protected dxl(dxl.a $$0, int $$1, int $$2, dxm.c $$3) {
      super($$3);
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
   }

   @Override
   public Optional<dxm.b> a(dxm.a $$0) {
      return a($$0, this.e, this.f) < $$0.b().e() ? Optional.empty() : a($$0, dmw.a.a, $$1 -> this.a($$1, $$0));
   }

   private void a(dye $$0, dxm.a $$1) {
      crm $$2 = $$1.h();
      $$0.a(this.d.construct($$1.f(), $$2.d(), $$2.e()));
   }

   @FunctionalInterface
   protected interface a {
      dxq construct(dnv var1, int var2, int var3);
   }
}
