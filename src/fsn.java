import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.ints.IntList;
import javax.annotation.Nullable;

public record fsn(int b) implements fsp {
   public static final MapCodec<fsn> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ayy.i.fieldOf("default").forGetter(fsn::b)).apply($$0, fsn::new));

   public fsn() {
      this(-7697782);
   }

   @Override
   public int a(daa $$0, @Nullable gmd $$1, @Nullable bxw $$2) {
      dco $$3 = $$0.a(kl.ai);
      IntList $$4 = $$3 != null ? $$3.b() : IntList.of();
      int $$5 = $$4.size();
      if ($$5 == 0) {
         return this.b;
      } else if ($$5 == 1) {
         return aya.f($$4.getInt(0));
      } else {
         int $$6 = 0;
         int $$7 = 0;
         int $$8 = 0;

         for (int $$9 = 0; $$9 < $$5; $$9++) {
            int $$10 = $$4.getInt($$9);
            $$6 += aya.b($$10);
            $$7 += aya.c($$10);
            $$8 += aya.d($$10);
         }

         return aya.a($$6 / $$5, $$7 / $$5, $$8 / $$5);
      }
   }

   @Override
   public MapCodec<fsn> a() {
      return a;
   }
}
