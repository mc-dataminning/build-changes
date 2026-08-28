import com.mojang.logging.LogUtils;
import java.util.Objects;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fah {
   private static final Logger a = LogUtils.getLogger();
   @Nullable
   private static CompletableFuture<fah.a> b;

   public static CompletableFuture<fah.a> a() {
      if (b == null || a(b)) {
         b = b();
      }

      return b;
   }

   private static boolean a(CompletableFuture<fah.a> $$0) {
      fah.a $$1 = $$0.getNow(null);
      return $$1 != null && $$1.b() != null;
   }

   private static CompletableFuture<fah.a> b() {
      ffs $$0 = ffe.Q().X();
      return $$0.g() != ffs.a.c ? CompletableFuture.completedFuture(new fah.a(fah.b.d)) : CompletableFuture.supplyAsync(() -> {
         fan $$0x = fan.a();

         try {
            if ($$0x.g() != fan.a.a) {
               return new fah.a(fah.b.b);
            } else {
               return !$$0x.f() ? new fah.a(fah.b.c) : new fah.a(fah.b.a);
            }
         } catch (fca var2) {
            a.error("Couldn't connect to realms", var2);
            return var2.a.a() == 401 ? new fah.a(fah.b.d) : new fah.a(var2);
         }
      }, ac.h());
   }

   public static record a(fah.b a, @Nullable fca b) {
      public a(fah.b $$0) {
         this($$0, null);
      }

      public a(fca $$0) {
         this(fah.b.e, $$0);
      }

      @Nullable
      public fnc a(fnc $$0) {
         return (fnc)(switch (this.a) {
            case a -> null;
            case b -> new fcm($$0);
            case c -> new fcx($$0);
            case d -> new fcr(xo.c("mco.error.invalid.session.title"), xo.c("mco.error.invalid.session.message"), $$0);
            case e -> new fcr(Objects.requireNonNull(this.b), $$0);
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
