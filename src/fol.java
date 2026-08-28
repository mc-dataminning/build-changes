import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.ints.IntList;
import javax.annotation.Nullable;

public record fol(int b) implements fon {
   public static final MapCodec<fol> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ays.i.fieldOf("default").forGetter(fol::b)).apply($$0, fol::new));

   public fol() {
      this(-7697782);
   }

   @Override
   public int a(cxy $$0, @Nullable ghz $$1, @Nullable bwr $$2) {
      dak $$3 = $$0.a(kx.ag);
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
   public MapCodec<fol> a() {
      return a;
   }
}
