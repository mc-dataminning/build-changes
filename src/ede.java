import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ede extends egz {
   public static final MapCodec<ede> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.floatRange(0.0F, 1.0F).fieldOf("probability").forGetter($$0x -> $$0x.l),
               eke.c.fieldOf("y").forGetter($$0x -> $$0x.e),
               brg.c.fieldOf("yScale").forGetter($$0x -> $$0x.f),
               ebz.a.fieldOf("lava_level").forGetter($$0x -> $$0x.g),
               edf.b.optionalFieldOf("debug_settings", edf.a).forGetter($$0x -> $$0x.h),
               kf.a(lz.f).fieldOf("replaceable").forGetter($$0x -> $$0x.i)
            )
            .apply($$0, ede::new)
   );
   public final eke e;
   public final brg f;
   public final ebz g;
   public final edf h;
   public final ju<die> i;

   public ede(float $$0, eke $$1, brg $$2, ebz $$3, edf $$4, ju<die> $$5) {
      super($$0);
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
      this.h = $$4;
      this.i = $$5;
   }
}
