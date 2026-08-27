import com.google.gson.JsonObject;
import java.util.Optional;

public class bp extends cw<bp.a> {
   public bp.a a(JsonObject $$0, Optional<bc> $$1, bg $$2) {
      Optional<be> $$3 = be.a($$0.get("damage"));
      return new bp.a($$1, $$3);
   }

   public void a(amb $$0, bjg $$1, float $$2, float $$3, boolean $$4) {
      this.a($$0, $$5 -> $$5.a($$0, $$1, $$2, $$3, $$4));
   }

   public static class a extends at {
      private final Optional<be> a;

      public a(Optional<bc> $$0, Optional<be> $$1) {
         super($$0);
         this.a = $$1;
      }

      public static am<bp.a> c() {
         return al.h.a(new bp.a(Optional.empty(), Optional.empty()));
      }

      public static am<bp.a> a(be $$0) {
         return al.h.a(new bp.a(Optional.empty(), Optional.of($$0)));
      }

      public static am<bp.a> a(be.a $$0) {
         return al.h.a(new bp.a(Optional.empty(), Optional.of($$0.b())));
      }

      public boolean a(amb $$0, bjg $$1, float $$2, float $$3, boolean $$4) {
         return !this.a.isPresent() || this.a.get().a($$0, $$1, $$2, $$3, $$4);
      }

      @Override
      public JsonObject a() {
         JsonObject $$0 = super.a();
         this.a.ifPresent($$1 -> $$0.add("damage", $$1.a()));
         return $$0;
      }
   }
}
