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

public class fpk {
   private final aex a;
   private final List<fpk.b> b;

   public fpk(aex $$0, List<fpk.b> $$1) {
      this.a = $$0;
      this.b = ImmutableList.copyOf($$1);
   }

   public aex a() {
      return this.a;
   }

   public Stream<fpk.b> b() {
      return this.b.stream();
   }

   protected static class a implements JsonDeserializer<fpk> {
      public fpk a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         JsonObject $$3 = $$0.getAsJsonObject();
         aex $$4 = new aex(aro.i($$3, "model"));
         List<fpk.b> $$5 = this.a($$3);
         return new fpk($$4, $$5);
      }

      protected List<fpk.b> a(JsonObject $$0) {
         Map<aex, Float> $$1 = Maps.newLinkedHashMap();
         JsonObject $$2 = aro.u($$0, "predicate");

         for (Entry<String, JsonElement> $$3 : $$2.entrySet()) {
            $$1.put(new aex($$3.getKey()), aro.e($$3.getValue(), $$3.getKey()));
         }

         return $$1.entrySet().stream().map($$0x -> new fpk.b((aex)$$0x.getKey(), (Float)$$0x.getValue())).collect(ImmutableList.toImmutableList());
      }
   }

   public static class b {
      private final aex a;
      private final float b;

      public b(aex $$0, float $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public aex a() {
         return this.a;
      }

      public float b() {
         return this.b;
      }
   }
}
