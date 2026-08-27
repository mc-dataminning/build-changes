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

public class fqg {
   private final afw a;
   private final List<fqg.b> b;

   public fqg(afw $$0, List<fqg.b> $$1) {
      this.a = $$0;
      this.b = ImmutableList.copyOf($$1);
   }

   public afw a() {
      return this.a;
   }

   public Stream<fqg.b> b() {
      return this.b.stream();
   }

   protected static class a implements JsonDeserializer<fqg> {
      public fqg a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         JsonObject $$3 = $$0.getAsJsonObject();
         afw $$4 = new afw(aso.i($$3, "model"));
         List<fqg.b> $$5 = this.a($$3);
         return new fqg($$4, $$5);
      }

      protected List<fqg.b> a(JsonObject $$0) {
         Map<afw, Float> $$1 = Maps.newLinkedHashMap();
         JsonObject $$2 = aso.u($$0, "predicate");

         for (Entry<String, JsonElement> $$3 : $$2.entrySet()) {
            $$1.put(new afw($$3.getKey()), aso.e($$3.getValue(), $$3.getKey()));
         }

         return $$1.entrySet().stream().map($$0x -> new fqg.b((afw)$$0x.getKey(), (Float)$$0x.getValue())).collect(ImmutableList.toImmutableList());
      }
   }

   public static class b {
      private final afw a;
      private final float b;

      public b(afw $$0, float $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public afw a() {
         return this.a;
      }

      public float b() {
         return this.b;
      }
   }
}
