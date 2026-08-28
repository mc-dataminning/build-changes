import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class ehm extends ehk {
   public static final MapCodec<ehm> b = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  Codec.floatRange(-1.0F, 1.0F).fieldOf("threshold").forGetter($$0x -> $$0x.g),
                  Codec.floatRange(0.0F, 1.0F).fieldOf("high_chance").forGetter($$0x -> $$0x.h),
                  dua.a.fieldOf("default_state").forGetter($$0x -> $$0x.i),
                  Codec.list(dua.a).fieldOf("low_states").forGetter($$0x -> $$0x.j),
                  Codec.list(dua.a).fieldOf("high_states").forGetter($$0x -> $$0x.k)
               )
            )
            .apply($$0, ehm::new)
   );
   private final float g;
   private final float h;
   private final dua i;
   private final List<dua> j;
   private final List<dua> k;

   public ehm(long $$0, epe.a $$1, float $$2, float $$3, float $$4, dua $$5, List<dua> $$6, List<dua> $$7) {
      super($$0, $$1, $$2);
      this.g = $$3;
      this.h = $$4;
      this.i = $$5;
      this.j = $$6;
      this.k = $$7;
   }

   @Override
   protected ehi<?> a() {
      return ehi.c;
   }

   @Override
   public dua a(azk $$0, je $$1) {
      double $$2 = this.a($$1, (double)this.e);
      if ($$2 < (double)this.g) {
         return ad.a(this.j, $$0);
      } else {
         return $$0.i() < this.h ? ad.a(this.k, $$0) : this.i;
      }
   }
}
