import com.mojang.logging.LogUtils;
import java.util.Objects;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class elq {
   private static final Logger a = LogUtils.getLogger();
   @Nullable
   private static CompletableFuture<elq.a> b;

   public static CompletableFuture<elq.a> a() {
      if (b == null || a(b)) {
         b = b();
      }

      return b;
   }

   private static boolean a(CompletableFuture<elq.a> $$0) {
      elq.a $$1 = $$0.getNow(null);
      return $$1 != null && $$1.b() != null;
   }

   private static CompletableFuture<elq.a> b() {
      return CompletableFuture.supplyAsync(() -> {
         elw $$0 = elw.a();

         try {
            if ($$0.f() != elw.a.a) {
               return new elq.a(elq.b.b);
            } else {
               return !$$0.e() ? new elq.a(elq.b.c) : new elq.a(elq.b.a);
            }
         } catch (enj var2) {
            a.error("Couldn't connect to realms", var2);
            return var2.a.a() == 401 ? new elq.a(elq.b.d) : new elq.a(var2);
         }
      }, ac.g());
   }

   public static record a(elq.b a, @Nullable enj b) {
      public a(elq.b $$0) {
         this($$0, null);
      }

      public a(enj $$0) {
         this(elq.b.e, $$0);
      }

      @Nullable
      public exz a(exz $$0) {
         return (exz)(switch (this.a) {
            case a -> null;
            case b -> new enw($$0);
            case c -> new eog($$0);
            case d -> new eob(tf.c("mco.error.invalid.session.title"), tf.c("mco.error.invalid.session.message"), $$0);
            case e -> new eob(Objects.requireNonNull(this.b), $$0);
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
