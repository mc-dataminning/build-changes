import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

@Deprecated
public class dsm extends dsn {
   public static final Codec<dsm> a = RecordCodecBuilder.create($$0 -> a($$0).apply($$0, dsm::new));

   public dsm(jd $$0) {
      super($$0);
   }

   @Override
   protected boolean a(dlj $$0) {
      return $$0.e();
   }

   @Override
   public dsd<?> a() {
      return dsd.e;
   }
}
