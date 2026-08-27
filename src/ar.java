import com.google.gson.JsonObject;
import java.util.Optional;

public abstract class ar implements am {
   private final aer a;
   private final Optional<ba> b;

   public ar(aer $$0, Optional<ba> $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   public aer a() {
      return this.a;
   }

   protected Optional<ba> c() {
      return this.b;
   }

   @Override
   public JsonObject b() {
      JsonObject $$0 = new JsonObject();
      this.b.ifPresent($$1 -> $$0.add("player", $$1.a()));
      return $$0;
   }

   @Override
   public String toString() {
      return "AbstractCriterionInstance{criterion=" + this.a + "}";
   }
}
