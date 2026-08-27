import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

@Deprecated
public class dym extends dyn {
   public static final MapCodec<dym> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).apply($$0, dym::new));

   public dym(js $$0) {
      super($$0);
   }

   @Override
   protected boolean a(drd $$0) {
      return $$0.e();
   }

   @Override
   public dyd<?> a() {
      return dyd.e;
   }
}
