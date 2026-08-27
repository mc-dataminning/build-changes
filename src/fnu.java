import com.mojang.authlib.minecraft.UserApiService;
import java.nio.file.Path;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;

public interface fnu {
   fnu a = new fnu() {
      @Override
      public CompletableFuture<Optional<cfd>> a() {
         return CompletableFuture.completedFuture(Optional.empty());
      }

      @Override
      public boolean b() {
         return false;
      }
   };

   static fnu a(UserApiService $$0, evp $$1, Path $$2) {
      return (fnu)($$1.g() == evp.a.c ? new fnd($$0, $$1.b(), $$2) : a);
   }

   CompletableFuture<Optional<cfd>> a();

   boolean b();
}
