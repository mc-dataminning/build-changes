import com.mojang.authlib.minecraft.UserApiService;
import java.nio.file.Path;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;

public interface foo {
   foo a = new foo() {
      @Override
      public CompletableFuture<Optional<cfs>> a() {
         return CompletableFuture.completedFuture(Optional.empty());
      }

      @Override
      public boolean b() {
         return false;
      }
   };

   static foo a(UserApiService $$0, ewg $$1, Path $$2) {
      return (foo)($$1.g() == ewg.a.c ? new fnx($$0, $$1.b(), $$2) : a);
   }

   CompletableFuture<Optional<cfs>> a();

   boolean b();
}
