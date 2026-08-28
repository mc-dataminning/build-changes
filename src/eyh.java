import java.util.Objects;
import javax.annotation.Nullable;

public abstract class eyh {
   private boolean a;

   public void f() {
      this.a(true);
   }

   public void a(boolean $$0) {
      this.a = $$0;
   }

   public boolean g() {
      return this.a;
   }

   public static record a(@Nullable arq a, long b) {
      public a(arq $$0) {
         this($$0, $$0.E());
      }

      public arq a() {
         return Objects.requireNonNull(this.a);
      }

      @Nullable
      public arq b() {
         return this.a;
      }

      public long c() {
         return this.b;
      }
   }
}
