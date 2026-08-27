import com.mojang.logging.LogUtils;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class evi {
   private static final Logger a = LogUtils.getLogger();
   private final eva b;
   @Nullable
   private CompletableFuture<Boolean> c;
   private boolean d;

   public evi(eva $$0) {
      this.b = $$0;
   }

   public void a(fct $$0) {
      if (!this.b.ae() && !this.b.m.w && !this.d && this.a()) {
         this.b.a(new ffs($$0));
         this.d = true;
      }
   }

   private Boolean a() {
      if (this.c == null) {
         this.c = CompletableFuture.supplyAsync(this::b, ac.f());
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
         return eqj.a(this.b).b().a.stream().anyMatch($$0 -> !$$0.j && this.b.b($$0.g));
      } catch (erw var2) {
         return false;
      }
   }
}
