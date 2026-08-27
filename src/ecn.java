import com.google.common.collect.ImmutableSet;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import java.util.Set;

public class ecn implements eck {
   final bo a;
   final dzk.b b;

   ecn(bo $$0, dzk.b $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   public ecl b() {
      return ecm.f;
   }

   @Override
   public Set<ebt<?>> a() {
      return ImmutableSet.of(ebw.f, this.b.a());
   }

   public boolean a(dzk $$0) {
      bfj $$1 = $$0.c(this.b.a());
      eei $$2 = $$0.c(ebw.f);
      return this.a.a($$0.d(), $$2, $$1);
   }

   public static eck.a a(dzk.b $$0) {
      return a($$0, bo.a.a());
   }

   public static eck.a a(dzk.b $$0, bo.a $$1) {
      return () -> new ecn($$1.b(), $$0);
   }

   public static eck.a a(dzk.b $$0, bo $$1) {
      return () -> new ecn($$1, $$0);
   }

   public static class a implements dzt<ecn> {
      public void a(JsonObject $$0, ecn $$1, JsonSerializationContext $$2) {
         $$0.add("predicate", $$1.a.a());
         $$0.add("entity", $$2.serialize($$1.b));
      }

      public ecn b(JsonObject $$0, JsonDeserializationContext $$1) {
         bo $$2 = bo.a($$0.get("predicate"));
         return new ecn($$2, aor.a($$0, "entity", $$1, dzk.b.class));
      }
   }
}
