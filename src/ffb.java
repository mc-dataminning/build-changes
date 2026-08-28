import com.mojang.logging.LogUtils;
import java.util.Objects;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class ffb {
   private static final Logger a = LogUtils.getLogger();
   @Nullable
   private static CompletableFuture<ffb.a> b;

   public static CompletableFuture<ffb.a> a() {
      if (b == null || a(b)) {
         b = b();
      }

      return b;
   }

   private static boolean a(CompletableFuture<ffb.a> $$0) {
      ffb.a $$1 = $$0.getNow(null);
      return $$1 != null && $$1.b() != null;
   }

   private static CompletableFuture<ffb.a> b() {
      fkr $$0 = fke.Q().X();
      return $$0.g() != fkr.a.c ? CompletableFuture.completedFuture(new ffb.a(ffb.b.d)) : CompletableFuture.supplyAsync(() -> {
         ffh $$0x = ffh.a();

         try {
            if ($$0x.g() != ffh.a.a) {
               return new ffb.a(ffb.b.b);
            } else {
               return !$$0x.f() ? new ffb.a(ffb.b.c) : new ffb.a(ffb.b.a);
            }
         } catch (fhc var2) {
            a.error("Couldn't connect to realms", var2);
            return var2.a.a() == 401 ? new ffb.a(ffb.b.d) : new ffb.a(var2);
         }
      }, ae.h());
   }

   public static record a(ffb.b a, @Nullable fhc b) {
      public a(ffb.b $$0) {
         this($$0, null);
      }

      public a(fhc $$0) {
         this(ffb.b.e, $$0);
      }

      @Nullable
      public frw a(frw $$0) {
         return (frw)(switch (this.a) {
            case a -> null;
            case b -> new fhp($$0);
            case c -> new fhz($$0);
            case d -> new fhu(xj.c("mco.error.invalid.session.title"), xj.c("mco.error.invalid.session.message"), $$0);
            case e -> new fhu(Objects.requireNonNull(this.b), $$0);
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
