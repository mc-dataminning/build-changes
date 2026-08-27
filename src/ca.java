import com.google.gson.JsonObject;
import java.util.Optional;

public class ca extends cw<ca.a> {
   public ca.a a(JsonObject $$0, Optional<bc> $$1, bg $$2) {
      Optional<cb> $$3 = cb.a($$0.get("item"));
      cl.d $$4 = cl.d.a($$0.get("durability"));
      cl.d $$5 = cl.d.a($$0.get("delta"));
      return new ca.a($$1, $$3, $$4, $$5);
   }

   public void a(akt $$0, cjh $$1, int $$2) {
      this.a($$0, $$2x -> $$2x.a($$1, $$2));
   }

   public static class a extends at {
      private final Optional<cb> a;
      private final cl.d b;
      private final cl.d c;

      public a(Optional<bc> $$0, Optional<cb> $$1, cl.d $$2, cl.d $$3) {
         super($$0);
         this.a = $$1;
         this.b = $$2;
         this.c = $$3;
      }

      public static am<ca.a> a(Optional<cb> $$0, cl.d $$1) {
         return a(Optional.empty(), $$0, $$1);
      }

      public static am<ca.a> a(Optional<bc> $$0, Optional<cb> $$1, cl.d $$2) {
         return al.t.a(new ca.a($$0, $$1, $$2, cl.d.c));
      }

      public boolean a(cjh $$0, int $$1) {
         if (this.a.isPresent() && !this.a.get().a($$0)) {
            return false;
         } else {
            return !this.b.d($$0.l() - $$1) ? false : this.c.d($$0.k() - $$1);
         }
      }

      @Override
      public JsonObject a() {
         JsonObject $$0 = super.a();
         this.a.ifPresent($$1 -> $$0.add("item", $$1.a()));
         $$0.add("durability", this.b.e());
         $$0.add("delta", this.c.e());
         return $$0;
      }
   }
}
