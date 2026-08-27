import com.google.common.collect.Lists;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.BiConsumer;

public class eex extends eff {
   public static final MapCodec<eex> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  axm.j.optionalFieldOf("min_height_for_leaves", 1).forGetter($$0x -> $$0x.b), boz.b(1, 64).fieldOf("bend_length").forGetter($$0x -> $$0x.h)
               )
            )
            .apply($$0, eex::new)
   );
   private final int b;
   private final boz h;

   public eex(int $$0, int $$1, int $$2, int $$3, boz $$4) {
      super($$0, $$1, $$2);
      this.b = $$3;
      this.h = $$4;
   }

   @Override
   protected efg<?> a() {
      return efg.g;
   }

   @Override
   public List<edn.a> a(dbd $$0, BiConsumer<io, drb> $$1, ayk $$2, int $$3, io $$4, ecx $$5) {
      it $$6 = it.c.a.a($$2);
      int $$7 = $$3 - 1;
      io.a $$8 = $$4.j();
      io $$9 = $$8.d();
      a($$0, $$1, $$2, $$9, $$5);
      List<edn.a> $$10 = Lists.newArrayList();

      for (int $$11 = 0; $$11 <= $$7; $$11++) {
         if ($$11 + 1 >= $$7 + $$2.a(2)) {
            $$8.c($$6);
         }

         if (ebj.c($$0, $$8)) {
            this.b($$0, $$1, $$2, $$8, $$5);
         }

         if ($$11 >= this.b) {
            $$10.add(new edn.a($$8.i(), 0, false));
         }

         $$8.c(it.b);
      }

      int $$12 = this.h.a($$2);

      for (int $$13 = 0; $$13 <= $$12; $$13++) {
         if (ebj.c($$0, $$8)) {
            this.b($$0, $$1, $$2, $$8, $$5);
         }

         $$10.add(new edn.a($$8.i(), 0, false));
         $$8.c($$6);
      }

      return $$10;
   }
}
