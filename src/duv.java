import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.BiConsumer;

public class duv extends dvd {
   public static final Codec<duv> a = RecordCodecBuilder.create(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  asu.j.optionalFieldOf("min_height_for_leaves", 1).forGetter($$0x -> $$0x.b), bic.b(1, 64).fieldOf("bend_length").forGetter($$0x -> $$0x.h)
               )
            )
            .apply($$0, duv::new)
   );
   private final int b;
   private final bic h;

   public duv(int $$0, int $$1, int $$2, int $$3, bic $$4) {
      super($$0, $$1, $$2);
      this.b = $$3;
      this.h = $$4;
   }

   @Override
   protected dve<?> a() {
      return dve.g;
   }

   @Override
   public List<dtl.a> a(csg $$0, BiConsumer<ht, dhi> $$1, ats $$2, int $$3, ht $$4, dsv $$5) {
      hx $$6 = hx.c.a.a($$2);
      int $$7 = $$3 - 1;
      ht.a $$8 = $$4.j();
      ht $$9 = $$8.d();
      a($$0, $$1, $$2, $$9, $$5);
      List<dtl.a> $$10 = Lists.newArrayList();

      for (int $$11 = 0; $$11 <= $$7; $$11++) {
         if ($$11 + 1 >= $$7 + $$2.a(2)) {
            $$8.c($$6);
         }

         if (drh.c($$0, $$8)) {
            this.b($$0, $$1, $$2, $$8, $$5);
         }

         if ($$11 >= this.b) {
            $$10.add(new dtl.a($$8.i(), 0, false));
         }

         $$8.c(hx.b);
      }

      int $$12 = this.h.a($$2);

      for (int $$13 = 0; $$13 <= $$12; $$13++) {
         if (drh.c($$0, $$8)) {
            this.b($$0, $$1, $$2, $$8, $$5);
         }

         $$10.add(new dtl.a($$8.i(), 0, false));
         $$8.c($$6);
      }

      return $$10;
   }
}
