import java.util.function.Supplier;
import javax.annotation.Nullable;

public class bqg implements AutoCloseable {
   public static final bqg a = new bqg(null);
   @Nullable
   private final bqb b;

   bqg(@Nullable bqb $$0) {
      this.b = $$0;
   }

   public bqg a(String $$0) {
      if (this.b != null) {
         this.b.e($$0);
      }

      return this;
   }

   public bqg a(Supplier<String> $$0) {
      if (this.b != null) {
         this.b.e($$0.get());
      }

      return this;
   }

   public bqg a(long $$0) {
      if (this.b != null) {
         this.b.a($$0);
      }

      return this;
   }

   public bqg a(int $$0) {
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
