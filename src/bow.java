import java.util.function.Supplier;
import javax.annotation.Nullable;

public class bow implements AutoCloseable {
   public static final bow a = new bow(null);
   @Nullable
   private final bor b;

   bow(@Nullable bor $$0) {
      this.b = $$0;
   }

   public bow a(String $$0) {
      if (this.b != null) {
         this.b.e($$0);
      }

      return this;
   }

   public bow a(Supplier<String> $$0) {
      if (this.b != null) {
         this.b.e($$0.get());
      }

      return this;
   }

   public bow a(long $$0) {
      if (this.b != null) {
         this.b.a($$0);
      }

      return this;
   }

   public bow a(int $$0) {
      if (this.b != null) {
         this.b.a($$0);
      }

      return this;
   }

   @Override
   public void close() {
      if (this.b != null) {
         this.b.c();
      }
   }
}
