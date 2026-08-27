import com.mojang.authlib.minecraft.UserApiService;
import java.nio.file.Path;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;

public interface fqo {
   fqo a = new fqo() {
      @Override
      public CompletableFuture<Optional<chn>> a() {
         return CompletableFuture.completedFuture(Optional.empty());
      }

      @Override
      public boolean b() {
         return false;
      }
   };

   static fqo a(UserApiService $$0, eyd $$1, Path $$2) {
      return (fqo)($$1.g() == eyd.a.c ? new fpx($$0, $$1.b(), $$2) : a);
   }

   CompletableFuture<Optional<chn>> a();

   boolean b();
}
