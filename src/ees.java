import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ees extends ein {
   public static final MapCodec<ees> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.floatRange(0.0F, 1.0F).fieldOf("probability").forGetter($$0x -> $$0x.l),
               elu.c.fieldOf("y").forGetter($$0x -> $$0x.e),
               bro.c.fieldOf("yScale").forGetter($$0x -> $$0x.f),
               edn.a.fieldOf("lava_level").forGetter($$0x -> $$0x.g),
               eet.b.optionalFieldOf("debug_settings", eet.a).forGetter($$0x -> $$0x.h),
               kg.a(mc.f).fieldOf("replaceable").forGetter($$0x -> $$0x.i)
            )
            .apply($$0, ees::new)
   );
   public final elu e;
   public final bro f;
   public final edn g;
   public final eet h;
   public final jv<djn> i;

   public ees(float $$0, elu $$1, bro $$2, edn $$3, eet $$4, jv<djn> $$5) {
      super($$0);
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
      this.h = $$4;
      this.i = $$5;
   }
}
