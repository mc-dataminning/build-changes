import com.mojang.logging.LogUtils;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class ffr extends fct {
   public static final int a = 308;
   public static final int b = 100;
   public static final int c = 74;
   public static final int k = 64;
   private static final Logger m = LogUtils.getLogger();
   private final fnx n = new fnx();
   private final fct o;
   protected ffv l;
   private fnw p;
   private ewy q;
   private ewy r;
   private ewy t;
   @Nullable
   private List<vd> u;
   private fnv v;
   private gig.b w;
   @Nullable
   private gig.a x;
   private boolean y;

   public ffr(fct $$0) {
      super(vd.c("multiplayer.title"));
      this.o = $$0;
   }

   @Override
   protected void aN_() {
      if (this.y) {
         this.l.a(this.g, this.h - 64 - 32, 0, 32);
      } else {
         this.y = true;
         this.p = new fnw(this.f);
         this.p.a();
         this.w = new gig.b();

         try {
            this.x = new gig.a(this.w);
            this.x.start();
         } catch (Exception var8) {
            m.warn("Unable to start LAN server detection: {}", var8.getMessage());
         }

         this.l = new ffv(this, this.f, this.g, this.h - 64 - 32, 32, 36);
         this.l.a(this.p);
      }

      this.d(this.l);
      this.r = this.d(ewy.a(vd.c("selectServer.select"), $$0 -> this.n()).a(100).a());
      ewy $$1 = this.d(ewy.a(vd.c("selectServer.direct"), $$0 -> {
         this.v = new fnv(gfl.a("selectServer.defaultName"), "", fnv.b.c);
         this.f.a(new fbu(this, this::g, this.v));
      }).a(100).a());
      ewy $$2 = this.d(ewy.a(vd.c("selectServer.add"), $$0 -> {
         this.v = new fnv(gfl.a("selectServer.defaultName"), "", fnv.b.c);
         this.f.a(new fbw(this, this::f, this.v));
      }).a(100).a());
      this.q = this.d(ewy.a(vd.c("selectServer.edit"), $$0 -> {
         ffv.a $$1x = this.l.i();
         if ($$1x instanceof ffv.d) {
            fnv $$2x = ((ffv.d)$$1x).c();
            this.v = new fnv($$2x.a, $$2x.b, fnv.b.c);
            this.v.b($$2x);
            this.f.a(new fbw(this, this::e, this.v));
         }
      }).a(74).a());
      this.t = this.d(ewy.a(vd.c("selectServer.delete"), $$0 -> {
         ffv.a $$1x = this.l.i();
         if ($$1x instanceof ffv.d) {
            String $$2x = ((ffv.d)$$1x).c().a;
            if ($$2x != null) {
               vd $$3x = vd.c("selectServer.deleteQuestion");
               vd $$4x = vd.a("selectServer.deleteWarning", $$2x);
               vd $$5x = vd.c("selectServer.deleteButton");
               vd $$6x = vc.e;
               this.f.a(new fbm(this::c, $$3x, $$4x, $$5x, $$6x));
            }
         }
      }).a(74).a());
      ewy $$3 = this.d(ewy.a(vd.c("selectServer.refresh"), $$0 -> this.H()).a(74).a());
      ewy $$4 = this.d(ewy.a(vc.k, $$0 -> this.f.a(this.o)).a(74).a());
      fam $$5 = fam.d();
      faf $$6 = $$5.a(new faf(308, 20, faf.b.a));
      $$6.a(this.r);
      $$6.a($$1);
      $$6.a($$2);
      $$5.a(fan.b(4));
      faf $$7 = $$5.a(new faf(308, 20, faf.b.a));
      $$7.a(this.q);
      $$7.a(this.t);
      $$7.a($$3);
      $$7.a($$4);
      $$5.a();
      fag.a($$5, 0, this.h - 64, this.g, 64);
      this.C();
   }

   @Override
   public void d() {
      super.d();
      List<gif> $$0 = this.w.a();
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
      this.f.a(new ffr(this.o));
   }

   private void c(boolean $$0) {
      ffv.a $$1 = this.l.i();
      if ($$0 && $$1 instanceof ffv.d) {
         this.p.a(((ffv.d)$$1).c());
         this.p.b();
         this.l.a(null);
         this.l.a(this.p);
      }

      this.f.a(this);
   }

   private void e(boolean $$0) {
      ffv.a $$1 = this.l.i();
      if ($$0 && $$1 instanceof ffv.d) {
         fnv $$2 = ((ffv.d)$$1).c();
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
         fnv $$1 = this.p.b(this.v.b);
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
         fnv $$1 = this.p.a(this.v.b);
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
         if (faw.a($$0)) {
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
   public void a(ewm $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.u = null;
      $$0.a(this.i, this.e, this.g / 2, 20, 16777215);
      if (this.u != null) {
         $$0.a(this.i, this.u, $$1, $$2);
      }
   }

   public void n() {
      ffv.a $$0 = this.l.i();
      if ($$0 instanceof ffv.d) {
         this.a(((ffv.d)$$0).c());
      } else if ($$0 instanceof ffv.c) {
         gif $$1 = ((ffv.c)$$0).b();
         this.a(new fnv($$1.a(), $$1.b(), fnv.b.a));
      }
   }

   private void a(fnv $$0) {
      fbn.a(this, this.f, fox.a($$0.b), $$0, false);
   }

   public void a(ffv.a $$0) {
      this.l.a($$0);
      this.C();
   }

   @Override
   protected void C() {
      this.r.j = false;
      this.q.j = false;
      this.t.j = false;
      ffv.a $$0 = this.l.i();
      if ($$0 != null && !($$0 instanceof ffv.b)) {
         this.r.j = true;
         if ($$0 instanceof ffv.d) {
            this.q.j = true;
            this.t.j = true;
         }
      }
   }

   public fnx D() {
      return this.n;
   }

   public void c(List<vd> $$0) {
      this.u = $$0;
   }

   public fnw E() {
      return this.p;
   }
}
