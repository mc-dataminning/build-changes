import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eep extends eik {
   public static final MapCodec<eep> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.floatRange(0.0F, 1.0F).fieldOf("probability").forGetter($$0x -> $$0x.l),
               elr.c.fieldOf("y").forGetter($$0x -> $$0x.e),
               brl.c.fieldOf("yScale").forGetter($$0x -> $$0x.f),
               edk.a.fieldOf("lava_level").forGetter($$0x -> $$0x.g),
               eeq.b.optionalFieldOf("debug_settings", eeq.a).forGetter($$0x -> $$0x.h),
               kg.a(mc.f).fieldOf("replaceable").forGetter($$0x -> $$0x.i)
            )
            .apply($$0, eep::new)
   );
   public final elr e;
   public final brl f;
   public final edk g;
   public final eeq h;
   public final jv<djk> i;

   public eep(float $$0, elr $$1, brl $$2, edk $$3, eeq $$4, jv<djk> $$5) {
      super($$0);
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
      this.h = $$4;
      this.i = $$5;
   }
}
