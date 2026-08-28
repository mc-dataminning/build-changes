import com.mojang.logging.LogUtils;
import java.text.DateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fpi extends hro {
   static final Logger a = LogUtils.getLogger();
   private static final xc b = xc.c("mco.configure.world.subscription.title");
   private static final xc c = xc.c("mco.configure.world.subscription.start");
   private static final xc C = xc.c("mco.configure.world.subscription.timeleft");
   private static final xc D = xc.c("mco.configure.world.subscription.recurring.daysleft");
   private static final xc E = xc.c("mco.configure.world.subscription.expired");
   private static final xc F = xc.c("mco.configure.world.subscription.less_than_a_day");
   private static final xc G = xc.c("mco.configure.world.subscription.unknown");
   private static final xc H = xc.c("mco.configure.world.subscription.recurring.info");
   private final gaf I;
   final fng J;
   final gaf K;
   private xc L = G;
   private xc M = G;
   @Nullable
   private fns.a N;

   public fpi(gaf $$0, fng $$1, gaf $$2) {
      super(fqw.a);
      this.I = $$0;
      this.J = $$1;
      this.K = $$2;
   }

   @Override
   public void aS_() {
      this.a(this.J.a);
      this.c(fun.a(xc.c("mco.configure.world.subscription.extend"), $$0 -> fzc.a(this, ayl.a(this.J.b, this.m.X().b()))).a(this.n / 2 - 100, g(6), 200, 20).a());
      if (this.J.j) {
         this.c(
            fun.a(xc.c("mco.configure.world.delete.button"), $$0 -> this.m.a(fpc.b(this, xc.c("mco.configure.world.delete.question.line1"), $$0x -> this.E())))
               .a(this.n / 2 - 100, g(10), 200, 20)
               .a()
         );
      } else if (fma.b() && this.J.u != null) {
         this.c(new fux(this.n / 2 - 100, g(8), 200, 46, xc.a("mco.snapshot.subscription.info", this.J.u), this.p));
      } else {
         this.c(new fux(this.n / 2 - 100, g(8), 200, 46, H, this.p));
      }

      this.c(fun.a(xb.k, $$0 -> this.aP_()).a(this.n / 2 - 100, g(12), 200, 20).a());
   }

   @Override
   public xc i() {
      return xb.b(b, c, this.M, C, this.L);
   }

   private void E() {
      (new Thread("Realms-delete-realm") {
         @Override
         public void run() {
            try {
               fmf $$0 = fmf.a();
               $$0.j(fpi.this.J.a);
            } catch (fob var2) {
               fpi.a.error("Couldn't delete world", var2);
            }

            fpi.this.m.execute(() -> fpi.this.m.a(fpi.this.K));
         }
      }).start();
      this.m.a(this);
   }

   private void a(long $$0) {
      fmf $$1 = fmf.a();

      try {
         fns $$2 = $$1.h($$0);
         this.L = this.a($$2.b);
         this.M = b($$2.a);
         this.N = $$2.c;
      } catch (fob var5) {
         a.error("Couldn't get subscription", var5);
         this.m.a(new fou(var5, this.I));
      }
   }

   private static xc b(long $$0) {
      Calendar $$1 = new GregorianCalendar(TimeZone.getDefault());
      $$1.setTimeInMillis($$0);
      return xc.b(DateFormat.getDateTimeInstance().format($$1.getTime()));
   }

   @Override
   public void aP_() {
      this.m.a(this.I);
   }

   @Override
   public void a(ftz $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      int $$4 = this.n / 2 - 100;
      $$0.a(this.p, b, this.n / 2, 17, -1);
      $$0.b(this.p, c, $$4, g(0), -6250336);
      $$0.b(this.p, this.M, $$4, g(1), -1);
      if (this.N == fns.a.a) {
         $$0.b(this.p, C, $$4, g(3), -6250336);
      } else if (this.N == fns.a.b) {
         $$0.b(this.p, D, $$4, g(3), -6250336);
      }

      $$0.b(this.p, this.L, $$4, g(4), -1);
   }

   private xc a(int $$0) {
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
            return xc.a("mco.configure.world.subscription.remaining.months.days", $$1, $$2);
         } else if ($$3) {
            return xc.a("mco.configure.world.subscription.remaining.months", $$1);
         } else {
            return $$4 ? xc.a("mco.configure.world.subscription.remaining.days", $$2) : xc.i();
         }
      }
   }
}
