import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import it.unimi.dsi.fastutil.objects.Object2ObjectMap;
import java.util.Objects;
import javax.annotation.Nullable;

public final class bly {
   private final Object2ObjectMap<blr<?>, Object> a = new Object2ObjectArrayMap();

   public <T> void a(blr<T> $$0, @Nullable T $$1) {
      this.a.put($$0, $$1);
   }

   @Nullable
   public <T> T a(blr<T> $$0) {
      return (T)this.a.get($$0);
   }

   public <T> T b(blr<T> $$0) {
      return Objects.requireNonNull(this.a($$0));
   }

   public <T> T b(blr<T> $$0, T $$1) {
      return Objects.requireNonNullElse(this.a($$0), $$1);
   }

   @Nullable
   @SafeVarargs
   public final <T> T a(blr<T>... $$0) {
      for (blr<T> $$1 : $$0) {
         T $$2 = this.a($$1);
         if ($$2 != null) {
            return $$2;
         }
      }

      return null;
   }

   @SafeVarargs
   public final <T> T b(blr<T>... $$0) {
      return Objects.requireNonNull(this.a($$0));
   }

   @Override
   public String toString() {
      return this.a.toString();
   }

   public void a(bly $$0) {
      this.a.putAll($$0.a);
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         return $$0 instanceof bly $$1 ? this.a.equals($$1.a) : false;
      }
   }

   @Override
   public int hashCode() {
      return this.a.hashCode();
   }
}
