import java.util.function.Supplier;
import javax.annotation.Nullable;

public class brg implements AutoCloseable {
   public static final brg a = new brg(null);
   @Nullable
   private final brb b;

   brg(@Nullable brb $$0) {
      this.b = $$0;
   }

   public brg a(String $$0) {
      if (this.b != null) {
         this.b.e($$0);
      }

      return this;
   }

   public brg a(Supplier<String> $$0) {
      if (this.b != null) {
         this.b.e($$0.get());
      }

      return this;
   }

   public brg a(long $$0) {
      if (this.b != null) {
         this.b.a($$0);
      }

      return this;
   }

   public brg a(int $$0) {
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
