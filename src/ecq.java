import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

@Deprecated
public class ecq extends ecr {
   public static final MapCodec<ecq> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).apply($$0, ecq::new));

   public ecq(kk $$0) {
      super($$0);
   }

   @Override
   protected boolean a(dvd $$0) {
      return $$0.e();
   }

   @Override
   public ech<?> a() {
      return ech.e;
   }
}
