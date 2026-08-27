import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.Optional;
import javax.annotation.Nullable;

public record bc(cj.c a, cj.c b, Optional<bo> c, Optional<Boolean> d, Optional<bd> e) {
   static Optional<bc> a(cj.c $$0, cj.c $$1, Optional<bo> $$2, Optional<Boolean> $$3, Optional<bd> $$4) {
      return $$0.c() && $$1.c() && $$2.isEmpty() && $$3.isEmpty() && $$4.isEmpty() ? Optional.empty() : Optional.of(new bc($$0, $$1, $$2, $$3, $$4));
   }

   public boolean a(akl $$0, bhg $$1, float $$2, float $$3, boolean $$4) {
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

   public static Optional<bc> a(@Nullable JsonElement $$0) {
      if ($$0 != null && !$$0.isJsonNull()) {
         JsonObject $$1 = arg.m($$0, "damage");
         cj.c $$2 = cj.c.a($$1.get("dealt"));
         cj.c $$3 = cj.c.a($$1.get("taken"));
         Optional<Boolean> $$4 = $$1.has("blocked") ? Optional.of(arg.k($$1, "blocked")) : Optional.empty();
         Optional<bo> $$5 = bo.a($$1.get("source_entity"));
         Optional<bd> $$6 = bd.a($$1.get("type"));
         return a($$2, $$3, $$5, $$4, $$6);
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

   public cj.c b() {
      return this.a;
   }

   public cj.c c() {
      return this.b;
   }

   public Optional<bo> d() {
      return this.c;
   }

   public Optional<Boolean> e() {
      return this.d;
   }

   public Optional<bd> f() {
      return this.e;
   }

   public static class a {
      private cj.c a = cj.c.c;
      private cj.c b = cj.c.c;
      private Optional<bo> c = Optional.empty();
      private Optional<Boolean> d = Optional.empty();
      private Optional<bd> e = Optional.empty();

      public static bc.a a() {
         return new bc.a();
      }

      public bc.a a(cj.c $$0) {
         this.a = $$0;
         return this;
      }

      public bc.a b(cj.c $$0) {
         this.b = $$0;
         return this;
      }

      public bc.a a(bo $$0) {
         this.c = Optional.of($$0);
         return this;
      }

      public bc.a a(Boolean $$0) {
         this.d = Optional.of($$0);
         return this;
      }

      public bc.a a(bd $$0) {
         this.e = Optional.of($$0);
         return this;
      }

      public bc.a a(bd.a $$0) {
         this.e = $$0.b();
         return this;
      }

      public Optional<bc> b() {
         return bc.a(this.a, this.b, this.c, this.d, this.e);
      }
   }
}
