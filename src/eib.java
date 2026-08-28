import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class eib extends eid {
   public static final MapCodec<eib> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               ayx.a(Codec.INT, 1, 64).fieldOf("variety").forGetter($$0x -> $$0x.i),
               epw.a.a.fieldOf("slow_noise").forGetter($$0x -> $$0x.j),
               ayo.n.fieldOf("slow_scale").forGetter($$0x -> $$0x.k)
            )
            .and(b($$0))
            .apply($$0, eib::new)
   );
   private final ayx<Integer> i;
   private final epw.a j;
   private final float k;
   private final epw l;

   public eib(ayx<Integer> $$0, epw.a $$1, float $$2, long $$3, epw.a $$4, float $$5, List<dus> $$6) {
      super($$3, $$4, $$5, $$6);
      this.i = $$0;
      this.j = $$1;
      this.k = $$2;
      this.l = epw.b(new ebn(new eap($$3)), $$1);
   }

   @Override
   protected eia<?> a() {
      return eia.e;
   }

   @Override
   public dus a(azn $$0, jf $$1) {
      double $$2 = this.a($$1);
      int $$3 = (int)azf.a($$2, -1.0, 1.0, (double)this.i.a().intValue(), (double)(this.i.b() + 1));
      List<dus> $$4 = Lists.newArrayListWithCapacity($$3);

      for (int $$5 = 0; $$5 < $$3; $$5++) {
         $$4.add(this.a(this.h, this.a($$1.b($$5 * 54545, 0, $$5 * 34234))));
      }

      return this.a($$4, $$1, (double)this.e);
   }

   protected double a(jf $$0) {
      return this.l.a((double)((float)$$0.u() * this.k), (double)((float)$$0.v() * this.k), (double)((float)$$0.w() * this.k));
   }
}
