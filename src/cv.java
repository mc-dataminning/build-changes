import com.google.gson.JsonObject;
import java.util.Optional;

public class cv extends cw<cv.a> {
   public cv.a a(JsonObject $$0, Optional<bc> $$1, bg $$2) {
      Optional<cb> $$3 = cb.a($$0.get("item"));
      return new cv.a($$1, $$3);
   }

   public void a(aku $$0, cjl $$1) {
      this.a($$0, $$1x -> $$1x.a($$1));
   }

   public static class a extends at {
      private final Optional<cb> a;

      public a(Optional<bc> $$0, Optional<cb> $$1) {
         super($$0);
         this.a = $$1;
      }

      public static am<cv.a> a(Optional<cb> $$0) {
         return al.F.a(new cv.a(Optional.empty(), $$0));
      }

      public static am<cv.a> a(cqa $$0) {
         return al.F.a(new cv.a(Optional.empty(), Optional.of(cb.a.a().a($$0).b())));
      }

      public boolean a(cjl $$0) {
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
