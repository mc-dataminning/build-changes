import it.unimi.dsi.fastutil.ints.IntOpenHashSet;
import it.unimi.dsi.fastutil.ints.IntSet;
import java.util.Arrays;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public class fju<T> {
   private static final int a = 8;
   private static final int b = 256;
   private static final int c = 255;
   private static final int d = 4351;
   private static final int e = 4352;
   private final T[] f;
   private final T[][] g;
   private final IntFunction<T[]> h;

   public fju(IntFunction<T[]> $$0, IntFunction<T[][]> $$1) {
      this.f = (T[])((Object[])$$0.apply(256));
      this.g = (T[][])((Object[][])$$1.apply(4352));
      Arrays.fill(this.g, this.f);
      this.h = $$0;
   }

   public void a() {
      Arrays.fill(this.g, this.f);
   }

   @Nullable
   public T a(int $$0) {
      int $$1 = $$0 >> 8;
      int $$2 = $$0 & 0xFF;
      return this.g[$$1][$$2];
   }

   @Nullable
   public T a(int $$0, T $$1) {
      int $$2 = $$0 >> 8;
      int $$3 = $$0 & 0xFF;
      T[] $$4 = this.g[$$2];
      if ($$4 == this.f) {
         $$4 = (T[])((Object[])this.h.apply(256));
         this.g[$$2] = $$4;
         $$4[$$3] = $$1;
         return null;
      } else {
         T $$5 = $$4[$$3];
         $$4[$$3] = $$1;
         return $$5;
      }
   }

   public T a(int $$0, IntFunction<T> $$1) {
      int $$2 = $$0 >> 8;
      int $$3 = $$0 & 0xFF;
      T[] $$4 = this.g[$$2];
      T $$5 = $$4[$$3];
      if ($$5 != null) {
         return $$5;
      } else {
         if ($$4 == this.f) {
            $$4 = (T[])((Object[])this.h.apply(256));
            this.g[$$2] = $$4;
         }

         T $$6 = $$1.apply($$0);
         $$4[$$3] = $$6;
         return $$6;
      }
   }

   @Nullable
   public T b(int $$0) {
      int $$1 = $$0 >> 8;
      int $$2 = $$0 & 0xFF;
      T[] $$3 = this.g[$$1];
      if ($$3 == this.f) {
         return null;
      } else {
         T $$4 = $$3[$$2];
         $$3[$$2] = null;
         return $$4;
      }
   }

   public void a(fju.a<T> $$0) {
      for (int $$1 = 0; $$1 < this.g.length; $$1++) {
         T[] $$2 = this.g[$$1];
         if ($$2 != this.f) {
            for (int $$3 = 0; $$3 < $$2.length; $$3++) {
               T $$4 = $$2[$$3];
               if ($$4 != null) {
                  int $$5 = $$1 << 8 | $$3;
                  $$0.accept($$5, $$4);
               }
            }
         }
      }
   }

   public IntSet b() {
      IntOpenHashSet $$0 = new IntOpenHashSet();
      this.a(($$1, $$2) -> $$0.add($$1));
      return $$0;
   }

   @FunctionalInterface
   public interface a<T> {
      void accept(int var1, T var2);
   }
}
