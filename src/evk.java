import com.mojang.logging.LogUtils;
import java.text.DateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class evk extends gmw {
   static final Logger a = LogUtils.getLogger();
   private static final vq b = vq.c("mco.configure.world.subscription.title");
   private static final vq c = vq.c("mco.configure.world.subscription.start");
   private static final vq v = vq.c("mco.configure.world.subscription.timeleft");
   private static final vq w = vq.c("mco.configure.world.subscription.recurring.daysleft");
   private static final vq x = vq.c("mco.configure.world.subscription.expired");
   private static final vq y = vq.c("mco.configure.world.subscription.less_than_a_day");
   private static final vq z = vq.c("mco.configure.world.subscription.unknown");
   private static final vq A = vq.c("mco.configure.world.subscription.recurring.info");
   private final ffe B;
   final eth C;
   final ffe D;
   private vq E = z;
   private vq F = z;
   @Nullable
   private etu.a G;

   public evk(ffe $$0, eth $$1, ffe $$2) {
      super(ewz.a);
      this.B = $$0;
      this.C = $$1;
      this.D = $$2;
   }

   @Override
   public void aQ_() {
      this.a(this.C.a);
      this.d(ezh.a(vq.c("mco.configure.world.subscription.extend"), $$0 -> fdw.a(this, avd.a(this.C.b, this.f.V().b()))).a(this.g / 2 - 100, g(6), 200, 20).a());
      if (this.C.j) {
         this.d(ezh.a(vq.c("mco.configure.world.delete.button"), $$0 -> {
            vq $$1 = vq.c("mco.configure.world.delete.question.line1");
            vq $$2 = vq.c("mco.configure.world.delete.question.line2");
            this.f.a(new euw(this::c, euw.a.a, $$1, $$2, true));
         }).a(this.g / 2 - 100, g(10), 200, 20).a());
      } else if (esl.b() && this.C.s != null) {
         this.d(new ezr(this.g / 2 - 100, g(8), 200, 46, vq.a("mco.snapshot.subscription.info", this.C.s), this.i).a(-6250336));
      } else {
         this.d(new ezr(this.g / 2 - 100, g(8), 200, 46, A, this.i).a(-6250336));
      }

      this.d(ezh.a(vp.k, $$0 -> this.d()).a(this.g / 2 - 100, g(12), 200, 20).a());
   }

   @Override
   public vq i() {
      return vp.b(b, c, this.F, v, this.E);
   }

   private void c(boolean $$0) {
      if ($$0) {
         (new Thread("Realms-delete-realm") {
            @Override
            public void run() {
               try {
                  esq $$0 = esq.a();
                  $$0.i(evk.this.C.a);
               } catch (eud var2) {
                  evk.a.error("Couldn't delete world", var2);
               }

               evk.this.f.execute(() -> evk.this.f.a(evk.this.D));
            }
         }).start();
      }

      this.f.a(this);
   }

   private void a(long $$0) {
      esq $$1 = esq.a();

      try {
         etu $$2 = $$1.h($$0);
         this.E = this.a($$2.b);
         this.F = b($$2.a);
         this.G = $$2.c;
      } catch (eud var5) {
         a.error("Couldn't get subscription", var5);
         this.f.a(new euu(var5, this.B));
      }
   }

   private static vq b(long $$0) {
      Calendar $$1 = new GregorianCalendar(TimeZone.getDefault());
      $$1.setTimeInMillis($$0);
      return vq.b(DateFormat.getDateTimeInstance().format($$1.getTime()));
   }

   @Override
   public void d() {
      this.f.a(this.B);
   }

   @Override
   public void a(eyu $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      int $$4 = this.g / 2 - 100;
      $$0.a(this.i, b, this.g / 2, 17, -1);
      $$0.a(this.i, c, $$4, g(0), -6250336, false);
      $$0.a(this.i, this.F, $$4, g(1), -1, false);
      if (this.G == etu.a.a) {
         $$0.a(this.i, v, $$4, g(3), -6250336, false);
      } else if (this.G == etu.a.b) {
         $$0.a(this.i, w, $$4, g(3), -6250336, false);
      }

      $$0.a(this.i, this.E, $$4, g(4), -1, false);
   }

   private vq a(int $$0) {
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
            return vq.a("mco.configure.world.subscription.remaining.months.days", $$1, $$2);
         } else if ($$3) {
            return vq.a("mco.configure.world.subscription.remaining.months", $$1);
         } else {
            return $$4 ? vq.a("mco.configure.world.subscription.remaining.days", $$2) : vq.i();
         }
      }
   }
}
