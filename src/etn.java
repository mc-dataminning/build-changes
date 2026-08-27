import com.mojang.logging.LogUtils;
import java.util.Objects;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class etn {
   private static final Logger a = LogUtils.getLogger();
   @Nullable
   private static CompletableFuture<etn.a> b;

   public static CompletableFuture<etn.a> a() {
      if (b == null || a(b)) {
         b = b();
      }

      return b;
   }

   private static boolean a(CompletableFuture<etn.a> $$0) {
      etn.a $$1 = $$0.getNow(null);
      return $$1 != null && $$1.b() != null;
   }

   private static CompletableFuture<etn.a> b() {
      return CompletableFuture.supplyAsync(() -> {
         ett $$0 = ett.a();

         try {
            if ($$0.g() != ett.a.a) {
               return new etn.a(etn.b.b);
            } else {
               return !$$0.f() ? new etn.a(etn.b.c) : new etn.a(etn.b.a);
            }
         } catch (evg var2) {
            a.error("Couldn't connect to realms", var2);
            return var2.a.a() == 401 ? new etn.a(etn.b.d) : new etn.a(var2);
         }
      }, ac.g());
   }

   public static record a(etn.b a, @Nullable evg b) {
      public a(etn.b $$0) {
         this($$0, null);
      }

      public a(evg $$0) {
         this(etn.b.e, $$0);
      }

      @Nullable
      public fgh a(fgh $$0) {
         return (fgh)(switch (this.a) {
            case a -> null;
            case b -> new evs($$0);
            case c -> new ewd($$0);
            case d -> new evx(vs.c("mco.error.invalid.session.title"), vs.c("mco.error.invalid.session.message"), $$0);
            case e -> new evx(Objects.requireNonNull(this.b), $$0);
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
