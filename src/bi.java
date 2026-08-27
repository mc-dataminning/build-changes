import com.google.gson.JsonObject;
import java.util.Optional;

public class bi extends cu<bi.a> {
   static final aer a = new aer("enchanted_item");

   @Override
   public aer a() {
      return a;
   }

   public bi.a a(JsonObject $$0, Optional<ba> $$1, be $$2) {
      Optional<bz> $$3 = bz.a($$0.get("item"));
      cj.d $$4 = cj.d.a($$0.get("levels"));
      return new bi.a($$1, $$3, $$4);
   }

   public void a(akl $$0, ciy $$1, int $$2) {
      this.a($$0, $$2x -> $$2x.a($$1, $$2));
   }

   public static class a extends ar {
      private final Optional<bz> a;
      private final cj.d b;

      public a(Optional<ba> $$0, Optional<bz> $$1, cj.d $$2) {
         super(bi.a, $$0);
         this.a = $$1;
         this.b = $$2;
      }

      public static bi.a d() {
         return new bi.a(Optional.empty(), Optional.empty(), cj.d.c);
      }

      public boolean a(ciy $$0, int $$1) {
         return this.a.isPresent() && !this.a.get().a($$0) ? false : this.b.d($$1);
      }

      @Override
      public JsonObject b() {
         JsonObject $$0 = super.b();
         this.a.ifPresent($$1 -> $$0.add("item", $$1.a()));
         $$0.add("levels", this.b.e());
         return $$0;
      }
   }
}
