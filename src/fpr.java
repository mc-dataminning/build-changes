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

public class fpr {
   private final fpn a;
   private final fpk b;

   public fpr(fpn $$0, fpk $$1) {
      if ($$0 == null) {
         throw new IllegalArgumentException("Missing condition for selector");
      } else if ($$1 == null) {
         throw new IllegalArgumentException("Missing variant for selector");
      } else {
         this.a = $$0;
         this.b = $$1;
      }
   }

   public fpk a() {
      return this.b;
   }

   public Predicate<dfd> a(dfe<ctc, dfd> $$0) {
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

   public static class a implements JsonDeserializer<fpr> {
      public fpr a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         JsonObject $$3 = $$0.getAsJsonObject();
         return new fpr(this.b($$3), (fpk)$$2.deserialize($$3.get("apply"), fpk.class));
      }

      private fpn b(JsonObject $$0) {
         return $$0.has("when") ? a(arr.u($$0, "when")) : fpn.b;
      }

      @VisibleForTesting
      static fpn a(JsonObject $$0) {
         Set<Entry<String, JsonElement>> $$1 = $$0.entrySet();
         if ($$1.isEmpty()) {
            throw new JsonParseException("No elements found in selector");
         } else if ($$1.size() == 1) {
            if ($$0.has("OR")) {
               List<fpn> $$2 = Streams.stream(arr.v($$0, "OR")).map($$0x -> a($$0x.getAsJsonObject())).collect(Collectors.toList());
               return new fpq($$2);
            } else if ($$0.has("AND")) {
               List<fpn> $$3 = Streams.stream(arr.v($$0, "AND")).map($$0x -> a($$0x.getAsJsonObject())).collect(Collectors.toList());
               return new fpm($$3);
            } else {
               return a($$1.iterator().next());
            }
         } else {
            return new fpm($$1.stream().map(fpr.a::a).collect(Collectors.toList()));
         }
      }

      private static fpn a(Entry<String, JsonElement> $$0) {
         return new fpo($$0.getKey(), $$0.getValue().getAsString());
      }
   }
}
