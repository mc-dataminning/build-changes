import com.mojang.authlib.minecraft.UserApiService;
import java.nio.file.Path;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;

public interface fly {
   fly a = new fly() {
      @Override
      public CompletableFuture<Optional<ceb>> a() {
         return CompletableFuture.completedFuture(Optional.empty());
      }

      @Override
      public boolean b() {
         return false;
      }
   };

   static fly a(UserApiService $$0, etx $$1, Path $$2) {
      return (fly)($$1.g() == etx.a.c ? new flh($$0, $$1.b(), $$2) : a);
   }

   CompletableFuture<Optional<ceb>> a();

   boolean b();
}
