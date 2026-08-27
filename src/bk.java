import com.google.gson.JsonObject;
import java.util.Optional;

public class bk extends cw<bk.a> {
   public bk.a a(JsonObject $$0, Optional<bc> $$1, bg $$2) {
      Optional<cb> $$3 = cb.a($$0.get("item"));
      cl.d $$4 = cl.d.a($$0.get("levels"));
      return new bk.a($$1, $$3, $$4);
   }

   public void a(aks $$0, cjf $$1, int $$2) {
      this.a($$0, $$2x -> $$2x.a($$1, $$2));
   }

   public static class a extends at {
      private final Optional<cb> a;
      private final cl.d b;

      public a(Optional<bc> $$0, Optional<cb> $$1, cl.d $$2) {
         super($$0);
         this.a = $$1;
         this.b = $$2;
      }

      public static am<bk.a> c() {
         return al.i.a(new bk.a(Optional.empty(), Optional.empty(), cl.d.c));
      }

      public boolean a(cjf $$0, int $$1) {
         return this.a.isPresent() && !this.a.get().a($$0) ? false : this.b.d($$1);
      }

      @Override
      public JsonObject a() {
         JsonObject $$0 = super.a();
         this.a.ifPresent($$1 -> $$0.add("item", $$1.a()));
         $$0.add("levels", this.b.e());
         return $$0;
      }
   }
}
