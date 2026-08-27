import com.google.gson.JsonObject;
import java.util.Optional;

public class cq extends cw<cq.a> {
   protected cq.a a(JsonObject $$0, Optional<bc> $$1, bg $$2) {
      Optional<cb> $$3 = cb.a($$0.get("item"));
      Optional<bc> $$4 = bq.a($$0, "entity", $$2);
      return new cq.a($$1, $$3, $$4);
   }

   public void a(aks $$0, cjf $$1, biq $$2) {
      ecq $$3 = bq.b($$0, $$2);
      this.a($$0, $$2x -> $$2x.a($$1, $$3));
   }

   public static class a extends at {
      private final Optional<cb> a;
      private final Optional<bc> b;

      public a(Optional<bc> $$0, Optional<cb> $$1, Optional<bc> $$2) {
         super($$0);
         this.a = $$1;
         this.b = $$2;
      }

      public static am<cq.a> a(Optional<bc> $$0, cb.a $$1, Optional<bc> $$2) {
         return al.Q.a(new cq.a($$0, Optional.of($$1.b()), $$2));
      }

      public static am<cq.a> a(cb.a $$0, Optional<bc> $$1) {
         return a(Optional.empty(), $$0, $$1);
      }

      public boolean a(cjf $$0, ecq $$1) {
         return this.a.isPresent() && !this.a.get().a($$0) ? false : this.b.isEmpty() || this.b.get().a($$1);
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
