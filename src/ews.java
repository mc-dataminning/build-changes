import com.mojang.logging.LogUtils;
import java.util.Objects;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class ews {
   private static final Logger a = LogUtils.getLogger();
   @Nullable
   private static CompletableFuture<ews.a> b;

   public static CompletableFuture<ews.a> a() {
      if (b == null || a(b)) {
         b = b();
      }

      return b;
   }

   private static boolean a(CompletableFuture<ews.a> $$0) {
      ews.a $$1 = $$0.getNow(null);
      return $$1 != null && $$1.b() != null;
   }

   private static CompletableFuture<ews.a> b() {
      return CompletableFuture.supplyAsync(() -> {
         ewy $$0 = ewy.a();

         try {
            if ($$0.g() != ewy.a.a) {
               return new ews.a(ews.b.b);
            } else {
               return !$$0.f() ? new ews.a(ews.b.c) : new ews.a(ews.b.a);
            }
         } catch (eyl var2) {
            a.error("Couldn't connect to realms", var2);
            return var2.a.a() == 401 ? new ews.a(ews.b.d) : new ews.a(var2);
         }
      }, ac.g());
   }

   public static record a(ews.b a, @Nullable eyl b) {
      public a(ews.b $$0) {
         this($$0, null);
      }

      public a(eyl $$0) {
         this(ews.b.e, $$0);
      }

      @Nullable
      public fjo a(fjo $$0) {
         return (fjo)(switch (this.a) {
            case a -> null;
            case b -> new eyx($$0);
            case c -> new ezi($$0);
            case d -> new ezc(wg.c("mco.error.invalid.session.title"), wg.c("mco.error.invalid.session.message"), $$0);
            case e -> new ezc(Objects.requireNonNull(this.b), $$0);
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
