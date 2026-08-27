import com.mojang.logging.LogUtils;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fml extends fjo {
   public static final int a = 308;
   public static final int b = 100;
   public static final int c = 74;
   public static final int d = 64;
   private static final Logger p = LogUtils.getLogger();
   private final fux q = new fux();
   private final fjo r;
   protected fmp o;
   private fuw s;
   private fdp u;
   private fdp v;
   private fdp w;
   private fuv x;
   private gpp.b y;
   @Nullable
   private gpp.a z;
   private boolean A;

   public fml(fjo $$0) {
      super(wg.c("multiplayer.title"));
      this.r = $$0;
   }

   @Override
   protected void aN_() {
      if (this.A) {
         this.o.a(this.k, this.l - 64 - 32, 0, 32);
      } else {
         this.A = true;
         this.s = new fuw(this.j);
         this.s.a();
         this.y = new gpp.b();

         try {
            this.z = new gpp.a(this.y);
            this.z.start();
         } catch (Exception var8) {
            p.warn("Unable to start LAN server detection: {}", var8.getMessage());
         }

         this.o = new fmp(this, this.j, this.k, this.l - 64 - 32, 32, 36);
         this.o.a(this.s);
      }

      this.c(this.o);
      this.v = this.c(fdp.a(wg.c("selectServer.select"), $$0 -> this.m()).a(100).a());
      fdp $$1 = this.c(fdp.a(wg.c("selectServer.direct"), $$0 -> {
         this.x = new fuv(gmo.a("selectServer.defaultName"), "", fuv.c.c);
         this.j.a(new fio(this, this::g, this.x));
      }).a(100).a());
      fdp $$2 = this.c(fdp.a(wg.c("selectServer.add"), $$0 -> {
         this.x = new fuv(gmo.a("selectServer.defaultName"), "", fuv.c.c);
         this.j.a(new fiq(this, this::f, this.x));
      }).a(100).a());
      this.u = this.c(fdp.a(wg.c("selectServer.edit"), $$0 -> {
         fmp.a $$1x = this.o.h();
         if ($$1x instanceof fmp.d) {
            fuv $$2x = ((fmp.d)$$1x).c();
            this.x = new fuv($$2x.a, $$2x.b, fuv.c.c);
            this.x.b($$2x);
            this.j.a(new fiq(this, this::e, this.x));
         }
      }).a(74).a());
      this.w = this.c(fdp.a(wg.c("selectServer.delete"), $$0 -> {
         fmp.a $$1x = this.o.h();
         if ($$1x instanceof fmp.d) {
            String $$2x = ((fmp.d)$$1x).c().a;
            if ($$2x != null) {
               wg $$3x = wg.c("selectServer.deleteQuestion");
               wg $$4x = wg.a("selectServer.deleteWarning", $$2x);
               wg $$5x = wg.c("selectServer.deleteButton");
               wg $$6x = wf.e;
               this.j.a(new fig(this::c, $$3x, $$4x, $$5x, $$6x));
            }
         }
      }).a(74).a());
      fdp $$3 = this.c(fdp.a(wg.c("selectServer.refresh"), $$0 -> this.F()).a(74).a());
      fdp $$4 = this.c(fdp.a(wf.k, $$0 -> this.d()).a(74).a());
      fhg $$5 = fhg.d();
      fgz $$6 = $$5.a(new fgz(308, 20, fgz.b.a));
      $$6.a(this.v);
      $$6.a($$1);
      $$6.a($$2);
      $$5.a(fhh.b(4));
      fgz $$7 = $$5.a(new fgz(308, 20, fgz.b.a));
      $$7.a(this.u);
      $$7.a(this.w);
      $$7.a($$3);
      $$7.a($$4);
      $$5.a();
      fha.a($$5, 0, this.l - 64, this.k, 64);
      this.C();
   }

   @Override
   public void d() {
      this.j.a(this.r);
   }

   @Override
   public void e() {
      super.e();
      List<gpo> $$0 = this.y.a();
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
      this.j.a(new fml(this.r));
   }

   private void c(boolean $$0) {
      fmp.a $$1 = this.o.h();
      if ($$0 && $$1 instanceof fmp.d) {
         this.s.a(((fmp.d)$$1).c());
         this.s.b();
         this.o.a(null);
         this.o.a(this.s);
      }

      this.j.a(this);
   }

   private void e(boolean $$0) {
      fmp.a $$1 = this.o.h();
      if ($$0 && $$1 instanceof fmp.d) {
         fuv $$2 = ((fmp.d)$$1).c();
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
         fuv $$1 = this.s.b(this.x.b);
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
         fuv $$1 = this.s.a(this.x.b);
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
         if (fhq.a($$0)) {
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
   public void a(fdc $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.m, this.i, this.k / 2, 20, 16777215);
   }

   public void m() {
      fmp.a $$0 = this.o.h();
      if ($$0 instanceof fmp.d) {
         this.a(((fmp.d)$$0).c());
      } else if ($$0 instanceof fmp.c) {
         gpo $$1 = ((fmp.c)$$0).b();
         this.a(new fuv($$1.a(), $$1.b(), fuv.c.a));
      }
   }

   private void a(fuv $$0) {
      fih.a(this, this.j, fvy.a($$0.b), $$0, false, null);
   }

   public void a(fmp.a $$0) {
      this.o.a($$0);
      this.C();
   }

   protected void C() {
      this.v.j = false;
      this.u.j = false;
      this.w.j = false;
      fmp.a $$0 = this.o.h();
      if ($$0 != null && !($$0 instanceof fmp.b)) {
         this.v.j = true;
         if ($$0 instanceof fmp.d) {
            this.u.j = true;
            this.w.j = true;
         }
      }
   }

   public fux D() {
      return this.q;
   }

   public fuw E() {
      return this.s;
   }
}
