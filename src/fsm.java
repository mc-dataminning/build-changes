import com.mojang.authlib.minecraft.BanDetails;
import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import java.net.URI;
import java.time.Duration;
import java.time.Instant;
import org.apache.commons.lang3.StringUtils;

public class fsm {
   private static final xk b = xk.c("gui.banned.title.temporary").a(n.r);
   private static final xk c = xk.c("gui.banned.title.permanent").a(n.r);
   public static final xk a = xk.c("gui.banned.name.title").a(n.r);
   private static final xk d = xk.c("gui.banned.skin.title").a(n.r);
   private static final xk e = xk.a("gui.banned.skin.description", xk.a(ayq.n));

   public static fso a(BooleanConsumer $$0, BanDetails $$1) {
      return new fso($$0, a($$1), b($$1), ayq.n, xj.m, true);
   }

   public static fso a(Runnable $$0) {
      URI $$1 = ayq.n;
      return new fso($$2 -> {
         if ($$2) {
            ae.m().a($$1);
         }

         $$0.run();
      }, d, e, $$1, xj.m, true);
   }

   public static fso a(String $$0, Runnable $$1) {
      URI $$2 = ayq.n;
      return new fso($$2x -> {
         if ($$2x) {
            ae.m().a($$2);
         }

         $$1.run();
      }, a, xk.a("gui.banned.name.description", xk.b($$0).a(n.o), xk.a(ayq.n)), $$2, xj.m, true);
   }

   private static xk a(BanDetails $$0) {
      return f($$0) ? b : c;
   }

   private static xk b(BanDetails $$0) {
      return xk.a("gui.banned.description", c($$0), d($$0), xk.a(ayq.n));
   }

   private static xk c(BanDetails $$0) {
      String $$1 = $$0.reason();
      String $$2 = $$0.reasonMessage();
      if (StringUtils.isNumeric($$1)) {
         int $$3 = Integer.parseInt($$1);
         ggg $$4 = ggg.a($$3);
         xk $$5;
         if ($$4 != null) {
            $$5 = xn.a($$4.a().f(), yh.a.a(true));
         } else if ($$2 != null) {
            $$5 = xk.a("gui.banned.description.reason_id_message", $$3, $$2).a(n.r);
         } else {
            $$5 = xk.a("gui.banned.description.reason_id", $$3).a(n.r);
         }

         return xk.a("gui.banned.description.reason", $$5);
      } else {
         return xk.c("gui.banned.description.unknownreason");
      }
   }

   private static xk d(BanDetails $$0) {
      if (f($$0)) {
         xk $$1 = e($$0);
         return xk.a("gui.banned.description.temporary", xk.a("gui.banned.description.temporary.duration", $$1).a(n.r));
      } else {
         return xk.c("gui.banned.description.permanent").a(n.r);
      }
   }

   private static xk e(BanDetails $$0) {
      Duration $$1 = Duration.between(Instant.now(), $$0.expires());
      long $$2 = $$1.toHours();
      if ($$2 > 72L) {
         return xj.a($$1.toDays());
      } else {
         return $$2 < 1L ? xj.c($$1.toMinutes()) : xj.b($$1.toHours());
      }
   }

   private static boolean f(BanDetails $$0) {
      return $$0.expires() != null;
   }
}
