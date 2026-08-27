import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dqw extends duq {
   public static final MapCodec<dqw> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.floatRange(0.0F, 1.0F).fieldOf("probability").forGetter($$0x -> $$0x.l),
               dxv.c.fieldOf("y").forGetter($$0x -> $$0x.e),
               bjf.c.fieldOf("yScale").forGetter($$0x -> $$0x.f),
               dps.a.fieldOf("lava_level").forGetter($$0x -> $$0x.g),
               dqx.b.optionalFieldOf("debug_settings", dqx.a).forGetter($$0x -> $$0x.h),
               iv.a(ke.f).fieldOf("replaceable").forGetter($$0x -> $$0x.i)
            )
            .apply($$0, dqw::new)
   );
   public final dxv e;
   public final bjf f;
   public final dps g;
   public final dqx h;
   public final il<cwy> i;

   public dqw(float $$0, dxv $$1, bjf $$2, dps $$3, dqx $$4, il<cwy> $$5) {
      super($$0);
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
      this.h = $$4;
      this.i = $$5;
   }
}
