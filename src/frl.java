import com.mojang.authlib.minecraft.UserApiService;
import java.nio.file.Path;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;

public interface frl {
   frl a = new frl() {
      @Override
      public CompletableFuture<Optional<cic>> a() {
         return CompletableFuture.completedFuture(Optional.empty());
      }

      @Override
      public boolean b() {
         return false;
      }
   };

   static frl a(UserApiService $$0, eyz $$1, Path $$2) {
      return (frl)($$1.g() == eyz.a.c ? new fqt($$0, $$1.b(), $$2) : a);
   }

   CompletableFuture<Optional<cic>> a();

   boolean b();
}
