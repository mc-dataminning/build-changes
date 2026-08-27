import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dwy extends eas {
   public static final MapCodec<dwy> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.floatRange(0.0F, 1.0F).fieldOf("probability").forGetter($$0x -> $$0x.l),
               edx.c.fieldOf("y").forGetter($$0x -> $$0x.e),
               bni.c.fieldOf("yScale").forGetter($$0x -> $$0x.f),
               dvu.a.fieldOf("lava_level").forGetter($$0x -> $$0x.g),
               dwz.b.optionalFieldOf("debug_settings", dwz.a).forGetter($$0x -> $$0x.h),
               jc.a(ku.f).fieldOf("replaceable").forGetter($$0x -> $$0x.i)
            )
            .apply($$0, dwy::new)
   );
   public final edx e;
   public final bni f;
   public final dvu g;
   public final dwz h;
   public final ir<dch> i;

   public dwy(float $$0, edx $$1, bni $$2, dvu $$3, dwz $$4, ir<dch> $$5) {
      super($$0);
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
      this.h = $$4;
      this.i = $$5;
   }
}
