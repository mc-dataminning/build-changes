import com.mojang.logging.LogUtils;
import java.util.Objects;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class eog {
   private static final Logger a = LogUtils.getLogger();
   @Nullable
   private static CompletableFuture<eog.a> b;

   public static CompletableFuture<eog.a> a() {
      if (b == null || a(b)) {
         b = b();
      }

      return b;
   }

   private static boolean a(CompletableFuture<eog.a> $$0) {
      eog.a $$1 = $$0.getNow(null);
      return $$1 != null && $$1.b() != null;
   }

   private static CompletableFuture<eog.a> b() {
      return CompletableFuture.supplyAsync(() -> {
         eom $$0 = eom.a();

         try {
            if ($$0.g() != eom.a.a) {
               return new eog.a(eog.b.b);
            } else {
               return !$$0.f() ? new eog.a(eog.b.c) : new eog.a(eog.b.a);
            }
         } catch (epz var2) {
            a.error("Couldn't connect to realms", var2);
            return var2.a.a() == 401 ? new eog.a(eog.b.d) : new eog.a(var2);
         }
      }, ac.g());
   }

   public static record a(eog.b a, @Nullable epz b) {
      public a(eog.b $$0) {
         this($$0, null);
      }

      public a(epz $$0) {
         this(eog.b.e, $$0);
      }

      @Nullable
      public fau a(fau $$0) {
         return (fau)(switch (this.a) {
            case a -> null;
            case b -> new eql($$0);
            case c -> new eqw($$0);
            case d -> new eqq(ur.c("mco.error.invalid.session.title"), ur.c("mco.error.invalid.session.message"), $$0);
            case e -> new eqq(Objects.requireNonNull(this.b), $$0);
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
