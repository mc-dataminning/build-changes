import com.mojang.logging.LogUtils;
import java.util.Objects;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class eqj {
   private static final Logger a = LogUtils.getLogger();
   @Nullable
   private static CompletableFuture<eqj.a> b;

   public static CompletableFuture<eqj.a> a() {
      if (b == null || a(b)) {
         b = b();
      }

      return b;
   }

   private static boolean a(CompletableFuture<eqj.a> $$0) {
      eqj.a $$1 = $$0.getNow(null);
      return $$1 != null && $$1.b() != null;
   }

   private static CompletableFuture<eqj.a> b() {
      return CompletableFuture.supplyAsync(() -> {
         eqp $$0 = eqp.a();

         try {
            if ($$0.g() != eqp.a.a) {
               return new eqj.a(eqj.b.b);
            } else {
               return !$$0.f() ? new eqj.a(eqj.b.c) : new eqj.a(eqj.b.a);
            }
         } catch (esc var2) {
            a.error("Couldn't connect to realms", var2);
            return var2.a.a() == 401 ? new eqj.a(eqj.b.d) : new eqj.a(var2);
         }
      }, ac.g());
   }

   public static record a(eqj.b a, @Nullable esc b) {
      public a(eqj.b $$0) {
         this($$0, null);
      }

      public a(esc $$0) {
         this(eqj.b.e, $$0);
      }

      @Nullable
      public fcz a(fcz $$0) {
         return (fcz)(switch (this.a) {
            case a -> null;
            case b -> new eso($$0);
            case c -> new esz($$0);
            case d -> new est(vf.c("mco.error.invalid.session.title"), vf.c("mco.error.invalid.session.message"), $$0);
            case e -> new est(Objects.requireNonNull(this.b), $$0);
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
