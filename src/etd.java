import com.mojang.logging.LogUtils;
import java.text.DateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class etd extends gkc {
   static final Logger a = LogUtils.getLogger();
   private static final vd b = vd.c("mco.configure.world.subscription.title");
   private static final vd c = vd.c("mco.configure.world.subscription.start");
   private static final vd v = vd.c("mco.configure.world.subscription.timeleft");
   private static final vd w = vd.c("mco.configure.world.subscription.recurring.daysleft");
   private static final vd x = vd.c("mco.configure.world.subscription.expired");
   private static final vd y = vd.c("mco.configure.world.subscription.less_than_a_day");
   private static final vd z = vd.c("mco.configure.world.subscription.unknown");
   private static final vd A = vd.c("mco.configure.world.subscription.recurring.info");
   private final fct B;
   final era C;
   final fct D;
   private vd E = z;
   private vd F = z;
   @Nullable
   private ern.a G;

   public etd(fct $$0, era $$1, fct $$2) {
      super(eus.a);
      this.B = $$0;
      this.C = $$1;
      this.D = $$2;
   }

   @Override
   public void aN_() {
      this.a(this.C.a);
      this.d(ewy.a(vd.c("mco.configure.world.subscription.extend"), $$0 -> fbl.a(this, ate.a(this.C.b, this.f.U().b()))).a(this.g / 2 - 100, g(6), 200, 20).a());
      if (this.C.j) {
         this.d(ewy.a(vd.c("mco.configure.world.delete.button"), $$0 -> {
            vd $$1 = vd.c("mco.configure.world.delete.question.line1");
            vd $$2 = vd.c("mco.configure.world.delete.question.line2");
            this.f.a(new esp(this::c, esp.a.a, $$1, $$2, true));
         }).a(this.g / 2 - 100, g(10), 200, 20).a());
      } else if (eqe.b() && this.C.s != null) {
         this.d(new exi(this.g / 2 - 100, g(8), 200, 46, vd.a("mco.snapshot.subscription.info", this.C.s), this.i).a(-6250336));
      } else {
         this.d(new exi(this.g / 2 - 100, g(8), 200, 46, A, this.i).a(-6250336));
      }

      this.d(ewy.a(vc.k, $$0 -> this.aE_()).a(this.g / 2 - 100, g(12), 200, 20).a());
   }

   @Override
   public vd h() {
      return vc.b(b, c, this.F, v, this.E);
   }

   private void c(boolean $$0) {
      if ($$0) {
         (new Thread("Realms-delete-realm") {
            @Override
            public void run() {
               try {
                  eqj $$0 = eqj.a();
                  $$0.i(etd.this.C.a);
               } catch (erw var2) {
                  etd.a.error("Couldn't delete world", var2);
               }

               etd.this.f.execute(() -> etd.this.f.a(etd.this.D));
            }
         }).start();
      }

      this.f.a(this);
   }

   private void a(long $$0) {
      eqj $$1 = eqj.a();

      try {
         ern $$2 = $$1.h($$0);
         this.E = this.a($$2.b);
         this.F = b($$2.a);
         this.G = $$2.c;
      } catch (erw var5) {
         a.error("Couldn't get subscription", var5);
         this.f.a(new esn(var5, this.B));
      }
   }

   private static vd b(long $$0) {
      Calendar $$1 = new GregorianCalendar(TimeZone.getDefault());
      $$1.setTimeInMillis($$0);
      return vd.b(DateFormat.getDateTimeInstance().format($$1.getTime()));
   }

   @Override
   public void aE_() {
      this.f.a(this.B);
   }

   @Override
   public void a(ewm $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      int $$4 = this.g / 2 - 100;
      $$0.a(this.i, b, this.g / 2, 17, -1);
      $$0.a(this.i, c, $$4, g(0), -6250336, false);
      $$0.a(this.i, this.F, $$4, g(1), -1, false);
      if (this.G == ern.a.a) {
         $$0.a(this.i, v, $$4, g(3), -6250336, false);
      } else if (this.G == ern.a.b) {
         $$0.a(this.i, w, $$4, g(3), -6250336, false);
      }

      $$0.a(this.i, this.E, $$4, g(4), -1, false);
   }

   private vd a(int $$0) {
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
            return vd.a("mco.configure.world.subscription.remaining.months.days", $$1, $$2);
         } else if ($$3) {
            return vd.a("mco.configure.world.subscription.remaining.months", $$1);
         } else {
            return $$4 ? vd.a("mco.configure.world.subscription.remaining.days", $$2) : vd.i();
         }
      }
   }
}
