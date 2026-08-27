import com.google.gson.JsonObject;
import java.util.Optional;

public class di extends cw<di.a> {
   public di.a a(JsonObject $$0, Optional<bc> $$1, bg $$2) {
      Optional<cb> $$3 = cb.a($$0.get("item"));
      return new di.a($$1, $$3);
   }

   public void a(ako $$0, cja $$1) {
      this.a($$0, $$1x -> $$1x.a($$1));
   }

   public static class a extends at {
      private final Optional<cb> a;

      public a(Optional<bc> $$0, Optional<cb> $$1) {
         super($$0);
         this.a = $$1;
      }

      public static am<di.a> a(bq.a $$0, cb.a $$1) {
         return al.T.a(new di.a(Optional.of(bq.a($$0)), Optional.of($$1.b())));
      }

      public boolean a(cja $$0) {
         return !this.a.isPresent() || this.a.get().a($$0);
      }

      @Override
      public JsonObject a() {
         JsonObject $$0 = super.a();
         this.a.ifPresent($$1 -> $$0.add("item", $$1.a()));
         return $$0;
      }
   }
}
