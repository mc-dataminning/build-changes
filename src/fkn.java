import com.mojang.logging.LogUtils;
import java.util.Objects;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fkn {
   private static final Logger a = LogUtils.getLogger();
   @Nullable
   private static CompletableFuture<fkn.a> b;

   public static CompletableFuture<fkn.a> a() {
      if (b == null || a(b)) {
         b = b();
      }

      return b;
   }

   private static boolean a(CompletableFuture<fkn.a> $$0) {
      fkn.a $$1 = $$0.getNow(null);
      return $$1 != null && $$1.b() != null;
   }

   private static CompletableFuture<fkn.a> b() {
      fqf $$0 = fpt.Q().X();
      return $$0.g() != fqf.a.c ? CompletableFuture.completedFuture(new fkn.a(fkn.b.d)) : CompletableFuture.supplyAsync(() -> {
         fkt $$0x = fkt.a();

         try {
            if ($$0x.g() != fkt.a.a) {
               return new fkn.a(fkn.b.b);
            } else {
               return !$$0x.f() ? new fkn.a(fkn.b.c) : new fkn.a(fkn.b.a);
            }
         } catch (fmp var2) {
            a.error("Couldn't connect to realms", var2);
            return var2.a.a() == 401 ? new fkn.a(fkn.b.d) : new fkn.a(var2);
         }
      }, ag.i());
   }

   public static record a(fkn.b a, @Nullable fmp b) {
      public a(fkn.b $$0) {
         this($$0, null);
      }

      public a(fmp $$0) {
         this(fkn.b.e, $$0);
      }

      @Nullable
      public fys a(fys $$0) {
         return (fys)(switch (this.a) {
            case a -> null;
            case b -> new fnc($$0);
            case c -> new fnm($$0);
            case d -> new fnh(wy.c("mco.error.invalid.session.title"), wy.c("mco.error.invalid.session.message"), $$0);
            case e -> new fnh(Objects.requireNonNull(this.b), $$0);
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
