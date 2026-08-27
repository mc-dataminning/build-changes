import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import javax.annotation.Nullable;

public class ce {
   public static final ce a = new ce(cj.d.e);
   private final cj.d b;

   ce(cj.d $$0) {
      this.b = $$0;
   }

   public boolean a(aki $$0, gv $$1) {
      if (this == a) {
         return true;
      } else {
         return !$$0.o($$1) ? false : this.b.d($$0.z($$1));
      }
   }

   public JsonElement a() {
      if (this == a) {
         return JsonNull.INSTANCE;
      } else {
         JsonObject $$0 = new JsonObject();
         $$0.add("light", this.b.d());
         return $$0;
      }
   }

   public static ce a(@Nullable JsonElement $$0) {
      if ($$0 != null && !$$0.isJsonNull()) {
         JsonObject $$1 = arf.m($$0, "light");
         cj.d $$2 = cj.d.a($$1.get("light"));
         return new ce($$2);
      } else {
         return a;
      }
   }

   public static class a {
      private cj.d a = cj.d.e;

      public static ce.a a() {
         return new ce.a();
      }

      public ce.a a(cj.d $$0) {
         this.a = $$0;
         return this;
      }

      public ce b() {
         return new ce(this.a);
      }
   }
}
