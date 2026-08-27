import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;

public class cji implements cit {
   private final acq a;
   final String b;
   final cis c;
   final cfz d;
   final hn<ciz> e;

   public cji(acq $$0, String $$1, cis $$2, cfz $$3, hn<ciz> $$4) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      this.e = $$4;
   }

   @Override
   public acq e() {
      return this.a;
   }

   @Override
   public cje<?> aj_() {
      return cje.b;
   }

   @Override
   public String c() {
      return this.b;
   }

   @Override
   public cis d() {
      return this.c;
   }

   @Override
   public cfz a(hs $$0) {
      return this.d;
   }

   @Override
   public hn<ciz> a() {
      return this.e;
   }

   public boolean a(cbt $$0, cmm $$1) {
      bys $$2 = new bys();
      int $$3 = 0;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         cfz $$5 = $$0.a($$4);
         if (!$$5.b()) {
            $$3++;
            $$2.a($$5, 1);
         }
      }

      return $$3 == this.e.size() && $$2.a(this, null);
   }

   public cfz a(cbt $$0, hs $$1) {
      return this.d.p();
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 * $$1 >= this.e.size();
   }

   public static class a implements cje<cji> {
      public cji b(acq $$0, JsonObject $$1) {
         String $$2 = aor.a($$1, "group", "");
         cis $$3 = cis.e.a(aor.a($$1, "category", null), cis.d);
         hn<ciz> $$4 = a(aor.v($$1, "ingredients"));
         if ($$4.isEmpty()) {
            throw new JsonParseException("No ingredients for shapeless recipe");
         } else if ($$4.size() > 9) {
            throw new JsonParseException("Too many ingredients for shapeless recipe");
         } else {
            cfz $$5 = cjh.a(aor.u($$1, "result"));
            return new cji($$0, $$2, $$3, $$5, $$4);
         }
      }

      private static hn<ciz> a(JsonArray $$0) {
         hn<ciz> $$1 = hn.a();

         for (int $$2 = 0; $$2 < $$0.size(); $$2++) {
            ciz $$3 = ciz.a($$0.get($$2), false);
            if (!$$3.d()) {
               $$1.add($$3);
            }
         }

         return $$1;
      }

      public cji b(acq $$0, sf $$1) {
         String $$2 = $$1.s();
         cis $$3 = $$1.b(cis.class);
         int $$4 = $$1.m();
         hn<ciz> $$5 = hn.a($$4, ciz.a);

         for (int $$6 = 0; $$6 < $$5.size(); $$6++) {
            $$5.set($$6, ciz.b($$1));
         }

         cfz $$7 = $$1.r();
         return new cji($$0, $$2, $$3, $$7, $$5);
      }

      public void a(sf $$0, cji $$1) {
         $$0.a($$1.b);
         $$0.a($$1.c);
         $$0.d($$1.e.size());

         for (ciz $$2 : $$1.e) {
            $$2.a($$0);
         }

         $$0.a($$1.d);
      }
   }
}
