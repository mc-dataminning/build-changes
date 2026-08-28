import com.google.common.collect.Lists;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.BiConsumer;

public class eqb extends eqj {
   public static final MapCodec<eqb> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  azg.m.optionalFieldOf("min_height_for_leaves", 1).forGetter($$0x -> $$0x.b), buh.b(1, 64).fieldOf("bend_length").forGetter($$0x -> $$0x.h)
               )
            )
            .apply($$0, eqb::new)
   );
   private final int b;
   private final buh h;

   public eqb(int $$0, int $$1, int $$2, int $$3, buh $$4) {
      super($$0, $$1, $$2);
      this.b = $$3;
      this.h = $$4;
   }

   @Override
   protected eqk<?> a() {
      return eqk.g;
   }

   @Override
   public List<eon.a> a(dkp $$0, BiConsumer<iw, ebq> $$1, bai $$2, int $$3, iw $$4, enx $$5) {
      jc $$6 = jc.c.a.a($$2);
      int $$7 = $$3 - 1;
      iw.a $$8 = $$4.k();
      iw $$9 = $$8.e();
      a($$0, $$1, $$2, $$9, $$5);
      List<eon.a> $$10 = Lists.newArrayList();

      for (int $$11 = 0; $$11 <= $$7; $$11++) {
         if ($$11 + 1 >= $$7 + $$2.a(2)) {
            $$8.c($$6);
         }

         if (emi.d($$0, $$8)) {
            this.b($$0, $$1, $$2, $$8, $$5);
         }

         if ($$11 >= this.b) {
            $$10.add(new eon.a($$8.j(), 0, false));
         }

         $$8.c(jc.b);
      }

      int $$12 = this.h.a($$2);

      for (int $$13 = 0; $$13 <= $$12; $$13++) {
         if (emi.d($$0, $$8)) {
            this.b($$0, $$1, $$2, $$8, $$5);
         }

         $$10.add(new eon.a($$8.j(), 0, false));
         $$8.c($$6);
      }

      return $$10;
   }
}
