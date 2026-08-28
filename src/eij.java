import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

@Deprecated
public class eij extends eik {
   public static final MapCodec<eij> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).apply($$0, eij::new));

   public eij(ka $$0) {
      super($$0);
   }

   @Override
   protected boolean a(eat $$0) {
      return $$0.e();
   }

   @Override
   public eia<?> a() {
      return eia.e;
   }
}
