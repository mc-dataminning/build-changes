import com.google.common.collect.Lists;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.BiConsumer;

public class eky extends elg {
   public static final MapCodec<eky> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  ayh.m.optionalFieldOf("min_height_for_leaves", 1).forGetter($$0x -> $$0x.b), brn.b(1, 64).fieldOf("bend_length").forGetter($$0x -> $$0x.h)
               )
            )
            .apply($$0, eky::new)
   );
   private final int b;
   private final brn h;

   public eky(int $$0, int $$1, int $$2, int $$3, brn $$4) {
      super($$0, $$1, $$2);
      this.b = $$3;
      this.h = $$4;
   }

   @Override
   protected elh<?> a() {
      return elh.g;
   }

   @Override
   public List<ejm.a> a(dgm $$0, BiConsumer<ji, dwv> $$1, azg $$2, int $$3, ji $$4, eiw $$5) {
      jn $$6 = jn.c.a.a($$2);
      int $$7 = $$3 - 1;
      ji.a $$8 = $$4.k();
      ji $$9 = $$8.e();
      a($$0, $$1, $$2, $$9, $$5);
      List<ejm.a> $$10 = Lists.newArrayList();

      for (int $$11 = 0; $$11 <= $$7; $$11++) {
         if ($$11 + 1 >= $$7 + $$2.a(2)) {
            $$8.c($$6);
         }

         if (ehi.c($$0, $$8)) {
            this.b($$0, $$1, $$2, $$8, $$5);
         }

         if ($$11 >= this.b) {
            $$10.add(new ejm.a($$8.j(), 0, false));
         }

         $$8.c(jn.b);
      }

      int $$12 = this.h.a($$2);

      for (int $$13 = 0; $$13 <= $$12; $$13++) {
         if (ehi.c($$0, $$8)) {
            this.b($$0, $$1, $$2, $$8, $$5);
         }

         $$10.add(new ejm.a($$8.j(), 0, false));
         $$8.c($$6);
      }

      return $$10;
   }
}
