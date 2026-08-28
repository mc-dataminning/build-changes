import com.google.common.collect.Lists;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.BiConsumer;

public class eow extends epe {
   public static final MapCodec<eow> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  ayu.m.optionalFieldOf("min_height_for_leaves", 1).forGetter($$0x -> $$0x.b), btl.b(1, 64).fieldOf("bend_length").forGetter($$0x -> $$0x.h)
               )
            )
            .apply($$0, eow::new)
   );
   private final int b;
   private final btl h;

   public eow(int $$0, int $$1, int $$2, int $$3, btl $$4) {
      super($$0, $$1, $$2);
      this.b = $$3;
      this.h = $$4;
   }

   @Override
   protected epf<?> a() {
      return epf.g;
   }

   @Override
   public List<enj.a> a(djn $$0, BiConsumer<iv, eao> $$1, azv $$2, int $$3, iv $$4, emt $$5) {
      jb $$6 = jb.c.a.a($$2);
      int $$7 = $$3 - 1;
      iv.a $$8 = $$4.k();
      iv $$9 = $$8.e();
      a($$0, $$1, $$2, $$9, $$5);
      List<enj.a> $$10 = Lists.newArrayList();

      for (int $$11 = 0; $$11 <= $$7; $$11++) {
         if ($$11 + 1 >= $$7 + $$2.a(2)) {
            $$8.c($$6);
         }

         if (elf.d($$0, $$8)) {
            this.b($$0, $$1, $$2, $$8, $$5);
         }

         if ($$11 >= this.b) {
            $$10.add(new enj.a($$8.j(), 0, false));
         }

         $$8.c(jb.b);
      }

      int $$12 = this.h.a($$2);

      for (int $$13 = 0; $$13 <= $$12; $$13++) {
         if (elf.d($$0, $$8)) {
            this.b($$0, $$1, $$2, $$8, $$5);
         }

         $$10.add(new enj.a($$8.j(), 0, false));
         $$8.c($$6);
      }

      return $$10;
   }
}
