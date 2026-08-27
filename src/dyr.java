import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dyr extends ecl {
   public static final MapCodec<dyr> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.floatRange(0.0F, 1.0F).fieldOf("probability").forGetter($$0x -> $$0x.l),
               efq.c.fieldOf("y").forGetter($$0x -> $$0x.e),
               box.c.fieldOf("yScale").forGetter($$0x -> $$0x.f),
               dxn.a.fieldOf("lava_level").forGetter($$0x -> $$0x.g),
               dys.b.optionalFieldOf("debug_settings", dys.a).forGetter($$0x -> $$0x.h),
               jm.a(lf.f).fieldOf("replaceable").forGetter($$0x -> $$0x.i)
            )
            .apply($$0, dyr::new)
   );
   public final efq e;
   public final box f;
   public final dxn g;
   public final dys h;
   public final jb<ddy> i;

   public dyr(float $$0, efq $$1, box $$2, dxn $$3, dys $$4, jb<ddy> $$5) {
      super($$0);
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
      this.h = $$4;
      this.i = $$5;
   }
}
