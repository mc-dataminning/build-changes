import com.google.gson.JsonObject;
import java.util.Optional;

public class db extends cu<db.a> {
   static final aer a = new aer("tame_animal");

   @Override
   public aer a() {
      return a;
   }

   public db.a a(JsonObject $$0, Optional<ba> $$1, be $$2) {
      Optional<ba> $$3 = bo.a($$0, "entity", $$2);
      return new db.a($$1, $$3);
   }

   public void a(akl $$0, buk $$1) {
      ech $$2 = bo.b($$0, $$1);
      this.a($$0, $$1x -> $$1x.a($$2));
   }

   public static class a extends ar {
      private final Optional<ba> a;

      public a(Optional<ba> $$0, Optional<ba> $$1) {
         super(db.a, $$0);
         this.a = $$1;
      }

      public static db.a d() {
         return new db.a(Optional.empty(), Optional.empty());
      }

      public static db.a a(Optional<bo> $$0) {
         return new db.a(Optional.empty(), bo.a($$0));
      }

      public boolean a(ech $$0) {
         return this.a.isEmpty() || this.a.get().a($$0);
      }

      @Override
      public JsonObject b() {
         JsonObject $$0 = super.b();
         this.a.ifPresent($$1 -> $$0.add("entity", $$1.a()));
         return $$0;
      }
   }
}
