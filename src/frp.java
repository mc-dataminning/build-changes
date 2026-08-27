import com.mojang.logging.LogUtils;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class frp extends fon {
   public static final int a = 308;
   public static final int b = 100;
   public static final int c = 74;
   public static final int d = 64;
   private static final Logger s = LogUtils.getLogger();
   private final gad u = new gad();
   private final fon v;
   protected frt r;
   private gac w;
   private fin x;
   private fin y;
   private fin z;
   private gab A;
   private gvf.b B;
   @Nullable
   private gvf.a C;
   private boolean D;

   public frp(fon $$0) {
      super(xe.c("multiplayer.title"));
      this.v = $$0;
   }

   @Override
   protected void aN_() {
      if (this.D) {
         this.r.a(this.n, this.o - 64 - 32, 0, 32);
      } else {
         this.D = true;
         this.w = new gac(this.m);
         this.w.a();
         this.B = new gvf.b();

         try {
            this.C = new gvf.a(this.B);
            this.C.start();
         } catch (Exception var8) {
            s.warn("Unable to start LAN server detection: {}", var8.getMessage());
         }

         this.r = new frt(this, this.m, this.n, this.o - 64 - 32, 32, 36);
         this.r.a(this.w);
      }

      this.c(this.r);
      this.y = this.c(fin.a(xe.c("selectServer.select"), $$0 -> this.B()).a(100).a());
      fin $$1 = this.c(fin.a(xe.c("selectServer.direct"), $$0 -> {
         this.A = new gab(gse.a("selectServer.defaultName"), "", gab.c.c);
         this.m.a(new fnm(this, this::g, this.A));
      }).a(100).a());
      fin $$2 = this.c(fin.a(xe.c("selectServer.add"), $$0 -> {
         this.A = new gab(gse.a("selectServer.defaultName"), "", gab.c.c);
         this.m.a(new fno(this, this::f, this.A));
      }).a(100).a());
      this.x = this.c(fin.a(xe.c("selectServer.edit"), $$0 -> {
         frt.a $$1x = this.r.h();
         if ($$1x instanceof frt.d) {
            gab $$2x = ((frt.d)$$1x).c();
            this.A = new gab($$2x.a, $$2x.b, gab.c.c);
            this.A.b($$2x);
            this.m.a(new fno(this, this::e, this.A));
         }
      }).a(74).a());
      this.z = this.c(fin.a(xe.c("selectServer.delete"), $$0 -> {
         frt.a $$1x = this.r.h();
         if ($$1x instanceof frt.d) {
            String $$2x = ((frt.d)$$1x).c().a;
            if ($$2x != null) {
               xe $$3x = xe.c("selectServer.deleteQuestion");
               xe $$4x = xe.a("selectServer.deleteWarning", $$2x);
               xe $$5x = xe.c("selectServer.deleteButton");
               xe $$6x = xd.e;
               this.m.a(new fne(this::c, $$3x, $$4x, $$5x, $$6x));
            }
         }
      }).a(74).a());
      fin $$3 = this.c(fin.a(xe.c("selectServer.refresh"), $$0 -> this.F()).a(74).a());
      fin $$4 = this.c(fin.a(xd.k, $$0 -> this.d()).a(74).a());
      fme $$5 = fme.d();
      flx $$6 = $$5.a(new flx(308, 20, flx.b.a));
      $$6.a(this.y);
      $$6.a($$1);
      $$6.a($$2);
      $$5.a(fmf.b(4));
      flx $$7 = $$5.a(new flx(308, 20, flx.b.a));
      $$7.a(this.x);
      $$7.a(this.z);
      $$7.a($$3);
      $$7.a($$4);
      $$5.a();
      fly.a($$5, 0, this.o - 64, this.n, 64);
      this.C();
   }

   @Override
   public void d() {
      this.m.a(this.v);
   }

   @Override
   public void e() {
      super.e();
      List<gve> $$0 = this.B.a();
      if ($$0 != null) {
         this.r.a($$0);
      }

      this.u.a();
   }

   @Override
   public void j() {
      if (this.C != null) {
         this.C.interrupt();
         this.C = null;
      }

      this.u.b();
      this.r.d();
   }

   private void F() {
      this.m.a(new frp(this.v));
   }

   private void c(boolean $$0) {
      frt.a $$1 = this.r.h();
      if ($$0 && $$1 instanceof frt.d) {
         this.w.a(((frt.d)$$1).c());
         this.w.b();
         this.r.a(null);
         this.r.a(this.w);
      }

      this.m.a(this);
   }

   private void e(boolean $$0) {
      frt.a $$1 = this.r.h();
      if ($$0 && $$1 instanceof frt.d) {
         gab $$2 = ((frt.d)$$1).c();
         $$2.a = this.A.a;
         $$2.b = this.A.b;
         $$2.b(this.A);
         this.w.b();
         this.r.a(this.w);
      }

      this.m.a(this);
   }

   private void f(boolean $$0) {
      if ($$0) {
         gab $$1 = this.w.b(this.A.b);
         if ($$1 != null) {
            $$1.a(this.A);
            this.w.b();
         } else {
            this.w.a(this.A, false);
            this.w.b();
         }

         this.r.a(null);
         this.r.a(this.w);
      }

      this.m.a(this);
   }

   private void g(boolean $$0) {
      if ($$0) {
         gab $$1 = this.w.a(this.A.b);
         if ($$1 == null) {
            this.w.a(this.A, true);
            this.w.b();
            this.a(this.A);
         } else {
            this.a($$1);
         }
      } else {
         this.m.a(this);
      }
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if (super.a($$0, $$1, $$2)) {
         return true;
      } else if ($$0 == 294) {
         this.F();
         return true;
      } else if (this.r.h() != null) {
         if (fmo.a($$0)) {
            this.B();
            return true;
         } else {
            return this.r.a($$0, $$1, $$2);
         }
      } else {
         return false;
      }
   }

   @Override
   public void a(fia $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.p, this.l, this.n / 2, 20, 16777215);
   }

   public void B() {
      frt.a $$0 = this.r.h();
      if ($$0 instanceof frt.d) {
         this.a(((frt.d)$$0).c());
      } else if ($$0 instanceof frt.c) {
         gve $$1 = ((frt.c)$$0).b();
         this.a(new gab($$1.a(), $$1.b(), gab.c.a));
      }
   }

   private void a(gab $$0) {
      fnf.a(this, this.m, gbe.a($$0.b), $$0, false, null);
   }

   public void a(frt.a $$0) {
      this.r.a($$0);
      this.C();
   }

   protected void C() {
      this.y.j = false;
      this.x.j = false;
      this.z.j = false;
      frt.a $$0 = this.r.h();
      if ($$0 != null && !($$0 instanceof frt.b)) {
         this.y.j = true;
         if ($$0 instanceof frt.d) {
            this.x.j = true;
            this.z.j = true;
         }
      }
   }

   public gad D() {
      return this.u;
   }

   public gac E() {
      return this.w;
   }
}
