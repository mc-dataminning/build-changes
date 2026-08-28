import com.google.common.collect.Lists;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.BiConsumer;

public class egk extends egs {
   public static final MapCodec<egk> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  axo.l.optionalFieldOf("min_height_for_leaves", 1).forGetter($$0x -> $$0x.b), bpl.b(1, 64).fieldOf("bend_length").forGetter($$0x -> $$0x.h)
               )
            )
            .apply($$0, egk::new)
   );
   private final int b;
   private final bpl h;

   public egk(int $$0, int $$1, int $$2, int $$3, bpl $$4) {
      super($$0, $$1, $$2);
      this.b = $$3;
      this.h = $$4;
   }

   @Override
   protected egt<?> a() {
      return egt.g;
   }

   @Override
   public List<efa.a> a(dcl $$0, BiConsumer<ja, dsk> $$1, ayo $$2, int $$3, ja $$4, eek $$5) {
      jf $$6 = jf.c.a.a($$2);
      int $$7 = $$3 - 1;
      ja.a $$8 = $$4.j();
      ja $$9 = $$8.d();
      a($$0, $$1, $$2, $$9, $$5);
      List<efa.a> $$10 = Lists.newArrayList();

      for (int $$11 = 0; $$11 <= $$7; $$11++) {
         if ($$11 + 1 >= $$7 + $$2.a(2)) {
            $$8.c($$6);
         }

         if (ecw.c($$0, $$8)) {
            this.b($$0, $$1, $$2, $$8, $$5);
         }

         if ($$11 >= this.b) {
            $$10.add(new efa.a($$8.i(), 0, false));
         }

         $$8.c(jf.b);
      }

      int $$12 = this.h.a($$2);

      for (int $$13 = 0; $$13 <= $$12; $$13++) {
         if (ecw.c($$0, $$8)) {
            this.b($$0, $$1, $$2, $$8, $$5);
         }

         $$10.add(new efa.a($$8.i(), 0, false));
         $$8.c($$6);
      }

      return $$10;
   }
}
