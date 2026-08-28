import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.function.Function;

public class fqw<T> {
   final String a;
   final Function<T, JsonElement> b;

   public fqw(String $$0, Function<T, JsonElement> $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public fqw<T>.a a(T $$0) {
      return new fqw.a($$0);
   }

   @Override
   public String toString() {
      return this.a;
   }

   public class a {
      private final T b;

      public a(final T $$1) {
         this.b = $$1;
      }

      public fqw<T> a() {
         return fqw.this;
      }

      public void a(JsonObject $$0) {
         $$0.add(fqw.this.a, fqw.this.b.apply(this.b));
      }

      @Override
      public String toString() {
         return fqw.this.a + "=" + this.b;
      }
   }
}
