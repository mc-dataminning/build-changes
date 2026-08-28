import com.google.common.collect.Lists;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.BiConsumer;

public class eic extends eik {
   public static final MapCodec<eic> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  ayl.l.optionalFieldOf("min_height_for_leaves", 1).forGetter($$0x -> $$0x.b), bqp.b(1, 64).fieldOf("bend_length").forGetter($$0x -> $$0x.h)
               )
            )
            .apply($$0, eic::new)
   );
   private final int b;
   private final bqp h;

   public eic(int $$0, int $$1, int $$2, int $$3, bqp $$4) {
      super($$0, $$1, $$2);
      this.b = $$3;
      this.h = $$4;
   }

   @Override
   protected eil<?> a() {
      return eil.g;
   }

   @Override
   public List<egs.a> a(ddy $$0, BiConsumer<je, dua> $$1, azk $$2, int $$3, je $$4, egc $$5) {
      jj $$6 = jj.c.a.a($$2);
      int $$7 = $$3 - 1;
      je.a $$8 = $$4.k();
      je $$9 = $$8.e();
      a($$0, $$1, $$2, $$9, $$5);
      List<egs.a> $$10 = Lists.newArrayList();

      for (int $$11 = 0; $$11 <= $$7; $$11++) {
         if ($$11 + 1 >= $$7 + $$2.a(2)) {
            $$8.c($$6);
         }

         if (eeo.c($$0, $$8)) {
            this.b($$0, $$1, $$2, $$8, $$5);
         }

         if ($$11 >= this.b) {
            $$10.add(new egs.a($$8.j(), 0, false));
         }

         $$8.c(jj.b);
      }

      int $$12 = this.h.a($$2);

      for (int $$13 = 0; $$13 <= $$12; $$13++) {
         if (eeo.c($$0, $$8)) {
            this.b($$0, $$1, $$2, $$8, $$5);
         }

         $$10.add(new egs.a($$8.j(), 0, false));
         $$8.c($$6);
      }

      return $$10;
   }
}
