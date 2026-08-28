import java.util.function.Supplier;
import javax.annotation.Nullable;

public class bpo implements AutoCloseable {
   public static final bpo a = new bpo(null);
   @Nullable
   private final bpj b;

   bpo(@Nullable bpj $$0) {
      this.b = $$0;
   }

   public bpo a(String $$0) {
      if (this.b != null) {
         this.b.e($$0);
      }

      return this;
   }

   public bpo a(Supplier<String> $$0) {
      if (this.b != null) {
         this.b.e($$0.get());
      }

      return this;
   }

   public bpo a(long $$0) {
      if (this.b != null) {
         this.b.a($$0);
      }

      return this;
   }

   public bpo a(int $$0) {
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
