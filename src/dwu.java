import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.BiConsumer;

public class dwu extends dxc {
   public static final Codec<dwu> a = RecordCodecBuilder.create(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  atw.j.optionalFieldOf("min_height_for_leaves", 1).forGetter($$0x -> $$0x.b), bjg.b(1, 64).fieldOf("bend_length").forGetter($$0x -> $$0x.h)
               )
            )
            .apply($$0, dwu::new)
   );
   private final int b;
   private final bjg h;

   public dwu(int $$0, int $$1, int $$2, int $$3, bjg $$4) {
      super($$0, $$1, $$2);
      this.b = $$3;
      this.h = $$4;
   }

   @Override
   protected dxd<?> a() {
      return dxd.g;
   }

   @Override
   public List<dvk.a> a(ctv $$0, BiConsumer<hx, djh> $$1, auv $$2, int $$3, hx $$4, duu $$5) {
      ic $$6 = ic.c.a.a($$2);
      int $$7 = $$3 - 1;
      hx.a $$8 = $$4.j();
      hx $$9 = $$8.d();
      a($$0, $$1, $$2, $$9, $$5);
      List<dvk.a> $$10 = Lists.newArrayList();

      for (int $$11 = 0; $$11 <= $$7; $$11++) {
         if ($$11 + 1 >= $$7 + $$2.a(2)) {
            $$8.c($$6);
         }

         if (dtg.c($$0, $$8)) {
            this.b($$0, $$1, $$2, $$8, $$5);
         }

         if ($$11 >= this.b) {
            $$10.add(new dvk.a($$8.i(), 0, false));
         }

         $$8.c(ic.b);
      }

      int $$12 = this.h.a($$2);

      for (int $$13 = 0; $$13 <= $$12; $$13++) {
         if (dtg.c($$0, $$8)) {
            this.b($$0, $$1, $$2, $$8, $$5);
         }

         $$10.add(new dvk.a($$8.i(), 0, false));
         $$8.c($$6);
      }

      return $$10;
   }
}
