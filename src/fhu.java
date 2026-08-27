import com.mojang.datafixers.util.Either;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.ints.IntSet;
import it.unimi.dsi.fastutil.ints.IntSets;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fhu implements evq {
   static final Logger b = LogUtils.getLogger();
   private final ewo c;
   private final fhi<fhu.b> d;

   fhu(ewo $$0, fhi<fhu.b> $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   @Override
   public void close() {
      this.c.close();
   }

   @Nullable
   @Override
   public evp a(int $$0) {
      return this.d.a($$0);
   }

   @Override
   public IntSet a() {
      return IntSets.unmodifiable(this.d.b());
   }

   public static record a(akf c, int d, int e, int[][] f) implements fhw {
      private static final Codec<int[][]> g = axe.b(Codec.STRING.listOf().xmap($$0 -> {
         int $$1 = $$0.size();
         int[][] $$2 = new int[$$1][];

         for (int $$3 = 0; $$3 < $$1; $$3++) {
            $$2[$$3] = ((String)$$0.get($$3)).codePoints().toArray();
         }

         return $$2;
      }, $$0 -> {
         List<String> $$1 = new ArrayList<>($$0.length);

         for (int[] $$2 : $$0) {
            $$1.add(new String($$2, 0, $$2.length));
         }

         return $$1;
      }), fhu.a::a);
      public static final MapCodec<fhu.a> a = axe.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     akf.a.fieldOf("file").forGetter(fhu.a::c),
                     Codec.INT.optionalFieldOf("height", 8).forGetter(fhu.a::d),
                     Codec.INT.fieldOf("ascent").forGetter(fhu.a::e),
                     g.fieldOf("chars").forGetter(fhu.a::f)
                  )
                  .apply($$0, fhu.a::new)
         ),
         fhu.a::a
      );

      private static DataResult<int[][]> a(int[][] $$0) {
         int $$1 = $$0.length;
         if ($$1 == 0) {
            return DataResult.error(() -> "Expected to find data in codepoint grid");
         } else {
            int[] $$2 = $$0[0];
            int $$3 = $$2.length;
            if ($$3 == 0) {
               return DataResult.error(() -> "Expected to find data in codepoint grid");
            } else {
               for (int $$4 = 1; $$4 < $$1; $$4++) {
                  int[] $$5 = $$0[$$4];
                  if ($$5.length != $$3) {
                     return DataResult.error(
                        () -> "Lines in codepoint grid have to be the same length (found: "
                              + $$5.length
                              + " codepoints, expected: "
                              + $$3
                              + "), pad with \\u0000"
                     );
                  }
               }

               return DataResult.success($$0);
            }
         }
      }

      private static DataResult<fhu.a> a(fhu.a $$0) {
         return $$0.e > $$0.d ? DataResult.error(() -> "Ascent " + $$0.e + " higher than height " + $$0.d) : DataResult.success($$0);
      }

      @Override
      public fhx a() {
         return fhx.a;
      }

      @Override
      public Either<fhw.b, fhw.c> b() {
         return Either.left(this::a);
      }

      private evq a(ato $$0) throws IOException {
         akf $$1 = this.c.d("textures/");

         fhu var22;
         try (InputStream $$2 = $$0.open($$1)) {
            ewo $$3 = ewo.a(ewo.a.a, $$2);
            int $$4 = $$3.a();
            int $$5 = $$3.b();
            int $$6 = $$4 / this.f[0].length;
            int $$7 = $$5 / this.f.length;
            float $$8 = (float)this.d / (float)$$7;
            fhi<fhu.b> $$9 = new fhi<>(fhu.b[]::new, fhu.b[][]::new);

            for (int $$10 = 0; $$10 < this.f.length; $$10++) {
               int $$11 = 0;

               for (int $$12 : this.f[$$10]) {
                  int $$13 = $$11++;
                  if ($$12 != 0) {
                     int $$14 = this.a($$3, $$6, $$7, $$13, $$10);
                     fhu.b $$15 = $$9.a($$12, new fhu.b($$8, $$3, $$13 * $$6, $$10 * $$7, $$6, $$7, (int)(0.5 + (double)((float)$$14 * $$8)) + 1, this.e));
                     if ($$15 != null) {
                        fhu.b.warn("Codepoint '{}' declared multiple times in {}", Integer.toHexString($$12), $$1);
                     }
                  }
               }
            }

            var22 = new fhu($$3, $$9);
         }

         return var22;
      }

      private int a(ewo $$0, int $$1, int $$2, int $$3, int $$4) {
         int $$5;
         for ($$5 = $$1 - 1; $$5 >= 0; $$5--) {
            int $$6 = $$3 * $$1 + $$5;

            for (int $$7 = 0; $$7 < $$2; $$7++) {
               int $$8 = $$4 * $$2 + $$7;
               if ($$0.e($$6, $$8) != 0) {
                  return $$5 + 1;
               }
            }
         }

         return $$5 + 1;
      }
   }

   static record b(float a, ewo b, int c, int d, int e, int f, int g, int h) implements evp {

      @Override
      public float getAdvance() {
         return (float)this.g;
      }

      @Override
      public fhp bake(Function<evr, fhp> $$0) {
         return $$0.apply(new evr() {
            @Override
            public float d() {
               return 1.0F / b.this.a;
            }

            @Override
            public int a() {
               return b.this.e;
            }

            @Override
            public int b() {
               return b.this.f;
            }

            @Override
            public float j() {
               return (float)b.this.h;
            }

            @Override
            public void a(int $$0, int $$1) {
               b.this.b.a(0, $$0, $$1, b.this.c, b.this.d, b.this.e, b.this.f, false, false);
            }

            @Override
            public boolean c() {
               return b.this.b.c().a() > 1;
            }
         });
      }

      public float c() {
         return this.a;
      }

      public ewo d() {
         return this.b;
      }

      public int e() {
         return this.c;
      }

      public int f() {
         return this.d;
      }

      public int g() {
         return this.e;
      }

      public int h() {
         return this.f;
      }

      public int i() {
         return this.g;
      }

      public int j() {
         return this.h;
      }
   }
}
