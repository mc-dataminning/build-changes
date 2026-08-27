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

public class fsa {
   private final agi a;
   private final List<fsa.b> b;

   public fsa(agi $$0, List<fsa.b> $$1) {
      this.a = $$0;
      this.b = ImmutableList.copyOf($$1);
   }

   public agi a() {
      return this.a;
   }

   public Stream<fsa.b> b() {
      return this.b.stream();
   }

   protected static class a implements JsonDeserializer<fsa> {
      public fsa a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         JsonObject $$3 = $$0.getAsJsonObject();
         agi $$4 = new agi(atc.i($$3, "model"));
         List<fsa.b> $$5 = this.a($$3);
         return new fsa($$4, $$5);
      }

      protected List<fsa.b> a(JsonObject $$0) {
         Map<agi, Float> $$1 = Maps.newLinkedHashMap();
         JsonObject $$2 = atc.u($$0, "predicate");

         for (Entry<String, JsonElement> $$3 : $$2.entrySet()) {
            $$1.put(new agi($$3.getKey()), atc.e($$3.getValue(), $$3.getKey()));
         }

         return $$1.entrySet().stream().map($$0x -> new fsa.b((agi)$$0x.getKey(), (Float)$$0x.getValue())).collect(ImmutableList.toImmutableList());
      }
   }

   public static class b {
      private final agi a;
      private final float b;

      public b(agi $$0, float $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public agi a() {
         return this.a;
      }

      public float b() {
         return this.b;
      }
   }
}
