import com.google.gson.JsonObject;
import java.util.Optional;

public class bu extends cw<bu.a> {
   public bu.a a(JsonObject $$0, Optional<bc> $$1, bg $$2) {
      Optional<cb> $$3 = cb.a($$0.get("item"));
      return new bu.a($$1, $$3);
   }

   public void a(akt $$0, cjh $$1) {
      this.a($$0, $$1x -> $$1x.a($$1));
   }

   public static class a extends at {
      private final Optional<cb> a;

      public a(Optional<bc> $$0, Optional<cb> $$1) {
         super($$0);
         this.a = $$1;
      }

      public static am<bu.a> a(cb.a $$0) {
         return al.j.a(new bu.a(Optional.empty(), Optional.of($$0.b())));
      }

      public boolean a(cjh $$0) {
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
