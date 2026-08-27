import com.google.common.collect.Sets;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import java.util.Set;

public class ect implements eck {
   final edf a;
   final dzj b;

   ect(edf $$0, dzj $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   public ecl b() {
      return ecm.r;
   }

   @Override
   public Set<ebt<?>> a() {
      return Sets.union(this.a.a(), this.b.a());
   }

   public boolean a(dzk $$0) {
      return this.b.b($$0, this.a.a($$0));
   }

   public static eck.a a(edf $$0, dzj $$1) {
      return () -> new ect($$0, $$1);
   }

   public static class a implements dzt<ect> {
      public void a(JsonObject $$0, ect $$1, JsonSerializationContext $$2) {
         $$0.add("value", $$2.serialize($$1.a));
         $$0.add("range", $$2.serialize($$1.b));
      }

      public ect b(JsonObject $$0, JsonDeserializationContext $$1) {
         edf $$2 = aor.a($$0, "value", $$1, edf.class);
         dzj $$3 = aor.a($$0, "range", $$1, dzj.class);
         return new ect($$2, $$3);
      }
   }
}
