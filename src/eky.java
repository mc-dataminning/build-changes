import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class eky extends ekw {
   public static final MapCodec<eky> b = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  Codec.floatRange(-1.0F, 1.0F).fieldOf("threshold").forGetter($$0x -> $$0x.g),
                  Codec.floatRange(0.0F, 1.0F).fieldOf("high_chance").forGetter($$0x -> $$0x.h),
                  dxn.a.fieldOf("default_state").forGetter($$0x -> $$0x.i),
                  Codec.list(dxn.a).fieldOf("low_states").forGetter($$0x -> $$0x.j),
                  Codec.list(dxn.a).fieldOf("high_states").forGetter($$0x -> $$0x.k)
               )
            )
            .apply($$0, eky::new)
   );
   private final float g;
   private final float h;
   private final dxn i;
   private final List<dxn> j;
   private final List<dxn> k;

   public eky(long $$0, ess.a $$1, float $$2, float $$3, float $$4, dxn $$5, List<dxn> $$6, List<dxn> $$7) {
      super($$0, $$1, $$2);
      this.g = $$3;
      this.h = $$4;
      this.i = $$5;
      this.j = $$6;
      this.k = $$7;
   }

   @Override
   protected eku<?> a() {
      return eku.c;
   }

   @Override
   public dxn a(bam $$0, jh $$1) {
      double $$2 = this.a($$1, (double)this.e);
      if ($$2 < (double)this.g) {
         return ae.a(this.j, $$0);
      } else {
         return $$0.i() < this.h ? ae.a(this.k, $$0) : this.i;
      }
   }
}
