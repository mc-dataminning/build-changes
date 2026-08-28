import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class eod extends eob {
   public static final MapCodec<eod> b = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  Codec.floatRange(-1.0F, 1.0F).fieldOf("threshold").forGetter($$0x -> $$0x.g),
                  Codec.floatRange(0.0F, 1.0F).fieldOf("high_chance").forGetter($$0x -> $$0x.h),
                  eao.a.fieldOf("default_state").forGetter($$0x -> $$0x.i),
                  ayu.b(eao.a.listOf()).fieldOf("low_states").forGetter($$0x -> $$0x.j),
                  ayu.b(eao.a.listOf()).fieldOf("high_states").forGetter($$0x -> $$0x.k)
               )
            )
            .apply($$0, eod::new)
   );
   private final float g;
   private final float h;
   private final eao i;
   private final List<eao> j;
   private final List<eao> k;

   public eod(long $$0, evy.a $$1, float $$2, float $$3, float $$4, eao $$5, List<eao> $$6, List<eao> $$7) {
      super($$0, $$1, $$2);
      this.g = $$3;
      this.h = $$4;
      this.i = $$5;
      this.j = $$6;
      this.k = $$7;
   }

   @Override
   protected enz<?> a() {
      return enz.c;
   }

   @Override
   public eao a(azv $$0, iv $$1) {
      double $$2 = this.a($$1, (double)this.e);
      if ($$2 < (double)this.g) {
         return ag.a(this.j, $$0);
      } else {
         return $$0.i() < this.h ? ag.a(this.k, $$0) : this.i;
      }
   }
}
