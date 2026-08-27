import com.google.common.collect.Sets;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import java.util.Set;

public class egf implements egc {
   final egc a;
   final egc b;

   egf(egc $$0, egc $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   public egb b() {
      return egd.b;
   }

   public static egf a(float $$0, float $$1) {
      return new egf(ega.a($$0), ega.a($$1));
   }

   @Override
   public int a(ech $$0) {
      return aro.a($$0.b(), this.a.a($$0), this.b.a($$0));
   }

   @Override
   public float b(ech $$0) {
      return aro.a($$0.b(), this.a.b($$0), this.b.b($$0));
   }

   @Override
   public Set<eeq<?>> a() {
      return Sets.union(this.a.a(), this.b.a());
   }

   public static class a implements ecq<egf> {
      public egf b(JsonObject $$0, JsonDeserializationContext $$1) {
         egc $$2 = arf.a($$0, "min", $$1, egc.class);
         egc $$3 = arf.a($$0, "max", $$1, egc.class);
         return new egf($$2, $$3);
      }

      public void a(JsonObject $$0, egf $$1, JsonSerializationContext $$2) {
         $$0.add("min", $$2.serialize($$1.a));
         $$0.add("max", $$2.serialize($$1.b));
      }
   }
}
