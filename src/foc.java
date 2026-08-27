import com.mojang.authlib.minecraft.UserApiService;
import java.nio.file.Path;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;

public interface foc {
   foc a = new foc() {
      @Override
      public CompletableFuture<Optional<cfk>> a() {
         return CompletableFuture.completedFuture(Optional.empty());
      }

      @Override
      public boolean b() {
         return false;
      }
   };

   static foc a(UserApiService $$0, evx $$1, Path $$2) {
      return (foc)($$1.g() == evx.a.c ? new fnl($$0, $$1.b(), $$2) : a);
   }

   CompletableFuture<Optional<cfk>> a();

   boolean b();
}
