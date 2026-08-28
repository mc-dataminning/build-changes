import com.mojang.logging.LogUtils;
import java.util.Objects;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class faj {
   private static final Logger a = LogUtils.getLogger();
   @Nullable
   private static CompletableFuture<faj.a> b;

   public static CompletableFuture<faj.a> a() {
      if (b == null || a(b)) {
         b = b();
      }

      return b;
   }

   private static boolean a(CompletableFuture<faj.a> $$0) {
      faj.a $$1 = $$0.getNow(null);
      return $$1 != null && $$1.b() != null;
   }

   private static CompletableFuture<faj.a> b() {
      ffu $$0 = ffg.Q().X();
      return $$0.g() != ffu.a.c ? CompletableFuture.completedFuture(new faj.a(faj.b.d)) : CompletableFuture.supplyAsync(() -> {
         fap $$0x = fap.a();

         try {
            if ($$0x.g() != fap.a.a) {
               return new faj.a(faj.b.b);
            } else {
               return !$$0x.f() ? new faj.a(faj.b.c) : new faj.a(faj.b.a);
            }
         } catch (fcc var2) {
            a.error("Couldn't connect to realms", var2);
            return var2.a.a() == 401 ? new faj.a(faj.b.d) : new faj.a(var2);
         }
      }, ac.h());
   }

   public static record a(faj.b a, @Nullable fcc b) {
      public a(faj.b $$0) {
         this($$0, null);
      }

      public a(fcc $$0) {
         this(faj.b.e, $$0);
      }

      @Nullable
      public fne a(fne $$0) {
         return (fne)(switch (this.a) {
            case a -> null;
            case b -> new fco($$0);
            case c -> new fcz($$0);
            case d -> new fct(xp.c("mco.error.invalid.session.title"), xp.c("mco.error.invalid.session.message"), $$0);
            case e -> new fct(Objects.requireNonNull(this.b), $$0);
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
