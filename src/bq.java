import com.google.common.base.Joiner;
import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSyntaxException;
import javax.annotation.Nullable;

public abstract class bq {
   public static final bq a = new bq() {
      @Override
      public boolean a(bik<?> $$0) {
         return true;
      }

      @Override
      public JsonElement a() {
         return JsonNull.INSTANCE;
      }
   };
   private static final Joiner b = Joiner.on(", ");

   public abstract boolean a(bik<?> var1);

   public abstract JsonElement a();

   public static bq a(@Nullable JsonElement $$0) {
      if ($$0 != null && !$$0.isJsonNull()) {
         String $$1 = arf.a($$0, "type");
         if ($$1.startsWith("#")) {
            aep $$2 = new aep($$1.substring(1));
            return new bq.a(apy.a(jd.s, $$2));
         } else {
            aep $$3 = new aep($$1);
            bik<?> $$4 = jc.h.b($$3).orElseThrow(() -> new JsonSyntaxException("Unknown entity type '" + $$3 + "', valid types are: " + b.join(jc.h.e())));
            return new bq.b($$4);
         }
      } else {
         return a;
      }
   }

   public static bq b(bik<?> $$0) {
      return new bq.b($$0);
   }

   public static bq a(apy<bik<?>> $$0) {
      return new bq.a($$0);
   }

   static class a extends bq {
      private final apy<bik<?>> b;

      public a(apy<bik<?>> $$0) {
         this.b = $$0;
      }

      @Override
      public boolean a(bik<?> $$0) {
         return $$0.a(this.b);
      }

      @Override
      public JsonElement a() {
         return new JsonPrimitive("#" + this.b.b());
      }
   }

   static class b extends bq {
      private final bik<?> b;

      public b(bik<?> $$0) {
         this.b = $$0;
      }

      @Override
      public boolean a(bik<?> $$0) {
         return this.b == $$0;
      }

      @Override
      public JsonElement a() {
         return new JsonPrimitive(jc.h.b(this.b).toString());
      }
   }
}
