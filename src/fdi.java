import com.mojang.logging.LogUtils;
import java.text.DateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fdi extends gvg {
   static final Logger a = LogUtils.getLogger();
   private static final xp b = xp.c("mco.configure.world.subscription.title");
   private static final xp c = xp.c("mco.configure.world.subscription.start");
   private static final xp B = xp.c("mco.configure.world.subscription.timeleft");
   private static final xp C = xp.c("mco.configure.world.subscription.recurring.daysleft");
   private static final xp D = xp.c("mco.configure.world.subscription.expired");
   private static final xp E = xp.c("mco.configure.world.subscription.less_than_a_day");
   private static final xp F = xp.c("mco.configure.world.subscription.unknown");
   private static final xp G = xp.c("mco.configure.world.subscription.recurring.info");
   private final fnd H;
   final fbf I;
   final fnd J;
   private xp K = F;
   private xp L = F;
   @Nullable
   private fbs.a M;

   public fdi(fnd $$0, fbf $$1, fnd $$2) {
      super(fex.a);
      this.H = $$0;
      this.I = $$1;
      this.J = $$2;
   }

   @Override
   public void aM_() {
      this.a(this.I.a);
      this.c(fhe.a(xp.c("mco.configure.world.subscription.extend"), $$0 -> flu.a(this, axu.a(this.I.b, this.m.X().b()))).a(this.n / 2 - 100, g(6), 200, 20).a());
      if (this.I.j) {
         this.c(fhe.a(xp.c("mco.configure.world.delete.button"), $$0 -> {
            xp $$1 = xp.c("mco.configure.world.delete.question.line1");
            xp $$2 = xp.c("mco.configure.world.delete.question.line2");
            this.m.a(new fcu(this::c, fcu.a.a, $$1, $$2, true));
         }).a(this.n / 2 - 100, g(10), 200, 20).a());
      } else if (faj.b() && this.I.s != null) {
         this.c(new fho(this.n / 2 - 100, g(8), 200, 46, xp.a("mco.snapshot.subscription.info", this.I.s), this.p).a(-6250336));
      } else {
         this.c(new fho(this.n / 2 - 100, g(8), 200, 46, G, this.p).a(-6250336));
      }

      this.c(fhe.a(xo.k, $$0 -> this.d()).a(this.n / 2 - 100, g(12), 200, 20).a());
   }

   @Override
   public xp i() {
      return xo.b(b, c, this.L, B, this.K);
   }

   private void c(boolean $$0) {
      if ($$0) {
         (new Thread("Realms-delete-realm") {
            @Override
            public void run() {
               try {
                  fao $$0 = fao.a();
                  $$0.i(fdi.this.I.a);
               } catch (fcb var2) {
                  fdi.a.error("Couldn't delete world", var2);
               }

               fdi.this.m.execute(() -> fdi.this.m.a(fdi.this.J));
            }
         }).start();
      }

      this.m.a(this);
   }

   private void a(long $$0) {
      fao $$1 = fao.a();

      try {
         fbs $$2 = $$1.h($$0);
         this.K = this.a($$2.b);
         this.L = b($$2.a);
         this.M = $$2.c;
      } catch (fcb var5) {
         a.error("Couldn't get subscription", var5);
         this.m.a(new fcs(var5, this.H));
      }
   }

   private static xp b(long $$0) {
      Calendar $$1 = new GregorianCalendar(TimeZone.getDefault());
      $$1.setTimeInMillis($$0);
      return xp.b(DateFormat.getDateTimeInstance().format($$1.getTime()));
   }

   @Override
   public void d() {
      this.m.a(this.H);
   }

   @Override
   public void a(fgr $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      int $$4 = this.n / 2 - 100;
      $$0.a(this.p, b, this.n / 2, 17, -1);
      $$0.a(this.p, c, $$4, g(0), -6250336, false);
      $$0.a(this.p, this.L, $$4, g(1), -1, false);
      if (this.M == fbs.a.a) {
         $$0.a(this.p, B, $$4, g(3), -6250336, false);
      } else if (this.M == fbs.a.b) {
         $$0.a(this.p, C, $$4, g(3), -6250336, false);
      }

      $$0.a(this.p, this.K, $$4, g(4), -1, false);
   }

   private xp a(int $$0) {
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
            return xp.a("mco.configure.world.subscription.remaining.months.days", $$1, $$2);
         } else if ($$3) {
            return xp.a("mco.configure.world.subscription.remaining.months", $$1);
         } else {
            return $$4 ? xp.a("mco.configure.world.subscription.remaining.days", $$2) : xp.i();
         }
      }
   }
}
