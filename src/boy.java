import java.util.function.Supplier;
import javax.annotation.Nullable;

public class boy implements AutoCloseable {
   public static final boy a = new boy(null);
   @Nullable
   private final bot b;

   boy(@Nullable bot $$0) {
      this.b = $$0;
   }

   public boy a(String $$0) {
      if (this.b != null) {
         this.b.e($$0);
      }

      return this;
   }

   public boy a(Supplier<String> $$0) {
      if (this.b != null) {
         this.b.e($$0.get());
      }

      return this;
   }

   public boy a(long $$0) {
      if (this.b != null) {
         this.b.a($$0);
      }

      return this;
   }

   public boy a(int $$0) {
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
