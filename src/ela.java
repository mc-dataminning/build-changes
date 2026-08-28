import com.google.common.collect.Lists;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.BiConsumer;

public class ela extends eli {
   public static final MapCodec<ela> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  ayi.m.optionalFieldOf("min_height_for_leaves", 1).forGetter($$0x -> $$0x.b), brp.b(1, 64).fieldOf("bend_length").forGetter($$0x -> $$0x.h)
               )
            )
            .apply($$0, ela::new)
   );
   private final int b;
   private final brp h;

   public ela(int $$0, int $$1, int $$2, int $$3, brp $$4) {
      super($$0, $$1, $$2);
      this.b = $$3;
      this.h = $$4;
   }

   @Override
   protected elj<?> a() {
      return elj.g;
   }

   @Override
   public List<ejo.a> a(dgo $$0, BiConsumer<ji, dwx> $$1, azh $$2, int $$3, ji $$4, eiy $$5) {
      jn $$6 = jn.c.a.a($$2);
      int $$7 = $$3 - 1;
      ji.a $$8 = $$4.k();
      ji $$9 = $$8.e();
      a($$0, $$1, $$2, $$9, $$5);
      List<ejo.a> $$10 = Lists.newArrayList();

      for (int $$11 = 0; $$11 <= $$7; $$11++) {
         if ($$11 + 1 >= $$7 + $$2.a(2)) {
            $$8.c($$6);
         }

         if (ehk.c($$0, $$8)) {
            this.b($$0, $$1, $$2, $$8, $$5);
         }

         if ($$11 >= this.b) {
            $$10.add(new ejo.a($$8.j(), 0, false));
         }

         $$8.c(jn.b);
      }

      int $$12 = this.h.a($$2);

      for (int $$13 = 0; $$13 <= $$12; $$13++) {
         if (ehk.c($$0, $$8)) {
            this.b($$0, $$1, $$2, $$8, $$5);
         }

         $$10.add(new ejo.a($$8.j(), 0, false));
         $$8.c($$6);
      }

      return $$10;
   }
}
