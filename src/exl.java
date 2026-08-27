import com.mojang.logging.LogUtils;
import java.text.DateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class exl extends gpe {
   static final Logger a = LogUtils.getLogger();
   private static final vu b = vu.c("mco.configure.world.subscription.title");
   private static final vu c = vu.c("mco.configure.world.subscription.start");
   private static final vu v = vu.c("mco.configure.world.subscription.timeleft");
   private static final vu w = vu.c("mco.configure.world.subscription.recurring.daysleft");
   private static final vu x = vu.c("mco.configure.world.subscription.expired");
   private static final vu y = vu.c("mco.configure.world.subscription.less_than_a_day");
   private static final vu z = vu.c("mco.configure.world.subscription.unknown");
   private static final vu A = vu.c("mco.configure.world.subscription.recurring.info");
   private final fhh B;
   final evi C;
   final fhh D;
   private vu E = z;
   private vu F = z;
   @Nullable
   private evv.a G;

   public exl(fhh $$0, evi $$1, fhh $$2) {
      super(eza.a);
      this.B = $$0;
      this.C = $$1;
      this.D = $$2;
   }

   @Override
   public void aO_() {
      this.a(this.C.a);
      this.c(fbi.a(vu.c("mco.configure.world.subscription.extend"), $$0 -> ffy.a(this, avs.a(this.C.b, this.f.X().b()))).a(this.g / 2 - 100, g(6), 200, 20).a());
      if (this.C.j) {
         this.c(fbi.a(vu.c("mco.configure.world.delete.button"), $$0 -> {
            vu $$1 = vu.c("mco.configure.world.delete.question.line1");
            vu $$2 = vu.c("mco.configure.world.delete.question.line2");
            this.f.a(new ewx(this::c, ewx.a.a, $$1, $$2, true));
         }).a(this.g / 2 - 100, g(10), 200, 20).a());
      } else if (eum.b() && this.C.s != null) {
         this.c(new fbs(this.g / 2 - 100, g(8), 200, 46, vu.a("mco.snapshot.subscription.info", this.C.s), this.i).a(-6250336));
      } else {
         this.c(new fbs(this.g / 2 - 100, g(8), 200, 46, A, this.i).a(-6250336));
      }

      this.c(fbi.a(vt.k, $$0 -> this.d()).a(this.g / 2 - 100, g(12), 200, 20).a());
   }

   @Override
   public vu i() {
      return vt.b(b, c, this.F, v, this.E);
   }

   private void c(boolean $$0) {
      if ($$0) {
         (new Thread("Realms-delete-realm") {
            @Override
            public void run() {
               try {
                  eur $$0 = eur.a();
                  $$0.i(exl.this.C.a);
               } catch (ewe var2) {
                  exl.a.error("Couldn't delete world", var2);
               }

               exl.this.f.execute(() -> exl.this.f.a(exl.this.D));
            }
         }).start();
      }

      this.f.a(this);
   }

   private void a(long $$0) {
      eur $$1 = eur.a();

      try {
         evv $$2 = $$1.h($$0);
         this.E = this.a($$2.b);
         this.F = b($$2.a);
         this.G = $$2.c;
      } catch (ewe var5) {
         a.error("Couldn't get subscription", var5);
         this.f.a(new ewv(var5, this.B));
      }
   }

   private static vu b(long $$0) {
      Calendar $$1 = new GregorianCalendar(TimeZone.getDefault());
      $$1.setTimeInMillis($$0);
      return vu.b(DateFormat.getDateTimeInstance().format($$1.getTime()));
   }

   @Override
   public void d() {
      this.f.a(this.B);
   }

   @Override
   public void a(fav $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      int $$4 = this.g / 2 - 100;
      $$0.a(this.i, b, this.g / 2, 17, -1);
      $$0.a(this.i, c, $$4, g(0), -6250336, false);
      $$0.a(this.i, this.F, $$4, g(1), -1, false);
      if (this.G == evv.a.a) {
         $$0.a(this.i, v, $$4, g(3), -6250336, false);
      } else if (this.G == evv.a.b) {
         $$0.a(this.i, w, $$4, g(3), -6250336, false);
      }

      $$0.a(this.i, this.E, $$4, g(4), -1, false);
   }

   private vu a(int $$0) {
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
            return vu.a("mco.configure.world.subscription.remaining.months.days", $$1, $$2);
         } else if ($$3) {
            return vu.a("mco.configure.world.subscription.remaining.months", $$1);
         } else {
            return $$4 ? vu.a("mco.configure.world.subscription.remaining.days", $$2) : vu.i();
         }
      }
   }
}
