import com.mojang.logging.LogUtils;
import java.text.DateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fib extends hff {
   static final Logger a = LogUtils.getLogger();
   private static final xl b = xl.c("mco.configure.world.subscription.title");
   private static final xl c = xl.c("mco.configure.world.subscription.start");
   private static final xl B = xl.c("mco.configure.world.subscription.timeleft");
   private static final xl C = xl.c("mco.configure.world.subscription.recurring.daysleft");
   private static final xl D = xl.c("mco.configure.world.subscription.expired");
   private static final xl E = xl.c("mco.configure.world.subscription.less_than_a_day");
   private static final xl F = xl.c("mco.configure.world.subscription.unknown");
   private static final xl G = xl.c("mco.configure.world.subscription.recurring.info");
   private final frp H;
   final fgb I;
   final frp J;
   private xl K = F;
   private xl L = F;
   @Nullable
   private fgm.a M;

   public fib(frp $$0, fgb $$1, frp $$2) {
      super(fjo.a);
      this.H = $$0;
      this.I = $$1;
      this.J = $$2;
   }

   @Override
   public void aS_() {
      this.a(this.I.a);
      this.c(flw.a(xl.c("mco.configure.world.subscription.extend"), $$0 -> fqm.a(this, ayj.a(this.I.b, this.m.X().b()))).a(this.n / 2 - 100, g(6), 200, 20).a());
      if (this.I.j) {
         this.c(
            flw.a(xl.c("mco.configure.world.delete.button"), $$0 -> this.m.a(fhv.b(this, xl.c("mco.configure.world.delete.question.line1"), $$0x -> this.D())))
               .a(this.n / 2 - 100, g(10), 200, 20)
               .a()
         );
      } else if (fev.b() && this.I.s != null) {
         this.c(new fmg(this.n / 2 - 100, g(8), 200, 46, xl.a("mco.snapshot.subscription.info", this.I.s), this.p));
      } else {
         this.c(new fmg(this.n / 2 - 100, g(8), 200, 46, G, this.p));
      }

      this.c(flw.a(xk.k, $$0 -> this.aP_()).a(this.n / 2 - 100, g(12), 200, 20).a());
   }

   @Override
   public xl i() {
      return xk.b(b, c, this.L, B, this.K);
   }

   private void D() {
      (new Thread("Realms-delete-realm") {
         @Override
         public void run() {
            try {
               ffa $$0 = ffa.a();
               $$0.j(fib.this.I.a);
            } catch (fgv var2) {
               fib.a.error("Couldn't delete world", var2);
            }

            fib.this.m.execute(() -> fib.this.m.a(fib.this.J));
         }
      }).start();
      this.m.a(this);
   }

   private void a(long $$0) {
      ffa $$1 = ffa.a();

      try {
         fgm $$2 = $$1.h($$0);
         this.K = this.a($$2.b);
         this.L = b($$2.a);
         this.M = $$2.c;
      } catch (fgv var5) {
         a.error("Couldn't get subscription", var5);
         this.m.a(new fhn(var5, this.H));
      }
   }

   private static xl b(long $$0) {
      Calendar $$1 = new GregorianCalendar(TimeZone.getDefault());
      $$1.setTimeInMillis($$0);
      return xl.b(DateFormat.getDateTimeInstance().format($$1.getTime()));
   }

   @Override
   public void aP_() {
      this.m.a(this.H);
   }

   @Override
   public void a(flj $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      int $$4 = this.n / 2 - 100;
      $$0.a(this.p, b, this.n / 2, 17, -1);
      $$0.a(this.p, c, $$4, g(0), -6250336, false);
      $$0.a(this.p, this.L, $$4, g(1), -1, false);
      if (this.M == fgm.a.a) {
         $$0.a(this.p, B, $$4, g(3), -6250336, false);
      } else if (this.M == fgm.a.b) {
         $$0.a(this.p, C, $$4, g(3), -6250336, false);
      }

      $$0.a(this.p, this.K, $$4, g(4), -1, false);
   }

   private xl a(int $$0) {
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
            return xl.a("mco.configure.world.subscription.remaining.months.days", $$1, $$2);
         } else if ($$3) {
            return xl.a("mco.configure.world.subscription.remaining.months", $$1);
         } else {
            return $$4 ? xl.a("mco.configure.world.subscription.remaining.days", $$2) : xl.i();
         }
      }
   }
}
