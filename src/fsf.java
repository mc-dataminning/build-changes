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

public class fsf {
   private final agm a;
   private final List<fsf.b> b;

   public fsf(agm $$0, List<fsf.b> $$1) {
      this.a = $$0;
      this.b = ImmutableList.copyOf($$1);
   }

   public agm a() {
      return this.a;
   }

   public Stream<fsf.b> b() {
      return this.b.stream();
   }

   protected static class a implements JsonDeserializer<fsf> {
      public fsf a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         JsonObject $$3 = $$0.getAsJsonObject();
         agm $$4 = new agm(atg.i($$3, "model"));
         List<fsf.b> $$5 = this.a($$3);
         return new fsf($$4, $$5);
      }

      protected List<fsf.b> a(JsonObject $$0) {
         Map<agm, Float> $$1 = Maps.newLinkedHashMap();
         JsonObject $$2 = atg.u($$0, "predicate");

         for (Entry<String, JsonElement> $$3 : $$2.entrySet()) {
            $$1.put(new agm($$3.getKey()), atg.e($$3.getValue(), $$3.getKey()));
         }

         return $$1.entrySet().stream().map($$0x -> new fsf.b((agm)$$0x.getKey(), (Float)$$0x.getValue())).collect(ImmutableList.toImmutableList());
      }
   }

   public static class b {
      private final agm a;
      private final float b;

      public b(agm $$0, float $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public agm a() {
         return this.a;
      }

      public float b() {
         return this.b;
      }
   }
}
