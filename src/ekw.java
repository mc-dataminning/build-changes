import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class ekw extends eky {
   public static final MapCodec<ekw> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               azm.a(Codec.INT, 1, 64).fieldOf("variety").forGetter($$0x -> $$0x.i),
               est.a.a.fieldOf("slow_noise").forGetter($$0x -> $$0x.j),
               azd.o.fieldOf("slow_scale").forGetter($$0x -> $$0x.k)
            )
            .and(b($$0))
            .apply($$0, ekw::new)
   );
   private final azm<Integer> i;
   private final est.a j;
   private final float k;
   private final est l;

   public ekw(azm<Integer> $$0, est.a $$1, float $$2, long $$3, est.a $$4, float $$5, List<dxo> $$6) {
      super($$3, $$4, $$5, $$6);
      this.i = $$0;
      this.j = $$1;
      this.k = $$2;
      this.l = est.b(new eei(new edk($$3)), $$1);
   }

   @Override
   protected ekv<?> a() {
      return ekv.e;
   }

   @Override
   public dxo a(bac $$0, jh $$1) {
      double $$2 = this.a($$1);
      int $$3 = (int)azu.a($$2, -1.0, 1.0, (double)this.i.a().intValue(), (double)(this.i.b() + 1));
      List<dxo> $$4 = Lists.newArrayListWithCapacity($$3);

      for (int $$5 = 0; $$5 < $$3; $$5++) {
         $$4.add(this.a(this.h, this.a($$1.b($$5 * 54545, 0, $$5 * 34234))));
      }

      return this.a($$4, $$1, (double)this.e);
   }

   protected double a(jh $$0) {
      return this.l.a((double)((float)$$0.u() * this.k), (double)((float)$$0.v() * this.k), (double)((float)$$0.w() * this.k));
   }
}
