import com.mojang.logging.LogUtils;
import java.util.Objects;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class elr {
   private static final Logger a = LogUtils.getLogger();
   @Nullable
   private static CompletableFuture<elr.a> b;

   public static CompletableFuture<elr.a> a() {
      if (b == null || a(b)) {
         b = b();
      }

      return b;
   }

   private static boolean a(CompletableFuture<elr.a> $$0) {
      elr.a $$1 = $$0.getNow(null);
      return $$1 != null && $$1.b() != null;
   }

   private static CompletableFuture<elr.a> b() {
      return CompletableFuture.supplyAsync(() -> {
         elx $$0 = elx.a();

         try {
            if ($$0.f() != elx.a.a) {
               return new elr.a(elr.b.b);
            } else {
               return !$$0.e() ? new elr.a(elr.b.c) : new elr.a(elr.b.a);
            }
         } catch (enk var2) {
            a.error("Couldn't connect to realms", var2);
            return var2.a.a() == 401 ? new elr.a(elr.b.d) : new elr.a(var2);
         }
      }, ac.g());
   }

   public static record a(elr.b a, @Nullable enk b) {
      public a(elr.b $$0) {
         this($$0, null);
      }

      public a(enk $$0) {
         this(elr.b.e, $$0);
      }

      @Nullable
      public exv a(exv $$0) {
         return (exv)(switch (this.a) {
            case a -> null;
            case b -> new enx($$0);
            case c -> new eoh($$0);
            case d -> new eoc(te.c("mco.error.invalid.session.title"), te.c("mco.error.invalid.session.message"), $$0);
            case e -> new eoc(Objects.requireNonNull(this.b), $$0);
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
