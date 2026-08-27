import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;

public class cmh implements cls {
   private final aer a;
   final String b;
   final clr c;
   final ciy d;
   final hn<cly> e;

   public cmh(aer $$0, String $$1, clr $$2, ciy $$3, hn<cly> $$4) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      this.e = $$4;
   }

   @Override
   public aer e() {
      return this.a;
   }

   @Override
   public cmd<?> aj_() {
      return cmd.b;
   }

   @Override
   public String c() {
      return this.b;
   }

   @Override
   public clr d() {
      return this.c;
   }

   @Override
   public ciy a(hs $$0) {
      return this.d;
   }

   @Override
   public hn<cly> a() {
      return this.e;
   }

   public boolean a(ces $$0, cpm $$1) {
      cbr $$2 = new cbr();
      int $$3 = 0;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         ciy $$5 = $$0.a($$4);
         if (!$$5.b()) {
            $$3++;
            $$2.a($$5, 1);
         }
      }

      return $$3 == this.e.size() && $$2.a(this, null);
   }

   public ciy a(ces $$0, hs $$1) {
      return this.d.p();
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 * $$1 >= this.e.size();
   }

   public static class a implements cmd<cmh> {
      public cmh b(aer $$0, JsonObject $$1) {
         String $$2 = arg.a($$1, "group", "");
         clr $$3 = clr.e.a(arg.a($$1, "category", null), clr.d);
         hn<cly> $$4 = a(arg.v($$1, "ingredients"));
         if ($$4.isEmpty()) {
            throw new JsonParseException("No ingredients for shapeless recipe");
         } else if ($$4.size() > 9) {
            throw new JsonParseException("Too many ingredients for shapeless recipe");
         } else {
            ciy $$5 = cmg.a(arg.u($$1, "result"));
            return new cmh($$0, $$2, $$3, $$5, $$4);
         }
      }

      private static hn<cly> a(JsonArray $$0) {
         hn<cly> $$1 = hn.a();

         for (int $$2 = 0; $$2 < $$0.size(); $$2++) {
            cly $$3 = cly.a($$0.get($$2), false);
            if (!$$3.d()) {
               $$1.add($$3);
            }
         }

         return $$1;
      }

      public cmh b(aer $$0, si $$1) {
         String $$2 = $$1.r();
         clr $$3 = $$1.b(clr.class);
         int $$4 = $$1.m();
         hn<cly> $$5 = hn.a($$4, cly.a);

         for (int $$6 = 0; $$6 < $$5.size(); $$6++) {
            $$5.set($$6, cly.b($$1));
         }

         ciy $$7 = $$1.q();
         return new cmh($$0, $$2, $$3, $$7, $$5);
      }

      public void a(si $$0, cmh $$1) {
         $$0.a($$1.b);
         $$0.a($$1.c);
         $$0.c($$1.e.size());

         for (cly $$2 : $$1.e) {
            $$2.a($$0);
         }

         $$0.a($$1.d);
      }
   }
}
