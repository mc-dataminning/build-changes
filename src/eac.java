import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import java.util.function.Consumer;

public class eac extends eah {
   final cfu i;

   eac(cfu $$0, int $$1, int $$2, eck[] $$3, eaz[] $$4) {
      super($$1, $$2, $$3, $$4);
      this.i = $$0;
   }

   @Override
   public eag a() {
      return ead.b;
   }

   @Override
   public void a(Consumer<cfz> $$0, dzk $$1) {
      $$0.accept(new cfz(this.i));
   }

   public static eah.a<?> a(cml $$0) {
      return a(($$1, $$2, $$3, $$4) -> new eac($$0.k(), $$1, $$2, $$3, $$4));
   }

   public static class a extends eah.e<eac> {
      public void a(JsonObject $$0, eac $$1, JsonSerializationContext $$2) {
         super.a($$0, $$1, $$2);
         acq $$3 = jb.i.b($$1.i);
         if ($$3 == null) {
            throw new IllegalArgumentException("Can't serialize unknown item " + $$1.i);
         } else {
            $$0.addProperty("name", $$3.toString());
         }
      }

      protected eac a(JsonObject $$0, JsonDeserializationContext $$1, int $$2, int $$3, eck[] $$4, eaz[] $$5) {
         cfu $$6 = aor.j($$0, "name");
         return new eac($$6, $$2, $$3, $$4, $$5);
      }
   }
}
