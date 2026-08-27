import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;

public class cmg implements clr {
   private final aer a;
   final String b;
   final clq c;
   final cix d;
   final hn<clx> e;

   public cmg(aer $$0, String $$1, clq $$2, cix $$3, hn<clx> $$4) {
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
   public cmc<?> ai_() {
      return cmc.b;
   }

   @Override
   public String c() {
      return this.b;
   }

   @Override
   public clq d() {
      return this.c;
   }

   @Override
   public cix a(hs $$0) {
      return this.d;
   }

   @Override
   public hn<clx> a() {
      return this.e;
   }

   public boolean a(cer $$0, cpl $$1) {
      cbq $$2 = new cbq();
      int $$3 = 0;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         cix $$5 = $$0.a($$4);
         if (!$$5.b()) {
            $$3++;
            $$2.a($$5, 1);
         }
      }

      return $$3 == this.e.size() && $$2.a(this, null);
   }

   public cix a(cer $$0, hs $$1) {
      return this.d.p();
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 * $$1 >= this.e.size();
   }

   public static class a implements cmc<cmg> {
      public cmg b(aer $$0, JsonObject $$1) {
         String $$2 = arg.a($$1, "group", "");
         clq $$3 = clq.e.a(arg.a($$1, "category", null), clq.d);
         hn<clx> $$4 = a(arg.v($$1, "ingredients"));
         if ($$4.isEmpty()) {
            throw new JsonParseException("No ingredients for shapeless recipe");
         } else if ($$4.size() > 9) {
            throw new JsonParseException("Too many ingredients for shapeless recipe");
         } else {
            cix $$5 = cmf.a(arg.u($$1, "result"));
            return new cmg($$0, $$2, $$3, $$5, $$4);
         }
      }

      private static hn<clx> a(JsonArray $$0) {
         hn<clx> $$1 = hn.a();

         for (int $$2 = 0; $$2 < $$0.size(); $$2++) {
            clx $$3 = clx.a($$0.get($$2), false);
            if (!$$3.d()) {
               $$1.add($$3);
            }
         }

         return $$1;
      }

      public cmg b(aer $$0, si $$1) {
         String $$2 = $$1.r();
         clq $$3 = $$1.b(clq.class);
         int $$4 = $$1.m();
         hn<clx> $$5 = hn.a($$4, clx.a);

         for (int $$6 = 0; $$6 < $$5.size(); $$6++) {
            $$5.set($$6, clx.b($$1));
         }

         cix $$7 = $$1.q();
         return new cmg($$0, $$2, $$3, $$7, $$5);
      }

      public void a(si $$0, cmg $$1) {
         $$0.a($$1.b);
         $$0.a($$1.c);
         $$0.c($$1.e.size());

         for (clx $$2 : $$1.e) {
            $$2.a($$0);
         }

         $$0.a($$1.d);
      }
   }
}
