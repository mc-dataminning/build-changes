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

public record cwo(int c, int d, je<cwd> e, Optional<cwo.a> f) {
   private static final int g = 3;
   public static final MapCodec<cwo> a = cwo.a.a
      .flatXmap(cwo::a, $$0 -> $$0.d().<DataResult>map(DataResult::success).orElseGet(() -> DataResult.error(() -> "Cannot encode unpacked recipe")));
   public static final yq<wd, cwo> b = yq.a(cwo::a, cwo::b);

   public static cwo a(Map<Character, cwd> $$0, String... $$1) {
      return a($$0, List.of($$1));
   }

   public static cwo a(Map<Character, cwd> $$0, List<String> $$1) {
      cwo.a $$2 = new cwo.a($$0, $$1);
      return ac.a(a($$2), IllegalArgumentException::new);
   }

   private static DataResult<cwo> a(cwo.a $$0) {
      String[] $$1 = a($$0.c);
      int $$2 = $$1[0].length();
      int $$3 = $$1.length;
      je<cwd> $$4 = je.a($$2 * $$3, cwd.a);
      CharSet $$5 = new CharArraySet($$0.b.keySet());

      for (int $$6 = 0; $$6 < $$1.length; $$6++) {
         String $$7 = $$1[$$6];

         for (int $$8 = 0; $$8 < $$7.length(); $$8++) {
            char $$9 = $$7.charAt($$8);
            cwd $$10 = $$9 == ' ' ? cwd.a : $$0.b.get($$9);
            if ($$10 == null) {
               return DataResult.error(() -> "Pattern references symbol '" + $$9 + "' but it's not defined in the key");
            }

            $$5.remove($$9);
            $$4.set($$8 + $$2 * $$6, $$10);
         }
      }

      return !$$5.isEmpty()
         ? DataResult.error(() -> "Key defines symbols that aren't used in pattern: " + $$5)
         : DataResult.success(new cwo($$2, $$3, $$4, Optional.of($$0)));
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

   public boolean a(cnx $$0) {
      for (int $$1 = 0; $$1 <= $$0.f() - this.c; $$1++) {
         for (int $$2 = 0; $$2 <= $$0.g() - this.d; $$2++) {
            if (this.a($$0, $$1, $$2, true)) {
               return true;
            }

            if (this.a($$0, $$1, $$2, false)) {
               return true;
            }
         }
      }

      return false;
   }

   private boolean a(cnx $$0, int $$1, int $$2, boolean $$3) {
      for (int $$4 = 0; $$4 < $$0.f(); $$4++) {
         for (int $$5 = 0; $$5 < $$0.g(); $$5++) {
            int $$6 = $$4 - $$1;
            int $$7 = $$5 - $$2;
            cwd $$8 = cwd.a;
            if ($$6 >= 0 && $$7 >= 0 && $$6 < this.c && $$7 < this.d) {
               if ($$3) {
                  $$8 = this.e.get(this.c - $$6 - 1 + $$7 * this.c);
               } else {
                  $$8 = this.e.get($$6 + $$7 * this.c);
               }
            }

            if (!$$8.a($$0.a($$4 + $$5 * $$0.f()))) {
               return false;
            }
         }
      }

      return true;
   }

   private void a(wd $$0) {
      $$0.c(this.c);
      $$0.c(this.d);

      for (cwd $$1 : this.e) {
         cwd.b.encode($$0, $$1);
      }
   }

   private static cwo b(wd $$0) {
      int $$1 = $$0.l();
      int $$2 = $$0.l();
      je<cwd> $$3 = je.a($$1 * $$2, cwd.a);
      $$3.replaceAll($$1x -> cwd.b.decode($$0));
      return new cwo($$1, $$2, $$3, Optional.empty());
   }

   public int a() {
      return this.c;
   }

   public int b() {
      return this.d;
   }

   public je<cwd> c() {
      return this.e;
   }

   public Optional<cwo.a> d() {
      return this.f;
   }

   public static record a(Map<Character, cwd> b, List<String> c) {
      private static final Codec<List<String>> d = Codec.STRING.listOf().comapFlatMap($$0 -> {
         if ($$0.size() > 3) {
            return DataResult.error(() -> "Invalid pattern: too many rows, 3 is maximum");
         } else if ($$0.isEmpty()) {
            return DataResult.error(() -> "Invalid pattern: empty pattern not allowed");
         } else {
            int $$1 = ((String)$$0.get(0)).length();

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
      public static final MapCodec<cwo.a> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(axe.d(e, cwd.d).fieldOf("key").forGetter($$0x -> $$0x.b), d.fieldOf("pattern").forGetter($$0x -> $$0x.c)).apply($$0, cwo.a::new)
      );

      public Map<Character, cwd> a() {
         return this.b;
      }

      public List<String> b() {
         return this.c;
      }
   }
}
