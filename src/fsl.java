import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.ints.IntList;
import javax.annotation.Nullable;

public record fsl(int b) implements fsn {
   public static final MapCodec<fsl> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ayw.i.fieldOf("default").forGetter(fsl::b)).apply($$0, fsl::new));

   public fsl() {
      this(-7697782);
   }

   @Override
   public int a(czy $$0, @Nullable gmb $$1, @Nullable bxu $$2) {
      dcm $$3 = $$0.a(kk.ai);
      IntList $$4 = $$3 != null ? $$3.b() : IntList.of();
      int $$5 = $$4.size();
      if ($$5 == 0) {
         return this.b;
      } else if ($$5 == 1) {
         return axy.f($$4.getInt(0));
      } else {
         int $$6 = 0;
         int $$7 = 0;
         int $$8 = 0;

         for (int $$9 = 0; $$9 < $$5; $$9++) {
            int $$10 = $$4.getInt($$9);
            $$6 += axy.b($$10);
            $$7 += axy.c($$10);
            $$8 += axy.d($$10);
         }

         return axy.a($$6 / $$5, $$7 / $$5, $$8 / $$5);
      }
   }

   @Override
   public MapCodec<fsl> a() {
      return a;
   }
}
