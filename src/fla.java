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

public class fla {
   private final acq a;
   private final List<fla.b> b;

   public fla(acq $$0, List<fla.b> $$1) {
      this.a = $$0;
      this.b = ImmutableList.copyOf($$1);
   }

   public acq a() {
      return this.a;
   }

   public Stream<fla.b> b() {
      return this.b.stream();
   }

   protected static class a implements JsonDeserializer<fla> {
      public fla a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         JsonObject $$3 = $$0.getAsJsonObject();
         acq $$4 = new acq(aor.i($$3, "model"));
         List<fla.b> $$5 = this.a($$3);
         return new fla($$4, $$5);
      }

      protected List<fla.b> a(JsonObject $$0) {
         Map<acq, Float> $$1 = Maps.newLinkedHashMap();
         JsonObject $$2 = aor.u($$0, "predicate");

         for (Entry<String, JsonElement> $$3 : $$2.entrySet()) {
            $$1.put(new acq($$3.getKey()), aor.e($$3.getValue(), $$3.getKey()));
         }

         return $$1.entrySet().stream().map($$0x -> new fla.b((acq)$$0x.getKey(), (Float)$$0x.getValue())).collect(ImmutableList.toImmutableList());
      }
   }

   public static class b {
      private final acq a;
      private final float b;

      public b(acq $$0, float $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public acq a() {
         return this.a;
      }

      public float b() {
         return this.b;
      }
   }
}
