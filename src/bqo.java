import java.util.function.Supplier;
import javax.annotation.Nullable;

public class bqo implements AutoCloseable {
   public static final bqo a = new bqo(null);
   @Nullable
   private final bqj b;

   bqo(@Nullable bqj $$0) {
      this.b = $$0;
   }

   public bqo a(String $$0) {
      if (this.b != null) {
         this.b.e($$0);
      }

      return this;
   }

   public bqo a(Supplier<String> $$0) {
      if (this.b != null) {
         this.b.e($$0.get());
      }

      return this;
   }

   public bqo a(long $$0) {
      if (this.b != null) {
         this.b.a($$0);
      }

      return this;
   }

   public bqo a(int $$0) {
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
