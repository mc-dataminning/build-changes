import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

@Deprecated
public class eap extends eaq {
   public static final MapCodec<eap> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).apply($$0, eap::new));

   public eap(kh $$0) {
      super($$0);
   }

   @Override
   protected boolean a(dtc $$0) {
      return $$0.e();
   }

   @Override
   public eag<?> a() {
      return eag.e;
   }
}
