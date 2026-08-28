import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.ints.IntList;

public record fmp(int b) implements fmr {
   public static final MapCodec<fmp> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ayh.i.fieldOf("default").forGetter(fmp::b)).apply($$0, fmp::new));

   public fmp() {
      this(-7697782);
   }

   @Override
   public int a(cwn $$0) {
      czc $$1 = $$0.a(kv.ae);
      IntList $$2 = $$1 != null ? $$1.b() : IntList.of();
      int $$3 = $$2.size();
      if ($$3 == 0) {
         return this.b;
      } else if ($$3 == 1) {
         return axj.f($$2.getInt(0));
      } else {
         int $$4 = 0;
         int $$5 = 0;
         int $$6 = 0;

         for (int $$7 = 0; $$7 < $$3; $$7++) {
            int $$8 = $$2.getInt($$7);
            $$4 += axj.b($$8);
            $$5 += axj.c($$8);
            $$6 += axj.d($$8);
         }

         return axj.a($$4 / $$3, $$5 / $$3, $$6 / $$3);
      }
   }

   @Override
   public MapCodec<fmp> a() {
      return a;
   }
}
