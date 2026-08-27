import com.google.gson.JsonObject;
import java.util.Optional;
import javax.annotation.Nullable;

public class co extends cw<co.a> {
   protected co.a a(JsonObject $$0, Optional<bc> $$1, bg $$2) {
      Optional<cb> $$3 = cb.a($$0.get("item"));
      Optional<bc> $$4 = bq.a($$0, "entity", $$2);
      return new co.a($$1, $$3, $$4);
   }

   public void a(ako $$0, cja $$1, @Nullable bil $$2) {
      ecl $$3 = bq.b($$0, $$2);
      this.a($$0, $$3x -> $$3x.a($$0, $$1, $$3));
   }

   public static class a extends at {
      private final Optional<cb> a;
      private final Optional<bc> b;

      public a(Optional<bc> $$0, Optional<cb> $$1, Optional<bc> $$2) {
         super($$0);
         this.a = $$1;
         this.b = $$2;
      }

      public static am<co.a> a(bc $$0, Optional<cb> $$1, Optional<bc> $$2) {
         return al.O.a(new co.a(Optional.of($$0), $$1, $$2));
      }

      public static am<co.a> a(Optional<bc> $$0, Optional<cb> $$1, Optional<bc> $$2) {
         return al.P.a(new co.a($$0, $$1, $$2));
      }

      public boolean a(ako $$0, cja $$1, ecl $$2) {
         return this.a.isPresent() && !this.a.get().a($$1) ? false : !this.b.isPresent() || this.b.get().a($$2);
      }

      @Override
      public JsonObject a() {
         JsonObject $$0 = super.a();
         this.a.ifPresent($$1 -> $$0.add("item", $$1.a()));
         this.b.ifPresent($$1 -> $$0.add("entity", $$1.a()));
         return $$0;
      }
   }
}
