import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

@Deprecated
public class dqg extends dqh {
   public static final Codec<dqg> a = RecordCodecBuilder.create($$0 -> a($$0).apply($$0, dqg::new));

   public dqg(jb $$0) {
      super($$0);
   }

   @Override
   protected boolean a(djg $$0) {
      return $$0.e();
   }

   @Override
   public dpx<?> a() {
      return dpx.e;
   }
}
