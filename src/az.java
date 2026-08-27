import com.google.gson.JsonObject;
import java.util.Optional;

public class az extends cu<az.a> {
   static final aer a = new aer("consume_item");

   @Override
   public aer a() {
      return a;
   }

   public az.a a(JsonObject $$0, Optional<ba> $$1, be $$2) {
      return new az.a($$1, bz.a($$0.get("item")));
   }

   public void a(akl $$0, cix $$1) {
      this.a($$0, $$1x -> $$1x.a($$1));
   }

   public static class a extends ar {
      private final Optional<bz> a;

      public a(Optional<ba> $$0, Optional<bz> $$1) {
         super(az.a, $$0);
         this.a = $$1;
      }

      public static az.a d() {
         return new az.a(Optional.empty(), Optional.empty());
      }

      public static az.a a(bz $$0) {
         return new az.a(Optional.empty(), Optional.of($$0));
      }

      public static az.a a(cpk $$0) {
         return new az.a(Optional.empty(), bz.a.a().a($$0.k()).b());
      }

      public boolean a(cix $$0) {
         return this.a.isEmpty() || this.a.get().a($$0);
      }

      @Override
      public JsonObject b() {
         JsonObject $$0 = super.b();
         this.a.ifPresent($$1 -> $$0.add("item", $$1.a()));
         return $$0;
      }
   }
}
