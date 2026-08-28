import com.mojang.logging.LogUtils;
import java.text.DateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fii extends hfq {
   static final Logger a = LogUtils.getLogger();
   private static final xj b = xj.c("mco.configure.world.subscription.title");
   private static final xj c = xj.c("mco.configure.world.subscription.start");
   private static final xj B = xj.c("mco.configure.world.subscription.timeleft");
   private static final xj C = xj.c("mco.configure.world.subscription.recurring.daysleft");
   private static final xj D = xj.c("mco.configure.world.subscription.expired");
   private static final xj E = xj.c("mco.configure.world.subscription.less_than_a_day");
   private static final xj F = xj.c("mco.configure.world.subscription.unknown");
   private static final xj G = xj.c("mco.configure.world.subscription.recurring.info");
   private final frw H;
   final fgi I;
   final frw J;
   private xj K = F;
   private xj L = F;
   @Nullable
   private fgt.a M;

   public fii(frw $$0, fgi $$1, frw $$2) {
      super(fjv.a);
      this.H = $$0;
      this.I = $$1;
      this.J = $$2;
   }

   @Override
   public void aR_() {
      this.a(this.I.a);
      this.c(fmd.a(xj.c("mco.configure.world.subscription.extend"), $$0 -> fqt.a(this, ayi.a(this.I.b, this.m.X().b()))).a(this.n / 2 - 100, g(6), 200, 20).a());
      if (this.I.j) {
         this.c(
            fmd.a(xj.c("mco.configure.world.delete.button"), $$0 -> this.m.a(fic.b(this, xj.c("mco.configure.world.delete.question.line1"), $$0x -> this.F())))
               .a(this.n / 2 - 100, g(10), 200, 20)
               .a()
         );
      } else if (ffc.b() && this.I.s != null) {
         this.c(new fmn(this.n / 2 - 100, g(8), 200, 46, xj.a("mco.snapshot.subscription.info", this.I.s), this.p));
      } else {
         this.c(new fmn(this.n / 2 - 100, g(8), 200, 46, G, this.p));
      }

      this.c(fmd.a(xi.k, $$0 -> this.aO_()).a(this.n / 2 - 100, g(12), 200, 20).a());
   }

   @Override
   public xj i() {
      return xi.b(b, c, this.L, B, this.K);
   }

   private void F() {
      (new Thread("Realms-delete-realm") {
         @Override
         public void run() {
            try {
               ffh $$0 = ffh.a();
               $$0.j(fii.this.I.a);
            } catch (fhc var2) {
               fii.a.error("Couldn't delete world", var2);
            }

            fii.this.m.execute(() -> fii.this.m.a(fii.this.J));
         }
      }).start();
      this.m.a(this);
   }

   private void a(long $$0) {
      ffh $$1 = ffh.a();

      try {
         fgt $$2 = $$1.h($$0);
         this.K = this.a($$2.b);
         this.L = b($$2.a);
         this.M = $$2.c;
      } catch (fhc var5) {
         a.error("Couldn't get subscription", var5);
         this.m.a(new fhu(var5, this.H));
      }
   }

   private static xj b(long $$0) {
      Calendar $$1 = new GregorianCalendar(TimeZone.getDefault());
      $$1.setTimeInMillis($$0);
      return xj.b(DateFormat.getDateTimeInstance().format($$1.getTime()));
   }

   @Override
   public void aO_() {
      this.m.a(this.H);
   }

   @Override
   public void a(flq $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      int $$4 = this.n / 2 - 100;
      $$0.a(this.p, b, this.n / 2, 17, -1);
      $$0.a(this.p, c, $$4, g(0), -6250336, false);
      $$0.a(this.p, this.L, $$4, g(1), -1, false);
      if (this.M == fgt.a.a) {
         $$0.a(this.p, B, $$4, g(3), -6250336, false);
      } else if (this.M == fgt.a.b) {
         $$0.a(this.p, C, $$4, g(3), -6250336, false);
      }

      $$0.a(this.p, this.K, $$4, g(4), -1, false);
   }

   private xj a(int $$0) {
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
            return xj.a("mco.configure.world.subscription.remaining.months.days", $$1, $$2);
         } else if ($$3) {
            return xj.a("mco.configure.world.subscription.remaining.months", $$1);
         } else {
            return $$4 ? xj.a("mco.configure.world.subscription.remaining.days", $$2) : xj.i();
         }
      }
   }
}
