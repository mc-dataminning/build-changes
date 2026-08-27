import com.google.gson.JsonObject;
import java.util.Optional;

public class ci extends cu<ci.a> {
   static final aer a = new aer("player_generates_container_loot");

   @Override
   public aer a() {
      return a;
   }

   protected ci.a a(JsonObject $$0, Optional<ba> $$1, be $$2) {
      aer $$3 = new aer(arg.i($$0, "loot_table"));
      return new ci.a($$1, $$3);
   }

   public void a(akl $$0, aer $$1) {
      this.a($$0, $$1x -> $$1x.b($$1));
   }

   public static class a extends ar {
      private final aer a;

      public a(Optional<ba> $$0, aer $$1) {
         super(ci.a, $$0);
         this.a = $$1;
      }

      public static ci.a a(aer $$0) {
         return new ci.a(Optional.empty(), $$0);
      }

      public boolean b(aer $$0) {
         return this.a.equals($$0);
      }

      @Override
      public JsonObject b() {
         JsonObject $$0 = super.b();
         $$0.addProperty("loot_table", this.a.toString());
         return $$0;
      }
   }
}
