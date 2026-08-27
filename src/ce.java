import com.google.gson.JsonObject;
import java.util.Optional;

public class ce extends cw<ce.a> {
   public ce.a a(JsonObject $$0, Optional<bc> $$1, bg $$2) {
      return new ce.a($$1, bq.a($$0, "entity", $$2), bf.a($$0.get("killing_blow")));
   }

   public void a(alr $$0, bjt $$1, bir $$2) {
      edi $$3 = bq.b($$0, $$1);
      this.a($$0, $$3x -> $$3x.a($$0, $$3, $$2));
   }

   public static class a extends at {
      private final Optional<bc> a;
      private final Optional<bf> b;

      public a(Optional<bc> $$0, Optional<bc> $$1, Optional<bf> $$2) {
         super($$0);
         this.a = $$1;
         this.b = $$2;
      }

      public static am<ce.a> a(Optional<bq> $$0) {
         return al.b.a(new ce.a(Optional.empty(), bq.a($$0), Optional.empty()));
      }

      public static am<ce.a> a(bq.a $$0) {
         return al.b.a(new ce.a(Optional.empty(), Optional.of(bq.a($$0)), Optional.empty()));
      }

      public static am<ce.a> c() {
         return al.b.a(new ce.a(Optional.empty(), Optional.empty(), Optional.empty()));
      }

      public static am<ce.a> a(Optional<bq> $$0, Optional<bf> $$1) {
         return al.b.a(new ce.a(Optional.empty(), bq.a($$0), $$1));
      }

      public static am<ce.a> a(bq.a $$0, Optional<bf> $$1) {
         return al.b.a(new ce.a(Optional.empty(), Optional.of(bq.a($$0)), $$1));
      }

      public static am<ce.a> a(Optional<bq> $$0, bf.a $$1) {
         return al.b.a(new ce.a(Optional.empty(), bq.a($$0), Optional.of($$1.b())));
      }

      public static am<ce.a> a(bq.a $$0, bf.a $$1) {
         return al.b.a(new ce.a(Optional.empty(), Optional.of(bq.a($$0)), Optional.of($$1.b())));
      }

      public static am<ce.a> d() {
         return al.W.a(new ce.a(Optional.empty(), Optional.empty(), Optional.empty()));
      }

      public static am<ce.a> b(Optional<bq> $$0) {
         return al.c.a(new ce.a(Optional.empty(), bq.a($$0), Optional.empty()));
      }

      public static am<ce.a> b(bq.a $$0) {
         return al.c.a(new ce.a(Optional.empty(), Optional.of(bq.a($$0)), Optional.empty()));
      }

      public static am<ce.a> e() {
         return al.c.a(new ce.a(Optional.empty(), Optional.empty(), Optional.empty()));
      }

      public static am<ce.a> b(Optional<bq> $$0, Optional<bf> $$1) {
         return al.c.a(new ce.a(Optional.empty(), bq.a($$0), $$1));
      }

      public static am<ce.a> b(bq.a $$0, Optional<bf> $$1) {
         return al.c.a(new ce.a(Optional.empty(), Optional.of(bq.a($$0)), $$1));
      }

      public static am<ce.a> b(Optional<bq> $$0, bf.a $$1) {
         return al.c.a(new ce.a(Optional.empty(), bq.a($$0), Optional.of($$1.b())));
      }

      public static am<ce.a> b(bq.a $$0, bf.a $$1) {
         return al.c.a(new ce.a(Optional.empty(), Optional.of(bq.a($$0)), Optional.of($$1.b())));
      }

      public boolean a(alr $$0, edi $$1, bir $$2) {
         return this.b.isPresent() && !this.b.get().a($$0, $$2) ? false : this.a.isEmpty() || this.a.get().a($$1);
      }

      @Override
      public JsonObject a() {
         JsonObject $$0 = super.a();
         this.a.ifPresent($$1 -> $$0.add("entity", $$1.a()));
         this.b.ifPresent($$1 -> $$0.add("killing_blow", $$1.a()));
         return $$0;
      }
   }
}
