import com.mojang.authlib.minecraft.UserApiService;
import java.nio.file.Path;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;

public interface fiw {
   fiw a = new fiw() {
      @Override
      public CompletableFuture<Optional<cbo>> a() {
         return CompletableFuture.completedFuture(Optional.empty());
      }

      @Override
      public boolean b() {
         return false;
      }
   };

   static fiw a(UserApiService $$0, era $$1, Path $$2) {
      return (fiw)($$1.g() == era.a.c ? new fig($$0, $$1.b(), $$2) : a);
   }

   CompletableFuture<Optional<cbo>> a();

   boolean b();
}
