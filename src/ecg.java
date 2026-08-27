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

public class ecg {
   @Nullable
   final egc a;
   @Nullable
   final egc b;
   private final ecg.b c;
   private final ecg.a d;

   public Set<eeq<?>> a() {
      Builder<eeq<?>> $$0 = ImmutableSet.builder();
      if (this.a != null) {
         $$0.addAll(this.a.a());
      }

      if (this.b != null) {
         $$0.addAll(this.b.a());
      }

      return $$0.build();
   }

   ecg(@Nullable egc $$0, @Nullable egc $$1) {
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
         this.c = ($$2, $$3) -> aro.a($$3, $$0.a($$2), $$1.a($$2));
         this.d = ($$2, $$3) -> $$3 >= $$0.a($$2) && $$3 <= $$1.a($$2);
      }
   }

   public static ecg a(int $$0) {
      ega $$1 = ega.a((float)$$0);
      return new ecg($$1, $$1);
   }

   public static ecg a(int $$0, int $$1) {
      return new ecg(ega.a((float)$$0), ega.a((float)$$1));
   }

   public static ecg b(int $$0) {
      return new ecg(ega.a((float)$$0), null);
   }

   public static ecg c(int $$0) {
      return new ecg(null, ega.a((float)$$0));
   }

   public int a(ech $$0, int $$1) {
      return this.c.apply($$0, $$1);
   }

   public boolean b(ech $$0, int $$1) {
      return this.d.test($$0, $$1);
   }

   @FunctionalInterface
   interface a {
      boolean test(ech var1, int var2);
   }

   @FunctionalInterface
   interface b {
      int apply(ech var1, int var2);
   }

   public static class c implements JsonDeserializer<ecg>, JsonSerializer<ecg> {
      public ecg a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) {
         if ($$0.isJsonPrimitive()) {
            return ecg.a($$0.getAsInt());
         } else {
            JsonObject $$3 = arf.m($$0, "value");
            egc $$4 = $$3.has("min") ? arf.a($$3, "min", $$2, egc.class) : null;
            egc $$5 = $$3.has("max") ? arf.a($$3, "max", $$2, egc.class) : null;
            return new ecg($$4, $$5);
         }
      }

      public JsonElement a(ecg $$0, Type $$1, JsonSerializationContext $$2) {
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
