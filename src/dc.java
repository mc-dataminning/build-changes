import com.google.gson.JsonObject;
import java.util.Optional;

public class dc extends cu<dc.a> {
   static final aer a = new aer("target_hit");

   @Override
   public aer a() {
      return a;
   }

   public dc.a a(JsonObject $$0, Optional<ba> $$1, be $$2) {
      cj.d $$3 = cj.d.a($$0.get("signal_strength"));
      Optional<ba> $$4 = bo.a($$0, "projectile", $$2);
      return new dc.a($$1, $$3, $$4);
   }

   public void a(akl $$0, bii $$1, ehe $$2, int $$3) {
      ech $$4 = bo.b($$0, $$1);
      this.a($$0, $$3x -> $$3x.a($$4, $$2, $$3));
   }

   public static class a extends ar {
      private final cj.d a;
      private final Optional<ba> b;

      public a(Optional<ba> $$0, cj.d $$1, Optional<ba> $$2) {
         super(dc.a, $$0);
         this.a = $$1;
         this.b = $$2;
      }

      public static dc.a a(cj.d $$0, Optional<ba> $$1) {
         return new dc.a(Optional.empty(), $$0, $$1);
      }

      @Override
      public JsonObject b() {
         JsonObject $$0 = super.b();
         $$0.add("signal_strength", this.a.e());
         this.b.ifPresent($$1 -> $$0.add("projectile", $$1.a()));
         return $$0;
      }

      public boolean a(ech $$0, ehe $$1, int $$2) {
         return !this.a.d($$2) ? false : !this.b.isPresent() || this.b.get().a($$0);
      }
   }
}
