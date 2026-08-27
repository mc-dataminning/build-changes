import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

class dqd extends dqi {
   private final il<cwq> e;
   public static final Codec<dqd> a = RecordCodecBuilder.create($$0 -> a($$0).and(iv.a(ke.f).fieldOf("blocks").forGetter($$0x -> $$0x.e)).apply($$0, dqd::new));

   public dqd(jb $$0, il<cwq> $$1) {
      super($$0);
      this.e = $$1;
   }

   @Override
   protected boolean a(djh $$0) {
      return $$0.a(this.e);
   }

   @Override
   public dpy<?> a() {
      return dpy.a;
   }
}
