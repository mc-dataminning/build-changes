import com.mojang.logging.LogUtils;
import java.util.Objects;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fgd {
   private static final Logger a = LogUtils.getLogger();
   @Nullable
   private static CompletableFuture<fgd.a> b;

   public static CompletableFuture<fgd.a> a() {
      if (b == null || a(b)) {
         b = b();
      }

      return b;
   }

   private static boolean a(CompletableFuture<fgd.a> $$0) {
      fgd.a $$1 = $$0.getNow(null);
      return $$1 != null && $$1.b() != null;
   }

   private static CompletableFuture<fgd.a> b() {
      flu $$0 = fli.Q().X();
      return $$0.g() != flu.a.c ? CompletableFuture.completedFuture(new fgd.a(fgd.b.d)) : CompletableFuture.supplyAsync(() -> {
         fgj $$0x = fgj.a();

         try {
            if ($$0x.g() != fgj.a.a) {
               return new fgd.a(fgd.b.b);
            } else {
               return !$$0x.f() ? new fgd.a(fgd.b.c) : new fgd.a(fgd.b.a);
            }
         } catch (fif var2) {
            a.error("Couldn't connect to realms", var2);
            return var2.a.a() == 401 ? new fgd.a(fgd.b.d) : new fgd.a(var2);
         }
      }, af.h());
   }

   public static record a(fgd.b a, @Nullable fif b) {
      public a(fgd.b $$0) {
         this($$0, null);
      }

      public a(fif $$0) {
         this(fgd.b.e, $$0);
      }

      @Nullable
      public fuk a(fuk $$0) {
         return (fuk)(switch (this.a) {
            case a -> null;
            case b -> new fis($$0);
            case c -> new fjc($$0);
            case d -> new fix(wp.c("mco.error.invalid.session.title"), wp.c("mco.error.invalid.session.message"), $$0);
            case e -> new fix(Objects.requireNonNull(this.b), $$0);
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
