import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.Optional;
import javax.annotation.Nullable;

public record be(cl.c a, cl.c b, Optional<bq> c, Optional<Boolean> d, Optional<bf> e) {
   public boolean a(aku $$0, bhu $$1, float $$2, float $$3, boolean $$4) {
      if (!this.a.d((double)$$2)) {
         return false;
      } else if (!this.b.d((double)$$3)) {
         return false;
      } else if (this.c.isPresent() && !this.c.get().a($$0, $$1.d())) {
         return false;
      } else {
         return this.d.isPresent() && this.d.get() != $$4 ? false : !this.e.isPresent() || this.e.get().a($$0, $$1);
      }
   }

   public static Optional<be> a(@Nullable JsonElement $$0) {
      if ($$0 != null && !$$0.isJsonNull()) {
         JsonObject $$1 = arr.m($$0, "damage");
         cl.c $$2 = cl.c.a($$1.get("dealt"));
         cl.c $$3 = cl.c.a($$1.get("taken"));
         Optional<Boolean> $$4 = $$1.has("blocked") ? Optional.of(arr.k($$1, "blocked")) : Optional.empty();
         Optional<bq> $$5 = bq.a($$1.get("source_entity"));
         Optional<bf> $$6 = bf.a($$1.get("type"));
         return $$2.c() && $$3.c() && $$5.isEmpty() && $$4.isEmpty() && $$6.isEmpty() ? Optional.empty() : Optional.of(new be($$2, $$3, $$5, $$4, $$6));
      } else {
         return Optional.empty();
      }
   }

   public JsonElement a() {
      JsonObject $$0 = new JsonObject();
      $$0.add("dealt", this.a.e());
      $$0.add("taken", this.b.e());
      this.c.ifPresent($$1 -> $$0.add("source_entity", $$1.a()));
      this.e.ifPresent($$1 -> $$0.add("type", $$1.a()));
      this.d.ifPresent($$1 -> $$0.addProperty("blocked", $$1));
      return $$0;
   }

   public cl.c b() {
      return this.a;
   }

   public cl.c c() {
      return this.b;
   }

   public Optional<bq> d() {
      return this.c;
   }

   public Optional<Boolean> e() {
      return this.d;
   }

   public Optional<bf> f() {
      return this.e;
   }

   public static class a {
      private cl.c a = cl.c.c;
      private cl.c b = cl.c.c;
      private Optional<bq> c = Optional.empty();
      private Optional<Boolean> d = Optional.empty();
      private Optional<bf> e = Optional.empty();

      public static be.a a() {
         return new be.a();
      }

      public be.a a(cl.c $$0) {
         this.a = $$0;
         return this;
      }

      public be.a b(cl.c $$0) {
         this.b = $$0;
         return this;
      }

      public be.a a(bq $$0) {
         this.c = Optional.of($$0);
         return this;
      }

      public be.a a(Boolean $$0) {
         this.d = Optional.of($$0);
         return this;
      }

      public be.a a(bf $$0) {
         this.e = Optional.of($$0);
         return this;
      }

      public be.a a(bf.a $$0) {
         this.e = Optional.of($$0.b());
         return this;
      }

      public be b() {
         return new be(this.a, this.b, this.c, this.d, this.e);
      }
   }
}
