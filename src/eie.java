import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class eie extends eic {
   public static final MapCodec<eie> b = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  Codec.floatRange(-1.0F, 1.0F).fieldOf("threshold").forGetter($$0x -> $$0x.g),
                  Codec.floatRange(0.0F, 1.0F).fieldOf("high_chance").forGetter($$0x -> $$0x.h),
                  dus.a.fieldOf("default_state").forGetter($$0x -> $$0x.i),
                  Codec.list(dus.a).fieldOf("low_states").forGetter($$0x -> $$0x.j),
                  Codec.list(dus.a).fieldOf("high_states").forGetter($$0x -> $$0x.k)
               )
            )
            .apply($$0, eie::new)
   );
   private final float g;
   private final float h;
   private final dus i;
   private final List<dus> j;
   private final List<dus> k;

   public eie(long $$0, epw.a $$1, float $$2, float $$3, float $$4, dus $$5, List<dus> $$6, List<dus> $$7) {
      super($$0, $$1, $$2);
      this.g = $$3;
      this.h = $$4;
      this.i = $$5;
      this.j = $$6;
      this.k = $$7;
   }

   @Override
   protected eia<?> a() {
      return eia.c;
   }

   @Override
   public dus a(azn $$0, jf $$1) {
      double $$2 = this.a($$1, (double)this.e);
      if ($$2 < (double)this.g) {
         return ad.a(this.j, $$0);
      } else {
         return $$0.i() < this.h ? ad.a(this.k, $$0) : this.i;
      }
   }
}
