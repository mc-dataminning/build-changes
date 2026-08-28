import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.chars.CharArraySet;
import it.unimi.dsi.fastutil.chars.CharSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;

public final class czi {
   private static final int c = 3;
   public static final MapCodec<czi> a = czi.a.a
      .flatXmap(czi::a, $$0 -> $$0.g.<DataResult>map(DataResult::success).orElseGet(() -> DataResult.error(() -> "Cannot encode unpacked recipe")));
   public static final yx<wk, czi> b = yx.a(czi::a, czi::b);
   private final int d;
   private final int e;
   private final jv<cyw> f;
   private final Optional<czi.a> g;
   private final int h;
   private final boolean i;

   public czi(int $$0, int $$1, jv<cyw> $$2, Optional<czi.a> $$3) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
      int $$4 = 0;

      for (cyw $$5 : $$2) {
         if (!$$5.c()) {
            $$4++;
         }
      }

      this.h = $$4;
      this.i = ad.a($$0, $$1, $$2);
   }

   public static czi a(Map<Character, cyw> $$0, String... $$1) {
      return a($$0, List.of($$1));
   }

   public static czi a(Map<Character, cyw> $$0, List<String> $$1) {
      czi.a $$2 = new czi.a($$0, $$1);
      return (czi)a($$2).getOrThrow();
   }

   private static DataResult<czi> a(czi.a $$0) {
      String[] $$1 = a($$0.c);
      int $$2 = $$1[0].length();
      int $$3 = $$1.length;
      jv<cyw> $$4 = jv.a($$2 * $$3, cyw.a);
      CharSet $$5 = new CharArraySet($$0.b.keySet());

      for (int $$6 = 0; $$6 < $$1.length; $$6++) {
         String $$7 = $$1[$$6];

         for (int $$8 = 0; $$8 < $$7.length(); $$8++) {
            char $$9 = $$7.charAt($$8);
            cyw $$10 = $$9 == ' ' ? cyw.a : $$0.b.get($$9);
            if ($$10 == null) {
               return DataResult.error(() -> "Pattern references symbol '" + $$9 + "' but it's not defined in the key");
            }

            $$5.remove($$9);
            $$4.set($$8 + $$2 * $$6, $$10);
         }
      }

      return !$$5.isEmpty()
         ? DataResult.error(() -> "Key defines symbols that aren't used in pattern: " + $$5)
         : DataResult.success(new czi($$2, $$3, $$4, Optional.of($$0)));
   }

   @VisibleForTesting
   static String[] a(List<String> $$0) {
      int $$1 = Integer.MAX_VALUE;
      int $$2 = 0;
      int $$3 = 0;
      int $$4 = 0;

      for (int $$5 = 0; $$5 < $$0.size(); $$5++) {
         String $$6 = $$0.get($$5);
         $$1 = Math.min($$1, a($$6));
         int $$7 = b($$6);
         $$2 = Math.max($$2, $$7);
         if ($$7 < 0) {
            if ($$3 == $$5) {
               $$3++;
            }

            $$4++;
         } else {
            $$4 = 0;
         }
      }

      if ($$0.size() == $$4) {
         return new String[0];
      } else {
         String[] $$8 = new String[$$0.size() - $$4 - $$3];

         for (int $$9 = 0; $$9 < $$8.length; $$9++) {
            $$8[$$9] = $$0.get($$9 + $$3).substring($$1, $$2 + 1);
         }

         return $$8;
      }
   }

   private static int a(String $$0) {
      int $$1 = 0;

      while ($$1 < $$0.length() && $$0.charAt($$1) == ' ') {
         $$1++;
      }

      return $$1;
   }

   private static int b(String $$0) {
      int $$1 = $$0.length() - 1;

      while ($$1 >= 0 && $$0.charAt($$1) == ' ') {
         $$1--;
      }

      return $$1;
   }

   public boolean a(cyp $$0) {
      if ($$0.e() != this.h) {
         return false;
      } else {
         if ($$0.f() == this.d && $$0.g() == this.e) {
            if (!this.i && this.a($$0, true)) {
               return true;
            }

            if (this.a($$0, false)) {
               return true;
            }
         }

         return false;
      }
   }

   private boolean a(cyp $$0, boolean $$1) {
      for (int $$2 = 0; $$2 < this.e; $$2++) {
         for (int $$3 = 0; $$3 < this.d; $$3++) {
            cyw $$4;
            if ($$1) {
               $$4 = this.f.get(this.d - $$3 - 1 + $$2 * this.d);
            } else {
               $$4 = this.f.get($$3 + $$2 * this.d);
            }

            cuq $$6 = $$0.a($$3, $$2);
            if (!$$4.a($$6)) {
               return false;
            }
         }
      }

      return true;
   }

   private void a(wk $$0) {
      $$0.c(this.d);
      $$0.c(this.e);

      for (cyw $$1 : this.f) {
         cyw.b.encode($$0, $$1);
      }
   }

   private static czi b(wk $$0) {
      int $$1 = $$0.l();
      int $$2 = $$0.l();
      jv<cyw> $$3 = jv.a($$1 * $$2, cyw.a);
      $$3.replaceAll($$1x -> cyw.b.decode($$0));
      return new czi($$1, $$2, $$3, Optional.empty());
   }

   public int a() {
      return this.d;
   }

   public int b() {
      return this.e;
   }

   public jv<cyw> c() {
      return this.f;
   }

   public static record a(Map<Character, cyw> b, List<String> c) {
      private static final Codec<List<String>> d = Codec.STRING.listOf().comapFlatMap($$0 -> {
         if ($$0.size() > 3) {
            return DataResult.error(() -> "Invalid pattern: too many rows, 3 is maximum");
         } else if ($$0.isEmpty()) {
            return DataResult.error(() -> "Invalid pattern: empty pattern not allowed");
         } else {
            int $$1 = ((String)$$0.getFirst()).length();

            for (String $$2 : $$0) {
               if ($$2.length() > 3) {
                  return DataResult.error(() -> "Invalid pattern: too many columns, 3 is maximum");
               }

               if ($$1 != $$2.length()) {
                  return DataResult.error(() -> "Invalid pattern: each row must be the same width");
               }
            }

            return DataResult.success($$0);
         }
      }, Function.identity());
      private static final Codec<Character> e = Codec.STRING.comapFlatMap($$0 -> {
         if ($$0.length() != 1) {
            return DataResult.error(() -> "Invalid key entry: '" + $$0 + "' is an invalid symbol (must be 1 character only).");
         } else {
            return " ".equals($$0) ? DataResult.error(() -> "Invalid key entry: ' ' is a reserved symbol.") : DataResult.success($$0.charAt(0));
         }
      }, String::valueOf);
      public static final MapCodec<czi.a> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(axw.b(e, cyw.d).fieldOf("key").forGetter($$0x -> $$0x.b), d.fieldOf("pattern").forGetter($$0x -> $$0x.c)).apply($$0, czi.a::new)
      );

      public Map<Character, cyw> a() {
         return this.b;
      }

      public List<String> b() {
         return this.c;
      }
   }
}
