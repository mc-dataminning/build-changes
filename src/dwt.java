import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.BiConsumer;

public class dwt extends dxb {
   public static final Codec<dwt> a = RecordCodecBuilder.create(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  atv.j.optionalFieldOf("min_height_for_leaves", 1).forGetter($$0x -> $$0x.b), bjf.b(1, 64).fieldOf("bend_length").forGetter($$0x -> $$0x.h)
               )
            )
            .apply($$0, dwt::new)
   );
   private final int b;
   private final bjf h;

   public dwt(int $$0, int $$1, int $$2, int $$3, bjf $$4) {
      super($$0, $$1, $$2);
      this.b = $$3;
      this.h = $$4;
   }

   @Override
   protected dxc<?> a() {
      return dxc.g;
   }

   @Override
   public List<dvj.a> a(ctu $$0, BiConsumer<hx, djg> $$1, auu $$2, int $$3, hx $$4, dut $$5) {
      ic $$6 = ic.c.a.a($$2);
      int $$7 = $$3 - 1;
      hx.a $$8 = $$4.j();
      hx $$9 = $$8.d();
      a($$0, $$1, $$2, $$9, $$5);
      List<dvj.a> $$10 = Lists.newArrayList();

      for (int $$11 = 0; $$11 <= $$7; $$11++) {
         if ($$11 + 1 >= $$7 + $$2.a(2)) {
            $$8.c($$6);
         }

         if (dtf.c($$0, $$8)) {
            this.b($$0, $$1, $$2, $$8, $$5);
         }

         if ($$11 >= this.b) {
            $$10.add(new dvj.a($$8.i(), 0, false));
         }

         $$8.c(ic.b);
      }

      int $$12 = this.h.a($$2);

      for (int $$13 = 0; $$13 <= $$12; $$13++) {
         if (dtf.c($$0, $$8)) {
            this.b($$0, $$1, $$2, $$8, $$5);
         }

         $$10.add(new dvj.a($$8.i(), 0, false));
         $$8.c($$6);
      }

      return $$10;
   }
}
