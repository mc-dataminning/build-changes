import com.google.common.collect.ImmutableSet;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import java.util.Set;

public class efo implements efh {
   final bz a;

   public efo(bz $$0) {
      this.a = $$0;
   }

   @Override
   public efi b() {
      return efj.j;
   }

   @Override
   public Set<eeq<?>> a() {
      return ImmutableSet.of(eet.i);
   }

   public boolean a(ech $$0) {
      ciw $$1 = $$0.c(eet.i);
      return $$1 != null && this.a.a($$1);
   }

   public static efh.a a(bz.a $$0) {
      return () -> new efo($$0.b());
   }

   public static class a implements ecq<efo> {
      public void a(JsonObject $$0, efo $$1, JsonSerializationContext $$2) {
         $$0.add("predicate", $$1.a.a());
      }

      public efo b(JsonObject $$0, JsonDeserializationContext $$1) {
         bz $$2 = bz.a($$0.get("predicate"));
         return new efo($$2);
      }
   }
}
