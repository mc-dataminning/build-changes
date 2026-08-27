import com.google.common.collect.ImmutableSet;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import java.util.Set;
import javax.annotation.Nullable;

public class efx implements efv {
   final aep a;

   efx(aep $$0) {
      this.a = $$0;
   }

   @Override
   public efu a() {
      return efw.a;
   }

   @Nullable
   @Override
   public rl a(ech $$0) {
      return $$0.d().n().aG().a(this.a);
   }

   @Override
   public Set<eeq<?>> b() {
      return ImmutableSet.of();
   }

   public static class a implements ecq<efx> {
      public void a(JsonObject $$0, efx $$1, JsonSerializationContext $$2) {
         $$0.addProperty("source", $$1.a.toString());
      }

      public efx b(JsonObject $$0, JsonDeserializationContext $$1) {
         String $$2 = arf.i($$0, "source");
         return new efx(new aep($$2));
      }
   }
}
