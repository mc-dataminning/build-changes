import com.mojang.logging.LogUtils;
import java.util.Objects;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class exb {
   private static final Logger a = LogUtils.getLogger();
   @Nullable
   private static CompletableFuture<exb.a> b;

   public static CompletableFuture<exb.a> a() {
      if (b == null || a(b)) {
         b = b();
      }

      return b;
   }

   private static boolean a(CompletableFuture<exb.a> $$0) {
      exb.a $$1 = $$0.getNow(null);
      return $$1 != null && $$1.b() != null;
   }

   private static CompletableFuture<exb.a> b() {
      return CompletableFuture.supplyAsync(() -> {
         exh $$0 = exh.a();

         try {
            if ($$0.g() != exh.a.a) {
               return new exb.a(exb.b.b);
            } else {
               return !$$0.f() ? new exb.a(exb.b.c) : new exb.a(exb.b.a);
            }
         } catch (eyu var2) {
            a.error("Couldn't connect to realms", var2);
            return var2.a.a() == 401 ? new exb.a(exb.b.d) : new exb.a(var2);
         }
      }, ac.g());
   }

   public static record a(exb.b a, @Nullable eyu b) {
      public a(exb.b $$0) {
         this($$0, null);
      }

      public a(eyu $$0) {
         this(exb.b.e, $$0);
      }

      @Nullable
      public fjx a(fjx $$0) {
         return (fjx)(switch (this.a) {
            case a -> null;
            case b -> new ezg($$0);
            case c -> new ezr($$0);
            case d -> new ezl(wi.c("mco.error.invalid.session.title"), wi.c("mco.error.invalid.session.message"), $$0);
            case e -> new ezl(Objects.requireNonNull(this.b), $$0);
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
