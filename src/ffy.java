import com.mojang.logging.LogUtils;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class ffy extends fda {
   public static final int a = 308;
   public static final int b = 100;
   public static final int c = 74;
   public static final int k = 64;
   private static final Logger m = LogUtils.getLogger();
   private final foe n = new foe();
   private final fda o;
   protected fgc l;
   private fod p;
   private exf q;
   private exf r;
   private exf t;
   @Nullable
   private List<vf> u;
   private foc v;
   private gis.b w;
   @Nullable
   private gis.a x;
   private boolean y;

   public ffy(fda $$0) {
      super(vf.c("multiplayer.title"));
      this.o = $$0;
   }

   @Override
   protected void aN_() {
      if (this.y) {
         this.l.a(this.g, this.h - 64 - 32, 0, 32);
      } else {
         this.y = true;
         this.p = new fod(this.f);
         this.p.a();
         this.w = new gis.b();

         try {
            this.x = new gis.a(this.w);
            this.x.start();
         } catch (Exception var8) {
            m.warn("Unable to start LAN server detection: {}", var8.getMessage());
         }

         this.l = new fgc(this, this.f, this.g, this.h - 64 - 32, 32, 36);
         this.l.a(this.p);
      }

      this.d(this.l);
      this.r = this.d(exf.a(vf.c("selectServer.select"), $$0 -> this.n()).a(100).a());
      exf $$1 = this.d(exf.a(vf.c("selectServer.direct"), $$0 -> {
         this.v = new foc(gfr.a("selectServer.defaultName"), "", foc.b.c);
         this.f.a(new fcb(this, this::g, this.v));
      }).a(100).a());
      exf $$2 = this.d(exf.a(vf.c("selectServer.add"), $$0 -> {
         this.v = new foc(gfr.a("selectServer.defaultName"), "", foc.b.c);
         this.f.a(new fcd(this, this::f, this.v));
      }).a(100).a());
      this.q = this.d(exf.a(vf.c("selectServer.edit"), $$0 -> {
         fgc.a $$1x = this.l.i();
         if ($$1x instanceof fgc.d) {
            foc $$2x = ((fgc.d)$$1x).c();
            this.v = new foc($$2x.a, $$2x.b, foc.b.c);
            this.v.b($$2x);
            this.f.a(new fcd(this, this::e, this.v));
         }
      }).a(74).a());
      this.t = this.d(exf.a(vf.c("selectServer.delete"), $$0 -> {
         fgc.a $$1x = this.l.i();
         if ($$1x instanceof fgc.d) {
            String $$2x = ((fgc.d)$$1x).c().a;
            if ($$2x != null) {
               vf $$3x = vf.c("selectServer.deleteQuestion");
               vf $$4x = vf.a("selectServer.deleteWarning", $$2x);
               vf $$5x = vf.c("selectServer.deleteButton");
               vf $$6x = ve.e;
               this.f.a(new fbt(this::c, $$3x, $$4x, $$5x, $$6x));
            }
         }
      }).a(74).a());
      exf $$3 = this.d(exf.a(vf.c("selectServer.refresh"), $$0 -> this.I()).a(74).a());
      exf $$4 = this.d(exf.a(ve.k, $$0 -> this.f.a(this.o)).a(74).a());
      fat $$5 = fat.d();
      fam $$6 = $$5.a(new fam(308, 20, fam.b.a));
      $$6.a(this.r);
      $$6.a($$1);
      $$6.a($$2);
      $$5.a(fau.b(4));
      fam $$7 = $$5.a(new fam(308, 20, fam.b.a));
      $$7.a(this.q);
      $$7.a(this.t);
      $$7.a($$3);
      $$7.a($$4);
      $$5.a();
      fan.a($$5, 0, this.h - 64, this.g, 64);
      this.D();
   }

   @Override
   public void d() {
      super.d();
      List<gir> $$0 = this.w.a();
      if ($$0 != null) {
         this.l.a($$0);
      }

      this.n.a();
   }

   @Override
   public void j() {
      if (this.x != null) {
         this.x.interrupt();
         this.x = null;
      }

      this.n.b();
      this.l.d();
   }

   private void I() {
      this.f.a(new ffy(this.o));
   }

   private void c(boolean $$0) {
      fgc.a $$1 = this.l.i();
      if ($$0 && $$1 instanceof fgc.d) {
         this.p.a(((fgc.d)$$1).c());
         this.p.b();
         this.l.a(null);
         this.l.a(this.p);
      }

      this.f.a(this);
   }

   private void e(boolean $$0) {
      fgc.a $$1 = this.l.i();
      if ($$0 && $$1 instanceof fgc.d) {
         foc $$2 = ((fgc.d)$$1).c();
         $$2.a = this.v.a;
         $$2.b = this.v.b;
         $$2.b(this.v);
         this.p.b();
         this.l.a(this.p);
      }

      this.f.a(this);
   }

   private void f(boolean $$0) {
      if ($$0) {
         foc $$1 = this.p.b(this.v.b);
         if ($$1 != null) {
            $$1.a(this.v);
            this.p.b();
         } else {
            this.p.a(this.v, false);
            this.p.b();
         }

         this.l.a(null);
         this.l.a(this.p);
      }

      this.f.a(this);
   }

   private void g(boolean $$0) {
      if ($$0) {
         foc $$1 = this.p.a(this.v.b);
         if ($$1 == null) {
            this.p.a(this.v, true);
            this.p.b();
            this.a(this.v);
         } else {
            this.a($$1);
         }
      } else {
         this.f.a(this);
      }
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if (super.a($$0, $$1, $$2)) {
         return true;
      } else if ($$0 == 294) {
         this.I();
         return true;
      } else if (this.l.i() != null) {
         if (fbd.a($$0)) {
            this.n();
            return true;
         } else {
            return this.l.a($$0, $$1, $$2);
         }
      } else {
         return false;
      }
   }

   @Override
   public void a(ewt $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.u = null;
      $$0.a(this.i, this.e, this.g / 2, 20, 16777215);
      if (this.u != null) {
         $$0.a(this.i, this.u, $$1, $$2);
      }
   }

   public void n() {
      fgc.a $$0 = this.l.i();
      if ($$0 instanceof fgc.d) {
         this.a(((fgc.d)$$0).c());
      } else if ($$0 instanceof fgc.c) {
         gir $$1 = ((fgc.c)$$0).b();
         this.a(new foc($$1.a(), $$1.b(), foc.b.a));
      }
   }

   private void a(foc $$0) {
      fbu.a(this, this.f, fpe.a($$0.b), $$0, false);
   }

   public void a(fgc.a $$0) {
      this.l.a($$0);
      this.D();
   }

   protected void D() {
      this.r.j = false;
      this.q.j = false;
      this.t.j = false;
      fgc.a $$0 = this.l.i();
      if ($$0 != null && !($$0 instanceof fgc.b)) {
         this.r.j = true;
         if ($$0 instanceof fgc.d) {
            this.q.j = true;
            this.t.j = true;
         }
      }
   }

   public foe E() {
      return this.n;
   }

   public void c(List<vf> $$0) {
      this.u = $$0;
   }

   public fod H() {
      return this.p;
   }
}
