import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.chars.CharArraySet;
import it.unimi.dsi.fastutil.chars.CharSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;

public final class dbt {
   private static final int d = 3;
   public static final char a = ' ';
   public static final MapCodec<dbt> b = dbt.a.a
      .flatXmap(dbt::a, $$0 -> $$0.h.<DataResult>map(DataResult::success).orElseGet(() -> DataResult.error(() -> "Cannot encode unpacked recipe")));
   public static final yn<wa, dbt> c = yn.a(yl.h, $$0 -> $$0.e, yl.h, $$0 -> $$0.f, dba.b.a(yl.a()), $$0 -> $$0.g, dbt::a);
   private final int e;
   private final int f;
   private final List<Optional<dba>> g;
   private final Optional<dbt.a> h;
   private final int i;
   private final boolean j;

   public dbt(int $$0, int $$1, List<Optional<dba>> $$2, Optional<dbt.a> $$3) {
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
      this.h = $$3;
      this.i = (int)$$2.stream().flatMap(Optional::stream).count();
      this.j = af.a($$0, $$1, $$2);
   }

   private static dbt a(Integer $$0, Integer $$1, List<Optional<dba>> $$2) {
      return new dbt($$0, $$1, $$2, Optional.empty());
   }

   public static dbt a(Map<Character, dba> $$0, String... $$1) {
      return a($$0, List.of($$1));
   }

   public static dbt a(Map<Character, dba> $$0, List<String> $$1) {
      dbt.a $$2 = new dbt.a($$0, $$1);
      return (dbt)a($$2).getOrThrow();
   }

   private static DataResult<dbt> a(dbt.a $$0) {
      String[] $$1 = a($$0.c);
      int $$2 = $$1[0].length();
      int $$3 = $$1.length;
      List<Optional<dba>> $$4 = new ArrayList<>($$2 * $$3);
      CharSet $$5 = new CharArraySet($$0.b.keySet());

      for (String $$6 : $$1) {
         for (int $$7 = 0; $$7 < $$6.length(); $$7++) {
            char $$8 = $$6.charAt($$7);
            Optional<dba> $$9;
            if ($$8 == ' ') {
               $$9 = Optional.empty();
            } else {
               dba $$10 = $$0.b.get($$8);
               if ($$10 == null) {
                  return DataResult.error(() -> "Pattern references symbol '" + $$8 + "' but it's not defined in the key");
               }

               $$9 = Optional.of($$10);
            }

            $$5.remove($$8);
            $$4.add($$9);
         }
      }

      return !$$5.isEmpty()
         ? DataResult.error(() -> "Key defines symbols that aren't used in pattern: " + $$5)
         : DataResult.success(new dbt($$2, $$3, $$4, Optional.of($$0)));
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

   public boolean a(das $$0) {
      if ($$0.e() != this.i) {
         return false;
      } else {
         if ($$0.f() == this.e && $$0.g() == this.f) {
            if (!this.j && this.a($$0, true)) {
               return true;
            }

            if (this.a($$0, false)) {
               return true;
            }
         }

         return false;
      }
   }

   private boolean a(das $$0, boolean $$1) {
      for (int $$2 = 0; $$2 < this.f; $$2++) {
         for (int $$3 = 0; $$3 < this.e; $$3++) {
            Optional<dba> $$4;
            if ($$1) {
               $$4 = this.g.get(this.e - $$3 - 1 + $$2 * this.e);
            } else {
               $$4 = this.g.get($$3 + $$2 * this.e);
            }

            cwp $$6 = $$0.a($$3, $$2);
            if (!dba.a($$4, $$6)) {
               return false;
            }
         }
      }

      return true;
   }

   public int a() {
      return this.e;
   }

   public int b() {
      return this.f;
   }

   public List<Optional<dba>> c() {
      return this.g;
   }

   public static record a(Map<Character, dba> b, List<String> c) {
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
      public static final MapCodec<dbt.a> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(ayi.b(e, dba.d).fieldOf("key").forGetter($$0x -> $$0x.b), d.fieldOf("pattern").forGetter($$0x -> $$0x.c)).apply($$0, dbt.a::new)
      );

      public Map<Character, dba> a() {
         return this.b;
      }

      public List<String> b() {
         return this.c;
      }
   }
}
