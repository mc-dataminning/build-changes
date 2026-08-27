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

public class exk implements eln {
   static final Logger a = LogUtils.getLogger();
   private final eml b;
   private final ewz<exk.b> c;

   exk(eml $$0, ewz<exk.b> $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public void close() {
      this.b.close();
   }

   @Nullable
   @Override
   public elm a(int $$0) {
      return this.c.a($$0);
   }

   @Override
   public IntSet a() {
      return IntSets.unmodifiable(this.c.b());
   }

   public static record a(agg c, int d, int e, int[][] f) implements exl {
      private static final Codec<int[][]> g = asq.a(Codec.STRING.listOf().xmap($$0 -> {
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
      }), exk.a::a);
      public static final MapCodec<exk.a> a = asq.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     agg.a.fieldOf("file").forGetter(exk.a::c),
                     Codec.INT.optionalFieldOf("height", 8).forGetter(exk.a::d),
                     Codec.INT.fieldOf("ascent").forGetter(exk.a::e),
                     g.fieldOf("chars").forGetter(exk.a::f)
                  )
                  .apply($$0, exk.a::new)
         ),
         exk.a::a
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

      private static DataResult<exk.a> a(exk.a $$0) {
         return $$0.e > $$0.d ? DataResult.error(() -> "Ascent " + $$0.e + " higher than height " + $$0.d) : DataResult.success($$0);
      }

      @Override
      public exm a() {
         return exm.a;
      }

      @Override
      public Either<exl.a, exl.b> b() {
         return Either.left(this::a);
      }

      private eln a(apd $$0) throws IOException {
         agg $$1 = this.c.d("textures/");

         exk var22;
         try (InputStream $$2 = $$0.open($$1)) {
            eml $$3 = eml.a(eml.a.a, $$2);
            int $$4 = $$3.a();
            int $$5 = $$3.b();
            int $$6 = $$4 / this.f[0].length;
            int $$7 = $$5 / this.f.length;
            float $$8 = (float)this.d / (float)$$7;
            ewz<exk.b> $$9 = new ewz<>(exk.b[]::new, exk.b[][]::new);

            for (int $$10 = 0; $$10 < this.f.length; $$10++) {
               int $$11 = 0;

               for (int $$12 : this.f[$$10]) {
                  int $$13 = $$11++;
                  if ($$12 != 0) {
                     int $$14 = this.a($$3, $$6, $$7, $$13, $$10);
                     exk.b $$15 = $$9.a($$12, new exk.b($$8, $$3, $$13 * $$6, $$10 * $$7, $$6, $$7, (int)(0.5 + (double)((float)$$14 * $$8)) + 1, this.e));
                     if ($$15 != null) {
                        exk.a.warn("Codepoint '{}' declared multiple times in {}", Integer.toHexString($$12), $$1);
                     }
                  }
               }
            }

            var22 = new exk($$3, $$9);
         }

         return var22;
      }

      private int a(eml $$0, int $$1, int $$2, int $$3, int $$4) {
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

   static record b(float a, eml b, int c, int d, int e, int f, int g, int h) implements elm {

      @Override
      public float getAdvance() {
         return (float)this.g;
      }

      @Override
      public exf bake(Function<elo, exf> $$0) {
         return $$0.apply(new elo() {
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
               return elo.super.j() + 7.0F - (float)b.this.h;
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

      public eml d() {
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
