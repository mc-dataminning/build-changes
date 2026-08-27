import com.google.gson.JsonObject;
import java.util.Optional;

public class bs extends cu<bs.a> {
   static final aer a = new aer("filled_bucket");

   @Override
   public aer a() {
      return a;
   }

   public bs.a a(JsonObject $$0, Optional<ba> $$1, be $$2) {
      Optional<bz> $$3 = bz.a($$0.get("item"));
      return new bs.a($$1, $$3);
   }

   public void a(akl $$0, cix $$1) {
      this.a($$0, $$1x -> $$1x.a($$1));
   }

   public static class a extends ar {
      private final Optional<bz> a;

      public a(Optional<ba> $$0, Optional<bz> $$1) {
         super(bs.a, $$0);
         this.a = $$1;
      }

      public static bs.a a(Optional<bz> $$0) {
         return new bs.a(Optional.empty(), $$0);
      }

      public boolean a(cix $$0) {
         return !this.a.isPresent() || this.a.get().a($$0);
      }

      @Override
      public JsonObject b() {
         JsonObject $$0 = super.b();
         this.a.ifPresent($$1 -> $$0.add("item", $$1.a()));
         return $$0;
      }
   }
}
