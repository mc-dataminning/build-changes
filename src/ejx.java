import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ejx extends eka {
   public static final Codec<ejx> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(lc.e.q().fieldOf("block").forGetter($$0x -> $$0x.b), Codec.FLOAT.fieldOf("probability").forGetter($$0x -> $$0x.d)).apply($$0, ejx::new)
   );
   private final dcv b;
   private final float d;

   public ejx(dcv $$0, float $$1) {
      this.b = $$0;
      this.d = $$1;
   }

   @Override
   public boolean a(dpy $$0, ayd $$1) {
      return $$0.a(this.b) && $$1.i() < this.d;
   }

   @Override
   protected ekb<?> a() {
      return ekb.e;
   }
}
