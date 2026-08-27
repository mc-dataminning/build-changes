import com.google.common.collect.Lists;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.BiConsumer;

public class eez extends efh {
   public static final MapCodec<eez> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  axn.j.optionalFieldOf("min_height_for_leaves", 1).forGetter($$0x -> $$0x.b), bpb.b(1, 64).fieldOf("bend_length").forGetter($$0x -> $$0x.h)
               )
            )
            .apply($$0, eez::new)
   );
   private final int b;
   private final bpb h;

   public eez(int $$0, int $$1, int $$2, int $$3, bpb $$4) {
      super($$0, $$1, $$2);
      this.b = $$3;
      this.h = $$4;
   }

   @Override
   protected efi<?> a() {
      return efi.g;
   }

   @Override
   public List<edp.a> a(dbf $$0, BiConsumer<io, drd> $$1, aym $$2, int $$3, io $$4, ecz $$5) {
      it $$6 = it.c.a.a($$2);
      int $$7 = $$3 - 1;
      io.a $$8 = $$4.j();
      io $$9 = $$8.d();
      a($$0, $$1, $$2, $$9, $$5);
      List<edp.a> $$10 = Lists.newArrayList();

      for (int $$11 = 0; $$11 <= $$7; $$11++) {
         if ($$11 + 1 >= $$7 + $$2.a(2)) {
            $$8.c($$6);
         }

         if (ebl.c($$0, $$8)) {
            this.b($$0, $$1, $$2, $$8, $$5);
         }

         if ($$11 >= this.b) {
            $$10.add(new edp.a($$8.i(), 0, false));
         }

         $$8.c(it.b);
      }

      int $$12 = this.h.a($$2);

      for (int $$13 = 0; $$13 <= $$12; $$13++) {
         if (ebl.c($$0, $$8)) {
            this.b($$0, $$1, $$2, $$8, $$5);
         }

         $$10.add(new edp.a($$8.i(), 0, false));
         $$8.c($$6);
      }

      return $$10;
   }
}
