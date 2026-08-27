import com.mojang.logging.LogUtils;
import java.util.Objects;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class epn {
   private static final Logger a = LogUtils.getLogger();
   @Nullable
   private static CompletableFuture<epn.a> b;

   public static CompletableFuture<epn.a> a() {
      if (b == null || a(b)) {
         b = b();
      }

      return b;
   }

   private static boolean a(CompletableFuture<epn.a> $$0) {
      epn.a $$1 = $$0.getNow(null);
      return $$1 != null && $$1.b() != null;
   }

   private static CompletableFuture<epn.a> b() {
      return CompletableFuture.supplyAsync(() -> {
         ept $$0 = ept.a();

         try {
            if ($$0.g() != ept.a.a) {
               return new epn.a(epn.b.b);
            } else {
               return !$$0.f() ? new epn.a(epn.b.c) : new epn.a(epn.b.a);
            }
         } catch (erg var2) {
            a.error("Couldn't connect to realms", var2);
            return var2.a.a() == 401 ? new epn.a(epn.b.d) : new epn.a(var2);
         }
      }, ac.g());
   }

   public static record a(epn.b a, @Nullable erg b) {
      public a(epn.b $$0) {
         this($$0, null);
      }

      public a(erg $$0) {
         this(epn.b.e, $$0);
      }

      @Nullable
      public fcc a(fcc $$0) {
         return (fcc)(switch (this.a) {
            case a -> null;
            case b -> new ers($$0);
            case c -> new esd($$0);
            case d -> new erx(vb.c("mco.error.invalid.session.title"), vb.c("mco.error.invalid.session.message"), $$0);
            case e -> new erx(Objects.requireNonNull(this.b), $$0);
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
