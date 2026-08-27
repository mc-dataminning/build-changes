import com.mojang.authlib.minecraft.UserApiService;
import java.nio.file.Path;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;

public interface fjg {
   fjg a = new fjg() {
      @Override
      public CompletableFuture<Optional<cbw>> a() {
         return CompletableFuture.completedFuture(Optional.empty());
      }

      @Override
      public boolean b() {
         return false;
      }
   };

   static fjg a(UserApiService $$0, erk $$1, Path $$2) {
      return (fjg)($$1.g() == erk.a.c ? new fiq($$0, $$1.b(), $$2) : a);
   }

   CompletableFuture<Optional<cbw>> a();

   boolean b();
}
