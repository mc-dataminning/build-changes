import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.function.Function;

public class fqk<T> {
   final String a;
   final Function<T, JsonElement> b;

   public fqk(String $$0, Function<T, JsonElement> $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public fqk<T>.a a(T $$0) {
      return new fqk.a($$0);
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

      public fqk<T> a() {
         return fqk.this;
      }

      public void a(JsonObject $$0) {
         $$0.add(fqk.this.a, fqk.this.b.apply(this.b));
      }

      @Override
      public String toString() {
         return fqk.this.a + "=" + this.b;
      }
   }
}
