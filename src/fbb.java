import com.mojang.logging.LogUtils;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fbb extends eye {
   public static final int a = 308;
   public static final int b = 100;
   public static final int c = 74;
   public static final int k = 64;
   private static final Logger m = LogUtils.getLogger();
   private final fjf n = new fjf();
   private final eye o;
   protected fbf l;
   private fje p;
   private esk q;
   private esk s;
   private esk t;
   @Nullable
   private List<tl> u;
   private fjd v;
   private gdb.b w;
   @Nullable
   private gdb.a x;
   private boolean y;

   public fbb(eye $$0) {
      super(tl.c("multiplayer.title"));
      this.o = $$0;
   }

   @Override
   protected void aH_() {
      if (this.y) {
         this.l.a(this.g, this.h, 32, this.h - 64);
      } else {
         this.y = true;
         this.p = new fje(this.f);
         this.p.a();
         this.w = new gdb.b();

         try {
            this.x = new gdb.a(this.w);
            this.x.start();
         } catch (Exception var8) {
            m.warn("Unable to start LAN server detection: {}", var8.getMessage());
         }

         this.l = new fbf(this, this.f, this.g, this.h, 32, this.h - 64, 36);
         this.l.a(this.p);
      }

      this.e(this.l);
      this.s = this.d(esk.a(tl.c("selectServer.select"), $$0 -> this.l()).a(100).a());
      esk $$1 = this.d(esk.a(tl.c("selectServer.direct"), $$0 -> {
         this.v = new fjd(gag.a("selectServer.defaultName"), "", fjd.b.c);
         this.f.a(new exg(this, this::g, this.v));
      }).a(100).a());
      esk $$2 = this.d(esk.a(tl.c("selectServer.add"), $$0 -> {
         this.v = new fjd(gag.a("selectServer.defaultName"), "", fjd.b.c);
         this.f.a(new exi(this, this::f, this.v));
      }).a(100).a());
      this.q = this.d(esk.a(tl.c("selectServer.edit"), $$0 -> {
         fbf.a $$1x = this.l.f();
         if ($$1x instanceof fbf.d) {
            fjd $$2x = ((fbf.d)$$1x).d();
            this.v = new fjd($$2x.a, $$2x.b, fjd.b.c);
            this.v.b($$2x);
            this.f.a(new exi(this, this::e, this.v));
         }
      }).a(74).a());
      this.t = this.d(esk.a(tl.c("selectServer.delete"), $$0 -> {
         fbf.a $$1x = this.l.f();
         if ($$1x instanceof fbf.d) {
            String $$2x = ((fbf.d)$$1x).d().a;
            if ($$2x != null) {
               tl $$3x = tl.c("selectServer.deleteQuestion");
               tl $$4x = tl.a("selectServer.deleteWarning", $$2x);
               tl $$5x = tl.c("selectServer.deleteButton");
               tl $$6x = tk.e;
               this.f.a(new ewy(this::c, $$3x, $$4x, $$5x, $$6x));
            }
         }
      }).a(74).a());
      esk $$3 = this.d(esk.a(tl.c("selectServer.refresh"), $$0 -> this.G()).a(74).a());
      esk $$4 = this.d(esk.a(tk.k, $$0 -> this.f.a(this.o)).a(74).a());
      evy $$5 = evy.d();
      evr $$6 = $$5.a(new evr(308, 20, evr.b.a));
      $$6.a(this.s);
      $$6.a($$1);
      $$6.a($$2);
      $$5.a(evz.b(4));
      evr $$7 = $$5.a(new evr(308, 20, evr.b.a));
      $$7.a(this.q);
      $$7.a(this.t);
      $$7.a($$3);
      $$7.a($$4);
      $$5.a();
      evs.a($$5, 0, this.h - 64, this.g, 64);
      this.D();
   }

   @Override
   public void c() {
      super.c();
      List<gda> $$0 = this.w.a();
      if ($$0 != null) {
         this.l.a($$0);
      }

      this.n.a();
   }

   @Override
   public void h() {
      if (this.x != null) {
         this.x.interrupt();
         this.x = null;
      }

      this.n.b();
      this.l.d();
   }

   private void G() {
      this.f.a(new fbb(this.o));
   }

   private void c(boolean $$0) {
      fbf.a $$1 = this.l.f();
      if ($$0 && $$1 instanceof fbf.d) {
         this.p.a(((fbf.d)$$1).d());
         this.p.b();
         this.l.a(null);
         this.l.a(this.p);
      }

      this.f.a(this);
   }

   private void e(boolean $$0) {
      fbf.a $$1 = this.l.f();
      if ($$0 && $$1 instanceof fbf.d) {
         fjd $$2 = ((fbf.d)$$1).d();
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
         fjd $$1 = this.p.b(this.v.b);
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
         fjd $$1 = this.p.a(this.v.b);
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
         this.G();
         return true;
      } else if (this.l.f() != null) {
         if (ewi.a($$0)) {
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
   public void a(erz $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.u = null;
      this.l.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, 20, 16777215);
      if (this.u != null) {
         $$0.a(this.i, this.u, $$1, $$2);
      }
   }

   public void l() {
      fbf.a $$0 = this.l.f();
      if ($$0 instanceof fbf.d) {
         this.a(((fbf.d)$$0).d());
      } else if ($$0 instanceof fbf.c) {
         gda $$1 = ((fbf.c)$$0).b();
         this.a(new fjd($$1.a(), $$1.b(), fjd.b.a));
      }
   }

   private void a(fjd $$0) {
      ewz.a(this, this.f, fke.a($$0.b), $$0, false);
   }

   public void a(fbf.a $$0) {
      this.l.a($$0);
      this.D();
   }

   @Override
   protected void D() {
      this.s.i = false;
      this.q.i = false;
      this.t.i = false;
      fbf.a $$0 = this.l.f();
      if ($$0 != null && !($$0 instanceof fbf.b)) {
         this.s.i = true;
         if ($$0 instanceof fbf.d) {
            this.q.i = true;
            this.t.i = true;
         }
      }
   }

   public fjf E() {
      return this.n;
   }

   public void c(List<tl> $$0) {
      this.u = $$0;
   }

   public fje F() {
      return this.p;
   }
}
