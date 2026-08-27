import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import javax.annotation.Nullable;

public class bc {
   public static final bc a = bc.a.a().b();
   private final cj.c b;
   private final cj.c c;
   private final bo d;
   @Nullable
   private final Boolean e;
   private final bd f;

   public bc() {
      this.b = cj.c.e;
      this.c = cj.c.e;
      this.d = bo.a;
      this.e = null;
      this.f = bd.a;
   }

   public bc(cj.c $$0, cj.c $$1, bo $$2, @Nullable Boolean $$3, bd $$4) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
      this.f = $$4;
   }

   public boolean a(aig $$0, ben $$1, float $$2, float $$3, boolean $$4) {
      if (this == a) {
         return true;
      } else if (!this.b.d((double)$$2)) {
         return false;
      } else if (!this.c.d((double)$$3)) {
         return false;
      } else if (!this.d.a($$0, $$1.d())) {
         return false;
      } else {
         return this.e != null && this.e != $$4 ? false : this.f.a($$0, $$1);
      }
   }

   public static bc a(@Nullable JsonElement $$0) {
      if ($$0 != null && !$$0.isJsonNull()) {
         JsonObject $$1 = aor.m($$0, "damage");
         cj.c $$2 = cj.c.a($$1.get("dealt"));
         cj.c $$3 = cj.c.a($$1.get("taken"));
         Boolean $$4 = $$1.has("blocked") ? aor.k($$1, "blocked") : null;
         bo $$5 = bo.a($$1.get("source_entity"));
         bd $$6 = bd.a($$1.get("type"));
         return new bc($$2, $$3, $$5, $$4, $$6);
      } else {
         return a;
      }
   }

   public JsonElement a() {
      if (this == a) {
         return JsonNull.INSTANCE;
      } else {
         JsonObject $$0 = new JsonObject();
         $$0.add("dealt", this.b.d());
         $$0.add("taken", this.c.d());
         $$0.add("source_entity", this.d.a());
         $$0.add("type", this.f.a());
         if (this.e != null) {
            $$0.addProperty("blocked", this.e);
         }

         return $$0;
      }
   }

   public static class a {
      private cj.c a = cj.c.e;
      private cj.c b = cj.c.e;
      private bo c = bo.a;
      @Nullable
      private Boolean d;
      private bd e = bd.a;

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
         this.c = $$0;
         return this;
      }

      public bc.a a(Boolean $$0) {
         this.d = $$0;
         return this;
      }

      public bc.a a(bd $$0) {
         this.e = $$0;
         return this;
      }

      public bc.a a(bd.a $$0) {
         this.e = $$0.b();
         return this;
      }

      public bc b() {
         return new bc(this.a, this.b, this.c, this.d, this.e);
      }
   }
}
