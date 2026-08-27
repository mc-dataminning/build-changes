import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSyntaxException;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class cme implements clq {
   final int a;
   final int b;
   final ho<clw> c;
   final ciw d;
   private final aep e;
   final String f;
   final clp g;
   final boolean h;

   public cme(aep $$0, String $$1, clp $$2, int $$3, int $$4, ho<clw> $$5, ciw $$6, boolean $$7) {
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
      this.a = $$3;
      this.b = $$4;
      this.c = $$5;
      this.d = $$6;
      this.h = $$7;
   }

   public cme(aep $$0, String $$1, clp $$2, int $$3, int $$4, ho<clw> $$5, ciw $$6) {
      this($$0, $$1, $$2, $$3, $$4, $$5, $$6, true);
   }

   @Override
   public aep e() {
      return this.e;
   }

   @Override
   public cmb<?> aj_() {
      return cmb.a;
   }

   @Override
   public String c() {
      return this.f;
   }

   @Override
   public clp d() {
      return this.g;
   }

   @Override
   public ciw a(ht $$0) {
      return this.d;
   }

   @Override
   public ho<clw> a() {
      return this.c;
   }

   @Override
   public boolean i() {
      return this.h;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 >= this.a && $$1 >= this.b;
   }

   public boolean a(ceq $$0, cpk $$1) {
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

   private boolean a(ceq $$0, int $$1, int $$2, boolean $$3) {
      for (int $$4 = 0; $$4 < $$0.f(); $$4++) {
         for (int $$5 = 0; $$5 < $$0.g(); $$5++) {
            int $$6 = $$4 - $$1;
            int $$7 = $$5 - $$2;
            clw $$8 = clw.a;
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

   public ciw a(ceq $$0, ht $$1) {
      return this.a($$1).p();
   }

   public int k() {
      return this.a;
   }

   public int l() {
      return this.b;
   }

   static ho<clw> a(String[] $$0, Map<String, clw> $$1, int $$2, int $$3) {
      ho<clw> $$4 = ho.a($$2 * $$3, clw.a);
      Set<String> $$5 = Sets.newHashSet($$1.keySet());
      $$5.remove(" ");

      for (int $$6 = 0; $$6 < $$0.length; $$6++) {
         for (int $$7 = 0; $$7 < $$0[$$6].length(); $$7++) {
            String $$8 = $$0[$$6].substring($$7, $$7 + 1);
            clw $$9 = $$1.get($$8);
            if ($$9 == null) {
               throw new JsonSyntaxException("Pattern references symbol '" + $$8 + "' but it's not defined in the key");
            }

            $$5.remove($$8);
            $$4.set($$7 + $$2 * $$6, $$9);
         }
      }

      if (!$$5.isEmpty()) {
         throw new JsonSyntaxException("Key defines symbols that aren't used in pattern: " + $$5);
      } else {
         return $$4;
      }
   }

   @VisibleForTesting
   static String[] a(String... $$0) {
      int $$1 = Integer.MAX_VALUE;
      int $$2 = 0;
      int $$3 = 0;
      int $$4 = 0;

      for (int $$5 = 0; $$5 < $$0.length; $$5++) {
         String $$6 = $$0[$$5];
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

      if ($$0.length == $$4) {
         return new String[0];
      } else {
         String[] $$8 = new String[$$0.length - $$4 - $$3];

         for (int $$9 = 0; $$9 < $$8.length; $$9++) {
            $$8[$$9] = $$0[$$9 + $$3].substring($$1, $$2 + 1);
         }

         return $$8;
      }
   }

   @Override
   public boolean j() {
      ho<clw> $$0 = this.a();
      return $$0.isEmpty() || $$0.stream().filter($$0x -> !$$0x.d()).anyMatch($$0x -> $$0x.a().length == 0);
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

   static String[] a(JsonArray $$0) {
      String[] $$1 = new String[$$0.size()];
      if ($$1.length > 3) {
         throw new JsonSyntaxException("Invalid pattern: too many rows, 3 is maximum");
      } else if ($$1.length == 0) {
         throw new JsonSyntaxException("Invalid pattern: empty pattern not allowed");
      } else {
         for (int $$2 = 0; $$2 < $$1.length; $$2++) {
            String $$3 = arf.a($$0.get($$2), "pattern[" + $$2 + "]");
            if ($$3.length() > 3) {
               throw new JsonSyntaxException("Invalid pattern: too many columns, 3 is maximum");
            }

            if ($$2 > 0 && $$1[0].length() != $$3.length()) {
               throw new JsonSyntaxException("Invalid pattern: each row must be the same width");
            }

            $$1[$$2] = $$3;
         }

         return $$1;
      }
   }

   static Map<String, clw> c(JsonObject $$0) {
      Map<String, clw> $$1 = Maps.newHashMap();

      for (Entry<String, JsonElement> $$2 : $$0.entrySet()) {
         if ($$2.getKey().length() != 1) {
            throw new JsonSyntaxException("Invalid key entry: '" + $$2.getKey() + "' is an invalid symbol (must be 1 character only).");
         }

         if (" ".equals($$2.getKey())) {
            throw new JsonSyntaxException("Invalid key entry: ' ' is a reserved symbol.");
         }

         $$1.put($$2.getKey(), clw.a($$2.getValue(), false));
      }

      $$1.put(" ", clw.a);
      return $$1;
   }

   public static ciw a(JsonObject $$0) {
      cir $$1 = b($$0);
      if ($$0.has("data")) {
         throw new JsonParseException("Disallowed data tag found");
      } else {
         int $$2 = arf.a($$0, "count", 1);
         if ($$2 < 1) {
            throw new JsonSyntaxException("Invalid output count: " + $$2);
         } else {
            return new ciw($$1, $$2);
         }
      }
   }

   public static cir b(JsonObject $$0) {
      String $$1 = arf.i($$0, "item");
      cir $$2 = jc.i.b(aep.a($$1)).orElseThrow(() -> new JsonSyntaxException("Unknown item '" + $$1 + "'"));
      if ($$2 == ciz.a) {
         throw new JsonSyntaxException("Empty ingredient not allowed here");
      } else {
         return $$2;
      }
   }

   public static class a implements cmb<cme> {
      public cme b(aep $$0, JsonObject $$1) {
         String $$2 = arf.a($$1, "group", "");
         clp $$3 = clp.e.a(arf.a($$1, "category", null), clp.d);
         Map<String, clw> $$4 = cme.c(arf.u($$1, "key"));
         String[] $$5 = cme.a(cme.a(arf.v($$1, "pattern")));
         int $$6 = $$5[0].length();
         int $$7 = $$5.length;
         ho<clw> $$8 = cme.a($$5, $$4, $$6, $$7);
         ciw $$9 = cme.a(arf.u($$1, "result"));
         boolean $$10 = arf.a($$1, "show_notification", true);
         return new cme($$0, $$2, $$3, $$6, $$7, $$8, $$9, $$10);
      }

      public cme b(aep $$0, sh $$1) {
         int $$2 = $$1.m();
         int $$3 = $$1.m();
         String $$4 = $$1.r();
         clp $$5 = $$1.b(clp.class);
         ho<clw> $$6 = ho.a($$2 * $$3, clw.a);

         for (int $$7 = 0; $$7 < $$6.size(); $$7++) {
            $$6.set($$7, clw.b($$1));
         }

         ciw $$8 = $$1.q();
         boolean $$9 = $$1.readBoolean();
         return new cme($$0, $$4, $$5, $$2, $$3, $$6, $$8, $$9);
      }

      public void a(sh $$0, cme $$1) {
         $$0.c($$1.a);
         $$0.c($$1.b);
         $$0.a($$1.f);
         $$0.a($$1.g);

         for (clw $$2 : $$1.c) {
            $$2.a($$0);
         }

         $$0.a($$1.d);
         $$0.a($$1.h);
      }
   }
}
