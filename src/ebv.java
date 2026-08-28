import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ebv extends efq {
   public static final MapCodec<ebv> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.floatRange(0.0F, 1.0F).fieldOf("probability").forGetter($$0x -> $$0x.l),
               eiv.c.fieldOf("y").forGetter($$0x -> $$0x.e),
               bqn.c.fieldOf("yScale").forGetter($$0x -> $$0x.f),
               eaq.a.fieldOf("lava_level").forGetter($$0x -> $$0x.g),
               ebw.b.optionalFieldOf("debug_settings", ebw.a).forGetter($$0x -> $$0x.h),
               kc.a(lv.f).fieldOf("replaceable").forGetter($$0x -> $$0x.i)
            )
            .apply($$0, ebv::new)
   );
   public final eiv e;
   public final bqn f;
   public final eaq g;
   public final ebw h;
   public final jr<dgv> i;

   public ebv(float $$0, eiv $$1, bqn $$2, eaq $$3, ebw $$4, jr<dgv> $$5) {
      super($$0);
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
      this.h = $$4;
      this.i = $$5;
   }
}
