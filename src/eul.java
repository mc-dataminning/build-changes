import com.mojang.logging.LogUtils;
import java.util.Objects;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class eul {
   private static final Logger a = LogUtils.getLogger();
   @Nullable
   private static CompletableFuture<eul.a> b;

   public static CompletableFuture<eul.a> a() {
      if (b == null || a(b)) {
         b = b();
      }

      return b;
   }

   private static boolean a(CompletableFuture<eul.a> $$0) {
      eul.a $$1 = $$0.getNow(null);
      return $$1 != null && $$1.b() != null;
   }

   private static CompletableFuture<eul.a> b() {
      return CompletableFuture.supplyAsync(() -> {
         eur $$0 = eur.a();

         try {
            if ($$0.g() != eur.a.a) {
               return new eul.a(eul.b.b);
            } else {
               return !$$0.f() ? new eul.a(eul.b.c) : new eul.a(eul.b.a);
            }
         } catch (ewe var2) {
            a.error("Couldn't connect to realms", var2);
            return var2.a.a() == 401 ? new eul.a(eul.b.d) : new eul.a(var2);
         }
      }, ac.g());
   }

   public static record a(eul.b a, @Nullable ewe b) {
      public a(eul.b $$0) {
         this($$0, null);
      }

      public a(ewe $$0) {
         this(eul.b.e, $$0);
      }

      @Nullable
      public fhh a(fhh $$0) {
         return (fhh)(switch (this.a) {
            case a -> null;
            case b -> new ewq($$0);
            case c -> new exb($$0);
            case d -> new ewv(vu.c("mco.error.invalid.session.title"), vu.c("mco.error.invalid.session.message"), $$0);
            case e -> new ewv(Objects.requireNonNull(this.b), $$0);
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
