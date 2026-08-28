import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class elg extends ele {
   public static final MapCodec<elg> b = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  Codec.floatRange(-1.0F, 1.0F).fieldOf("threshold").forGetter($$0x -> $$0x.g),
                  Codec.floatRange(0.0F, 1.0F).fieldOf("high_chance").forGetter($$0x -> $$0x.h),
                  dxv.a.fieldOf("default_state").forGetter($$0x -> $$0x.i),
                  Codec.list(dxv.a).fieldOf("low_states").forGetter($$0x -> $$0x.j),
                  Codec.list(dxv.a).fieldOf("high_states").forGetter($$0x -> $$0x.k)
               )
            )
            .apply($$0, elg::new)
   );
   private final float g;
   private final float h;
   private final dxv i;
   private final List<dxv> j;
   private final List<dxv> k;

   public elg(long $$0, eta.a $$1, float $$2, float $$3, float $$4, dxv $$5, List<dxv> $$6, List<dxv> $$7) {
      super($$0, $$1, $$2);
      this.g = $$3;
      this.h = $$4;
      this.i = $$5;
      this.j = $$6;
      this.k = $$7;
   }

   @Override
   protected elc<?> a() {
      return elc.c;
   }

   @Override
   public dxv a(bam $$0, jh $$1) {
      double $$2 = this.a($$1, (double)this.e);
      if ($$2 < (double)this.g) {
         return ae.a(this.j, $$0);
      } else {
         return $$0.i() < this.h ? ae.a(this.k, $$0) : this.i;
      }
   }
}
