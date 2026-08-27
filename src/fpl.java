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

public class fpl {
   private final fph a;
   private final fpe b;

   public fpl(fph $$0, fpe $$1) {
      if ($$0 == null) {
         throw new IllegalArgumentException("Missing condition for selector");
      } else if ($$1 == null) {
         throw new IllegalArgumentException("Missing variant for selector");
      } else {
         this.a = $$0;
         this.b = $$1;
      }
   }

   public fpe a() {
      return this.b;
   }

   public Predicate<dez> a(dfa<csl, dez> $$0) {
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

   public static class a implements JsonDeserializer<fpl> {
      public fpl a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         JsonObject $$3 = $$0.getAsJsonObject();
         return new fpl(this.b($$3), (fpe)$$2.deserialize($$3.get("apply"), fpe.class));
      }

      private fph b(JsonObject $$0) {
         return $$0.has("when") ? a(arg.u($$0, "when")) : fph.b;
      }

      @VisibleForTesting
      static fph a(JsonObject $$0) {
         Set<Entry<String, JsonElement>> $$1 = $$0.entrySet();
         if ($$1.isEmpty()) {
            throw new JsonParseException("No elements found in selector");
         } else if ($$1.size() == 1) {
            if ($$0.has("OR")) {
               List<fph> $$2 = Streams.stream(arg.v($$0, "OR")).map($$0x -> a($$0x.getAsJsonObject())).collect(Collectors.toList());
               return new fpk($$2);
            } else if ($$0.has("AND")) {
               List<fph> $$3 = Streams.stream(arg.v($$0, "AND")).map($$0x -> a($$0x.getAsJsonObject())).collect(Collectors.toList());
               return new fpg($$3);
            } else {
               return a($$1.iterator().next());
            }
         } else {
            return new fpg($$1.stream().map(fpl.a::a).collect(Collectors.toList()));
         }
      }

      private static fph a(Entry<String, JsonElement> $$0) {
         return new fpi($$0.getKey(), $$0.getValue().getAsString());
      }
   }
}
