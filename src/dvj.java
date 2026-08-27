import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class dvj extends dvl {
   public static final Codec<dvj> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               atq.a(Codec.INT, 1, 64).fieldOf("variety").forGetter($$0x -> $$0x.i),
               edc.a.a.fieldOf("slow_noise").forGetter($$0x -> $$0x.j),
               atg.k.fieldOf("slow_scale").forGetter($$0x -> $$0x.k)
            )
            .and(b($$0))
            .apply($$0, dvj::new)
   );
   private final atq<Integer> i;
   private final edc.a j;
   private final float k;
   private final edc l;

   public dvj(atq<Integer> $$0, edc.a $$1, float $$2, long $$3, edc.a $$4, float $$5, List<dip> $$6) {
      super($$3, $$4, $$5, $$6);
      this.i = $$0;
      this.j = $$1;
      this.k = $$2;
      this.l = edc.b(new dox(new dnz($$3)), $$1);
   }

   @Override
   protected dvi<?> a() {
      return dvi.e;
   }

   @Override
   public dip a(auf $$0, hv $$1) {
      double $$2 = this.a($$1);
      int $$3 = (int)aty.a($$2, -1.0, 1.0, (double)this.i.a().intValue(), (double)(this.i.b() + 1));
      List<dip> $$4 = Lists.newArrayListWithCapacity($$3);

      for (int $$5 = 0; $$5 < $$3; $$5++) {
         $$4.add(this.a(this.h, this.a($$1.b($$5 * 54545, 0, $$5 * 34234))));
      }

      return this.a($$4, $$1, (double)this.e);
   }

   protected double a(hv $$0) {
      return this.l.a((double)((float)$$0.u() * this.k), (double)((float)$$0.v() * this.k), (double)((float)$$0.w() * this.k));
   }
}
