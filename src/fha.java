import com.mojang.logging.LogUtils;
import java.util.Objects;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fha {
   private static final Logger a = LogUtils.getLogger();
   @Nullable
   private static CompletableFuture<fha.a> b;

   public static CompletableFuture<fha.a> a() {
      if (b == null || a(b)) {
         b = b();
      }

      return b;
   }

   private static boolean a(CompletableFuture<fha.a> $$0) {
      fha.a $$1 = $$0.getNow(null);
      return $$1 != null && $$1.b() != null;
   }

   private static CompletableFuture<fha.a> b() {
      fmq $$0 = fme.Q().X();
      return $$0.g() != fmq.a.c ? CompletableFuture.completedFuture(new fha.a(fha.b.d)) : CompletableFuture.supplyAsync(() -> {
         fhg $$0x = fhg.a();

         try {
            if ($$0x.g() != fhg.a.a) {
               return new fha.a(fha.b.b);
            } else {
               return !$$0x.f() ? new fha.a(fha.b.c) : new fha.a(fha.b.a);
            }
         } catch (fjc var2) {
            a.error("Couldn't connect to realms", var2);
            return var2.a.a() == 401 ? new fha.a(fha.b.d) : new fha.a(var2);
         }
      }, ae.h());
   }

   public static record a(fha.b a, @Nullable fjc b) {
      public a(fha.b $$0) {
         this($$0, null);
      }

      public a(fjc $$0) {
         this(fha.b.e, $$0);
      }

      @Nullable
      public ftw a(ftw $$0) {
         return (ftw)(switch (this.a) {
            case a -> null;
            case b -> new fjp($$0);
            case c -> new fjz($$0);
            case d -> new fju(xv.c("mco.error.invalid.session.title"), xv.c("mco.error.invalid.session.message"), $$0);
            case e -> new fju(Objects.requireNonNull(this.b), $$0);
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
