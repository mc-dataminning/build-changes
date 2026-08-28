import javax.annotation.Nullable;

public class cct extends ccu {
   public cct(bus $$0, double $$1) {
      super($$0, $$1);
   }

   @Nullable
   @Override
   protected eys h() {
      eys $$0 = this.b.g(0.0F);
      int $$1 = 8;
      eys $$2 = cfg.a(this.b, 8, 7, $$0.d, $$0.f, (float) (Math.PI / 2), 3, 1);
      return $$2 != null ? $$2 : cfc.a(this.b, 8, 4, -2, $$0.d, $$0.f, (float) (Math.PI / 2));
   }
}
