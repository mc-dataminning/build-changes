import com.mojang.logging.LogUtils;
import java.util.Objects;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class elp {
   private static final Logger a = LogUtils.getLogger();
   @Nullable
   private static CompletableFuture<elp.a> b;

   public static CompletableFuture<elp.a> a() {
      if (b == null || a(b)) {
         b = b();
      }

      return b;
   }

   private static boolean a(CompletableFuture<elp.a> $$0) {
      elp.a $$1 = $$0.getNow(null);
      return $$1 != null && $$1.b() != null;
   }

   private static CompletableFuture<elp.a> b() {
      return CompletableFuture.supplyAsync(() -> {
         elv $$0 = elv.a();

         try {
            if ($$0.f() != elv.a.a) {
               return new elp.a(elp.b.b);
            } else {
               return !$$0.e() ? new elp.a(elp.b.c) : new elp.a(elp.b.a);
            }
         } catch (eni var2) {
            a.error("Couldn't connect to realms", var2);
            return var2.a.a() == 401 ? new elp.a(elp.b.d) : new elp.a(var2);
         }
      }, ac.g());
   }

   public static record a(elp.b a, @Nullable eni b) {
      public a(elp.b $$0) {
         this($$0, null);
      }

      public a(eni $$0) {
         this(elp.b.e, $$0);
      }

      @Nullable
      public eya a(eya $$0) {
         return (eya)(switch (this.a) {
            case a -> null;
            case b -> new env($$0);
            case c -> new eof($$0);
            case d -> new eoa(tf.c("mco.error.invalid.session.title"), tf.c("mco.error.invalid.session.message"), $$0);
            case e -> new eoa(Objects.requireNonNull(this.b), $$0);
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
