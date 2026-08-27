import com.mojang.logging.LogUtils;
import java.util.Objects;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class elu {
   private static final Logger a = LogUtils.getLogger();
   @Nullable
   private static CompletableFuture<elu.a> b;

   public static CompletableFuture<elu.a> a() {
      if (b == null || a(b)) {
         b = b();
      }

      return b;
   }

   private static boolean a(CompletableFuture<elu.a> $$0) {
      elu.a $$1 = $$0.getNow(null);
      return $$1 != null && $$1.b() != null;
   }

   private static CompletableFuture<elu.a> b() {
      return CompletableFuture.supplyAsync(() -> {
         ema $$0 = ema.a();

         try {
            if ($$0.f() != ema.a.a) {
               return new elu.a(elu.b.b);
            } else {
               return !$$0.e() ? new elu.a(elu.b.c) : new elu.a(elu.b.a);
            }
         } catch (enn var2) {
            a.error("Couldn't connect to realms", var2);
            return var2.a.a() == 401 ? new elu.a(elu.b.d) : new elu.a(var2);
         }
      }, ac.g());
   }

   public static record a(elu.b a, @Nullable enn b) {
      public a(elu.b $$0) {
         this($$0, null);
      }

      public a(enn $$0) {
         this(elu.b.e, $$0);
      }

      @Nullable
      public eyf a(eyf $$0) {
         return (eyf)(switch (this.a) {
            case a -> null;
            case b -> new enz($$0);
            case c -> new eok($$0);
            case d -> new eoe(ti.c("mco.error.invalid.session.title"), ti.c("mco.error.invalid.session.message"), $$0);
            case e -> new eoe(Objects.requireNonNull(this.b), $$0);
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
