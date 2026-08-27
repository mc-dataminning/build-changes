import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

@Deprecated
public class dqh extends dqi {
   public static final Codec<dqh> a = RecordCodecBuilder.create($$0 -> a($$0).apply($$0, dqh::new));

   public dqh(jb $$0) {
      super($$0);
   }

   @Override
   protected boolean a(djh $$0) {
      return $$0.e();
   }

   @Override
   public dpy<?> a() {
      return dpy.e;
   }
}
