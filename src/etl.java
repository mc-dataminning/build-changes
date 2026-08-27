import com.mojang.logging.LogUtils;
import java.text.DateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class etl extends gkp {
   static final Logger a = LogUtils.getLogger();
   private static final vf b = vf.c("mco.configure.world.subscription.title");
   private static final vf c = vf.c("mco.configure.world.subscription.start");
   private static final vf v = vf.c("mco.configure.world.subscription.timeleft");
   private static final vf w = vf.c("mco.configure.world.subscription.recurring.daysleft");
   private static final vf x = vf.c("mco.configure.world.subscription.expired");
   private static final vf y = vf.c("mco.configure.world.subscription.less_than_a_day");
   private static final vf z = vf.c("mco.configure.world.subscription.unknown");
   private static final vf A = vf.c("mco.configure.world.subscription.recurring.info");
   private final fdb B;
   final eri C;
   final fdb D;
   private vf E = z;
   private vf F = z;
   @Nullable
   private erv.a G;

   public etl(fdb $$0, eri $$1, fdb $$2) {
      super(eva.a);
      this.B = $$0;
      this.C = $$1;
      this.D = $$2;
   }

   @Override
   public void aN_() {
      this.a(this.C.a);
      this.d(exg.a(vf.c("mco.configure.world.subscription.extend"), $$0 -> fbt.a(this, atk.a(this.C.b, this.f.V().b()))).a(this.g / 2 - 100, g(6), 200, 20).a());
      if (this.C.j) {
         this.d(exg.a(vf.c("mco.configure.world.delete.button"), $$0 -> {
            vf $$1 = vf.c("mco.configure.world.delete.question.line1");
            vf $$2 = vf.c("mco.configure.world.delete.question.line2");
            this.f.a(new esx(this::c, esx.a.a, $$1, $$2, true));
         }).a(this.g / 2 - 100, g(10), 200, 20).a());
      } else if (eqm.b() && this.C.s != null) {
         this.d(new exq(this.g / 2 - 100, g(8), 200, 46, vf.a("mco.snapshot.subscription.info", this.C.s), this.i).a(-6250336));
      } else {
         this.d(new exq(this.g / 2 - 100, g(8), 200, 46, A, this.i).a(-6250336));
      }

      this.d(exg.a(ve.k, $$0 -> this.aE_()).a(this.g / 2 - 100, g(12), 200, 20).a());
   }

   @Override
   public vf h() {
      return ve.b(b, c, this.F, v, this.E);
   }

   private void c(boolean $$0) {
      if ($$0) {
         (new Thread("Realms-delete-realm") {
            @Override
            public void run() {
               try {
                  eqr $$0 = eqr.a();
                  $$0.i(etl.this.C.a);
               } catch (ese var2) {
                  etl.a.error("Couldn't delete world", var2);
               }

               etl.this.f.execute(() -> etl.this.f.a(etl.this.D));
            }
         }).start();
      }

      this.f.a(this);
   }

   private void a(long $$0) {
      eqr $$1 = eqr.a();

      try {
         erv $$2 = $$1.h($$0);
         this.E = this.a($$2.b);
         this.F = b($$2.a);
         this.G = $$2.c;
      } catch (ese var5) {
         a.error("Couldn't get subscription", var5);
         this.f.a(new esv(var5, this.B));
      }
   }

   private static vf b(long $$0) {
      Calendar $$1 = new GregorianCalendar(TimeZone.getDefault());
      $$1.setTimeInMillis($$0);
      return vf.b(DateFormat.getDateTimeInstance().format($$1.getTime()));
   }

   @Override
   public void aE_() {
      this.f.a(this.B);
   }

   @Override
   public void a(ewu $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      int $$4 = this.g / 2 - 100;
      $$0.a(this.i, b, this.g / 2, 17, -1);
      $$0.a(this.i, c, $$4, g(0), -6250336, false);
      $$0.a(this.i, this.F, $$4, g(1), -1, false);
      if (this.G == erv.a.a) {
         $$0.a(this.i, v, $$4, g(3), -6250336, false);
      } else if (this.G == erv.a.b) {
         $$0.a(this.i, w, $$4, g(3), -6250336, false);
      }

      $$0.a(this.i, this.E, $$4, g(4), -1, false);
   }

   private vf a(int $$0) {
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
            return vf.a("mco.configure.world.subscription.remaining.months.days", $$1, $$2);
         } else if ($$3) {
            return vf.a("mco.configure.world.subscription.remaining.months", $$1);
         } else {
            return $$4 ? vf.a("mco.configure.world.subscription.remaining.days", $$2) : vf.i();
         }
      }
   }
}
