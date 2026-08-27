import com.mojang.authlib.minecraft.UserApiService;
import java.nio.file.Path;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;

public interface ffc {
   ffc a = new ffc() {
      @Override
      public CompletableFuture<Optional<byq>> a() {
         return CompletableFuture.completedFuture(Optional.empty());
      }

      @Override
      public boolean b() {
         return false;
      }
   };

   static ffc a(UserApiService $$0, eoc $$1, Path $$2) {
      return (ffc)($$1.i() == eoc.a.c ? new fes($$0, $$1.h().getId(), $$2) : a);
   }

   CompletableFuture<Optional<byq>> a();

   boolean b();
}
