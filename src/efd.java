import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class efd extends eff {
   public static final MapCodec<efd> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               ayp.a(Codec.INT, 1, 64).fieldOf("variety").forGetter($$0x -> $$0x.i),
               emw.a.a.fieldOf("slow_noise").forGetter($$0x -> $$0x.j),
               ayf.m.fieldOf("slow_scale").forGetter($$0x -> $$0x.k)
            )
            .and(b($$0))
            .apply($$0, efd::new)
   );
   private final ayp<Integer> i;
   private final emw.a j;
   private final float k;
   private final emw l;

   public efd(ayp<Integer> $$0, emw.a $$1, float $$2, long $$3, emw.a $$4, float $$5, List<dsa> $$6) {
      super($$3, $$4, $$5, $$6);
      this.i = $$0;
      this.j = $$1;
      this.k = $$2;
      this.l = emw.b(new dyr(new dxt($$3)), $$1);
   }

   @Override
   protected efc<?> a() {
      return efc.e;
   }

   @Override
   public dsa a(azf $$0, iz $$1) {
      double $$2 = this.a($$1);
      int $$3 = (int)ayx.a($$2, -1.0, 1.0, (double)this.i.a().intValue(), (double)(this.i.b() + 1));
      List<dsa> $$4 = Lists.newArrayListWithCapacity($$3);

      for (int $$5 = 0; $$5 < $$3; $$5++) {
         $$4.add(this.a(this.h, this.a($$1.b($$5 * 54545, 0, $$5 * 34234))));
      }

      return this.a($$4, $$1, (double)this.e);
   }

   protected double a(iz $$0) {
      return this.l.a((double)((float)$$0.u() * this.k), (double)((float)$$0.v() * this.k), (double)((float)$$0.w() * this.k));
   }
}
