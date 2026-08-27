import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

@Deprecated
public class dnw extends dnx {
   public static final Codec<dnw> a = RecordCodecBuilder.create($$0 -> a($$0).apply($$0, dnw::new));

   public dnw(iw $$0) {
      super($$0);
   }

   @Override
   protected boolean a(dgw $$0) {
      return $$0.e();
   }

   @Override
   public dnn<?> a() {
      return dnn.e;
   }
}
