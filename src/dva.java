import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.BiConsumer;

public class dva extends dvi {
   public static final Codec<dva> a = RecordCodecBuilder.create(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  asy.j.optionalFieldOf("min_height_for_leaves", 1).forGetter($$0x -> $$0x.b), big.b(1, 64).fieldOf("bend_length").forGetter($$0x -> $$0x.h)
               )
            )
            .apply($$0, dva::new)
   );
   private final int b;
   private final big h;

   public dva(int $$0, int $$1, int $$2, int $$3, big $$4) {
      super($$0, $$1, $$2);
      this.b = $$3;
      this.h = $$4;
   }

   @Override
   protected dvj<?> a() {
      return dvj.g;
   }

   @Override
   public List<dtq.a> a(csl $$0, BiConsumer<hx, dhn> $$1, atw $$2, int $$3, hx $$4, dta $$5) {
      ib $$6 = ib.c.a.a($$2);
      int $$7 = $$3 - 1;
      hx.a $$8 = $$4.j();
      hx $$9 = $$8.d();
      a($$0, $$1, $$2, $$9, $$5);
      List<dtq.a> $$10 = Lists.newArrayList();

      for (int $$11 = 0; $$11 <= $$7; $$11++) {
         if ($$11 + 1 >= $$7 + $$2.a(2)) {
            $$8.c($$6);
         }

         if (drm.c($$0, $$8)) {
            this.b($$0, $$1, $$2, $$8, $$5);
         }

         if ($$11 >= this.b) {
            $$10.add(new dtq.a($$8.i(), 0, false));
         }

         $$8.c(ib.b);
      }

      int $$12 = this.h.a($$2);

      for (int $$13 = 0; $$13 <= $$12; $$13++) {
         if (drm.c($$0, $$8)) {
            this.b($$0, $$1, $$2, $$8, $$5);
         }

         $$10.add(new dtq.a($$8.i(), 0, false));
         $$8.c($$6);
      }

      return $$10;
   }
}
