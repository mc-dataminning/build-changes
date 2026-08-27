import com.google.gson.JsonObject;
import java.util.Optional;

public class bi extends cw<bi.a> {
   public bi.a a(JsonObject $$0, Optional<bc> $$1, bg $$2) {
      Optional<cj> $$3 = cj.a($$0.get("start_position"));
      Optional<bh> $$4 = bh.a($$0.get("distance"));
      return new bi.a($$1, $$3, $$4);
   }

   public void a(ako $$0, ehi $$1) {
      ehi $$2 = $$0.di();
      this.a($$0, $$3 -> $$3.a($$0.x(), $$1, $$2));
   }

   public static class a extends at {
      private final Optional<cj> a;
      private final Optional<bh> b;

      public a(Optional<bc> $$0, Optional<cj> $$1, Optional<bh> $$2) {
         super($$0);
         this.a = $$1;
         this.b = $$2;
      }

      public static am<bi.a> a(bq.a $$0, bh $$1, cj.a $$2) {
         return al.U.a(new bi.a(Optional.of(bq.a($$0)), Optional.of($$2.b()), Optional.of($$1)));
      }

      public static am<bi.a> a(bq.a $$0, bh $$1) {
         return al.V.a(new bi.a(Optional.of(bq.a($$0)), Optional.empty(), Optional.of($$1)));
      }

      public static am<bi.a> a(bh $$0) {
         return al.C.a(new bi.a(Optional.empty(), Optional.empty(), Optional.of($$0)));
      }

      @Override
      public JsonObject a() {
         JsonObject $$0 = super.a();
         this.a.ifPresent($$1 -> $$0.add("start_position", $$1.a()));
         this.b.ifPresent($$1 -> $$0.add("distance", $$1.a()));
         return $$0;
      }

      public boolean a(akn $$0, ehi $$1, ehi $$2) {
         return this.a.isPresent() && !this.a.get().a($$0, $$1.c, $$1.d, $$1.e)
            ? false
            : !this.b.isPresent() || this.b.get().a($$1.c, $$1.d, $$1.e, $$2.c, $$2.d, $$2.e);
      }
   }
}
