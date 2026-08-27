import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

@Deprecated
public class eal extends eam {
   public static final Codec<eal> a = RecordCodecBuilder.create($$0 -> a($$0).apply($$0, eal::new));

   public eal(jv $$0) {
      super($$0);
   }

   @Override
   protected boolean a(dtc $$0) {
      return $$0.e();
   }

   @Override
   public eac<?> a() {
      return eac.e;
   }
}
