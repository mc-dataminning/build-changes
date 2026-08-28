import java.util.function.Supplier;
import javax.annotation.Nullable;

public class bpt implements AutoCloseable {
   public static final bpt a = new bpt(null);
   @Nullable
   private final bpo b;

   bpt(@Nullable bpo $$0) {
      this.b = $$0;
   }

   public bpt a(String $$0) {
      if (this.b != null) {
         this.b.e($$0);
      }

      return this;
   }

   public bpt a(Supplier<String> $$0) {
      if (this.b != null) {
         this.b.e($$0.get());
      }

      return this;
   }

   public bpt a(long $$0) {
      if (this.b != null) {
         this.b.a($$0);
      }

      return this;
   }

   public bpt a(int $$0) {
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
