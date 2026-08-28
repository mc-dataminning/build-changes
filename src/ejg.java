import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

@Deprecated
public class ejg extends ejh {
   public static final MapCodec<ejg> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).apply($$0, ejg::new));

   public ejg(kb $$0) {
      super($$0);
   }

   @Override
   protected boolean a(ebq $$0) {
      return $$0.e();
   }

   @Override
   public eix<?> a() {
      return eix.e;
   }
}
