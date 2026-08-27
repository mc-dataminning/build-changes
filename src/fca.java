import com.mojang.logging.LogUtils;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fca extends ezd {
   public static final int a = 308;
   public static final int b = 100;
   public static final int c = 74;
   public static final int k = 64;
   private static final Logger m = LogUtils.getLogger();
   private final fke n = new fke();
   private final ezd o;
   protected fce l;
   private fkd p;
   private etj q;
   private etj s;
   private etj t;
   @Nullable
   private List<ui> u;
   private fkc v;
   private geb.b w;
   @Nullable
   private geb.a x;
   private boolean y;

   public fca(ezd $$0) {
      super(ui.c("multiplayer.title"));
      this.o = $$0;
   }

   @Override
   protected void aM_() {
      if (this.y) {
         this.l.a(this.g, this.h, 32, this.h - 64);
      } else {
         this.y = true;
         this.p = new fkd(this.f);
         this.p.a();
         this.w = new geb.b();

         try {
            this.x = new geb.a(this.w);
            this.x.start();
         } catch (Exception var8) {
            m.warn("Unable to start LAN server detection: {}", var8.getMessage());
         }

         this.l = new fce(this, this.f, this.g, this.h, 32, this.h - 64, 36);
         this.l.a(this.p);
      }

      this.e(this.l);
      this.s = this.d(etj.a(ui.c("selectServer.select"), $$0 -> this.l()).a(100).a());
      etj $$1 = this.d(etj.a(ui.c("selectServer.direct"), $$0 -> {
         this.v = new fkc(gbg.a("selectServer.defaultName"), "", fkc.b.c);
         this.f.a(new eyf(this, this::g, this.v));
      }).a(100).a());
      etj $$2 = this.d(etj.a(ui.c("selectServer.add"), $$0 -> {
         this.v = new fkc(gbg.a("selectServer.defaultName"), "", fkc.b.c);
         this.f.a(new eyh(this, this::f, this.v));
      }).a(100).a());
      this.q = this.d(etj.a(ui.c("selectServer.edit"), $$0 -> {
         fce.a $$1x = this.l.f();
         if ($$1x instanceof fce.d) {
            fkc $$2x = ((fce.d)$$1x).c();
            this.v = new fkc($$2x.a, $$2x.b, fkc.b.c);
            this.v.b($$2x);
            this.f.a(new eyh(this, this::e, this.v));
         }
      }).a(74).a());
      this.t = this.d(etj.a(ui.c("selectServer.delete"), $$0 -> {
         fce.a $$1x = this.l.f();
         if ($$1x instanceof fce.d) {
            String $$2x = ((fce.d)$$1x).c().a;
            if ($$2x != null) {
               ui $$3x = ui.c("selectServer.deleteQuestion");
               ui $$4x = ui.a("selectServer.deleteWarning", $$2x);
               ui $$5x = ui.c("selectServer.deleteButton");
               ui $$6x = uh.e;
               this.f.a(new exx(this::c, $$3x, $$4x, $$5x, $$6x));
            }
         }
      }).a(74).a());
      etj $$3 = this.d(etj.a(ui.c("selectServer.refresh"), $$0 -> this.F()).a(74).a());
      etj $$4 = this.d(etj.a(uh.k, $$0 -> this.f.a(this.o)).a(74).a());
      ewx $$5 = ewx.d();
      ewq $$6 = $$5.a(new ewq(308, 20, ewq.b.a));
      $$6.a(this.s);
      $$6.a($$1);
      $$6.a($$2);
      $$5.a(ewy.b(4));
      ewq $$7 = $$5.a(new ewq(308, 20, ewq.b.a));
      $$7.a(this.q);
      $$7.a(this.t);
      $$7.a($$3);
      $$7.a($$4);
      $$5.a();
      ewr.a($$5, 0, this.h - 64, this.g, 64);
      this.C();
   }

   @Override
   public void d() {
      super.d();
      List<gea> $$0 = this.w.a();
      if ($$0 != null) {
         this.l.a($$0);
      }

      this.n.a();
   }

   @Override
   public void aD_() {
      if (this.x != null) {
         this.x.interrupt();
         this.x = null;
      }

      this.n.b();
      this.l.e();
   }

   private void F() {
      this.f.a(new fca(this.o));
   }

   private void c(boolean $$0) {
      fce.a $$1 = this.l.f();
      if ($$0 && $$1 instanceof fce.d) {
         this.p.a(((fce.d)$$1).c());
         this.p.b();
         this.l.a(null);
         this.l.a(this.p);
      }

      this.f.a(this);
   }

   private void e(boolean $$0) {
      fce.a $$1 = this.l.f();
      if ($$0 && $$1 instanceof fce.d) {
         fkc $$2 = ((fce.d)$$1).c();
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
         fkc $$1 = this.p.b(this.v.b);
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
         fkc $$1 = this.p.a(this.v.b);
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
         this.F();
         return true;
      } else if (this.l.f() != null) {
         if (exh.a($$0)) {
            this.l();
            return true;
         } else {
            return this.l.a($$0, $$1, $$2);
         }
      } else {
         return false;
      }
   }

   @Override
   public void a(esy $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.u = null;
      this.l.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, 20, 16777215);
      if (this.u != null) {
         $$0.a(this.i, this.u, $$1, $$2);
      }
   }

   public void l() {
      fce.a $$0 = this.l.f();
      if ($$0 instanceof fce.d) {
         this.a(((fce.d)$$0).c());
      } else if ($$0 instanceof fce.c) {
         gea $$1 = ((fce.c)$$0).b();
         this.a(new fkc($$1.a(), $$1.b(), fkc.b.a));
      }
   }

   private void a(fkc $$0) {
      exy.a(this, this.f, fld.a($$0.b), $$0, false);
   }

   public void a(fce.a $$0) {
      this.l.a($$0);
      this.C();
   }

   @Override
   protected void C() {
      this.s.i = false;
      this.q.i = false;
      this.t.i = false;
      fce.a $$0 = this.l.f();
      if ($$0 != null && !($$0 instanceof fce.b)) {
         this.s.i = true;
         if ($$0 instanceof fce.d) {
            this.q.i = true;
            this.t.i = true;
         }
      }
   }

   public fke D() {
      return this.n;
   }

   public void c(List<ui> $$0) {
      this.u = $$0;
   }

   public fkd E() {
      return this.p;
   }
}
