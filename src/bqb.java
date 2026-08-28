import java.util.Optional;
import javax.annotation.Nullable;

public interface bqb<S> {
   bqd a();

   bpy<S> b();

   default <T> Optional<T> b(bqa<S, T> $$0) {
      T $$1 = this.a($$0);
      if ($$1 != null) {
         this.b().a(this.g());
      }

      if (!this.a().g()) {
         throw new IllegalStateException("Malformed scope: " + this.a());
      } else {
         return Optional.ofNullable($$1);
      }
   }

   @Nullable
   <T> T a(bqa<S, T> var1);

   S f();

   int g();

   void a(int var1);

   bpv c();

   void d();

   bqb<S> e();
}
