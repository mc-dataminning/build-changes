import com.mojang.authlib.minecraft.UserApiService;
import java.nio.file.Path;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;

public interface fsm {
   fsm a = new fsm() {
      @Override
      public CompletableFuture<Optional<ciw>> a() {
         return CompletableFuture.completedFuture(Optional.empty());
      }

      @Override
      public boolean b() {
         return false;
      }
   };

   static fsm a(UserApiService $$0, ezx $$1, Path $$2) {
      return (fsm)($$1.g() == ezx.a.c ? new frt($$0, $$1.b(), $$2) : a);
   }

   CompletableFuture<Optional<ciw>> a();

   boolean b();
}
