import com.mojang.logging.LogUtils;
import java.util.Objects;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fhc {
   private static final Logger a = LogUtils.getLogger();
   @Nullable
   private static CompletableFuture<fhc.a> b;

   public static CompletableFuture<fhc.a> a() {
      if (b == null || a(b)) {
         b = b();
      }

      return b;
   }

   private static boolean a(CompletableFuture<fhc.a> $$0) {
      fhc.a $$1 = $$0.getNow(null);
      return $$1 != null && $$1.b() != null;
   }

   private static CompletableFuture<fhc.a> b() {
      fms $$0 = fmg.Q().X();
      return $$0.g() != fms.a.c ? CompletableFuture.completedFuture(new fhc.a(fhc.b.d)) : CompletableFuture.supplyAsync(() -> {
         fhi $$0x = fhi.a();

         try {
            if ($$0x.g() != fhi.a.a) {
               return new fhc.a(fhc.b.b);
            } else {
               return !$$0x.f() ? new fhc.a(fhc.b.c) : new fhc.a(fhc.b.a);
            }
         } catch (fje var2) {
            a.error("Couldn't connect to realms", var2);
            return var2.a.a() == 401 ? new fhc.a(fhc.b.d) : new fhc.a(var2);
         }
      }, ae.h());
   }

   public static record a(fhc.b a, @Nullable fje b) {
      public a(fhc.b $$0) {
         this($$0, null);
      }

      public a(fje $$0) {
         this(fhc.b.e, $$0);
      }

      @Nullable
      public fty a(fty $$0) {
         return (fty)(switch (this.a) {
            case a -> null;
            case b -> new fjr($$0);
            case c -> new fkb($$0);
            case d -> new fjw(xv.c("mco.error.invalid.session.title"), xv.c("mco.error.invalid.session.message"), $$0);
            case e -> new fjw(Objects.requireNonNull(this.b), $$0);
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
