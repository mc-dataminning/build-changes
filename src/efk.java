import com.google.common.collect.ImmutableSet;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import java.util.Set;

public class efk implements efh {
   final bo a;
   final ech.b b;

   efk(bo $$0, ech.b $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   public efi b() {
      return efj.f;
   }

   @Override
   public Set<eeq<?>> a() {
      return ImmutableSet.of(eet.f, this.b.a());
   }

   public boolean a(ech $$0) {
      big $$1 = $$0.c(this.b.a());
      ehf $$2 = $$0.c(eet.f);
      return this.a.a($$0.d(), $$2, $$1);
   }

   public static efh.a a(ech.b $$0) {
      return a($$0, bo.a.a());
   }

   public static efh.a a(ech.b $$0, bo.a $$1) {
      return () -> new efk($$1.b(), $$0);
   }

   public static efh.a a(ech.b $$0, bo $$1) {
      return () -> new efk($$1, $$0);
   }

   public static class a implements ecq<efk> {
      public void a(JsonObject $$0, efk $$1, JsonSerializationContext $$2) {
         $$0.add("predicate", $$1.a.a());
         $$0.add("entity", $$2.serialize($$1.b));
      }

      public efk b(JsonObject $$0, JsonDeserializationContext $$1) {
         bo $$2 = bo.a($$0.get("predicate"));
         return new efk($$2, arf.a($$0, "entity", $$1, ech.b.class));
      }
   }
}
