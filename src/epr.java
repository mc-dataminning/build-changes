import com.mojang.logging.LogUtils;
import java.text.DateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class epr extends gfx {
   static final Logger a = LogUtils.getLogger();
   private static final ui b = ui.c("mco.configure.world.subscription.title");
   private static final ui c = ui.c("mco.configure.world.subscription.start");
   private static final ui y = ui.c("mco.configure.world.subscription.timeleft");
   private static final ui z = ui.c("mco.configure.world.subscription.recurring.daysleft");
   private static final ui A = ui.c("mco.configure.world.subscription.expired");
   private static final ui B = ui.c("mco.configure.world.subscription.less_than_a_day");
   private static final ui C = ui.c("mco.configure.world.subscription.unknown");
   private static final ui D = ui.c("mco.configure.world.subscription.recurring.info");
   private final ezd E;
   final eno F;
   final ezd G;
   private ui H = C;
   private ui I = C;
   @Nullable
   private eob.a J;

   public epr(ezd $$0, eno $$1, ezd $$2) {
      super(erg.a);
      this.E = $$0;
      this.F = $$1;
      this.G = $$2;
   }

   @Override
   public void aM_() {
      this.a(this.F.a);
      this.d(etj.a(ui.c("mco.configure.world.subscription.extend"), $$0 -> {
         String $$1 = arv.a(this.F.b, this.f.V().b());
         this.f.o.a($$1);
         ac.i().a($$1);
      }).a(this.g / 2 - 100, h(6), 200, 20).a());
      if (this.F.j) {
         this.d(etj.a(ui.c("mco.configure.world.delete.button"), $$0 -> {
            ui $$1 = ui.c("mco.configure.world.delete.question.line1");
            ui $$2 = ui.c("mco.configure.world.delete.question.line2");
            this.f.a(new epd(this::c, epd.a.a, $$1, $$2, true));
         }).a(this.g / 2 - 100, h(10), 200, 20).a());
      } else if (ems.b() && this.F.s != null) {
         this.d(new ett(this.g / 2 - 100, h(8), 200, 46, ui.a("mco.snapshot.subscription.info", this.F.s), this.i).a(-6250336));
      } else {
         this.d(new ett(this.g / 2 - 100, h(8), 200, 46, D, this.i).a(-6250336));
      }

      this.d(etj.a(uh.k, $$0 -> this.f.a(this.E)).a(this.g / 2 - 100, h(12), 200, 20).a());
   }

   @Override
   public ui h() {
      return uh.b(b, c, this.I, y, this.H);
   }

   private void c(boolean $$0) {
      if ($$0) {
         (new Thread("Realms-delete-realm") {
            @Override
            public void run() {
               try {
                  emx $$0 = emx.a();
                  $$0.i(epr.this.F.a);
               } catch (eok var2) {
                  epr.a.error("Couldn't delete world", var2);
               }

               epr.this.f.execute(() -> epr.this.f.a(epr.this.G));
            }
         }).start();
      }

      this.f.a(this);
   }

   private void a(long $$0) {
      emx $$1 = emx.a();

      try {
         eob $$2 = $$1.h($$0);
         this.H = this.a($$2.b);
         this.I = b($$2.a);
         this.J = $$2.c;
      } catch (eok var5) {
         a.error("Couldn't get subscription", var5);
         this.f.a(new epb(var5, this.E));
      }
   }

   private static ui b(long $$0) {
      Calendar $$1 = new GregorianCalendar(TimeZone.getDefault());
      $$1.setTimeInMillis($$0);
      return ui.b(DateFormat.getDateTimeInstance().format($$1.getTime()));
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
   public void a(esy $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      int $$4 = this.g / 2 - 100;
      $$0.a(this.i, b, this.g / 2, 17, -1);
      $$0.a(this.i, c, $$4, h(0), -6250336, false);
      $$0.a(this.i, this.I, $$4, h(1), -1, false);
      if (this.J == eob.a.a) {
         $$0.a(this.i, y, $$4, h(3), -6250336, false);
      } else if (this.J == eob.a.b) {
         $$0.a(this.i, z, $$4, h(3), -6250336, false);
      }

      $$0.a(this.i, this.H, $$4, h(4), -1, false);
   }

   private ui a(int $$0) {
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
            return ui.a("mco.configure.world.subscription.remaining.months.days", $$1, $$2);
         } else if ($$3) {
            return ui.a("mco.configure.world.subscription.remaining.months", $$1);
         } else {
            return $$4 ? ui.a("mco.configure.world.subscription.remaining.days", $$2) : ui.i();
         }
      }
   }
}
