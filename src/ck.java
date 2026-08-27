import com.google.gson.JsonObject;
import java.util.Optional;

public class ck extends cw<ck.a> {
   protected ck.a a(JsonObject $$0, Optional<bc> $$1, bg $$2) {
      agi $$3 = new agi(atc.i($$0, "loot_table"));
      return new ck.a($$1, $$3);
   }

   public void a(amf $$0, agi $$1) {
      this.a($$0, $$1x -> $$1x.b($$1));
   }

   public static class a extends at {
      private final agi a;

      public a(Optional<bc> $$0, agi $$1) {
         super($$0);
         this.a = $$1;
      }

      public static am<ck.a> a(agi $$0) {
         return al.N.a(new ck.a(Optional.empty(), $$0));
      }

      public boolean b(agi $$0) {
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
