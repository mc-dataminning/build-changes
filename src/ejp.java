import com.google.common.collect.Lists;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.BiConsumer;

public class ejp extends ejx {
   public static final MapCodec<ejp> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  ayw.m.optionalFieldOf("min_height_for_leaves", 1).forGetter($$0x -> $$0x.b), brm.b(1, 64).fieldOf("bend_length").forGetter($$0x -> $$0x.h)
               )
            )
            .apply($$0, ejp::new)
   );
   private final int b;
   private final brm h;

   public ejp(int $$0, int $$1, int $$2, int $$3, brm $$4) {
      super($$0, $$1, $$2);
      this.b = $$3;
      this.h = $$4;
   }

   @Override
   protected ejy<?> a() {
      return ejy.g;
   }

   @Override
   public List<eif.a> a(dfl $$0, BiConsumer<jh, dvo> $$1, azv $$2, int $$3, jh $$4, ehp $$5) {
      jm $$6 = jm.c.a.a($$2);
      int $$7 = $$3 - 1;
      jh.a $$8 = $$4.k();
      jh $$9 = $$8.e();
      a($$0, $$1, $$2, $$9, $$5);
      List<eif.a> $$10 = Lists.newArrayList();

      for (int $$11 = 0; $$11 <= $$7; $$11++) {
         if ($$11 + 1 >= $$7 + $$2.a(2)) {
            $$8.c($$6);
         }

         if (egb.c($$0, $$8)) {
            this.b($$0, $$1, $$2, $$8, $$5);
         }

         if ($$11 >= this.b) {
            $$10.add(new eif.a($$8.j(), 0, false));
         }

         $$8.c(jm.b);
      }

      int $$12 = this.h.a($$2);

      for (int $$13 = 0; $$13 <= $$12; $$13++) {
         if (egb.c($$0, $$8)) {
            this.b($$0, $$1, $$2, $$8, $$5);
         }

         $$10.add(new eif.a($$8.j(), 0, false));
         $$8.c($$6);
      }

      return $$10;
   }
}
