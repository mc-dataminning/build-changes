import com.mojang.authlib.minecraft.UserApiService;
import java.nio.file.Path;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;

public interface fob {
   fob a = new fob() {
      @Override
      public CompletableFuture<Optional<cfj>> a() {
         return CompletableFuture.completedFuture(Optional.empty());
      }

      @Override
      public boolean b() {
         return false;
      }
   };

   static fob a(UserApiService $$0, evw $$1, Path $$2) {
      return (fob)($$1.g() == evw.a.c ? new fnk($$0, $$1.b(), $$2) : a);
   }

   CompletableFuture<Optional<cfj>> a();

   boolean b();
}
