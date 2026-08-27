import com.mojang.authlib.minecraft.UserApiService;
import java.nio.file.Path;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;

public interface flt {
   flt a = new flt() {
      @Override
      public CompletableFuture<Optional<cdw>> a() {
         return CompletableFuture.completedFuture(Optional.empty());
      }

      @Override
      public boolean b() {
         return false;
      }
   };

   static flt a(UserApiService $$0, ets $$1, Path $$2) {
      return (flt)($$1.g() == ets.a.c ? new flc($$0, $$1.b(), $$2) : a);
   }

   CompletableFuture<Optional<cdw>> a();

   boolean b();
}
