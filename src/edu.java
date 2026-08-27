import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import java.util.Set;

public class edu extends edv {
   final ecg a;

   edu(efh[] $$0, ecg $$1) {
      super($$0);
      this.a = $$1;
   }

   @Override
   public edx b() {
      return edy.p;
   }

   @Override
   public Set<eeq<?>> a() {
      return this.a.a();
   }

   @Override
   public ciw a(ciw $$0, ech $$1) {
      int $$2 = this.a.a($$1, $$0.L());
      $$0.f($$2);
      return $$0;
   }

   public static edv.a<?> a(ecg $$0) {
      return a($$1 -> new edu($$1, $$0));
   }

   public static class a extends edv.c<edu> {
      public void a(JsonObject $$0, edu $$1, JsonSerializationContext $$2) {
         super.a($$0, $$1, $$2);
         $$0.add("limit", $$2.serialize($$1.a));
      }

      public edu a(JsonObject $$0, JsonDeserializationContext $$1, efh[] $$2) {
         ecg $$3 = arf.a($$0, "limit", $$1, ecg.class);
         return new edu($$2, $$3);
      }
   }
}
