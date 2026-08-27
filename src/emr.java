import com.mojang.logging.LogUtils;
import java.util.Objects;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class emr {
   private static final Logger a = LogUtils.getLogger();
   @Nullable
   private static CompletableFuture<emr.a> b;

   public static CompletableFuture<emr.a> a() {
      if (b == null || a(b)) {
         b = b();
      }

      return b;
   }

   private static boolean a(CompletableFuture<emr.a> $$0) {
      emr.a $$1 = $$0.getNow(null);
      return $$1 != null && $$1.b() != null;
   }

   private static CompletableFuture<emr.a> b() {
      return CompletableFuture.supplyAsync(() -> {
         emx $$0 = emx.a();

         try {
            if ($$0.g() != emx.a.a) {
               return new emr.a(emr.b.b);
            } else {
               return !$$0.f() ? new emr.a(emr.b.c) : new emr.a(emr.b.a);
            }
         } catch (eok var2) {
            a.error("Couldn't connect to realms", var2);
            return var2.a.a() == 401 ? new emr.a(emr.b.d) : new emr.a(var2);
         }
      }, ac.g());
   }

   public static record a(emr.b a, @Nullable eok b) {
      public a(emr.b $$0) {
         this($$0, null);
      }

      public a(eok $$0) {
         this(emr.b.e, $$0);
      }

      @Nullable
      public ezd a(ezd $$0) {
         return (ezd)(switch (this.a) {
            case a -> null;
            case b -> new eow($$0);
            case c -> new eph($$0);
            case d -> new epb(ui.c("mco.error.invalid.session.title"), ui.c("mco.error.invalid.session.message"), $$0);
            case e -> new epb(Objects.requireNonNull(this.b), $$0);
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
