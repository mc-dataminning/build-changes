import com.mojang.logging.LogUtils;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fgk extends fdm {
   public static final int a = 308;
   public static final int b = 100;
   public static final int c = 74;
   public static final int k = 64;
   private static final Logger m = LogUtils.getLogger();
   private final fos n = new fos();
   private final fdm o;
   protected fgo l;
   private foq p;
   private exr q;
   private exr r;
   private exr t;
   private fop u;
   private gjh.b v;
   @Nullable
   private gjh.a w;
   private boolean x;

   public fgk(fdm $$0) {
      super(vg.c("multiplayer.title"));
      this.o = $$0;
   }

   @Override
   protected void aP_() {
      if (this.x) {
         this.l.a(this.g, this.h - 64 - 32, 0, 32);
      } else {
         this.x = true;
         this.p = new foq(this.f);
         this.p.a();
         this.v = new gjh.b();

         try {
            this.w = new gjh.a(this.v);
            this.w.start();
         } catch (Exception var8) {
            m.warn("Unable to start LAN server detection: {}", var8.getMessage());
         }

         this.l = new fgo(this, this.f, this.g, this.h - 64 - 32, 32, 36);
         this.l.a(this.p);
      }

      this.d(this.l);
      this.r = this.d(exr.a(vg.c("selectServer.select"), $$0 -> this.o()).a(100).a());
      exr $$1 = this.d(exr.a(vg.c("selectServer.direct"), $$0 -> {
         this.u = new fop(ggg.a("selectServer.defaultName"), "", fop.c.c);
         this.f.a(new fcn(this, this::g, this.u));
      }).a(100).a());
      exr $$2 = this.d(exr.a(vg.c("selectServer.add"), $$0 -> {
         this.u = new fop(ggg.a("selectServer.defaultName"), "", fop.c.c);
         this.f.a(new fcp(this, this::f, this.u));
      }).a(100).a());
      this.q = this.d(exr.a(vg.c("selectServer.edit"), $$0 -> {
         fgo.a $$1x = this.l.i();
         if ($$1x instanceof fgo.d) {
            fop $$2x = ((fgo.d)$$1x).c();
            this.u = new fop($$2x.a, $$2x.b, fop.c.c);
            this.u.b($$2x);
            this.f.a(new fcp(this, this::e, this.u));
         }
      }).a(74).a());
      this.t = this.d(exr.a(vg.c("selectServer.delete"), $$0 -> {
         fgo.a $$1x = this.l.i();
         if ($$1x instanceof fgo.d) {
            String $$2x = ((fgo.d)$$1x).c().a;
            if ($$2x != null) {
               vg $$3x = vg.c("selectServer.deleteQuestion");
               vg $$4x = vg.a("selectServer.deleteWarning", $$2x);
               vg $$5x = vg.c("selectServer.deleteButton");
               vg $$6x = vf.e;
               this.f.a(new fcf(this::c, $$3x, $$4x, $$5x, $$6x));
            }
         }
      }).a(74).a());
      exr $$3 = this.d(exr.a(vg.c("selectServer.refresh"), $$0 -> this.J()).a(74).a());
      exr $$4 = this.d(exr.a(vf.k, $$0 -> this.d()).a(74).a());
      fbf $$5 = fbf.d();
      fay $$6 = $$5.a(new fay(308, 20, fay.b.a));
      $$6.a(this.r);
      $$6.a($$1);
      $$6.a($$2);
      $$5.a(fbg.b(4));
      fay $$7 = $$5.a(new fay(308, 20, fay.b.a));
      $$7.a(this.q);
      $$7.a(this.t);
      $$7.a($$3);
      $$7.a($$4);
      $$5.a();
      faz.a($$5, 0, this.h - 64, this.g, 64);
      this.E();
   }

   @Override
   public void d() {
      this.f.a(this.o);
   }

   @Override
   public void e() {
      super.e();
      List<gjg> $$0 = this.v.a();
      if ($$0 != null) {
         this.l.a($$0);
      }

      this.n.a();
   }

   @Override
   public void k() {
      if (this.w != null) {
         this.w.interrupt();
         this.w = null;
      }

      this.n.b();
      this.l.d();
   }

   private void J() {
      this.f.a(new fgk(this.o));
   }

   private void c(boolean $$0) {
      fgo.a $$1 = this.l.i();
      if ($$0 && $$1 instanceof fgo.d) {
         this.p.a(((fgo.d)$$1).c());
         this.p.b();
         this.l.a(null);
         this.l.a(this.p);
      }

      this.f.a(this);
   }

   private void e(boolean $$0) {
      fgo.a $$1 = this.l.i();
      if ($$0 && $$1 instanceof fgo.d) {
         fop $$2 = ((fgo.d)$$1).c();
         $$2.a = this.u.a;
         $$2.b = this.u.b;
         $$2.b(this.u);
         this.p.b();
         this.l.a(this.p);
      }

      this.f.a(this);
   }

   private void f(boolean $$0) {
      if ($$0) {
         fop $$1 = this.p.b(this.u.b);
         if ($$1 != null) {
            $$1.a(this.u);
            this.p.b();
         } else {
            this.p.a(this.u, false);
            this.p.b();
         }

         this.l.a(null);
         this.l.a(this.p);
      }

      this.f.a(this);
   }

   private void g(boolean $$0) {
      if ($$0) {
         fop $$1 = this.p.a(this.u.b);
         if ($$1 == null) {
            this.p.a(this.u, true);
            this.p.b();
            this.a(this.u);
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
         this.J();
         return true;
      } else if (this.l.i() != null) {
         if (fbp.a($$0)) {
            this.o();
            return true;
         } else {
            return this.l.a($$0, $$1, $$2);
         }
      } else {
         return false;
      }
   }

   @Override
   public void a(exe $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, 20, 16777215);
   }

   public void o() {
      fgo.a $$0 = this.l.i();
      if ($$0 instanceof fgo.d) {
         this.a(((fgo.d)$$0).c());
      } else if ($$0 instanceof fgo.c) {
         gjg $$1 = ((fgo.c)$$0).b();
         this.a(new fop($$1.a(), $$1.b(), fop.c.a));
      }
   }

   private void a(fop $$0) {
      fcg.a(this, this.f, fpr.a($$0.b), $$0, false);
   }

   public void a(fgo.a $$0) {
      this.l.a($$0);
      this.E();
   }

   protected void E() {
      this.r.j = false;
      this.q.j = false;
      this.t.j = false;
      fgo.a $$0 = this.l.i();
      if ($$0 != null && !($$0 instanceof fgo.b)) {
         this.r.j = true;
         if ($$0 instanceof fgo.d) {
            this.q.j = true;
            this.t.j = true;
         }
      }
   }

   public fos H() {
      return this.n;
   }

   public foq I() {
      return this.p;
   }
}
