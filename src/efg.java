import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class efg extends efe {
   public static final MapCodec<efg> b = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  Codec.floatRange(-1.0F, 1.0F).fieldOf("threshold").forGetter($$0x -> $$0x.g),
                  Codec.floatRange(0.0F, 1.0F).fieldOf("high_chance").forGetter($$0x -> $$0x.h),
                  dsa.b.fieldOf("default_state").forGetter($$0x -> $$0x.i),
                  Codec.list(dsa.b).fieldOf("low_states").forGetter($$0x -> $$0x.j),
                  Codec.list(dsa.b).fieldOf("high_states").forGetter($$0x -> $$0x.k)
               )
            )
            .apply($$0, efg::new)
   );
   private final float g;
   private final float h;
   private final dsa i;
   private final List<dsa> j;
   private final List<dsa> k;

   public efg(long $$0, emw.a $$1, float $$2, float $$3, float $$4, dsa $$5, List<dsa> $$6, List<dsa> $$7) {
      super($$0, $$1, $$2);
      this.g = $$3;
      this.h = $$4;
      this.i = $$5;
      this.j = $$6;
      this.k = $$7;
   }

   @Override
   protected efc<?> a() {
      return efc.c;
   }

   @Override
   public dsa a(azf $$0, iz $$1) {
      double $$2 = this.a($$1, (double)this.e);
      if ($$2 < (double)this.g) {
         return ac.a(this.j, $$0);
      } else {
         return $$0.i() < this.h ? ac.a(this.k, $$0) : this.i;
      }
   }
}
