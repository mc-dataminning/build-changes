import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class eia extends ehy {
   public static final MapCodec<eia> b = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  Codec.floatRange(-1.0F, 1.0F).fieldOf("threshold").forGetter($$0x -> $$0x.g),
                  Codec.floatRange(0.0F, 1.0F).fieldOf("high_chance").forGetter($$0x -> $$0x.h),
                  duo.a.fieldOf("default_state").forGetter($$0x -> $$0x.i),
                  Codec.list(duo.a).fieldOf("low_states").forGetter($$0x -> $$0x.j),
                  Codec.list(duo.a).fieldOf("high_states").forGetter($$0x -> $$0x.k)
               )
            )
            .apply($$0, eia::new)
   );
   private final float g;
   private final float h;
   private final duo i;
   private final List<duo> j;
   private final List<duo> k;

   public eia(long $$0, eps.a $$1, float $$2, float $$3, float $$4, duo $$5, List<duo> $$6, List<duo> $$7) {
      super($$0, $$1, $$2);
      this.g = $$3;
      this.h = $$4;
      this.i = $$5;
      this.j = $$6;
      this.k = $$7;
   }

   @Override
   protected ehw<?> a() {
      return ehw.c;
   }

   @Override
   public duo a(azl $$0, je $$1) {
      double $$2 = this.a($$1, (double)this.e);
      if ($$2 < (double)this.g) {
         return ad.a(this.j, $$0);
      } else {
         return $$0.i() < this.h ? ad.a(this.k, $$0) : this.i;
      }
   }
}
