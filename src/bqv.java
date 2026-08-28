import java.util.function.Supplier;
import javax.annotation.Nullable;

public class bqv implements AutoCloseable {
   public static final bqv a = new bqv(null);
   @Nullable
   private final bqq b;

   bqv(@Nullable bqq $$0) {
      this.b = $$0;
   }

   public bqv a(String $$0) {
      if (this.b != null) {
         this.b.e($$0);
      }

      return this;
   }

   public bqv a(Supplier<String> $$0) {
      if (this.b != null) {
         this.b.e($$0.get());
      }

      return this;
   }

   public bqv a(long $$0) {
      if (this.b != null) {
         this.b.a($$0);
      }

      return this;
   }

   public bqv a(int $$0) {
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
