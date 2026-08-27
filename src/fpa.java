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

public class fpa {
   private final aer a;
   private final List<fpa.b> b;

   public fpa(aer $$0, List<fpa.b> $$1) {
      this.a = $$0;
      this.b = ImmutableList.copyOf($$1);
   }

   public aer a() {
      return this.a;
   }

   public Stream<fpa.b> b() {
      return this.b.stream();
   }

   protected static class a implements JsonDeserializer<fpa> {
      public fpa a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         JsonObject $$3 = $$0.getAsJsonObject();
         aer $$4 = new aer(arg.i($$3, "model"));
         List<fpa.b> $$5 = this.a($$3);
         return new fpa($$4, $$5);
      }

      protected List<fpa.b> a(JsonObject $$0) {
         Map<aer, Float> $$1 = Maps.newLinkedHashMap();
         JsonObject $$2 = arg.u($$0, "predicate");

         for (Entry<String, JsonElement> $$3 : $$2.entrySet()) {
            $$1.put(new aer($$3.getKey()), arg.e($$3.getValue(), $$3.getKey()));
         }

         return $$1.entrySet().stream().map($$0x -> new fpa.b((aer)$$0x.getKey(), (Float)$$0x.getValue())).collect(ImmutableList.toImmutableList());
      }
   }

   public static class b {
      private final aer a;
      private final float b;

      public b(aer $$0, float $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public aer a() {
         return this.a;
      }

      public float b() {
         return this.b;
      }
   }
}
