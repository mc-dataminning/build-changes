import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

class dqg extends dqi {
   public static final Codec<dqg> a = RecordCodecBuilder.create($$0 -> a($$0).apply($$0, dqg::new));

   public dqg(jb $$0) {
      super($$0);
   }

   @Override
   protected boolean a(djh $$0) {
      return $$0.r();
   }

   @Override
   public dpy<?> a() {
      return dpy.f;
   }
}
