import com.mojang.logging.LogUtils;
import java.text.DateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class esn extends gjl {
   static final Logger a = LogUtils.getLogger();
   private static final vb b = vb.c("mco.configure.world.subscription.title");
   private static final vb c = vb.c("mco.configure.world.subscription.start");
   private static final vb v = vb.c("mco.configure.world.subscription.timeleft");
   private static final vb w = vb.c("mco.configure.world.subscription.recurring.daysleft");
   private static final vb x = vb.c("mco.configure.world.subscription.expired");
   private static final vb y = vb.c("mco.configure.world.subscription.less_than_a_day");
   private static final vb z = vb.c("mco.configure.world.subscription.unknown");
   private static final vb A = vb.c("mco.configure.world.subscription.recurring.info");
   private final fcc B;
   final eqk C;
   final fcc D;
   private vb E = z;
   private vb F = z;
   @Nullable
   private eqx.a G;

   public esn(fcc $$0, eqk $$1, fcc $$2) {
      super(euc.a);
      this.B = $$0;
      this.C = $$1;
      this.D = $$2;
   }

   @Override
   public void aP_() {
      this.a(this.C.a);
      this.d(ewh.a(vb.c("mco.configure.world.subscription.extend"), $$0 -> fau.a(this, asu.a(this.C.b, this.f.U().b()))).a(this.g / 2 - 100, h(6), 200, 20).a());
      if (this.C.j) {
         this.d(ewh.a(vb.c("mco.configure.world.delete.button"), $$0 -> {
            vb $$1 = vb.c("mco.configure.world.delete.question.line1");
            vb $$2 = vb.c("mco.configure.world.delete.question.line2");
            this.f.a(new erz(this::c, erz.a.a, $$1, $$2, true));
         }).a(this.g / 2 - 100, h(10), 200, 20).a());
      } else if (epo.b() && this.C.s != null) {
         this.d(new ewr(this.g / 2 - 100, h(8), 200, 46, vb.a("mco.snapshot.subscription.info", this.C.s), this.i).a(-6250336));
      } else {
         this.d(new ewr(this.g / 2 - 100, h(8), 200, 46, A, this.i).a(-6250336));
      }

      this.d(ewh.a(va.k, $$0 -> this.aF_()).a(this.g / 2 - 100, h(12), 200, 20).a());
   }

   @Override
   public vb h() {
      return va.b(b, c, this.F, v, this.E);
   }

   private void c(boolean $$0) {
      if ($$0) {
         (new Thread("Realms-delete-realm") {
            @Override
            public void run() {
               try {
                  ept $$0 = ept.a();
                  $$0.i(esn.this.C.a);
               } catch (erg var2) {
                  esn.a.error("Couldn't delete world", var2);
               }

               esn.this.f.execute(() -> esn.this.f.a(esn.this.D));
            }
         }).start();
      }

      this.f.a(this);
   }

   private void a(long $$0) {
      ept $$1 = ept.a();

      try {
         eqx $$2 = $$1.h($$0);
         this.E = this.a($$2.b);
         this.F = b($$2.a);
         this.G = $$2.c;
      } catch (erg var5) {
         a.error("Couldn't get subscription", var5);
         this.f.a(new erx(var5, this.B));
      }
   }

   private static vb b(long $$0) {
      Calendar $$1 = new GregorianCalendar(TimeZone.getDefault());
      $$1.setTimeInMillis($$0);
      return vb.b(DateFormat.getDateTimeInstance().format($$1.getTime()));
   }

   @Override
   public void aF_() {
      this.f.a(this.B);
   }

   @Override
   public void a(evw $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      int $$4 = this.g / 2 - 100;
      $$0.a(this.i, b, this.g / 2, 17, -1);
      $$0.a(this.i, c, $$4, h(0), -6250336, false);
      $$0.a(this.i, this.F, $$4, h(1), -1, false);
      if (this.G == eqx.a.a) {
         $$0.a(this.i, v, $$4, h(3), -6250336, false);
      } else if (this.G == eqx.a.b) {
         $$0.a(this.i, w, $$4, h(3), -6250336, false);
      }

      $$0.a(this.i, this.E, $$4, h(4), -1, false);
   }

   private vb a(int $$0) {
      if ($$0 < 0 && this.C.j) {
         return x;
      } else if ($$0 <= 1) {
         return y;
      } else {
         int $$1 = $$0 / 30;
         int $$2 = $$0 % 30;
         boolean $$3 = $$1 > 0;
         boolean $$4 = $$2 > 0;
         if ($$3 && $$4) {
            return vb.a("mco.configure.world.subscription.remaining.months.days", $$1, $$2);
         } else if ($$3) {
            return vb.a("mco.configure.world.subscription.remaining.months", $$1);
         } else {
            return $$4 ? vb.a("mco.configure.world.subscription.remaining.days", $$2) : vb.i();
         }
      }
   }
}
