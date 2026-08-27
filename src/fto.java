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

public class fto {
   private final agt a;
   private final List<fto.b> b;

   public fto(agt $$0, List<fto.b> $$1) {
      this.a = $$0;
      this.b = ImmutableList.copyOf($$1);
   }

   public agt a() {
      return this.a;
   }

   public Stream<fto.b> b() {
      return this.b.stream();
   }

   protected static class a implements JsonDeserializer<fto> {
      public fto a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         JsonObject $$3 = $$0.getAsJsonObject();
         agt $$4 = new agt(ato.i($$3, "model"));
         List<fto.b> $$5 = this.a($$3);
         return new fto($$4, $$5);
      }

      protected List<fto.b> a(JsonObject $$0) {
         Map<agt, Float> $$1 = Maps.newLinkedHashMap();
         JsonObject $$2 = ato.u($$0, "predicate");

         for (Entry<String, JsonElement> $$3 : $$2.entrySet()) {
            $$1.put(new agt($$3.getKey()), ato.e($$3.getValue(), $$3.getKey()));
         }

         return $$1.entrySet().stream().map($$0x -> new fto.b((agt)$$0x.getKey(), (Float)$$0x.getValue())).collect(ImmutableList.toImmutableList());
      }
   }

   public static class b {
      private final agt a;
      private final float b;

      public b(agt $$0, float $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public agt a() {
         return this.a;
      }

      public float b() {
         return this.b;
      }
   }
}
