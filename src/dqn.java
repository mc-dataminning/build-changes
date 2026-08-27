import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dqn extends duh {
   public static final MapCodec<dqn> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.floatRange(0.0F, 1.0F).fieldOf("probability").forGetter($$0x -> $$0x.l),
               dxm.c.fieldOf("y").forGetter($$0x -> $$0x.e),
               bjd.c.fieldOf("yScale").forGetter($$0x -> $$0x.f),
               dpj.a.fieldOf("lava_level").forGetter($$0x -> $$0x.g),
               dqo.b.optionalFieldOf("debug_settings", dqo.a).forGetter($$0x -> $$0x.h),
               iv.a(ke.f).fieldOf("replaceable").forGetter($$0x -> $$0x.i)
            )
            .apply($$0, dqn::new)
   );
   public final dxm e;
   public final bjd f;
   public final dpj g;
   public final dqo h;
   public final il<cwp> i;

   public dqn(float $$0, dxm $$1, bjd $$2, dpj $$3, dqo $$4, il<cwp> $$5) {
      super($$0);
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
      this.h = $$4;
      this.i = $$5;
   }
}
