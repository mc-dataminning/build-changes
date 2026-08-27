import com.google.gson.JsonObject;
import java.util.Optional;

public class ct extends cu<ct.a> {
   static final aer a = new aer("shot_crossbow");

   @Override
   public aer a() {
      return a;
   }

   public ct.a a(JsonObject $$0, Optional<ba> $$1, be $$2) {
      Optional<bz> $$3 = bz.a($$0.get("item"));
      return new ct.a($$1, $$3);
   }

   public void a(akl $$0, ciy $$1) {
      this.a($$0, $$1x -> $$1x.a($$1));
   }

   public static class a extends ar {
      private final Optional<bz> a;

      public a(Optional<ba> $$0, Optional<bz> $$1) {
         super(ct.a, $$0);
         this.a = $$1;
      }

      public static ct.a a(Optional<bz> $$0) {
         return new ct.a(Optional.empty(), $$0);
      }

      public static ct.a a(cpl $$0) {
         return new ct.a(Optional.empty(), bz.a.a().a($$0).b());
      }

      public boolean a(ciy $$0) {
         return this.a.isEmpty() || this.a.get().a($$0);
      }

      @Override
      public JsonObject b() {
         JsonObject $$0 = super.b();
         this.a.ifPresent($$1 -> $$0.add("item", $$1.a()));
         return $$0;
      }
   }
}
