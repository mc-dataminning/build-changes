import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class ekd extends ekf {
   public static final MapCodec<ekd> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               ayq.a(Codec.INT, 1, 64).fieldOf("variety").forGetter($$0x -> $$0x.i),
               esa.a.a.fieldOf("slow_noise").forGetter($$0x -> $$0x.j),
               ayh.o.fieldOf("slow_scale").forGetter($$0x -> $$0x.k)
            )
            .and(b($$0))
            .apply($$0, ekd::new)
   );
   private final ayq<Integer> i;
   private final esa.a j;
   private final float k;
   private final esa l;

   public ekd(ayq<Integer> $$0, esa.a $$1, float $$2, long $$3, esa.a $$4, float $$5, List<dwv> $$6) {
      super($$3, $$4, $$5, $$6);
      this.i = $$0;
      this.j = $$1;
      this.k = $$2;
      this.l = esa.b(new edp(new ecr($$3)), $$1);
   }

   @Override
   protected ekc<?> a() {
      return ekc.e;
   }

   @Override
   public dwv a(azg $$0, ji $$1) {
      double $$2 = this.a($$1);
      int $$3 = (int)ayy.a($$2, -1.0, 1.0, (double)this.i.a().intValue(), (double)(this.i.b() + 1));
      List<dwv> $$4 = Lists.newArrayListWithCapacity($$3);

      for (int $$5 = 0; $$5 < $$3; $$5++) {
         $$4.add(this.a(this.h, this.a($$1.b($$5 * 54545, 0, $$5 * 34234))));
      }

      return this.a($$4, $$1, (double)this.e);
   }

   protected double a(ji $$0) {
      return this.l.a((double)((float)$$0.u() * this.k), (double)((float)$$0.v() * this.k), (double)((float)$$0.w() * this.k));
   }
}
