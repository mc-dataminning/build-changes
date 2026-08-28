import java.util.function.Supplier;
import javax.annotation.Nullable;

public class boz implements AutoCloseable {
   public static final boz a = new boz(null);
   @Nullable
   private final bou b;

   boz(@Nullable bou $$0) {
      this.b = $$0;
   }

   public boz a(String $$0) {
      if (this.b != null) {
         this.b.e($$0);
      }

      return this;
   }

   public boz a(Supplier<String> $$0) {
      if (this.b != null) {
         this.b.e($$0.get());
      }

      return this;
   }

   public boz a(long $$0) {
      if (this.b != null) {
         this.b.a($$0);
      }

      return this;
   }

   public boz a(int $$0) {
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
