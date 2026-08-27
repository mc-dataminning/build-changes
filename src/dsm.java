import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.BiConsumer;

public class dsm extends dsu {
   public static final Codec<dsm> a = RecordCodecBuilder.create(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  aqy.j.optionalFieldOf("min_height_for_leaves", 1).forGetter($$0x -> $$0x.b), bfv.b(1, 64).fieldOf("bend_length").forGetter($$0x -> $$0x.h)
               )
            )
            .apply($$0, dsm::new)
   );
   private final int b;
   private final bfv h;

   public dsm(int $$0, int $$1, int $$2, int $$3, bfv $$4) {
      super($$0, $$1, $$2);
      this.b = $$3;
      this.h = $$4;
   }

   @Override
   protected dsv<?> a() {
      return dsv.g;
   }

   @Override
   public List<drc.a> a(cpr $$0, BiConsumer<gu, dez> $$1, aru $$2, int $$3, gu $$4, dqm $$5) {
      ha $$6 = ha.c.a.a($$2);
      int $$7 = $$3 - 1;
      gu.a $$8 = $$4.j();
      gu $$9 = $$8.d();
      a($$0, $$1, $$2, $$9, $$5);
      List<drc.a> $$10 = Lists.newArrayList();

      for (int $$11 = 0; $$11 <= $$7; $$11++) {
         if ($$11 + 1 >= $$7 + $$2.a(2)) {
            $$8.c($$6);
         }

         if (doy.c($$0, $$8)) {
            this.b($$0, $$1, $$2, $$8, $$5);
         }

         if ($$11 >= this.b) {
            $$10.add(new drc.a($$8.i(), 0, false));
         }

         $$8.c(ha.b);
      }

      int $$12 = this.h.a($$2);

      for (int $$13 = 0; $$13 <= $$12; $$13++) {
         if (doy.c($$0, $$8)) {
            this.b($$0, $$1, $$2, $$8, $$5);
         }

         $$10.add(new drc.a($$8.i(), 0, false));
         $$8.c($$6);
      }

      return $$10;
   }
}
