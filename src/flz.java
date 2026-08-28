import com.mojang.logging.LogUtils;
import java.util.Objects;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class flz {
   private static final Logger a = LogUtils.getLogger();
   @Nullable
   private static CompletableFuture<flz.a> b;

   public static CompletableFuture<flz.a> a() {
      if (b == null || a(b)) {
         b = b();
      }

      return b;
   }

   private static boolean a(CompletableFuture<flz.a> $$0) {
      flz.a $$1 = $$0.getNow(null);
      return $$1 != null && $$1.b() != null;
   }

   private static CompletableFuture<flz.a> b() {
      frr $$0 = frf.Q().X();
      return $$0.g() != frr.a.c ? CompletableFuture.completedFuture(new flz.a(flz.b.d)) : CompletableFuture.supplyAsync(() -> {
         fmf $$0x = fmf.a();

         try {
            if ($$0x.h() != fmf.a.a) {
               return new flz.a(flz.b.b);
            } else {
               return !$$0x.g() ? new flz.a(flz.b.c) : new flz.a(flz.b.a);
            }
         } catch (fob var2) {
            a.error("Couldn't connect to realms", var2);
            return var2.a.a() == 401 ? new flz.a(flz.b.d) : new flz.a(var2);
         }
      }, ag.i());
   }

   public static record a(flz.b a, @Nullable fob b) {
      public a(flz.b $$0) {
         this($$0, null);
      }

      public a(fob $$0) {
         this(flz.b.e, $$0);
      }

      @Nullable
      public gaf a(gaf $$0) {
         return (gaf)(switch (this.a) {
            case a -> null;
            case b -> new foo($$0);
            case c -> new foz($$0);
            case d -> new fou(xc.c("mco.error.invalid.session.title"), xc.c("mco.error.invalid.session.message"), $$0);
            case e -> new fou(Objects.requireNonNull(this.b), $$0);
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
