import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dji extends dnc {
   public static final MapCodec<dji> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.floatRange(0.0F, 1.0F).fieldOf("probability").forGetter($$0x -> $$0x.l),
               dqh.c.fieldOf("y").forGetter($$0x -> $$0x.e),
               bda.c.fieldOf("yScale").forGetter($$0x -> $$0x.f),
               die.a.fieldOf("lava_level").forGetter($$0x -> $$0x.g),
               djj.b.optionalFieldOf("debug_settings", djj.a).forGetter($$0x -> $$0x.h),
               ht.a(jc.e).fieldOf("replaceable").forGetter($$0x -> $$0x.i)
            )
            .apply($$0, dji::new)
   );
   public final dqh e;
   public final bda f;
   public final die g;
   public final djj h;
   public final hi<cpn> i;

   public dji(float $$0, dqh $$1, bda $$2, die $$3, djj $$4, hi<cpn> $$5) {
      super($$0);
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
      this.h = $$4;
      this.i = $$5;
   }
}
