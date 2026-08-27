import com.mojang.authlib.minecraft.UserApiService;
import java.nio.file.Path;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;

public interface fjc {
   fjc a = new fjc() {
      @Override
      public CompletableFuture<Optional<ccc>> a() {
         return CompletableFuture.completedFuture(Optional.empty());
      }

      @Override
      public boolean b() {
         return false;
      }
   };

   static fjc a(UserApiService $$0, ere $$1, Path $$2) {
      return (fjc)($$1.g() == ere.a.c ? new fil($$0, $$1.b(), $$2) : a);
   }

   CompletableFuture<Optional<ccc>> a();

   boolean b();
}
