import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.BiConsumer;

public class eaq extends eay {
   public static final Codec<eaq> a = RecordCodecBuilder.create(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  awe.k.optionalFieldOf("min_height_for_leaves", 1).forGetter($$0x -> $$0x.b), bmh.b(1, 64).fieldOf("bend_length").forGetter($$0x -> $$0x.h)
               )
            )
            .apply($$0, eaq::new)
   );
   private final int b;
   private final bmh h;

   public eaq(int $$0, int $$1, int $$2, int $$3, bmh $$4) {
      super($$0, $$1, $$2);
      this.b = $$3;
      this.h = $$4;
   }

   @Override
   protected eaz<?> a() {
      return eaz.g;
   }

   @Override
   public List<dzg.a> a(cxf $$0, BiConsumer<ib, dmz> $$1, axd $$2, int $$3, ib $$4, dyq $$5) {
      ih $$6 = ih.c.a.a($$2);
      int $$7 = $$3 - 1;
      ib.a $$8 = $$4.j();
      ib $$9 = $$8.d();
      a($$0, $$1, $$2, $$9, $$5);
      List<dzg.a> $$10 = Lists.newArrayList();

      for (int $$11 = 0; $$11 <= $$7; $$11++) {
         if ($$11 + 1 >= $$7 + $$2.a(2)) {
            $$8.c($$6);
         }

         if (dxc.c($$0, $$8)) {
            this.b($$0, $$1, $$2, $$8, $$5);
         }

         if ($$11 >= this.b) {
            $$10.add(new dzg.a($$8.i(), 0, false));
         }

         $$8.c(ih.b);
      }

      int $$12 = this.h.a($$2);

      for (int $$13 = 0; $$13 <= $$12; $$13++) {
         if (dxc.c($$0, $$8)) {
            this.b($$0, $$1, $$2, $$8, $$5);
         }

         $$10.add(new dzg.a($$8.i(), 0, false));
         $$8.c($$6);
      }

      return $$10;
   }
}
