import com.mojang.logging.LogUtils;
import java.util.Objects;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class eqd {
   private static final Logger a = LogUtils.getLogger();
   @Nullable
   private static CompletableFuture<eqd.a> b;

   public static CompletableFuture<eqd.a> a() {
      if (b == null || a(b)) {
         b = b();
      }

      return b;
   }

   private static boolean a(CompletableFuture<eqd.a> $$0) {
      eqd.a $$1 = $$0.getNow(null);
      return $$1 != null && $$1.b() != null;
   }

   private static CompletableFuture<eqd.a> b() {
      return CompletableFuture.supplyAsync(() -> {
         eqj $$0 = eqj.a();

         try {
            if ($$0.g() != eqj.a.a) {
               return new eqd.a(eqd.b.b);
            } else {
               return !$$0.f() ? new eqd.a(eqd.b.c) : new eqd.a(eqd.b.a);
            }
         } catch (erw var2) {
            a.error("Couldn't connect to realms", var2);
            return var2.a.a() == 401 ? new eqd.a(eqd.b.d) : new eqd.a(var2);
         }
      }, ac.g());
   }

   public static record a(eqd.b a, @Nullable erw b) {
      public a(eqd.b $$0) {
         this($$0, null);
      }

      public a(erw $$0) {
         this(eqd.b.e, $$0);
      }

      @Nullable
      public fct a(fct $$0) {
         return (fct)(switch (this.a) {
            case a -> null;
            case b -> new esi($$0);
            case c -> new est($$0);
            case d -> new esn(vd.c("mco.error.invalid.session.title"), vd.c("mco.error.invalid.session.message"), $$0);
            case e -> new esn(Objects.requireNonNull(this.b), $$0);
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
