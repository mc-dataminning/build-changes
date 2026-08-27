import com.mojang.logging.LogUtils;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fij extends ffl {
   public static final int a = 308;
   public static final int b = 100;
   public static final int c = 74;
   public static final int k = 64;
   private static final Logger m = LogUtils.getLogger();
   private final fqs n = new fqs();
   private final ffl o;
   protected fin l;
   private fqr p;
   private ezo q;
   private ezo r;
   private ezo t;
   private fqq u;
   private glh.b v;
   @Nullable
   private glh.a w;
   private boolean x;

   public fij(ffl $$0) {
      super(vq.c("multiplayer.title"));
      this.o = $$0;
   }

   @Override
   protected void aQ_() {
      if (this.x) {
         this.l.a(this.g, this.h - 64 - 32, 0, 32);
      } else {
         this.x = true;
         this.p = new fqr(this.f);
         this.p.a();
         this.v = new glh.b();

         try {
            this.w = new glh.a(this.v);
            this.w.start();
         } catch (Exception var8) {
            m.warn("Unable to start LAN server detection: {}", var8.getMessage());
         }

         this.l = new fin(this, this.f, this.g, this.h - 64 - 32, 32, 36);
         this.l.a(this.p);
      }

      this.c(this.l);
      this.r = this.c(ezo.a(vq.c("selectServer.select"), $$0 -> this.o()).a(100).a());
      ezo $$1 = this.c(ezo.a(vq.c("selectServer.direct"), $$0 -> {
         this.u = new fqq(gig.a("selectServer.defaultName"), "", fqq.c.c);
         this.f.a(new fem(this, this::g, this.u));
      }).a(100).a());
      ezo $$2 = this.c(ezo.a(vq.c("selectServer.add"), $$0 -> {
         this.u = new fqq(gig.a("selectServer.defaultName"), "", fqq.c.c);
         this.f.a(new feo(this, this::f, this.u));
      }).a(100).a());
      this.q = this.c(ezo.a(vq.c("selectServer.edit"), $$0 -> {
         fin.a $$1x = this.l.i();
         if ($$1x instanceof fin.d) {
            fqq $$2x = ((fin.d)$$1x).c();
            this.u = new fqq($$2x.a, $$2x.b, fqq.c.c);
            this.u.b($$2x);
            this.f.a(new feo(this, this::e, this.u));
         }
      }).a(74).a());
      this.t = this.c(ezo.a(vq.c("selectServer.delete"), $$0 -> {
         fin.a $$1x = this.l.i();
         if ($$1x instanceof fin.d) {
            String $$2x = ((fin.d)$$1x).c().a;
            if ($$2x != null) {
               vq $$3x = vq.c("selectServer.deleteQuestion");
               vq $$4x = vq.a("selectServer.deleteWarning", $$2x);
               vq $$5x = vq.c("selectServer.deleteButton");
               vq $$6x = vp.e;
               this.f.a(new fee(this::c, $$3x, $$4x, $$5x, $$6x));
            }
         }
      }).a(74).a());
      ezo $$3 = this.c(ezo.a(vq.c("selectServer.refresh"), $$0 -> this.J()).a(74).a());
      ezo $$4 = this.c(ezo.a(vp.k, $$0 -> this.d()).a(74).a());
      fde $$5 = fde.d();
      fcx $$6 = $$5.a(new fcx(308, 20, fcx.b.a));
      $$6.a(this.r);
      $$6.a($$1);
      $$6.a($$2);
      $$5.a(fdf.b(4));
      fcx $$7 = $$5.a(new fcx(308, 20, fcx.b.a));
      $$7.a(this.q);
      $$7.a(this.t);
      $$7.a($$3);
      $$7.a($$4);
      $$5.a();
      fcy.a($$5, 0, this.h - 64, this.g, 64);
      this.E();
   }

   @Override
   public void d() {
      this.f.a(this.o);
   }

   @Override
   public void e() {
      super.e();
      List<glg> $$0 = this.v.a();
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
      this.f.a(new fij(this.o));
   }

   private void c(boolean $$0) {
      fin.a $$1 = this.l.i();
      if ($$0 && $$1 instanceof fin.d) {
         this.p.a(((fin.d)$$1).c());
         this.p.b();
         this.l.a(null);
         this.l.a(this.p);
      }

      this.f.a(this);
   }

   private void e(boolean $$0) {
      fin.a $$1 = this.l.i();
      if ($$0 && $$1 instanceof fin.d) {
         fqq $$2 = ((fin.d)$$1).c();
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
         fqq $$1 = this.p.b(this.u.b);
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
         fqq $$1 = this.p.a(this.u.b);
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
         if (fdo.a($$0)) {
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
   public void a(ezb $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, 20, 16777215);
   }

   public void o() {
      fin.a $$0 = this.l.i();
      if ($$0 instanceof fin.d) {
         this.a(((fin.d)$$0).c());
      } else if ($$0 instanceof fin.c) {
         glg $$1 = ((fin.c)$$0).b();
         this.a(new fqq($$1.a(), $$1.b(), fqq.c.a));
      }
   }

   private void a(fqq $$0) {
      fef.a(this, this.f, frs.a($$0.b), $$0, false, null);
   }

   public void a(fin.a $$0) {
      this.l.a($$0);
      this.E();
   }

   protected void E() {
      this.r.j = false;
      this.q.j = false;
      this.t.j = false;
      fin.a $$0 = this.l.i();
      if ($$0 != null && !($$0 instanceof fin.b)) {
         this.r.j = true;
         if ($$0 instanceof fin.d) {
            this.q.j = true;
            this.t.j = true;
         }
      }
   }

   public fqs H() {
      return this.n;
   }

   public fqr I() {
      return this.p;
   }
}
