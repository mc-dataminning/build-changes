import com.google.gson.JsonObject;
import java.util.Optional;

public class cu extends cw<cu.a> {
   public cu.a a(JsonObject $$0, Optional<bc> $$1, bg $$2) {
      aeu $$3 = new aeu(arj.i($$0, "recipe"));
      return new cu.a($$1, $$3);
   }

   public void a(ako $$0, cmf<?> $$1) {
      this.a($$0, $$1x -> $$1x.a($$1));
   }

   public static am<cu.a> a(aeu $$0) {
      return al.f.a(new cu.a(Optional.empty(), $$0));
   }

   public static class a extends at {
      private final aeu a;

      public a(Optional<bc> $$0, aeu $$1) {
         super($$0);
         this.a = $$1;
      }

      @Override
      public JsonObject a() {
         JsonObject $$0 = super.a();
         $$0.addProperty("recipe", this.a.toString());
         return $$0;
      }

      public boolean a(cmf<?> $$0) {
         return this.a.equals($$0.a());
      }
   }
}
