import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ejc extends emz {
   public static final MapCodec<ejc> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.floatRange(0.0F, 1.0F).fieldOf("probability").forGetter($$0x -> $$0x.l),
               eqi.c.fieldOf("y").forGetter($$0x -> $$0x.e),
               btu.c.fieldOf("yScale").forGetter($$0x -> $$0x.f),
               ehx.a.fieldOf("lava_level").forGetter($$0x -> $$0x.g),
               ejd.b.optionalFieldOf("debug_settings", ejd.a).forGetter($$0x -> $$0x.h),
               ju.a(mh.i).fieldOf("replaceable").forGetter($$0x -> $$0x.i)
            )
            .apply($$0, ejc::new)
   );
   public final eqi e;
   public final btu f;
   public final ehx g;
   public final ejd h;
   public final jj<dnc> i;

   public ejc(float $$0, eqi $$1, btu $$2, ehx $$3, ejd $$4, jj<dnc> $$5) {
      super($$0);
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
      this.h = $$4;
      this.i = $$5;
   }
}
