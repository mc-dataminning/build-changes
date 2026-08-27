import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

@Deprecated
public class duf extends dug {
   public static final Codec<duf> a = RecordCodecBuilder.create($$0 -> a($$0).apply($$0, duf::new));

   public duf(jg $$0) {
      super($$0);
   }

   @Override
   protected boolean a(dnb $$0) {
      return $$0.e();
   }

   @Override
   public dtw<?> a() {
      return dtw.e;
   }
}
