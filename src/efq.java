import com.google.common.collect.Sets;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import java.util.Set;

public class efq implements efh {
   final egc a;
   final ecg b;

   efq(egc $$0, ecg $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   public efi b() {
      return efj.r;
   }

   @Override
   public Set<eeq<?>> a() {
      return Sets.union(this.a.a(), this.b.a());
   }

   public boolean a(ech $$0) {
      return this.b.b($$0, this.a.a($$0));
   }

   public static efh.a a(egc $$0, ecg $$1) {
      return () -> new efq($$0, $$1);
   }

   public static class a implements ecq<efq> {
      public void a(JsonObject $$0, efq $$1, JsonSerializationContext $$2) {
         $$0.add("value", $$2.serialize($$1.a));
         $$0.add("range", $$2.serialize($$1.b));
      }

      public efq b(JsonObject $$0, JsonDeserializationContext $$1) {
         egc $$2 = arf.a($$0, "value", $$1, egc.class);
         ecg $$3 = arf.a($$0, "range", $$1, ecg.class);
         return new efq($$2, $$3);
      }
   }
}
