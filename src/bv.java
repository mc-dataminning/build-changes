import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import javax.annotation.Nullable;

public class bv {
   public static final bv a = new bv(null, null, cz.a);
   @Nullable
   private final apy<eaa> b;
   @Nullable
   private final eaa c;
   private final cz d;

   public bv(@Nullable apy<eaa> $$0, @Nullable eaa $$1, cz $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   public boolean a(aki $$0, gv $$1) {
      if (this == a) {
         return true;
      } else if (!$$0.o($$1)) {
         return false;
      } else {
         eab $$2 = $$0.b_($$1);
         if (this.b != null && !$$2.a(this.b)) {
            return false;
         } else {
            return this.c != null && !$$2.b(this.c) ? false : this.d.a($$2);
         }
      }
   }

   public static bv a(@Nullable JsonElement $$0) {
      if ($$0 != null && !$$0.isJsonNull()) {
         JsonObject $$1 = arf.m($$0, "fluid");
         eaa $$2 = null;
         if ($$1.has("fluid")) {
            aep $$3 = new aep(arf.i($$1, "fluid"));
            $$2 = jc.d.a($$3);
         }

         apy<eaa> $$4 = null;
         if ($$1.has("tag")) {
            aep $$5 = new aep(arf.i($$1, "tag"));
            $$4 = apy.a(jd.w, $$5);
         }

         cz $$6 = cz.a($$1.get("state"));
         return new bv($$4, $$2, $$6);
      } else {
         return a;
      }
   }

   public JsonElement a() {
      if (this == a) {
         return JsonNull.INSTANCE;
      } else {
         JsonObject $$0 = new JsonObject();
         if (this.c != null) {
            $$0.addProperty("fluid", jc.d.b(this.c).toString());
         }

         if (this.b != null) {
            $$0.addProperty("tag", this.b.b().toString());
         }

         $$0.add("state", this.d.a());
         return $$0;
      }
   }

   public static class a {
      @Nullable
      private eaa a;
      @Nullable
      private apy<eaa> b;
      private cz c = cz.a;

      private a() {
      }

      public static bv.a a() {
         return new bv.a();
      }

      public bv.a a(eaa $$0) {
         this.a = $$0;
         return this;
      }

      public bv.a a(apy<eaa> $$0) {
         this.b = $$0;
         return this;
      }

      public bv.a a(cz $$0) {
         this.c = $$0;
         return this;
      }

      public bv b() {
         return new bv(this.b, this.a, this.c);
      }
   }
}
