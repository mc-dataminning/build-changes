import com.google.common.collect.ImmutableSet;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import java.util.Set;

public class efl implements efh {
   static final efl a = new efl();

   private efl() {
   }

   @Override
   public efi b() {
      return efj.g;
   }

   @Override
   public Set<eeq<?>> a() {
      return ImmutableSet.of(eet.b);
   }

   public boolean a(ech $$0) {
      return $$0.a(eet.b);
   }

   public static efh.a c() {
      return () -> a;
   }

   public static class a implements ecq<efl> {
      public void a(JsonObject $$0, efl $$1, JsonSerializationContext $$2) {
      }

      public efl b(JsonObject $$0, JsonDeserializationContext $$1) {
         return efl.a;
      }
   }
}
