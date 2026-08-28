import com.google.common.collect.Lists;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.BiConsumer;

public class eha extends ehi {
   public static final MapCodec<eha> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  axv.l.optionalFieldOf("min_height_for_leaves", 1).forGetter($$0x -> $$0x.b), bpv.b(1, 64).fieldOf("bend_length").forGetter($$0x -> $$0x.h)
               )
            )
            .apply($$0, eha::new)
   );
   private final int b;
   private final bpv h;

   public eha(int $$0, int $$1, int $$2, int $$3, bpv $$4) {
      super($$0, $$1, $$2);
      this.b = $$3;
      this.h = $$4;
   }

   @Override
   protected ehj<?> a() {
      return ehj.g;
   }

   @Override
   public List<efq.a> a(dda $$0, BiConsumer<jd, dta> $$1, ayv $$2, int $$3, jd $$4, efa $$5) {
      ji $$6 = ji.c.a.a($$2);
      int $$7 = $$3 - 1;
      jd.a $$8 = $$4.j();
      jd $$9 = $$8.d();
      a($$0, $$1, $$2, $$9, $$5);
      List<efq.a> $$10 = Lists.newArrayList();

      for (int $$11 = 0; $$11 <= $$7; $$11++) {
         if ($$11 + 1 >= $$7 + $$2.a(2)) {
            $$8.c($$6);
         }

         if (edm.c($$0, $$8)) {
            this.b($$0, $$1, $$2, $$8, $$5);
         }

         if ($$11 >= this.b) {
            $$10.add(new efq.a($$8.i(), 0, false));
         }

         $$8.c(ji.b);
      }

      int $$12 = this.h.a($$2);

      for (int $$13 = 0; $$13 <= $$12; $$13++) {
         if (edm.c($$0, $$8)) {
            this.b($$0, $$1, $$2, $$8, $$5);
         }

         $$10.add(new efq.a($$8.i(), 0, false));
         $$8.c($$6);
      }

      return $$10;
   }
}
