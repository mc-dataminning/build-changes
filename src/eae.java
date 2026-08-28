import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eae extends edy {
   public static final MapCodec<eae> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.floatRange(0.0F, 1.0F).fieldOf("probability").forGetter($$0x -> $$0x.l),
               ehd.c.fieldOf("y").forGetter($$0x -> $$0x.e),
               bpj.c.fieldOf("yScale").forGetter($$0x -> $$0x.f),
               dyz.a.fieldOf("lava_level").forGetter($$0x -> $$0x.g),
               eaf.b.optionalFieldOf("debug_settings", eaf.a).forGetter($$0x -> $$0x.h),
               jy.a(lr.f).fieldOf("replaceable").forGetter($$0x -> $$0x.i)
            )
            .apply($$0, eae::new)
   );
   public final ehd e;
   public final bpj f;
   public final dyz g;
   public final eaf h;
   public final jn<dfh> i;

   public eae(float $$0, ehd $$1, bpj $$2, dyz $$3, eaf $$4, jn<dfh> $$5) {
      super($$0);
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
      this.h = $$4;
      this.i = $$5;
   }
}
