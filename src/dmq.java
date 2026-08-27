import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dmq extends dqk {
   public static final MapCodec<dmq> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.floatRange(0.0F, 1.0F).fieldOf("probability").forGetter($$0x -> $$0x.l),
               dtp.c.fieldOf("y").forGetter($$0x -> $$0x.e),
               bgb.c.fieldOf("yScale").forGetter($$0x -> $$0x.f),
               dlm.a.fieldOf("lava_level").forGetter($$0x -> $$0x.g),
               dmr.b.optionalFieldOf("debug_settings", dmr.a).forGetter($$0x -> $$0x.h),
               hv.a(je.e).fieldOf("replaceable").forGetter($$0x -> $$0x.i)
            )
            .apply($$0, dmq::new)
   );
   public final dtp e;
   public final bgb f;
   public final dlm g;
   public final dmr h;
   public final hk<csv> i;

   public dmq(float $$0, dtp $$1, bgb $$2, dlm $$3, dmr $$4, hk<csv> $$5) {
      super($$0);
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
      this.h = $$4;
      this.i = $$5;
   }
}
