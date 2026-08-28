import com.mojang.logging.LogUtils;
import java.util.Objects;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fag {
   private static final Logger a = LogUtils.getLogger();
   @Nullable
   private static CompletableFuture<fag.a> b;

   public static CompletableFuture<fag.a> a() {
      if (b == null || a(b)) {
         b = b();
      }

      return b;
   }

   private static boolean a(CompletableFuture<fag.a> $$0) {
      fag.a $$1 = $$0.getNow(null);
      return $$1 != null && $$1.b() != null;
   }

   private static CompletableFuture<fag.a> b() {
      ffr $$0 = ffd.Q().X();
      return $$0.g() != ffr.a.c ? CompletableFuture.completedFuture(new fag.a(fag.b.d)) : CompletableFuture.supplyAsync(() -> {
         fam $$0x = fam.a();

         try {
            if ($$0x.g() != fam.a.a) {
               return new fag.a(fag.b.b);
            } else {
               return !$$0x.f() ? new fag.a(fag.b.c) : new fag.a(fag.b.a);
            }
         } catch (fbz var2) {
            a.error("Couldn't connect to realms", var2);
            return var2.a.a() == 401 ? new fag.a(fag.b.d) : new fag.a(var2);
         }
      }, ac.h());
   }

   public static record a(fag.b a, @Nullable fbz b) {
      public a(fag.b $$0) {
         this($$0, null);
      }

      public a(fbz $$0) {
         this(fag.b.e, $$0);
      }

      @Nullable
      public fnb a(fnb $$0) {
         return (fnb)(switch (this.a) {
            case a -> null;
            case b -> new fcl($$0);
            case c -> new fcw($$0);
            case d -> new fcq(xo.c("mco.error.invalid.session.title"), xo.c("mco.error.invalid.session.message"), $$0);
            case e -> new fcq(Objects.requireNonNull(this.b), $$0);
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
