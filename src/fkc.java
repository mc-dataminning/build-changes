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

public class fkc implements exz {
   static final Logger b = LogUtils.getLogger();
   private final eyx c;
   private final fjq<fkc.b> d;

   fkc(eyx $$0, fjq<fkc.b> $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   @Override
   public void close() {
      this.c.close();
   }

   @Nullable
   @Override
   public exy a(int $$0) {
      return this.d.a($$0);
   }

   @Override
   public IntSet a() {
      return IntSets.unmodifiable(this.d.b());
   }

   public static record a(ale c, int d, int e, int[][] f) implements fke {
      private static final Codec<int[][]> g = Codec.STRING.listOf().xmap($$0 -> {
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
      }).validate(fkc.a::a);
      public static final MapCodec<fkc.a> a = RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     ale.a.fieldOf("file").forGetter(fkc.a::c),
                     Codec.INT.optionalFieldOf("height", 8).forGetter(fkc.a::d),
                     Codec.INT.fieldOf("ascent").forGetter(fkc.a::e),
                     g.fieldOf("chars").forGetter(fkc.a::f)
                  )
                  .apply($$0, fkc.a::new)
         )
         .validate(fkc.a::a);

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

      private static DataResult<fkc.a> a(fkc.a $$0) {
         return $$0.e > $$0.d ? DataResult.error(() -> "Ascent " + $$0.e + " higher than height " + $$0.d) : DataResult.success($$0);
      }

      @Override
      public fkf a() {
         return fkf.a;
      }

      @Override
      public Either<fke.b, fke.c> b() {
         return Either.left(this::a);
      }

      private exz a(auo $$0) throws IOException {
         ale $$1 = this.c.d("textures/");

         fkc var22;
         try (InputStream $$2 = $$0.open($$1)) {
            eyx $$3 = eyx.a(eyx.a.a, $$2);
            int $$4 = $$3.a();
            int $$5 = $$3.b();
            int $$6 = $$4 / this.f[0].length;
            int $$7 = $$5 / this.f.length;
            float $$8 = (float)this.d / (float)$$7;
            fjq<fkc.b> $$9 = new fjq<>(fkc.b[]::new, fkc.b[][]::new);

            for (int $$10 = 0; $$10 < this.f.length; $$10++) {
               int $$11 = 0;

               for (int $$12 : this.f[$$10]) {
                  int $$13 = $$11++;
                  if ($$12 != 0) {
                     int $$14 = this.a($$3, $$6, $$7, $$13, $$10);
                     fkc.b $$15 = $$9.a($$12, new fkc.b($$8, $$3, $$13 * $$6, $$10 * $$7, $$6, $$7, (int)(0.5 + (double)((float)$$14 * $$8)) + 1, this.e));
                     if ($$15 != null) {
                        fkc.b.warn("Codepoint '{}' declared multiple times in {}", Integer.toHexString($$12), $$1);
                     }
                  }
               }
            }

            var22 = new fkc($$3, $$9);
         }

         return var22;
      }

      private int a(eyx $$0, int $$1, int $$2, int $$3, int $$4) {
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

   static record b(float a, eyx b, int c, int d, int e, int f, int g, int h) implements exy {

      @Override
      public float getAdvance() {
         return (float)this.g;
      }

      @Override
      public fjx bake(Function<eya, fjx> $$0) {
         return $$0.apply(new eya() {
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

      public eyx d() {
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
