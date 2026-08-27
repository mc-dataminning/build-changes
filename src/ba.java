import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.mojang.serialization.JsonOps;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class ba {
   private final List<efg> a;
   private final Predicate<ech> b;

   ba(List<efg> $$0) {
      if ($$0.isEmpty()) {
         throw new IllegalArgumentException("ContextAwarePredicate must have at least one condition");
      } else {
         this.a = $$0;
         this.b = efi.a($$0);
      }
   }

   public static ba a(efg... $$0) {
      return new ba(List.of($$0));
   }

   public static Optional<Optional<ba>> a(String $$0, be $$1, @Nullable JsonElement $$2, eeq $$3) {
      if ($$2 != null && $$2.isJsonArray()) {
         List<efg> $$4 = $$1.a($$2.getAsJsonArray(), $$1.a() + "/" + $$0, $$3);
         return $$4.isEmpty() ? Optional.of(Optional.empty()) : Optional.of(Optional.of(new ba($$4)));
      } else {
         return Optional.empty();
      }
   }

   public boolean a(ech $$0) {
      return this.b.test($$0);
   }

   public JsonElement a() {
      return ac.a(efi.a.listOf().encodeStart(JsonOps.INSTANCE, this.a), IllegalStateException::new);
   }

   public static JsonElement a(List<ba> $$0) {
      if ($$0.isEmpty()) {
         return JsonNull.INSTANCE;
      } else {
         JsonArray $$1 = new JsonArray();

         for (ba $$2 : $$0) {
            $$1.add($$2.a());
         }

         return $$1;
      }
   }
}
