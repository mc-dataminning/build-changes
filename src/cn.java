import com.google.gson.JsonObject;
import java.util.Optional;

public class cn extends cu<cn.a> {
   static final aer a = new aer("player_hurt_entity");

   @Override
   public aer a() {
      return a;
   }

   public cn.a a(JsonObject $$0, Optional<ba> $$1, be $$2) {
      Optional<bc> $$3 = bc.a($$0.get("damage"));
      Optional<ba> $$4 = bo.a($$0, "entity", $$2);
      return new cn.a($$1, $$3, $$4);
   }

   public void a(akl $$0, bii $$1, bhg $$2, float $$3, float $$4, boolean $$5) {
      ech $$6 = bo.b($$0, $$1);
      this.a($$0, $$6x -> $$6x.a($$0, $$6, $$2, $$3, $$4, $$5));
   }

   public static class a extends ar {
      private final Optional<bc> a;
      private final Optional<ba> b;

      public a(Optional<ba> $$0, Optional<bc> $$1, Optional<ba> $$2) {
         super(cn.a, $$0);
         this.a = $$1;
         this.b = $$2;
      }

      public static cn.a d() {
         return new cn.a(Optional.empty(), Optional.empty(), Optional.empty());
      }

      public static cn.a a(Optional<bc> $$0) {
         return new cn.a(Optional.empty(), $$0, Optional.empty());
      }

      public static cn.a a(bc.a $$0) {
         return new cn.a(Optional.empty(), $$0.b(), Optional.empty());
      }

      public static cn.a b(Optional<bo> $$0) {
         return new cn.a(Optional.empty(), Optional.empty(), bo.a($$0));
      }

      public static cn.a a(Optional<bc> $$0, Optional<bo> $$1) {
         return new cn.a(Optional.empty(), $$0, bo.a($$1));
      }

      public static cn.a a(bc.a $$0, Optional<bo> $$1) {
         return new cn.a(Optional.empty(), $$0.b(), bo.a($$1));
      }

      public boolean a(akl $$0, ech $$1, bhg $$2, float $$3, float $$4, boolean $$5) {
         return this.a.isPresent() && !this.a.get().a($$0, $$2, $$3, $$4, $$5) ? false : !this.b.isPresent() || this.b.get().a($$1);
      }

      @Override
      public JsonObject b() {
         JsonObject $$0 = super.b();
         this.a.ifPresent($$1 -> $$0.add("damage", $$1.a()));
         this.b.ifPresent($$1 -> $$0.add("entity", $$1.a()));
         return $$0;
      }
   }
}
