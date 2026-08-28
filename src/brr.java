import java.util.function.Supplier;
import javax.annotation.Nullable;

public class brr implements AutoCloseable {
   public static final brr a = new brr(null);
   @Nullable
   private final brm b;

   brr(@Nullable brm $$0) {
      this.b = $$0;
   }

   public brr a(String $$0) {
      if (this.b != null) {
         this.b.e($$0);
      }

      return this;
   }

   public brr a(Supplier<String> $$0) {
      if (this.b != null) {
         this.b.e($$0.get());
      }

      return this;
   }

   public brr a(long $$0) {
      if (this.b != null) {
         this.b.a($$0);
      }

      return this;
   }

   public brr a(int $$0) {
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
