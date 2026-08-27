import com.mojang.authlib.minecraft.UserApiService;
import java.nio.file.Path;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;

public interface fsk {
   fsk a = new fsk() {
      @Override
      public CompletableFuture<Optional<ciu>> a() {
         return CompletableFuture.completedFuture(Optional.empty());
      }

      @Override
      public boolean b() {
         return false;
      }
   };

   static fsk a(UserApiService $$0, ezv $$1, Path $$2) {
      return (fsk)($$1.g() == ezv.a.c ? new frr($$0, $$1.b(), $$2) : a);
   }

   CompletableFuture<Optional<ciu>> a();

   boolean b();
}
