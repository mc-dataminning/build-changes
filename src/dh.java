import com.google.gson.JsonObject;
import java.util.Optional;

public class dh extends cw<dh.a> {
   public dh.a a(JsonObject $$0, Optional<bc> $$1, bg $$2) {
      Optional<cb> $$3 = cb.a($$0.get("item"));
      return new dh.a($$1, $$3);
   }

   public void a(aks $$0, cjf $$1) {
      this.a($$0, $$1x -> $$1x.a($$1));
   }

   public static class a extends at {
      private final Optional<cb> a;

      public a(Optional<bc> $$0, Optional<cb> $$1) {
         super($$0);
         this.a = $$1;
      }

      public static am<dh.a> a(cb $$0) {
         return al.B.a(new dh.a(Optional.empty(), Optional.of($$0)));
      }

      public static am<dh.a> a(cpu $$0) {
         return al.B.a(new dh.a(Optional.empty(), Optional.of(cb.a.a().a($$0).b())));
      }

      public boolean a(cjf $$0) {
         return this.a.isEmpty() || this.a.get().a($$0);
      }

      @Override
      public JsonObject a() {
         JsonObject $$0 = super.a();
         this.a.ifPresent($$1 -> $$0.add("item", $$1.a()));
         return $$0;
      }
   }
}
