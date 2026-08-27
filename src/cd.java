import com.google.gson.JsonObject;

public class cd extends cv<cd.a> {
   static final aep a = new aep("levitation");

   @Override
   public aep a() {
      return a;
   }

   public cd.a a(JsonObject $$0, ba $$1, be $$2) {
      bf $$3 = bf.a($$0.get("distance"));
      cj.d $$4 = cj.d.a($$0.get("duration"));
      return new cd.a($$1, $$3, $$4);
   }

   public void a(akj $$0, ehf $$1, int $$2) {
      this.a($$0, $$3 -> $$3.a($$0, $$1, $$2));
   }

   public static class a extends ar {
      private final bf a;
      private final cj.d b;

      public a(ba $$0, bf $$1, cj.d $$2) {
         super(cd.a, $$0);
         this.a = $$1;
         this.b = $$2;
      }

      public static cd.a a(bf $$0) {
         return new cd.a(ba.a, $$0, cj.d.e);
      }

      public boolean a(akj $$0, ehf $$1, int $$2) {
         return !this.a.a($$1.c, $$1.d, $$1.e, $$0.dp(), $$0.dr(), $$0.dv()) ? false : this.b.d($$2);
      }

      @Override
      public JsonObject a(ct $$0) {
         JsonObject $$1 = super.a($$0);
         $$1.add("distance", this.a.a());
         $$1.add("duration", this.b.d());
         return $$1;
      }
   }
}
