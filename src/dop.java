import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dop extends dsj {
   public static final MapCodec<dop> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.floatRange(0.0F, 1.0F).fieldOf("probability").forGetter($$0x -> $$0x.l),
               dvo.c.fieldOf("y").forGetter($$0x -> $$0x.e),
               bia.c.fieldOf("yScale").forGetter($$0x -> $$0x.f),
               dnl.a.fieldOf("lava_level").forGetter($$0x -> $$0x.g),
               doq.b.optionalFieldOf("debug_settings", doq.a).forGetter($$0x -> $$0x.h),
               iq.a(jz.e).fieldOf("replaceable").forGetter($$0x -> $$0x.i)
            )
            .apply($$0, dop::new)
   );
   public final dvo e;
   public final bia f;
   public final dnl g;
   public final doq h;
   public final ig<cva> i;

   public dop(float $$0, dvo $$1, bia $$2, dnl $$3, doq $$4, ig<cva> $$5) {
      super($$0);
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
      this.h = $$4;
      this.i = $$5;
   }
}
