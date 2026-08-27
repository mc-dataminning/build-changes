import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.BiConsumer;

public class duj extends dur {
   public static final Codec<duj> a = RecordCodecBuilder.create(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  asq.j.optionalFieldOf("min_height_for_leaves", 1).forGetter($$0x -> $$0x.b), bhv.b(1, 64).fieldOf("bend_length").forGetter($$0x -> $$0x.h)
               )
            )
            .apply($$0, duj::new)
   );
   private final int b;
   private final bhv h;

   public duj(int $$0, int $$1, int $$2, int $$3, bhv $$4) {
      super($$0, $$1, $$2);
      this.b = $$3;
      this.h = $$4;
   }

   @Override
   protected dus<?> a() {
      return dus.g;
   }

   @Override
   public List<dsz.a> a(cry $$0, BiConsumer<ht, dgw> $$1, ato $$2, int $$3, ht $$4, dsj $$5) {
      hx $$6 = hx.c.a.a($$2);
      int $$7 = $$3 - 1;
      ht.a $$8 = $$4.j();
      ht $$9 = $$8.d();
      a($$0, $$1, $$2, $$9, $$5);
      List<dsz.a> $$10 = Lists.newArrayList();

      for (int $$11 = 0; $$11 <= $$7; $$11++) {
         if ($$11 + 1 >= $$7 + $$2.a(2)) {
            $$8.c($$6);
         }

         if (dqv.c($$0, $$8)) {
            this.b($$0, $$1, $$2, $$8, $$5);
         }

         if ($$11 >= this.b) {
            $$10.add(new dsz.a($$8.i(), 0, false));
         }

         $$8.c(hx.b);
      }

      int $$12 = this.h.a($$2);

      for (int $$13 = 0; $$13 <= $$12; $$13++) {
         if (dqv.c($$0, $$8)) {
            this.b($$0, $$1, $$2, $$8, $$5);
         }

         $$10.add(new dsz.a($$8.i(), 0, false));
         $$8.c($$6);
      }

      return $$10;
   }
}
