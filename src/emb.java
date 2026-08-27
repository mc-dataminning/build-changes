import com.mojang.logging.LogUtils;
import java.util.Objects;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class emb {
   private static final Logger a = LogUtils.getLogger();
   @Nullable
   private static CompletableFuture<emb.a> b;

   public static CompletableFuture<emb.a> a() {
      if (b == null || a(b)) {
         b = b();
      }

      return b;
   }

   private static boolean a(CompletableFuture<emb.a> $$0) {
      emb.a $$1 = $$0.getNow(null);
      return $$1 != null && $$1.b() != null;
   }

   private static CompletableFuture<emb.a> b() {
      return CompletableFuture.supplyAsync(() -> {
         emh $$0 = emh.a();

         try {
            if ($$0.f() != emh.a.a) {
               return new emb.a(emb.b.b);
            } else {
               return !$$0.e() ? new emb.a(emb.b.c) : new emb.a(emb.b.a);
            }
         } catch (enu var2) {
            a.error("Couldn't connect to realms", var2);
            return var2.a.a() == 401 ? new emb.a(emb.b.d) : new emb.a(var2);
         }
      }, ac.g());
   }

   public static record a(emb.b a, @Nullable enu b) {
      public a(emb.b $$0) {
         this($$0, null);
      }

      public a(enu $$0) {
         this(emb.b.e, $$0);
      }

      @Nullable
      public eym a(eym $$0) {
         return (eym)(switch (this.a) {
            case a -> null;
            case b -> new eog($$0);
            case c -> new eor($$0);
            case d -> new eol(tn.c("mco.error.invalid.session.title"), tn.c("mco.error.invalid.session.message"), $$0);
            case e -> new eol(Objects.requireNonNull(this.b), $$0);
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
