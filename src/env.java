import com.mojang.logging.LogUtils;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class env {
   private static final Logger a = LogUtils.getLogger();
   private final enn b;
   @Nullable
   private CompletableFuture<Boolean> c;
   private boolean d;

   public env(enn $$0) {
      this.b = $$0;
   }

   public void a(euq $$0) {
      if (!this.b.ae() && !this.b.m.w && !this.d && this.a()) {
         this.b.a(new exo($$0));
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
         return eiz.a(this.b).e().a.stream().anyMatch($$0 -> $$0.g != null && !$$0.j && $$0.g.equals(this.b.U().b()));
      } catch (ekm var2) {
         return false;
      }
   }
}
