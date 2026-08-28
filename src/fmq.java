import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.ints.IntList;
import javax.annotation.Nullable;

public record fmq(int b) implements fms {
   public static final MapCodec<fmq> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ayi.i.fieldOf("default").forGetter(fmq::b)).apply($$0, fmq::new));

   public fmq() {
      this(-7697782);
   }

   @Override
   public int a(cwo $$0, @Nullable gfy $$1, @Nullable bvg $$2) {
      czd $$3 = $$0.a(kv.ae);
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
   public MapCodec<fmq> a() {
      return a;
   }
}
