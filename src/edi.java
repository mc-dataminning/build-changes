import com.google.common.collect.Sets;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import java.util.Set;

public class edi implements edf {
   final edf a;
   final edf b;

   edi(edf $$0, edf $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   public ede b() {
      return edg.b;
   }

   public static edi a(float $$0, float $$1) {
      return new edi(edd.a($$0), edd.a($$1));
   }

   @Override
   public int a(dzk $$0) {
      return apa.a($$0.b(), this.a.a($$0), this.b.a($$0));
   }

   @Override
   public float b(dzk $$0) {
      return apa.a($$0.b(), this.a.b($$0), this.b.b($$0));
   }

   @Override
   public Set<ebt<?>> a() {
      return Sets.union(this.a.a(), this.b.a());
   }

   public static class a implements dzt<edi> {
      public edi b(JsonObject $$0, JsonDeserializationContext $$1) {
         edf $$2 = aor.a($$0, "min", $$1, edf.class);
         edf $$3 = aor.a($$0, "max", $$1, edf.class);
         return new edi($$2, $$3);
      }

      public void a(JsonObject $$0, edi $$1, JsonSerializationContext $$2) {
         $$0.add("min", $$2.serialize($$1.a));
         $$0.add("max", $$2.serialize($$1.b));
      }
   }
}
