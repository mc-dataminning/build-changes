import com.mojang.logging.LogUtils;
import java.util.Objects;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fki {
   private static final Logger a = LogUtils.getLogger();
   @Nullable
   private static CompletableFuture<fki.a> b;

   public static CompletableFuture<fki.a> a() {
      if (b == null || a(b)) {
         b = b();
      }

      return b;
   }

   private static boolean a(CompletableFuture<fki.a> $$0) {
      fki.a $$1 = $$0.getNow(null);
      return $$1 != null && $$1.b() != null;
   }

   private static CompletableFuture<fki.a> b() {
      fqa $$0 = fpo.Q().X();
      return $$0.g() != fqa.a.c ? CompletableFuture.completedFuture(new fki.a(fki.b.d)) : CompletableFuture.supplyAsync(() -> {
         fko $$0x = fko.a();

         try {
            if ($$0x.g() != fko.a.a) {
               return new fki.a(fki.b.b);
            } else {
               return !$$0x.f() ? new fki.a(fki.b.c) : new fki.a(fki.b.a);
            }
         } catch (fmk var2) {
            a.error("Couldn't connect to realms", var2);
            return var2.a.a() == 401 ? new fki.a(fki.b.d) : new fki.a(var2);
         }
      }, ag.i());
   }

   public static record a(fki.b a, @Nullable fmk b) {
      public a(fki.b $$0) {
         this($$0, null);
      }

      public a(fmk $$0) {
         this(fki.b.e, $$0);
      }

      @Nullable
      public fyn a(fyn $$0) {
         return (fyn)(switch (this.a) {
            case a -> null;
            case b -> new fmx($$0);
            case c -> new fnh($$0);
            case d -> new fnc(wy.c("mco.error.invalid.session.title"), wy.c("mco.error.invalid.session.message"), $$0);
            case e -> new fnc(Objects.requireNonNull(this.b), $$0);
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
