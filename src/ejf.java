import com.google.common.collect.Lists;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.BiConsumer;

public class ejf extends ejn {
   public static final MapCodec<ejf> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  ays.m.optionalFieldOf("min_height_for_leaves", 1).forGetter($$0x -> $$0x.b), brd.b(1, 64).fieldOf("bend_length").forGetter($$0x -> $$0x.h)
               )
            )
            .apply($$0, ejf::new)
   );
   private final int b;
   private final brd h;

   public ejf(int $$0, int $$1, int $$2, int $$3, brd $$4) {
      super($$0, $$1, $$2);
      this.b = $$3;
      this.h = $$4;
   }

   @Override
   protected ejo<?> a() {
      return ejo.g;
   }

   @Override
   public List<ehv.a> a(dfb $$0, BiConsumer<jg, dvd> $$1, azr $$2, int $$3, jg $$4, ehf $$5) {
      jl $$6 = jl.c.a.a($$2);
      int $$7 = $$3 - 1;
      jg.a $$8 = $$4.k();
      jg $$9 = $$8.e();
      a($$0, $$1, $$2, $$9, $$5);
      List<ehv.a> $$10 = Lists.newArrayList();

      for (int $$11 = 0; $$11 <= $$7; $$11++) {
         if ($$11 + 1 >= $$7 + $$2.a(2)) {
            $$8.c($$6);
         }

         if (efr.c($$0, $$8)) {
            this.b($$0, $$1, $$2, $$8, $$5);
         }

         if ($$11 >= this.b) {
            $$10.add(new ehv.a($$8.j(), 0, false));
         }

         $$8.c(jl.b);
      }

      int $$12 = this.h.a($$2);

      for (int $$13 = 0; $$13 <= $$12; $$13++) {
         if (efr.c($$0, $$8)) {
            this.b($$0, $$1, $$2, $$8, $$5);
         }

         $$10.add(new ehv.a($$8.j(), 0, false));
         $$8.c($$6);
      }

      return $$10;
   }
}
