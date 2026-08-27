import com.google.gson.JsonObject;
import java.util.Optional;

public class cd extends cu<cd.a> {
   static final aer a = new aer("levitation");

   @Override
   public aer a() {
      return a;
   }

   public cd.a a(JsonObject $$0, Optional<ba> $$1, be $$2) {
      Optional<bf> $$3 = bf.a($$0.get("distance"));
      cj.d $$4 = cj.d.a($$0.get("duration"));
      return new cd.a($$1, $$3, $$4);
   }

   public void a(akl $$0, ehe $$1, int $$2) {
      this.a($$0, $$3 -> $$3.a($$0, $$1, $$2));
   }

   public static class a extends ar {
      private final Optional<bf> a;
      private final cj.d b;

      public a(Optional<ba> $$0, Optional<bf> $$1, cj.d $$2) {
         super(cd.a, $$0);
         this.a = $$1;
         this.b = $$2;
      }

      public static cd.a a(bf $$0) {
         return new cd.a(Optional.empty(), Optional.of($$0), cj.d.c);
      }

      public boolean a(akl $$0, ehe $$1, int $$2) {
         return this.a.isPresent() && !this.a.get().a($$1.c, $$1.d, $$1.e, $$0.dp(), $$0.dr(), $$0.dv()) ? false : this.b.d($$2);
      }

      @Override
      public JsonObject b() {
         JsonObject $$0 = super.b();
         this.a.ifPresent($$1 -> $$0.add("distance", $$1.a()));
         $$0.add("duration", this.b.e());
         return $$0;
      }
   }
}
