import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;

public final class ega implements egc {
   final float a;

   ega(float $$0) {
      this.a = $$0;
   }

   @Override
   public egb b() {
      return egd.a;
   }

   @Override
   public float b(ech $$0) {
      return this.a;
   }

   public static ega a(float $$0) {
      return new ega($$0);
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         return $$0 != null && this.getClass() == $$0.getClass() ? Float.compare(((ega)$$0).a, this.a) == 0 : false;
      }
   }

   @Override
   public int hashCode() {
      return this.a != 0.0F ? Float.floatToIntBits(this.a) : 0;
   }

   public static class a implements ecf.b<ega> {
      public JsonElement a(ega $$0, JsonSerializationContext $$1) {
         return new JsonPrimitive($$0.a);
      }

      public ega b(JsonElement $$0, JsonDeserializationContext $$1) {
         return new ega(arf.e($$0, "value"));
      }
   }

   public static class b implements ecq<ega> {
      public void a(JsonObject $$0, ega $$1, JsonSerializationContext $$2) {
         $$0.addProperty("value", $$1.a);
      }

      public ega b(JsonObject $$0, JsonDeserializationContext $$1) {
         float $$2 = arf.m($$0, "value");
         return new ega($$2);
      }
   }
}
