import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class cxf extends cya {
   private final cnn a;

   protected cxf(cnn $$0, dle.d $$1) {
      super($$1);
      this.a = $$0;
   }

   @Override
   protected abstract MapCodec<? extends cxf> a();

   @Override
   public boolean a(dlf $$0) {
      return true;
   }

   @Override
   public dit a(hz $$0, dlf $$1) {
      return new dij($$0, $$1, this.a);
   }

   @Override
   public void a(cvn $$0, hz $$1, dlf $$2, @Nullable bog $$3, coz $$4) {
      if ($$0.B) {
         $$0.a($$1, div.t).ifPresent($$1x -> $$1x.b($$4));
      } else if ($$4.B()) {
         $$0.a($$1, div.t).ifPresent($$1x -> $$1x.a($$4.z()));
      }
   }

   @Override
   public coz a(cvq $$0, hz $$1, dlf $$2) {
      dit $$3 = $$0.c_($$1);
      return $$3 instanceof dij ? ((dij)$$3).f() : super.a($$0, $$1, $$2);
   }

   public cnn b() {
      return this.a;
   }
}
