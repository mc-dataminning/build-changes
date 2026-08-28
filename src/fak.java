import com.mojang.logging.LogUtils;
import java.util.Objects;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fak {
   private static final Logger a = LogUtils.getLogger();
   @Nullable
   private static CompletableFuture<fak.a> b;

   public static CompletableFuture<fak.a> a() {
      if (b == null || a(b)) {
         b = b();
      }

      return b;
   }

   private static boolean a(CompletableFuture<fak.a> $$0) {
      fak.a $$1 = $$0.getNow(null);
      return $$1 != null && $$1.b() != null;
   }

   private static CompletableFuture<fak.a> b() {
      ffv $$0 = ffh.Q().X();
      return $$0.g() != ffv.a.c ? CompletableFuture.completedFuture(new fak.a(fak.b.d)) : CompletableFuture.supplyAsync(() -> {
         faq $$0x = faq.a();

         try {
            if ($$0x.g() != faq.a.a) {
               return new fak.a(fak.b.b);
            } else {
               return !$$0x.f() ? new fak.a(fak.b.c) : new fak.a(fak.b.a);
            }
         } catch (fcd var2) {
            a.error("Couldn't connect to realms", var2);
            return var2.a.a() == 401 ? new fak.a(fak.b.d) : new fak.a(var2);
         }
      }, ac.h());
   }

   public static record a(fak.b a, @Nullable fcd b) {
      public a(fak.b $$0) {
         this($$0, null);
      }

      public a(fcd $$0) {
         this(fak.b.e, $$0);
      }

      @Nullable
      public fnf a(fnf $$0) {
         return (fnf)(switch (this.a) {
            case a -> null;
            case b -> new fcp($$0);
            case c -> new fda($$0);
            case d -> new fcu(xp.c("mco.error.invalid.session.title"), xp.c("mco.error.invalid.session.message"), $$0);
            case e -> new fcu(Objects.requireNonNull(this.b), $$0);
         });
      }
   }

   public static enum b {
      a,
      b,
      c,
      d,
      e;
   }
}
