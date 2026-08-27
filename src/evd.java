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

public class evd implements eji {
   static final Logger a = LogUtils.getLogger();
   private final ekg b;
   private final eus<evd.b> c;

   evd(ekg $$0, eus<evd.b> $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public void close() {
      this.b.close();
   }

   @Nullable
   @Override
   public ejh a(int $$0) {
      return this.c.a($$0);
   }

   @Override
   public IntSet a() {
      return IntSets.unmodifiable(this.c.b());
   }

   public static record a(aer c, int d, int e, int[][] f) implements eve {
      private static final Codec<int[][]> g = aqy.a(Codec.STRING.listOf().xmap($$0 -> {
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
      }), evd.a::a);
      public static final MapCodec<evd.a> a = aqy.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     aer.a.fieldOf("file").forGetter(evd.a::c),
                     Codec.INT.optionalFieldOf("height", 8).forGetter(evd.a::d),
                     Codec.INT.fieldOf("ascent").forGetter(evd.a::e),
                     g.fieldOf("chars").forGetter(evd.a::f)
                  )
                  .apply($$0, evd.a::new)
         ),
         evd.a::a
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

      private static DataResult<evd.a> a(evd.a $$0) {
         return $$0.e > $$0.d ? DataResult.error(() -> "Ascent " + $$0.e + " higher than height " + $$0.d) : DataResult.success($$0);
      }

      @Override
      public evf a() {
         return evf.a;
      }

      @Override
      public Either<eve.a, eve.b> b() {
         return Either.left(this::a);
      }

      private eji a(anm $$0) throws IOException {
         aer $$1 = this.c.d("textures/");

         evd var22;
         try (InputStream $$2 = $$0.open($$1)) {
            ekg $$3 = ekg.a(ekg.a.a, $$2);
            int $$4 = $$3.a();
            int $$5 = $$3.b();
            int $$6 = $$4 / this.f[0].length;
            int $$7 = $$5 / this.f.length;
            float $$8 = (float)this.d / (float)$$7;
            eus<evd.b> $$9 = new eus<>(evd.b[]::new, evd.b[][]::new);

            for (int $$10 = 0; $$10 < this.f.length; $$10++) {
               int $$11 = 0;

               for (int $$12 : this.f[$$10]) {
                  int $$13 = $$11++;
                  if ($$12 != 0) {
                     int $$14 = this.a($$3, $$6, $$7, $$13, $$10);
                     evd.b $$15 = $$9.a($$12, new evd.b($$8, $$3, $$13 * $$6, $$10 * $$7, $$6, $$7, (int)(0.5 + (double)((float)$$14 * $$8)) + 1, this.e));
                     if ($$15 != null) {
                        evd.a.warn("Codepoint '{}' declared multiple times in {}", Integer.toHexString($$12), $$1);
                     }
                  }
               }
            }

            var22 = new evd($$3, $$9);
         }

         return var22;
      }

      private int a(ekg $$0, int $$1, int $$2, int $$3, int $$4) {
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

   static record b(float a, ekg b, int c, int d, int e, int f, int g, int h) implements ejh {

      @Override
      public float getAdvance() {
         return (float)this.g;
      }

      @Override
      public euy bake(Function<ejj, euy> $$0) {
         return $$0.apply(new ejj() {
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
               return ejj.super.j() + 7.0F - (float)b.this.h;
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

      public ekg d() {
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
