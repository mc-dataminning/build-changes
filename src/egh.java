import com.google.common.collect.ImmutableSet;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import java.util.Set;
import javax.annotation.Nullable;

public class egh implements egk {
   final ech.b a;

   egh(ech.b $$0) {
      this.a = $$0;
   }

   public static egk a(ech.b $$0) {
      return new egh($$0);
   }

   @Override
   public egj a() {
      return egl.b;
   }

   @Nullable
   @Override
   public String a(ech $$0) {
      big $$1 = $$0.c(this.a.a());
      return $$1 != null ? $$1.cx() : null;
   }

   @Override
   public Set<eeq<?>> b() {
      return ImmutableSet.of(this.a.a());
   }

   public static class a implements ecf.b<egh> {
      public JsonElement a(egh $$0, JsonSerializationContext $$1) {
         return $$1.serialize($$0.a);
      }

      public egh b(JsonElement $$0, JsonDeserializationContext $$1) {
         ech.b $$2 = (ech.b)$$1.deserialize($$0, ech.b.class);
         return new egh($$2);
      }
   }

   public static class b implements ecq<egh> {
      public void a(JsonObject $$0, egh $$1, JsonSerializationContext $$2) {
         $$0.addProperty("target", $$1.a.name());
      }

      public egh b(JsonObject $$0, JsonDeserializationContext $$1) {
         ech.b $$2 = arf.a($$0, "target", $$1, ech.b.class);
         return new egh($$2);
      }
   }
}
