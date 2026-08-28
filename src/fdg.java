import com.mojang.logging.LogUtils;
import java.text.DateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fdg extends gve {
   static final Logger a = LogUtils.getLogger();
   private static final xo b = xo.c("mco.configure.world.subscription.title");
   private static final xo c = xo.c("mco.configure.world.subscription.start");
   private static final xo B = xo.c("mco.configure.world.subscription.timeleft");
   private static final xo C = xo.c("mco.configure.world.subscription.recurring.daysleft");
   private static final xo D = xo.c("mco.configure.world.subscription.expired");
   private static final xo E = xo.c("mco.configure.world.subscription.less_than_a_day");
   private static final xo F = xo.c("mco.configure.world.subscription.unknown");
   private static final xo G = xo.c("mco.configure.world.subscription.recurring.info");
   private final fnb H;
   final fbd I;
   final fnb J;
   private xo K = F;
   private xo L = F;
   @Nullable
   private fbq.a M;

   public fdg(fnb $$0, fbd $$1, fnb $$2) {
      super(fev.a);
      this.H = $$0;
      this.I = $$1;
      this.J = $$2;
   }

   @Override
   public void aM_() {
      this.a(this.I.a);
      this.c(fhc.a(xo.c("mco.configure.world.subscription.extend"), $$0 -> fls.a(this, axt.a(this.I.b, this.m.X().b()))).a(this.n / 2 - 100, g(6), 200, 20).a());
      if (this.I.j) {
         this.c(fhc.a(xo.c("mco.configure.world.delete.button"), $$0 -> {
            xo $$1 = xo.c("mco.configure.world.delete.question.line1");
            xo $$2 = xo.c("mco.configure.world.delete.question.line2");
            this.m.a(new fcs(this::c, fcs.a.a, $$1, $$2, true));
         }).a(this.n / 2 - 100, g(10), 200, 20).a());
      } else if (fah.b() && this.I.s != null) {
         this.c(new fhm(this.n / 2 - 100, g(8), 200, 46, xo.a("mco.snapshot.subscription.info", this.I.s), this.p).a(-6250336));
      } else {
         this.c(new fhm(this.n / 2 - 100, g(8), 200, 46, G, this.p).a(-6250336));
      }

      this.c(fhc.a(xn.k, $$0 -> this.d()).a(this.n / 2 - 100, g(12), 200, 20).a());
   }

   @Override
   public xo i() {
      return xn.b(b, c, this.L, B, this.K);
   }

   private void c(boolean $$0) {
      if ($$0) {
         (new Thread("Realms-delete-realm") {
            @Override
            public void run() {
               try {
                  fam $$0 = fam.a();
                  $$0.i(fdg.this.I.a);
               } catch (fbz var2) {
                  fdg.a.error("Couldn't delete world", var2);
               }

               fdg.this.m.execute(() -> fdg.this.m.a(fdg.this.J));
            }
         }).start();
      }

      this.m.a(this);
   }

   private void a(long $$0) {
      fam $$1 = fam.a();

      try {
         fbq $$2 = $$1.h($$0);
         this.K = this.a($$2.b);
         this.L = b($$2.a);
         this.M = $$2.c;
      } catch (fbz var5) {
         a.error("Couldn't get subscription", var5);
         this.m.a(new fcq(var5, this.H));
      }
   }

   private static xo b(long $$0) {
      Calendar $$1 = new GregorianCalendar(TimeZone.getDefault());
      $$1.setTimeInMillis($$0);
      return xo.b(DateFormat.getDateTimeInstance().format($$1.getTime()));
   }

   @Override
   public void d() {
      this.m.a(this.H);
   }

   @Override
   public void a(fgp $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      int $$4 = this.n / 2 - 100;
      $$0.a(this.p, b, this.n / 2, 17, -1);
      $$0.a(this.p, c, $$4, g(0), -6250336, false);
      $$0.a(this.p, this.L, $$4, g(1), -1, false);
      if (this.M == fbq.a.a) {
         $$0.a(this.p, B, $$4, g(3), -6250336, false);
      } else if (this.M == fbq.a.b) {
         $$0.a(this.p, C, $$4, g(3), -6250336, false);
      }

      $$0.a(this.p, this.K, $$4, g(4), -1, false);
   }

   private xo a(int $$0) {
      if ($$0 < 0 && this.I.j) {
         return D;
      } else if ($$0 <= 1) {
         return E;
      } else {
         int $$1 = $$0 / 30;
         int $$2 = $$0 % 30;
         boolean $$3 = $$1 > 0;
         boolean $$4 = $$2 > 0;
         if ($$3 && $$4) {
            return xo.a("mco.configure.world.subscription.remaining.months.days", $$1, $$2);
         } else if ($$3) {
            return xo.a("mco.configure.world.subscription.remaining.months", $$1);
         } else {
            return $$4 ? xo.a("mco.configure.world.subscription.remaining.days", $$2) : xo.i();
         }
      }
   }
}
