import com.google.common.collect.ImmutableSet;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import java.util.Set;

public class ece implements eck {
   final bd a;

   ece(bd $$0) {
      this.a = $$0;
   }

   @Override
   public ecl b() {
      return ecm.m;
   }

   @Override
   public Set<ebt<?>> a() {
      return ImmutableSet.of(ebw.f, ebw.c);
   }

   public boolean a(dzk $$0) {
      ben $$1 = $$0.c(ebw.c);
      eei $$2 = $$0.c(ebw.f);
      return $$2 != null && $$1 != null && this.a.a($$0.d(), $$2, $$1);
   }

   public static eck.a a(bd.a $$0) {
      return () -> new ece($$0.b());
   }

   public static class a implements dzt<ece> {
      public void a(JsonObject $$0, ece $$1, JsonSerializationContext $$2) {
         $$0.add("predicate", $$1.a.a());
      }

      public ece b(JsonObject $$0, JsonDeserializationContext $$1) {
         bd $$2 = bd.a($$0.get("predicate"));
         return new ece($$2);
      }
   }
}
