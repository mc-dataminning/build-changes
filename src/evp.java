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

public class evp implements eju {
   static final Logger a = LogUtils.getLogger();
   private final eks b;
   private final eve<evp.b> c;

   evp(eks $$0, eve<evp.b> $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public void close() {
      this.b.close();
   }

   @Nullable
   @Override
   public ejt a(int $$0) {
      return this.c.a($$0);
   }

   @Override
   public IntSet a() {
      return IntSets.unmodifiable(this.c.b());
   }

   public static record a(aey c, int d, int e, int[][] f) implements evq {
      private static final Codec<int[][]> g = arh.a(Codec.STRING.listOf().xmap($$0 -> {
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
      }), evp.a::a);
      public static final MapCodec<evp.a> a = arh.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     aey.a.fieldOf("file").forGetter(evp.a::c),
                     Codec.INT.optionalFieldOf("height", 8).forGetter(evp.a::d),
                     Codec.INT.fieldOf("ascent").forGetter(evp.a::e),
                     g.fieldOf("chars").forGetter(evp.a::f)
                  )
                  .apply($$0, evp.a::new)
         ),
         evp.a::a
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

      private static DataResult<evp.a> a(evp.a $$0) {
         return $$0.e > $$0.d ? DataResult.error(() -> "Ascent " + $$0.e + " higher than height " + $$0.d) : DataResult.success($$0);
      }

      @Override
      public evr a() {
         return evr.a;
      }

      @Override
      public Either<evq.a, evq.b> b() {
         return Either.left(this::a);
      }

      private eju a(anv $$0) throws IOException {
         aey $$1 = this.c.d("textures/");

         evp var22;
         try (InputStream $$2 = $$0.open($$1)) {
            eks $$3 = eks.a(eks.a.a, $$2);
            int $$4 = $$3.a();
            int $$5 = $$3.b();
            int $$6 = $$4 / this.f[0].length;
            int $$7 = $$5 / this.f.length;
            float $$8 = (float)this.d / (float)$$7;
            eve<evp.b> $$9 = new eve<>(evp.b[]::new, evp.b[][]::new);

            for (int $$10 = 0; $$10 < this.f.length; $$10++) {
               int $$11 = 0;

               for (int $$12 : this.f[$$10]) {
                  int $$13 = $$11++;
                  if ($$12 != 0) {
                     int $$14 = this.a($$3, $$6, $$7, $$13, $$10);
                     evp.b $$15 = $$9.a($$12, new evp.b($$8, $$3, $$13 * $$6, $$10 * $$7, $$6, $$7, (int)(0.5 + (double)((float)$$14 * $$8)) + 1, this.e));
                     if ($$15 != null) {
                        evp.a.warn("Codepoint '{}' declared multiple times in {}", Integer.toHexString($$12), $$1);
                     }
                  }
               }
            }

            var22 = new evp($$3, $$9);
         }

         return var22;
      }

      private int a(eks $$0, int $$1, int $$2, int $$3, int $$4) {
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

   static record b(float a, eks b, int c, int d, int e, int f, int g, int h) implements ejt {

      @Override
      public float getAdvance() {
         return (float)this.g;
      }

      @Override
      public evk bake(Function<ejv, evk> $$0) {
         return $$0.apply(new ejv() {
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
               return ejv.super.j() + 7.0F - (float)b.this.h;
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

      public eks d() {
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
