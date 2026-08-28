import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class efk extends efi {
   public static final MapCodec<efk> b = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  Codec.floatRange(-1.0F, 1.0F).fieldOf("threshold").forGetter($$0x -> $$0x.g),
                  Codec.floatRange(0.0F, 1.0F).fieldOf("high_chance").forGetter($$0x -> $$0x.h),
                  dse.b.fieldOf("default_state").forGetter($$0x -> $$0x.i),
                  Codec.list(dse.b).fieldOf("low_states").forGetter($$0x -> $$0x.j),
                  Codec.list(dse.b).fieldOf("high_states").forGetter($$0x -> $$0x.k)
               )
            )
            .apply($$0, efk::new)
   );
   private final float g;
   private final float h;
   private final dse i;
   private final List<dse> j;
   private final List<dse> k;

   public efk(long $$0, ena.a $$1, float $$2, float $$3, float $$4, dse $$5, List<dse> $$6, List<dse> $$7) {
      super($$0, $$1, $$2);
      this.g = $$3;
      this.h = $$4;
      this.i = $$5;
      this.j = $$6;
      this.k = $$7;
   }

   @Override
   protected efg<?> a() {
      return efg.c;
   }

   @Override
   public dse a(azh $$0, iz $$1) {
      double $$2 = this.a($$1, (double)this.e);
      if ($$2 < (double)this.g) {
         return ac.a(this.j, $$0);
      } else {
         return $$0.i() < this.h ? ac.a(this.k, $$0) : this.i;
      }
   }
}
