import com.google.gson.JsonObject;
import javax.annotation.Nullable;

public class aw extends cv<aw.a> {
   static final aep a = new aep("changed_dimension");

   @Override
   public aep a() {
      return a;
   }

   public aw.a a(JsonObject $$0, ba $$1, be $$2) {
      aeo<cpk> $$3 = $$0.has("from") ? aeo.a(jd.aH, new aep(arf.i($$0, "from"))) : null;
      aeo<cpk> $$4 = $$0.has("to") ? aeo.a(jd.aH, new aep(arf.i($$0, "to"))) : null;
      return new aw.a($$1, $$3, $$4);
   }

   public void a(akj $$0, aeo<cpk> $$1, aeo<cpk> $$2) {
      this.a($$0, $$2x -> $$2x.b($$1, $$2));
   }

   public static class a extends ar {
      @Nullable
      private final aeo<cpk> a;
      @Nullable
      private final aeo<cpk> b;

      public a(ba $$0, @Nullable aeo<cpk> $$1, @Nullable aeo<cpk> $$2) {
         super(aw.a, $$0);
         this.a = $$1;
         this.b = $$2;
      }

      public static aw.a c() {
         return new aw.a(ba.a, null, null);
      }

      public static aw.a a(aeo<cpk> $$0, aeo<cpk> $$1) {
         return new aw.a(ba.a, $$0, $$1);
      }

      public static aw.a a(aeo<cpk> $$0) {
         return new aw.a(ba.a, null, $$0);
      }

      public static aw.a b(aeo<cpk> $$0) {
         return new aw.a(ba.a, $$0, null);
      }

      public boolean b(aeo<cpk> $$0, aeo<cpk> $$1) {
         return this.a != null && this.a != $$0 ? false : this.b == null || this.b == $$1;
      }

      @Override
      public JsonObject a(ct $$0) {
         JsonObject $$1 = super.a($$0);
         if (this.a != null) {
            $$1.addProperty("from", this.a.a().toString());
         }

         if (this.b != null) {
            $$1.addProperty("to", this.b.a().toString());
         }

         return $$1;
      }
   }
}
