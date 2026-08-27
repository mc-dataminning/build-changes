import com.mojang.logging.LogUtils;
import java.util.Objects;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class esr {
   private static final Logger a = LogUtils.getLogger();
   @Nullable
   private static CompletableFuture<esr.a> b;

   public static CompletableFuture<esr.a> a() {
      if (b == null || a(b)) {
         b = b();
      }

      return b;
   }

   private static boolean a(CompletableFuture<esr.a> $$0) {
      esr.a $$1 = $$0.getNow(null);
      return $$1 != null && $$1.b() != null;
   }

   private static CompletableFuture<esr.a> b() {
      return CompletableFuture.supplyAsync(() -> {
         esx $$0 = esx.a();

         try {
            if ($$0.g() != esx.a.a) {
               return new esr.a(esr.b.b);
            } else {
               return !$$0.f() ? new esr.a(esr.b.c) : new esr.a(esr.b.a);
            }
         } catch (euk var2) {
            a.error("Couldn't connect to realms", var2);
            return var2.a.a() == 401 ? new esr.a(esr.b.d) : new esr.a(var2);
         }
      }, ac.g());
   }

   public static record a(esr.b a, @Nullable euk b) {
      public a(esr.b $$0) {
         this($$0, null);
      }

      public a(euk $$0) {
         this(esr.b.e, $$0);
      }

      @Nullable
      public ffl a(ffl $$0) {
         return (ffl)(switch (this.a) {
            case a -> null;
            case b -> new euw($$0);
            case c -> new evh($$0);
            case d -> new evb(vq.c("mco.error.invalid.session.title"), vq.c("mco.error.invalid.session.message"), $$0);
            case e -> new evb(Objects.requireNonNull(this.b), $$0);
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
