import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableSet.Builder;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import java.lang.reflect.Type;
import java.util.Objects;
import java.util.Set;
import javax.annotation.Nullable;

public class dzj {
   @Nullable
   final edf a;
   @Nullable
   final edf b;
   private final dzj.b c;
   private final dzj.a d;

   public Set<ebt<?>> a() {
      Builder<ebt<?>> $$0 = ImmutableSet.builder();
      if (this.a != null) {
         $$0.addAll(this.a.a());
      }

      if (this.b != null) {
         $$0.addAll(this.b.a());
      }

      return $$0.build();
   }

   dzj(@Nullable edf $$0, @Nullable edf $$1) {
      this.a = $$0;
      this.b = $$1;
      if ($$0 == null) {
         if ($$1 == null) {
            this.c = ($$0x, $$1x) -> $$1x;
            this.d = ($$0x, $$1x) -> true;
         } else {
            this.c = ($$1x, $$2) -> Math.min($$1.a($$1x), $$2);
            this.d = ($$1x, $$2) -> $$2 <= $$1.a($$1x);
         }
      } else if ($$1 == null) {
         this.c = ($$1x, $$2) -> Math.max($$0.a($$1x), $$2);
         this.d = ($$1x, $$2) -> $$2 >= $$0.a($$1x);
      } else {
         this.c = ($$2, $$3) -> apa.a($$3, $$0.a($$2), $$1.a($$2));
         this.d = ($$2, $$3) -> $$3 >= $$0.a($$2) && $$3 <= $$1.a($$2);
      }
   }

   public static dzj a(int $$0) {
      edd $$1 = edd.a((float)$$0);
      return new dzj($$1, $$1);
   }

   public static dzj a(int $$0, int $$1) {
      return new dzj(edd.a((float)$$0), edd.a((float)$$1));
   }

   public static dzj b(int $$0) {
      return new dzj(edd.a((float)$$0), null);
   }

   public static dzj c(int $$0) {
      return new dzj(null, edd.a((float)$$0));
   }

   public int a(dzk $$0, int $$1) {
      return this.c.apply($$0, $$1);
   }

   public boolean b(dzk $$0, int $$1) {
      return this.d.test($$0, $$1);
   }

   @FunctionalInterface
   interface a {
      boolean test(dzk var1, int var2);
   }

   @FunctionalInterface
   interface b {
      int apply(dzk var1, int var2);
   }

   public static class c implements JsonDeserializer<dzj>, JsonSerializer<dzj> {
      public dzj a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) {
         if ($$0.isJsonPrimitive()) {
            return dzj.a($$0.getAsInt());
         } else {
            JsonObject $$3 = aor.m($$0, "value");
            edf $$4 = $$3.has("min") ? aor.a($$3, "min", $$2, edf.class) : null;
            edf $$5 = $$3.has("max") ? aor.a($$3, "max", $$2, edf.class) : null;
            return new dzj($$4, $$5);
         }
      }

      public JsonElement a(dzj $$0, Type $$1, JsonSerializationContext $$2) {
         JsonObject $$3 = new JsonObject();
         if (Objects.equals($$0.b, $$0.a)) {
            return $$2.serialize($$0.a);
         } else {
            if ($$0.b != null) {
               $$3.add("max", $$2.serialize($$0.b));
            }

            if ($$0.a != null) {
               $$3.add("min", $$2.serialize($$0.a));
            }

            return $$3;
         }
      }
   }
}
