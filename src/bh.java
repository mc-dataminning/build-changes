import com.google.gson.JsonObject;
import java.util.Optional;
import javax.annotation.Nullable;

public class bh extends cu<bh.a> {
   static final aer a = new aer("effects_changed");

   @Override
   public aer a() {
      return a;
   }

   public bh.a a(JsonObject $$0, Optional<ba> $$1, be $$2) {
      Optional<ck> $$3 = ck.a($$0.get("effects"));
      Optional<ba> $$4 = bo.a($$0, "source", $$2);
      return new bh.a($$1, $$3, $$4);
   }

   public void a(akl $$0, @Nullable bii $$1) {
      ech $$2 = $$1 != null ? bo.b($$0, $$1) : null;
      this.a($$0, $$2x -> $$2x.a($$0, $$2));
   }

   public static class a extends ar {
      private final Optional<ck> a;
      private final Optional<ba> b;

      public a(Optional<ba> $$0, Optional<ck> $$1, Optional<ba> $$2) {
         super(bh.a, $$0);
         this.a = $$1;
         this.b = $$2;
      }

      public static bh.a a(ck.a $$0) {
         return new bh.a(Optional.empty(), $$0.b(), Optional.empty());
      }

      public static bh.a a(Optional<bo> $$0) {
         return new bh.a(Optional.empty(), Optional.empty(), bo.a($$0));
      }

      public boolean a(akl $$0, @Nullable ech $$1) {
         return this.a.isPresent() && !this.a.get().a((biy)$$0) ? false : !this.b.isPresent() || $$1 != null && this.b.get().a($$1);
      }

      @Override
      public JsonObject b() {
         JsonObject $$0 = super.b();
         this.a.ifPresent($$1 -> $$0.add("effects", $$1.a()));
         this.b.ifPresent($$1 -> $$0.add("source", $$1.a()));
         return $$0;
      }
   }
}
