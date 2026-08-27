import com.mojang.logging.LogUtils;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class ffz extends fdb {
   public static final int a = 308;
   public static final int b = 100;
   public static final int c = 74;
   public static final int k = 64;
   private static final Logger m = LogUtils.getLogger();
   private final fof n = new fof();
   private final fdb o;
   protected fgd l;
   private foe p;
   private exg q;
   private exg r;
   private exg t;
   @Nullable
   private List<vf> u;
   private fod v;
   private git.b w;
   @Nullable
   private git.a x;
   private boolean y;

   public ffz(fdb $$0) {
      super(vf.c("multiplayer.title"));
      this.o = $$0;
   }

   @Override
   protected void aN_() {
      if (this.y) {
         this.l.a(this.g, this.h - 64 - 32, 0, 32);
      } else {
         this.y = true;
         this.p = new foe(this.f);
         this.p.a();
         this.w = new git.b();

         try {
            this.x = new git.a(this.w);
            this.x.start();
         } catch (Exception var8) {
            m.warn("Unable to start LAN server detection: {}", var8.getMessage());
         }

         this.l = new fgd(this, this.f, this.g, this.h - 64 - 32, 32, 36);
         this.l.a(this.p);
      }

      this.d(this.l);
      this.r = this.d(exg.a(vf.c("selectServer.select"), $$0 -> this.n()).a(100).a());
      exg $$1 = this.d(exg.a(vf.c("selectServer.direct"), $$0 -> {
         this.v = new fod(gfs.a("selectServer.defaultName"), "", fod.b.c);
         this.f.a(new fcc(this, this::g, this.v));
      }).a(100).a());
      exg $$2 = this.d(exg.a(vf.c("selectServer.add"), $$0 -> {
         this.v = new fod(gfs.a("selectServer.defaultName"), "", fod.b.c);
         this.f.a(new fce(this, this::f, this.v));
      }).a(100).a());
      this.q = this.d(exg.a(vf.c("selectServer.edit"), $$0 -> {
         fgd.a $$1x = this.l.i();
         if ($$1x instanceof fgd.d) {
            fod $$2x = ((fgd.d)$$1x).c();
            this.v = new fod($$2x.a, $$2x.b, fod.b.c);
            this.v.b($$2x);
            this.f.a(new fce(this, this::e, this.v));
         }
      }).a(74).a());
      this.t = this.d(exg.a(vf.c("selectServer.delete"), $$0 -> {
         fgd.a $$1x = this.l.i();
         if ($$1x instanceof fgd.d) {
            String $$2x = ((fgd.d)$$1x).c().a;
            if ($$2x != null) {
               vf $$3x = vf.c("selectServer.deleteQuestion");
               vf $$4x = vf.a("selectServer.deleteWarning", $$2x);
               vf $$5x = vf.c("selectServer.deleteButton");
               vf $$6x = ve.e;
               this.f.a(new fbu(this::c, $$3x, $$4x, $$5x, $$6x));
            }
         }
      }).a(74).a());
      exg $$3 = this.d(exg.a(vf.c("selectServer.refresh"), $$0 -> this.I()).a(74).a());
      exg $$4 = this.d(exg.a(ve.k, $$0 -> this.f.a(this.o)).a(74).a());
      fau $$5 = fau.d();
      fan $$6 = $$5.a(new fan(308, 20, fan.b.a));
      $$6.a(this.r);
      $$6.a($$1);
      $$6.a($$2);
      $$5.a(fav.b(4));
      fan $$7 = $$5.a(new fan(308, 20, fan.b.a));
      $$7.a(this.q);
      $$7.a(this.t);
      $$7.a($$3);
      $$7.a($$4);
      $$5.a();
      fao.a($$5, 0, this.h - 64, this.g, 64);
      this.D();
   }

   @Override
   public void d() {
      super.d();
      List<gis> $$0 = this.w.a();
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
      this.f.a(new ffz(this.o));
   }

   private void c(boolean $$0) {
      fgd.a $$1 = this.l.i();
      if ($$0 && $$1 instanceof fgd.d) {
         this.p.a(((fgd.d)$$1).c());
         this.p.b();
         this.l.a(null);
         this.l.a(this.p);
      }

      this.f.a(this);
   }

   private void e(boolean $$0) {
      fgd.a $$1 = this.l.i();
      if ($$0 && $$1 instanceof fgd.d) {
         fod $$2 = ((fgd.d)$$1).c();
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
         fod $$1 = this.p.b(this.v.b);
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
         fod $$1 = this.p.a(this.v.b);
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
         if (fbe.a($$0)) {
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
   public void a(ewu $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.u = null;
      $$0.a(this.i, this.e, this.g / 2, 20, 16777215);
      if (this.u != null) {
         $$0.a(this.i, this.u, $$1, $$2);
      }
   }

   public void n() {
      fgd.a $$0 = this.l.i();
      if ($$0 instanceof fgd.d) {
         this.a(((fgd.d)$$0).c());
      } else if ($$0 instanceof fgd.c) {
         gis $$1 = ((fgd.c)$$0).b();
         this.a(new fod($$1.a(), $$1.b(), fod.b.a));
      }
   }

   private void a(fod $$0) {
      fbv.a(this, this.f, fpf.a($$0.b), $$0, false);
   }

   public void a(fgd.a $$0) {
      this.l.a($$0);
      this.D();
   }

   protected void D() {
      this.r.j = false;
      this.q.j = false;
      this.t.j = false;
      fgd.a $$0 = this.l.i();
      if ($$0 != null && !($$0 instanceof fgd.b)) {
         this.r.j = true;
         if ($$0 instanceof fgd.d) {
            this.q.j = true;
            this.t.j = true;
         }
      }
   }

   public fof E() {
      return this.n;
   }

   public void c(List<vf> $$0) {
      this.u = $$0;
   }

   public foe H() {
      return this.p;
   }
}
