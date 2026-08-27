import com.google.gson.JsonObject;
import java.util.Optional;

public abstract class at implements cw.a {
   private final Optional<bc> a;

   public at(Optional<bc> $$0) {
      this.a = $$0;
   }

   @Override
   public Optional<bc> b() {
      return this.a;
   }

   @Override
   public JsonObject a() {
      JsonObject $$0 = new JsonObject();
      this.a.ifPresent($$1 -> $$0.add("player", $$1.a()));
      return $$0;
   }
}
