import com.google.gson.JsonObject;
import java.util.Optional;

public class cs extends cu<cs.a> {
   static final aer a = new aer("recipe_unlocked");

   @Override
   public aer a() {
      return a;
   }

   public cs.a a(JsonObject $$0, Optional<ba> $$1, be $$2) {
      aer $$3 = new aer(arg.i($$0, "recipe"));
      return new cs.a($$1, $$3);
   }

   public void a(akl $$0, cmb<?> $$1) {
      this.a($$0, $$1x -> $$1x.a($$1));
   }

   public static cs.a a(aer $$0) {
      return new cs.a(Optional.empty(), $$0);
   }

   public static class a extends ar {
      private final aer a;

      public a(Optional<ba> $$0, aer $$1) {
         super(cs.a, $$0);
         this.a = $$1;
      }

      @Override
      public JsonObject b() {
         JsonObject $$0 = super.b();
         $$0.addProperty("recipe", this.a.toString());
         return $$0;
      }

      public boolean a(cmb<?> $$0) {
         return this.a.equals($$0.e());
      }
   }
}
