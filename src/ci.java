import com.google.gson.JsonObject;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class ci extends cw<ci.a> {
   public ci.a a(JsonObject $$0, Optional<bc> $$1, bg $$2) {
      Optional<bc> $$3 = bq.a($$0, "lightning", $$2);
      Optional<bc> $$4 = bq.a($$0, "bystander", $$2);
      return new ci.a($$1, $$3, $$4);
   }

   public void a(amb $$0, bkx $$1, List<bki> $$2) {
      List<eel> $$3 = $$2.stream().map($$1x -> bq.b($$0, $$1x)).collect(Collectors.toList());
      eel $$4 = bq.b($$0, $$1);
      this.a($$0, $$2x -> $$2x.a($$4, $$3));
   }

   public static class a extends at {
      private final Optional<bc> a;
      private final Optional<bc> b;

      public a(Optional<bc> $$0, Optional<bc> $$1, Optional<bc> $$2) {
         super($$0);
         this.a = $$1;
         this.b = $$2;
      }

      public static am<ci.a> a(Optional<bq> $$0, Optional<bq> $$1) {
         return al.S.a(new ci.a(Optional.empty(), bq.a($$0), bq.a($$1)));
      }

      public boolean a(eel $$0, List<eel> $$1) {
         return this.a.isPresent() && !this.a.get().a($$0) ? false : !this.b.isPresent() || !$$1.stream().noneMatch(this.b.get()::a);
      }

      @Override
      public JsonObject a() {
         JsonObject $$0 = super.a();
         this.a.ifPresent($$1 -> $$0.add("lightning", $$1.a()));
         this.b.ifPresent($$1 -> $$0.add("bystander", $$1.a()));
         return $$0;
      }
   }
}
