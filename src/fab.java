import com.mojang.logging.LogUtils;
import java.text.DateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fab extends gru {
   static final Logger a = LogUtils.getLogger();
   private static final wi b = wi.c("mco.configure.world.subscription.title");
   private static final wi c = wi.c("mco.configure.world.subscription.start");
   private static final wi y = wi.c("mco.configure.world.subscription.timeleft");
   private static final wi z = wi.c("mco.configure.world.subscription.recurring.daysleft");
   private static final wi A = wi.c("mco.configure.world.subscription.expired");
   private static final wi B = wi.c("mco.configure.world.subscription.less_than_a_day");
   private static final wi C = wi.c("mco.configure.world.subscription.unknown");
   private static final wi D = wi.c("mco.configure.world.subscription.recurring.info");
   private final fjx E;
   final exy F;
   final fjx G;
   private wi H = C;
   private wi I = C;
   @Nullable
   private eyl.a J;

   public fab(fjx $$0, exy $$1, fjx $$2) {
      super(fbq.a);
      this.E = $$0;
      this.F = $$1;
      this.G = $$2;
   }

   @Override
   public void aM_() {
      this.a(this.F.a);
      this.c(fdy.a(wi.c("mco.configure.world.subscription.extend"), $$0 -> fio.a(this, awi.a(this.F.b, this.j.X().b()))).a(this.k / 2 - 100, g(6), 200, 20).a());
      if (this.F.j) {
         this.c(fdy.a(wi.c("mco.configure.world.delete.button"), $$0 -> {
            wi $$1 = wi.c("mco.configure.world.delete.question.line1");
            wi $$2 = wi.c("mco.configure.world.delete.question.line2");
            this.j.a(new ezn(this::c, ezn.a.a, $$1, $$2, true));
         }).a(this.k / 2 - 100, g(10), 200, 20).a());
      } else if (exc.b() && this.F.s != null) {
         this.c(new fei(this.k / 2 - 100, g(8), 200, 46, wi.a("mco.snapshot.subscription.info", this.F.s), this.m).a(-6250336));
      } else {
         this.c(new fei(this.k / 2 - 100, g(8), 200, 46, D, this.m).a(-6250336));
      }

      this.c(fdy.a(wh.k, $$0 -> this.d()).a(this.k / 2 - 100, g(12), 200, 20).a());
   }

   @Override
   public wi i() {
      return wh.b(b, c, this.I, y, this.H);
   }

   private void c(boolean $$0) {
      if ($$0) {
         (new Thread("Realms-delete-realm") {
            @Override
            public void run() {
               try {
                  exh $$0 = exh.a();
                  $$0.i(fab.this.F.a);
               } catch (eyu var2) {
                  fab.a.error("Couldn't delete world", var2);
               }

               fab.this.j.execute(() -> fab.this.j.a(fab.this.G));
            }
         }).start();
      }

      this.j.a(this);
   }

   private void a(long $$0) {
      exh $$1 = exh.a();

      try {
         eyl $$2 = $$1.h($$0);
         this.H = this.a($$2.b);
         this.I = b($$2.a);
         this.J = $$2.c;
      } catch (eyu var5) {
         a.error("Couldn't get subscription", var5);
         this.j.a(new ezl(var5, this.E));
      }
   }

   private static wi b(long $$0) {
      Calendar $$1 = new GregorianCalendar(TimeZone.getDefault());
      $$1.setTimeInMillis($$0);
      return wi.b(DateFormat.getDateTimeInstance().format($$1.getTime()));
   }

   @Override
   public void d() {
      this.j.a(this.E);
   }

   @Override
   public void a(fdl $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      int $$4 = this.k / 2 - 100;
      $$0.a(this.m, b, this.k / 2, 17, -1);
      $$0.a(this.m, c, $$4, g(0), -6250336, false);
      $$0.a(this.m, this.I, $$4, g(1), -1, false);
      if (this.J == eyl.a.a) {
         $$0.a(this.m, y, $$4, g(3), -6250336, false);
      } else if (this.J == eyl.a.b) {
         $$0.a(this.m, z, $$4, g(3), -6250336, false);
      }

      $$0.a(this.m, this.H, $$4, g(4), -1, false);
   }

   private wi a(int $$0) {
      if ($$0 < 0 && this.F.j) {
         return A;
      } else if ($$0 <= 1) {
         return B;
      } else {
         int $$1 = $$0 / 30;
         int $$2 = $$0 % 30;
         boolean $$3 = $$1 > 0;
         boolean $$4 = $$2 > 0;
         if ($$3 && $$4) {
            return wi.a("mco.configure.world.subscription.remaining.months.days", $$1, $$2);
         } else if ($$3) {
            return wi.a("mco.configure.world.subscription.remaining.months", $$1);
         } else {
            return $$4 ? wi.a("mco.configure.world.subscription.remaining.days", $$2) : wi.i();
         }
      }
   }
}
