import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

@Deprecated
public class eiu extends eiv {
   public static final MapCodec<eiu> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).apply($$0, eiu::new));

   public eiu(ka $$0) {
      super($$0);
   }

   @Override
   protected boolean a(ebe $$0) {
      return $$0.e();
   }

   @Override
   public eil<?> a() {
      return eil.e;
   }
}
