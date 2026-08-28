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

public record czc(int c, int d, jr<cyr> e, Optional<czc.a> f) {
   private static final int g = 3;
   public static final MapCodec<czc> a = czc.a.a
      .flatXmap(czc::a, $$0 -> $$0.d().<DataResult>map(DataResult::success).orElseGet(() -> DataResult.error(() -> "Cannot encode unpacked recipe")));
   public static final zm<wz, czc> b = zm.a(czc::a, czc::b);

   public static czc a(Map<Character, cyr> $$0, String... $$1) {
      return a($$0, List.of($$1));
   }

   public static czc a(Map<Character, cyr> $$0, List<String> $$1) {
      czc.a $$2 = new czc.a($$0, $$1);
      return (czc)a($$2).getOrThrow();
   }

   private static DataResult<czc> a(czc.a $$0) {
      String[] $$1 = a($$0.c);
      int $$2 = $$1[0].length();
      int $$3 = $$1.length;
      jr<cyr> $$4 = jr.a($$2 * $$3, cyr.a);
      CharSet $$5 = new CharArraySet($$0.b.keySet());

      for (int $$6 = 0; $$6 < $$1.length; $$6++) {
         String $$7 = $$1[$$6];

         for (int $$8 = 0; $$8 < $$7.length(); $$8++) {
            char $$9 = $$7.charAt($$8);
            cyr $$10 = $$9 == ' ' ? cyr.a : $$0.b.get($$9);
            if ($$10 == null) {
               return DataResult.error(() -> "Pattern references symbol '" + $$9 + "' but it's not defined in the key");
            }

            $$5.remove($$9);
            $$4.set($$8 + $$2 * $$6, $$10);
         }
      }

      return !$$5.isEmpty()
         ? DataResult.error(() -> "Key defines symbols that aren't used in pattern: " + $$5)
         : DataResult.success(new czc($$2, $$3, $$4, Optional.of($$0)));
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

   public boolean a(cqj $$0) {
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

   private boolean a(cqj $$0, int $$1, int $$2, boolean $$3) {
      for (int $$4 = 0; $$4 < $$0.f(); $$4++) {
         for (int $$5 = 0; $$5 < $$0.g(); $$5++) {
            int $$6 = $$4 - $$1;
            int $$7 = $$5 - $$2;
            cyr $$8 = cyr.a;
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

   private void a(wz $$0) {
      $$0.c(this.c);
      $$0.c(this.d);

      for (cyr $$1 : this.e) {
         cyr.b.encode($$0, $$1);
      }
   }

   private static czc b(wz $$0) {
      int $$1 = $$0.l();
      int $$2 = $$0.l();
      jr<cyr> $$3 = jr.a($$1 * $$2, cyr.a);
      $$3.replaceAll($$1x -> cyr.b.decode($$0));
      return new czc($$1, $$2, $$3, Optional.empty());
   }

   public int a() {
      return this.c;
   }

   public int b() {
      return this.d;
   }

   public jr<cyr> c() {
      return this.e;
   }

   public Optional<czc.a> d() {
      return this.f;
   }

   public static record a(Map<Character, cyr> b, List<String> c) {
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
      public static final MapCodec<czc.a> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(ayg.b(e, cyr.d).fieldOf("key").forGetter($$0x -> $$0x.b), d.fieldOf("pattern").forGetter($$0x -> $$0x.c)).apply($$0, czc.a::new)
      );

      public Map<Character, cyr> a() {
         return this.b;
      }

      public List<String> b() {
         return this.c;
      }
   }
}
