import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dzy extends eds {
   public static final MapCodec<dzy> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.floatRange(0.0F, 1.0F).fieldOf("probability").forGetter($$0x -> $$0x.l),
               egx.c.fieldOf("y").forGetter($$0x -> $$0x.e),
               bpg.c.fieldOf("yScale").forGetter($$0x -> $$0x.f),
               dyt.a.fieldOf("lava_level").forGetter($$0x -> $$0x.g),
               dzz.b.optionalFieldOf("debug_settings", dzz.a).forGetter($$0x -> $$0x.h),
               jy.a(lr.f).fieldOf("replaceable").forGetter($$0x -> $$0x.i)
            )
            .apply($$0, dzy::new)
   );
   public final egx e;
   public final bpg f;
   public final dyt g;
   public final dzz h;
   public final jn<dff> i;

   public dzy(float $$0, egx $$1, bpg $$2, dyt $$3, dzz $$4, jn<dff> $$5) {
      super($$0);
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
      this.h = $$4;
      this.i = $$5;
   }
}
