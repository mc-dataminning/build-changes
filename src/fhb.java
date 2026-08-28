import com.mojang.logging.LogUtils;
import java.util.Objects;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fhb {
   private static final Logger a = LogUtils.getLogger();
   @Nullable
   private static CompletableFuture<fhb.a> b;

   public static CompletableFuture<fhb.a> a() {
      if (b == null || a(b)) {
         b = b();
      }

      return b;
   }

   private static boolean a(CompletableFuture<fhb.a> $$0) {
      fhb.a $$1 = $$0.getNow(null);
      return $$1 != null && $$1.b() != null;
   }

   private static CompletableFuture<fhb.a> b() {
      fms $$0 = fmg.Q().X();
      return $$0.g() != fms.a.c ? CompletableFuture.completedFuture(new fhb.a(fhb.b.d)) : CompletableFuture.supplyAsync(() -> {
         fhh $$0x = fhh.a();

         try {
            if ($$0x.g() != fhh.a.a) {
               return new fhb.a(fhb.b.b);
            } else {
               return !$$0x.f() ? new fhb.a(fhb.b.c) : new fhb.a(fhb.b.a);
            }
         } catch (fjd var2) {
            a.error("Couldn't connect to realms", var2);
            return var2.a.a() == 401 ? new fhb.a(fhb.b.d) : new fhb.a(var2);
         }
      }, af.i());
   }

   public static record a(fhb.b a, @Nullable fjd b) {
      public a(fhb.b $$0) {
         this($$0, null);
      }

      public a(fjd $$0) {
         this(fhb.b.e, $$0);
      }

      @Nullable
      public fvi a(fvi $$0) {
         return (fvi)(switch (this.a) {
            case a -> null;
            case b -> new fjq($$0);
            case c -> new fka($$0);
            case d -> new fjv(wp.c("mco.error.invalid.session.title"), wp.c("mco.error.invalid.session.message"), $$0);
            case e -> new fjv(Objects.requireNonNull(this.b), $$0);
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
