import java.util.function.Supplier;
import javax.annotation.Nullable;

public class bqt implements AutoCloseable {
   public static final bqt a = new bqt(null);
   @Nullable
   private final bqo b;

   bqt(@Nullable bqo $$0) {
      this.b = $$0;
   }

   public bqt a(String $$0) {
      if (this.b != null) {
         this.b.e($$0);
      }

      return this;
   }

   public bqt a(Supplier<String> $$0) {
      if (this.b != null) {
         this.b.e($$0.get());
      }

      return this;
   }

   public bqt a(long $$0) {
      if (this.b != null) {
         this.b.a($$0);
      }

      return this;
   }

   public bqt a(int $$0) {
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
