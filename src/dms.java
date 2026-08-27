import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dms extends dqm {
   public static final MapCodec<dms> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.floatRange(0.0F, 1.0F).fieldOf("probability").forGetter($$0x -> $$0x.l),
               dtr.c.fieldOf("y").forGetter($$0x -> $$0x.e),
               bgd.c.fieldOf("yScale").forGetter($$0x -> $$0x.f),
               dlo.a.fieldOf("lava_level").forGetter($$0x -> $$0x.g),
               dmt.b.optionalFieldOf("debug_settings", dmt.a).forGetter($$0x -> $$0x.h),
               hv.a(je.e).fieldOf("replaceable").forGetter($$0x -> $$0x.i)
            )
            .apply($$0, dms::new)
   );
   public final dtr e;
   public final bgd f;
   public final dlo g;
   public final dmt h;
   public final hk<csx> i;

   public dms(float $$0, dtr $$1, bgd $$2, dlo $$3, dmt $$4, hk<csx> $$5) {
      super($$0);
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
      this.h = $$4;
      this.i = $$5;
   }
}
