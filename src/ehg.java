import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.BiConsumer;

public class ehg extends eho {
   public static final Codec<ehg> a = RecordCodecBuilder.create(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  axu.j.optionalFieldOf("min_height_for_leaves", 1).forGetter($$0x -> $$0x.b), bpf.b(1, 64).fieldOf("bend_length").forGetter($$0x -> $$0x.h)
               )
            )
            .apply($$0, ehg::new)
   );
   private final int b;
   private final bpf h;

   public ehg(int $$0, int $$1, int $$2, int $$3, bpf $$4) {
      super($$0, $$1, $$2);
      this.b = $$3;
      this.h = $$4;
   }

   @Override
   protected ehp<?> a() {
      return ehp.g;
   }

   @Override
   public List<efw.a> a(dcg $$0, BiConsumer<ir, dtc> $$1, ayt $$2, int $$3, ir $$4, efg $$5) {
      iw $$6 = iw.c.a.a($$2);
      int $$7 = $$3 - 1;
      ir.a $$8 = $$4.j();
      ir $$9 = $$8.d();
      a($$0, $$1, $$2, $$9, $$5);
      List<efw.a> $$10 = Lists.newArrayList();

      for (int $$11 = 0; $$11 <= $$7; $$11++) {
         if ($$11 + 1 >= $$7 + $$2.a(2)) {
            $$8.d($$6);
         }

         if (edr.c($$0, $$8)) {
            this.b($$0, $$1, $$2, $$8, $$5);
         }

         if ($$11 >= this.b) {
            $$10.add(new efw.a($$8.i(), 0, false));
         }

         $$8.d(iw.b);
      }

      int $$12 = this.h.a($$2);

      for (int $$13 = 0; $$13 <= $$12; $$13++) {
         if (edr.c($$0, $$8)) {
            this.b($$0, $$1, $$2, $$8, $$5);
         }

         $$10.add(new efw.a($$8.i(), 0, false));
         $$8.d($$6);
      }

      return $$10;
   }
}
