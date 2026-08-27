import com.mojang.authlib.minecraft.UserApiService;
import java.nio.file.Path;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;

public interface fjb {
   fjb a = new fjb() {
      @Override
      public CompletableFuture<Optional<cbr>> a() {
         return CompletableFuture.completedFuture(Optional.empty());
      }

      @Override
      public boolean b() {
         return false;
      }
   };

   static fjb a(UserApiService $$0, erf $$1, Path $$2) {
      return (fjb)($$1.g() == erf.a.c ? new fil($$0, $$1.b(), $$2) : a);
   }

   CompletableFuture<Optional<cbr>> a();

   boolean b();
}
