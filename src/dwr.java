import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

@Deprecated
public class dwr extends dws {
   public static final Codec<dwr> a = RecordCodecBuilder.create($$0 -> a($$0).apply($$0, dwr::new));

   public dwr(ji $$0) {
      super($$0);
   }

   @Override
   protected boolean a(dpi $$0) {
      return $$0.e();
   }

   @Override
   public dwi<?> a() {
      return dwi.e;
   }
}
