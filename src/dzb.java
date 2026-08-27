import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class dzb extends dzd {
   public static final Codec<dzb> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               awe.a(Codec.INT, 1, 64).fieldOf("variety").forGetter($$0x -> $$0x.i),
               egu.a.a.fieldOf("slow_noise").forGetter($$0x -> $$0x.j),
               avu.k.fieldOf("slow_scale").forGetter($$0x -> $$0x.k)
            )
            .and(b($$0))
            .apply($$0, dzb::new)
   );
   private final awe<Integer> i;
   private final egu.a j;
   private final float k;
   private final egu l;

   public dzb(awe<Integer> $$0, egu.a $$1, float $$2, long $$3, egu.a $$4, float $$5, List<dme> $$6) {
      super($$3, $$4, $$5, $$6);
      this.i = $$0;
      this.j = $$1;
      this.k = $$2;
      this.l = egu.b(new dsp(new drr($$3)), $$1);
   }

   @Override
   protected dza<?> a() {
      return dza.e;
   }

   @Override
   public dme a(awt $$0, ib $$1) {
      double $$2 = this.a($$1);
      int $$3 = (int)awm.a($$2, -1.0, 1.0, (double)this.i.a().intValue(), (double)(this.i.b() + 1));
      List<dme> $$4 = Lists.newArrayListWithCapacity($$3);

      for (int $$5 = 0; $$5 < $$3; $$5++) {
         $$4.add(this.a(this.h, this.a($$1.b($$5 * 54545, 0, $$5 * 34234))));
      }

      return this.a($$4, $$1, (double)this.e);
   }

   protected double a(ib $$0) {
      return this.l.a((double)((float)$$0.u() * this.k), (double)((float)$$0.v() * this.k), (double)((float)$$0.w() * this.k));
   }
}
