import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.function.Function;

public class foj<T> {
   final String a;
   final Function<T, JsonElement> b;

   public foj(String $$0, Function<T, JsonElement> $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public foj<T>.a a(T $$0) {
      return new foj.a($$0);
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

      public foj<T> a() {
         return foj.this;
      }

      public void a(JsonObject $$0) {
         $$0.add(foj.this.a, foj.this.b.apply(this.b));
      }

      @Override
      public String toString() {
         return foj.this.a + "=" + this.b;
      }
   }
}
