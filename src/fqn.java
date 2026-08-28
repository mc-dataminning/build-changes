import com.mojang.logging.LogUtils;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fqn extends fnx {
   public static final int a = 308;
   public static final int b = 100;
   public static final int c = 74;
   public static final int q = 64;
   private static final Logger s = LogUtils.getLogger();
   private final fzp u = new fzp();
   private final fnx v;
   protected fqr r;
   private fzo w;
   private fig x;
   private fig y;
   private fig z;
   private fzn A;
   private guj.b B;
   @Nullable
   private guj.a C;
   private boolean D;

   public fqn(fnx $$0) {
      super(wy.c("multiplayer.title"));
      this.v = $$0;
   }

   @Override
   protected void aP_() {
      if (this.D) {
         this.r.a(this.m, this.n - 64 - 32, 0, 32);
      } else {
         this.D = true;
         this.w = new fzo(this.l);
         this.w.a();
         this.B = new guj.b();

         try {
            this.C = new guj.a(this.B);
            this.C.start();
         } catch (Exception var8) {
            s.warn("Unable to start LAN server detection: {}", var8.getMessage());
         }

         this.r = new fqr(this, this.l, this.m, this.n - 64 - 32, 32, 36);
         this.r.a(this.w);
      }

      this.c(this.r);
      this.y = this.c(fig.a(wy.c("selectServer.select"), $$0 -> this.m()).a(100).a());
      fig $$1 = this.c(fig.a(wy.c("selectServer.direct"), $$0 -> {
         this.A = new fzn(grl.a("selectServer.defaultName"), "", fzn.c.c);
         this.l.a(new fnd(this, this::g, this.A));
      }).a(100).a());
      fig $$2 = this.c(fig.a(wy.c("selectServer.add"), $$0 -> {
         this.A = new fzn(grl.a("selectServer.defaultName"), "", fzn.c.c);
         this.l.a(new fnf(this, this::f, this.A));
      }).a(100).a());
      this.x = this.c(fig.a(wy.c("selectServer.edit"), $$0 -> {
         fqr.a $$1x = this.r.h();
         if ($$1x instanceof fqr.d) {
            fzn $$2x = ((fqr.d)$$1x).c();
            this.A = new fzn($$2x.a, $$2x.b, fzn.c.c);
            this.A.b($$2x);
            this.l.a(new fnf(this, this::e, this.A));
         }
      }).a(74).a());
      this.z = this.c(fig.a(wy.c("selectServer.delete"), $$0 -> {
         fqr.a $$1x = this.r.h();
         if ($$1x instanceof fqr.d) {
            String $$2x = ((fqr.d)$$1x).c().a;
            if ($$2x != null) {
               wy $$3x = wy.c("selectServer.deleteQuestion");
               wy $$4x = wy.a("selectServer.deleteWarning", $$2x);
               wy $$5x = wy.c("selectServer.deleteButton");
               wy $$6x = wx.e;
               this.l.a(new fmv(this::c, $$3x, $$4x, $$5x, $$6x));
            }
         }
      }).a(74).a());
      fig $$3 = this.c(fig.a(wy.c("selectServer.refresh"), $$0 -> this.G()).a(74).a());
      fig $$4 = this.c(fig.a(wx.k, $$0 -> this.d()).a(74).a());
      flx $$5 = flx.d();
      flq $$6 = $$5.a(new flq(308, 20, flq.b.a));
      $$6.a(this.y);
      $$6.a($$1);
      $$6.a($$2);
      $$5.a(fly.b(4));
      flq $$7 = $$5.a(new flq(308, 20, flq.b.a));
      $$7.a(this.x);
      $$7.a(this.z);
      $$7.a($$3);
      $$7.a($$4);
      $$5.a();
      flr.a($$5, 0, this.n - 64, this.m, 64);
      this.D();
   }

   @Override
   public void d() {
      this.l.a(this.v);
   }

   @Override
   public void e() {
      super.e();
      List<gui> $$0 = this.B.a();
      if ($$0 != null) {
         this.r.a($$0);
      }

      this.u.a();
   }

   @Override
   public void j() {
      if (this.C != null) {
         this.C.interrupt();
         this.C = null;
      }

      this.u.b();
      this.r.c();
   }

   private void G() {
      this.l.a(new fqn(this.v));
   }

   private void c(boolean $$0) {
      fqr.a $$1 = this.r.h();
      if ($$0 && $$1 instanceof fqr.d) {
         this.w.a(((fqr.d)$$1).c());
         this.w.b();
         this.r.a(null);
         this.r.a(this.w);
      }

      this.l.a(this);
   }

   private void e(boolean $$0) {
      fqr.a $$1 = this.r.h();
      if ($$0 && $$1 instanceof fqr.d) {
         fzn $$2 = ((fqr.d)$$1).c();
         $$2.a = this.A.a;
         $$2.b = this.A.b;
         $$2.b(this.A);
         this.w.b();
         this.r.a(this.w);
      }

      this.l.a(this);
   }

   private void f(boolean $$0) {
      if ($$0) {
         fzn $$1 = this.w.b(this.A.b);
         if ($$1 != null) {
            $$1.a(this.A);
            this.w.b();
         } else {
            this.w.a(this.A, false);
            this.w.b();
         }

         this.r.a(null);
         this.r.a(this.w);
      }

      this.l.a(this);
   }

   private void g(boolean $$0) {
      if ($$0) {
         fzn $$1 = this.w.a(this.A.b);
         if ($$1 == null) {
            this.w.a(this.A, true);
            this.w.b();
            this.a(this.A);
         } else {
            this.a($$1);
         }
      } else {
         this.l.a(this);
      }
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if (super.a($$0, $$1, $$2)) {
         return true;
      } else if ($$0 == 294) {
         this.G();
         return true;
      } else if (this.r.h() != null) {
         if (fmh.a($$0)) {
            this.m();
            return true;
         } else {
            return this.r.a($$0, $$1, $$2);
         }
      } else {
         return false;
      }
   }

   @Override
   public void a(fht $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.o, this.k, this.m / 2, 20, 16777215);
   }

   public void m() {
      fqr.a $$0 = this.r.h();
      if ($$0 instanceof fqr.d) {
         this.a(((fqr.d)$$0).c());
      } else if ($$0 instanceof fqr.c) {
         gui $$1 = ((fqr.c)$$0).b();
         this.a(new fzn($$1.a(), $$1.b(), fzn.c.a));
      }
   }

   private void a(fzn $$0) {
      fmw.a(this, this.l, gar.a($$0.b), $$0, false, null);
   }

   public void a(fqr.a $$0) {
      this.r.a($$0);
      this.D();
   }

   protected void D() {
      this.y.j = false;
      this.x.j = false;
      this.z.j = false;
      fqr.a $$0 = this.r.h();
      if ($$0 != null && !($$0 instanceof fqr.b)) {
         this.y.j = true;
         if ($$0 instanceof fqr.d) {
            this.x.j = true;
            this.z.j = true;
         }
      }
   }

   public fzp E() {
      return this.u;
   }

   public fzo F() {
      return this.w;
   }
}
