import com.mojang.logging.LogUtils;
import java.text.DateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fhb extends hee {
   static final Logger a = LogUtils.getLogger();
   private static final xh b = xh.c("mco.configure.world.subscription.title");
   private static final xh c = xh.c("mco.configure.world.subscription.start");
   private static final xh B = xh.c("mco.configure.world.subscription.timeleft");
   private static final xh C = xh.c("mco.configure.world.subscription.recurring.daysleft");
   private static final xh D = xh.c("mco.configure.world.subscription.expired");
   private static final xh E = xh.c("mco.configure.world.subscription.less_than_a_day");
   private static final xh F = xh.c("mco.configure.world.subscription.unknown");
   private static final xh G = xh.c("mco.configure.world.subscription.recurring.info");
   private final fqs H;
   final ffa I;
   final fqs J;
   private xh K = F;
   private xh L = F;
   @Nullable
   private ffl.a M;

   public fhb(fqs $$0, ffa $$1, fqs $$2) {
      super(fir.a);
      this.H = $$0;
      this.I = $$1;
      this.J = $$2;
   }

   @Override
   public void aS_() {
      this.a(this.I.a);
      this.c(fkz.a(xh.c("mco.configure.world.subscription.extend"), $$0 -> fpp.a(this, ayf.a(this.I.b, this.m.X().b()))).a(this.n / 2 - 100, g(6), 200, 20).a());
      if (this.I.j) {
         this.c(
            fkz.a(xh.c("mco.configure.world.delete.button"), $$0 -> this.m.a(fgu.b(this, xh.c("mco.configure.world.delete.question.line1"), $$0x -> this.D())))
               .a(this.n / 2 - 100, g(10), 200, 20)
               .a()
         );
      } else if (fee.b() && this.I.s != null) {
         this.c(new flj(this.n / 2 - 100, g(8), 200, 46, xh.a("mco.snapshot.subscription.info", this.I.s), this.p));
      } else {
         this.c(new flj(this.n / 2 - 100, g(8), 200, 46, G, this.p));
      }

      this.c(fkz.a(xg.k, $$0 -> this.d()).a(this.n / 2 - 100, g(12), 200, 20).a());
   }

   @Override
   public xh i() {
      return xg.b(b, c, this.L, B, this.K);
   }

   private void D() {
      (new Thread("Realms-delete-realm") {
         @Override
         public void run() {
            try {
               fej $$0 = fej.a();
               $$0.i(fhb.this.I.a);
            } catch (ffu var2) {
               fhb.a.error("Couldn't delete world", var2);
            }

            fhb.this.m.execute(() -> fhb.this.m.a(fhb.this.J));
         }
      }).start();
      this.m.a(this);
   }

   private void a(long $$0) {
      fej $$1 = fej.a();

      try {
         ffl $$2 = $$1.h($$0);
         this.K = this.a($$2.b);
         this.L = b($$2.a);
         this.M = $$2.c;
      } catch (ffu var5) {
         a.error("Couldn't get subscription", var5);
         this.m.a(new fgm(var5, this.H));
      }
   }

   private static xh b(long $$0) {
      Calendar $$1 = new GregorianCalendar(TimeZone.getDefault());
      $$1.setTimeInMillis($$0);
      return xh.b(DateFormat.getDateTimeInstance().format($$1.getTime()));
   }

   @Override
   public void d() {
      this.m.a(this.H);
   }

   @Override
   public void a(fkm $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      int $$4 = this.n / 2 - 100;
      $$0.a(this.p, b, this.n / 2, 17, -1);
      $$0.a(this.p, c, $$4, g(0), -6250336, false);
      $$0.a(this.p, this.L, $$4, g(1), -1, false);
      if (this.M == ffl.a.a) {
         $$0.a(this.p, B, $$4, g(3), -6250336, false);
      } else if (this.M == ffl.a.b) {
         $$0.a(this.p, C, $$4, g(3), -6250336, false);
      }

      $$0.a(this.p, this.K, $$4, g(4), -1, false);
   }

   private xh a(int $$0) {
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
            return xh.a("mco.configure.world.subscription.remaining.months.days", $$1, $$2);
         } else if ($$3) {
            return xh.a("mco.configure.world.subscription.remaining.months", $$1);
         } else {
            return $$4 ? xh.a("mco.configure.world.subscription.remaining.days", $$2) : xh.i();
         }
      }
   }
}
