import com.mojang.logging.LogUtils;
import java.text.DateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fdy extends gvu {
   static final Logger a = LogUtils.getLogger();
   private static final wu b = wu.c("mco.configure.world.subscription.title");
   private static final wu c = wu.c("mco.configure.world.subscription.start");
   private static final wu A = wu.c("mco.configure.world.subscription.timeleft");
   private static final wu B = wu.c("mco.configure.world.subscription.recurring.daysleft");
   private static final wu C = wu.c("mco.configure.world.subscription.expired");
   private static final wu D = wu.c("mco.configure.world.subscription.less_than_a_day");
   private static final wu E = wu.c("mco.configure.world.subscription.unknown");
   private static final wu F = wu.c("mco.configure.world.subscription.recurring.info");
   private final fnl G;
   final fbv H;
   final fnl I;
   private wu J = E;
   private wu K = E;
   @Nullable
   private fci.a L;

   public fdy(fnl $$0, fbv $$1, fnl $$2) {
      super(ffo.a);
      this.G = $$0;
      this.H = $$1;
      this.I = $$2;
   }

   @Override
   public void aP_() {
      this.a(this.H.a);
      this.c(fhu.a(wu.c("mco.configure.world.subscription.extend"), $$0 -> fmi.a(this, axb.a(this.H.b, this.l.X().b()))).a(this.m / 2 - 100, g(6), 200, 20).a());
      if (this.H.j) {
         this.c(
            fhu.a(wu.c("mco.configure.world.delete.button"), $$0 -> this.l.a(fdr.b(this, wu.c("mco.configure.world.delete.question.line1"), $$0x -> this.D())))
               .a(this.m / 2 - 100, g(10), 200, 20)
               .a()
         );
      } else if (faz.b() && this.H.s != null) {
         this.c(new fie(this.m / 2 - 100, g(8), 200, 46, wu.a("mco.snapshot.subscription.info", this.H.s), this.o));
      } else {
         this.c(new fie(this.m / 2 - 100, g(8), 200, 46, F, this.o));
      }

      this.c(fhu.a(wt.k, $$0 -> this.d()).a(this.m / 2 - 100, g(12), 200, 20).a());
   }

   @Override
   public wu i() {
      return wt.b(b, c, this.K, A, this.J);
   }

   private void D() {
      (new Thread("Realms-delete-realm") {
         @Override
         public void run() {
            try {
               fbe $$0 = fbe.a();
               $$0.i(fdy.this.H.a);
            } catch (fcr var2) {
               fdy.a.error("Couldn't delete world", var2);
            }

            fdy.this.l.execute(() -> fdy.this.l.a(fdy.this.I));
         }
      }).start();
      this.l.a(this);
   }

   private void a(long $$0) {
      fbe $$1 = fbe.a();

      try {
         fci $$2 = $$1.h($$0);
         this.J = this.a($$2.b);
         this.K = b($$2.a);
         this.L = $$2.c;
      } catch (fcr var5) {
         a.error("Couldn't get subscription", var5);
         this.l.a(new fdj(var5, this.G));
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
   public void a(fhh $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      int $$4 = this.m / 2 - 100;
      $$0.a(this.o, b, this.m / 2, 17, -1);
      $$0.a(this.o, c, $$4, g(0), -6250336, false);
      $$0.a(this.o, this.K, $$4, g(1), -1, false);
      if (this.L == fci.a.a) {
         $$0.a(this.o, A, $$4, g(3), -6250336, false);
      } else if (this.L == fci.a.b) {
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
