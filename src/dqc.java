import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dqc extends dqi {
   final asw<cwq> a;
   public static final Codec<dqc> e = RecordCodecBuilder.create($$0 -> a($$0).and(asw.a(ke.f).fieldOf("tag").forGetter($$0x -> $$0x.a)).apply($$0, dqc::new));

   protected dqc(jb $$0, asw<cwq> $$1) {
      super($$0);
      this.a = $$1;
   }

   @Override
   protected boolean a(djh $$0) {
      return $$0.a(this.a);
   }

   @Override
   public dpy<?> a() {
      return dpy.b;
   }
}
