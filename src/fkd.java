import com.mojang.logging.LogUtils;
import java.text.DateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fkd extends hhs {
   static final Logger a = LogUtils.getLogger();
   private static final xk b = xk.c("mco.configure.world.subscription.title");
   private static final xk c = xk.c("mco.configure.world.subscription.start");
   private static final xk C = xk.c("mco.configure.world.subscription.timeleft");
   private static final xk D = xk.c("mco.configure.world.subscription.recurring.daysleft");
   private static final xk E = xk.c("mco.configure.world.subscription.expired");
   private static final xk F = xk.c("mco.configure.world.subscription.less_than_a_day");
   private static final xk G = xk.c("mco.configure.world.subscription.unknown");
   private static final xk H = xk.c("mco.configure.world.subscription.recurring.info");
   private final ftr I;
   final fic J;
   final ftr K;
   private xk L = G;
   private xk M = G;
   @Nullable
   private fio.a N;

   public fkd(ftr $$0, fic $$1, ftr $$2) {
      super(flq.a);
      this.I = $$0;
      this.J = $$1;
      this.K = $$2;
   }

   @Override
   public void aT_() {
      this.a(this.J.a);
      this.c(fny.a(xk.c("mco.configure.world.subscription.extend"), $$0 -> fso.a(this, ayq.a(this.J.b, this.m.X().b()))).a(this.n / 2 - 100, g(6), 200, 20).a());
      if (this.J.j) {
         this.c(
            fny.a(xk.c("mco.configure.world.delete.button"), $$0 -> this.m.a(fjx.b(this, xk.c("mco.configure.world.delete.question.line1"), $$0x -> this.E())))
               .a(this.n / 2 - 100, g(10), 200, 20)
               .a()
         );
      } else if (fgw.b() && this.J.u != null) {
         this.c(new foi(this.n / 2 - 100, g(8), 200, 46, xk.a("mco.snapshot.subscription.info", this.J.u), this.p));
      } else {
         this.c(new foi(this.n / 2 - 100, g(8), 200, 46, H, this.p));
      }

      this.c(fny.a(xj.k, $$0 -> this.aP_()).a(this.n / 2 - 100, g(12), 200, 20).a());
   }

   @Override
   public xk i() {
      return xj.b(b, c, this.M, C, this.L);
   }

   private void E() {
      (new Thread("Realms-delete-realm") {
         @Override
         public void run() {
            try {
               fhb $$0 = fhb.a();
               $$0.j(fkd.this.J.a);
            } catch (fix var2) {
               fkd.a.error("Couldn't delete world", var2);
            }

            fkd.this.m.execute(() -> fkd.this.m.a(fkd.this.K));
         }
      }).start();
      this.m.a(this);
   }

   private void a(long $$0) {
      fhb $$1 = fhb.a();

      try {
         fio $$2 = $$1.h($$0);
         this.L = this.a($$2.b);
         this.M = b($$2.a);
         this.N = $$2.c;
      } catch (fix var5) {
         a.error("Couldn't get subscription", var5);
         this.m.a(new fjp(var5, this.I));
      }
   }

   private static xk b(long $$0) {
      Calendar $$1 = new GregorianCalendar(TimeZone.getDefault());
      $$1.setTimeInMillis($$0);
      return xk.b(DateFormat.getDateTimeInstance().format($$1.getTime()));
   }

   @Override
   public void aP_() {
      this.m.a(this.I);
   }

   @Override
   public void a(fnl $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      int $$4 = this.n / 2 - 100;
      $$0.a(this.p, b, this.n / 2, 17, -1);
      $$0.b(this.p, c, $$4, g(0), -6250336);
      $$0.b(this.p, this.M, $$4, g(1), -1);
      if (this.N == fio.a.a) {
         $$0.b(this.p, C, $$4, g(3), -6250336);
      } else if (this.N == fio.a.b) {
         $$0.b(this.p, D, $$4, g(3), -6250336);
      }

      $$0.b(this.p, this.L, $$4, g(4), -1);
   }

   private xk a(int $$0) {
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
            return xk.a("mco.configure.world.subscription.remaining.months.days", $$1, $$2);
         } else if ($$3) {
            return xk.a("mco.configure.world.subscription.remaining.months", $$1);
         } else {
            return $$4 ? xk.a("mco.configure.world.subscription.remaining.days", $$2) : xk.i();
         }
      }
   }
}
