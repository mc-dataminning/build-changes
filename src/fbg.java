import com.mojang.logging.LogUtils;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fbg extends eyk {
   public static final int a = 308;
   public static final int b = 100;
   public static final int c = 74;
   public static final int k = 64;
   private static final Logger m = LogUtils.getLogger();
   private final fjj n = new fjj();
   private final eyk o;
   protected fbk l;
   private fji p;
   private esq q;
   private esq s;
   private esq t;
   @Nullable
   private List<tl> u;
   private fjh v;
   private gdf.b w;
   @Nullable
   private gdf.a x;
   private boolean y;

   public fbg(eyk $$0) {
      super(tl.c("multiplayer.title"));
      this.o = $$0;
   }

   @Override
   protected void aI_() {
      if (this.y) {
         this.l.a(this.g, this.h, 32, this.h - 64);
      } else {
         this.y = true;
         this.p = new fji(this.f);
         this.p.a();
         this.w = new gdf.b();

         try {
            this.x = new gdf.a(this.w);
            this.x.start();
         } catch (Exception var8) {
            m.warn("Unable to start LAN server detection: {}", var8.getMessage());
         }

         this.l = new fbk(this, this.f, this.g, this.h, 32, this.h - 64, 36);
         this.l.a(this.p);
      }

      this.e(this.l);
      this.s = this.d(esq.a(tl.c("selectServer.select"), $$0 -> this.l()).a(100).a());
      esq $$1 = this.d(esq.a(tl.c("selectServer.direct"), $$0 -> {
         this.v = new fjh(gak.a("selectServer.defaultName"), "", fjh.b.c);
         this.f.a(new exl(this, this::g, this.v));
      }).a(100).a());
      esq $$2 = this.d(esq.a(tl.c("selectServer.add"), $$0 -> {
         this.v = new fjh(gak.a("selectServer.defaultName"), "", fjh.b.c);
         this.f.a(new exn(this, this::f, this.v));
      }).a(100).a());
      this.q = this.d(esq.a(tl.c("selectServer.edit"), $$0 -> {
         fbk.a $$1x = this.l.f();
         if ($$1x instanceof fbk.d) {
            fjh $$2x = ((fbk.d)$$1x).d();
            this.v = new fjh($$2x.a, $$2x.b, fjh.b.c);
            this.v.b($$2x);
            this.f.a(new exn(this, this::e, this.v));
         }
      }).a(74).a());
      this.t = this.d(esq.a(tl.c("selectServer.delete"), $$0 -> {
         fbk.a $$1x = this.l.f();
         if ($$1x instanceof fbk.d) {
            String $$2x = ((fbk.d)$$1x).d().a;
            if ($$2x != null) {
               tl $$3x = tl.c("selectServer.deleteQuestion");
               tl $$4x = tl.a("selectServer.deleteWarning", $$2x);
               tl $$5x = tl.c("selectServer.deleteButton");
               tl $$6x = tk.e;
               this.f.a(new exd(this::c, $$3x, $$4x, $$5x, $$6x));
            }
         }
      }).a(74).a());
      esq $$3 = this.d(esq.a(tl.c("selectServer.refresh"), $$0 -> this.F()).a(74).a());
      esq $$4 = this.d(esq.a(tk.k, $$0 -> this.f.a(this.o)).a(74).a());
      ewd $$5 = ewd.d();
      evw $$6 = $$5.a(new evw(308, 20, evw.b.a));
      $$6.a(this.s);
      $$6.a($$1);
      $$6.a($$2);
      $$5.a(ewe.b(4));
      evw $$7 = $$5.a(new evw(308, 20, evw.b.a));
      $$7.a(this.q);
      $$7.a(this.t);
      $$7.a($$3);
      $$7.a($$4);
      $$5.a();
      evx.a($$5, 0, this.h - 64, this.g, 64);
      this.C();
   }

   @Override
   public void c() {
      super.c();
      List<gde> $$0 = this.w.a();
      if ($$0 != null) {
         this.l.a($$0);
      }

      this.n.a();
   }

   @Override
   public void aA_() {
      if (this.x != null) {
         this.x.interrupt();
         this.x = null;
      }

      this.n.b();
      this.l.d();
   }

   private void F() {
      this.f.a(new fbg(this.o));
   }

   private void c(boolean $$0) {
      fbk.a $$1 = this.l.f();
      if ($$0 && $$1 instanceof fbk.d) {
         this.p.a(((fbk.d)$$1).d());
         this.p.b();
         this.l.a(null);
         this.l.a(this.p);
      }

      this.f.a(this);
   }

   private void e(boolean $$0) {
      fbk.a $$1 = this.l.f();
      if ($$0 && $$1 instanceof fbk.d) {
         fjh $$2 = ((fbk.d)$$1).d();
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
         fjh $$1 = this.p.b(this.v.b);
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
         fjh $$1 = this.p.a(this.v.b);
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
         if (ewn.a($$0)) {
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
   public void a(esf $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.u = null;
      this.l.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, 20, 16777215);
      if (this.u != null) {
         $$0.a(this.i, this.u, $$1, $$2);
      }
   }

   public void l() {
      fbk.a $$0 = this.l.f();
      if ($$0 instanceof fbk.d) {
         this.a(((fbk.d)$$0).d());
      } else if ($$0 instanceof fbk.c) {
         gde $$1 = ((fbk.c)$$0).b();
         this.a(new fjh($$1.a(), $$1.b(), fjh.b.a));
      }
   }

   private void a(fjh $$0) {
      exe.a(this, this.f, fki.a($$0.b), $$0, false);
   }

   public void a(fbk.a $$0) {
      this.l.a($$0);
      this.C();
   }

   @Override
   protected void C() {
      this.s.i = false;
      this.q.i = false;
      this.t.i = false;
      fbk.a $$0 = this.l.f();
      if ($$0 != null && !($$0 instanceof fbk.b)) {
         this.s.i = true;
         if ($$0 instanceof fbk.d) {
            this.q.i = true;
            this.t.i = true;
         }
      }
   }

   public fjj D() {
      return this.n;
   }

   public void c(List<tl> $$0) {
      this.u = $$0;
   }

   public fji E() {
      return this.p;
   }
}
