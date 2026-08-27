import com.google.gson.JsonObject;
import java.util.Optional;

public class cu extends cw<cu.a> {
   public cu.a a(JsonObject $$0, Optional<bc> $$1, bg $$2) {
      agm $$3 = new agm(atg.i($$0, "recipe"));
      return new cu.a($$1, $$3);
   }

   public void a(amj $$0, cov<?> $$1) {
      this.a($$0, $$1x -> $$1x.a($$1));
   }

   public static am<cu.a> a(agm $$0) {
      return al.f.a(new cu.a(Optional.empty(), $$0));
   }

   public static class a extends at {
      private final agm a;

      public a(Optional<bc> $$0, agm $$1) {
         super($$0);
         this.a = $$1;
      }

      @Override
      public JsonObject a() {
         JsonObject $$0 = super.a();
         $$0.addProperty("recipe", this.a.toString());
         return $$0;
      }

      public boolean a(cov<?> $$0) {
         return this.a.equals($$0.a());
      }
   }
}
