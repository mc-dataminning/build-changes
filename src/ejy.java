import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ejy extends eka {
   public static final Codec<ejy> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dpy.b.fieldOf("block_state").forGetter($$0x -> $$0x.b), Codec.FLOAT.fieldOf("probability").forGetter($$0x -> $$0x.d))
            .apply($$0, ejy::new)
   );
   private final dpy b;
   private final float d;

   public ejy(dpy $$0, float $$1) {
      this.b = $$0;
      this.d = $$1;
   }

   @Override
   public boolean a(dpy $$0, ayd $$1) {
      return $$0 == this.b && $$1.i() < this.d;
   }

   @Override
   protected ekb<?> a() {
      return ekb.f;
   }
}
