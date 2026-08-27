import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.BiConsumer;

public class dsl extends dst {
   public static final Codec<dsl> a = RecordCodecBuilder.create(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  aqw.j.optionalFieldOf("min_height_for_leaves", 1).forGetter($$0x -> $$0x.b), bft.b(1, 64).fieldOf("bend_length").forGetter($$0x -> $$0x.h)
               )
            )
            .apply($$0, dsl::new)
   );
   private final int b;
   private final bft h;

   public dsl(int $$0, int $$1, int $$2, int $$3, bft $$4) {
      super($$0, $$1, $$2);
      this.b = $$3;
      this.h = $$4;
   }

   @Override
   protected dsu<?> a() {
      return dsu.g;
   }

   @Override
   public List<drb.a> a(cpq $$0, BiConsumer<gv, dey> $$1, art $$2, int $$3, gv $$4, dql $$5) {
      hb $$6 = hb.c.a.a($$2);
      int $$7 = $$3 - 1;
      gv.a $$8 = $$4.j();
      gv $$9 = $$8.d();
      a($$0, $$1, $$2, $$9, $$5);
      List<drb.a> $$10 = Lists.newArrayList();

      for (int $$11 = 0; $$11 <= $$7; $$11++) {
         if ($$11 + 1 >= $$7 + $$2.a(2)) {
            $$8.c($$6);
         }

         if (dox.c($$0, $$8)) {
            this.b($$0, $$1, $$2, $$8, $$5);
         }

         if ($$11 >= this.b) {
            $$10.add(new drb.a($$8.i(), 0, false));
         }

         $$8.c(hb.b);
      }

      int $$12 = this.h.a($$2);

      for (int $$13 = 0; $$13 <= $$12; $$13++) {
         if (dox.c($$0, $$8)) {
            this.b($$0, $$1, $$2, $$8, $$5);
         }

         $$10.add(new drb.a($$8.i(), 0, false));
         $$8.c($$6);
      }

      return $$10;
   }
}
