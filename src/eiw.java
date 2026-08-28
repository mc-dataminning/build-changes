import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

@Deprecated
public class eiw extends eix {
   public static final MapCodec<eiw> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).apply($$0, eiw::new));

   public eiw(kb $$0) {
      super($$0);
   }

   @Override
   protected boolean a(ebg $$0) {
      return $$0.e();
   }

   @Override
   public ein<?> a() {
      return ein.e;
   }
}
