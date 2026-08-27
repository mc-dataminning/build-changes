import com.mojang.logging.LogUtils;
import java.util.Objects;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class eze {
   private static final Logger a = LogUtils.getLogger();
   @Nullable
   private static CompletableFuture<eze.a> b;

   public static CompletableFuture<eze.a> a() {
      if (b == null || a(b)) {
         b = b();
      }

      return b;
   }

   private static boolean a(CompletableFuture<eze.a> $$0) {
      eze.a $$1 = $$0.getNow(null);
      return $$1 != null && $$1.b() != null;
   }

   private static CompletableFuture<eze.a> b() {
      fep $$0 = feb.Q().X();
      return $$0.g() != fep.a.c ? CompletableFuture.completedFuture(new eze.a(eze.b.d)) : CompletableFuture.supplyAsync(() -> {
         ezk $$0x = ezk.a();

         try {
            if ($$0x.g() != ezk.a.a) {
               return new eze.a(eze.b.b);
            } else {
               return !$$0x.f() ? new eze.a(eze.b.c) : new eze.a(eze.b.a);
            }
         } catch (fax var2) {
            a.error("Couldn't connect to realms", var2);
            return var2.a.a() == 401 ? new eze.a(eze.b.d) : new eze.a(var2);
         }
      }, ac.h());
   }

   public static record a(eze.b a, @Nullable fax b) {
      public a(eze.b $$0) {
         this($$0, null);
      }

      public a(fax $$0) {
         this(eze.b.e, $$0);
      }

      @Nullable
      public flz a(flz $$0) {
         return (flz)(switch (this.a) {
            case a -> null;
            case b -> new fbj($$0);
            case c -> new fbu($$0);
            case d -> new fbo(wx.c("mco.error.invalid.session.title"), wx.c("mco.error.invalid.session.message"), $$0);
            case e -> new fbo(Objects.requireNonNull(this.b), $$0);
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
