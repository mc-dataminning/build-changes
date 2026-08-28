import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.function.Function;

public class fnm<T> {
   final String a;
   final Function<T, JsonElement> b;

   public fnm(String $$0, Function<T, JsonElement> $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public fnm<T>.a a(T $$0) {
      return new fnm.a($$0);
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

      public fnm<T> a() {
         return fnm.this;
      }

      public void a(JsonObject $$0) {
         $$0.add(fnm.this.a, fnm.this.b.apply(this.b));
      }

      @Override
      public String toString() {
         return fnm.this.a + "=" + this.b;
      }
   }
}
