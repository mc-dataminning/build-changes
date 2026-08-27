import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

@Deprecated
public class dth extends dti {
   public static final Codec<dth> a = RecordCodecBuilder.create($$0 -> a($$0).apply($$0, dth::new));

   public dth(jf $$0) {
      super($$0);
   }

   @Override
   protected boolean a(dme $$0) {
      return $$0.e();
   }

   @Override
   public dsy<?> a() {
      return dsy.e;
   }
}
