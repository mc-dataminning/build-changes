import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.BiConsumer;

public class dys extends dza {
   public static final Codec<dys> a = RecordCodecBuilder.create(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  avp.j.optionalFieldOf("min_height_for_leaves", 1).forGetter($$0x -> $$0x.b), bkz.b(1, 64).fieldOf("bend_length").forGetter($$0x -> $$0x.h)
               )
            )
            .apply($$0, dys::new)
   );
   private final int b;
   private final bkz h;

   public dys(int $$0, int $$1, int $$2, int $$3, bkz $$4) {
      super($$0, $$1, $$2);
      this.b = $$3;
      this.h = $$4;
   }

   @Override
   protected dzb<?> a() {
      return dzb.g;
   }

   @Override
   public List<dxi.a> a(cvt $$0, BiConsumer<hz, dlf> $$1, awo $$2, int $$3, hz $$4, dws $$5) {
      ie $$6 = ie.c.a.a($$2);
      int $$7 = $$3 - 1;
      hz.a $$8 = $$4.j();
      hz $$9 = $$8.d();
      a($$0, $$1, $$2, $$9, $$5);
      List<dxi.a> $$10 = Lists.newArrayList();

      for (int $$11 = 0; $$11 <= $$7; $$11++) {
         if ($$11 + 1 >= $$7 + $$2.a(2)) {
            $$8.c($$6);
         }

         if (dve.c($$0, $$8)) {
            this.b($$0, $$1, $$2, $$8, $$5);
         }

         if ($$11 >= this.b) {
            $$10.add(new dxi.a($$8.i(), 0, false));
         }

         $$8.c(ie.b);
      }

      int $$12 = this.h.a($$2);

      for (int $$13 = 0; $$13 <= $$12; $$13++) {
         if (dve.c($$0, $$8)) {
            this.b($$0, $$1, $$2, $$8, $$5);
         }

         $$10.add(new dxi.a($$8.i(), 0, false));
         $$8.c($$6);
      }

      return $$10;
   }
}
