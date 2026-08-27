import com.mojang.authlib.minecraft.UserApiService;
import java.nio.file.Path;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;

public interface fim {
   fim a = new fim() {
      @Override
      public CompletableFuture<Optional<cbn>> a() {
         return CompletableFuture.completedFuture(Optional.empty());
      }

      @Override
      public boolean b() {
         return false;
      }
   };

   static fim a(UserApiService $$0, erc $$1, Path $$2) {
      return (fim)($$1.h() == erc.a.c ? new fhx($$0, $$1.b(), $$2) : a);
   }

   CompletableFuture<Optional<cbn>> a();

   boolean b();
}
