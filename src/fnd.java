import com.mojang.authlib.minecraft.UserApiService;
import java.nio.file.Path;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;

public interface fnd {
   fnd a = new fnd() {
      @Override
      public CompletableFuture<Optional<cet>> a() {
         return CompletableFuture.completedFuture(Optional.empty());
      }

      @Override
      public boolean b() {
         return false;
      }
   };

   static fnd a(UserApiService $$0, euz $$1, Path $$2) {
      return (fnd)($$1.g() == euz.a.c ? new fmm($$0, $$1.b(), $$2) : a);
   }

   CompletableFuture<Optional<cet>> a();

   boolean b();
}
