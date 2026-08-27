import com.google.gson.JsonObject;
import java.util.Optional;

public class bd extends cw<bd.a> {
   public bd.a a(JsonObject $$0, Optional<bc> $$1, bg $$2) {
      Optional<bc> $$3 = bq.a($$0, "zombie", $$2);
      Optional<bc> $$4 = bq.a($$0, "villager", $$2);
      return new bd.a($$1, $$3, $$4);
   }

   public void a(ako $$0, bzw $$1, cbc $$2) {
      ecl $$3 = bq.b($$0, $$1);
      ecl $$4 = bq.b($$0, $$2);
      this.a($$0, $$2x -> $$2x.a($$3, $$4));
   }

   public static class a extends at {
      private final Optional<bc> a;
      private final Optional<bc> b;

      public a(Optional<bc> $$0, Optional<bc> $$1, Optional<bc> $$2) {
         super($$0);
         this.a = $$1;
         this.b = $$2;
      }

      public static am<bd.a> c() {
         return al.r.a(new bd.a(Optional.empty(), Optional.empty(), Optional.empty()));
      }

      public boolean a(ecl $$0, ecl $$1) {
         return this.a.isPresent() && !this.a.get().a($$0) ? false : !this.b.isPresent() || this.b.get().a($$1);
      }

      @Override
      public JsonObject a() {
         JsonObject $$0 = super.a();
         this.a.ifPresent($$1 -> $$0.add("zombie", $$1.a()));
         this.b.ifPresent($$1 -> $$0.add("villager", $$1.a()));
         return $$0;
      }
   }
}
