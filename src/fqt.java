import com.mojang.logging.LogUtils;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fqt extends fod {
   public static final int a = 308;
   public static final int b = 100;
   public static final int c = 74;
   public static final int r = 64;
   private static final Logger u = LogUtils.getLogger();
   private final fzv v = new fzv();
   private final fod w;
   protected fqx s;
   private fzu x;
   private fim y;
   private fim z;
   private fim A;
   private fzt B;
   private guq.b C;
   @Nullable
   private guq.a D;
   private boolean E;

   public fqt(fod $$0) {
      super(wz.c("multiplayer.title"));
      this.w = $$0;
   }

   @Override
   protected void aT_() {
      if (this.E) {
         this.s.a(this.m, this.n - 64 - 32, 0, 32);
      } else {
         this.E = true;
         this.x = new fzu(this.l);
         this.x.a();
         this.C = new guq.b();

         try {
            this.D = new guq.a(this.C);
            this.D.start();
         } catch (Exception var8) {
            u.warn("Unable to start LAN server detection: {}", var8.getMessage());
         }

         this.s = new fqx(this, this.l, this.m, this.n - 64 - 32, 32, 36);
         this.s.a(this.x);
      }

      this.c(this.s);
      this.z = this.c(fim.a(wz.c("selectServer.select"), $$0 -> this.m()).a(100).a());
      fim $$1 = this.c(fim.a(wz.c("selectServer.direct"), $$0 -> {
         this.B = new fzt(grr.a("selectServer.defaultName"), "", fzt.c.c);
         this.l.a(new fnj(this, this::h, this.B));
      }).a(100).a());
      fim $$2 = this.c(fim.a(wz.c("selectServer.add"), $$0 -> {
         this.B = new fzt(grr.a("selectServer.defaultName"), "", fzt.c.c);
         this.l.a(new fnl(this, this::g, this.B));
      }).a(100).a());
      this.y = this.c(fim.a(wz.c("selectServer.edit"), $$0 -> {
         fqx.a $$1x = this.s.h();
         if ($$1x instanceof fqx.d) {
            fzt $$2x = ((fqx.d)$$1x).c();
            this.B = new fzt($$2x.a, $$2x.b, fzt.c.c);
            this.B.b($$2x);
            this.l.a(new fnl(this, this::f, this.B));
         }
      }).a(74).a());
      this.A = this.c(fim.a(wz.c("selectServer.delete"), $$0 -> {
         fqx.a $$1x = this.s.h();
         if ($$1x instanceof fqx.d) {
            String $$2x = ((fqx.d)$$1x).c().a;
            if ($$2x != null) {
               wz $$3x = wz.c("selectServer.deleteQuestion");
               wz $$4x = wz.a("selectServer.deleteWarning", $$2x);
               wz $$5x = wz.c("selectServer.deleteButton");
               wz $$6x = wy.e;
               this.l.a(new fnb(this::c, $$3x, $$4x, $$5x, $$6x));
            }
         }
      }).a(74).a());
      fim $$3 = this.c(fim.a(wz.c("selectServer.refresh"), $$0 -> this.F()).a(74).a());
      fim $$4 = this.c(fim.a(wy.k, $$0 -> this.d()).a(74).a());
      fmd $$5 = fmd.d();
      flw $$6 = $$5.a(new flw(308, 20, flw.b.a));
      $$6.a(this.z);
      $$6.a($$1);
      $$6.a($$2);
      $$5.a(fme.b(4));
      flw $$7 = $$5.a(new flw(308, 20, flw.b.a));
      $$7.a(this.y);
      $$7.a(this.A);
      $$7.a($$3);
      $$7.a($$4);
      $$5.a();
      flx.a($$5, 0, this.n - 64, this.m, 64);
      this.C();
   }

   @Override
   public void d() {
      this.l.a(this.w);
   }

   @Override
   public void e() {
      super.e();
      List<gup> $$0 = this.C.a();
      if ($$0 != null) {
         this.s.a($$0);
      }

      this.v.a();
   }

   @Override
   public void j() {
      if (this.D != null) {
         this.D.interrupt();
         this.D = null;
      }

      this.v.b();
      this.s.c();
   }

   private void F() {
      this.l.a(new fqt(this.w));
   }

   private void c(boolean $$0) {
      fqx.a $$1 = this.s.h();
      if ($$0 && $$1 instanceof fqx.d) {
         this.x.a(((fqx.d)$$1).c());
         this.x.b();
         this.s.a(null);
         this.s.a(this.x);
      }

      this.l.a(this);
   }

   private void f(boolean $$0) {
      fqx.a $$1 = this.s.h();
      if ($$0 && $$1 instanceof fqx.d) {
         fzt $$2 = ((fqx.d)$$1).c();
         $$2.a = this.B.a;
         $$2.b = this.B.b;
         $$2.b(this.B);
         this.x.b();
         this.s.a(this.x);
      }

      this.l.a(this);
   }

   private void g(boolean $$0) {
      if ($$0) {
         fzt $$1 = this.x.b(this.B.b);
         if ($$1 != null) {
            $$1.a(this.B);
            this.x.b();
         } else {
            this.x.a(this.B, false);
            this.x.b();
         }

         this.s.a(null);
         this.s.a(this.x);
      }

      this.l.a(this);
   }

   private void h(boolean $$0) {
      if ($$0) {
         fzt $$1 = this.x.a(this.B.b);
         if ($$1 == null) {
            this.x.a(this.B, true);
            this.x.b();
            this.a(this.B);
         } else {
            this.a($$1);
         }
      } else {
         this.l.a(this);
      }
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if (super.a($$0, $$1, $$2)) {
         return true;
      } else if ($$0 == 294) {
         this.F();
         return true;
      } else if (this.s.h() != null) {
         if (fmn.a($$0)) {
            this.m();
            return true;
         } else {
            return this.s.a($$0, $$1, $$2);
         }
      } else {
         return false;
      }
   }

   @Override
   public void a(fhz $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.o, this.k, this.m / 2, 20, 16777215);
   }

   public void m() {
      fqx.a $$0 = this.s.h();
      if ($$0 instanceof fqx.d) {
         this.a(((fqx.d)$$0).c());
      } else if ($$0 instanceof fqx.c) {
         gup $$1 = ((fqx.c)$$0).b();
         this.a(new fzt($$1.a(), $$1.b(), fzt.c.a));
      }
   }

   private void a(fzt $$0) {
      fnc.a(this, this.l, gax.a($$0.b), $$0, false, null);
   }

   public void a(fqx.a $$0) {
      this.s.a($$0);
      this.C();
   }

   protected void C() {
      this.z.j = false;
      this.y.j = false;
      this.A.j = false;
      fqx.a $$0 = this.s.h();
      if ($$0 != null && !($$0 instanceof fqx.b)) {
         this.z.j = true;
         if ($$0 instanceof fqx.d) {
            this.y.j = true;
            this.A.j = true;
         }
      }
   }

   public fzv D() {
      return this.v;
   }

   public fzu E() {
      return this.x;
   }
}
