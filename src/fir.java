import com.mojang.authlib.minecraft.UserApiService;
import java.nio.file.Path;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;

public interface fir {
   fir a = new fir() {
      @Override
      public CompletableFuture<Optional<cbp>> a() {
         return CompletableFuture.completedFuture(Optional.empty());
      }

      @Override
      public boolean b() {
         return false;
      }
   };

   static fir a(UserApiService $$0, erb $$1, Path $$2) {
      return (fir)($$1.g() == erb.a.c ? new fib($$0, $$1.b(), $$2) : a);
   }

   CompletableFuture<Optional<cbp>> a();

   boolean b();
}
