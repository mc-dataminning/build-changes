import com.mojang.logging.LogUtils;
import java.text.DateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fmu extends hpb {
   static final Logger a = LogUtils.getLogger();
   private static final wy b = wy.c("mco.configure.world.subscription.title");
   private static final wy c = wy.c("mco.configure.world.subscription.start");
   private static final wy C = wy.c("mco.configure.world.subscription.timeleft");
   private static final wy D = wy.c("mco.configure.world.subscription.recurring.daysleft");
   private static final wy E = wy.c("mco.configure.world.subscription.expired");
   private static final wy F = wy.c("mco.configure.world.subscription.less_than_a_day");
   private static final wy G = wy.c("mco.configure.world.subscription.unknown");
   private static final wy H = wy.c("mco.configure.world.subscription.recurring.info");
   private final fxu I;
   final fkt J;
   final fxu K;
   private wy L = G;
   private wy M = G;
   @Nullable
   private flf.a N;

   public fmu(fxu $$0, fkt $$1, fxu $$2) {
      super(foi.a);
      this.I = $$0;
      this.J = $$1;
      this.K = $$2;
   }

   @Override
   public void aN_() {
      this.a(this.J.a);
      this.c(fsc.a(wy.c("mco.configure.world.subscription.extend"), $$0 -> fwr.a(this, ayh.a(this.J.b, this.m.X().b()))).a(this.n / 2 - 100, g(6), 200, 20).a());
      if (this.J.j) {
         this.c(
            fsc.a(wy.c("mco.configure.world.delete.button"), $$0 -> this.m.a(fmo.b(this, wy.c("mco.configure.world.delete.question.line1"), $$0x -> this.E())))
               .a(this.n / 2 - 100, g(10), 200, 20)
               .a()
         );
      } else if (fjn.b() && this.J.u != null) {
         this.c(new fsm(this.n / 2 - 100, g(8), 200, 46, wy.a("mco.snapshot.subscription.info", this.J.u), this.p));
      } else {
         this.c(new fsm(this.n / 2 - 100, g(8), 200, 46, H, this.p));
      }

      this.c(fsc.a(wx.k, $$0 -> this.aK_()).a(this.n / 2 - 100, g(12), 200, 20).a());
   }

   @Override
   public wy i() {
      return wx.b(b, c, this.M, C, this.L);
   }

   private void E() {
      (new Thread("Realms-delete-realm") {
         @Override
         public void run() {
            try {
               fjs $$0 = fjs.a();
               $$0.j(fmu.this.J.a);
            } catch (flo var2) {
               fmu.a.error("Couldn't delete world", var2);
            }

            fmu.this.m.execute(() -> fmu.this.m.a(fmu.this.K));
         }
      }).start();
      this.m.a(this);
   }

   private void a(long $$0) {
      fjs $$1 = fjs.a();

      try {
         flf $$2 = $$1.h($$0);
         this.L = this.a($$2.b);
         this.M = b($$2.a);
         this.N = $$2.c;
      } catch (flo var5) {
         a.error("Couldn't get subscription", var5);
         this.m.a(new fmg(var5, this.I));
      }
   }

   private static wy b(long $$0) {
      Calendar $$1 = new GregorianCalendar(TimeZone.getDefault());
      $$1.setTimeInMillis($$0);
      return wy.b(DateFormat.getDateTimeInstance().format($$1.getTime()));
   }

   @Override
   public void aK_() {
      this.m.a(this.I);
   }

   @Override
   public void a(fro $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      int $$4 = this.n / 2 - 100;
      $$0.a(this.p, b, this.n / 2, 17, -1);
      $$0.b(this.p, c, $$4, g(0), -6250336);
      $$0.b(this.p, this.M, $$4, g(1), -1);
      if (this.N == flf.a.a) {
         $$0.b(this.p, C, $$4, g(3), -6250336);
      } else if (this.N == flf.a.b) {
         $$0.b(this.p, D, $$4, g(3), -6250336);
      }

      $$0.b(this.p, this.L, $$4, g(4), -1);
   }

   private wy a(int $$0) {
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
            return wy.a("mco.configure.world.subscription.remaining.months.days", $$1, $$2);
         } else if ($$3) {
            return wy.a("mco.configure.world.subscription.remaining.months", $$1);
         } else {
            return $$4 ? wy.a("mco.configure.world.subscription.remaining.days", $$2) : wy.i();
         }
      }
   }
}
