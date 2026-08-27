import com.mojang.authlib.minecraft.UserApiService;
import java.nio.file.Path;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;

public interface flg {
   flg a = new flg() {
      @Override
      public CompletableFuture<Optional<cdo>> a() {
         return CompletableFuture.completedFuture(Optional.empty());
      }

      @Override
      public boolean b() {
         return false;
      }
   };

   static flg a(UserApiService $$0, etg $$1, Path $$2) {
      return (flg)($$1.g() == etg.a.c ? new fkp($$0, $$1.b(), $$2) : a);
   }

   CompletableFuture<Optional<cdo>> a();

   boolean b();
}
