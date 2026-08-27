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

public class fpf {
   private final aeu a;
   private final List<fpf.b> b;

   public fpf(aeu $$0, List<fpf.b> $$1) {
      this.a = $$0;
      this.b = ImmutableList.copyOf($$1);
   }

   public aeu a() {
      return this.a;
   }

   public Stream<fpf.b> b() {
      return this.b.stream();
   }

   protected static class a implements JsonDeserializer<fpf> {
      public fpf a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         JsonObject $$3 = $$0.getAsJsonObject();
         aeu $$4 = new aeu(arj.i($$3, "model"));
         List<fpf.b> $$5 = this.a($$3);
         return new fpf($$4, $$5);
      }

      protected List<fpf.b> a(JsonObject $$0) {
         Map<aeu, Float> $$1 = Maps.newLinkedHashMap();
         JsonObject $$2 = arj.u($$0, "predicate");

         for (Entry<String, JsonElement> $$3 : $$2.entrySet()) {
            $$1.put(new aeu($$3.getKey()), arj.e($$3.getValue(), $$3.getKey()));
         }

         return $$1.entrySet().stream().map($$0x -> new fpf.b((aeu)$$0x.getKey(), (Float)$$0x.getValue())).collect(ImmutableList.toImmutableList());
      }
   }

   public static class b {
      private final aeu a;
      private final float b;

      public b(aeu $$0, float $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public aeu a() {
         return this.a;
      }

      public float b() {
         return this.b;
      }
   }
}
