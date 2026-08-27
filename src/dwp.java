import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dwp extends eaj {
   public static final MapCodec<dwp> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.floatRange(0.0F, 1.0F).fieldOf("probability").forGetter($$0x -> $$0x.l),
               edo.c.fieldOf("y").forGetter($$0x -> $$0x.e),
               bnd.c.fieldOf("yScale").forGetter($$0x -> $$0x.f),
               dvl.a.fieldOf("lava_level").forGetter($$0x -> $$0x.g),
               dwq.b.optionalFieldOf("debug_settings", dwq.a).forGetter($$0x -> $$0x.h),
               ja.a(ks.f).fieldOf("replaceable").forGetter($$0x -> $$0x.i)
            )
            .apply($$0, dwp::new)
   );
   public final edo e;
   public final bnd f;
   public final dvl g;
   public final dwq h;
   public final ip<dby> i;

   public dwp(float $$0, edo $$1, bnd $$2, dvl $$3, dwq $$4, ip<dby> $$5) {
      super($$0);
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
      this.h = $$4;
      this.i = $$5;
   }
}
