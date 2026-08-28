import com.mojang.logging.LogUtils;
import java.text.DateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fdw extends gvs {
   static final Logger a = LogUtils.getLogger();
   private static final wu b = wu.c("mco.configure.world.subscription.title");
   private static final wu c = wu.c("mco.configure.world.subscription.start");
   private static final wu A = wu.c("mco.configure.world.subscription.timeleft");
   private static final wu B = wu.c("mco.configure.world.subscription.recurring.daysleft");
   private static final wu C = wu.c("mco.configure.world.subscription.expired");
   private static final wu D = wu.c("mco.configure.world.subscription.less_than_a_day");
   private static final wu E = wu.c("mco.configure.world.subscription.unknown");
   private static final wu F = wu.c("mco.configure.world.subscription.recurring.info");
   private final fnj G;
   final fbt H;
   final fnj I;
   private wu J = E;
   private wu K = E;
   @Nullable
   private fcg.a L;

   public fdw(fnj $$0, fbt $$1, fnj $$2) {
      super(ffl.a);
      this.G = $$0;
      this.H = $$1;
      this.I = $$2;
   }

   @Override
   public void aP_() {
      this.a(this.H.a);
      this.c(fhs.a(wu.c("mco.configure.world.subscription.extend"), $$0 -> fmg.a(this, axb.a(this.H.b, this.l.X().b()))).a(this.m / 2 - 100, g(6), 200, 20).a());
      if (this.H.j) {
         this.c(
            fhs.a(wu.c("mco.configure.world.delete.button"), $$0 -> this.l.a(fdp.b(this, wu.c("mco.configure.world.delete.question.line1"), $$0x -> this.E())))
               .a(this.m / 2 - 100, g(10), 200, 20)
               .a()
         );
      } else if (fax.b() && this.H.s != null) {
         this.c(new fic(this.m / 2 - 100, g(8), 200, 46, wu.a("mco.snapshot.subscription.info", this.H.s), this.o));
      } else {
         this.c(new fic(this.m / 2 - 100, g(8), 200, 46, F, this.o));
      }

      this.c(fhs.a(wt.k, $$0 -> this.d()).a(this.m / 2 - 100, g(12), 200, 20).a());
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
               fbc $$0 = fbc.a();
               $$0.i(fdw.this.H.a);
            } catch (fcp var2) {
               fdw.a.error("Couldn't delete world", var2);
            }

            fdw.this.l.execute(() -> fdw.this.l.a(fdw.this.I));
         }
      }).start();
      this.l.a(this);
   }

   private void a(long $$0) {
      fbc $$1 = fbc.a();

      try {
         fcg $$2 = $$1.h($$0);
         this.J = this.a($$2.b);
         this.K = b($$2.a);
         this.L = $$2.c;
      } catch (fcp var5) {
         a.error("Couldn't get subscription", var5);
         this.l.a(new fdh(var5, this.G));
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
   public void a(fhf $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      int $$4 = this.m / 2 - 100;
      $$0.a(this.o, b, this.m / 2, 17, -1);
      $$0.a(this.o, c, $$4, g(0), -6250336, false);
      $$0.a(this.o, this.K, $$4, g(1), -1, false);
      if (this.L == fcg.a.a) {
         $$0.a(this.o, A, $$4, g(3), -6250336, false);
      } else if (this.L == fcg.a.b) {
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
