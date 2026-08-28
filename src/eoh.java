import com.google.common.collect.Lists;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.BiConsumer;

public class eoh extends eop {
   public static final MapCodec<eoh> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  ayu.m.optionalFieldOf("min_height_for_leaves", 1).forGetter($$0x -> $$0x.b), btg.b(1, 64).fieldOf("bend_length").forGetter($$0x -> $$0x.h)
               )
            )
            .apply($$0, eoh::new)
   );
   private final int b;
   private final btg h;

   public eoh(int $$0, int $$1, int $$2, int $$3, btg $$4) {
      super($$0, $$1, $$2);
      this.b = $$3;
      this.h = $$4;
   }

   @Override
   protected eoq<?> a() {
      return eoq.g;
   }

   @Override
   public List<emu.a> a(djb $$0, BiConsumer<iu, dzz> $$1, azv $$2, int $$3, iu $$4, eme $$5) {
      ja $$6 = ja.c.a.a($$2);
      int $$7 = $$3 - 1;
      iu.a $$8 = $$4.k();
      iu $$9 = $$8.e();
      a($$0, $$1, $$2, $$9, $$5);
      List<emu.a> $$10 = Lists.newArrayList();

      for (int $$11 = 0; $$11 <= $$7; $$11++) {
         if ($$11 + 1 >= $$7 + $$2.a(2)) {
            $$8.c($$6);
         }

         if (ekq.d($$0, $$8)) {
            this.b($$0, $$1, $$2, $$8, $$5);
         }

         if ($$11 >= this.b) {
            $$10.add(new emu.a($$8.j(), 0, false));
         }

         $$8.c(ja.b);
      }

      int $$12 = this.h.a($$2);

      for (int $$13 = 0; $$13 <= $$12; $$13++) {
         if (ekq.d($$0, $$8)) {
            this.b($$0, $$1, $$2, $$8, $$5);
         }

         $$10.add(new emu.a($$8.j(), 0, false));
         $$8.c($$6);
      }

      return $$10;
   }
}
