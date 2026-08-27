import com.mojang.logging.LogUtils;
import java.text.DateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fbh extends gtb {
   static final Logger a = LogUtils.getLogger();
   private static final wu b = wu.c("mco.configure.world.subscription.title");
   private static final wu c = wu.c("mco.configure.world.subscription.start");
   private static final wu B = wu.c("mco.configure.world.subscription.timeleft");
   private static final wu C = wu.c("mco.configure.world.subscription.recurring.daysleft");
   private static final wu D = wu.c("mco.configure.world.subscription.expired");
   private static final wu E = wu.c("mco.configure.world.subscription.less_than_a_day");
   private static final wu F = wu.c("mco.configure.world.subscription.unknown");
   private static final wu G = wu.c("mco.configure.world.subscription.recurring.info");
   private final fld H;
   final eze I;
   final fld J;
   private wu K = F;
   private wu L = F;
   @Nullable
   private ezr.a M;

   public fbh(fld $$0, eze $$1, fld $$2) {
      super(fcw.a);
      this.H = $$0;
      this.I = $$1;
      this.J = $$2;
   }

   @Override
   public void aM_() {
      this.a(this.I.a);
      this.c(ffe.a(wu.c("mco.configure.world.subscription.extend"), $$0 -> fju.a(this, awv.a(this.I.b, this.m.X().b()))).a(this.n / 2 - 100, g(6), 200, 20).a());
      if (this.I.j) {
         this.c(ffe.a(wu.c("mco.configure.world.delete.button"), $$0 -> {
            wu $$1 = wu.c("mco.configure.world.delete.question.line1");
            wu $$2 = wu.c("mco.configure.world.delete.question.line2");
            this.m.a(new fat(this::c, fat.a.a, $$1, $$2, true));
         }).a(this.n / 2 - 100, g(10), 200, 20).a());
      } else if (eyi.b() && this.I.s != null) {
         this.c(new ffo(this.n / 2 - 100, g(8), 200, 46, wu.a("mco.snapshot.subscription.info", this.I.s), this.p).a(-6250336));
      } else {
         this.c(new ffo(this.n / 2 - 100, g(8), 200, 46, G, this.p).a(-6250336));
      }

      this.c(ffe.a(wt.k, $$0 -> this.d()).a(this.n / 2 - 100, g(12), 200, 20).a());
   }

   @Override
   public wu i() {
      return wt.b(b, c, this.L, B, this.K);
   }

   private void c(boolean $$0) {
      if ($$0) {
         (new Thread("Realms-delete-realm") {
            @Override
            public void run() {
               try {
                  eyn $$0 = eyn.a();
                  $$0.i(fbh.this.I.a);
               } catch (faa var2) {
                  fbh.a.error("Couldn't delete world", var2);
               }

               fbh.this.m.execute(() -> fbh.this.m.a(fbh.this.J));
            }
         }).start();
      }

      this.m.a(this);
   }

   private void a(long $$0) {
      eyn $$1 = eyn.a();

      try {
         ezr $$2 = $$1.h($$0);
         this.K = this.a($$2.b);
         this.L = b($$2.a);
         this.M = $$2.c;
      } catch (faa var5) {
         a.error("Couldn't get subscription", var5);
         this.m.a(new far(var5, this.H));
      }
   }

   private static wu b(long $$0) {
      Calendar $$1 = new GregorianCalendar(TimeZone.getDefault());
      $$1.setTimeInMillis($$0);
      return wu.b(DateFormat.getDateTimeInstance().format($$1.getTime()));
   }

   @Override
   public void d() {
      this.m.a(this.H);
   }

   @Override
   public void a(fer $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      int $$4 = this.n / 2 - 100;
      $$0.a(this.p, b, this.n / 2, 17, -1);
      $$0.a(this.p, c, $$4, g(0), -6250336, false);
      $$0.a(this.p, this.L, $$4, g(1), -1, false);
      if (this.M == ezr.a.a) {
         $$0.a(this.p, B, $$4, g(3), -6250336, false);
      } else if (this.M == ezr.a.b) {
         $$0.a(this.p, C, $$4, g(3), -6250336, false);
      }

      $$0.a(this.p, this.K, $$4, g(4), -1, false);
   }

   private wu a(int $$0) {
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
            return wu.a("mco.configure.world.subscription.remaining.months.days", $$1, $$2);
         } else if ($$3) {
            return wu.a("mco.configure.world.subscription.remaining.months", $$1);
         } else {
            return $$4 ? wu.a("mco.configure.world.subscription.remaining.days", $$2) : wu.i();
         }
      }
   }
}
