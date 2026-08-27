import com.mojang.logging.LogUtils;
import java.util.Objects;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class eqk {
   private static final Logger a = LogUtils.getLogger();
   @Nullable
   private static CompletableFuture<eqk.a> b;

   public static CompletableFuture<eqk.a> a() {
      if (b == null || a(b)) {
         b = b();
      }

      return b;
   }

   private static boolean a(CompletableFuture<eqk.a> $$0) {
      eqk.a $$1 = $$0.getNow(null);
      return $$1 != null && $$1.b() != null;
   }

   private static CompletableFuture<eqk.a> b() {
      return CompletableFuture.supplyAsync(() -> {
         eqq $$0 = eqq.a();

         try {
            if ($$0.g() != eqq.a.a) {
               return new eqk.a(eqk.b.b);
            } else {
               return !$$0.f() ? new eqk.a(eqk.b.c) : new eqk.a(eqk.b.a);
            }
         } catch (esd var2) {
            a.error("Couldn't connect to realms", var2);
            return var2.a.a() == 401 ? new eqk.a(eqk.b.d) : new eqk.a(var2);
         }
      }, ac.g());
   }

   public static record a(eqk.b a, @Nullable esd b) {
      public a(eqk.b $$0) {
         this($$0, null);
      }

      public a(esd $$0) {
         this(eqk.b.e, $$0);
      }

      @Nullable
      public fda a(fda $$0) {
         return (fda)(switch (this.a) {
            case a -> null;
            case b -> new esp($$0);
            case c -> new eta($$0);
            case d -> new esu(vf.c("mco.error.invalid.session.title"), vf.c("mco.error.invalid.session.message"), $$0);
            case e -> new esu(Objects.requireNonNull(this.b), $$0);
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
