import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

@Deprecated
public class dqp extends dqq {
   public static final Codec<dqp> a = RecordCodecBuilder.create($$0 -> a($$0).apply($$0, dqp::new));

   public dqp(jb $$0) {
      super($$0);
   }

   @Override
   protected boolean a(djp $$0) {
      return $$0.e();
   }

   @Override
   public dqg<?> a() {
      return dqg.e;
   }
}
