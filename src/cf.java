import com.google.gson.JsonObject;
import java.util.Optional;

public class cf extends cw<cf.a> {
   public cf.a a(JsonObject $$0, Optional<bc> $$1, bg $$2) {
      Optional<bh> $$3 = bh.a($$0.get("distance"));
      cl.d $$4 = cl.d.a($$0.get("duration"));
      return new cf.a($$1, $$3, $$4);
   }

   public void a(akt $$0, ehp $$1, int $$2) {
      this.a($$0, $$3 -> $$3.a($$0, $$1, $$2));
   }

   public static class a extends at {
      private final Optional<bh> a;
      private final cl.d b;

      public a(Optional<bc> $$0, Optional<bh> $$1, cl.d $$2) {
         super($$0);
         this.a = $$1;
         this.b = $$2;
      }

      public static am<cf.a> a(bh $$0) {
         return al.u.a(new cf.a(Optional.empty(), Optional.of($$0), cl.d.c));
      }

      public boolean a(akt $$0, ehp $$1, int $$2) {
         return this.a.isPresent() && !this.a.get().a($$1.c, $$1.d, $$1.e, $$0.dq(), $$0.ds(), $$0.dw()) ? false : this.b.d($$2);
      }

      @Override
      public JsonObject a() {
         JsonObject $$0 = super.a();
         this.a.ifPresent($$1 -> $$0.add("distance", $$1.a()));
         $$0.add("duration", this.b.e());
         return $$0;
      }
   }
}
