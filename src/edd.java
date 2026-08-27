import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;

public final class edd implements edf {
   final float a;

   edd(float $$0) {
      this.a = $$0;
   }

   @Override
   public ede b() {
      return edg.a;
   }

   @Override
   public float b(dzk $$0) {
      return this.a;
   }

   public static edd a(float $$0) {
      return new edd($$0);
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         return $$0 != null && this.getClass() == $$0.getClass() ? Float.compare(((edd)$$0).a, this.a) == 0 : false;
      }
   }

   @Override
   public int hashCode() {
      return this.a != 0.0F ? Float.floatToIntBits(this.a) : 0;
   }

   public static class a implements dzi.b<edd> {
      public JsonElement a(edd $$0, JsonSerializationContext $$1) {
         return new JsonPrimitive($$0.a);
      }

      public edd b(JsonElement $$0, JsonDeserializationContext $$1) {
         return new edd(aor.e($$0, "value"));
      }
   }

   public static class b implements dzt<edd> {
      public void a(JsonObject $$0, edd $$1, JsonSerializationContext $$2) {
         $$0.addProperty("value", $$1.a);
      }

      public edd b(JsonObject $$0, JsonDeserializationContext $$1) {
         float $$2 = aor.m($$0, "value");
         return new edd($$2);
      }
   }
}
