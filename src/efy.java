import com.google.common.collect.Lists;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.BiConsumer;

public class efy extends egg {
   public static final MapCodec<efy> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  ayh.l.optionalFieldOf("min_height_for_leaves", 1).forGetter($$0x -> $$0x.b), bpz.b(1, 64).fieldOf("bend_length").forGetter($$0x -> $$0x.h)
               )
            )
            .apply($$0, efy::new)
   );
   private final int b;
   private final bpz h;

   public efy(int $$0, int $$1, int $$2, int $$3, bpz $$4) {
      super($$0, $$1, $$2);
      this.b = $$3;
      this.h = $$4;
   }

   @Override
   protected egh<?> a() {
      return egh.g;
   }

   @Override
   public List<eeo.a> a(dce $$0, BiConsumer<iz, dsc> $$1, azh $$2, int $$3, iz $$4, edy $$5) {
      je $$6 = je.c.a.a($$2);
      int $$7 = $$3 - 1;
      iz.a $$8 = $$4.j();
      iz $$9 = $$8.d();
      a($$0, $$1, $$2, $$9, $$5);
      List<eeo.a> $$10 = Lists.newArrayList();

      for (int $$11 = 0; $$11 <= $$7; $$11++) {
         if ($$11 + 1 >= $$7 + $$2.a(2)) {
            $$8.c($$6);
         }

         if (eck.c($$0, $$8)) {
            this.b($$0, $$1, $$2, $$8, $$5);
         }

         if ($$11 >= this.b) {
            $$10.add(new eeo.a($$8.i(), 0, false));
         }

         $$8.c(je.b);
      }

      int $$12 = this.h.a($$2);

      for (int $$13 = 0; $$13 <= $$12; $$13++) {
         if (eck.c($$0, $$8)) {
            this.b($$0, $$1, $$2, $$8, $$5);
         }

         $$10.add(new eeo.a($$8.i(), 0, false));
         $$8.c($$6);
      }

      return $$10;
   }
}
