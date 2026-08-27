import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.BiConsumer;

public class dzu extends eac {
   public static final Codec<dzu> a = RecordCodecBuilder.create(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  avu.j.optionalFieldOf("min_height_for_leaves", 1).forGetter($$0x -> $$0x.b), blq.b(1, 64).fieldOf("bend_length").forGetter($$0x -> $$0x.h)
               )
            )
            .apply($$0, dzu::new)
   );
   private final int b;
   private final blq h;

   public dzu(int $$0, int $$1, int $$2, int $$3, blq $$4) {
      super($$0, $$1, $$2);
      this.b = $$3;
      this.h = $$4;
   }

   @Override
   protected ead<?> a() {
      return ead.g;
   }

   @Override
   public List<dyk.a> a(cwk $$0, BiConsumer<ib, dme> $$1, awt $$2, int $$3, ib $$4, dxu $$5) {
      ih $$6 = ih.c.a.a($$2);
      int $$7 = $$3 - 1;
      ib.a $$8 = $$4.j();
      ib $$9 = $$8.d();
      a($$0, $$1, $$2, $$9, $$5);
      List<dyk.a> $$10 = Lists.newArrayList();

      for (int $$11 = 0; $$11 <= $$7; $$11++) {
         if ($$11 + 1 >= $$7 + $$2.a(2)) {
            $$8.c($$6);
         }

         if (dwg.c($$0, $$8)) {
            this.b($$0, $$1, $$2, $$8, $$5);
         }

         if ($$11 >= this.b) {
            $$10.add(new dyk.a($$8.i(), 0, false));
         }

         $$8.c(ih.b);
      }

      int $$12 = this.h.a($$2);

      for (int $$13 = 0; $$13 <= $$12; $$13++) {
         if (dwg.c($$0, $$8)) {
            this.b($$0, $$1, $$2, $$8, $$5);
         }

         $$10.add(new dyk.a($$8.i(), 0, false));
         $$8.c($$6);
      }

      return $$10;
   }
}
