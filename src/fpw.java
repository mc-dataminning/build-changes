import com.mojang.logging.LogUtils;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fpw extends fmy {
   public static final int a = 308;
   public static final int b = 100;
   public static final int c = 74;
   public static final int d = 64;
   private static final Logger s = LogUtils.getLogger();
   private final fyg u = new fyg();
   private final fmy v;
   protected fpz r;
   private fyf w;
   private fgz x;
   private fgz y;
   private fgz z;
   private fye A;
   private gtb.b B;
   @Nullable
   private gtb.a C;
   private boolean D;

   public fpw(fmy $$0) {
      super(xl.c("multiplayer.title"));
      this.v = $$0;
   }

   @Override
   protected void aN_() {
      if (this.D) {
         this.r.a(this.n, this.o - 64 - 32, 0, 32);
      } else {
         this.D = true;
         this.w = new fyf(this.m);
         this.w.a();
         this.B = new gtb.b();

         try {
            this.C = new gtb.a(this.B);
            this.C.start();
         } catch (Exception var8) {
            s.warn("Unable to start LAN server detection: {}", var8.getMessage());
         }

         this.r = new fpz(this, this.m, this.n, this.o - 64 - 32, 32, 36);
         this.r.a(this.w);
      }

      this.c(this.r);
      this.y = this.c(fgz.a(xl.c("selectServer.select"), $$0 -> this.m()).a(100).a());
      fgz $$1 = this.c(fgz.a(xl.c("selectServer.direct"), $$0 -> {
         this.A = new fye(gqa.a("selectServer.defaultName"), "", fye.c.c);
         this.m.a(new fly(this, this::g, this.A));
      }).a(100).a());
      fgz $$2 = this.c(fgz.a(xl.c("selectServer.add"), $$0 -> {
         this.A = new fye(gqa.a("selectServer.defaultName"), "", fye.c.c);
         this.m.a(new fma(this, this::f, this.A));
      }).a(100).a());
      this.x = this.c(fgz.a(xl.c("selectServer.edit"), $$0 -> {
         fpz.a $$1x = this.r.h();
         if ($$1x instanceof fpz.d) {
            fye $$2x = ((fpz.d)$$1x).c();
            this.A = new fye($$2x.a, $$2x.b, fye.c.c);
            this.A.b($$2x);
            this.m.a(new fma(this, this::e, this.A));
         }
      }).a(74).a());
      this.z = this.c(fgz.a(xl.c("selectServer.delete"), $$0 -> {
         fpz.a $$1x = this.r.h();
         if ($$1x instanceof fpz.d) {
            String $$2x = ((fpz.d)$$1x).c().a;
            if ($$2x != null) {
               xl $$3x = xl.c("selectServer.deleteQuestion");
               xl $$4x = xl.a("selectServer.deleteWarning", $$2x);
               xl $$5x = xl.c("selectServer.deleteButton");
               xl $$6x = xk.e;
               this.m.a(new flq(this::c, $$3x, $$4x, $$5x, $$6x));
            }
         }
      }).a(74).a());
      fgz $$3 = this.c(fgz.a(xl.c("selectServer.refresh"), $$0 -> this.F()).a(74).a());
      fgz $$4 = this.c(fgz.a(xk.k, $$0 -> this.d()).a(74).a());
      fkq $$5 = fkq.d();
      fkj $$6 = $$5.a(new fkj(308, 20, fkj.b.a));
      $$6.a(this.y);
      $$6.a($$1);
      $$6.a($$2);
      $$5.a(fkr.b(4));
      fkj $$7 = $$5.a(new fkj(308, 20, fkj.b.a));
      $$7.a(this.x);
      $$7.a(this.z);
      $$7.a($$3);
      $$7.a($$4);
      $$5.a();
      fkk.a($$5, 0, this.o - 64, this.n, 64);
      this.C();
   }

   @Override
   public void d() {
      this.m.a(this.v);
   }

   @Override
   public void e() {
      super.e();
      List<gta> $$0 = this.B.a();
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
      this.m.a(new fpw(this.v));
   }

   private void c(boolean $$0) {
      fpz.a $$1 = this.r.h();
      if ($$0 && $$1 instanceof fpz.d) {
         this.w.a(((fpz.d)$$1).c());
         this.w.b();
         this.r.a(null);
         this.r.a(this.w);
      }

      this.m.a(this);
   }

   private void e(boolean $$0) {
      fpz.a $$1 = this.r.h();
      if ($$0 && $$1 instanceof fpz.d) {
         fye $$2 = ((fpz.d)$$1).c();
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
         fye $$1 = this.w.b(this.A.b);
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
         fye $$1 = this.w.a(this.A.b);
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
         if (fla.a($$0)) {
            this.m();
            return true;
         } else {
            return this.r.a($$0, $$1, $$2);
         }
      } else {
         return false;
      }
   }

   @Override
   public void a(fgm $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.p, this.l, this.n / 2, 20, 16777215);
   }

   public void m() {
      fpz.a $$0 = this.r.h();
      if ($$0 instanceof fpz.d) {
         this.a(((fpz.d)$$0).c());
      } else if ($$0 instanceof fpz.c) {
         gta $$1 = ((fpz.c)$$0).b();
         this.a(new fye($$1.a(), $$1.b(), fye.c.a));
      }
   }

   private void a(fye $$0) {
      flr.a(this, this.m, fzh.a($$0.b), $$0, false, null);
   }

   public void a(fpz.a $$0) {
      this.r.a($$0);
      this.C();
   }

   protected void C() {
      this.y.j = false;
      this.x.j = false;
      this.z.j = false;
      fpz.a $$0 = this.r.h();
      if ($$0 != null && !($$0 instanceof fpz.b)) {
         this.y.j = true;
         if ($$0 instanceof fpz.d) {
            this.x.j = true;
            this.z.j = true;
         }
      }
   }

   public fyg D() {
      return this.u;
   }

   public fyf E() {
      return this.w;
   }
}
