import com.mojang.logging.LogUtils;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fue extends frp {
   public static final int a = 308;
   public static final int b = 100;
   public static final int c = 74;
   public static final int d = 64;
   private static final Logger u = LogUtils.getLogger();
   private final gdo v = new gdo();
   private final frp w;
   protected fui s;
   private gdn x;
   private flw y;
   private flw z;
   private flw A;
   private gdm B;
   private hdg.b C;
   @Nullable
   private hdg.a D;
   private boolean E;

   public fue(frp $$0) {
      super(xl.c("multiplayer.title"));
      this.w = $$0;
   }

   @Override
   protected void aS_() {
      if (this.E) {
         this.s.a(this.n, this.o - 64 - 32, 0, 32);
      } else {
         this.E = true;
         this.x = new gdn(this.m);
         this.x.a();
         this.C = new hdg.b();

         try {
            this.D = new hdg.a(this.C);
            this.D.start();
         } catch (Exception var8) {
            u.warn("Unable to start LAN server detection: {}", var8.getMessage());
         }

         this.s = new fui(this, this.m, this.n, this.o - 64 - 32, 32, 36);
         this.s.a(this.x);
      }

      this.c(this.s);
      this.z = this.c(flw.a(xl.c("selectServer.select"), $$0 -> this.m()).a(100).a());
      flw $$1 = this.c(flw.a(xl.c("selectServer.direct"), $$0 -> {
         this.B = new gdm(haa.a("selectServer.defaultName"), "", gdm.c.c);
         this.m.a(new fqv(this, this::h, this.B));
      }).a(100).a());
      flw $$2 = this.c(flw.a(xl.c("selectServer.add"), $$0 -> {
         this.B = new gdm(haa.a("selectServer.defaultName"), "", gdm.c.c);
         this.m.a(new fqx(this, this::g, this.B));
      }).a(100).a());
      this.y = this.c(flw.a(xl.c("selectServer.edit"), $$0 -> {
         fui.a $$1x = this.s.h();
         if ($$1x instanceof fui.d) {
            gdm $$2x = ((fui.d)$$1x).c();
            this.B = new gdm($$2x.a, $$2x.b, gdm.c.c);
            this.B.b($$2x);
            this.m.a(new fqx(this, this::f, this.B));
         }
      }).a(74).a());
      this.A = this.c(flw.a(xl.c("selectServer.delete"), $$0 -> {
         fui.a $$1x = this.s.h();
         if ($$1x instanceof fui.d) {
            String $$2x = ((fui.d)$$1x).c().a;
            if ($$2x != null) {
               xl $$3x = xl.c("selectServer.deleteQuestion");
               xl $$4x = xl.a("selectServer.deleteWarning", $$2x);
               xl $$5x = xl.c("selectServer.deleteButton");
               xl $$6x = xk.e;
               this.m.a(new fqn(this::c, $$3x, $$4x, $$5x, $$6x));
            }
         }
      }).a(74).a());
      flw $$3 = this.c(flw.a(xl.c("selectServer.refresh"), $$0 -> this.G()).a(74).a());
      flw $$4 = this.c(flw.a(xk.k, $$0 -> this.aP_()).a(74).a());
      fpp $$5 = fpp.d();
      fpi $$6 = $$5.a(new fpi(308, 20, fpi.b.a));
      $$6.a(this.z);
      $$6.a($$1);
      $$6.a($$2);
      $$5.a(fpq.b(4));
      fpi $$7 = $$5.a(new fpi(308, 20, fpi.b.a));
      $$7.a(this.y);
      $$7.a(this.A);
      $$7.a($$3);
      $$7.a($$4);
      $$5.a();
      fpj.a($$5, 0, this.o - 64, this.n, 64);
      this.D();
   }

   @Override
   public void aP_() {
      this.m.a(this.w);
   }

   @Override
   public void e() {
      super.e();
      List<hdf> $$0 = this.C.a();
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

   private void G() {
      this.m.a(new fue(this.w));
   }

   private void c(boolean $$0) {
      fui.a $$1 = this.s.h();
      if ($$0 && $$1 instanceof fui.d) {
         this.x.a(((fui.d)$$1).c());
         this.x.b();
         this.s.a(null);
         this.s.a(this.x);
      }

      this.m.a(this);
   }

   private void f(boolean $$0) {
      fui.a $$1 = this.s.h();
      if ($$0 && $$1 instanceof fui.d) {
         gdm $$2 = ((fui.d)$$1).c();
         $$2.a = this.B.a;
         $$2.b = this.B.b;
         $$2.b(this.B);
         this.x.b();
         this.s.a(this.x);
      }

      this.m.a(this);
   }

   private void g(boolean $$0) {
      if ($$0) {
         gdm $$1 = this.x.b(this.B.b);
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

      this.m.a(this);
   }

   private void h(boolean $$0) {
      if ($$0) {
         gdm $$1 = this.x.a(this.B.b);
         if ($$1 == null) {
            this.x.a(this.B, true);
            this.x.b();
            this.a(this.B);
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
         this.G();
         return true;
      } else if (this.s.h() != null) {
         if (fpz.a($$0)) {
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
   public void a(flj $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.p, this.l, this.n / 2, 20, 16777215);
   }

   public void m() {
      fui.a $$0 = this.s.h();
      if ($$0 instanceof fui.d) {
         this.a(((fui.d)$$0).c());
      } else if ($$0 instanceof fui.c) {
         hdf $$1 = ((fui.c)$$0).b();
         this.a(new gdm($$1.a(), $$1.b(), gdm.c.a));
      }
   }

   private void a(gdm $$0) {
      fqo.a(this, this.m, gep.a($$0.b), $$0, false, null);
   }

   public void a(fui.a $$0) {
      this.s.a($$0);
      this.D();
   }

   protected void D() {
      this.z.j = false;
      this.y.j = false;
      this.A.j = false;
      fui.a $$0 = this.s.h();
      if ($$0 != null && !($$0 instanceof fui.b)) {
         this.z.j = true;
         if ($$0 instanceof fui.d) {
            this.y.j = true;
            this.A.j = true;
         }
      }
   }

   public gdo E() {
      return this.v;
   }

   public gdn F() {
      return this.x;
   }
}
