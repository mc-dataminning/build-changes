import com.mojang.logging.LogUtils;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fbi extends eym {
   public static final int a = 308;
   public static final int b = 100;
   public static final int c = 74;
   public static final int k = 64;
   private static final Logger m = LogUtils.getLogger();
   private final fjl n = new fjl();
   private final eym o;
   protected fbm l;
   private fjk p;
   private ess q;
   private ess s;
   private ess t;
   @Nullable
   private List<tn> u;
   private fjj v;
   private gdh.b w;
   @Nullable
   private gdh.a x;
   private boolean y;

   public fbi(eym $$0) {
      super(tn.c("multiplayer.title"));
      this.o = $$0;
   }

   @Override
   protected void aH_() {
      if (this.y) {
         this.l.a(this.g, this.h, 32, this.h - 64);
      } else {
         this.y = true;
         this.p = new fjk(this.f);
         this.p.a();
         this.w = new gdh.b();

         try {
            this.x = new gdh.a(this.w);
            this.x.start();
         } catch (Exception var8) {
            m.warn("Unable to start LAN server detection: {}", var8.getMessage());
         }

         this.l = new fbm(this, this.f, this.g, this.h, 32, this.h - 64, 36);
         this.l.a(this.p);
      }

      this.e(this.l);
      this.s = this.d(ess.a(tn.c("selectServer.select"), $$0 -> this.l()).a(100).a());
      ess $$1 = this.d(ess.a(tn.c("selectServer.direct"), $$0 -> {
         this.v = new fjj(gam.a("selectServer.defaultName"), "", fjj.b.c);
         this.f.a(new exn(this, this::g, this.v));
      }).a(100).a());
      ess $$2 = this.d(ess.a(tn.c("selectServer.add"), $$0 -> {
         this.v = new fjj(gam.a("selectServer.defaultName"), "", fjj.b.c);
         this.f.a(new exp(this, this::f, this.v));
      }).a(100).a());
      this.q = this.d(ess.a(tn.c("selectServer.edit"), $$0 -> {
         fbm.a $$1x = this.l.f();
         if ($$1x instanceof fbm.d) {
            fjj $$2x = ((fbm.d)$$1x).d();
            this.v = new fjj($$2x.a, $$2x.b, fjj.b.c);
            this.v.b($$2x);
            this.f.a(new exp(this, this::e, this.v));
         }
      }).a(74).a());
      this.t = this.d(ess.a(tn.c("selectServer.delete"), $$0 -> {
         fbm.a $$1x = this.l.f();
         if ($$1x instanceof fbm.d) {
            String $$2x = ((fbm.d)$$1x).d().a;
            if ($$2x != null) {
               tn $$3x = tn.c("selectServer.deleteQuestion");
               tn $$4x = tn.a("selectServer.deleteWarning", $$2x);
               tn $$5x = tn.c("selectServer.deleteButton");
               tn $$6x = tm.e;
               this.f.a(new exf(this::c, $$3x, $$4x, $$5x, $$6x));
            }
         }
      }).a(74).a());
      ess $$3 = this.d(ess.a(tn.c("selectServer.refresh"), $$0 -> this.G()).a(74).a());
      ess $$4 = this.d(ess.a(tm.k, $$0 -> this.f.a(this.o)).a(74).a());
      ewf $$5 = ewf.d();
      evy $$6 = $$5.a(new evy(308, 20, evy.b.a));
      $$6.a(this.s);
      $$6.a($$1);
      $$6.a($$2);
      $$5.a(ewg.b(4));
      evy $$7 = $$5.a(new evy(308, 20, evy.b.a));
      $$7.a(this.q);
      $$7.a(this.t);
      $$7.a($$3);
      $$7.a($$4);
      $$5.a();
      evz.a($$5, 0, this.h - 64, this.g, 64);
      this.D();
   }

   @Override
   public void c() {
      super.c();
      List<gdg> $$0 = this.w.a();
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
      this.f.a(new fbi(this.o));
   }

   private void c(boolean $$0) {
      fbm.a $$1 = this.l.f();
      if ($$0 && $$1 instanceof fbm.d) {
         this.p.a(((fbm.d)$$1).d());
         this.p.b();
         this.l.a(null);
         this.l.a(this.p);
      }

      this.f.a(this);
   }

   private void e(boolean $$0) {
      fbm.a $$1 = this.l.f();
      if ($$0 && $$1 instanceof fbm.d) {
         fjj $$2 = ((fbm.d)$$1).d();
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
         fjj $$1 = this.p.b(this.v.b);
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
         fjj $$1 = this.p.a(this.v.b);
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
         if (ewp.a($$0)) {
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
   public void a(esh $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.u = null;
      this.l.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, 20, 16777215);
      if (this.u != null) {
         $$0.a(this.i, this.u, $$1, $$2);
      }
   }

   public void l() {
      fbm.a $$0 = this.l.f();
      if ($$0 instanceof fbm.d) {
         this.a(((fbm.d)$$0).d());
      } else if ($$0 instanceof fbm.c) {
         gdg $$1 = ((fbm.c)$$0).b();
         this.a(new fjj($$1.a(), $$1.b(), fjj.b.a));
      }
   }

   private void a(fjj $$0) {
      exg.a(this, this.f, fkk.a($$0.b), $$0, false);
   }

   public void a(fbm.a $$0) {
      this.l.a($$0);
      this.D();
   }

   @Override
   protected void D() {
      this.s.i = false;
      this.q.i = false;
      this.t.i = false;
      fbm.a $$0 = this.l.f();
      if ($$0 != null && !($$0 instanceof fbm.b)) {
         this.s.i = true;
         if ($$0 instanceof fbm.d) {
            this.q.i = true;
            this.t.i = true;
         }
      }
   }

   public fjl E() {
      return this.n;
   }

   public void c(List<tn> $$0) {
      this.u = $$0;
   }

   public fjk F() {
      return this.p;
   }
}
