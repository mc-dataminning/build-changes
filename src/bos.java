import java.util.function.Supplier;
import javax.annotation.Nullable;

public class bos implements AutoCloseable {
   public static final bos a = new bos(null);
   @Nullable
   private final bon b;

   bos(@Nullable bon $$0) {
      this.b = $$0;
   }

   public bos a(String $$0) {
      if (this.b != null) {
         this.b.e($$0);
      }

      return this;
   }

   public bos a(Supplier<String> $$0) {
      if (this.b != null) {
         this.b.e($$0.get());
      }

      return this;
   }

   public bos a(long $$0) {
      if (this.b != null) {
         this.b.a($$0);
      }

      return this;
   }

   public bos a(int $$0) {
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
