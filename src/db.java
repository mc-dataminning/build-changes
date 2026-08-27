import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import javax.annotation.Nullable;

public class db<T> {
   private final anl<T> a;
   private final boolean b;

   public db(anl<T> $$0, boolean $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public static <T> db<T> a(anl<T> $$0) {
      return new db<>($$0, true);
   }

   public static <T> db<T> b(anl<T> $$0) {
      return new db<>($$0, false);
   }

   public boolean a(he<T> $$0) {
      return $$0.a(this.a) == this.b;
   }

   public JsonElement a() {
      JsonObject $$0 = new JsonObject();
      $$0.addProperty("id", this.a.b().toString());
      $$0.addProperty("expected", this.b);
      return $$0;
   }

   public static <T> db<T> a(@Nullable JsonElement $$0, acp<? extends hr<T>> $$1) {
      if ($$0 == null) {
         throw new JsonParseException("Expected a tag predicate");
      } else {
         JsonObject $$2 = aor.m($$0, "Tag Predicate");
         acq $$3 = new acq(aor.i($$2, "id"));
         boolean $$4 = aor.k($$2, "expected");
         return new db<>(anl.a($$1, $$3), $$4);
      }
   }
}
