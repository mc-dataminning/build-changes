import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

@Deprecated
public class eez extends efa {
   public static final MapCodec<eez> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).apply($$0, eez::new));

   public eez(kl $$0) {
      super($$0);
   }

   @Override
   protected boolean a(dxn $$0) {
      return $$0.e();
   }

   @Override
   public eeq<?> a() {
      return eeq.e;
   }
}
