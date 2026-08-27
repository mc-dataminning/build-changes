import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

@Deprecated
public class dpp extends dpq {
   public static final Codec<dpp> a = RecordCodecBuilder.create($$0 -> a($$0).apply($$0, dpp::new));

   public dpp(iz $$0) {
      super($$0);
   }

   @Override
   protected boolean a(dip $$0) {
      return $$0.e();
   }

   @Override
   public dpg<?> a() {
      return dpg.e;
   }
}
