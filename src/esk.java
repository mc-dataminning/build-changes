import com.mojang.logging.LogUtils;
import java.util.Objects;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class esk {
   private static final Logger a = LogUtils.getLogger();
   @Nullable
   private static CompletableFuture<esk.a> b;

   public static CompletableFuture<esk.a> a() {
      if (b == null || a(b)) {
         b = b();
      }

      return b;
   }

   private static boolean a(CompletableFuture<esk.a> $$0) {
      esk.a $$1 = $$0.getNow(null);
      return $$1 != null && $$1.b() != null;
   }

   private static CompletableFuture<esk.a> b() {
      return CompletableFuture.supplyAsync(() -> {
         esq $$0 = esq.a();

         try {
            if ($$0.g() != esq.a.a) {
               return new esk.a(esk.b.b);
            } else {
               return !$$0.f() ? new esk.a(esk.b.c) : new esk.a(esk.b.a);
            }
         } catch (eud var2) {
            a.error("Couldn't connect to realms", var2);
            return var2.a.a() == 401 ? new esk.a(esk.b.d) : new esk.a(var2);
         }
      }, ac.g());
   }

   public static record a(esk.b a, @Nullable eud b) {
      public a(esk.b $$0) {
         this($$0, null);
      }

      public a(eud $$0) {
         this(esk.b.e, $$0);
      }

      @Nullable
      public ffe a(ffe $$0) {
         return (ffe)(switch (this.a) {
            case a -> null;
            case b -> new eup($$0);
            case c -> new eva($$0);
            case d -> new euu(vq.c("mco.error.invalid.session.title"), vq.c("mco.error.invalid.session.message"), $$0);
            case e -> new euu(Objects.requireNonNull(this.b), $$0);
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
