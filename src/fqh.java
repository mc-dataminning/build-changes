import com.mojang.authlib.minecraft.UserApiService;
import java.nio.file.Path;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;

public interface fqh {
   fqh a = new fqh() {
      @Override
      public CompletableFuture<Optional<chj>> a() {
         return CompletableFuture.completedFuture(Optional.empty());
      }

      @Override
      public boolean b() {
         return false;
      }
   };

   static fqh a(UserApiService $$0, exw $$1, Path $$2) {
      return (fqh)($$1.g() == exw.a.c ? new fpq($$0, $$1.b(), $$2) : a);
   }

   CompletableFuture<Optional<chj>> a();

   boolean b();
}
