import com.mojang.logging.LogUtils;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fds extends fau {
   public static final int a = 308;
   public static final int b = 100;
   public static final int c = 74;
   public static final int k = 64;
   private static final Logger m = LogUtils.getLogger();
   private final flw n = new flw();
   private final fau o;
   protected fdw l;
   private flv p;
   private euz q;
   private euz r;
   private euz t;
   @Nullable
   private List<ur> u;
   private flu v;
   private gfv.b w;
   @Nullable
   private gfv.a x;
   private boolean y;

   public fds(fau $$0) {
      super(ur.c("multiplayer.title"));
      this.o = $$0;
   }

   @Override
   protected void aP_() {
      if (this.y) {
         this.l.a(this.g, this.h, 32, this.h - 64);
      } else {
         this.y = true;
         this.p = new flv(this.f);
         this.p.a();
         this.w = new gfv.b();

         try {
            this.x = new gfv.a(this.w);
            this.x.start();
         } catch (Exception var8) {
            m.warn("Unable to start LAN server detection: {}", var8.getMessage());
         }

         this.l = new fdw(this, this.f, this.g, this.h, 32, this.h - 64, 36);
         this.l.a(this.p);
      }

      this.e(this.l);
      this.r = this.d(euz.a(ur.c("selectServer.select"), $$0 -> this.l()).a(100).a());
      euz $$1 = this.d(euz.a(ur.c("selectServer.direct"), $$0 -> {
         this.v = new flu(gda.a("selectServer.defaultName"), "", flu.b.c);
         this.f.a(new ezv(this, this::g, this.v));
      }).a(100).a());
      euz $$2 = this.d(euz.a(ur.c("selectServer.add"), $$0 -> {
         this.v = new flu(gda.a("selectServer.defaultName"), "", flu.b.c);
         this.f.a(new ezx(this, this::f, this.v));
      }).a(100).a());
      this.q = this.d(euz.a(ur.c("selectServer.edit"), $$0 -> {
         fdw.a $$1x = this.l.f();
         if ($$1x instanceof fdw.d) {
            flu $$2x = ((fdw.d)$$1x).c();
            this.v = new flu($$2x.a, $$2x.b, flu.b.c);
            this.v.b($$2x);
            this.f.a(new ezx(this, this::e, this.v));
         }
      }).a(74).a());
      this.t = this.d(euz.a(ur.c("selectServer.delete"), $$0 -> {
         fdw.a $$1x = this.l.f();
         if ($$1x instanceof fdw.d) {
            String $$2x = ((fdw.d)$$1x).c().a;
            if ($$2x != null) {
               ur $$3x = ur.c("selectServer.deleteQuestion");
               ur $$4x = ur.a("selectServer.deleteWarning", $$2x);
               ur $$5x = ur.c("selectServer.deleteButton");
               ur $$6x = uq.e;
               this.f.a(new ezn(this::c, $$3x, $$4x, $$5x, $$6x));
            }
         }
      }).a(74).a());
      euz $$3 = this.d(euz.a(ur.c("selectServer.refresh"), $$0 -> this.F()).a(74).a());
      euz $$4 = this.d(euz.a(uq.k, $$0 -> this.f.a(this.o)).a(74).a());
      eyn $$5 = eyn.d();
      eyg $$6 = $$5.a(new eyg(308, 20, eyg.b.a));
      $$6.a(this.r);
      $$6.a($$1);
      $$6.a($$2);
      $$5.a(eyo.b(4));
      eyg $$7 = $$5.a(new eyg(308, 20, eyg.b.a));
      $$7.a(this.q);
      $$7.a(this.t);
      $$7.a($$3);
      $$7.a($$4);
      $$5.a();
      eyh.a($$5, 0, this.h - 64, this.g, 64);
      this.C();
   }

   @Override
   public void d() {
      super.d();
      List<gfu> $$0 = this.w.a();
      if ($$0 != null) {
         this.l.a($$0);
      }

      this.n.a();
   }

   @Override
   public void aG_() {
      if (this.x != null) {
         this.x.interrupt();
         this.x = null;
      }

      this.n.b();
      this.l.e();
   }

   private void F() {
      this.f.a(new fds(this.o));
   }

   private void c(boolean $$0) {
      fdw.a $$1 = this.l.f();
      if ($$0 && $$1 instanceof fdw.d) {
         this.p.a(((fdw.d)$$1).c());
         this.p.b();
         this.l.a(null);
         this.l.a(this.p);
      }

      this.f.a(this);
   }

   private void e(boolean $$0) {
      fdw.a $$1 = this.l.f();
      if ($$0 && $$1 instanceof fdw.d) {
         flu $$2 = ((fdw.d)$$1).c();
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
         flu $$1 = this.p.b(this.v.b);
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
         flu $$1 = this.p.a(this.v.b);
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
         if (eyx.a($$0)) {
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
   public void a(euo $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.u = null;
      this.l.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, 20, 16777215);
      if (this.u != null) {
         $$0.a(this.i, this.u, $$1, $$2);
      }
   }

   public void l() {
      fdw.a $$0 = this.l.f();
      if ($$0 instanceof fdw.d) {
         this.a(((fdw.d)$$0).c());
      } else if ($$0 instanceof fdw.c) {
         gfu $$1 = ((fdw.c)$$0).b();
         this.a(new flu($$1.a(), $$1.b(), flu.b.a));
      }
   }

   private void a(flu $$0) {
      ezo.a(this, this.f, fmv.a($$0.b), $$0, false);
   }

   public void a(fdw.a $$0) {
      this.l.a($$0);
      this.C();
   }

   @Override
   protected void C() {
      this.r.i = false;
      this.q.i = false;
      this.t.i = false;
      fdw.a $$0 = this.l.f();
      if ($$0 != null && !($$0 instanceof fdw.b)) {
         this.r.i = true;
         if ($$0 instanceof fdw.d) {
            this.q.i = true;
            this.t.i = true;
         }
      }
   }

   public flw D() {
      return this.n;
   }

   public void c(List<ur> $$0) {
      this.u = $$0;
   }

   public flv E() {
      return this.p;
   }
}
