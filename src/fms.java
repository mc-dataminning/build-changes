import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.ints.IntList;
import javax.annotation.Nullable;

public record fms(int b) implements fmu {
   public static final MapCodec<fms> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ayi.i.fieldOf("default").forGetter(fms::b)).apply($$0, fms::new));

   public fms() {
      this(-7697782);
   }

   @Override
   public int a(cwq $$0, @Nullable gga $$1, @Nullable bvi $$2) {
      czf $$3 = $$0.a(kv.ae);
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
   public MapCodec<fms> a() {
      return a;
   }
}
