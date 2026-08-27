import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class drs extends dru {
   public static final Codec<drs> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               arh.a(Codec.INT, 1, 64).fieldOf("variety").forGetter($$0x -> $$0x.i),
               dze.a.a.fieldOf("slow_noise").forGetter($$0x -> $$0x.j),
               aqw.k.fieldOf("slow_scale").forGetter($$0x -> $$0x.k)
            )
            .and(b($$0))
            .apply($$0, drs::new)
   );
   private final arh<Integer> i;
   private final dze.a j;
   private final float k;
   private final dze l;

   public drs(arh<Integer> $$0, dze.a $$1, float $$2, long $$3, dze.a $$4, float $$5, List<dey> $$6) {
      super($$3, $$4, $$5, $$6);
      this.i = $$0;
      this.j = $$1;
      this.k = $$2;
      this.l = dze.b(new dlg(new dki($$3)), $$1);
   }

   @Override
   protected drr<?> a() {
      return drr.e;
   }

   @Override
   public dey a(art $$0, gv $$1) {
      double $$2 = this.a($$1);
      int $$3 = (int)aro.a($$2, -1.0, 1.0, (double)this.i.a().intValue(), (double)(this.i.b() + 1));
      List<dey> $$4 = Lists.newArrayListWithCapacity($$3);

      for (int $$5 = 0; $$5 < $$3; $$5++) {
         $$4.add(this.a(this.h, this.a($$1.b($$5 * 54545, 0, $$5 * 34234))));
      }

      return this.a($$4, $$1, (double)this.e);
   }

   protected double a(gv $$0) {
      return this.l.a((double)((float)$$0.u() * this.k), (double)((float)$$0.v() * this.k), (double)((float)$$0.w() * this.k));
   }
}
