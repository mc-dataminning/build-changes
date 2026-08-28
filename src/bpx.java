import java.util.function.Supplier;
import javax.annotation.Nullable;

public class bpx implements AutoCloseable {
   public static final bpx a = new bpx(null);
   @Nullable
   private final bps b;

   bpx(@Nullable bps $$0) {
      this.b = $$0;
   }

   public bpx a(String $$0) {
      if (this.b != null) {
         this.b.e($$0);
      }

      return this;
   }

   public bpx a(Supplier<String> $$0) {
      if (this.b != null) {
         this.b.e($$0.get());
      }

      return this;
   }

   public bpx a(long $$0) {
      if (this.b != null) {
         this.b.a($$0);
      }

      return this;
   }

   public bpx a(int $$0) {
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
