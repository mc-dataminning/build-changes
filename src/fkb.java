import com.mojang.authlib.minecraft.UserApiService;
import java.nio.file.Path;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;

public interface fkb {
   fkb a = new fkb() {
      @Override
      public CompletableFuture<Optional<ccz>> a() {
         return CompletableFuture.completedFuture(Optional.empty());
      }

      @Override
      public boolean b() {
         return false;
      }
   };

   static fkb a(UserApiService $$0, esd $$1, Path $$2) {
      return (fkb)($$1.g() == esd.a.c ? new fjk($$0, $$1.b(), $$2) : a);
   }

   CompletableFuture<Optional<ccz>> a();

   boolean b();
}
