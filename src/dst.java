import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dst extends dwn {
   public static final MapCodec<dst> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.floatRange(0.0F, 1.0F).fieldOf("probability").forGetter($$0x -> $$0x.l),
               dzs.c.fieldOf("y").forGetter($$0x -> $$0x.e),
               bkz.c.fieldOf("yScale").forGetter($$0x -> $$0x.f),
               drp.a.fieldOf("lava_level").forGetter($$0x -> $$0x.g),
               dsu.b.optionalFieldOf("debug_settings", dsu.a).forGetter($$0x -> $$0x.h),
               ix.a(kg.f).fieldOf("replaceable").forGetter($$0x -> $$0x.i)
            )
            .apply($$0, dst::new)
   );
   public final dzs e;
   public final bkz f;
   public final drp g;
   public final dsu h;
   public final in<cys> i;

   public dst(float $$0, dzs $$1, bkz $$2, drp $$3, dsu $$4, in<cys> $$5) {
      super($$0);
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
      this.h = $$4;
      this.i = $$5;
   }
}
