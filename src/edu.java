import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.BiConsumer;

public class edu extends eec {
   public static final Codec<edu> a = RecordCodecBuilder.create(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  axe.j.optionalFieldOf("min_height_for_leaves", 1).forGetter($$0x -> $$0x.b), bnv.b(1, 64).fieldOf("bend_length").forGetter($$0x -> $$0x.h)
               )
            )
            .apply($$0, edu::new)
   );
   private final int b;
   private final bnv h;

   public edu(int $$0, int $$1, int $$2, int $$3, bnv $$4) {
      super($$0, $$1, $$2);
      this.b = $$3;
      this.h = $$4;
   }

   @Override
   protected eed<?> a() {
      return eed.g;
   }

   @Override
   public List<eck.a> a(daa $$0, BiConsumer<im, dpy> $$1, ayd $$2, int $$3, im $$4, ebu $$5) {
      ir $$6 = ir.c.a.a($$2);
      int $$7 = $$3 - 1;
      im.a $$8 = $$4.j();
      im $$9 = $$8.d();
      a($$0, $$1, $$2, $$9, $$5);
      List<eck.a> $$10 = Lists.newArrayList();

      for (int $$11 = 0; $$11 <= $$7; $$11++) {
         if ($$11 + 1 >= $$7 + $$2.a(2)) {
            $$8.c($$6);
         }

         if (eag.c($$0, $$8)) {
            this.b($$0, $$1, $$2, $$8, $$5);
         }

         if ($$11 >= this.b) {
            $$10.add(new eck.a($$8.i(), 0, false));
         }

         $$8.c(ir.b);
      }

      int $$12 = this.h.a($$2);

      for (int $$13 = 0; $$13 <= $$12; $$13++) {
         if (eag.c($$0, $$8)) {
            this.b($$0, $$1, $$2, $$8, $$5);
         }

         $$10.add(new eck.a($$8.i(), 0, false));
         $$8.c($$6);
      }

      return $$10;
   }
}
