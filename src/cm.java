import com.google.gson.JsonObject;
import java.util.Optional;
import javax.annotation.Nullable;

public class cm extends cu<cm.a> {
   private final aer a;

   public cm(aer $$0) {
      this.a = $$0;
   }

   @Override
   public aer a() {
      return this.a;
   }

   protected cm.a a(JsonObject $$0, Optional<ba> $$1, be $$2) {
      Optional<bz> $$3 = bz.a($$0.get("item"));
      Optional<ba> $$4 = bo.a($$0, "entity", $$2);
      return new cm.a(this.a, $$1, $$3, $$4);
   }

   public void a(akl $$0, cix $$1, @Nullable bii $$2) {
      ecg $$3 = bo.b($$0, $$2);
      this.a($$0, $$3x -> $$3x.a($$0, $$1, $$3));
   }

   public static class a extends ar {
      private final Optional<bz> a;
      private final Optional<ba> b;

      public a(aer $$0, Optional<ba> $$1, Optional<bz> $$2, Optional<ba> $$3) {
         super($$0, $$1);
         this.a = $$2;
         this.b = $$3;
      }

      public static cm.a a(ba $$0, Optional<bz> $$1, Optional<ba> $$2) {
         return new cm.a(ai.O.a(), Optional.of($$0), $$1, $$2);
      }

      public static cm.a a(Optional<ba> $$0, Optional<bz> $$1, Optional<ba> $$2) {
         return new cm.a(ai.P.a(), $$0, $$1, $$2);
      }

      public boolean a(akl $$0, cix $$1, ecg $$2) {
         return this.a.isPresent() && !this.a.get().a($$1) ? false : !this.b.isPresent() || this.b.get().a($$2);
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
