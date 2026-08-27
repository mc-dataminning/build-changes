import com.google.gson.JsonObject;
import java.util.Optional;

public class df extends cw<df.a> {
   public df.a a(JsonObject $$0, Optional<bc> $$1, bg $$2) {
      Optional<bc> $$3 = bq.a($$0, "villager", $$2);
      Optional<cb> $$4 = cb.a($$0.get("item"));
      return new df.a($$1, $$3, $$4);
   }

   public void a(amj $$0, cdh $$1, clo $$2) {
      efc $$3 = bq.b($$0, $$1);
      this.a($$0, $$2x -> $$2x.a($$3, $$2));
   }

   public static class a extends at {
      private final Optional<bc> a;
      private final Optional<cb> b;

      public a(Optional<bc> $$0, Optional<bc> $$1, Optional<cb> $$2) {
         super($$0);
         this.a = $$1;
         this.b = $$2;
      }

      public static am<df.a> c() {
         return al.s.a(new df.a(Optional.empty(), Optional.empty(), Optional.empty()));
      }

      public static am<df.a> a(bq.a $$0) {
         return al.s.a(new df.a(Optional.of(bq.a($$0)), Optional.empty(), Optional.empty()));
      }

      public boolean a(efc $$0, clo $$1) {
         return this.a.isPresent() && !this.a.get().a($$0) ? false : !this.b.isPresent() || this.b.get().a($$1);
      }

      @Override
      public JsonObject a() {
         JsonObject $$0 = super.a();
         this.b.ifPresent($$1 -> $$0.add("item", $$1.a()));
         this.a.ifPresent($$1 -> $$0.add("villager", $$1.a()));
         return $$0;
      }
   }
}
