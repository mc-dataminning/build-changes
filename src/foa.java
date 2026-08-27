import com.mojang.logging.LogUtils;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class foa extends fld {
   public static final int a = 308;
   public static final int b = 100;
   public static final int c = 74;
   public static final int d = 64;
   private static final Logger s = LogUtils.getLogger();
   private final fwm u = new fwm();
   private final fld v;
   protected foe r;
   private fwl w;
   private ffe x;
   private ffe y;
   private ffe z;
   private fwk A;
   private grf.b B;
   @Nullable
   private grf.a C;
   private boolean D;

   public foa(fld $$0) {
      super(wu.c("multiplayer.title"));
      this.v = $$0;
   }

   @Override
   protected void aM_() {
      if (this.D) {
         this.r.a(this.n, this.o - 64 - 32, 0, 32);
      } else {
         this.D = true;
         this.w = new fwl(this.m);
         this.w.a();
         this.B = new grf.b();

         try {
            this.C = new grf.a(this.B);
            this.C.start();
         } catch (Exception var8) {
            s.warn("Unable to start LAN server detection: {}", var8.getMessage());
         }

         this.r = new foe(this, this.m, this.n, this.o - 64 - 32, 32, 36);
         this.r.a(this.w);
      }

      this.c(this.r);
      this.y = this.c(ffe.a(wu.c("selectServer.select"), $$0 -> this.m()).a(100).a());
      ffe $$1 = this.c(ffe.a(wu.c("selectServer.direct"), $$0 -> {
         this.A = new fwk(goe.a("selectServer.defaultName"), "", fwk.c.c);
         this.m.a(new fkd(this, this::g, this.A));
      }).a(100).a());
      ffe $$2 = this.c(ffe.a(wu.c("selectServer.add"), $$0 -> {
         this.A = new fwk(goe.a("selectServer.defaultName"), "", fwk.c.c);
         this.m.a(new fkf(this, this::f, this.A));
      }).a(100).a());
      this.x = this.c(ffe.a(wu.c("selectServer.edit"), $$0 -> {
         foe.a $$1x = this.r.h();
         if ($$1x instanceof foe.d) {
            fwk $$2x = ((foe.d)$$1x).c();
            this.A = new fwk($$2x.a, $$2x.b, fwk.c.c);
            this.A.b($$2x);
            this.m.a(new fkf(this, this::e, this.A));
         }
      }).a(74).a());
      this.z = this.c(ffe.a(wu.c("selectServer.delete"), $$0 -> {
         foe.a $$1x = this.r.h();
         if ($$1x instanceof foe.d) {
            String $$2x = ((foe.d)$$1x).c().a;
            if ($$2x != null) {
               wu $$3x = wu.c("selectServer.deleteQuestion");
               wu $$4x = wu.a("selectServer.deleteWarning", $$2x);
               wu $$5x = wu.c("selectServer.deleteButton");
               wu $$6x = wt.e;
               this.m.a(new fjv(this::c, $$3x, $$4x, $$5x, $$6x));
            }
         }
      }).a(74).a());
      ffe $$3 = this.c(ffe.a(wu.c("selectServer.refresh"), $$0 -> this.F()).a(74).a());
      ffe $$4 = this.c(ffe.a(wt.k, $$0 -> this.d()).a(74).a());
      fiv $$5 = fiv.d();
      fio $$6 = $$5.a(new fio(308, 20, fio.b.a));
      $$6.a(this.y);
      $$6.a($$1);
      $$6.a($$2);
      $$5.a(fiw.b(4));
      fio $$7 = $$5.a(new fio(308, 20, fio.b.a));
      $$7.a(this.x);
      $$7.a(this.z);
      $$7.a($$3);
      $$7.a($$4);
      $$5.a();
      fip.a($$5, 0, this.o - 64, this.n, 64);
      this.C();
   }

   @Override
   public void d() {
      this.m.a(this.v);
   }

   @Override
   public void e() {
      super.e();
      List<gre> $$0 = this.B.a();
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
      this.m.a(new foa(this.v));
   }

   private void c(boolean $$0) {
      foe.a $$1 = this.r.h();
      if ($$0 && $$1 instanceof foe.d) {
         this.w.a(((foe.d)$$1).c());
         this.w.b();
         this.r.a(null);
         this.r.a(this.w);
      }

      this.m.a(this);
   }

   private void e(boolean $$0) {
      foe.a $$1 = this.r.h();
      if ($$0 && $$1 instanceof foe.d) {
         fwk $$2 = ((foe.d)$$1).c();
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
         fwk $$1 = this.w.b(this.A.b);
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
         fwk $$1 = this.w.a(this.A.b);
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
         if (fjf.a($$0)) {
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
   public void a(fer $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.p, this.l, this.n / 2, 20, 16777215);
   }

   public void m() {
      foe.a $$0 = this.r.h();
      if ($$0 instanceof foe.d) {
         this.a(((foe.d)$$0).c());
      } else if ($$0 instanceof foe.c) {
         gre $$1 = ((foe.c)$$0).b();
         this.a(new fwk($$1.a(), $$1.b(), fwk.c.a));
      }
   }

   private void a(fwk $$0) {
      fjw.a(this, this.m, fxn.a($$0.b), $$0, false, null);
   }

   public void a(foe.a $$0) {
      this.r.a($$0);
      this.C();
   }

   protected void C() {
      this.y.j = false;
      this.x.j = false;
      this.z.j = false;
      foe.a $$0 = this.r.h();
      if ($$0 != null && !($$0 instanceof foe.b)) {
         this.y.j = true;
         if ($$0 instanceof foe.d) {
            this.x.j = true;
            this.z.j = true;
         }
      }
   }

   public fwm D() {
      return this.u;
   }

   public fwl E() {
      return this.w;
   }
}
