import com.mojang.logging.LogUtils;
import java.text.DateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fjn extends hlf {
   static final Logger a = LogUtils.getLogger();
   private static final wp b = wp.c("mco.configure.world.subscription.title");
   private static final wp c = wp.c("mco.configure.world.subscription.start");
   private static final wp C = wp.c("mco.configure.world.subscription.timeleft");
   private static final wp D = wp.c("mco.configure.world.subscription.recurring.daysleft");
   private static final wp E = wp.c("mco.configure.world.subscription.expired");
   private static final wp F = wp.c("mco.configure.world.subscription.less_than_a_day");
   private static final wp G = wp.c("mco.configure.world.subscription.unknown");
   private static final wp H = wp.c("mco.configure.world.subscription.recurring.info");
   private final fum I;
   final fhm J;
   final fum K;
   private wp L = G;
   private wp M = G;
   @Nullable
   private fhy.a N;

   public fjn(fum $$0, fhm $$1, fum $$2) {
      super(flb.a);
      this.I = $$0;
      this.J = $$1;
      this.K = $$2;
   }

   @Override
   public void aR_() {
      this.a(this.J.a);
      this.c(fou.a(wp.c("mco.configure.world.subscription.extend"), $$0 -> ftj.a(this, axv.a(this.J.b, this.m.X().b()))).a(this.n / 2 - 100, g(6), 200, 20).a());
      if (this.J.j) {
         this.c(
            fou.a(wp.c("mco.configure.world.delete.button"), $$0 -> this.m.a(fjh.b(this, wp.c("mco.configure.world.delete.question.line1"), $$0x -> this.E())))
               .a(this.n / 2 - 100, g(10), 200, 20)
               .a()
         );
      } else if (fgg.b() && this.J.u != null) {
         this.c(new fpe(this.n / 2 - 100, g(8), 200, 46, wp.a("mco.snapshot.subscription.info", this.J.u), this.p));
      } else {
         this.c(new fpe(this.n / 2 - 100, g(8), 200, 46, H, this.p));
      }

      this.c(fou.a(wo.k, $$0 -> this.aO_()).a(this.n / 2 - 100, g(12), 200, 20).a());
   }

   @Override
   public wp i() {
      return wo.b(b, c, this.M, C, this.L);
   }

   private void E() {
      (new Thread("Realms-delete-realm") {
         @Override
         public void run() {
            try {
               fgl $$0 = fgl.a();
               $$0.j(fjn.this.J.a);
            } catch (fih var2) {
               fjn.a.error("Couldn't delete world", var2);
            }

            fjn.this.m.execute(() -> fjn.this.m.a(fjn.this.K));
         }
      }).start();
      this.m.a(this);
   }

   private void a(long $$0) {
      fgl $$1 = fgl.a();

      try {
         fhy $$2 = $$1.h($$0);
         this.L = this.a($$2.b);
         this.M = b($$2.a);
         this.N = $$2.c;
      } catch (fih var5) {
         a.error("Couldn't get subscription", var5);
         this.m.a(new fiz(var5, this.I));
      }
   }

   private static wp b(long $$0) {
      Calendar $$1 = new GregorianCalendar(TimeZone.getDefault());
      $$1.setTimeInMillis($$0);
      return wp.b(DateFormat.getDateTimeInstance().format($$1.getTime()));
   }

   @Override
   public void aO_() {
      this.m.a(this.I);
   }

   @Override
   public void a(fof $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      int $$4 = this.n / 2 - 100;
      $$0.a(this.p, b, this.n / 2, 17, -1);
      $$0.b(this.p, c, $$4, g(0), -6250336);
      $$0.b(this.p, this.M, $$4, g(1), -1);
      if (this.N == fhy.a.a) {
         $$0.b(this.p, C, $$4, g(3), -6250336);
      } else if (this.N == fhy.a.b) {
         $$0.b(this.p, D, $$4, g(3), -6250336);
      }

      $$0.b(this.p, this.L, $$4, g(4), -1);
   }

   private wp a(int $$0) {
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
            return wp.a("mco.configure.world.subscription.remaining.months.days", $$1, $$2);
         } else if ($$3) {
            return wp.a("mco.configure.world.subscription.remaining.months", $$1);
         } else {
            return $$4 ? wp.a("mco.configure.world.subscription.remaining.days", $$2) : wp.i();
         }
      }
   }
}
