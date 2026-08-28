import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

@Deprecated
public class dzk extends dzl {
   public static final MapCodec<dzk> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).apply($$0, dzk::new));

   public dzk(kd $$0) {
      super($$0);
   }

   @Override
   protected boolean a(dsb $$0) {
      return $$0.e();
   }

   @Override
   public dzb<?> a() {
      return dzb.e;
   }
}
