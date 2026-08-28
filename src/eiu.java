import com.google.common.collect.Lists;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.BiConsumer;

public class eiu extends ejc {
   public static final MapCodec<eiu> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  ayo.l.optionalFieldOf("min_height_for_leaves", 1).forGetter($$0x -> $$0x.b), bqx.b(1, 64).fieldOf("bend_length").forGetter($$0x -> $$0x.h)
               )
            )
            .apply($$0, eiu::new)
   );
   private final int b;
   private final bqx h;

   public eiu(int $$0, int $$1, int $$2, int $$3, bqx $$4) {
      super($$0, $$1, $$2);
      this.b = $$3;
      this.h = $$4;
   }

   @Override
   protected ejd<?> a() {
      return ejd.g;
   }

   @Override
   public List<ehk.a> a(dep $$0, BiConsumer<jf, dus> $$1, azn $$2, int $$3, jf $$4, egu $$5) {
      jk $$6 = jk.c.a.a($$2);
      int $$7 = $$3 - 1;
      jf.a $$8 = $$4.k();
      jf $$9 = $$8.e();
      a($$0, $$1, $$2, $$9, $$5);
      List<ehk.a> $$10 = Lists.newArrayList();

      for (int $$11 = 0; $$11 <= $$7; $$11++) {
         if ($$11 + 1 >= $$7 + $$2.a(2)) {
            $$8.c($$6);
         }

         if (efg.c($$0, $$8)) {
            this.b($$0, $$1, $$2, $$8, $$5);
         }

         if ($$11 >= this.b) {
            $$10.add(new ehk.a($$8.j(), 0, false));
         }

         $$8.c(jk.b);
      }

      int $$12 = this.h.a($$2);

      for (int $$13 = 0; $$13 <= $$12; $$13++) {
         if (efg.c($$0, $$8)) {
            this.b($$0, $$1, $$2, $$8, $$5);
         }

         $$10.add(new ehk.a($$8.j(), 0, false));
         $$8.c($$6);
      }

      return $$10;
   }
}
