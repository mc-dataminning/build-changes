import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.ints.IntList;
import javax.annotation.Nullable;

public record fno(int b) implements fnq {
   public static final MapCodec<fno> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ayi.i.fieldOf("default").forGetter(fno::b)).apply($$0, fno::new));

   public fno() {
      this(-7697782);
   }

   @Override
   public int a(cxh $$0, @Nullable ggy $$1, @Nullable bvy $$2) {
      czu $$3 = $$0.a(kv.ag);
      IntList $$4 = $$3 != null ? $$3.b() : IntList.of();
      int $$5 = $$4.size();
      if ($$5 == 0) {
         return this.b;
      } else if ($$5 == 1) {
         return axk.f($$4.getInt(0));
      } else {
         int $$6 = 0;
         int $$7 = 0;
         int $$8 = 0;

         for (int $$9 = 0; $$9 < $$5; $$9++) {
            int $$10 = $$4.getInt($$9);
            $$6 += axk.b($$10);
            $$7 += axk.c($$10);
            $$8 += axk.d($$10);
         }

         return axk.a($$6 / $$5, $$7 / $$5, $$8 / $$5);
      }
   }

   @Override
   public MapCodec<fno> a() {
      return a;
   }
}
