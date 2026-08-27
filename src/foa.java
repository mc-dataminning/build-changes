import com.mojang.authlib.minecraft.UserApiService;
import java.nio.file.Path;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;

public interface foa {
   foa a = new foa() {
      @Override
      public CompletableFuture<Optional<cfj>> a() {
         return CompletableFuture.completedFuture(Optional.empty());
      }

      @Override
      public boolean b() {
         return false;
      }
   };

   static foa a(UserApiService $$0, evv $$1, Path $$2) {
      return (foa)($$1.g() == evv.a.c ? new fnj($$0, $$1.b(), $$2) : a);
   }

   CompletableFuture<Optional<cfj>> a();

   boolean b();
}
