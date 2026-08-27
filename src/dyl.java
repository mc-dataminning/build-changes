import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

class dyl extends dyn {
   public static final MapCodec<dyl> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).apply($$0, dyl::new));

   public dyl(js $$0) {
      super($$0);
   }

   @Override
   protected boolean a(drd $$0) {
      return $$0.r();
   }

   @Override
   public dyd<?> a() {
      return dyd.f;
   }
}
