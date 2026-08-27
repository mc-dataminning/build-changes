import com.google.gson.JsonObject;
import java.util.Optional;

public class by extends cu<by.a> {
   static final aer a = new aer("item_durability_changed");

   @Override
   public aer a() {
      return a;
   }

   public by.a a(JsonObject $$0, Optional<ba> $$1, be $$2) {
      Optional<bz> $$3 = bz.a($$0.get("item"));
      cj.d $$4 = cj.d.a($$0.get("durability"));
      cj.d $$5 = cj.d.a($$0.get("delta"));
      return new by.a($$1, $$3, $$4, $$5);
   }

   public void a(akl $$0, ciy $$1, int $$2) {
      this.a($$0, $$2x -> $$2x.a($$1, $$2));
   }

   public static class a extends ar {
      private final Optional<bz> a;
      private final cj.d b;
      private final cj.d c;

      public a(Optional<ba> $$0, Optional<bz> $$1, cj.d $$2, cj.d $$3) {
         super(by.a, $$0);
         this.a = $$1;
         this.b = $$2;
         this.c = $$3;
      }

      public static by.a a(Optional<bz> $$0, cj.d $$1) {
         return a(Optional.empty(), $$0, $$1);
      }

      public static by.a a(Optional<ba> $$0, Optional<bz> $$1, cj.d $$2) {
         return new by.a($$0, $$1, $$2, cj.d.c);
      }

      public boolean a(ciy $$0, int $$1) {
         if (this.a.isPresent() && !this.a.get().a($$0)) {
            return false;
         } else {
            return !this.b.d($$0.l() - $$1) ? false : this.c.d($$0.k() - $$1);
         }
      }

      @Override
      public JsonObject b() {
         JsonObject $$0 = super.b();
         this.a.ifPresent($$1 -> $$0.add("item", $$1.a()));
         $$0.add("durability", this.b.e());
         $$0.add("delta", this.c.e());
         return $$0;
      }
   }
}
