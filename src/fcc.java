import com.mojang.logging.LogUtils;
import java.text.DateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fcc extends gty {
   static final Logger a = LogUtils.getLogger();
   private static final wx b = wx.c("mco.configure.world.subscription.title");
   private static final wx c = wx.c("mco.configure.world.subscription.start");
   private static final wx B = wx.c("mco.configure.world.subscription.timeleft");
   private static final wx C = wx.c("mco.configure.world.subscription.recurring.daysleft");
   private static final wx D = wx.c("mco.configure.world.subscription.expired");
   private static final wx E = wx.c("mco.configure.world.subscription.less_than_a_day");
   private static final wx F = wx.c("mco.configure.world.subscription.unknown");
   private static final wx G = wx.c("mco.configure.world.subscription.recurring.info");
   private final fly H;
   final ezz I;
   final fly J;
   private wx K = F;
   private wx L = F;
   @Nullable
   private fam.a M;

   public fcc(fly $$0, ezz $$1, fly $$2) {
      super(fdr.a);
      this.H = $$0;
      this.I = $$1;
      this.J = $$2;
   }

   @Override
   public void aM_() {
      this.a(this.I.a);
      this.c(ffz.a(wx.c("mco.configure.world.subscription.extend"), $$0 -> fkp.a(this, axa.a(this.I.b, this.m.X().b()))).a(this.n / 2 - 100, g(6), 200, 20).a());
      if (this.I.j) {
         this.c(ffz.a(wx.c("mco.configure.world.delete.button"), $$0 -> {
            wx $$1 = wx.c("mco.configure.world.delete.question.line1");
            wx $$2 = wx.c("mco.configure.world.delete.question.line2");
            this.m.a(new fbo(this::c, fbo.a.a, $$1, $$2, true));
         }).a(this.n / 2 - 100, g(10), 200, 20).a());
      } else if (ezd.b() && this.I.s != null) {
         this.c(new fgj(this.n / 2 - 100, g(8), 200, 46, wx.a("mco.snapshot.subscription.info", this.I.s), this.p).a(-6250336));
      } else {
         this.c(new fgj(this.n / 2 - 100, g(8), 200, 46, G, this.p).a(-6250336));
      }

      this.c(ffz.a(ww.k, $$0 -> this.d()).a(this.n / 2 - 100, g(12), 200, 20).a());
   }

   @Override
   public wx i() {
      return ww.b(b, c, this.L, B, this.K);
   }

   private void c(boolean $$0) {
      if ($$0) {
         (new Thread("Realms-delete-realm") {
            @Override
            public void run() {
               try {
                  ezi $$0 = ezi.a();
                  $$0.i(fcc.this.I.a);
               } catch (fav var2) {
                  fcc.a.error("Couldn't delete world", var2);
               }

               fcc.this.m.execute(() -> fcc.this.m.a(fcc.this.J));
            }
         }).start();
      }

      this.m.a(this);
   }

   private void a(long $$0) {
      ezi $$1 = ezi.a();

      try {
         fam $$2 = $$1.h($$0);
         this.K = this.a($$2.b);
         this.L = b($$2.a);
         this.M = $$2.c;
      } catch (fav var5) {
         a.error("Couldn't get subscription", var5);
         this.m.a(new fbm(var5, this.H));
      }
   }

   private static wx b(long $$0) {
      Calendar $$1 = new GregorianCalendar(TimeZone.getDefault());
      $$1.setTimeInMillis($$0);
      return wx.b(DateFormat.getDateTimeInstance().format($$1.getTime()));
   }

   @Override
   public void d() {
      this.m.a(this.H);
   }

   @Override
   public void a(ffm $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      int $$4 = this.n / 2 - 100;
      $$0.a(this.p, b, this.n / 2, 17, -1);
      $$0.a(this.p, c, $$4, g(0), -6250336, false);
      $$0.a(this.p, this.L, $$4, g(1), -1, false);
      if (this.M == fam.a.a) {
         $$0.a(this.p, B, $$4, g(3), -6250336, false);
      } else if (this.M == fam.a.b) {
         $$0.a(this.p, C, $$4, g(3), -6250336, false);
      }

      $$0.a(this.p, this.K, $$4, g(4), -1, false);
   }

   private wx a(int $$0) {
      if ($$0 < 0 && this.I.j) {
         return D;
      } else if ($$0 <= 1) {
         return E;
      } else {
         int $$1 = $$0 / 30;
         int $$2 = $$0 % 30;
         boolean $$3 = $$1 > 0;
         boolean $$4 = $$2 > 0;
         if ($$3 && $$4) {
            return wx.a("mco.configure.world.subscription.remaining.months.days", $$1, $$2);
         } else if ($$3) {
            return wx.a("mco.configure.world.subscription.remaining.months", $$1);
         } else {
            return $$4 ? wx.a("mco.configure.world.subscription.remaining.days", $$2) : wx.i();
         }
      }
   }
}
