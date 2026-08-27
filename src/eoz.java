import com.mojang.logging.LogUtils;
import java.text.DateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class eoz extends gfb {
   static final Logger a = LogUtils.getLogger();
   private static final tl b = tl.c("mco.configure.world.subscription.title");
   private static final tl c = tl.c("mco.configure.world.subscription.start");
   private static final tl y = tl.c("mco.configure.world.subscription.timeleft");
   private static final tl z = tl.c("mco.configure.world.subscription.recurring.daysleft");
   private static final tl A = tl.c("mco.configure.world.subscription.expired");
   private static final tl B = tl.c("mco.configure.world.subscription.less_than_a_day");
   private static final tl C = tl.c("mco.configure.world.subscription.unknown");
   private static final tl D = tl.c("mco.configure.world.subscription.recurring.info");
   private final eyk E;
   final emw F;
   final eyk G;
   private tl H = C;
   private tl I = C;
   @Nullable
   private enj.a J;

   public eoz(eyk $$0, emw $$1, eyk $$2) {
      super(eqn.a);
      this.E = $$0;
      this.F = $$1;
      this.G = $$2;
   }

   @Override
   public void aI_() {
      this.a(this.F.a);
      this.d(esq.a(tl.c("mco.configure.world.subscription.extend"), $$0 -> {
         String $$1 = aqv.a(this.F.b, this.f.V().b());
         this.f.o.a($$1);
         ac.i().a($$1);
      }).a(this.g / 2 - 100, h(6), 200, 20).a());
      if (this.F.j) {
         this.d(esq.a(tl.c("mco.configure.world.delete.button"), $$0 -> {
            tl $$1 = tl.c("mco.configure.world.delete.question.line1");
            tl $$2 = tl.c("mco.configure.world.delete.question.line2");
            this.f.a(new eol(this::c, eol.a.a, $$1, $$2, true));
         }).a(this.g / 2 - 100, h(10), 200, 20).a());
      } else {
         this.d(new eta(this.g / 2 - 100, h(8), 200, 46, D, this.i).a(-6250336));
      }

      this.d(esq.a(tk.k, $$0 -> this.f.a(this.E)).a(this.g / 2 - 100, h(12), 200, 20).a());
   }

   @Override
   public tl g() {
      return tk.b(b, c, this.I, y, this.H);
   }

   private void c(boolean $$0) {
      if ($$0) {
         (new Thread("Realms-delete-realm") {
            @Override
            public void run() {
               try {
                  emf $$0 = emf.a();
                  $$0.i(eoz.this.F.a);
               } catch (ens var2) {
                  eoz.a.error("Couldn't delete world", var2);
               }

               eoz.this.f.execute(() -> eoz.this.f.a(eoz.this.G));
            }
         }).start();
      }

      this.f.a(this);
   }

   private void a(long $$0) {
      emf $$1 = emf.a();

      try {
         enj $$2 = $$1.h($$0);
         this.H = this.a($$2.b);
         this.I = b($$2.a);
         this.J = $$2.c;
      } catch (ens var5) {
         a.error("Couldn't get subscription", var5);
         this.f.a(new eoj(var5, this.E));
      }
   }

   private static tl b(long $$0) {
      Calendar $$1 = new GregorianCalendar(TimeZone.getDefault());
      $$1.setTimeInMillis($$0);
      return tl.b(DateFormat.getDateTimeInstance().format($$1.getTime()));
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
   public void a(esf $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      int $$4 = this.g / 2 - 100;
      $$0.a(this.i, b, this.g / 2, 17, -1);
      $$0.a(this.i, c, $$4, h(0), -6250336, false);
      $$0.a(this.i, this.I, $$4, h(1), -1, false);
      if (this.J == enj.a.a) {
         $$0.a(this.i, y, $$4, h(3), -6250336, false);
      } else if (this.J == enj.a.b) {
         $$0.a(this.i, z, $$4, h(3), -6250336, false);
      }

      $$0.a(this.i, this.H, $$4, h(4), -1, false);
   }

   private tl a(int $$0) {
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
            return tl.a("mco.configure.world.subscription.remaining.months.days", $$1, $$2);
         } else if ($$3) {
            return tl.a("mco.configure.world.subscription.remaining.months", $$1);
         } else {
            return $$4 ? tl.a("mco.configure.world.subscription.remaining.days", $$2) : tl.h();
         }
      }
   }
}
