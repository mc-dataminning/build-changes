import com.mojang.logging.LogUtils;
import java.text.DateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fdq extends gvm {
   static final Logger a = LogUtils.getLogger();
   private static final wu b = wu.c("mco.configure.world.subscription.title");
   private static final wu c = wu.c("mco.configure.world.subscription.start");
   private static final wu A = wu.c("mco.configure.world.subscription.timeleft");
   private static final wu B = wu.c("mco.configure.world.subscription.recurring.daysleft");
   private static final wu C = wu.c("mco.configure.world.subscription.expired");
   private static final wu D = wu.c("mco.configure.world.subscription.less_than_a_day");
   private static final wu E = wu.c("mco.configure.world.subscription.unknown");
   private static final wu F = wu.c("mco.configure.world.subscription.recurring.info");
   private final fnd G;
   final fbn H;
   final fnd I;
   private wu J = E;
   private wu K = E;
   @Nullable
   private fca.a L;

   public fdq(fnd $$0, fbn $$1, fnd $$2) {
      super(fff.a);
      this.G = $$0;
      this.H = $$1;
      this.I = $$2;
   }

   @Override
   public void aO_() {
      this.a(this.H.a);
      this.c(fhm.a(wu.c("mco.configure.world.subscription.extend"), $$0 -> fma.a(this, awz.a(this.H.b, this.l.X().b()))).a(this.m / 2 - 100, g(6), 200, 20).a());
      if (this.H.j) {
         this.c(
            fhm.a(wu.c("mco.configure.world.delete.button"), $$0 -> this.l.a(fdj.b(this, wu.c("mco.configure.world.delete.question.line1"), $$0x -> this.E())))
               .a(this.m / 2 - 100, g(10), 200, 20)
               .a()
         );
      } else if (far.b() && this.H.s != null) {
         this.c(new fhw(this.m / 2 - 100, g(8), 200, 46, wu.a("mco.snapshot.subscription.info", this.H.s), this.o));
      } else {
         this.c(new fhw(this.m / 2 - 100, g(8), 200, 46, F, this.o));
      }

      this.c(fhm.a(wt.k, $$0 -> this.d()).a(this.m / 2 - 100, g(12), 200, 20).a());
   }

   @Override
   public wu i() {
      return wt.b(b, c, this.K, A, this.J);
   }

   private void E() {
      (new Thread("Realms-delete-realm") {
         @Override
         public void run() {
            try {
               faw $$0 = faw.a();
               $$0.i(fdq.this.H.a);
            } catch (fcj var2) {
               fdq.a.error("Couldn't delete world", var2);
            }

            fdq.this.l.execute(() -> fdq.this.l.a(fdq.this.I));
         }
      }).start();
      this.l.a(this);
   }

   private void a(long $$0) {
      faw $$1 = faw.a();

      try {
         fca $$2 = $$1.h($$0);
         this.J = this.a($$2.b);
         this.K = b($$2.a);
         this.L = $$2.c;
      } catch (fcj var5) {
         a.error("Couldn't get subscription", var5);
         this.l.a(new fdb(var5, this.G));
      }
   }

   private static wu b(long $$0) {
      Calendar $$1 = new GregorianCalendar(TimeZone.getDefault());
      $$1.setTimeInMillis($$0);
      return wu.b(DateFormat.getDateTimeInstance().format($$1.getTime()));
   }

   @Override
   public void d() {
      this.l.a(this.G);
   }

   @Override
   public void a(fgz $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      int $$4 = this.m / 2 - 100;
      $$0.a(this.o, b, this.m / 2, 17, -1);
      $$0.a(this.o, c, $$4, g(0), -6250336, false);
      $$0.a(this.o, this.K, $$4, g(1), -1, false);
      if (this.L == fca.a.a) {
         $$0.a(this.o, A, $$4, g(3), -6250336, false);
      } else if (this.L == fca.a.b) {
         $$0.a(this.o, B, $$4, g(3), -6250336, false);
      }

      $$0.a(this.o, this.J, $$4, g(4), -1, false);
   }

   private wu a(int $$0) {
      if ($$0 < 0 && this.H.j) {
         return C;
      } else if ($$0 <= 1) {
         return D;
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
