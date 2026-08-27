import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

class dqe extends dqi {
   private final il<eeq> e;
   public static final Codec<dqe> a = RecordCodecBuilder.create($$0 -> a($$0).and(iv.a(ke.y).fieldOf("fluids").forGetter($$0x -> $$0x.e)).apply($$0, dqe::new));

   public dqe(jb $$0, il<eeq> $$1) {
      super($$0);
      this.e = $$1;
   }

   @Override
   protected boolean a(djh $$0) {
      return $$0.u().a(this.e);
   }

   @Override
   public dpy<?> a() {
      return dpy.c;
   }
}
