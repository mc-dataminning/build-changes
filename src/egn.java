import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class egn extends egp {
   public static final Codec<egn> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               aye.a(Codec.INT, 1, 64).fieldOf("variety").forGetter($$0x -> $$0x.i),
               eoh.a.a.fieldOf("slow_noise").forGetter($$0x -> $$0x.j),
               axu.k.fieldOf("slow_scale").forGetter($$0x -> $$0x.k)
            )
            .and(b($$0))
            .apply($$0, egn::new)
   );
   private final aye<Integer> i;
   private final eoh.a j;
   private final float k;
   private final eoh l;

   public egn(aye<Integer> $$0, eoh.a $$1, float $$2, long $$3, eoh.a $$4, float $$5, List<dtc> $$6) {
      super($$3, $$4, $$5, $$6);
      this.i = $$0;
      this.j = $$1;
      this.k = $$2;
      this.l = eoh.b(new dzt(new dyv($$3)), $$1);
   }

   @Override
   protected egm<?> a() {
      return egm.e;
   }

   @Override
   public dtc a(ayt $$0, ir $$1) {
      double $$2 = this.a($$1);
      int $$3 = (int)aym.a($$2, -1.0, 1.0, (double)this.i.a().intValue(), (double)(this.i.b() + 1));
      List<dtc> $$4 = Lists.newArrayListWithCapacity($$3);

      for (int $$5 = 0; $$5 < $$3; $$5++) {
         $$4.add(this.a(this.h, this.a($$1.b($$5 * 54545, 0, $$5 * 34234))));
      }

      return this.a($$4, $$1, (double)this.e);
   }

   protected double a(ir $$0) {
      return this.l.a((double)((float)$$0.u() * this.k), (double)((float)$$0.v() * this.k), (double)((float)$$0.w() * this.k));
   }
}
