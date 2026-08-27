import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.BiConsumer;

public class dsr extends dsz {
   public static final Codec<dsr> a = RecordCodecBuilder.create(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  arb.j.optionalFieldOf("min_height_for_leaves", 1).forGetter($$0x -> $$0x.b), bfy.b(1, 64).fieldOf("bend_length").forGetter($$0x -> $$0x.h)
               )
            )
            .apply($$0, dsr::new)
   );
   private final int b;
   private final bfy h;

   public dsr(int $$0, int $$1, int $$2, int $$3, bfy $$4) {
      super($$0, $$1, $$2);
      this.b = $$3;
      this.h = $$4;
   }

   @Override
   protected dta<?> a() {
      return dta.g;
   }

   @Override
   public List<drh.a> a(cpw $$0, BiConsumer<gw, dfe> $$1, arx $$2, int $$3, gw $$4, dqr $$5) {
      hc $$6 = hc.c.a.a($$2);
      int $$7 = $$3 - 1;
      gw.a $$8 = $$4.j();
      gw $$9 = $$8.d();
      a($$0, $$1, $$2, $$9, $$5);
      List<drh.a> $$10 = Lists.newArrayList();

      for (int $$11 = 0; $$11 <= $$7; $$11++) {
         if ($$11 + 1 >= $$7 + $$2.a(2)) {
            $$8.c($$6);
         }

         if (dpd.c($$0, $$8)) {
            this.b($$0, $$1, $$2, $$8, $$5);
         }

         if ($$11 >= this.b) {
            $$10.add(new drh.a($$8.i(), 0, false));
         }

         $$8.c(hc.b);
      }

      int $$12 = this.h.a($$2);

      for (int $$13 = 0; $$13 <= $$12; $$13++) {
         if (dpd.c($$0, $$8)) {
            this.b($$0, $$1, $$2, $$8, $$5);
         }

         $$10.add(new drh.a($$8.i(), 0, false));
         $$8.c($$6);
      }

      return $$10;
   }
}
