import javax.annotation.Nullable;

public class arg<T extends Throwable> {
   @Nullable
   private T a;

   public void a(T $$0) {
      if (this.a == null) {
         this.a = $$0;
      } else {
         this.a.addSuppressed($$0);
      }
   }

   public void a() throws T {
      if (this.a != null) {
         throw this.a;
      }
   }
}
