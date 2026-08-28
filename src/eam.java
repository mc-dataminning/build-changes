import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

@Deprecated
public class eam extends ean {
   public static final MapCodec<eam> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).apply($$0, eam::new));

   public eam(kh $$0) {
      super($$0);
   }

   @Override
   protected boolean a(dta $$0) {
      return $$0.e();
   }

   @Override
   public ead<?> a() {
      return ead.e;
   }
}
