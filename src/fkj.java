import com.mojang.logging.LogUtils;
import java.text.DateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fkj extends hhv {
   static final Logger a = LogUtils.getLogger();
   private static final xv b = xv.c("mco.configure.world.subscription.title");
   private static final xv c = xv.c("mco.configure.world.subscription.start");
   private static final xv C = xv.c("mco.configure.world.subscription.timeleft");
   private static final xv D = xv.c("mco.configure.world.subscription.recurring.daysleft");
   private static final xv E = xv.c("mco.configure.world.subscription.expired");
   private static final xv F = xv.c("mco.configure.world.subscription.less_than_a_day");
   private static final xv G = xv.c("mco.configure.world.subscription.unknown");
   private static final xv H = xv.c("mco.configure.world.subscription.recurring.info");
   private final ftx I;
   final fii J;
   final ftx K;
   private xv L = G;
   private xv M = G;
   @Nullable
   private fiu.a N;

   public fkj(ftx $$0, fii $$1, ftx $$2) {
      super(flw.a);
      this.I = $$0;
      this.J = $$1;
      this.K = $$2;
   }

   @Override
   public void aT_() {
      this.a(this.J.a);
      this.c(foe.a(xv.c("mco.configure.world.subscription.extend"), $$0 -> fsu.a(this, aza.a(this.J.b, this.m.X().b()))).a(this.n / 2 - 100, g(6), 200, 20).a());
      if (this.J.j) {
         this.c(
            foe.a(xv.c("mco.configure.world.delete.button"), $$0 -> this.m.a(fkd.b(this, xv.c("mco.configure.world.delete.question.line1"), $$0x -> this.E())))
               .a(this.n / 2 - 100, g(10), 200, 20)
               .a()
         );
      } else if (fhc.b() && this.J.u != null) {
         this.c(new foo(this.n / 2 - 100, g(8), 200, 46, xv.a("mco.snapshot.subscription.info", this.J.u), this.p));
      } else {
         this.c(new foo(this.n / 2 - 100, g(8), 200, 46, H, this.p));
      }

      this.c(foe.a(xu.k, $$0 -> this.aP_()).a(this.n / 2 - 100, g(12), 200, 20).a());
   }

   @Override
   public xv i() {
      return xu.b(b, c, this.M, C, this.L);
   }

   private void E() {
      (new Thread("Realms-delete-realm") {
         @Override
         public void run() {
            try {
               fhh $$0 = fhh.a();
               $$0.j(fkj.this.J.a);
            } catch (fjd var2) {
               fkj.a.error("Couldn't delete world", var2);
            }

            fkj.this.m.execute(() -> fkj.this.m.a(fkj.this.K));
         }
      }).start();
      this.m.a(this);
   }

   private void a(long $$0) {
      fhh $$1 = fhh.a();

      try {
         fiu $$2 = $$1.h($$0);
         this.L = this.a($$2.b);
         this.M = b($$2.a);
         this.N = $$2.c;
      } catch (fjd var5) {
         a.error("Couldn't get subscription", var5);
         this.m.a(new fjv(var5, this.I));
      }
   }

   private static xv b(long $$0) {
      Calendar $$1 = new GregorianCalendar(TimeZone.getDefault());
      $$1.setTimeInMillis($$0);
      return xv.b(DateFormat.getDateTimeInstance().format($$1.getTime()));
   }

   @Override
   public void aP_() {
      this.m.a(this.I);
   }

   @Override
   public void a(fnr $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      int $$4 = this.n / 2 - 100;
      $$0.a(this.p, b, this.n / 2, 17, -1);
      $$0.a(this.p, c, $$4, g(0), -6250336, false);
      $$0.a(this.p, this.M, $$4, g(1), -1, false);
      if (this.N == fiu.a.a) {
         $$0.a(this.p, C, $$4, g(3), -6250336, false);
      } else if (this.N == fiu.a.b) {
         $$0.a(this.p, D, $$4, g(3), -6250336, false);
      }

      $$0.a(this.p, this.L, $$4, g(4), -1, false);
   }

   private xv a(int $$0) {
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
            return xv.a("mco.configure.world.subscription.remaining.months.days", $$1, $$2);
         } else if ($$3) {
            return xv.a("mco.configure.world.subscription.remaining.months", $$1);
         } else {
            return $$4 ? xv.a("mco.configure.world.subscription.remaining.days", $$2) : xv.i();
         }
      }
   }
}
