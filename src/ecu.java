import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import javax.annotation.Nullable;

public class ecu implements eck {
   @Nullable
   final Boolean a;
   @Nullable
   final Boolean b;

   ecu(@Nullable Boolean $$0, @Nullable Boolean $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   public ecl b() {
      return ecm.o;
   }

   public boolean a(dzk $$0) {
      aif $$1 = $$0.d();
      return this.a != null && this.a != $$1.Z() ? false : this.b == null || this.b == $$1.Y();
   }

   public static ecu.a c() {
      return new ecu.a();
   }

   public static class a implements eck.a {
      @Nullable
      private Boolean a;
      @Nullable
      private Boolean b;

      public ecu.a a(@Nullable Boolean $$0) {
         this.a = $$0;
         return this;
      }

      public ecu.a b(@Nullable Boolean $$0) {
         this.b = $$0;
         return this;
      }

      public ecu a() {
         return new ecu(this.a, this.b);
      }
   }

   public static class b implements dzt<ecu> {
      public void a(JsonObject $$0, ecu $$1, JsonSerializationContext $$2) {
         $$0.addProperty("raining", $$1.a);
         $$0.addProperty("thundering", $$1.b);
      }

      public ecu b(JsonObject $$0, JsonDeserializationContext $$1) {
         Boolean $$2 = $$0.has("raining") ? aor.k($$0, "raining") : null;
         Boolean $$3 = $$0.has("thundering") ? aor.k($$0, "thundering") : null;
         return new ecu($$2, $$3);
      }
   }
}
