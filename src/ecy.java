import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ecy extends egt {
   public static final MapCodec<ecy> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.floatRange(0.0F, 1.0F).fieldOf("probability").forGetter($$0x -> $$0x.l),
               ejy.c.fieldOf("y").forGetter($$0x -> $$0x.e),
               brb.c.fieldOf("yScale").forGetter($$0x -> $$0x.f),
               ebt.a.fieldOf("lava_level").forGetter($$0x -> $$0x.g),
               ecz.b.optionalFieldOf("debug_settings", ecz.a).forGetter($$0x -> $$0x.h),
               ke.a(ly.f).fieldOf("replaceable").forGetter($$0x -> $$0x.i)
            )
            .apply($$0, ecy::new)
   );
   public final ejy e;
   public final brb f;
   public final ebt g;
   public final ecz h;
   public final jt<dhy> i;

   public ecy(float $$0, ejy $$1, brb $$2, ebt $$3, ecz $$4, jt<dhy> $$5) {
      super($$0);
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
      this.h = $$4;
      this.i = $$5;
   }
}
