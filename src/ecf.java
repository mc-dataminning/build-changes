import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

@Deprecated
public class ecf extends ecg {
   public static final MapCodec<ecf> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).apply($$0, ecf::new));

   public ecf(kj $$0) {
      super($$0);
   }

   @Override
   protected boolean a(dus $$0) {
      return $$0.e();
   }

   @Override
   public ebw<?> a() {
      return ebw.e;
   }
}
