import com.mojang.logging.LogUtils;
import java.text.DateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class erg extends ghr {
   static final Logger a = LogUtils.getLogger();
   private static final ur b = ur.c("mco.configure.world.subscription.title");
   private static final ur c = ur.c("mco.configure.world.subscription.start");
   private static final ur v = ur.c("mco.configure.world.subscription.timeleft");
   private static final ur w = ur.c("mco.configure.world.subscription.recurring.daysleft");
   private static final ur x = ur.c("mco.configure.world.subscription.expired");
   private static final ur y = ur.c("mco.configure.world.subscription.less_than_a_day");
   private static final ur z = ur.c("mco.configure.world.subscription.unknown");
   private static final ur A = ur.c("mco.configure.world.subscription.recurring.info");
   private final fau B;
   final epd C;
   final fau D;
   private ur E = z;
   private ur F = z;
   @Nullable
   private epq.a G;

   public erg(fau $$0, epd $$1, fau $$2) {
      super(esv.a);
      this.B = $$0;
      this.C = $$1;
      this.D = $$2;
   }

   @Override
   public void aP_() {
      this.a(this.C.a);
      this.d(euz.a(ur.c("mco.configure.world.subscription.extend"), $$0 -> ezm.a(this, asj.a(this.C.b, this.f.U().b()))).a(this.g / 2 - 100, h(6), 200, 20).a());
      if (this.C.j) {
         this.d(euz.a(ur.c("mco.configure.world.delete.button"), $$0 -> {
            ur $$1 = ur.c("mco.configure.world.delete.question.line1");
            ur $$2 = ur.c("mco.configure.world.delete.question.line2");
            this.f.a(new eqs(this::c, eqs.a.a, $$1, $$2, true));
         }).a(this.g / 2 - 100, h(10), 200, 20).a());
      } else if (eoh.b() && this.C.s != null) {
         this.d(new evj(this.g / 2 - 100, h(8), 200, 46, ur.a("mco.snapshot.subscription.info", this.C.s), this.i).a(-6250336));
      } else {
         this.d(new evj(this.g / 2 - 100, h(8), 200, 46, A, this.i).a(-6250336));
      }

      this.d(euz.a(uq.k, $$0 -> this.aF_()).a(this.g / 2 - 100, h(12), 200, 20).a());
   }

   @Override
   public ur h() {
      return uq.b(b, c, this.F, v, this.E);
   }

   private void c(boolean $$0) {
      if ($$0) {
         (new Thread("Realms-delete-realm") {
            @Override
            public void run() {
               try {
                  eom $$0 = eom.a();
                  $$0.i(erg.this.C.a);
               } catch (epz var2) {
                  erg.a.error("Couldn't delete world", var2);
               }

               erg.this.f.execute(() -> erg.this.f.a(erg.this.D));
            }
         }).start();
      }

      this.f.a(this);
   }

   private void a(long $$0) {
      eom $$1 = eom.a();

      try {
         epq $$2 = $$1.h($$0);
         this.E = this.a($$2.b);
         this.F = b($$2.a);
         this.G = $$2.c;
      } catch (epz var5) {
         a.error("Couldn't get subscription", var5);
         this.f.a(new eqq(var5, this.B));
      }
   }

   private static ur b(long $$0) {
      Calendar $$1 = new GregorianCalendar(TimeZone.getDefault());
      $$1.setTimeInMillis($$0);
      return ur.b(DateFormat.getDateTimeInstance().format($$1.getTime()));
   }

   @Override
   public void aF_() {
      this.f.a(this.B);
   }

   @Override
   public void a(euo $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      int $$4 = this.g / 2 - 100;
      $$0.a(this.i, b, this.g / 2, 17, -1);
      $$0.a(this.i, c, $$4, h(0), -6250336, false);
      $$0.a(this.i, this.F, $$4, h(1), -1, false);
      if (this.G == epq.a.a) {
         $$0.a(this.i, v, $$4, h(3), -6250336, false);
      } else if (this.G == epq.a.b) {
         $$0.a(this.i, w, $$4, h(3), -6250336, false);
      }

      $$0.a(this.i, this.E, $$4, h(4), -1, false);
   }

   private ur a(int $$0) {
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
            return ur.a("mco.configure.world.subscription.remaining.months.days", $$1, $$2);
         } else if ($$3) {
            return ur.a("mco.configure.world.subscription.remaining.months", $$1);
         } else {
            return $$4 ? ur.a("mco.configure.world.subscription.remaining.days", $$2) : ur.i();
         }
      }
   }
}
