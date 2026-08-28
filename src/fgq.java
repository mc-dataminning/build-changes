import com.mojang.logging.LogUtils;
import java.text.DateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fgq extends hdp {
   static final Logger a = LogUtils.getLogger();
   private static final xe b = xe.c("mco.configure.world.subscription.title");
   private static final xe c = xe.c("mco.configure.world.subscription.start");
   private static final xe B = xe.c("mco.configure.world.subscription.timeleft");
   private static final xe C = xe.c("mco.configure.world.subscription.recurring.daysleft");
   private static final xe D = xe.c("mco.configure.world.subscription.expired");
   private static final xe E = xe.c("mco.configure.world.subscription.less_than_a_day");
   private static final xe F = xe.c("mco.configure.world.subscription.unknown");
   private static final xe G = xe.c("mco.configure.world.subscription.recurring.info");
   private final fqh H;
   final fep I;
   final fqh J;
   private xe K = F;
   private xe L = F;
   @Nullable
   private ffa.a M;

   public fgq(fqh $$0, fep $$1, fqh $$2) {
      super(fig.a);
      this.H = $$0;
      this.I = $$1;
      this.J = $$2;
   }

   @Override
   public void aS_() {
      this.a(this.I.a);
      this.c(fko.a(xe.c("mco.configure.world.subscription.extend"), $$0 -> fpe.a(this, ayb.a(this.I.b, this.m.X().b()))).a(this.n / 2 - 100, g(6), 200, 20).a());
      if (this.I.j) {
         this.c(
            fko.a(xe.c("mco.configure.world.delete.button"), $$0 -> this.m.a(fgj.b(this, xe.c("mco.configure.world.delete.question.line1"), $$0x -> this.D())))
               .a(this.n / 2 - 100, g(10), 200, 20)
               .a()
         );
      } else if (fdt.b() && this.I.s != null) {
         this.c(new fky(this.n / 2 - 100, g(8), 200, 46, xe.a("mco.snapshot.subscription.info", this.I.s), this.p));
      } else {
         this.c(new fky(this.n / 2 - 100, g(8), 200, 46, G, this.p));
      }

      this.c(fko.a(xd.k, $$0 -> this.d()).a(this.n / 2 - 100, g(12), 200, 20).a());
   }

   @Override
   public xe i() {
      return xd.b(b, c, this.L, B, this.K);
   }

   private void D() {
      (new Thread("Realms-delete-realm") {
         @Override
         public void run() {
            try {
               fdy $$0 = fdy.a();
               $$0.i(fgq.this.I.a);
            } catch (ffj var2) {
               fgq.a.error("Couldn't delete world", var2);
            }

            fgq.this.m.execute(() -> fgq.this.m.a(fgq.this.J));
         }
      }).start();
      this.m.a(this);
   }

   private void a(long $$0) {
      fdy $$1 = fdy.a();

      try {
         ffa $$2 = $$1.h($$0);
         this.K = this.a($$2.b);
         this.L = b($$2.a);
         this.M = $$2.c;
      } catch (ffj var5) {
         a.error("Couldn't get subscription", var5);
         this.m.a(new fgb(var5, this.H));
      }
   }

   private static xe b(long $$0) {
      Calendar $$1 = new GregorianCalendar(TimeZone.getDefault());
      $$1.setTimeInMillis($$0);
      return xe.b(DateFormat.getDateTimeInstance().format($$1.getTime()));
   }

   @Override
   public void d() {
      this.m.a(this.H);
   }

   @Override
   public void a(fkb $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      int $$4 = this.n / 2 - 100;
      $$0.a(this.p, b, this.n / 2, 17, -1);
      $$0.a(this.p, c, $$4, g(0), -6250336, false);
      $$0.a(this.p, this.L, $$4, g(1), -1, false);
      if (this.M == ffa.a.a) {
         $$0.a(this.p, B, $$4, g(3), -6250336, false);
      } else if (this.M == ffa.a.b) {
         $$0.a(this.p, C, $$4, g(3), -6250336, false);
      }

      $$0.a(this.p, this.K, $$4, g(4), -1, false);
   }

   private xe a(int $$0) {
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
            return xe.a("mco.configure.world.subscription.remaining.months.days", $$1, $$2);
         } else if ($$3) {
            return xe.a("mco.configure.world.subscription.remaining.months", $$1);
         } else {
            return $$4 ? xe.a("mco.configure.world.subscription.remaining.days", $$2) : xe.i();
         }
      }
   }
}
