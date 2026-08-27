import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.BiConsumer;

public class dsq extends dsy {
   public static final Codec<dsq> a = RecordCodecBuilder.create(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  arj.j.optionalFieldOf("min_height_for_leaves", 1).forGetter($$0x -> $$0x.b), bgj.b(1, 64).fieldOf("bend_length").forGetter($$0x -> $$0x.h)
               )
            )
            .apply($$0, dsq::new)
   );
   private final int b;
   private final bgj h;

   public dsq(int $$0, int $$1, int $$2, int $$3, bgj $$4) {
      super($$0, $$1, $$2);
      this.b = $$3;
      this.h = $$4;
   }

   @Override
   protected dsz<?> a() {
      return dsz.g;
   }

   @Override
   public List<drg.a> a(cqh $$0, BiConsumer<gw, dfd> $$1, ash $$2, int $$3, gw $$4, dqq $$5) {
      ha $$6 = ha.c.a.a($$2);
      int $$7 = $$3 - 1;
      gw.a $$8 = $$4.j();
      gw $$9 = $$8.d();
      a($$0, $$1, $$2, $$9, $$5);
      List<drg.a> $$10 = Lists.newArrayList();

      for (int $$11 = 0; $$11 <= $$7; $$11++) {
         if ($$11 + 1 >= $$7 + $$2.a(2)) {
            $$8.c($$6);
         }

         if (dpc.c($$0, $$8)) {
            this.b($$0, $$1, $$2, $$8, $$5);
         }

         if ($$11 >= this.b) {
            $$10.add(new drg.a($$8.i(), 0, false));
         }

         $$8.c(ha.b);
      }

      int $$12 = this.h.a($$2);

      for (int $$13 = 0; $$13 <= $$12; $$13++) {
         if (dpc.c($$0, $$8)) {
            this.b($$0, $$1, $$2, $$8, $$5);
         }

         $$10.add(new drg.a($$8.i(), 0, false));
         $$8.c($$6);
      }

      return $$10;
   }
}
