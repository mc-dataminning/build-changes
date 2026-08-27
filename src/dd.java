import com.google.gson.JsonObject;
import java.util.Optional;

public class dd extends cu<dd.a> {
   static final aer a = new aer("villager_trade");

   @Override
   public aer a() {
      return a;
   }

   public dd.a a(JsonObject $$0, Optional<ba> $$1, be $$2) {
      Optional<ba> $$3 = bo.a($$0, "villager", $$2);
      Optional<bz> $$4 = bz.a($$0.get("item"));
      return new dd.a($$1, $$3, $$4);
   }

   public void a(akl $$0, cav $$1, ciy $$2) {
      ech $$3 = bo.b($$0, $$1);
      this.a($$0, $$2x -> $$2x.a($$3, $$2));
   }

   public static class a extends ar {
      private final Optional<ba> a;
      private final Optional<bz> b;

      public a(Optional<ba> $$0, Optional<ba> $$1, Optional<bz> $$2) {
         super(dd.a, $$0);
         this.a = $$1;
         this.b = $$2;
      }

      public static dd.a d() {
         return new dd.a(Optional.empty(), Optional.empty(), Optional.empty());
      }

      public static dd.a a(bo.a $$0) {
         return new dd.a(bo.a($$0), Optional.empty(), Optional.empty());
      }

      public boolean a(ech $$0, ciy $$1) {
         return this.a.isPresent() && !this.a.get().a($$0) ? false : !this.b.isPresent() || this.b.get().a($$1);
      }

      @Override
      public JsonObject b() {
         JsonObject $$0 = super.b();
         this.b.ifPresent($$1 -> $$0.add("item", $$1.a()));
         this.a.ifPresent($$1 -> $$0.add("villager", $$1.a()));
         return $$0;
      }
   }
}
