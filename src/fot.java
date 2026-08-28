import com.mojang.logging.LogUtils;
import java.text.DateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fot extends hrc {
   static final Logger a = LogUtils.getLogger();
   private static final xg b = xg.c("mco.configure.world.subscription.title");
   private static final xg c = xg.c("mco.configure.world.subscription.start");
   private static final xg C = xg.c("mco.configure.world.subscription.timeleft");
   private static final xg D = xg.c("mco.configure.world.subscription.recurring.daysleft");
   private static final xg E = xg.c("mco.configure.world.subscription.expired");
   private static final xg F = xg.c("mco.configure.world.subscription.less_than_a_day");
   private static final xg G = xg.c("mco.configure.world.subscription.unknown");
   private static final xg H = xg.c("mco.configure.world.subscription.recurring.info");
   private final fzq I;
   final fmr J;
   final fzq K;
   private xg L = G;
   private xg M = G;
   @Nullable
   private fnd.a N;

   public fot(fzq $$0, fmr $$1, fzq $$2) {
      super(fqh.a);
      this.I = $$0;
      this.J = $$1;
      this.K = $$2;
   }

   @Override
   public void aT_() {
      this.a(this.J.a);
      this.c(fty.a(xg.c("mco.configure.world.subscription.extend"), $$0 -> fyn.a(this, ayt.a(this.J.b, this.m.X().b()))).a(this.n / 2 - 100, g(6), 200, 20).a());
      if (this.J.j) {
         this.c(
            fty.a(xg.c("mco.configure.world.delete.button"), $$0 -> this.m.a(fom.b(this, xg.c("mco.configure.world.delete.question.line1"), $$0x -> this.E())))
               .a(this.n / 2 - 100, g(10), 200, 20)
               .a()
         );
      } else if (fll.b() && this.J.u != null) {
         this.c(new fui(this.n / 2 - 100, g(8), 200, 46, xg.a("mco.snapshot.subscription.info", this.J.u), this.p));
      } else {
         this.c(new fui(this.n / 2 - 100, g(8), 200, 46, H, this.p));
      }

      this.c(fty.a(xf.k, $$0 -> this.aQ_()).a(this.n / 2 - 100, g(12), 200, 20).a());
   }

   @Override
   public xg i() {
      return xf.b(b, c, this.M, C, this.L);
   }

   private void E() {
      (new Thread("Realms-delete-realm") {
         @Override
         public void run() {
            try {
               flq $$0 = flq.a();
               $$0.j(fot.this.J.a);
            } catch (fnm var2) {
               fot.a.error("Couldn't delete world", var2);
            }

            fot.this.m.execute(() -> fot.this.m.a(fot.this.K));
         }
      }).start();
      this.m.a(this);
   }

   private void a(long $$0) {
      flq $$1 = flq.a();

      try {
         fnd $$2 = $$1.h($$0);
         this.L = this.a($$2.b);
         this.M = b($$2.a);
         this.N = $$2.c;
      } catch (fnm var5) {
         a.error("Couldn't get subscription", var5);
         this.m.a(new foe(var5, this.I));
      }
   }

   private static xg b(long $$0) {
      Calendar $$1 = new GregorianCalendar(TimeZone.getDefault());
      $$1.setTimeInMillis($$0);
      return xg.b(DateFormat.getDateTimeInstance().format($$1.getTime()));
   }

   @Override
   public void aQ_() {
      this.m.a(this.I);
   }

   @Override
   public void a(ftk $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      int $$4 = this.n / 2 - 100;
      $$0.a(this.p, b, this.n / 2, 17, -1);
      $$0.b(this.p, c, $$4, g(0), -6250336);
      $$0.b(this.p, this.M, $$4, g(1), -1);
      if (this.N == fnd.a.a) {
         $$0.b(this.p, C, $$4, g(3), -6250336);
      } else if (this.N == fnd.a.b) {
         $$0.b(this.p, D, $$4, g(3), -6250336);
      }

      $$0.b(this.p, this.L, $$4, g(4), -1);
   }

   private xg a(int $$0) {
      if ($$0 < 0 && this.J.j) {
         return E;
      } else if ($$0 <= 1) {
         return F;
      } else {
         int $$1 = $$0 / 30;
         int $$2 = $$0 % 30;
         boolean $$3 = $$1 > 0;
         boolean $$4 = $$2 > 0;
         if ($$3 && $$4) {
            return xg.a("mco.configure.world.subscription.remaining.months.days", $$1, $$2);
         } else if ($$3) {
            return xg.a("mco.configure.world.subscription.remaining.months", $$1);
         } else {
            return $$4 ? xg.a("mco.configure.world.subscription.remaining.days", $$2) : xg.i();
         }
      }
   }
}
