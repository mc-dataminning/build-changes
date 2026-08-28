import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.ints.IntList;
import javax.annotation.Nullable;

public record fry(int b) implements fsa {
   public static final MapCodec<fry> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(azg.i.fieldOf("default").forGetter(fry::b)).apply($$0, fry::new));

   public fry() {
      this(-7697782);
   }

   @Override
   public int a(dak $$0, @Nullable glo $$1, @Nullable byf $$2) {
      dcy $$3 = $$0.a(kl.ai);
      IntList $$4 = $$3 != null ? $$3.b() : IntList.of();
      int $$5 = $$4.size();
      if ($$5 == 0) {
         return this.b;
      } else if ($$5 == 1) {
         return ayh.f($$4.getInt(0));
      } else {
         int $$6 = 0;
         int $$7 = 0;
         int $$8 = 0;

         for (int $$9 = 0; $$9 < $$5; $$9++) {
            int $$10 = $$4.getInt($$9);
            $$6 += ayh.b($$10);
            $$7 += ayh.c($$10);
            $$8 += ayh.d($$10);
         }

         return ayh.a($$6 / $$5, $$7 / $$5, $$8 / $$5);
      }
   }

   @Override
   public MapCodec<fry> a() {
      return a;
   }
}
