import com.mojang.logging.LogUtils;
import java.util.Objects;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class elz {
   private static final Logger a = LogUtils.getLogger();
   @Nullable
   private static CompletableFuture<elz.a> b;

   public static CompletableFuture<elz.a> a() {
      if (b == null || a(b)) {
         b = b();
      }

      return b;
   }

   private static boolean a(CompletableFuture<elz.a> $$0) {
      elz.a $$1 = $$0.getNow(null);
      return $$1 != null && $$1.b() != null;
   }

   private static CompletableFuture<elz.a> b() {
      return CompletableFuture.supplyAsync(() -> {
         emf $$0 = emf.a();

         try {
            if ($$0.f() != emf.a.a) {
               return new elz.a(elz.b.b);
            } else {
               return !$$0.e() ? new elz.a(elz.b.c) : new elz.a(elz.b.a);
            }
         } catch (ens var2) {
            a.error("Couldn't connect to realms", var2);
            return var2.a.a() == 401 ? new elz.a(elz.b.d) : new elz.a(var2);
         }
      }, ac.g());
   }

   public static record a(elz.b a, @Nullable ens b) {
      public a(elz.b $$0) {
         this($$0, null);
      }

      public a(ens $$0) {
         this(elz.b.e, $$0);
      }

      @Nullable
      public eyk a(eyk $$0) {
         return (eyk)(switch (this.a) {
            case a -> null;
            case b -> new eoe($$0);
            case c -> new eop($$0);
            case d -> new eoj(tl.c("mco.error.invalid.session.title"), tl.c("mco.error.invalid.session.message"), $$0);
            case e -> new eoj(Objects.requireNonNull(this.b), $$0);
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
