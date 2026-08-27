import com.google.gson.JsonObject;
import javax.annotation.Nullable;

public abstract class atv<T> {
   @Nullable
   private final T a;

   public atv(@Nullable T $$0) {
      this.a = $$0;
   }

   @Nullable
   T g() {
      return this.a;
   }

   boolean f() {
      return false;
   }

   protected abstract void a(JsonObject var1);
}
