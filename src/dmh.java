import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dmh extends dqb {
   public static final MapCodec<dmh> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.floatRange(0.0F, 1.0F).fieldOf("probability").forGetter($$0x -> $$0x.l),
               dtg.c.fieldOf("y").forGetter($$0x -> $$0x.e),
               bft.c.fieldOf("yScale").forGetter($$0x -> $$0x.f),
               dld.a.fieldOf("lava_level").forGetter($$0x -> $$0x.g),
               dmi.b.optionalFieldOf("debug_settings", dmi.a).forGetter($$0x -> $$0x.h),
               ht.a(jc.e).fieldOf("replaceable").forGetter($$0x -> $$0x.i)
            )
            .apply($$0, dmh::new)
   );
   public final dtg e;
   public final bft f;
   public final dld g;
   public final dmi h;
   public final hi<csm> i;

   public dmh(float $$0, dtg $$1, bft $$2, dld $$3, dmi $$4, hi<csm> $$5) {
      super($$0);
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
      this.h = $$4;
      this.i = $$5;
   }
}
