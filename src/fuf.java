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

public class fuf {
   private final ahd a;
   private final List<fuf.b> b;

   public fuf(ahd $$0, List<fuf.b> $$1) {
      this.a = $$0;
      this.b = ImmutableList.copyOf($$1);
   }

   public ahd a() {
      return this.a;
   }

   public Stream<fuf.b> b() {
      return this.b.stream();
   }

   protected static class a implements JsonDeserializer<fuf> {
      public fuf a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         JsonObject $$3 = $$0.getAsJsonObject();
         ahd $$4 = new ahd(aty.i($$3, "model"));
         List<fuf.b> $$5 = this.a($$3);
         return new fuf($$4, $$5);
      }

      protected List<fuf.b> a(JsonObject $$0) {
         Map<ahd, Float> $$1 = Maps.newLinkedHashMap();
         JsonObject $$2 = aty.u($$0, "predicate");

         for (Entry<String, JsonElement> $$3 : $$2.entrySet()) {
            $$1.put(new ahd($$3.getKey()), aty.e($$3.getValue(), $$3.getKey()));
         }

         return $$1.entrySet().stream().map($$0x -> new fuf.b((ahd)$$0x.getKey(), (Float)$$0x.getValue())).collect(ImmutableList.toImmutableList());
      }
   }

   public static class b {
      private final ahd a;
      private final float b;

      public b(ahd $$0, float $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public ahd a() {
         return this.a;
      }

      public float b() {
         return this.b;
      }
   }
}
