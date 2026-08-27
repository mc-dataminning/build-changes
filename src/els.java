import com.mojang.logging.LogUtils;
import java.text.DateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class els extends gan {
   static final Logger a = LogUtils.getLogger();
   private static final sw b = sw.c("mco.configure.world.subscription.title");
   private static final sw c = sw.c("mco.configure.world.subscription.start");
   private static final sw G = sw.c("mco.configure.world.subscription.timeleft");
   private static final sw H = sw.c("mco.configure.world.subscription.recurring.daysleft");
   private static final sw I = sw.c("mco.configure.world.subscription.expired");
   private static final sw J = sw.c("mco.configure.world.subscription.less_than_a_day");
   private static final sw K = sw.c("mco.configure.world.subscription.unknown");
   private static final sw L = sw.c("mco.configure.world.subscription.recurring.info");
   private final euq M;
   final ejq N;
   final euq O;
   private sw P = K;
   private sw Q = K;
   @Nullable
   private ekd.a R;

   public els(euq $$0, ejq $$1, euq $$2) {
      super(enf.a);
      this.M = $$0;
      this.N = $$1;
      this.O = $$2;
   }

   @Override
   public void b() {
      this.a(this.N.a);
      this.d(epi.a(sw.c("mco.configure.world.subscription.extend"), $$0 -> {
         String $$1 = anx.a(this.N.b, this.f.U().b());
         this.f.o.a($$1);
         ac.i().a($$1);
      }).a(this.g / 2 - 100, h(6), 200, 20).a());
      if (this.N.j) {
         this.d(epi.a(sw.c("mco.configure.world.delete.button"), $$0 -> {
            sw $$1 = sw.c("mco.configure.world.delete.question.line1");
            sw $$2 = sw.c("mco.configure.world.delete.question.line2");
            this.f.a(new elg(this::c, elg.a.a, $$1, $$2, true));
         }).a(this.g / 2 - 100, h(10), 200, 20).a());
      } else {
         this.d(new eps(this.g / 2 - 100, h(8), 200, 46, L, this.i).a(10526880));
      }

      this.d(epi.a(sv.k, $$0 -> this.f.a(this.M)).a(this.g / 2 - 100, h(12), 200, 20).a());
   }

   @Override
   public sw au_() {
      return sv.b(b, c, this.Q, G, this.P);
   }

   private void c(boolean $$0) {
      if ($$0) {
         (new Thread("Realms-delete-realm") {
            @Override
            public void run() {
               try {
                  eiz $$0 = eiz.a();
                  $$0.i(els.this.N.a);
               } catch (ekm var2) {
                  els.a.error("Couldn't delete world", var2);
               }

               els.this.f.execute(() -> els.this.f.a(els.this.O));
            }
         }).start();
      }

      this.f.a(this);
   }

   private void a(long $$0) {
      eiz $$1 = eiz.a();

      try {
         ekd $$2 = $$1.h($$0);
         this.P = this.a($$2.b);
         this.Q = b($$2.a);
         this.R = $$2.c;
      } catch (ekm var5) {
         a.error("Couldn't get subscription");
         this.f.a(new ele(var5, this.M));
      }
   }

   private static sw b(long $$0) {
      Calendar $$1 = new GregorianCalendar(TimeZone.getDefault());
      $$1.setTimeInMillis($$0);
      return sw.b(DateFormat.getDateTimeInstance().format($$1.getTime()));
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if ($$0 == 256) {
         this.f.a(this.M);
         return true;
      } else {
         return super.a($$0, $$1, $$2);
      }
   }

   @Override
   public void a(eox $$0, int $$1, int $$2, float $$3) {
      this.a($$0);
      int $$4 = this.g / 2 - 100;
      $$0.a(this.i, b, this.g / 2, 17, 16777215);
      $$0.a(this.i, c, $$4, h(0), 10526880, false);
      $$0.a(this.i, this.Q, $$4, h(1), 16777215, false);
      if (this.R == ekd.a.a) {
         $$0.a(this.i, G, $$4, h(3), 10526880, false);
      } else if (this.R == ekd.a.b) {
         $$0.a(this.i, H, $$4, h(3), 10526880, false);
      }

      $$0.a(this.i, this.P, $$4, h(4), 16777215, false);
      super.a($$0, $$1, $$2, $$3);
   }

   private sw a(int $$0) {
      if ($$0 < 0 && this.N.j) {
         return I;
      } else if ($$0 <= 1) {
         return J;
      } else {
         int $$1 = $$0 / 30;
         int $$2 = $$0 % 30;
         boolean $$3 = $$1 > 0;
         boolean $$4 = $$2 > 0;
         if ($$3 && $$4) {
            return sw.a("mco.configure.world.subscription.remaining.months.days", $$1, $$2);
         } else if ($$3) {
            return sw.a("mco.configure.world.subscription.remaining.months", $$1);
         } else {
            return $$4 ? sw.a("mco.configure.world.subscription.remaining.days", $$2) : sw.h();
         }
      }
   }
}
