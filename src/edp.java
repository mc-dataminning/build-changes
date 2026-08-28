import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class edp extends ehk {
   public static final MapCodec<edp> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.floatRange(0.0F, 1.0F).fieldOf("probability").forGetter($$0x -> $$0x.l),
               ekp.c.fieldOf("y").forGetter($$0x -> $$0x.e),
               brn.c.fieldOf("yScale").forGetter($$0x -> $$0x.f),
               eck.a.fieldOf("lava_level").forGetter($$0x -> $$0x.g),
               edq.b.optionalFieldOf("debug_settings", edq.a).forGetter($$0x -> $$0x.h),
               kf.a(ma.f).fieldOf("replaceable").forGetter($$0x -> $$0x.i)
            )
            .apply($$0, edp::new)
   );
   public final ekp e;
   public final brn f;
   public final eck g;
   public final edq h;
   public final ju<diq> i;

   public edp(float $$0, ekp $$1, brn $$2, eck $$3, edq $$4, ju<diq> $$5) {
      super($$0);
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
      this.h = $$4;
      this.i = $$5;
   }
}
