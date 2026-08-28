import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.ints.IntList;

public record fmr(int b) implements fmt {
   public static final MapCodec<fmr> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ayi.i.fieldOf("default").forGetter(fmr::b)).apply($$0, fmr::new));

   public fmr() {
      this(-7697782);
   }

   @Override
   public int a(cwp $$0) {
      cze $$1 = $$0.a(kv.ae);
      IntList $$2 = $$1 != null ? $$1.b() : IntList.of();
      int $$3 = $$2.size();
      if ($$3 == 0) {
         return this.b;
      } else if ($$3 == 1) {
         return axk.f($$2.getInt(0));
      } else {
         int $$4 = 0;
         int $$5 = 0;
         int $$6 = 0;

         for (int $$7 = 0; $$7 < $$3; $$7++) {
            int $$8 = $$2.getInt($$7);
            $$4 += axk.b($$8);
            $$5 += axk.c($$8);
            $$6 += axk.d($$8);
         }

         return axk.a($$4 / $$3, $$5 / $$3, $$6 / $$3);
      }
   }

   @Override
   public MapCodec<fmr> a() {
      return a;
   }
}
