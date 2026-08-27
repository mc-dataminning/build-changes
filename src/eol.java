import com.mojang.logging.LogUtils;
import java.util.Objects;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class eol {
   private static final Logger a = LogUtils.getLogger();
   @Nullable
   private static CompletableFuture<eol.a> b;

   public static CompletableFuture<eol.a> a() {
      if (b == null || a(b)) {
         b = b();
      }

      return b;
   }

   private static boolean a(CompletableFuture<eol.a> $$0) {
      eol.a $$1 = $$0.getNow(null);
      return $$1 != null && $$1.b() != null;
   }

   private static CompletableFuture<eol.a> b() {
      return CompletableFuture.supplyAsync(() -> {
         eor $$0 = eor.a();

         try {
            if ($$0.g() != eor.a.a) {
               return new eol.a(eol.b.b);
            } else {
               return !$$0.f() ? new eol.a(eol.b.c) : new eol.a(eol.b.a);
            }
         } catch (eqe var2) {
            a.error("Couldn't connect to realms", var2);
            return var2.a.a() == 401 ? new eol.a(eol.b.d) : new eol.a(var2);
         }
      }, ac.g());
   }

   public static record a(eol.b a, @Nullable eqe b) {
      public a(eol.b $$0) {
         this($$0, null);
      }

      public a(eqe $$0) {
         this(eol.b.e, $$0);
      }

      @Nullable
      public faz a(faz $$0) {
         return (faz)(switch (this.a) {
            case a -> null;
            case b -> new eqq($$0);
            case c -> new erb($$0);
            case d -> new eqv(uv.c("mco.error.invalid.session.title"), uv.c("mco.error.invalid.session.message"), $$0);
            case e -> new eqv(Objects.requireNonNull(this.b), $$0);
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
