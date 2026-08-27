import com.mojang.logging.LogUtils;
import java.util.Objects;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class elt {
   private static final Logger a = LogUtils.getLogger();
   @Nullable
   private static CompletableFuture<elt.a> b;

   public static CompletableFuture<elt.a> a() {
      if (b == null || a(b)) {
         b = b();
      }

      return b;
   }

   private static boolean a(CompletableFuture<elt.a> $$0) {
      elt.a $$1 = $$0.getNow(null);
      return $$1 != null && $$1.b() != null;
   }

   private static CompletableFuture<elt.a> b() {
      return CompletableFuture.supplyAsync(() -> {
         elz $$0 = elz.a();

         try {
            if ($$0.f() != elz.a.a) {
               return new elt.a(elt.b.b);
            } else {
               return !$$0.e() ? new elt.a(elt.b.c) : new elt.a(elt.b.a);
            }
         } catch (enm var2) {
            a.error("Couldn't connect to realms", var2);
            return var2.a.a() == 401 ? new elt.a(elt.b.d) : new elt.a(var2);
         }
      }, ac.g());
   }

   public static record a(elt.b a, @Nullable enm b) {
      public a(elt.b $$0) {
         this($$0, null);
      }

      public a(enm $$0) {
         this(elt.b.e, $$0);
      }

      @Nullable
      public eye a(eye $$0) {
         return (eye)(switch (this.a) {
            case a -> null;
            case b -> new eny($$0);
            case c -> new eoj($$0);
            case d -> new eod(tl.c("mco.error.invalid.session.title"), tl.c("mco.error.invalid.session.message"), $$0);
            case e -> new eod(Objects.requireNonNull(this.b), $$0);
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
