import com.mojang.logging.LogUtils;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class feh {
   private static final Logger a = LogUtils.getLogger();
   private final fdz b;
   @Nullable
   private CompletableFuture<Boolean> c;
   private boolean d;

   public feh(fdz $$0) {
      this.b = $$0;
   }

   public void a(fly $$0) {
      if (!this.b.ah() && !this.b.m.w && !this.d && this.a()) {
         this.b.a(new fox($$0));
         this.d = true;
      }
   }

   private Boolean a() {
      if (this.c == null) {
         this.c = CompletableFuture.supplyAsync(this::b, ac.g());
      }

      try {
         return this.c.getNow(false);
      } catch (CompletionException var2) {
         a.warn("Failed to retrieve realms subscriptions", var2);
         this.d = true;
         return false;
      }
   }

   private boolean b() {
      try {
         return ezi.a(this.b).b().a.stream().anyMatch($$0 -> !$$0.j && this.b.b($$0.g));
      } catch (fav var2) {
         return false;
      }
   }
}
