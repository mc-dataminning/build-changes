import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dqh extends dub {
   public static final MapCodec<dqh> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.floatRange(0.0F, 1.0F).fieldOf("probability").forGetter($$0x -> $$0x.l),
               dxg.c.fieldOf("y").forGetter($$0x -> $$0x.e),
               biy.c.fieldOf("yScale").forGetter($$0x -> $$0x.f),
               dpd.a.fieldOf("lava_level").forGetter($$0x -> $$0x.g),
               dqi.b.optionalFieldOf("debug_settings", dqi.a).forGetter($$0x -> $$0x.h),
               iv.a(ke.f).fieldOf("replaceable").forGetter($$0x -> $$0x.i)
            )
            .apply($$0, dqh::new)
   );
   public final dxg e;
   public final biy f;
   public final dpd g;
   public final dqi h;
   public final il<cwj> i;

   public dqh(float $$0, dxg $$1, biy $$2, dpd $$3, dqi $$4, il<cwj> $$5) {
      super($$0);
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
      this.h = $$4;
      this.i = $$5;
   }
}
