import com.mojang.serialization.MapCodec;

public class dix extends dfh {
   public static final MapCodec<dix> d = b(dix::new);

   @Override
   protected MapCodec<? extends dix> a() {
      return d;
   }

   protected dix(dsj.d $$0) {
      super($$0);
   }

   @Override
   protected boolean a(dsk $$0, dsk $$1, jf $$2) {
      return $$1.a(this) ? true : super.a($$0, $$1, $$2);
   }
}
