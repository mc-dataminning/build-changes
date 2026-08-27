import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;

public class cmf implements clq {
   private final aep a;
   final String b;
   final clp c;
   final ciw d;
   final ho<clw> e;

   public cmf(aep $$0, String $$1, clp $$2, ciw $$3, ho<clw> $$4) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      this.e = $$4;
   }

   @Override
   public aep e() {
      return this.a;
   }

   @Override
   public cmb<?> aj_() {
      return cmb.b;
   }

   @Override
   public String c() {
      return this.b;
   }

   @Override
   public clp d() {
      return this.c;
   }

   @Override
   public ciw a(ht $$0) {
      return this.d;
   }

   @Override
   public ho<clw> a() {
      return this.e;
   }

   public boolean a(ceq $$0, cpk $$1) {
      cbp $$2 = new cbp();
      int $$3 = 0;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         ciw $$5 = $$0.a($$4);
         if (!$$5.b()) {
            $$3++;
            $$2.a($$5, 1);
         }
      }

      return $$3 == this.e.size() && $$2.a(this, null);
   }

   public ciw a(ceq $$0, ht $$1) {
      return this.d.p();
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 * $$1 >= this.e.size();
   }

   public static class a implements cmb<cmf> {
      public cmf b(aep $$0, JsonObject $$1) {
         String $$2 = arf.a($$1, "group", "");
         clp $$3 = clp.e.a(arf.a($$1, "category", null), clp.d);
         ho<clw> $$4 = a(arf.v($$1, "ingredients"));
         if ($$4.isEmpty()) {
            throw new JsonParseException("No ingredients for shapeless recipe");
         } else if ($$4.size() > 9) {
            throw new JsonParseException("Too many ingredients for shapeless recipe");
         } else {
            ciw $$5 = cme.a(arf.u($$1, "result"));
            return new cmf($$0, $$2, $$3, $$5, $$4);
         }
      }

      private static ho<clw> a(JsonArray $$0) {
         ho<clw> $$1 = ho.a();

         for (int $$2 = 0; $$2 < $$0.size(); $$2++) {
            clw $$3 = clw.a($$0.get($$2), false);
            if (!$$3.d()) {
               $$1.add($$3);
            }
         }

         return $$1;
      }

      public cmf b(aep $$0, sh $$1) {
         String $$2 = $$1.r();
         clp $$3 = $$1.b(clp.class);
         int $$4 = $$1.m();
         ho<clw> $$5 = ho.a($$4, clw.a);

         for (int $$6 = 0; $$6 < $$5.size(); $$6++) {
            $$5.set($$6, clw.b($$1));
         }

         ciw $$7 = $$1.q();
         return new cmf($$0, $$2, $$3, $$7, $$5);
      }

      public void a(sh $$0, cmf $$1) {
         $$0.a($$1.b);
         $$0.a($$1.c);
         $$0.c($$1.e.size());

         for (clw $$2 : $$1.e) {
            $$2.a($$0);
         }

         $$0.a($$1.d);
      }
   }
}
