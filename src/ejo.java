import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ejo extends enl {
   public static final MapCodec<ejo> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.floatRange(0.0F, 1.0F).fieldOf("probability").forGetter($$0x -> $$0x.l),
               equ.c.fieldOf("y").forGetter($$0x -> $$0x.e),
               buf.c.fieldOf("yScale").forGetter($$0x -> $$0x.f),
               eij.a.fieldOf("lava_level").forGetter($$0x -> $$0x.g),
               ejp.b.optionalFieldOf("debug_settings", ejp.a).forGetter($$0x -> $$0x.h),
               jv.a(mi.i).fieldOf("replaceable").forGetter($$0x -> $$0x.i)
            )
            .apply($$0, ejo::new)
   );
   public final equ e;
   public final buf f;
   public final eij g;
   public final ejp h;
   public final jk<dno> i;

   public ejo(float $$0, equ $$1, buf $$2, eij $$3, ejp $$4, jk<dno> $$5) {
      super($$0);
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
      this.h = $$4;
      this.i = $$5;
   }
}
