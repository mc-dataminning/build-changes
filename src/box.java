import java.util.function.Supplier;
import javax.annotation.Nullable;

public class box implements AutoCloseable {
   public static final box a = new box(null);
   @Nullable
   private final bos b;

   box(@Nullable bos $$0) {
      this.b = $$0;
   }

   public box a(String $$0) {
      if (this.b != null) {
         this.b.e($$0);
      }

      return this;
   }

   public box a(Supplier<String> $$0) {
      if (this.b != null) {
         this.b.e($$0.get());
      }

      return this;
   }

   public box a(long $$0) {
      if (this.b != null) {
         this.b.a($$0);
      }

      return this;
   }

   public box a(int $$0) {
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
