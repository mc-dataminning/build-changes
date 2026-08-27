import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dmg extends dqa {
   public static final MapCodec<dmg> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.floatRange(0.0F, 1.0F).fieldOf("probability").forGetter($$0x -> $$0x.l),
               dtf.c.fieldOf("y").forGetter($$0x -> $$0x.e),
               bft.c.fieldOf("yScale").forGetter($$0x -> $$0x.f),
               dlc.a.fieldOf("lava_level").forGetter($$0x -> $$0x.g),
               dmh.b.optionalFieldOf("debug_settings", dmh.a).forGetter($$0x -> $$0x.h),
               ht.a(jc.e).fieldOf("replaceable").forGetter($$0x -> $$0x.i)
            )
            .apply($$0, dmg::new)
   );
   public final dtf e;
   public final bft f;
   public final dlc g;
   public final dmh h;
   public final hi<csl> i;

   public dmg(float $$0, dtf $$1, bft $$2, dlc $$3, dmh $$4, hi<csl> $$5) {
      super($$0);
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
      this.h = $$4;
      this.i = $$5;
   }
}
