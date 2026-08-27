import com.mojang.logging.LogUtils;
import java.util.Objects;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class eql {
   private static final Logger a = LogUtils.getLogger();
   @Nullable
   private static CompletableFuture<eql.a> b;

   public static CompletableFuture<eql.a> a() {
      if (b == null || a(b)) {
         b = b();
      }

      return b;
   }

   private static boolean a(CompletableFuture<eql.a> $$0) {
      eql.a $$1 = $$0.getNow(null);
      return $$1 != null && $$1.b() != null;
   }

   private static CompletableFuture<eql.a> b() {
      return CompletableFuture.supplyAsync(() -> {
         eqr $$0 = eqr.a();

         try {
            if ($$0.g() != eqr.a.a) {
               return new eql.a(eql.b.b);
            } else {
               return !$$0.f() ? new eql.a(eql.b.c) : new eql.a(eql.b.a);
            }
         } catch (ese var2) {
            a.error("Couldn't connect to realms", var2);
            return var2.a.a() == 401 ? new eql.a(eql.b.d) : new eql.a(var2);
         }
      }, ac.g());
   }

   public static record a(eql.b a, @Nullable ese b) {
      public a(eql.b $$0) {
         this($$0, null);
      }

      public a(ese $$0) {
         this(eql.b.e, $$0);
      }

      @Nullable
      public fdb a(fdb $$0) {
         return (fdb)(switch (this.a) {
            case a -> null;
            case b -> new esq($$0);
            case c -> new etb($$0);
            case d -> new esv(vf.c("mco.error.invalid.session.title"), vf.c("mco.error.invalid.session.message"), $$0);
            case e -> new esv(Objects.requireNonNull(this.b), $$0);
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
