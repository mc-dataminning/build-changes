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

public class fpg {
   private final aez a;
   private final List<fpg.b> b;

   public fpg(aez $$0, List<fpg.b> $$1) {
      this.a = $$0;
      this.b = ImmutableList.copyOf($$1);
   }

   public aez a() {
      return this.a;
   }

   public Stream<fpg.b> b() {
      return this.b.stream();
   }

   protected static class a implements JsonDeserializer<fpg> {
      public fpg a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         JsonObject $$3 = $$0.getAsJsonObject();
         aez $$4 = new aez(arr.i($$3, "model"));
         List<fpg.b> $$5 = this.a($$3);
         return new fpg($$4, $$5);
      }

      protected List<fpg.b> a(JsonObject $$0) {
         Map<aez, Float> $$1 = Maps.newLinkedHashMap();
         JsonObject $$2 = arr.u($$0, "predicate");

         for (Entry<String, JsonElement> $$3 : $$2.entrySet()) {
            $$1.put(new aez($$3.getKey()), arr.e($$3.getValue(), $$3.getKey()));
         }

         return $$1.entrySet().stream().map($$0x -> new fpg.b((aez)$$0x.getKey(), (Float)$$0x.getValue())).collect(ImmutableList.toImmutableList());
      }
   }

   public static class b {
      private final aez a;
      private final float b;

      public b(aez $$0, float $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public aez a() {
         return this.a;
      }

      public float b() {
         return this.b;
      }
   }
}
