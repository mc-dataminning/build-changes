import com.mojang.authlib.minecraft.UserApiService;
import java.nio.file.Path;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;

public interface fji {
   fji a = new fji() {
      @Override
      public CompletableFuture<Optional<cby>> a() {
         return CompletableFuture.completedFuture(Optional.empty());
      }

      @Override
      public boolean b() {
         return false;
      }
   };

   static fji a(UserApiService $$0, erm $$1, Path $$2) {
      return (fji)($$1.g() == erm.a.c ? new fis($$0, $$1.b(), $$2) : a);
   }

   CompletableFuture<Optional<cby>> a();

   boolean b();
}
