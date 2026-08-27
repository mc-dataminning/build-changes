import com.mojang.logging.LogUtils;
import java.util.Objects;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class ezc {
   private static final Logger a = LogUtils.getLogger();
   @Nullable
   private static CompletableFuture<ezc.a> b;

   public static CompletableFuture<ezc.a> a() {
      if (b == null || a(b)) {
         b = b();
      }

      return b;
   }

   private static boolean a(CompletableFuture<ezc.a> $$0) {
      ezc.a $$1 = $$0.getNow(null);
      return $$1 != null && $$1.b() != null;
   }

   private static CompletableFuture<ezc.a> b() {
      feo $$0 = fdz.Q().X();
      return $$0.g() != feo.a.c ? CompletableFuture.completedFuture(new ezc.a(ezc.b.d)) : CompletableFuture.supplyAsync(() -> {
         ezi $$0x = ezi.a();

         try {
            if ($$0x.g() != ezi.a.a) {
               return new ezc.a(ezc.b.b);
            } else {
               return !$$0x.f() ? new ezc.a(ezc.b.c) : new ezc.a(ezc.b.a);
            }
         } catch (fav var2) {
            a.error("Couldn't connect to realms", var2);
            return var2.a.a() == 401 ? new ezc.a(ezc.b.d) : new ezc.a(var2);
         }
      }, ac.h());
   }

   public static record a(ezc.b a, @Nullable fav b) {
      public a(ezc.b $$0) {
         this($$0, null);
      }

      public a(fav $$0) {
         this(ezc.b.e, $$0);
      }

      @Nullable
      public fly a(fly $$0) {
         return (fly)(switch (this.a) {
            case a -> null;
            case b -> new fbh($$0);
            case c -> new fbs($$0);
            case d -> new fbm(wx.c("mco.error.invalid.session.title"), wx.c("mco.error.invalid.session.message"), $$0);
            case e -> new fbm(Objects.requireNonNull(this.b), $$0);
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
