import com.google.gson.JsonObject;
import java.util.Optional;

public class de extends cw<de.a> {
   public de.a a(JsonObject $$0, Optional<bc> $$1, bg $$2) {
      cl.d $$3 = cl.d.a($$0.get("signal_strength"));
      Optional<bc> $$4 = bq.a($$0, "projectile", $$2);
      return new de.a($$1, $$3, $$4);
   }

   public void a(alr $$0, bjt $$1, eif $$2, int $$3) {
      edi $$4 = bq.b($$0, $$1);
      this.a($$0, $$3x -> $$3x.a($$4, $$2, $$3));
   }

   public static class a extends at {
      private final cl.d a;
      private final Optional<bc> b;

      public a(Optional<bc> $$0, cl.d $$1, Optional<bc> $$2) {
         super($$0);
         this.a = $$1;
         this.b = $$2;
      }

      public static am<de.a> a(cl.d $$0, Optional<bc> $$1) {
         return al.L.a(new de.a(Optional.empty(), $$0, $$1));
      }

      @Override
      public JsonObject a() {
         JsonObject $$0 = super.a();
         $$0.add("signal_strength", this.a.e());
         this.b.ifPresent($$1 -> $$0.add("projectile", $$1.a()));
         return $$0;
      }

      public boolean a(edi $$0, eif $$1, int $$2) {
         return !this.a.d($$2) ? false : !this.b.isPresent() || this.b.get().a($$0);
      }
   }
}
