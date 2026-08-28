import com.mojang.logging.LogUtils;
import java.text.DateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fgm extends hdk {
   static final Logger a = LogUtils.getLogger();
   private static final xd b = xd.c("mco.configure.world.subscription.title");
   private static final xd c = xd.c("mco.configure.world.subscription.start");
   private static final xd B = xd.c("mco.configure.world.subscription.timeleft");
   private static final xd C = xd.c("mco.configure.world.subscription.recurring.daysleft");
   private static final xd D = xd.c("mco.configure.world.subscription.expired");
   private static final xd E = xd.c("mco.configure.world.subscription.less_than_a_day");
   private static final xd F = xd.c("mco.configure.world.subscription.unknown");
   private static final xd G = xd.c("mco.configure.world.subscription.recurring.info");
   private final fqd H;
   final fel I;
   final fqd J;
   private xd K = F;
   private xd L = F;
   @Nullable
   private few.a M;

   public fgm(fqd $$0, fel $$1, fqd $$2) {
      super(fic.a);
      this.H = $$0;
      this.I = $$1;
      this.J = $$2;
   }

   @Override
   public void aR_() {
      this.a(this.I.a);
      this.c(fkk.a(xd.c("mco.configure.world.subscription.extend"), $$0 -> fpa.a(this, axz.a(this.I.b, this.m.X().b()))).a(this.n / 2 - 100, g(6), 200, 20).a());
      if (this.I.j) {
         this.c(
            fkk.a(xd.c("mco.configure.world.delete.button"), $$0 -> this.m.a(fgf.b(this, xd.c("mco.configure.world.delete.question.line1"), $$0x -> this.D())))
               .a(this.n / 2 - 100, g(10), 200, 20)
               .a()
         );
      } else if (fdp.b() && this.I.s != null) {
         this.c(new fku(this.n / 2 - 100, g(8), 200, 46, xd.a("mco.snapshot.subscription.info", this.I.s), this.p));
      } else {
         this.c(new fku(this.n / 2 - 100, g(8), 200, 46, G, this.p));
      }

      this.c(fkk.a(xc.k, $$0 -> this.d()).a(this.n / 2 - 100, g(12), 200, 20).a());
   }

   @Override
   public xd i() {
      return xc.b(b, c, this.L, B, this.K);
   }

   private void D() {
      (new Thread("Realms-delete-realm") {
         @Override
         public void run() {
            try {
               fdu $$0 = fdu.a();
               $$0.i(fgm.this.I.a);
            } catch (fff var2) {
               fgm.a.error("Couldn't delete world", var2);
            }

            fgm.this.m.execute(() -> fgm.this.m.a(fgm.this.J));
         }
      }).start();
      this.m.a(this);
   }

   private void a(long $$0) {
      fdu $$1 = fdu.a();

      try {
         few $$2 = $$1.h($$0);
         this.K = this.a($$2.b);
         this.L = b($$2.a);
         this.M = $$2.c;
      } catch (fff var5) {
         a.error("Couldn't get subscription", var5);
         this.m.a(new ffx(var5, this.H));
      }
   }

   private static xd b(long $$0) {
      Calendar $$1 = new GregorianCalendar(TimeZone.getDefault());
      $$1.setTimeInMillis($$0);
      return xd.b(DateFormat.getDateTimeInstance().format($$1.getTime()));
   }

   @Override
   public void d() {
      this.m.a(this.H);
   }

   @Override
   public void a(fjx $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      int $$4 = this.n / 2 - 100;
      $$0.a(this.p, b, this.n / 2, 17, -1);
      $$0.a(this.p, c, $$4, g(0), -6250336, false);
      $$0.a(this.p, this.L, $$4, g(1), -1, false);
      if (this.M == few.a.a) {
         $$0.a(this.p, B, $$4, g(3), -6250336, false);
      } else if (this.M == few.a.b) {
         $$0.a(this.p, C, $$4, g(3), -6250336, false);
      }

      $$0.a(this.p, this.K, $$4, g(4), -1, false);
   }

   private xd a(int $$0) {
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
            return xd.a("mco.configure.world.subscription.remaining.months.days", $$1, $$2);
         } else if ($$3) {
            return xd.a("mco.configure.world.subscription.remaining.months", $$1);
         } else {
            return $$4 ? xd.a("mco.configure.world.subscription.remaining.days", $$2) : xd.i();
         }
      }
   }
}
