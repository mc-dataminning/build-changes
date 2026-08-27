import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.Streams;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Set;
import java.util.Map.Entry;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class fpq {
   private final fpm a;
   private final fpj b;

   public fpq(fpm $$0, fpj $$1) {
      if ($$0 == null) {
         throw new IllegalArgumentException("Missing condition for selector");
      } else if ($$1 == null) {
         throw new IllegalArgumentException("Missing variant for selector");
      } else {
         this.a = $$0;
         this.b = $$1;
      }
   }

   public fpj a() {
      return this.b;
   }

   public Predicate<dfe> a(dff<csq, dfe> $$0) {
      return this.a.getPredicate($$0);
   }

   @Override
   public boolean equals(Object $$0) {
      return this == $$0;
   }

   @Override
   public int hashCode() {
      return System.identityHashCode(this);
   }

   public static class a implements JsonDeserializer<fpq> {
      public fpq a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         JsonObject $$3 = $$0.getAsJsonObject();
         return new fpq(this.b($$3), (fpj)$$2.deserialize($$3.get("apply"), fpj.class));
      }

      private fpm b(JsonObject $$0) {
         return $$0.has("when") ? a(arj.u($$0, "when")) : fpm.b;
      }

      @VisibleForTesting
      static fpm a(JsonObject $$0) {
         Set<Entry<String, JsonElement>> $$1 = $$0.entrySet();
         if ($$1.isEmpty()) {
            throw new JsonParseException("No elements found in selector");
         } else if ($$1.size() == 1) {
            if ($$0.has("OR")) {
               List<fpm> $$2 = Streams.stream(arj.v($$0, "OR")).map($$0x -> a($$0x.getAsJsonObject())).collect(Collectors.toList());
               return new fpp($$2);
            } else if ($$0.has("AND")) {
               List<fpm> $$3 = Streams.stream(arj.v($$0, "AND")).map($$0x -> a($$0x.getAsJsonObject())).collect(Collectors.toList());
               return new fpl($$3);
            } else {
               return a($$1.iterator().next());
            }
         } else {
            return new fpl($$1.stream().map(fpq.a::a).collect(Collectors.toList()));
         }
      }

      private static fpm a(Entry<String, JsonElement> $$0) {
         return new fpn($$0.getKey(), $$0.getValue().getAsString());
      }
   }
}
