import com.mojang.logging.LogUtils;
import java.text.DateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class ezs extends grl {
   static final Logger a = LogUtils.getLogger();
   private static final wg b = wg.c("mco.configure.world.subscription.title");
   private static final wg c = wg.c("mco.configure.world.subscription.start");
   private static final wg y = wg.c("mco.configure.world.subscription.timeleft");
   private static final wg z = wg.c("mco.configure.world.subscription.recurring.daysleft");
   private static final wg A = wg.c("mco.configure.world.subscription.expired");
   private static final wg B = wg.c("mco.configure.world.subscription.less_than_a_day");
   private static final wg C = wg.c("mco.configure.world.subscription.unknown");
   private static final wg D = wg.c("mco.configure.world.subscription.recurring.info");
   private final fjo E;
   final exp F;
   final fjo G;
   private wg H = C;
   private wg I = C;
   @Nullable
   private eyc.a J;

   public ezs(fjo $$0, exp $$1, fjo $$2) {
      super(fbh.a);
      this.E = $$0;
      this.F = $$1;
      this.G = $$2;
   }

   @Override
   public void aN_() {
      this.a(this.F.a);
      this.c(fdp.a(wg.c("mco.configure.world.subscription.extend"), $$0 -> fif.a(this, awg.a(this.F.b, this.j.X().b()))).a(this.k / 2 - 100, g(6), 200, 20).a());
      if (this.F.j) {
         this.c(fdp.a(wg.c("mco.configure.world.delete.button"), $$0 -> {
            wg $$1 = wg.c("mco.configure.world.delete.question.line1");
            wg $$2 = wg.c("mco.configure.world.delete.question.line2");
            this.j.a(new eze(this::c, eze.a.a, $$1, $$2, true));
         }).a(this.k / 2 - 100, g(10), 200, 20).a());
      } else if (ewt.b() && this.F.s != null) {
         this.c(new fdz(this.k / 2 - 100, g(8), 200, 46, wg.a("mco.snapshot.subscription.info", this.F.s), this.m).a(-6250336));
      } else {
         this.c(new fdz(this.k / 2 - 100, g(8), 200, 46, D, this.m).a(-6250336));
      }

      this.c(fdp.a(wf.k, $$0 -> this.d()).a(this.k / 2 - 100, g(12), 200, 20).a());
   }

   @Override
   public wg i() {
      return wf.b(b, c, this.I, y, this.H);
   }

   private void c(boolean $$0) {
      if ($$0) {
         (new Thread("Realms-delete-realm") {
            @Override
            public void run() {
               try {
                  ewy $$0 = ewy.a();
                  $$0.i(ezs.this.F.a);
               } catch (eyl var2) {
                  ezs.a.error("Couldn't delete world", var2);
               }

               ezs.this.j.execute(() -> ezs.this.j.a(ezs.this.G));
            }
         }).start();
      }

      this.j.a(this);
   }

   private void a(long $$0) {
      ewy $$1 = ewy.a();

      try {
         eyc $$2 = $$1.h($$0);
         this.H = this.a($$2.b);
         this.I = b($$2.a);
         this.J = $$2.c;
      } catch (eyl var5) {
         a.error("Couldn't get subscription", var5);
         this.j.a(new ezc(var5, this.E));
      }
   }

   private static wg b(long $$0) {
      Calendar $$1 = new GregorianCalendar(TimeZone.getDefault());
      $$1.setTimeInMillis($$0);
      return wg.b(DateFormat.getDateTimeInstance().format($$1.getTime()));
   }

   @Override
   public void d() {
      this.j.a(this.E);
   }

   @Override
   public void a(fdc $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      int $$4 = this.k / 2 - 100;
      $$0.a(this.m, b, this.k / 2, 17, -1);
      $$0.a(this.m, c, $$4, g(0), -6250336, false);
      $$0.a(this.m, this.I, $$4, g(1), -1, false);
      if (this.J == eyc.a.a) {
         $$0.a(this.m, y, $$4, g(3), -6250336, false);
      } else if (this.J == eyc.a.b) {
         $$0.a(this.m, z, $$4, g(3), -6250336, false);
      }

      $$0.a(this.m, this.H, $$4, g(4), -1, false);
   }

   private wg a(int $$0) {
      if ($$0 < 0 && this.F.j) {
         return A;
      } else if ($$0 <= 1) {
         return B;
      } else {
         int $$1 = $$0 / 30;
         int $$2 = $$0 % 30;
         boolean $$3 = $$1 > 0;
         boolean $$4 = $$2 > 0;
         if ($$3 && $$4) {
            return wg.a("mco.configure.world.subscription.remaining.months.days", $$1, $$2);
         } else if ($$3) {
            return wg.a("mco.configure.world.subscription.remaining.months", $$1);
         } else {
            return $$4 ? wg.a("mco.configure.world.subscription.remaining.days", $$2) : wg.i();
         }
      }
   }
}
