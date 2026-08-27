import com.google.gson.JsonObject;
import java.util.Optional;

public class ck extends cw<ck.a> {
   protected ck.a a(JsonObject $$0, Optional<bc> $$1, bg $$2) {
      aeu $$3 = new aeu(arj.i($$0, "loot_table"));
      return new ck.a($$1, $$3);
   }

   public void a(ako $$0, aeu $$1) {
      this.a($$0, $$1x -> $$1x.b($$1));
   }

   public static class a extends at {
      private final aeu a;

      public a(Optional<bc> $$0, aeu $$1) {
         super($$0);
         this.a = $$1;
      }

      public static am<ck.a> a(aeu $$0) {
         return al.N.a(new ck.a(Optional.empty(), $$0));
      }

      public boolean b(aeu $$0) {
         return this.a.equals($$0);
      }

      @Override
      public JsonObject a() {
         JsonObject $$0 = super.a();
         $$0.addProperty("loot_table", this.a.toString());
         return $$0;
      }
   }
}
