import com.mojang.logging.LogUtils;
import java.text.DateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class flg extends hne {
   static final Logger a = LogUtils.getLogger();
   private static final wv b = wv.c("mco.configure.world.subscription.title");
   private static final wv c = wv.c("mco.configure.world.subscription.start");
   private static final wv C = wv.c("mco.configure.world.subscription.timeleft");
   private static final wv D = wv.c("mco.configure.world.subscription.recurring.daysleft");
   private static final wv E = wv.c("mco.configure.world.subscription.expired");
   private static final wv F = wv.c("mco.configure.world.subscription.less_than_a_day");
   private static final wv G = wv.c("mco.configure.world.subscription.unknown");
   private static final wv H = wv.c("mco.configure.world.subscription.recurring.info");
   private final fwf I;
   final fjf J;
   final fwf K;
   private wv L = G;
   private wv M = G;
   @Nullable
   private fjr.a N;

   public flg(fwf $$0, fjf $$1, fwf $$2) {
      super(fmu.a);
      this.I = $$0;
      this.J = $$1;
      this.K = $$2;
   }

   @Override
   public void aN_() {
      this.a(this.J.a);
      this.c(fqn.a(wv.c("mco.configure.world.subscription.extend"), $$0 -> fvc.a(this, ayf.a(this.J.b, this.m.X().b()))).a(this.n / 2 - 100, g(6), 200, 20).a());
      if (this.J.j) {
         this.c(
            fqn.a(wv.c("mco.configure.world.delete.button"), $$0 -> this.m.a(fla.b(this, wv.c("mco.configure.world.delete.question.line1"), $$0x -> this.E())))
               .a(this.n / 2 - 100, g(10), 200, 20)
               .a()
         );
      } else if (fhz.b() && this.J.u != null) {
         this.c(new fqx(this.n / 2 - 100, g(8), 200, 46, wv.a("mco.snapshot.subscription.info", this.J.u), this.p));
      } else {
         this.c(new fqx(this.n / 2 - 100, g(8), 200, 46, H, this.p));
      }

      this.c(fqn.a(wu.k, $$0 -> this.aK_()).a(this.n / 2 - 100, g(12), 200, 20).a());
   }

   @Override
   public wv i() {
      return wu.b(b, c, this.M, C, this.L);
   }

   private void E() {
      (new Thread("Realms-delete-realm") {
         @Override
         public void run() {
            try {
               fie $$0 = fie.a();
               $$0.j(flg.this.J.a);
            } catch (fka var2) {
               flg.a.error("Couldn't delete world", var2);
            }

            flg.this.m.execute(() -> flg.this.m.a(flg.this.K));
         }
      }).start();
      this.m.a(this);
   }

   private void a(long $$0) {
      fie $$1 = fie.a();

      try {
         fjr $$2 = $$1.h($$0);
         this.L = this.a($$2.b);
         this.M = b($$2.a);
         this.N = $$2.c;
      } catch (fka var5) {
         a.error("Couldn't get subscription", var5);
         this.m.a(new fks(var5, this.I));
      }
   }

   private static wv b(long $$0) {
      Calendar $$1 = new GregorianCalendar(TimeZone.getDefault());
      $$1.setTimeInMillis($$0);
      return wv.b(DateFormat.getDateTimeInstance().format($$1.getTime()));
   }

   @Override
   public void aK_() {
      this.m.a(this.I);
   }

   @Override
   public void a(fpz $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      int $$4 = this.n / 2 - 100;
      $$0.a(this.p, b, this.n / 2, 17, -1);
      $$0.b(this.p, c, $$4, g(0), -6250336);
      $$0.b(this.p, this.M, $$4, g(1), -1);
      if (this.N == fjr.a.a) {
         $$0.b(this.p, C, $$4, g(3), -6250336);
      } else if (this.N == fjr.a.b) {
         $$0.b(this.p, D, $$4, g(3), -6250336);
      }

      $$0.b(this.p, this.L, $$4, g(4), -1);
   }

   private wv a(int $$0) {
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
            return wv.a("mco.configure.world.subscription.remaining.months.days", $$1, $$2);
         } else if ($$3) {
            return wv.a("mco.configure.world.subscription.remaining.months", $$1);
         } else {
            return $$4 ? wv.a("mco.configure.world.subscription.remaining.days", $$2) : wv.i();
         }
      }
   }
}
