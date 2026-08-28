import com.google.common.collect.Lists;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.BiConsumer;

public class emu extends enc {
   public static final MapCodec<emu> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  ays.m.optionalFieldOf("min_height_for_leaves", 1).forGetter($$0x -> $$0x.b), bsv.b(1, 64).fieldOf("bend_length").forGetter($$0x -> $$0x.h)
               )
            )
            .apply($$0, emu::new)
   );
   private final int b;
   private final bsv h;

   public emu(int $$0, int $$1, int $$2, int $$3, bsv $$4) {
      super($$0, $$1, $$2);
      this.b = $$3;
      this.h = $$4;
   }

   @Override
   protected end<?> a() {
      return end.g;
   }

   @Override
   public List<elh.a> a(dhv $$0, BiConsumer<jj, dym> $$1, azs $$2, int $$3, jj $$4, ekr $$5) {
      jo $$6 = jo.c.a.a($$2);
      int $$7 = $$3 - 1;
      jj.a $$8 = $$4.k();
      jj $$9 = $$8.e();
      a($$0, $$1, $$2, $$9, $$5);
      List<elh.a> $$10 = Lists.newArrayList();

      for (int $$11 = 0; $$11 <= $$7; $$11++) {
         if ($$11 + 1 >= $$7 + $$2.a(2)) {
            $$8.c($$6);
         }

         if (ejd.d($$0, $$8)) {
            this.b($$0, $$1, $$2, $$8, $$5);
         }

         if ($$11 >= this.b) {
            $$10.add(new elh.a($$8.j(), 0, false));
         }

         $$8.c(jo.b);
      }

      int $$12 = this.h.a($$2);

      for (int $$13 = 0; $$13 <= $$12; $$13++) {
         if (ejd.d($$0, $$8)) {
            this.b($$0, $$1, $$2, $$8, $$5);
         }

         $$10.add(new elh.a($$8.j(), 0, false));
         $$8.c($$6);
      }

      return $$10;
   }
}
