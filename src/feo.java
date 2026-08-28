import com.mojang.logging.LogUtils;
import java.text.DateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class feo extends gwo {
   static final Logger a = LogUtils.getLogger();
   private static final wz b = wz.c("mco.configure.world.subscription.title");
   private static final wz c = wz.c("mco.configure.world.subscription.start");
   private static final wz B = wz.c("mco.configure.world.subscription.timeleft");
   private static final wz C = wz.c("mco.configure.world.subscription.recurring.daysleft");
   private static final wz D = wz.c("mco.configure.world.subscription.expired");
   private static final wz E = wz.c("mco.configure.world.subscription.less_than_a_day");
   private static final wz F = wz.c("mco.configure.world.subscription.unknown");
   private static final wz G = wz.c("mco.configure.world.subscription.recurring.info");
   private final fob H;
   final fcn I;
   final fob J;
   private wz K = F;
   private wz L = F;
   @Nullable
   private fcy.a M;

   public feo(fob $$0, fcn $$1, fob $$2) {
      super(fge.a);
      this.H = $$0;
      this.I = $$1;
      this.J = $$2;
   }

   @Override
   public void aT_() {
      this.a(this.I.a);
      this.c(fik.a(wz.c("mco.configure.world.subscription.extend"), $$0 -> fmy.a(this, axj.a(this.I.b, this.l.X().b()))).a(this.m / 2 - 100, g(6), 200, 20).a());
      if (this.I.j) {
         this.c(
            fik.a(wz.c("mco.configure.world.delete.button"), $$0 -> this.l.a(feh.b(this, wz.c("mco.configure.world.delete.question.line1"), $$0x -> this.C())))
               .a(this.m / 2 - 100, g(10), 200, 20)
               .a()
         );
      } else if (fbr.b() && this.I.s != null) {
         this.c(new fiu(this.m / 2 - 100, g(8), 200, 46, wz.a("mco.snapshot.subscription.info", this.I.s), this.o));
      } else {
         this.c(new fiu(this.m / 2 - 100, g(8), 200, 46, G, this.o));
      }

      this.c(fik.a(wy.k, $$0 -> this.d()).a(this.m / 2 - 100, g(12), 200, 20).a());
   }

   @Override
   public wz i() {
      return wy.b(b, c, this.L, B, this.K);
   }

   private void C() {
      (new Thread("Realms-delete-realm") {
         @Override
         public void run() {
            try {
               fbw $$0 = fbw.a();
               $$0.i(feo.this.I.a);
            } catch (fdh var2) {
               feo.a.error("Couldn't delete world", var2);
            }

            feo.this.l.execute(() -> feo.this.l.a(feo.this.J));
         }
      }).start();
      this.l.a(this);
   }

   private void a(long $$0) {
      fbw $$1 = fbw.a();

      try {
         fcy $$2 = $$1.h($$0);
         this.K = this.a($$2.b);
         this.L = b($$2.a);
         this.M = $$2.c;
      } catch (fdh var5) {
         a.error("Couldn't get subscription", var5);
         this.l.a(new fdz(var5, this.H));
      }
   }

   private static wz b(long $$0) {
      Calendar $$1 = new GregorianCalendar(TimeZone.getDefault());
      $$1.setTimeInMillis($$0);
      return wz.b(DateFormat.getDateTimeInstance().format($$1.getTime()));
   }

   @Override
   public void d() {
      this.l.a(this.H);
   }

   @Override
   public void a(fhx $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      int $$4 = this.m / 2 - 100;
      $$0.a(this.o, b, this.m / 2, 17, -1);
      $$0.a(this.o, c, $$4, g(0), -6250336, false);
      $$0.a(this.o, this.L, $$4, g(1), -1, false);
      if (this.M == fcy.a.a) {
         $$0.a(this.o, B, $$4, g(3), -6250336, false);
      } else if (this.M == fcy.a.b) {
         $$0.a(this.o, C, $$4, g(3), -6250336, false);
      }

      $$0.a(this.o, this.K, $$4, g(4), -1, false);
   }

   private wz a(int $$0) {
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
            return wz.a("mco.configure.world.subscription.remaining.months.days", $$1, $$2);
         } else if ($$3) {
            return wz.a("mco.configure.world.subscription.remaining.months", $$1);
         } else {
            return $$4 ? wz.a("mco.configure.world.subscription.remaining.days", $$2) : wz.i();
         }
      }
   }
}
