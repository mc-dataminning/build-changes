import com.google.gson.JsonObject;
import java.util.Optional;

public class bb extends cw<bb.a> {
   public bb.a a(JsonObject $$0, Optional<bc> $$1, bg $$2) {
      return new bb.a($$1, cb.a($$0.get("item")));
   }

   public void a(amj $$0, clo $$1) {
      this.a($$0, $$1x -> $$1x.a($$1));
   }

   public static class a extends at {
      private final Optional<cb> a;

      public a(Optional<bc> $$0, Optional<cb> $$1) {
         super($$0);
         this.a = $$1;
      }

      public static am<bb.a> c() {
         return al.z.a(new bb.a(Optional.empty(), Optional.empty()));
      }

      public static am<bb.a> a(cse $$0) {
         return a(cb.a.a().a($$0.k()));
      }

      public static am<bb.a> a(cb.a $$0) {
         return al.z.a(new bb.a(Optional.empty(), Optional.of($$0.b())));
      }

      public boolean a(clo $$0) {
         return this.a.isEmpty() || this.a.get().a($$0);
      }

      @Override
      public JsonObject a() {
         JsonObject $$0 = super.a();
         this.a.ifPresent($$1 -> $$0.add("item", $$1.a()));
         return $$0;
      }
   }
}
