import com.google.common.collect.ImmutableSet;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import java.util.Set;
import javax.annotation.Nullable;

public class egi implements egk {
   final String a;

   egi(String $$0) {
      this.a = $$0;
   }

   public static egk a(String $$0) {
      return new egi($$0);
   }

   @Override
   public egj a() {
      return egl.a;
   }

   public String c() {
      return this.a;
   }

   @Nullable
   @Override
   public String a(ech $$0) {
      return this.a;
   }

   @Override
   public Set<eeq<?>> b() {
      return ImmutableSet.of();
   }

   public static class a implements ecq<egi> {
      public void a(JsonObject $$0, egi $$1, JsonSerializationContext $$2) {
         $$0.addProperty("name", $$1.a);
      }

      public egi b(JsonObject $$0, JsonDeserializationContext $$1) {
         String $$2 = arf.i($$0, "name");
         return new egi($$2);
      }
   }
}
