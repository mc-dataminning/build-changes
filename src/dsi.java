import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class dsi extends dsg {
   public static final Codec<dsi> b = RecordCodecBuilder.create(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  Codec.floatRange(-1.0F, 1.0F).fieldOf("threshold").forGetter($$0x -> $$0x.g),
                  Codec.floatRange(0.0F, 1.0F).fieldOf("high_chance").forGetter($$0x -> $$0x.h),
                  dfl.b.fieldOf("default_state").forGetter($$0x -> $$0x.i),
                  Codec.list(dfl.b).fieldOf("low_states").forGetter($$0x -> $$0x.j),
                  Codec.list(dfl.b).fieldOf("high_states").forGetter($$0x -> $$0x.k)
               )
            )
            .apply($$0, dsi::new)
   );
   private final float g;
   private final float h;
   private final dfl i;
   private final List<dfl> j;
   private final List<dfl> k;

   public dsi(long $$0, dzr.a $$1, float $$2, float $$3, float $$4, dfl $$5, List<dfl> $$6, List<dfl> $$7) {
      super($$0, $$1, $$2);
      this.g = $$3;
      this.h = $$4;
      this.i = $$5;
      this.j = $$6;
      this.k = $$7;
   }

   @Override
   protected dse<?> a() {
      return dse.c;
   }

   @Override
   public dfl a(ase $$0, gw $$1) {
      double $$2 = this.a($$1, (double)this.e);
      if ($$2 < (double)this.g) {
         return ac.a(this.j, $$0);
      } else {
         return $$0.i() < this.h ? ac.a(this.k, $$0) : this.i;
      }
   }
}
