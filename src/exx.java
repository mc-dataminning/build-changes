import com.mojang.logging.LogUtils;
import java.util.Objects;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class exx {
   private static final Logger a = LogUtils.getLogger();
   @Nullable
   private static CompletableFuture<exx.a> b;

   public static CompletableFuture<exx.a> a() {
      if (b == null || a(b)) {
         b = b();
      }

      return b;
   }

   private static boolean a(CompletableFuture<exx.a> $$0) {
      exx.a $$1 = $$0.getNow(null);
      return $$1 != null && $$1.b() != null;
   }

   private static CompletableFuture<exx.a> b() {
      return CompletableFuture.supplyAsync(() -> {
         eyd $$0 = eyd.a();

         try {
            if ($$0.g() != eyd.a.a) {
               return new exx.a(exx.b.b);
            } else {
               return !$$0.f() ? new exx.a(exx.b.c) : new exx.a(exx.b.a);
            }
         } catch (ezq var2) {
            a.error("Couldn't connect to realms", var2);
            return var2.a.a() == 401 ? new exx.a(exx.b.d) : new exx.a(var2);
         }
      }, ac.g());
   }

   public static record a(exx.b a, @Nullable ezq b) {
      public a(exx.b $$0) {
         this($$0, null);
      }

      public a(ezq $$0) {
         this(exx.b.e, $$0);
      }

      @Nullable
      public fkt a(fkt $$0) {
         return (fkt)(switch (this.a) {
            case a -> null;
            case b -> new fac($$0);
            case c -> new fan($$0);
            case d -> new fah(ws.c("mco.error.invalid.session.title"), ws.c("mco.error.invalid.session.message"), $$0);
            case e -> new fah(Objects.requireNonNull(this.b), $$0);
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
