import com.google.gson.JsonObject;
import java.util.Optional;

public class cp extends cw<cp.a> {
   public cp.a a(JsonObject $$0, Optional<bc> $$1, bg $$2) {
      Optional<be> $$3 = be.a($$0.get("damage"));
      Optional<bc> $$4 = bq.a($$0, "entity", $$2);
      return new cp.a($$1, $$3, $$4);
   }

   public void a(amb $$0, bki $$1, bjg $$2, float $$3, float $$4, boolean $$5) {
      eel $$6 = bq.b($$0, $$1);
      this.a($$0, $$6x -> $$6x.a($$0, $$6, $$2, $$3, $$4, $$5));
   }

   public static class a extends at {
      private final Optional<be> a;
      private final Optional<bc> b;

      public a(Optional<bc> $$0, Optional<be> $$1, Optional<bc> $$2) {
         super($$0);
         this.a = $$1;
         this.b = $$2;
      }

      public static am<cp.a> c() {
         return al.g.a(new cp.a(Optional.empty(), Optional.empty(), Optional.empty()));
      }

      public static am<cp.a> a(Optional<be> $$0) {
         return al.g.a(new cp.a(Optional.empty(), $$0, Optional.empty()));
      }

      public static am<cp.a> a(be.a $$0) {
         return al.g.a(new cp.a(Optional.empty(), Optional.of($$0.b()), Optional.empty()));
      }

      public static am<cp.a> b(Optional<bq> $$0) {
         return al.g.a(new cp.a(Optional.empty(), Optional.empty(), bq.a($$0)));
      }

      public static am<cp.a> a(Optional<be> $$0, Optional<bq> $$1) {
         return al.g.a(new cp.a(Optional.empty(), $$0, bq.a($$1)));
      }

      public static am<cp.a> a(be.a $$0, Optional<bq> $$1) {
         return al.g.a(new cp.a(Optional.empty(), Optional.of($$0.b()), bq.a($$1)));
      }

      public boolean a(amb $$0, eel $$1, bjg $$2, float $$3, float $$4, boolean $$5) {
         return this.a.isPresent() && !this.a.get().a($$0, $$2, $$3, $$4, $$5) ? false : !this.b.isPresent() || this.b.get().a($$1);
      }

      @Override
      public JsonObject a() {
         JsonObject $$0 = super.a();
         this.a.ifPresent($$1 -> $$0.add("damage", $$1.a()));
         this.b.ifPresent($$1 -> $$0.add("entity", $$1.a()));
         return $$0;
      }
   }
}
