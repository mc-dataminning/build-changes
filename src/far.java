import com.mojang.logging.LogUtils;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class far extends exv {
   public static final int a = 308;
   public static final int b = 100;
   public static final int c = 74;
   public static final int k = 64;
   private static final Logger m = LogUtils.getLogger();
   private final fip n = new fip();
   private final exv o;
   protected fav l;
   private fio p;
   private esi q;
   private esi s;
   private esi t;
   @Nullable
   private List<te> u;
   private fin v;
   private gch.b w;
   @Nullable
   private gch.a x;
   private boolean y;

   public far(exv $$0) {
      super(te.c("multiplayer.title"));
      this.o = $$0;
   }

   @Override
   protected void aE_() {
      if (this.y) {
         this.l.a(this.g, this.h, 32, this.h - 64);
      } else {
         this.y = true;
         this.p = new fio(this.f);
         this.p.a();
         this.w = new gch.b();

         try {
            this.x = new gch.a(this.w);
            this.x.start();
         } catch (Exception var8) {
            m.warn("Unable to start LAN server detection: {}", var8.getMessage());
         }

         this.l = new fav(this, this.f, this.g, this.h, 32, this.h - 64, 36);
         this.l.a(this.p);
      }

      this.e(this.l);
      this.s = this.d(esi.a(te.c("selectServer.select"), $$0 -> this.l()).a(100).a());
      esi $$1 = this.d(esi.a(te.c("selectServer.direct"), $$0 -> {
         this.v = new fin(fzm.a("selectServer.defaultName"), "", fin.b.c);
         this.f.a(new eww(this, this::g, this.v));
      }).a(100).a());
      esi $$2 = this.d(esi.a(te.c("selectServer.add"), $$0 -> {
         this.v = new fin(fzm.a("selectServer.defaultName"), "", fin.b.c);
         this.f.a(new ewy(this, this::f, this.v));
      }).a(100).a());
      this.q = this.d(esi.a(te.c("selectServer.edit"), $$0 -> {
         fav.a $$1x = this.l.f();
         if ($$1x instanceof fav.d) {
            fin $$2x = ((fav.d)$$1x).d();
            this.v = new fin($$2x.a, $$2x.b, fin.b.c);
            this.v.b($$2x);
            this.f.a(new ewy(this, this::e, this.v));
         }
      }).a(74).a());
      this.t = this.d(esi.a(te.c("selectServer.delete"), $$0 -> {
         fav.a $$1x = this.l.f();
         if ($$1x instanceof fav.d) {
            String $$2x = ((fav.d)$$1x).d().a;
            if ($$2x != null) {
               te $$3x = te.c("selectServer.deleteQuestion");
               te $$4x = te.a("selectServer.deleteWarning", $$2x);
               te $$5x = te.c("selectServer.deleteButton");
               te $$6x = td.e;
               this.f.a(new ewo(this::c, $$3x, $$4x, $$5x, $$6x));
            }
         }
      }).a(74).a());
      esi $$3 = this.d(esi.a(te.c("selectServer.refresh"), $$0 -> this.E()).a(74).a());
      esi $$4 = this.d(esi.a(td.k, $$0 -> this.f.a(this.o)).a(74).a());
      evo $$5 = evo.d();
      evh $$6 = $$5.a(new evh(308, 20, evh.b.a));
      $$6.a(this.s);
      $$6.a($$1);
      $$6.a($$2);
      $$5.a(evp.b(4));
      evh $$7 = $$5.a(new evh(308, 20, evh.b.a));
      $$7.a(this.q);
      $$7.a(this.t);
      $$7.a($$3);
      $$7.a($$4);
      $$5.a();
      evi.a($$5, 0, this.h - 64, this.g, 64);
      this.B();
   }

   @Override
   public void c() {
      super.c();
      List<gcg> $$0 = this.w.a();
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

   private void E() {
      this.f.a(new far(this.o));
   }

   private void c(boolean $$0) {
      fav.a $$1 = this.l.f();
      if ($$0 && $$1 instanceof fav.d) {
         this.p.a(((fav.d)$$1).d());
         this.p.b();
         this.l.a(null);
         this.l.a(this.p);
      }

      this.f.a(this);
   }

   private void e(boolean $$0) {
      fav.a $$1 = this.l.f();
      if ($$0 && $$1 instanceof fav.d) {
         fin $$2 = ((fav.d)$$1).d();
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
         fin $$1 = this.p.b(this.v.b);
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
         fin $$1 = this.p.a(this.v.b);
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
         this.E();
         return true;
      } else if (this.l.f() != null) {
         if (evy.a($$0)) {
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
   public void a(erx $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.u = null;
      this.l.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, 20, 16777215);
      if (this.u != null) {
         $$0.a(this.i, this.u, $$1, $$2);
      }
   }

   public void l() {
      fav.a $$0 = this.l.f();
      if ($$0 instanceof fav.d) {
         this.a(((fav.d)$$0).d());
      } else if ($$0 instanceof fav.c) {
         gcg $$1 = ((fav.c)$$0).b();
         this.a(new fin($$1.a(), $$1.b(), fin.b.a));
      }
   }

   private void a(fin $$0) {
      ewp.a(this, this.f, fjk.a($$0.b), $$0, false);
   }

   public void a(fav.a $$0) {
      this.l.a($$0);
      this.B();
   }

   @Override
   protected void B() {
      this.s.i = false;
      this.q.i = false;
      this.t.i = false;
      fav.a $$0 = this.l.f();
      if ($$0 != null && !($$0 instanceof fav.b)) {
         this.s.i = true;
         if ($$0 instanceof fav.d) {
            this.q.i = true;
            this.t.i = true;
         }
      }
   }

   public fip C() {
      return this.n;
   }

   public void c(List<te> $$0) {
      this.u = $$0;
   }

   public fio D() {
      return this.p;
   }
}
