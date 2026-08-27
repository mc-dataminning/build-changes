import com.google.common.collect.ImmutableSet;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import java.util.Set;

public class efb implements efh {
   final bd a;

   efb(bd $$0) {
      this.a = $$0;
   }

   @Override
   public efi b() {
      return efj.m;
   }

   @Override
   public Set<eeq<?>> a() {
      return ImmutableSet.of(eet.f, eet.c);
   }

   public boolean a(ech $$0) {
      bhe $$1 = $$0.c(eet.c);
      ehf $$2 = $$0.c(eet.f);
      return $$2 != null && $$1 != null && this.a.a($$0.d(), $$2, $$1);
   }

   public static efh.a a(bd.a $$0) {
      return () -> new efb($$0.b());
   }

   public static class a implements ecq<efb> {
      public void a(JsonObject $$0, efb $$1, JsonSerializationContext $$2) {
         $$0.add("predicate", $$1.a.a());
      }

      public efb b(JsonObject $$0, JsonDeserializationContext $$1) {
         bd $$2 = bd.a($$0.get("predicate"));
         return new efb($$2);
      }
   }
}
