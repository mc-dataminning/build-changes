import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.ints.IntList;
import javax.annotation.Nullable;

public record fpo(int b) implements fpq {
   public static final MapCodec<fpo> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ays.i.fieldOf("default").forGetter(fpo::b)).apply($$0, fpo::new));

   public fpo() {
      this(-7697782);
   }

   @Override
   public int a(cys $$0, @Nullable gjd $$1, @Nullable bwz $$2) {
      dbg $$3 = $$0.a(kj.ai);
      IntList $$4 = $$3 != null ? $$3.b() : IntList.of();
      int $$5 = $$4.size();
      if ($$5 == 0) {
         return this.b;
      } else if ($$5 == 1) {
         return axu.f($$4.getInt(0));
      } else {
         int $$6 = 0;
         int $$7 = 0;
         int $$8 = 0;

         for (int $$9 = 0; $$9 < $$5; $$9++) {
            int $$10 = $$4.getInt($$9);
            $$6 += axu.b($$10);
            $$7 += axu.c($$10);
            $$8 += axu.d($$10);
         }

         return axu.a($$6 / $$5, $$7 / $$5, $$8 / $$5);
      }
   }

   @Override
   public MapCodec<fpo> a() {
      return a;
   }
}
