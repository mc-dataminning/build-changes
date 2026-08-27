import com.mojang.logging.LogUtils;
import java.util.Objects;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class eyh {
   private static final Logger a = LogUtils.getLogger();
   @Nullable
   private static CompletableFuture<eyh.a> b;

   public static CompletableFuture<eyh.a> a() {
      if (b == null || a(b)) {
         b = b();
      }

      return b;
   }

   private static boolean a(CompletableFuture<eyh.a> $$0) {
      eyh.a $$1 = $$0.getNow(null);
      return $$1 != null && $$1.b() != null;
   }

   private static CompletableFuture<eyh.a> b() {
      return CompletableFuture.supplyAsync(() -> {
         eyn $$0 = eyn.a();

         try {
            if ($$0.g() != eyn.a.a) {
               return new eyh.a(eyh.b.b);
            } else {
               return !$$0.f() ? new eyh.a(eyh.b.c) : new eyh.a(eyh.b.a);
            }
         } catch (faa var2) {
            a.error("Couldn't connect to realms", var2);
            return var2.a.a() == 401 ? new eyh.a(eyh.b.d) : new eyh.a(var2);
         }
      }, ac.g());
   }

   public static record a(eyh.b a, @Nullable faa b) {
      public a(eyh.b $$0) {
         this($$0, null);
      }

      public a(faa $$0) {
         this(eyh.b.e, $$0);
      }

      @Nullable
      public fld a(fld $$0) {
         return (fld)(switch (this.a) {
            case a -> null;
            case b -> new fam($$0);
            case c -> new fax($$0);
            case d -> new far(wu.c("mco.error.invalid.session.title"), wu.c("mco.error.invalid.session.message"), $$0);
            case e -> new far(Objects.requireNonNull(this.b), $$0);
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
