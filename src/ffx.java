import com.mojang.logging.LogUtils;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class ffx extends fcz {
   public static final int a = 308;
   public static final int b = 100;
   public static final int c = 74;
   public static final int k = 64;
   private static final Logger m = LogUtils.getLogger();
   private final fod n = new fod();
   private final fcz o;
   protected fgb l;
   private foc p;
   private exe q;
   private exe r;
   private exe t;
   @Nullable
   private List<vf> u;
   private fob v;
   private gir.b w;
   @Nullable
   private gir.a x;
   private boolean y;

   public ffx(fcz $$0) {
      super(vf.c("multiplayer.title"));
      this.o = $$0;
   }

   @Override
   protected void aN_() {
      if (this.y) {
         this.l.a(this.g, this.h - 64 - 32, 0, 32);
      } else {
         this.y = true;
         this.p = new foc(this.f);
         this.p.a();
         this.w = new gir.b();

         try {
            this.x = new gir.a(this.w);
            this.x.start();
         } catch (Exception var8) {
            m.warn("Unable to start LAN server detection: {}", var8.getMessage());
         }

         this.l = new fgb(this, this.f, this.g, this.h - 64 - 32, 32, 36);
         this.l.a(this.p);
      }

      this.d(this.l);
      this.r = this.d(exe.a(vf.c("selectServer.select"), $$0 -> this.n()).a(100).a());
      exe $$1 = this.d(exe.a(vf.c("selectServer.direct"), $$0 -> {
         this.v = new fob(gfq.a("selectServer.defaultName"), "", fob.b.c);
         this.f.a(new fca(this, this::g, this.v));
      }).a(100).a());
      exe $$2 = this.d(exe.a(vf.c("selectServer.add"), $$0 -> {
         this.v = new fob(gfq.a("selectServer.defaultName"), "", fob.b.c);
         this.f.a(new fcc(this, this::f, this.v));
      }).a(100).a());
      this.q = this.d(exe.a(vf.c("selectServer.edit"), $$0 -> {
         fgb.a $$1x = this.l.i();
         if ($$1x instanceof fgb.d) {
            fob $$2x = ((fgb.d)$$1x).c();
            this.v = new fob($$2x.a, $$2x.b, fob.b.c);
            this.v.b($$2x);
            this.f.a(new fcc(this, this::e, this.v));
         }
      }).a(74).a());
      this.t = this.d(exe.a(vf.c("selectServer.delete"), $$0 -> {
         fgb.a $$1x = this.l.i();
         if ($$1x instanceof fgb.d) {
            String $$2x = ((fgb.d)$$1x).c().a;
            if ($$2x != null) {
               vf $$3x = vf.c("selectServer.deleteQuestion");
               vf $$4x = vf.a("selectServer.deleteWarning", $$2x);
               vf $$5x = vf.c("selectServer.deleteButton");
               vf $$6x = ve.e;
               this.f.a(new fbs(this::c, $$3x, $$4x, $$5x, $$6x));
            }
         }
      }).a(74).a());
      exe $$3 = this.d(exe.a(vf.c("selectServer.refresh"), $$0 -> this.H()).a(74).a());
      exe $$4 = this.d(exe.a(ve.k, $$0 -> this.f.a(this.o)).a(74).a());
      fas $$5 = fas.d();
      fal $$6 = $$5.a(new fal(308, 20, fal.b.a));
      $$6.a(this.r);
      $$6.a($$1);
      $$6.a($$2);
      $$5.a(fat.b(4));
      fal $$7 = $$5.a(new fal(308, 20, fal.b.a));
      $$7.a(this.q);
      $$7.a(this.t);
      $$7.a($$3);
      $$7.a($$4);
      $$5.a();
      fam.a($$5, 0, this.h - 64, this.g, 64);
      this.C();
   }

   @Override
   public void d() {
      super.d();
      List<giq> $$0 = this.w.a();
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

   private void H() {
      this.f.a(new ffx(this.o));
   }

   private void c(boolean $$0) {
      fgb.a $$1 = this.l.i();
      if ($$0 && $$1 instanceof fgb.d) {
         this.p.a(((fgb.d)$$1).c());
         this.p.b();
         this.l.a(null);
         this.l.a(this.p);
      }

      this.f.a(this);
   }

   private void e(boolean $$0) {
      fgb.a $$1 = this.l.i();
      if ($$0 && $$1 instanceof fgb.d) {
         fob $$2 = ((fgb.d)$$1).c();
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
         fob $$1 = this.p.b(this.v.b);
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
         fob $$1 = this.p.a(this.v.b);
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
         this.H();
         return true;
      } else if (this.l.i() != null) {
         if (fbc.a($$0)) {
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
   public void a(ews $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.u = null;
      $$0.a(this.i, this.e, this.g / 2, 20, 16777215);
      if (this.u != null) {
         $$0.a(this.i, this.u, $$1, $$2);
      }
   }

   public void n() {
      fgb.a $$0 = this.l.i();
      if ($$0 instanceof fgb.d) {
         this.a(((fgb.d)$$0).c());
      } else if ($$0 instanceof fgb.c) {
         giq $$1 = ((fgb.c)$$0).b();
         this.a(new fob($$1.a(), $$1.b(), fob.b.a));
      }
   }

   private void a(fob $$0) {
      fbt.a(this, this.f, fpd.a($$0.b), $$0, false);
   }

   public void a(fgb.a $$0) {
      this.l.a($$0);
      this.C();
   }

   @Override
   protected void C() {
      this.r.j = false;
      this.q.j = false;
      this.t.j = false;
      fgb.a $$0 = this.l.i();
      if ($$0 != null && !($$0 instanceof fgb.b)) {
         this.r.j = true;
         if ($$0 instanceof fgb.d) {
            this.q.j = true;
            this.t.j = true;
         }
      }
   }

   public fod D() {
      return this.n;
   }

   public void c(List<vf> $$0) {
      this.u = $$0;
   }

   public foc E() {
      return this.p;
   }
}
