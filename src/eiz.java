import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class eiz extends eix {
   public static final MapCodec<eiz> b = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  Codec.floatRange(-1.0F, 1.0F).fieldOf("threshold").forGetter($$0x -> $$0x.g),
                  Codec.floatRange(0.0F, 1.0F).fieldOf("high_chance").forGetter($$0x -> $$0x.h),
                  dvo.a.fieldOf("default_state").forGetter($$0x -> $$0x.i),
                  Codec.list(dvo.a).fieldOf("low_states").forGetter($$0x -> $$0x.j),
                  Codec.list(dvo.a).fieldOf("high_states").forGetter($$0x -> $$0x.k)
               )
            )
            .apply($$0, eiz::new)
   );
   private final float g;
   private final float h;
   private final dvo i;
   private final List<dvo> j;
   private final List<dvo> k;

   public eiz(long $$0, eqr.a $$1, float $$2, float $$3, float $$4, dvo $$5, List<dvo> $$6, List<dvo> $$7) {
      super($$0, $$1, $$2);
      this.g = $$3;
      this.h = $$4;
      this.i = $$5;
      this.j = $$6;
      this.k = $$7;
   }

   @Override
   protected eiv<?> a() {
      return eiv.c;
   }

   @Override
   public dvo a(azv $$0, jh $$1) {
      double $$2 = this.a($$1, (double)this.e);
      if ($$2 < (double)this.g) {
         return ae.a(this.j, $$0);
      } else {
         return $$0.i() < this.h ? ae.a(this.k, $$0) : this.i;
      }
   }
}
