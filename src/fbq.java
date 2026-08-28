import com.mojang.logging.LogUtils;
import java.util.Objects;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fbq {
   private static final Logger a = LogUtils.getLogger();
   @Nullable
   private static CompletableFuture<fbq.a> b;

   public static CompletableFuture<fbq.a> a() {
      if (b == null || a(b)) {
         b = b();
      }

      return b;
   }

   private static boolean a(CompletableFuture<fbq.a> $$0) {
      fbq.a $$1 = $$0.getNow(null);
      return $$1 != null && $$1.b() != null;
   }

   private static CompletableFuture<fbq.a> b() {
      fgz $$0 = fgm.Q().X();
      return $$0.g() != fgz.a.c ? CompletableFuture.completedFuture(new fbq.a(fbq.b.d)) : CompletableFuture.supplyAsync(() -> {
         fbw $$0x = fbw.a();

         try {
            if ($$0x.g() != fbw.a.a) {
               return new fbq.a(fbq.b.b);
            } else {
               return !$$0x.f() ? new fbq.a(fbq.b.c) : new fbq.a(fbq.b.a);
            }
         } catch (fdh var2) {
            a.error("Couldn't connect to realms", var2);
            return var2.a.a() == 401 ? new fbq.a(fbq.b.d) : new fbq.a(var2);
         }
      }, ad.h());
   }

   public static record a(fbq.b a, @Nullable fdh b) {
      public a(fbq.b $$0) {
         this($$0, null);
      }

      public a(fdh $$0) {
         this(fbq.b.e, $$0);
      }

      @Nullable
      public fob a(fob $$0) {
         return (fob)(switch (this.a) {
            case a -> null;
            case b -> new fdu($$0);
            case c -> new fee($$0);
            case d -> new fdz(wz.c("mco.error.invalid.session.title"), wz.c("mco.error.invalid.session.message"), $$0);
            case e -> new fdz(Objects.requireNonNull(this.b), $$0);
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
