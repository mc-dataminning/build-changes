import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

@Deprecated
public class dqa extends dqb {
   public static final Codec<dqa> a = RecordCodecBuilder.create($$0 -> a($$0).apply($$0, dqa::new));

   public dqa(jb $$0) {
      super($$0);
   }

   @Override
   protected boolean a(dja $$0) {
      return $$0.e();
   }

   @Override
   public dpr<?> a() {
      return dpr.e;
   }
}
