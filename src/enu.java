import com.mojang.logging.LogUtils;
import java.util.Objects;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class enu {
   private static final Logger a = LogUtils.getLogger();
   @Nullable
   private static CompletableFuture<enu.a> b;

   public static CompletableFuture<enu.a> a() {
      if (b == null || a(b)) {
         b = b();
      }

      return b;
   }

   private static boolean a(CompletableFuture<enu.a> $$0) {
      enu.a $$1 = $$0.getNow(null);
      return $$1 != null && $$1.b() != null;
   }

   private static CompletableFuture<enu.a> b() {
      return CompletableFuture.supplyAsync(() -> {
         eoa $$0 = eoa.a();

         try {
            if ($$0.g() != eoa.a.a) {
               return new enu.a(enu.b.b);
            } else {
               return !$$0.f() ? new enu.a(enu.b.c) : new enu.a(enu.b.a);
            }
         } catch (epn var2) {
            a.error("Couldn't connect to realms", var2);
            return var2.a.a() == 401 ? new enu.a(enu.b.d) : new enu.a(var2);
         }
      }, ac.g());
   }

   public static record a(enu.b a, @Nullable epn b) {
      public a(enu.b $$0) {
         this($$0, null);
      }

      public a(epn $$0) {
         this(enu.b.e, $$0);
      }

      @Nullable
      public fah a(fah $$0) {
         return (fah)(switch (this.a) {
            case a -> null;
            case b -> new epz($$0);
            case c -> new eqk($$0);
            case d -> new eqe(ur.c("mco.error.invalid.session.title"), ur.c("mco.error.invalid.session.message"), $$0);
            case e -> new eqe(Objects.requireNonNull(this.b), $$0);
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
