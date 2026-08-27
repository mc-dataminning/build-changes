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

public class frn {
   private final agg a;
   private final List<frn.b> b;

   public frn(agg $$0, List<frn.b> $$1) {
      this.a = $$0;
      this.b = ImmutableList.copyOf($$1);
   }

   public agg a() {
      return this.a;
   }

   public Stream<frn.b> b() {
      return this.b.stream();
   }

   protected static class a implements JsonDeserializer<frn> {
      public frn a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         JsonObject $$3 = $$0.getAsJsonObject();
         agg $$4 = new agg(asy.i($$3, "model"));
         List<frn.b> $$5 = this.a($$3);
         return new frn($$4, $$5);
      }

      protected List<frn.b> a(JsonObject $$0) {
         Map<agg, Float> $$1 = Maps.newLinkedHashMap();
         JsonObject $$2 = asy.u($$0, "predicate");

         for (Entry<String, JsonElement> $$3 : $$2.entrySet()) {
            $$1.put(new agg($$3.getKey()), asy.e($$3.getValue(), $$3.getKey()));
         }

         return $$1.entrySet().stream().map($$0x -> new frn.b((agg)$$0x.getKey(), (Float)$$0x.getValue())).collect(ImmutableList.toImmutableList());
      }
   }

   public static class b {
      private final agg a;
      private final float b;

      public b(agg $$0, float $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public agg a() {
         return this.a;
      }

      public float b() {
         return this.b;
      }
   }
}
