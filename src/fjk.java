import com.mojang.logging.LogUtils;
import java.text.DateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fjk extends hky {
   static final Logger a = LogUtils.getLogger();
   private static final wo b = wo.c("mco.configure.world.subscription.title");
   private static final wo c = wo.c("mco.configure.world.subscription.start");
   private static final wo C = wo.c("mco.configure.world.subscription.timeleft");
   private static final wo D = wo.c("mco.configure.world.subscription.recurring.daysleft");
   private static final wo E = wo.c("mco.configure.world.subscription.expired");
   private static final wo F = wo.c("mco.configure.world.subscription.less_than_a_day");
   private static final wo G = wo.c("mco.configure.world.subscription.unknown");
   private static final wo H = wo.c("mco.configure.world.subscription.recurring.info");
   private final fui I;
   final fhj J;
   final fui K;
   private wo L = G;
   private wo M = G;
   @Nullable
   private fhv.a N;

   public fjk(fui $$0, fhj $$1, fui $$2) {
      super(fky.a);
      this.I = $$0;
      this.J = $$1;
      this.K = $$2;
   }

   @Override
   public void aR_() {
      this.a(this.J.a);
      this.c(fop.a(wo.c("mco.configure.world.subscription.extend"), $$0 -> ftf.a(this, axu.a(this.J.b, this.m.X().b()))).a(this.n / 2 - 100, g(6), 200, 20).a());
      if (this.J.j) {
         this.c(
            fop.a(wo.c("mco.configure.world.delete.button"), $$0 -> this.m.a(fje.b(this, wo.c("mco.configure.world.delete.question.line1"), $$0x -> this.E())))
               .a(this.n / 2 - 100, g(10), 200, 20)
               .a()
         );
      } else if (fgd.b() && this.J.u != null) {
         this.c(new fpa(this.n / 2 - 100, g(8), 200, 46, wo.a("mco.snapshot.subscription.info", this.J.u), this.p));
      } else {
         this.c(new fpa(this.n / 2 - 100, g(8), 200, 46, H, this.p));
      }

      this.c(fop.a(wn.k, $$0 -> this.aO_()).a(this.n / 2 - 100, g(12), 200, 20).a());
   }

   @Override
   public wo i() {
      return wn.b(b, c, this.M, C, this.L);
   }

   private void E() {
      (new Thread("Realms-delete-realm") {
         @Override
         public void run() {
            try {
               fgi $$0 = fgi.a();
               $$0.j(fjk.this.J.a);
            } catch (fie var2) {
               fjk.a.error("Couldn't delete world", var2);
            }

            fjk.this.m.execute(() -> fjk.this.m.a(fjk.this.K));
         }
      }).start();
      this.m.a(this);
   }

   private void a(long $$0) {
      fgi $$1 = fgi.a();

      try {
         fhv $$2 = $$1.h($$0);
         this.L = this.a($$2.b);
         this.M = b($$2.a);
         this.N = $$2.c;
      } catch (fie var5) {
         a.error("Couldn't get subscription", var5);
         this.m.a(new fiw(var5, this.I));
      }
   }

   private static wo b(long $$0) {
      Calendar $$1 = new GregorianCalendar(TimeZone.getDefault());
      $$1.setTimeInMillis($$0);
      return wo.b(DateFormat.getDateTimeInstance().format($$1.getTime()));
   }

   @Override
   public void aO_() {
      this.m.a(this.I);
   }

   @Override
   public void a(fob $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      int $$4 = this.n / 2 - 100;
      $$0.a(this.p, b, this.n / 2, 17, -1);
      $$0.b(this.p, c, $$4, g(0), -6250336);
      $$0.b(this.p, this.M, $$4, g(1), -1);
      if (this.N == fhv.a.a) {
         $$0.b(this.p, C, $$4, g(3), -6250336);
      } else if (this.N == fhv.a.b) {
         $$0.b(this.p, D, $$4, g(3), -6250336);
      }

      $$0.b(this.p, this.L, $$4, g(4), -1);
   }

   private wo a(int $$0) {
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
            return wo.a("mco.configure.world.subscription.remaining.months.days", $$1, $$2);
         } else if ($$3) {
            return wo.a("mco.configure.world.subscription.remaining.months", $$1);
         } else {
            return $$4 ? wo.a("mco.configure.world.subscription.remaining.days", $$2) : wo.i();
         }
      }
   }
}
