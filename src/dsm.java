import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dsm extends dwg {
   public static final MapCodec<dsm> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.floatRange(0.0F, 1.0F).fieldOf("probability").forGetter($$0x -> $$0x.l),
               dzl.c.fieldOf("y").forGetter($$0x -> $$0x.e),
               bkx.c.fieldOf("yScale").forGetter($$0x -> $$0x.f),
               dri.a.fieldOf("lava_level").forGetter($$0x -> $$0x.g),
               dsn.b.optionalFieldOf("debug_settings", dsn.a).forGetter($$0x -> $$0x.h),
               ix.a(kg.f).fieldOf("replaceable").forGetter($$0x -> $$0x.i)
            )
            .apply($$0, dsm::new)
   );
   public final dzl e;
   public final bkx f;
   public final dri g;
   public final dsn h;
   public final in<cyo> i;

   public dsm(float $$0, dzl $$1, bkx $$2, dri $$3, dsn $$4, in<cyo> $$5) {
      super($$0);
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
      this.h = $$4;
      this.i = $$5;
   }
}
