import com.mojang.logging.LogUtils;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fdx extends faz {
   public static final int a = 308;
   public static final int b = 100;
   public static final int c = 74;
   public static final int k = 64;
   private static final Logger m = LogUtils.getLogger();
   private final fmb n = new fmb();
   private final faz o;
   protected feb l;
   private fma p;
   private eve q;
   private eve r;
   private eve t;
   @Nullable
   private List<uv> u;
   private flz v;
   private gga.b w;
   @Nullable
   private gga.a x;
   private boolean y;

   public fdx(faz $$0) {
      super(uv.c("multiplayer.title"));
      this.o = $$0;
   }

   @Override
   protected void aQ_() {
      if (this.y) {
         this.l.a(this.g, this.h, 32, this.h - 64);
      } else {
         this.y = true;
         this.p = new fma(this.f);
         this.p.a();
         this.w = new gga.b();

         try {
            this.x = new gga.a(this.w);
            this.x.start();
         } catch (Exception var8) {
            m.warn("Unable to start LAN server detection: {}", var8.getMessage());
         }

         this.l = new feb(this, this.f, this.g, this.h, 32, this.h - 64, 36);
         this.l.a(this.p);
      }

      this.e(this.l);
      this.r = this.d(eve.a(uv.c("selectServer.select"), $$0 -> this.l()).a(100).a());
      eve $$1 = this.d(eve.a(uv.c("selectServer.direct"), $$0 -> {
         this.v = new flz(gdf.a("selectServer.defaultName"), "", flz.b.c);
         this.f.a(new faa(this, this::g, this.v));
      }).a(100).a());
      eve $$2 = this.d(eve.a(uv.c("selectServer.add"), $$0 -> {
         this.v = new flz(gdf.a("selectServer.defaultName"), "", flz.b.c);
         this.f.a(new fac(this, this::f, this.v));
      }).a(100).a());
      this.q = this.d(eve.a(uv.c("selectServer.edit"), $$0 -> {
         feb.a $$1x = this.l.f();
         if ($$1x instanceof feb.d) {
            flz $$2x = ((feb.d)$$1x).c();
            this.v = new flz($$2x.a, $$2x.b, flz.b.c);
            this.v.b($$2x);
            this.f.a(new fac(this, this::e, this.v));
         }
      }).a(74).a());
      this.t = this.d(eve.a(uv.c("selectServer.delete"), $$0 -> {
         feb.a $$1x = this.l.f();
         if ($$1x instanceof feb.d) {
            String $$2x = ((feb.d)$$1x).c().a;
            if ($$2x != null) {
               uv $$3x = uv.c("selectServer.deleteQuestion");
               uv $$4x = uv.a("selectServer.deleteWarning", $$2x);
               uv $$5x = uv.c("selectServer.deleteButton");
               uv $$6x = uu.e;
               this.f.a(new ezs(this::c, $$3x, $$4x, $$5x, $$6x));
            }
         }
      }).a(74).a());
      eve $$3 = this.d(eve.a(uv.c("selectServer.refresh"), $$0 -> this.F()).a(74).a());
      eve $$4 = this.d(eve.a(uu.k, $$0 -> this.f.a(this.o)).a(74).a());
      eys $$5 = eys.d();
      eyl $$6 = $$5.a(new eyl(308, 20, eyl.b.a));
      $$6.a(this.r);
      $$6.a($$1);
      $$6.a($$2);
      $$5.a(eyt.b(4));
      eyl $$7 = $$5.a(new eyl(308, 20, eyl.b.a));
      $$7.a(this.q);
      $$7.a(this.t);
      $$7.a($$3);
      $$7.a($$4);
      $$5.a();
      eym.a($$5, 0, this.h - 64, this.g, 64);
      this.C();
   }

   @Override
   public void d() {
      super.d();
      List<gfz> $$0 = this.w.a();
      if ($$0 != null) {
         this.l.a($$0);
      }

      this.n.a();
   }

   @Override
   public void aH_() {
      if (this.x != null) {
         this.x.interrupt();
         this.x = null;
      }

      this.n.b();
      this.l.e();
   }

   private void F() {
      this.f.a(new fdx(this.o));
   }

   private void c(boolean $$0) {
      feb.a $$1 = this.l.f();
      if ($$0 && $$1 instanceof feb.d) {
         this.p.a(((feb.d)$$1).c());
         this.p.b();
         this.l.a(null);
         this.l.a(this.p);
      }

      this.f.a(this);
   }

   private void e(boolean $$0) {
      feb.a $$1 = this.l.f();
      if ($$0 && $$1 instanceof feb.d) {
         flz $$2 = ((feb.d)$$1).c();
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
         flz $$1 = this.p.b(this.v.b);
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
         flz $$1 = this.p.a(this.v.b);
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
         if (ezc.a($$0)) {
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
   public void a(eut $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.u = null;
      this.l.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, 20, 16777215);
      if (this.u != null) {
         $$0.a(this.i, this.u, $$1, $$2);
      }
   }

   public void l() {
      feb.a $$0 = this.l.f();
      if ($$0 instanceof feb.d) {
         this.a(((feb.d)$$0).c());
      } else if ($$0 instanceof feb.c) {
         gfz $$1 = ((feb.c)$$0).b();
         this.a(new flz($$1.a(), $$1.b(), flz.b.a));
      }
   }

   private void a(flz $$0) {
      ezt.a(this, this.f, fna.a($$0.b), $$0, false);
   }

   public void a(feb.a $$0) {
      this.l.a($$0);
      this.C();
   }

   @Override
   protected void C() {
      this.r.i = false;
      this.q.i = false;
      this.t.i = false;
      feb.a $$0 = this.l.f();
      if ($$0 != null && !($$0 instanceof feb.b)) {
         this.r.i = true;
         if ($$0 instanceof feb.d) {
            this.q.i = true;
            this.t.i = true;
         }
      }
   }

   public fmb D() {
      return this.n;
   }

   public void c(List<uv> $$0) {
      this.u = $$0;
   }

   public fma E() {
      return this.p;
   }
}
