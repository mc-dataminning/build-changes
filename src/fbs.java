import com.mojang.logging.LogUtils;
import java.util.Objects;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fbs {
   private static final Logger a = LogUtils.getLogger();
   @Nullable
   private static CompletableFuture<fbs.a> b;

   public static CompletableFuture<fbs.a> a() {
      if (b == null || a(b)) {
         b = b();
      }

      return b;
   }

   private static boolean a(CompletableFuture<fbs.a> $$0) {
      fbs.a $$1 = $$0.getNow(null);
      return $$1 != null && $$1.b() != null;
   }

   private static CompletableFuture<fbs.a> b() {
      fhb $$0 = fgo.Q().X();
      return $$0.g() != fhb.a.c ? CompletableFuture.completedFuture(new fbs.a(fbs.b.d)) : CompletableFuture.supplyAsync(() -> {
         fby $$0x = fby.a();

         try {
            if ($$0x.g() != fby.a.a) {
               return new fbs.a(fbs.b.b);
            } else {
               return !$$0x.f() ? new fbs.a(fbs.b.c) : new fbs.a(fbs.b.a);
            }
         } catch (fdj var2) {
            a.error("Couldn't connect to realms", var2);
            return var2.a.a() == 401 ? new fbs.a(fbs.b.d) : new fbs.a(var2);
         }
      }, ad.h());
   }

   public static record a(fbs.b a, @Nullable fdj b) {
      public a(fbs.b $$0) {
         this($$0, null);
      }

      public a(fdj $$0) {
         this(fbs.b.e, $$0);
      }

      @Nullable
      public fod a(fod $$0) {
         return (fod)(switch (this.a) {
            case a -> null;
            case b -> new fdw($$0);
            case c -> new feg($$0);
            case d -> new feb(wz.c("mco.error.invalid.session.title"), wz.c("mco.error.invalid.session.message"), $$0);
            case e -> new feb(Objects.requireNonNull(this.b), $$0);
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
