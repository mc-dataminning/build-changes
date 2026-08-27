import com.mojang.logging.LogUtils;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fnq extends fkt {
   public static final int a = 308;
   public static final int b = 100;
   public static final int c = 74;
   public static final int d = 64;
   private static final Logger s = LogUtils.getLogger();
   private final fwc u = new fwc();
   private final fkt v;
   protected fnu r;
   private fwb w;
   private feu x;
   private feu y;
   private feu z;
   private fwa A;
   private gqu.b B;
   @Nullable
   private gqu.a C;
   private boolean D;

   public fnq(fkt $$0) {
      super(ws.c("multiplayer.title"));
      this.v = $$0;
   }

   @Override
   protected void aM_() {
      if (this.D) {
         this.r.a(this.n, this.o - 64 - 32, 0, 32);
      } else {
         this.D = true;
         this.w = new fwb(this.m);
         this.w.a();
         this.B = new gqu.b();

         try {
            this.C = new gqu.a(this.B);
            this.C.start();
         } catch (Exception var8) {
            s.warn("Unable to start LAN server detection: {}", var8.getMessage());
         }

         this.r = new fnu(this, this.m, this.n, this.o - 64 - 32, 32, 36);
         this.r.a(this.w);
      }

      this.c(this.r);
      this.y = this.c(feu.a(ws.c("selectServer.select"), $$0 -> this.m()).a(100).a());
      feu $$1 = this.c(feu.a(ws.c("selectServer.direct"), $$0 -> {
         this.A = new fwa(gnt.a("selectServer.defaultName"), "", fwa.c.c);
         this.m.a(new fjt(this, this::g, this.A));
      }).a(100).a());
      feu $$2 = this.c(feu.a(ws.c("selectServer.add"), $$0 -> {
         this.A = new fwa(gnt.a("selectServer.defaultName"), "", fwa.c.c);
         this.m.a(new fjv(this, this::f, this.A));
      }).a(100).a());
      this.x = this.c(feu.a(ws.c("selectServer.edit"), $$0 -> {
         fnu.a $$1x = this.r.h();
         if ($$1x instanceof fnu.d) {
            fwa $$2x = ((fnu.d)$$1x).c();
            this.A = new fwa($$2x.a, $$2x.b, fwa.c.c);
            this.A.b($$2x);
            this.m.a(new fjv(this, this::e, this.A));
         }
      }).a(74).a());
      this.z = this.c(feu.a(ws.c("selectServer.delete"), $$0 -> {
         fnu.a $$1x = this.r.h();
         if ($$1x instanceof fnu.d) {
            String $$2x = ((fnu.d)$$1x).c().a;
            if ($$2x != null) {
               ws $$3x = ws.c("selectServer.deleteQuestion");
               ws $$4x = ws.a("selectServer.deleteWarning", $$2x);
               ws $$5x = ws.c("selectServer.deleteButton");
               ws $$6x = wr.e;
               this.m.a(new fjl(this::c, $$3x, $$4x, $$5x, $$6x));
            }
         }
      }).a(74).a());
      feu $$3 = this.c(feu.a(ws.c("selectServer.refresh"), $$0 -> this.F()).a(74).a());
      feu $$4 = this.c(feu.a(wr.k, $$0 -> this.d()).a(74).a());
      fil $$5 = fil.d();
      fie $$6 = $$5.a(new fie(308, 20, fie.b.a));
      $$6.a(this.y);
      $$6.a($$1);
      $$6.a($$2);
      $$5.a(fim.b(4));
      fie $$7 = $$5.a(new fie(308, 20, fie.b.a));
      $$7.a(this.x);
      $$7.a(this.z);
      $$7.a($$3);
      $$7.a($$4);
      $$5.a();
      fif.a($$5, 0, this.o - 64, this.n, 64);
      this.C();
   }

   @Override
   public void d() {
      this.m.a(this.v);
   }

   @Override
   public void e() {
      super.e();
      List<gqt> $$0 = this.B.a();
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
      this.m.a(new fnq(this.v));
   }

   private void c(boolean $$0) {
      fnu.a $$1 = this.r.h();
      if ($$0 && $$1 instanceof fnu.d) {
         this.w.a(((fnu.d)$$1).c());
         this.w.b();
         this.r.a(null);
         this.r.a(this.w);
      }

      this.m.a(this);
   }

   private void e(boolean $$0) {
      fnu.a $$1 = this.r.h();
      if ($$0 && $$1 instanceof fnu.d) {
         fwa $$2 = ((fnu.d)$$1).c();
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
         fwa $$1 = this.w.b(this.A.b);
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
         fwa $$1 = this.w.a(this.A.b);
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
         if (fiv.a($$0)) {
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
   public void a(feh $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.p, this.l, this.n / 2, 20, 16777215);
   }

   public void m() {
      fnu.a $$0 = this.r.h();
      if ($$0 instanceof fnu.d) {
         this.a(((fnu.d)$$0).c());
      } else if ($$0 instanceof fnu.c) {
         gqt $$1 = ((fnu.c)$$0).b();
         this.a(new fwa($$1.a(), $$1.b(), fwa.c.a));
      }
   }

   private void a(fwa $$0) {
      fjm.a(this, this.m, fxd.a($$0.b), $$0, false, null);
   }

   public void a(fnu.a $$0) {
      this.r.a($$0);
      this.C();
   }

   protected void C() {
      this.y.j = false;
      this.x.j = false;
      this.z.j = false;
      fnu.a $$0 = this.r.h();
      if ($$0 != null && !($$0 instanceof fnu.b)) {
         this.y.j = true;
         if ($$0 instanceof fnu.d) {
            this.x.j = true;
            this.z.j = true;
         }
      }
   }

   public fwc D() {
      return this.u;
   }

   public fwb E() {
      return this.w;
   }
}
