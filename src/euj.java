import com.mojang.logging.LogUtils;
import java.util.Objects;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class euj {
   private static final Logger a = LogUtils.getLogger();
   @Nullable
   private static CompletableFuture<euj.a> b;

   public static CompletableFuture<euj.a> a() {
      if (b == null || a(b)) {
         b = b();
      }

      return b;
   }

   private static boolean a(CompletableFuture<euj.a> $$0) {
      euj.a $$1 = $$0.getNow(null);
      return $$1 != null && $$1.b() != null;
   }

   private static CompletableFuture<euj.a> b() {
      return CompletableFuture.supplyAsync(() -> {
         eup $$0 = eup.a();

         try {
            if ($$0.g() != eup.a.a) {
               return new euj.a(euj.b.b);
            } else {
               return !$$0.f() ? new euj.a(euj.b.c) : new euj.a(euj.b.a);
            }
         } catch (ewc var2) {
            a.error("Couldn't connect to realms", var2);
            return var2.a.a() == 401 ? new euj.a(euj.b.d) : new euj.a(var2);
         }
      }, ac.g());
   }

   public static record a(euj.b a, @Nullable ewc b) {
      public a(euj.b $$0) {
         this($$0, null);
      }

      public a(ewc $$0) {
         this(euj.b.e, $$0);
      }

      @Nullable
      public fhf a(fhf $$0) {
         return (fhf)(switch (this.a) {
            case a -> null;
            case b -> new ewo($$0);
            case c -> new ewz($$0);
            case d -> new ewt(vu.c("mco.error.invalid.session.title"), vu.c("mco.error.invalid.session.message"), $$0);
            case e -> new ewt(Objects.requireNonNull(this.b), $$0);
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
