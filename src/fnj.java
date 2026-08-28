import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.function.Function;

public class fnj<T> {
   final String a;
   final Function<T, JsonElement> b;

   public fnj(String $$0, Function<T, JsonElement> $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public fnj<T>.a a(T $$0) {
      return new fnj.a($$0);
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

      public fnj<T> a() {
         return fnj.this;
      }

      public void a(JsonObject $$0) {
         $$0.add(fnj.this.a, fnj.this.b.apply(this.b));
      }

      @Override
      public String toString() {
         return fnj.this.a + "=" + this.b;
      }
   }
}
