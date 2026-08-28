import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

@Deprecated
public class dzw extends dzx {
   public static final MapCodec<dzw> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).apply($$0, dzw::new));

   public dzw(ke $$0) {
      super($$0);
   }

   @Override
   protected boolean a(dsk $$0) {
      return $$0.e();
   }

   @Override
   public dzn<?> a() {
      return dzn.e;
   }
}
