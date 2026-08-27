import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.Sets;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.apache.commons.lang3.NotImplementedException;

public class cpa implements coi {
   final int a;
   final int b;
   final ip<coq> c;
   final clo d;
   final String e;
   final coh f;
   final boolean g;

   public cpa(String $$0, coh $$1, int $$2, int $$3, ip<coq> $$4, clo $$5, boolean $$6) {
      this.e = $$0;
      this.f = $$1;
      this.a = $$2;
      this.b = $$3;
      this.c = $$4;
      this.d = $$5;
      this.g = $$6;
   }

   public cpa(String $$0, coh $$1, int $$2, int $$3, ip<coq> $$4, clo $$5) {
      this($$0, $$1, $$2, $$3, $$4, $$5, true);
   }

   @Override
   public cox<?> as_() {
      return cox.a;
   }

   @Override
   public String c() {
      return this.e;
   }

   @Override
   public coh d() {
      return this.f;
   }

   @Override
   public clo a(it $$0) {
      return this.d;
   }

   @Override
   public ip<coq> a() {
      return this.c;
   }

   @Override
   public boolean h() {
      return this.g;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 >= this.a && $$1 >= this.b;
   }

   public boolean a(chh $$0, csf $$1) {
      for (int $$2 = 0; $$2 <= $$0.f() - this.a; $$2++) {
         for (int $$3 = 0; $$3 <= $$0.g() - this.b; $$3++) {
            if (this.a($$0, $$2, $$3, true)) {
               return true;
            }

            if (this.a($$0, $$2, $$3, false)) {
               return true;
            }
         }
      }

      return false;
   }

   private boolean a(chh $$0, int $$1, int $$2, boolean $$3) {
      for (int $$4 = 0; $$4 < $$0.f(); $$4++) {
         for (int $$5 = 0; $$5 < $$0.g(); $$5++) {
            int $$6 = $$4 - $$1;
            int $$7 = $$5 - $$2;
            coq $$8 = coq.a;
            if ($$6 >= 0 && $$7 >= 0 && $$6 < this.a && $$7 < this.b) {
               if ($$3) {
                  $$8 = this.c.get(this.a - $$6 - 1 + $$7 * this.a);
               } else {
                  $$8 = this.c.get($$6 + $$7 * this.a);
               }
            }

            if (!$$8.a($$0.a($$4 + $$5 * $$0.f()))) {
               return false;
            }
         }
      }

      return true;
   }

   public clo a(chh $$0, it $$1) {
      return this.a($$1).p();
   }

   public int j() {
      return this.a;
   }

   public int k() {
      return this.b;
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

   @Override
   public boolean i() {
      ip<coq> $$0 = this.a();
      return $$0.isEmpty() || $$0.stream().filter($$0x -> !$$0x.c()).anyMatch($$0x -> $$0x.a().length == 0);
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

   public static class a implements cox<cpa> {
      static final Codec<List<String>> x = Codec.STRING.listOf().flatXmap($$0 -> {
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
      }, DataResult::success);
      static final Codec<String> y = Codec.STRING.flatXmap($$0 -> {
         if ($$0.length() != 1) {
            return DataResult.error(() -> "Invalid key entry: '" + $$0 + "' is an invalid symbol (must be 1 character only).");
         } else {
            return " ".equals($$0) ? DataResult.error(() -> "Invalid key entry: ' ' is a reserved symbol.") : DataResult.success($$0);
         }
      }, DataResult::success);
      private static final Codec<cpa> z = cpa.a.a.a.flatXmap($$0 -> {
         String[] $$1 = cpa.a($$0.e);
         int $$2 = $$1[0].length();
         int $$3 = $$1.length;
         ip<coq> $$4 = ip.a($$2 * $$3, coq.a);
         Set<String> $$5 = Sets.newHashSet($$0.d.keySet());

         for (int $$6 = 0; $$6 < $$1.length; $$6++) {
            String $$7 = $$1[$$6];

            for (int $$8 = 0; $$8 < $$7.length(); $$8++) {
               String $$9 = $$7.substring($$8, $$8 + 1);
               coq $$10 = $$9.equals(" ") ? coq.a : $$0.d.get($$9);
               if ($$10 == null) {
                  return DataResult.error(() -> "Pattern references symbol '" + $$9 + "' but it's not defined in the key");
               }

               $$5.remove($$9);
               $$4.set($$8 + $$2 * $$6, $$10);
            }
         }

         if (!$$5.isEmpty()) {
            return DataResult.error(() -> "Key defines symbols that aren't used in pattern: " + $$5);
         } else {
            cpa $$11 = new cpa($$0.b, $$0.c, $$2, $$3, $$4, $$0.f, $$0.g);
            return DataResult.success($$11);
         }
      }, $$0 -> {
         throw new NotImplementedException("Serializing ShapedRecipe is not implemented yet.");
      });

      @Override
      public Codec<cpa> a() {
         return z;
      }

      public cpa b(ty $$0) {
         int $$1 = $$0.n();
         int $$2 = $$0.n();
         String $$3 = $$0.s();
         coh $$4 = $$0.b(coh.class);
         ip<coq> $$5 = ip.a($$1 * $$2, coq.a);

         for (int $$6 = 0; $$6 < $$5.size(); $$6++) {
            $$5.set($$6, coq.b($$0));
         }

         clo $$7 = $$0.r();
         boolean $$8 = $$0.readBoolean();
         return new cpa($$3, $$4, $$1, $$2, $$5, $$7, $$8);
      }

      public void a(ty $$0, cpa $$1) {
         $$0.c($$1.a);
         $$0.c($$1.b);
         $$0.a($$1.e);
         $$0.a($$1.f);

         for (coq $$2 : $$1.c) {
            $$2.a($$0);
         }

         $$0.a($$1.d);
         $$0.a($$1.g);
      }

      static record a(String b, coh c, Map<String, coq> d, List<String> e, clo f, boolean g) {
         public static final Codec<cpa.a.a> a = RecordCodecBuilder.create(
            $$0 -> $$0.group(
                     asy.a(Codec.STRING, "group", "").forGetter($$0x -> $$0x.b),
                     coh.e.fieldOf("category").orElse(coh.d).forGetter($$0x -> $$0x.c),
                     asy.d(cpa.a.y, coq.c).fieldOf("key").forGetter($$0x -> $$0x.d),
                     cpa.a.x.fieldOf("pattern").forGetter($$0x -> $$0x.e),
                     coj.a.fieldOf("result").forGetter($$0x -> $$0x.f),
                     asy.a(Codec.BOOL, "show_notification", true).forGetter($$0x -> $$0x.g)
                  )
                  .apply($$0, cpa.a.a::new)
         );

         public String a() {
            return this.b;
         }

         public coh b() {
            return this.c;
         }

         public Map<String, coq> c() {
            return this.d;
         }

         public List<String> d() {
            return this.e;
         }

         public clo e() {
            return this.f;
         }

         public boolean f() {
            return this.g;
         }
      }
   }
}
