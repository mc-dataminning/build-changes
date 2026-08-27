import com.google.gson.JsonObject;
import java.util.Optional;

public class bn extends cu<bn.a> {
   static final aer a = new aer("entity_hurt_player");

   @Override
   public aer a() {
      return a;
   }

   public bn.a a(JsonObject $$0, Optional<ba> $$1, be $$2) {
      Optional<bc> $$3 = bc.a($$0.get("damage"));
      return new bn.a($$1, $$3);
   }

   public void a(akl $$0, bhg $$1, float $$2, float $$3, boolean $$4) {
      this.a($$0, $$5 -> $$5.a($$0, $$1, $$2, $$3, $$4));
   }

   public static class a extends ar {
      private final Optional<bc> a;

      public a(Optional<ba> $$0, Optional<bc> $$1) {
         super(bn.a, $$0);
         this.a = $$1;
      }

      public static bn.a d() {
         return new bn.a(Optional.empty(), Optional.empty());
      }

      public static bn.a a(bc $$0) {
         return new bn.a(Optional.empty(), Optional.of($$0));
      }

      public static bn.a a(bc.a $$0) {
         return new bn.a(Optional.empty(), $$0.b());
      }

      public boolean a(akl $$0, bhg $$1, float $$2, float $$3, boolean $$4) {
         return !this.a.isPresent() || this.a.get().a($$0, $$1, $$2, $$3, $$4);
      }

      @Override
      public JsonObject b() {
         JsonObject $$0 = super.b();
         this.a.ifPresent($$1 -> $$0.add("damage", $$1.a()));
         return $$0;
      }
   }
}
