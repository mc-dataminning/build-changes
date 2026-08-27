import com.google.gson.JsonObject;
import java.util.Optional;

public class db extends cw<db.a> {
   public db.a a(JsonObject $$0, Optional<bc> $$1, bg $$2) {
      Optional<bc> $$3 = bq.a($$0, "entity", $$2);
      return new db.a($$1, $$3);
   }

   public void a(akt $$0, bis $$1) {
      ecs $$2 = bq.b($$0, $$1);
      this.a($$0, $$1x -> $$1x.a($$2));
   }

   public static class a extends at {
      private final Optional<bc> a;

      public a(Optional<bc> $$0, Optional<bc> $$1) {
         super($$0);
         this.a = $$1;
      }

      public static am<db.a> a(bq.a $$0) {
         return al.n.a(new db.a(Optional.empty(), Optional.of(bq.a($$0))));
      }

      public boolean a(ecs $$0) {
         return this.a.isEmpty() || this.a.get().a($$0);
      }

      @Override
      public JsonObject a() {
         JsonObject $$0 = super.a();
         this.a.ifPresent($$1 -> $$0.add("entity", $$1.a()));
         return $$0;
      }
   }
}
