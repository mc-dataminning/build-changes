import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dod extends drx {
   public static final MapCodec<dod> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.floatRange(0.0F, 1.0F).fieldOf("probability").forGetter($$0x -> $$0x.l),
               dvc.c.fieldOf("y").forGetter($$0x -> $$0x.e),
               bht.c.fieldOf("yScale").forGetter($$0x -> $$0x.f),
               dmz.a.fieldOf("lava_level").forGetter($$0x -> $$0x.g),
               doe.b.optionalFieldOf("debug_settings", doe.a).forGetter($$0x -> $$0x.h),
               iq.a(jz.e).fieldOf("replaceable").forGetter($$0x -> $$0x.i)
            )
            .apply($$0, dod::new)
   );
   public final dvc e;
   public final bht f;
   public final dmz g;
   public final doe h;
   public final ig<cut> i;

   public dod(float $$0, dvc $$1, bht $$2, dmz $$3, doe $$4, ig<cut> $$5) {
      super($$0);
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
      this.h = $$4;
      this.i = $$5;
   }
}
