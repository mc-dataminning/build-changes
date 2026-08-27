import com.mojang.logging.LogUtils;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fmu extends fjx {
   public static final int a = 308;
   public static final int b = 100;
   public static final int c = 74;
   public static final int d = 64;
   private static final Logger p = LogUtils.getLogger();
   private final fvg q = new fvg();
   private final fjx r;
   protected fmy o;
   private fvf s;
   private fdy u;
   private fdy v;
   private fdy w;
   private fve x;
   private gpy.b y;
   @Nullable
   private gpy.a z;
   private boolean A;

   public fmu(fjx $$0) {
      super(wi.c("multiplayer.title"));
      this.r = $$0;
   }

   @Override
   protected void aM_() {
      if (this.A) {
         this.o.a(this.k, this.l - 64 - 32, 0, 32);
      } else {
         this.A = true;
         this.s = new fvf(this.j);
         this.s.a();
         this.y = new gpy.b();

         try {
            this.z = new gpy.a(this.y);
            this.z.start();
         } catch (Exception var8) {
            p.warn("Unable to start LAN server detection: {}", var8.getMessage());
         }

         this.o = new fmy(this, this.j, this.k, this.l - 64 - 32, 32, 36);
         this.o.a(this.s);
      }

      this.c(this.o);
      this.v = this.c(fdy.a(wi.c("selectServer.select"), $$0 -> this.m()).a(100).a());
      fdy $$1 = this.c(fdy.a(wi.c("selectServer.direct"), $$0 -> {
         this.x = new fve(gmx.a("selectServer.defaultName"), "", fve.c.c);
         this.j.a(new fix(this, this::g, this.x));
      }).a(100).a());
      fdy $$2 = this.c(fdy.a(wi.c("selectServer.add"), $$0 -> {
         this.x = new fve(gmx.a("selectServer.defaultName"), "", fve.c.c);
         this.j.a(new fiz(this, this::f, this.x));
      }).a(100).a());
      this.u = this.c(fdy.a(wi.c("selectServer.edit"), $$0 -> {
         fmy.a $$1x = this.o.h();
         if ($$1x instanceof fmy.d) {
            fve $$2x = ((fmy.d)$$1x).c();
            this.x = new fve($$2x.a, $$2x.b, fve.c.c);
            this.x.b($$2x);
            this.j.a(new fiz(this, this::e, this.x));
         }
      }).a(74).a());
      this.w = this.c(fdy.a(wi.c("selectServer.delete"), $$0 -> {
         fmy.a $$1x = this.o.h();
         if ($$1x instanceof fmy.d) {
            String $$2x = ((fmy.d)$$1x).c().a;
            if ($$2x != null) {
               wi $$3x = wi.c("selectServer.deleteQuestion");
               wi $$4x = wi.a("selectServer.deleteWarning", $$2x);
               wi $$5x = wi.c("selectServer.deleteButton");
               wi $$6x = wh.e;
               this.j.a(new fip(this::c, $$3x, $$4x, $$5x, $$6x));
            }
         }
      }).a(74).a());
      fdy $$3 = this.c(fdy.a(wi.c("selectServer.refresh"), $$0 -> this.F()).a(74).a());
      fdy $$4 = this.c(fdy.a(wh.k, $$0 -> this.d()).a(74).a());
      fhp $$5 = fhp.d();
      fhi $$6 = $$5.a(new fhi(308, 20, fhi.b.a));
      $$6.a(this.v);
      $$6.a($$1);
      $$6.a($$2);
      $$5.a(fhq.b(4));
      fhi $$7 = $$5.a(new fhi(308, 20, fhi.b.a));
      $$7.a(this.u);
      $$7.a(this.w);
      $$7.a($$3);
      $$7.a($$4);
      $$5.a();
      fhj.a($$5, 0, this.l - 64, this.k, 64);
      this.C();
   }

   @Override
   public void d() {
      this.j.a(this.r);
   }

   @Override
   public void e() {
      super.e();
      List<gpx> $$0 = this.y.a();
      if ($$0 != null) {
         this.o.a($$0);
      }

      this.q.a();
   }

   @Override
   public void j() {
      if (this.z != null) {
         this.z.interrupt();
         this.z = null;
      }

      this.q.b();
      this.o.d();
   }

   private void F() {
      this.j.a(new fmu(this.r));
   }

   private void c(boolean $$0) {
      fmy.a $$1 = this.o.h();
      if ($$0 && $$1 instanceof fmy.d) {
         this.s.a(((fmy.d)$$1).c());
         this.s.b();
         this.o.a(null);
         this.o.a(this.s);
      }

      this.j.a(this);
   }

   private void e(boolean $$0) {
      fmy.a $$1 = this.o.h();
      if ($$0 && $$1 instanceof fmy.d) {
         fve $$2 = ((fmy.d)$$1).c();
         $$2.a = this.x.a;
         $$2.b = this.x.b;
         $$2.b(this.x);
         this.s.b();
         this.o.a(this.s);
      }

      this.j.a(this);
   }

   private void f(boolean $$0) {
      if ($$0) {
         fve $$1 = this.s.b(this.x.b);
         if ($$1 != null) {
            $$1.a(this.x);
            this.s.b();
         } else {
            this.s.a(this.x, false);
            this.s.b();
         }

         this.o.a(null);
         this.o.a(this.s);
      }

      this.j.a(this);
   }

   private void g(boolean $$0) {
      if ($$0) {
         fve $$1 = this.s.a(this.x.b);
         if ($$1 == null) {
            this.s.a(this.x, true);
            this.s.b();
            this.a(this.x);
         } else {
            this.a($$1);
         }
      } else {
         this.j.a(this);
      }
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if (super.a($$0, $$1, $$2)) {
         return true;
      } else if ($$0 == 294) {
         this.F();
         return true;
      } else if (this.o.h() != null) {
         if (fhz.a($$0)) {
            this.m();
            return true;
         } else {
            return this.o.a($$0, $$1, $$2);
         }
      } else {
         return false;
      }
   }

   @Override
   public void a(fdl $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.m, this.i, this.k / 2, 20, 16777215);
   }

   public void m() {
      fmy.a $$0 = this.o.h();
      if ($$0 instanceof fmy.d) {
         this.a(((fmy.d)$$0).c());
      } else if ($$0 instanceof fmy.c) {
         gpx $$1 = ((fmy.c)$$0).b();
         this.a(new fve($$1.a(), $$1.b(), fve.c.a));
      }
   }

   private void a(fve $$0) {
      fiq.a(this, this.j, fwh.a($$0.b), $$0, false, null);
   }

   public void a(fmy.a $$0) {
      this.o.a($$0);
      this.C();
   }

   protected void C() {
      this.v.j = false;
      this.u.j = false;
      this.w.j = false;
      fmy.a $$0 = this.o.h();
      if ($$0 != null && !($$0 instanceof fmy.b)) {
         this.v.j = true;
         if ($$0 instanceof fmy.d) {
            this.u.j = true;
            this.w.j = true;
         }
      }
   }

   public fvg D() {
      return this.q;
   }

   public fvf E() {
      return this.s;
   }
}
