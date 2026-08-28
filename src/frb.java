import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.ints.IntList;
import javax.annotation.Nullable;

public record frb(int b) implements frd {
   public static final MapCodec<frb> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ayu.i.fieldOf("default").forGetter(frb::b)).apply($$0, frb::new));

   public frb() {
      this(-7697782);
   }

   @Override
   public int a(czn $$0, @Nullable gkq $$1, @Nullable bxj $$2) {
      dcb $$3 = $$0.a(kk.ai);
      IntList $$4 = $$3 != null ? $$3.b() : IntList.of();
      int $$5 = $$4.size();
      if ($$5 == 0) {
         return this.b;
      } else if ($$5 == 1) {
         return axw.f($$4.getInt(0));
      } else {
         int $$6 = 0;
         int $$7 = 0;
         int $$8 = 0;

         for (int $$9 = 0; $$9 < $$5; $$9++) {
            int $$10 = $$4.getInt($$9);
            $$6 += axw.b($$10);
            $$7 += axw.c($$10);
            $$8 += axw.d($$10);
         }

         return axw.a($$6 / $$5, $$7 / $$5, $$8 / $$5);
      }
   }

   @Override
   public MapCodec<frb> a() {
      return a;
   }
}
