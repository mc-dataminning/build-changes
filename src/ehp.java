import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

@Deprecated
public class ehp extends ehq {
   public static final MapCodec<ehp> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).apply($$0, ehp::new));

   public ehp(jz $$0) {
      super($$0);
   }

   @Override
   protected boolean a(dzz $$0) {
      return $$0.e();
   }

   @Override
   public ehg<?> a() {
      return ehg.e;
   }
}
