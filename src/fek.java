import com.mojang.logging.LogUtils;
import java.text.DateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fek extends gwj {
   static final Logger a = LogUtils.getLogger();
   private static final wy b = wy.c("mco.configure.world.subscription.title");
   private static final wy c = wy.c("mco.configure.world.subscription.start");
   private static final wy A = wy.c("mco.configure.world.subscription.timeleft");
   private static final wy B = wy.c("mco.configure.world.subscription.recurring.daysleft");
   private static final wy C = wy.c("mco.configure.world.subscription.expired");
   private static final wy D = wy.c("mco.configure.world.subscription.less_than_a_day");
   private static final wy E = wy.c("mco.configure.world.subscription.unknown");
   private static final wy F = wy.c("mco.configure.world.subscription.recurring.info");
   private final fnx G;
   final fcj H;
   final fnx I;
   private wy J = E;
   private wy K = E;
   @Nullable
   private fcu.a L;

   public fek(fnx $$0, fcj $$1, fnx $$2) {
      super(fga.a);
      this.G = $$0;
      this.H = $$1;
      this.I = $$2;
   }

   @Override
   public void aP_() {
      this.a(this.H.a);
      this.c(fig.a(wy.c("mco.configure.world.subscription.extend"), $$0 -> fmu.a(this, axi.a(this.H.b, this.l.X().b()))).a(this.m / 2 - 100, g(6), 200, 20).a());
      if (this.H.j) {
         this.c(
            fig.a(wy.c("mco.configure.world.delete.button"), $$0 -> this.l.a(fed.b(this, wy.c("mco.configure.world.delete.question.line1"), $$0x -> this.D())))
               .a(this.m / 2 - 100, g(10), 200, 20)
               .a()
         );
      } else if (fbn.b() && this.H.s != null) {
         this.c(new fiq(this.m / 2 - 100, g(8), 200, 46, wy.a("mco.snapshot.subscription.info", this.H.s), this.o));
      } else {
         this.c(new fiq(this.m / 2 - 100, g(8), 200, 46, F, this.o));
      }

      this.c(fig.a(wx.k, $$0 -> this.d()).a(this.m / 2 - 100, g(12), 200, 20).a());
   }

   @Override
   public wy i() {
      return wx.b(b, c, this.K, A, this.J);
   }

   private void D() {
      (new Thread("Realms-delete-realm") {
         @Override
         public void run() {
            try {
               fbs $$0 = fbs.a();
               $$0.i(fek.this.H.a);
            } catch (fdd var2) {
               fek.a.error("Couldn't delete world", var2);
            }

            fek.this.l.execute(() -> fek.this.l.a(fek.this.I));
         }
      }).start();
      this.l.a(this);
   }

   private void a(long $$0) {
      fbs $$1 = fbs.a();

      try {
         fcu $$2 = $$1.h($$0);
         this.J = this.a($$2.b);
         this.K = b($$2.a);
         this.L = $$2.c;
      } catch (fdd var5) {
         a.error("Couldn't get subscription", var5);
         this.l.a(new fdv(var5, this.G));
      }
   }

   private static wy b(long $$0) {
      Calendar $$1 = new GregorianCalendar(TimeZone.getDefault());
      $$1.setTimeInMillis($$0);
      return wy.b(DateFormat.getDateTimeInstance().format($$1.getTime()));
   }

   @Override
   public void d() {
      this.l.a(this.G);
   }

   @Override
   public void a(fht $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      int $$4 = this.m / 2 - 100;
      $$0.a(this.o, b, this.m / 2, 17, -1);
      $$0.a(this.o, c, $$4, g(0), -6250336, false);
      $$0.a(this.o, this.K, $$4, g(1), -1, false);
      if (this.L == fcu.a.a) {
         $$0.a(this.o, A, $$4, g(3), -6250336, false);
      } else if (this.L == fcu.a.b) {
         $$0.a(this.o, B, $$4, g(3), -6250336, false);
      }

      $$0.a(this.o, this.J, $$4, g(4), -1, false);
   }

   private wy a(int $$0) {
      if ($$0 < 0 && this.H.j) {
         return C;
      } else if ($$0 <= 1) {
         return D;
      } else {
         int $$1 = $$0 / 30;
         int $$2 = $$0 % 30;
         boolean $$3 = $$1 > 0;
         boolean $$4 = $$2 > 0;
         if ($$3 && $$4) {
            return wy.a("mco.configure.world.subscription.remaining.months.days", $$1, $$2);
         } else if ($$3) {
            return wy.a("mco.configure.world.subscription.remaining.months", $$1);
         } else {
            return $$4 ? wy.a("mco.configure.world.subscription.remaining.days", $$2) : wy.i();
         }
      }
   }
}
