import com.google.gson.JsonObject;
import java.util.Optional;

public class co extends cu<co.a> {
   static final aer a = new aer("player_interacted_with_entity");

   @Override
   public aer a() {
      return a;
   }

   protected co.a a(JsonObject $$0, Optional<ba> $$1, be $$2) {
      Optional<bz> $$3 = bz.a($$0.get("item"));
      Optional<ba> $$4 = bo.a($$0, "entity", $$2);
      return new co.a($$1, $$3, $$4);
   }

   public void a(akl $$0, cix $$1, bii $$2) {
      ecg $$3 = bo.b($$0, $$2);
      this.a($$0, $$2x -> $$2x.a($$1, $$3));
   }

   public static class a extends ar {
      private final Optional<bz> a;
      private final Optional<ba> b;

      public a(Optional<ba> $$0, Optional<bz> $$1, Optional<ba> $$2) {
         super(co.a, $$0);
         this.a = $$1;
         this.b = $$2;
      }

      public static co.a a(Optional<ba> $$0, bz.a $$1, Optional<ba> $$2) {
         return new co.a($$0, $$1.b(), $$2);
      }

      public static co.a a(bz.a $$0, Optional<ba> $$1) {
         return a(Optional.empty(), $$0, $$1);
      }

      public boolean a(cix $$0, ecg $$1) {
         return this.a.isPresent() && !this.a.get().a($$0) ? false : this.b.isEmpty() || this.b.get().a($$1);
      }

      @Override
      public JsonObject b() {
         JsonObject $$0 = super.b();
         this.a.ifPresent($$1 -> $$0.add("item", $$1.a()));
         this.b.ifPresent($$1 -> $$0.add("entity", $$1.a()));
         return $$0;
      }
   }
}
