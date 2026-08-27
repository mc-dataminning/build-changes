import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dqo extends dui {
   public static final MapCodec<dqo> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.floatRange(0.0F, 1.0F).fieldOf("probability").forGetter($$0x -> $$0x.l),
               dxn.c.fieldOf("y").forGetter($$0x -> $$0x.e),
               bje.c.fieldOf("yScale").forGetter($$0x -> $$0x.f),
               dpk.a.fieldOf("lava_level").forGetter($$0x -> $$0x.g),
               dqp.b.optionalFieldOf("debug_settings", dqp.a).forGetter($$0x -> $$0x.h),
               iv.a(ke.f).fieldOf("replaceable").forGetter($$0x -> $$0x.i)
            )
            .apply($$0, dqo::new)
   );
   public final dxn e;
   public final bje f;
   public final dpk g;
   public final dqp h;
   public final il<cwq> i;

   public dqo(float $$0, dxn $$1, bje $$2, dpk $$3, dqp $$4, il<cwq> $$5) {
      super($$0);
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
      this.h = $$4;
      this.i = $$5;
   }
}
