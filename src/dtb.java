import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.BiConsumer;

public class dtb extends dsz {
   public static final Codec<dtb> a = RecordCodecBuilder.create(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  bfy.e.fieldOf("extra_branch_steps").forGetter($$0x -> $$0x.b),
                  Codec.floatRange(0.0F, 1.0F).fieldOf("place_branch_per_log_probability").forGetter($$0x -> $$0x.h),
                  bfy.d.fieldOf("extra_branch_length").forGetter($$0x -> $$0x.i),
                  hv.a(je.e).fieldOf("can_grow_through").forGetter($$0x -> $$0x.j)
               )
            )
            .apply($$0, dtb::new)
   );
   private final bfy b;
   private final float h;
   private final bfy i;
   private final hk<csq> j;

   public dtb(int $$0, int $$1, int $$2, bfy $$3, float $$4, bfy $$5, hk<csq> $$6) {
      super($$0, $$1, $$2);
      this.b = $$3;
      this.h = $$4;
      this.i = $$5;
      this.j = $$6;
   }

   @Override
   protected dta<?> a() {
      return dta.h;
   }

   @Override
   public List<drh.a> a(cpw $$0, BiConsumer<gw, dfe> $$1, arx $$2, int $$3, gw $$4, dqr $$5) {
      List<drh.a> $$6 = Lists.newArrayList();
      gw.a $$7 = new gw.a();

      for (int $$8 = 0; $$8 < $$3; $$8++) {
         int $$9 = $$4.v() + $$8;
         if (this.b($$0, $$1, $$2, $$7.d($$4.u(), $$9, $$4.w()), $$5) && $$8 < $$3 - 1 && $$2.i() < this.h) {
            hc $$10 = hc.c.a.a($$2);
            int $$11 = this.i.a($$2);
            int $$12 = Math.max(0, $$11 - this.i.a($$2) - 1);
            int $$13 = this.b.a($$2);
            this.a($$0, $$1, $$2, $$3, $$5, $$6, $$7, $$9, $$10, $$12, $$13);
         }

         if ($$8 == $$3 - 1) {
            $$6.add(new drh.a($$7.d($$4.u(), $$9 + 1, $$4.w()), 0, false));
         }
      }

      return $$6;
   }

   private void a(cpw $$0, BiConsumer<gw, dfe> $$1, arx $$2, int $$3, dqr $$4, List<drh.a> $$5, gw.a $$6, int $$7, hc $$8, int $$9, int $$10) {
      int $$11 = $$7 + $$9;
      int $$12 = $$6.u();
      int $$13 = $$6.w();
      int $$14 = $$9;

      while ($$14 < $$3 && $$10 > 0) {
         if ($$14 >= 1) {
            int $$15 = $$7 + $$14;
            $$12 += $$8.j();
            $$13 += $$8.l();
            $$11 = $$15;
            if (this.b($$0, $$1, $$2, $$6.d($$12, $$15, $$13), $$4)) {
               $$11 = $$15 + 1;
            }

            $$5.add(new drh.a($$6.i(), 0, false));
         }

         $$14++;
         $$10--;
      }

      if ($$11 - $$7 > 1) {
         gw $$16 = new gw($$12, $$11, $$13);
         $$5.add(new drh.a($$16, 0, false));
         $$5.add(new drh.a($$16.c(2), 0, false));
      }
   }

   @Override
   protected boolean a(cpw $$0, gw $$1) {
      return super.a($$0, $$1) || $$0.a($$1, $$0x -> $$0x.a(this.j));
   }
}
