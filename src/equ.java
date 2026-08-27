import com.mojang.logging.LogUtils;
import java.util.Objects;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class equ {
   private static final Logger a = LogUtils.getLogger();
   @Nullable
   private static CompletableFuture<equ.a> b;

   public static CompletableFuture<equ.a> a() {
      if (b == null || a(b)) {
         b = b();
      }

      return b;
   }

   private static boolean a(CompletableFuture<equ.a> $$0) {
      equ.a $$1 = $$0.getNow(null);
      return $$1 != null && $$1.b() != null;
   }

   private static CompletableFuture<equ.a> b() {
      return CompletableFuture.supplyAsync(() -> {
         era $$0 = era.a();

         try {
            if ($$0.g() != era.a.a) {
               return new equ.a(equ.b.b);
            } else {
               return !$$0.f() ? new equ.a(equ.b.c) : new equ.a(equ.b.a);
            }
         } catch (esn var2) {
            a.error("Couldn't connect to realms", var2);
            return var2.a.a() == 401 ? new equ.a(equ.b.d) : new equ.a(var2);
         }
      }, ac.g());
   }

   public static record a(equ.b a, @Nullable esn b) {
      public a(equ.b $$0) {
         this($$0, null);
      }

      public a(esn $$0) {
         this(equ.b.e, $$0);
      }

      @Nullable
      public fdm a(fdm $$0) {
         return (fdm)(switch (this.a) {
            case a -> null;
            case b -> new esz($$0);
            case c -> new etk($$0);
            case d -> new ete(vg.c("mco.error.invalid.session.title"), vg.c("mco.error.invalid.session.message"), $$0);
            case e -> new ete(Objects.requireNonNull(this.b), $$0);
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
