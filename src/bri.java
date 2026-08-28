import java.util.function.Supplier;
import javax.annotation.Nullable;

public class bri implements AutoCloseable {
   public static final bri a = new bri(null);
   @Nullable
   private final brd b;

   bri(@Nullable brd $$0) {
      this.b = $$0;
   }

   public bri a(String $$0) {
      if (this.b != null) {
         this.b.e($$0);
      }

      return this;
   }

   public bri a(Supplier<String> $$0) {
      if (this.b != null) {
         this.b.e($$0.get());
      }

      return this;
   }

   public bri a(long $$0) {
      if (this.b != null) {
         this.b.a($$0);
      }

      return this;
   }

   public bri a(int $$0) {
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
