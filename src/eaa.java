import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import java.util.function.Consumer;

public class eaa extends eah {
   eaa(int $$0, int $$1, eck[] $$2, eaz[] $$3) {
      super($$0, $$1, $$2, $$3);
   }

   @Override
   public eag a() {
      return ead.a;
   }

   @Override
   public void a(Consumer<cfz> $$0, dzk $$1) {
   }

   public static eah.a<?> b() {
      return a(eaa::new);
   }

   public static class a extends eah.e<eaa> {
      public eaa a(JsonObject $$0, JsonDeserializationContext $$1, int $$2, int $$3, eck[] $$4, eaz[] $$5) {
         return new eaa($$2, $$3, $$4, $$5);
      }
   }
}
