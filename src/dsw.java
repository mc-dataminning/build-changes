import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.BiConsumer;

public class dsw extends dte {
   public static final Codec<dsw> a = RecordCodecBuilder.create(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  arg.j.optionalFieldOf("min_height_for_leaves", 1).forGetter($$0x -> $$0x.b), bgd.b(1, 64).fieldOf("bend_length").forGetter($$0x -> $$0x.h)
               )
            )
            .apply($$0, dsw::new)
   );
   private final int b;
   private final bgd h;

   public dsw(int $$0, int $$1, int $$2, int $$3, bgd $$4) {
      super($$0, $$1, $$2);
      this.b = $$3;
      this.h = $$4;
   }

   @Override
   protected dtf<?> a() {
      return dtf.g;
   }

   @Override
   public List<drm.a> a(cqb $$0, BiConsumer<gw, dfj> $$1, asc $$2, int $$3, gw $$4, dqw $$5) {
      hc $$6 = hc.c.a.a($$2);
      int $$7 = $$3 - 1;
      gw.a $$8 = $$4.j();
      gw $$9 = $$8.d();
      a($$0, $$1, $$2, $$9, $$5);
      List<drm.a> $$10 = Lists.newArrayList();

      for (int $$11 = 0; $$11 <= $$7; $$11++) {
         if ($$11 + 1 >= $$7 + $$2.a(2)) {
            $$8.c($$6);
         }

         if (dpi.c($$0, $$8)) {
            this.b($$0, $$1, $$2, $$8, $$5);
         }

         if ($$11 >= this.b) {
            $$10.add(new drm.a($$8.i(), 0, false));
         }

         $$8.c(hc.b);
      }

      int $$12 = this.h.a($$2);

      for (int $$13 = 0; $$13 <= $$12; $$13++) {
         if (dpi.c($$0, $$8)) {
            this.b($$0, $$1, $$2, $$8, $$5);
         }

         $$10.add(new drm.a($$8.i(), 0, false));
         $$8.c($$6);
      }

      return $$10;
   }
}
