import com.mojang.logging.LogUtils;
import java.text.DateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class eor extends ged {
   static final Logger a = LogUtils.getLogger();
   private static final te b = te.c("mco.configure.world.subscription.title");
   private static final te c = te.c("mco.configure.world.subscription.start");
   private static final te y = te.c("mco.configure.world.subscription.timeleft");
   private static final te z = te.c("mco.configure.world.subscription.recurring.daysleft");
   private static final te A = te.c("mco.configure.world.subscription.expired");
   private static final te B = te.c("mco.configure.world.subscription.less_than_a_day");
   private static final te C = te.c("mco.configure.world.subscription.unknown");
   private static final te D = te.c("mco.configure.world.subscription.recurring.info");
   private final exv E;
   final emo F;
   final exv G;
   private te H = C;
   private te I = C;
   @Nullable
   private enb.a J;

   public eor(exv $$0, emo $$1, exv $$2) {
      super(eqf.a);
      this.E = $$0;
      this.F = $$1;
      this.G = $$2;
   }

   @Override
   public void aE_() {
      this.a(this.F.a);
      this.d(esi.a(te.c("mco.configure.world.subscription.extend"), $$0 -> {
         String $$1 = aql.a(this.F.b, this.f.U().b());
         this.f.o.a($$1);
         ac.i().a($$1);
      }).a(this.g / 2 - 100, h(6), 200, 20).a());
      if (this.F.j) {
         this.d(esi.a(te.c("mco.configure.world.delete.button"), $$0 -> {
            te $$1 = te.c("mco.configure.world.delete.question.line1");
            te $$2 = te.c("mco.configure.world.delete.question.line2");
            this.f.a(new eoe(this::c, eoe.a.a, $$1, $$2, true));
         }).a(this.g / 2 - 100, h(10), 200, 20).a());
      } else {
         this.d(new ess(this.g / 2 - 100, h(8), 200, 46, D, this.i).a(-6250336));
      }

      this.d(esi.a(td.k, $$0 -> this.f.a(this.E)).a(this.g / 2 - 100, h(12), 200, 20).a());
   }

   @Override
   public te e() {
      return td.b(b, c, this.I, y, this.H);
   }

   private void c(boolean $$0) {
      if ($$0) {
         (new Thread("Realms-delete-realm") {
            @Override
            public void run() {
               try {
                  elx $$0 = elx.a();
                  $$0.i(eor.this.F.a);
               } catch (enk var2) {
                  eor.a.error("Couldn't delete world", var2);
               }

               eor.this.f.execute(() -> eor.this.f.a(eor.this.G));
            }
         }).start();
      }

      this.f.a(this);
   }

   private void a(long $$0) {
      elx $$1 = elx.a();

      try {
         enb $$2 = $$1.h($$0);
         this.H = this.a($$2.b);
         this.I = b($$2.a);
         this.J = $$2.c;
      } catch (enk var5) {
         a.error("Couldn't get subscription", var5);
         this.f.a(new eoc(var5, this.E));
      }
   }

   private static te b(long $$0) {
      Calendar $$1 = new GregorianCalendar(TimeZone.getDefault());
      $$1.setTimeInMillis($$0);
      return te.b(DateFormat.getDateTimeInstance().format($$1.getTime()));
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if ($$0 == 256) {
         this.f.a(this.E);
         return true;
      } else {
         return super.a($$0, $$1, $$2);
      }
   }

   @Override
   public void a(erx $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      int $$4 = this.g / 2 - 100;
      $$0.a(this.i, b, this.g / 2, 17, -1);
      $$0.a(this.i, c, $$4, h(0), -6250336, false);
      $$0.a(this.i, this.I, $$4, h(1), -1, false);
      if (this.J == enb.a.a) {
         $$0.a(this.i, y, $$4, h(3), -6250336, false);
      } else if (this.J == enb.a.b) {
         $$0.a(this.i, z, $$4, h(3), -6250336, false);
      }

      $$0.a(this.i, this.H, $$4, h(4), -1, false);
   }

   private te a(int $$0) {
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
            return te.a("mco.configure.world.subscription.remaining.months.days", $$1, $$2);
         } else if ($$3) {
            return te.a("mco.configure.world.subscription.remaining.months", $$1);
         } else {
            return $$4 ? te.a("mco.configure.world.subscription.remaining.days", $$2) : te.h();
         }
      }
   }
}
