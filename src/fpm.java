import com.google.common.collect.ImmutableList;
import com.google.common.collect.Maps;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Stream;

public class fpm {
   private final aey a;
   private final List<fpm.b> b;

   public fpm(aey $$0, List<fpm.b> $$1) {
      this.a = $$0;
      this.b = ImmutableList.copyOf($$1);
   }

   public aey a() {
      return this.a;
   }

   public Stream<fpm.b> b() {
      return this.b.stream();
   }

   protected static class a implements JsonDeserializer<fpm> {
      public fpm a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         JsonObject $$3 = $$0.getAsJsonObject();
         aey $$4 = new aey(arp.i($$3, "model"));
         List<fpm.b> $$5 = this.a($$3);
         return new fpm($$4, $$5);
      }

      protected List<fpm.b> a(JsonObject $$0) {
         Map<aey, Float> $$1 = Maps.newLinkedHashMap();
         JsonObject $$2 = arp.u($$0, "predicate");

         for (Entry<String, JsonElement> $$3 : $$2.entrySet()) {
            $$1.put(new aey($$3.getKey()), arp.e($$3.getValue(), $$3.getKey()));
         }

         return $$1.entrySet().stream().map($$0x -> new fpm.b((aey)$$0x.getKey(), (Float)$$0x.getValue())).collect(ImmutableList.toImmutableList());
      }
   }

   public static class b {
      private final aey a;
      private final float b;

      public b(aey $$0, float $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public aey a() {
         return this.a;
      }

      public float b() {
         return this.b;
      }
   }
}
