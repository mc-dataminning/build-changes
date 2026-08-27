import com.google.gson.JsonObject;
import java.util.Optional;
import javax.annotation.Nullable;

public class bj extends cw<bj.a> {
   public bj.a a(JsonObject $$0, Optional<bc> $$1, bg $$2) {
      Optional<cm> $$3 = cm.a($$0.get("effects"));
      Optional<bc> $$4 = bq.a($$0, "source", $$2);
      return new bj.a($$1, $$3, $$4);
   }

   public void a(aks $$0, @Nullable biq $$1) {
      ecq $$2 = $$1 != null ? bq.b($$0, $$1) : null;
      this.a($$0, $$2x -> $$2x.a($$0, $$2));
   }

   public static class a extends at {
      private final Optional<cm> a;
      private final Optional<bc> b;

      public a(Optional<bc> $$0, Optional<cm> $$1, Optional<bc> $$2) {
         super($$0);
         this.a = $$1;
         this.b = $$2;
      }

      public static am<bj.a> a(cm.a $$0) {
         return al.A.a(new bj.a(Optional.empty(), $$0.b(), Optional.empty()));
      }

      public static am<bj.a> a(bq.a $$0) {
         return al.A.a(new bj.a(Optional.empty(), Optional.empty(), Optional.of(bq.a($$0.b()))));
      }

      public boolean a(aks $$0, @Nullable ecq $$1) {
         return this.a.isPresent() && !this.a.get().a((bjg)$$0) ? false : !this.b.isPresent() || $$1 != null && this.b.get().a($$1);
      }

      @Override
      public JsonObject a() {
         JsonObject $$0 = super.a();
         this.a.ifPresent($$1 -> $$0.add("effects", $$1.a()));
         this.b.ifPresent($$1 -> $$0.add("source", $$1.a()));
         return $$0;
      }
   }
}
