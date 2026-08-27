import com.mojang.logging.LogUtils;
import java.text.DateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fax extends gsq {
   static final Logger a = LogUtils.getLogger();
   private static final ws b = ws.c("mco.configure.world.subscription.title");
   private static final ws c = ws.c("mco.configure.world.subscription.start");
   private static final ws B = ws.c("mco.configure.world.subscription.timeleft");
   private static final ws C = ws.c("mco.configure.world.subscription.recurring.daysleft");
   private static final ws D = ws.c("mco.configure.world.subscription.expired");
   private static final ws E = ws.c("mco.configure.world.subscription.less_than_a_day");
   private static final ws F = ws.c("mco.configure.world.subscription.unknown");
   private static final ws G = ws.c("mco.configure.world.subscription.recurring.info");
   private final fkt H;
   final eyu I;
   final fkt J;
   private ws K = F;
   private ws L = F;
   @Nullable
   private ezh.a M;

   public fax(fkt $$0, eyu $$1, fkt $$2) {
      super(fcm.a);
      this.H = $$0;
      this.I = $$1;
      this.J = $$2;
   }

   @Override
   public void aM_() {
      this.a(this.I.a);
      this.c(feu.a(ws.c("mco.configure.world.subscription.extend"), $$0 -> fjk.a(this, aws.a(this.I.b, this.m.X().b()))).a(this.n / 2 - 100, g(6), 200, 20).a());
      if (this.I.j) {
         this.c(feu.a(ws.c("mco.configure.world.delete.button"), $$0 -> {
            ws $$1 = ws.c("mco.configure.world.delete.question.line1");
            ws $$2 = ws.c("mco.configure.world.delete.question.line2");
            this.m.a(new faj(this::c, faj.a.a, $$1, $$2, true));
         }).a(this.n / 2 - 100, g(10), 200, 20).a());
      } else if (exy.b() && this.I.s != null) {
         this.c(new ffe(this.n / 2 - 100, g(8), 200, 46, ws.a("mco.snapshot.subscription.info", this.I.s), this.p).a(-6250336));
      } else {
         this.c(new ffe(this.n / 2 - 100, g(8), 200, 46, G, this.p).a(-6250336));
      }

      this.c(feu.a(wr.k, $$0 -> this.d()).a(this.n / 2 - 100, g(12), 200, 20).a());
   }

   @Override
   public ws i() {
      return wr.b(b, c, this.L, B, this.K);
   }

   private void c(boolean $$0) {
      if ($$0) {
         (new Thread("Realms-delete-realm") {
            @Override
            public void run() {
               try {
                  eyd $$0 = eyd.a();
                  $$0.i(fax.this.I.a);
               } catch (ezq var2) {
                  fax.a.error("Couldn't delete world", var2);
               }

               fax.this.m.execute(() -> fax.this.m.a(fax.this.J));
            }
         }).start();
      }

      this.m.a(this);
   }

   private void a(long $$0) {
      eyd $$1 = eyd.a();

      try {
         ezh $$2 = $$1.h($$0);
         this.K = this.a($$2.b);
         this.L = b($$2.a);
         this.M = $$2.c;
      } catch (ezq var5) {
         a.error("Couldn't get subscription", var5);
         this.m.a(new fah(var5, this.H));
      }
   }

   private static ws b(long $$0) {
      Calendar $$1 = new GregorianCalendar(TimeZone.getDefault());
      $$1.setTimeInMillis($$0);
      return ws.b(DateFormat.getDateTimeInstance().format($$1.getTime()));
   }

   @Override
   public void d() {
      this.m.a(this.H);
   }

   @Override
   public void a(feh $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      int $$4 = this.n / 2 - 100;
      $$0.a(this.p, b, this.n / 2, 17, -1);
      $$0.a(this.p, c, $$4, g(0), -6250336, false);
      $$0.a(this.p, this.L, $$4, g(1), -1, false);
      if (this.M == ezh.a.a) {
         $$0.a(this.p, B, $$4, g(3), -6250336, false);
      } else if (this.M == ezh.a.b) {
         $$0.a(this.p, C, $$4, g(3), -6250336, false);
      }

      $$0.a(this.p, this.K, $$4, g(4), -1, false);
   }

   private ws a(int $$0) {
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
            return ws.a("mco.configure.world.subscription.remaining.months.days", $$1, $$2);
         } else if ($$3) {
            return ws.a("mco.configure.world.subscription.remaining.months", $$1);
         } else {
            return $$4 ? ws.a("mco.configure.world.subscription.remaining.days", $$2) : ws.i();
         }
      }
   }
}
