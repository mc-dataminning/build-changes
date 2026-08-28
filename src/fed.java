import com.mojang.logging.LogUtils;
import java.util.Objects;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fed {
   private static final Logger a = LogUtils.getLogger();
   @Nullable
   private static CompletableFuture<fed.a> b;

   public static CompletableFuture<fed.a> a() {
      if (b == null || a(b)) {
         b = b();
      }

      return b;
   }

   private static boolean a(CompletableFuture<fed.a> $$0) {
      fed.a $$1 = $$0.getNow(null);
      return $$1 != null && $$1.b() != null;
   }

   private static CompletableFuture<fed.a> b() {
      fjn $$0 = fja.Q().X();
      return $$0.g() != fjn.a.c ? CompletableFuture.completedFuture(new fed.a(fed.b.d)) : CompletableFuture.supplyAsync(() -> {
         fej $$0x = fej.a();

         try {
            if ($$0x.g() != fej.a.a) {
               return new fed.a(fed.b.b);
            } else {
               return !$$0x.f() ? new fed.a(fed.b.c) : new fed.a(fed.b.a);
            }
         } catch (ffu var2) {
            a.error("Couldn't connect to realms", var2);
            return var2.a.a() == 401 ? new fed.a(fed.b.d) : new fed.a(var2);
         }
      }, ad.h());
   }

   public static record a(fed.b a, @Nullable ffu b) {
      public a(fed.b $$0) {
         this($$0, null);
      }

      public a(ffu $$0) {
         this(fed.b.e, $$0);
      }

      @Nullable
      public fqs a(fqs $$0) {
         return (fqs)(switch (this.a) {
            case a -> null;
            case b -> new fgh($$0);
            case c -> new fgr($$0);
            case d -> new fgm(xh.c("mco.error.invalid.session.title"), xh.c("mco.error.invalid.session.message"), $$0);
            case e -> new fgm(Objects.requireNonNull(this.b), $$0);
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
