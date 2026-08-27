import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.BiConsumer;

public class ede extends edm {
   public static final Codec<ede> a = RecordCodecBuilder.create(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  awu.j.optionalFieldOf("min_height_for_leaves", 1).forGetter($$0x -> $$0x.b), bnk.b(1, 64).fieldOf("bend_length").forGetter($$0x -> $$0x.h)
               )
            )
            .apply($$0, ede::new)
   );
   private final int b;
   private final bnk h;

   public ede(int $$0, int $$1, int $$2, int $$3, bnk $$4) {
      super($$0, $$1, $$2);
      this.b = $$3;
      this.h = $$4;
   }

   @Override
   protected edn<?> a() {
      return edn.g;
   }

   @Override
   public List<ebu.a> a(czm $$0, BiConsumer<id, dpi> $$1, axt $$2, int $$3, id $$4, ebe $$5) {
      ij $$6 = ij.c.a.a($$2);
      int $$7 = $$3 - 1;
      id.a $$8 = $$4.j();
      id $$9 = $$8.d();
      a($$0, $$1, $$2, $$9, $$5);
      List<ebu.a> $$10 = Lists.newArrayList();

      for (int $$11 = 0; $$11 <= $$7; $$11++) {
         if ($$11 + 1 >= $$7 + $$2.a(2)) {
            $$8.c($$6);
         }

         if (dzq.c($$0, $$8)) {
            this.b($$0, $$1, $$2, $$8, $$5);
         }

         if ($$11 >= this.b) {
            $$10.add(new ebu.a($$8.i(), 0, false));
         }

         $$8.c(ij.b);
      }

      int $$12 = this.h.a($$2);

      for (int $$13 = 0; $$13 <= $$12; $$13++) {
         if (dzq.c($$0, $$8)) {
            this.b($$0, $$1, $$2, $$8, $$5);
         }

         $$10.add(new ebu.a($$8.i(), 0, false));
         $$8.c($$6);
      }

      return $$10;
   }
}
