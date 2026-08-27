import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;

public class bd {
   public static final bd a = bd.a.a().b();
   private final List<db<bep>> b;
   private final bo c;
   private final bo d;

   public bd(List<db<bep>> $$0, bo $$1, bo $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   public boolean a(aig $$0, ben $$1) {
      return this.a($$0.x(), $$0.dg(), $$1);
   }

   public boolean a(aif $$0, eei $$1, ben $$2) {
      if (this == a) {
         return true;
      } else {
         for (db<bep> $$3 : this.b) {
            if (!$$3.a($$2.k())) {
               return false;
            }
         }

         return !this.c.a($$0, $$1, $$2.c()) ? false : this.d.a($$0, $$1, $$2.d());
      }
   }

   public static bd a(@Nullable JsonElement $$0) {
      if ($$0 != null && !$$0.isJsonNull()) {
         JsonObject $$1 = aor.m($$0, "damage type");
         JsonArray $$2 = aor.a($$1, "tags", null);
         List<db<bep>> $$3;
         if ($$2 != null) {
            $$3 = new ArrayList<>($$2.size());

            for (JsonElement $$4 : $$2) {
               $$3.add(db.a($$4, jc.p));
            }
         } else {
            $$3 = List.of();
         }

         bo $$6 = bo.a($$1.get("direct_entity"));
         bo $$7 = bo.a($$1.get("source_entity"));
         return new bd($$3, $$6, $$7);
      } else {
         return a;
      }
   }

   public JsonElement a() {
      if (this == a) {
         return JsonNull.INSTANCE;
      } else {
         JsonObject $$0 = new JsonObject();
         if (!this.b.isEmpty()) {
            JsonArray $$1 = new JsonArray(this.b.size());

            for (int $$2 = 0; $$2 < this.b.size(); $$2++) {
               $$1.add(this.b.get($$2).a());
            }

            $$0.add("tags", $$1);
         }

         $$0.add("direct_entity", this.c.a());
         $$0.add("source_entity", this.d.a());
         return $$0;
      }
   }

   public static class a {
      private final Builder<db<bep>> a = ImmutableList.builder();
      private bo b = bo.a;
      private bo c = bo.a;

      public static bd.a a() {
         return new bd.a();
      }

      public bd.a a(db<bep> $$0) {
         this.a.add($$0);
         return this;
      }

      public bd.a a(bo $$0) {
         this.b = $$0;
         return this;
      }

      public bd.a a(bo.a $$0) {
         this.b = $$0.b();
         return this;
      }

      public bd.a b(bo $$0) {
         this.c = $$0;
         return this;
      }

      public bd.a b(bo.a $$0) {
         this.c = $$0.b();
         return this;
      }

      public bd b() {
         return new bd(this.a.build(), this.b, this.c);
      }
   }
}
