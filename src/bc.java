import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.mojang.serialization.JsonOps;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class bc {
   private final List<efp> a;
   private final Predicate<ecq> b;

   bc(List<efp> $$0) {
      if ($$0.isEmpty()) {
         throw new IllegalArgumentException("ContextAwarePredicate must have at least one condition");
      } else {
         this.a = $$0;
         this.b = efr.a($$0);
      }
   }

   public static bc a(efp... $$0) {
      return new bc(List.of($$0));
   }

   public static Optional<Optional<bc>> a(String $$0, bg $$1, @Nullable JsonElement $$2, eez $$3) {
      if ($$2 != null && $$2.isJsonArray()) {
         List<efp> $$4 = $$1.a($$2.getAsJsonArray(), $$1.a() + "/" + $$0, $$3);
         return $$4.isEmpty() ? Optional.of(Optional.empty()) : Optional.of(Optional.of(new bc($$4)));
      } else {
         return Optional.empty();
      }
   }

   public boolean a(ecq $$0) {
      return this.b.test($$0);
   }

   public JsonElement a() {
      return ac.a(efr.a.listOf().encodeStart(JsonOps.INSTANCE, this.a), IllegalStateException::new);
   }

   public static JsonElement a(List<bc> $$0) {
      if ($$0.isEmpty()) {
         return JsonNull.INSTANCE;
      } else {
         JsonArray $$1 = new JsonArray();

         for (bc $$2 : $$0) {
            $$1.add($$2.a());
         }

         return $$1;
      }
   }
}
