import java.util.function.Supplier;
import javax.annotation.Nullable;

public class bqr implements AutoCloseable {
   public static final bqr a = new bqr(null);
   @Nullable
   private final bqm b;

   bqr(@Nullable bqm $$0) {
      this.b = $$0;
   }

   public bqr a(String $$0) {
      if (this.b != null) {
         this.b.e($$0);
      }

      return this;
   }

   public bqr a(Supplier<String> $$0) {
      if (this.b != null) {
         this.b.e($$0.get());
      }

      return this;
   }

   public bqr a(long $$0) {
      if (this.b != null) {
         this.b.a($$0);
      }

      return this;
   }

   public bqr a(int $$0) {
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
