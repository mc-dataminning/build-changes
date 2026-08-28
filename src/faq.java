import com.mojang.logging.LogUtils;
import java.util.Objects;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class faq {
   private static final Logger a = LogUtils.getLogger();
   @Nullable
   private static CompletableFuture<faq.a> b;

   public static CompletableFuture<faq.a> a() {
      if (b == null || a(b)) {
         b = b();
      }

      return b;
   }

   private static boolean a(CompletableFuture<faq.a> $$0) {
      faq.a $$1 = $$0.getNow(null);
      return $$1 != null && $$1.b() != null;
   }

   private static CompletableFuture<faq.a> b() {
      fgb $$0 = ffn.Q().X();
      return $$0.g() != fgb.a.c ? CompletableFuture.completedFuture(new faq.a(faq.b.d)) : CompletableFuture.supplyAsync(() -> {
         faw $$0x = faw.a();

         try {
            if ($$0x.g() != faw.a.a) {
               return new faq.a(faq.b.b);
            } else {
               return !$$0x.f() ? new faq.a(faq.b.c) : new faq.a(faq.b.a);
            }
         } catch (fcj var2) {
            a.error("Couldn't connect to realms", var2);
            return var2.a.a() == 401 ? new faq.a(faq.b.d) : new faq.a(var2);
         }
      }, ac.h());
   }

   public static record a(faq.b a, @Nullable fcj b) {
      public a(faq.b $$0) {
         this($$0, null);
      }

      public a(fcj $$0) {
         this(faq.b.e, $$0);
      }

      @Nullable
      public fnd a(fnd $$0) {
         return (fnd)(switch (this.a) {
            case a -> null;
            case b -> new fcw($$0);
            case c -> new fdg($$0);
            case d -> new fdb(wu.c("mco.error.invalid.session.title"), wu.c("mco.error.invalid.session.message"), $$0);
            case e -> new fdb(Objects.requireNonNull(this.b), $$0);
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
