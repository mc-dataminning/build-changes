import com.mojang.logging.LogUtils;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fsi extends fpt {
   public static final int a = 308;
   public static final int b = 100;
   public static final int c = 74;
   public static final int d = 64;
   private static final Logger u = LogUtils.getLogger();
   private final gbn v = new gbn();
   private final fpt w;
   protected fsm s;
   private gbm x;
   private fka y;
   private fka z;
   private fka A;
   private gbl B;
   private hau.b C;
   @Nullable
   private hau.a D;
   private boolean E;

   public fsi(fpt $$0) {
      super(xd.c("multiplayer.title"));
      this.w = $$0;
   }

   @Override
   protected void aT_() {
      if (this.E) {
         this.s.a(this.n, this.o - 64 - 32, 0, 32);
      } else {
         this.E = true;
         this.x = new gbm(this.m);
         this.x.a();
         this.C = new hau.b();

         try {
            this.D = new hau.a(this.C);
            this.D.start();
         } catch (Exception var8) {
            u.warn("Unable to start LAN server detection: {}", var8.getMessage());
         }

         this.s = new fsm(this, this.m, this.n, this.o - 64 - 32, 32, 36);
         this.s.a(this.x);
      }

      this.c(this.s);
      this.z = this.c(fka.a(xd.c("selectServer.select"), $$0 -> this.m()).a(100).a());
      fka $$1 = this.c(fka.a(xd.c("selectServer.direct"), $$0 -> {
         this.B = new gbl(gxr.a("selectServer.defaultName"), "", gbl.c.c);
         this.m.a(new foz(this, this::h, this.B));
      }).a(100).a());
      fka $$2 = this.c(fka.a(xd.c("selectServer.add"), $$0 -> {
         this.B = new gbl(gxr.a("selectServer.defaultName"), "", gbl.c.c);
         this.m.a(new fpb(this, this::g, this.B));
      }).a(100).a());
      this.y = this.c(fka.a(xd.c("selectServer.edit"), $$0 -> {
         fsm.a $$1x = this.s.h();
         if ($$1x instanceof fsm.d) {
            gbl $$2x = ((fsm.d)$$1x).c();
            this.B = new gbl($$2x.a, $$2x.b, gbl.c.c);
            this.B.b($$2x);
            this.m.a(new fpb(this, this::f, this.B));
         }
      }).a(74).a());
      this.A = this.c(fka.a(xd.c("selectServer.delete"), $$0 -> {
         fsm.a $$1x = this.s.h();
         if ($$1x instanceof fsm.d) {
            String $$2x = ((fsm.d)$$1x).c().a;
            if ($$2x != null) {
               xd $$3x = xd.c("selectServer.deleteQuestion");
               xd $$4x = xd.a("selectServer.deleteWarning", $$2x);
               xd $$5x = xd.c("selectServer.deleteButton");
               xd $$6x = xc.e;
               this.m.a(new foq(this::c, $$3x, $$4x, $$5x, $$6x));
            }
         }
      }).a(74).a());
      fka $$3 = this.c(fka.a(xd.c("selectServer.refresh"), $$0 -> this.G()).a(74).a());
      fka $$4 = this.c(fka.a(xc.k, $$0 -> this.d()).a(74).a());
      fns $$5 = fns.d();
      fnl $$6 = $$5.a(new fnl(308, 20, fnl.b.a));
      $$6.a(this.z);
      $$6.a($$1);
      $$6.a($$2);
      $$5.a(fnt.b(4));
      fnl $$7 = $$5.a(new fnl(308, 20, fnl.b.a));
      $$7.a(this.y);
      $$7.a(this.A);
      $$7.a($$3);
      $$7.a($$4);
      $$5.a();
      fnm.a($$5, 0, this.o - 64, this.n, 64);
      this.D();
   }

   @Override
   public void d() {
      this.m.a(this.w);
   }

   @Override
   public void e() {
      super.e();
      List<hat> $$0 = this.C.a();
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
      this.m.a(new fsi(this.w));
   }

   private void c(boolean $$0) {
      fsm.a $$1 = this.s.h();
      if ($$0 && $$1 instanceof fsm.d) {
         this.x.a(((fsm.d)$$1).c());
         this.x.b();
         this.s.a(null);
         this.s.a(this.x);
      }

      this.m.a(this);
   }

   private void f(boolean $$0) {
      fsm.a $$1 = this.s.h();
      if ($$0 && $$1 instanceof fsm.d) {
         gbl $$2 = ((fsm.d)$$1).c();
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
         gbl $$1 = this.x.b(this.B.b);
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
         gbl $$1 = this.x.a(this.B.b);
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
         if (foc.a($$0)) {
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
   public void a(fjn $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.p, this.l, this.n / 2, 20, 16777215);
   }

   public void m() {
      fsm.a $$0 = this.s.h();
      if ($$0 instanceof fsm.d) {
         this.a(((fsm.d)$$0).c());
      } else if ($$0 instanceof fsm.c) {
         hat $$1 = ((fsm.c)$$0).b();
         this.a(new gbl($$1.a(), $$1.b(), gbl.c.a));
      }
   }

   private void a(gbl $$0) {
      fos.a(this, this.m, gco.a($$0.b), $$0, false, null);
   }

   public void a(fsm.a $$0) {
      this.s.a($$0);
      this.D();
   }

   protected void D() {
      this.z.j = false;
      this.y.j = false;
      this.A.j = false;
      fsm.a $$0 = this.s.h();
      if ($$0 != null && !($$0 instanceof fsm.b)) {
         this.z.j = true;
         if ($$0 instanceof fsm.d) {
            this.y.j = true;
            this.A.j = true;
         }
      }
   }

   public gbn E() {
      return this.v;
   }

   public gbm F() {
      return this.x;
   }
}
