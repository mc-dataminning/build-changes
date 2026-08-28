import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class efd extends efb {
   public static final MapCodec<efd> b = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  Codec.floatRange(-1.0F, 1.0F).fieldOf("threshold").forGetter($$0x -> $$0x.g),
                  Codec.floatRange(0.0F, 1.0F).fieldOf("high_chance").forGetter($$0x -> $$0x.h),
                  drx.b.fieldOf("default_state").forGetter($$0x -> $$0x.i),
                  Codec.list(drx.b).fieldOf("low_states").forGetter($$0x -> $$0x.j),
                  Codec.list(drx.b).fieldOf("high_states").forGetter($$0x -> $$0x.k)
               )
            )
            .apply($$0, efd::new)
   );
   private final float g;
   private final float h;
   private final drx i;
   private final List<drx> j;
   private final List<drx> k;

   public efd(long $$0, emt.a $$1, float $$2, float $$3, float $$4, drx $$5, List<drx> $$6, List<drx> $$7) {
      super($$0, $$1, $$2);
      this.g = $$3;
      this.h = $$4;
      this.i = $$5;
      this.j = $$6;
      this.k = $$7;
   }

   @Override
   protected eez<?> a() {
      return eez.c;
   }

   @Override
   public drx a(azc $$0, iz $$1) {
      double $$2 = this.a($$1, (double)this.e);
      if ($$2 < (double)this.g) {
         return ac.a(this.j, $$0);
      } else {
         return $$0.i() < this.h ? ac.a(this.k, $$0) : this.i;
      }
   }
}
