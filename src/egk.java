import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class egk extends egi {
   public static final MapCodec<egk> b = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  Codec.floatRange(-1.0F, 1.0F).fieldOf("threshold").forGetter($$0x -> $$0x.g),
                  Codec.floatRange(0.0F, 1.0F).fieldOf("high_chance").forGetter($$0x -> $$0x.h),
                  dta.b.fieldOf("default_state").forGetter($$0x -> $$0x.i),
                  Codec.list(dta.b).fieldOf("low_states").forGetter($$0x -> $$0x.j),
                  Codec.list(dta.b).fieldOf("high_states").forGetter($$0x -> $$0x.k)
               )
            )
            .apply($$0, egk::new)
   );
   private final float g;
   private final float h;
   private final dta i;
   private final List<dta> j;
   private final List<dta> k;

   public egk(long $$0, eob.a $$1, float $$2, float $$3, float $$4, dta $$5, List<dta> $$6, List<dta> $$7) {
      super($$0, $$1, $$2);
      this.g = $$3;
      this.h = $$4;
      this.i = $$5;
      this.j = $$6;
      this.k = $$7;
   }

   @Override
   protected egg<?> a() {
      return egg.c;
   }

   @Override
   public dta a(ayv $$0, jd $$1) {
      double $$2 = this.a($$1, (double)this.e);
      if ($$2 < (double)this.g) {
         return ad.a(this.j, $$0);
      } else {
         return $$0.i() < this.h ? ad.a(this.k, $$0) : this.i;
      }
   }
}
