import com.mojang.logging.LogUtils;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fpy extends fnj {
   public static final int a = 308;
   public static final int b = 100;
   public static final int c = 74;
   public static final int q = 64;
   private static final Logger s = LogUtils.getLogger();
   private final fyz u = new fyz();
   private final fnj v;
   protected fqb r;
   private fyy w;
   private fhs x;
   private fhs y;
   private fhs z;
   private fyx A;
   private gts.b B;
   @Nullable
   private gts.a C;
   private boolean D;

   public fpy(fnj $$0) {
      super(wu.c("multiplayer.title"));
      this.v = $$0;
   }

   @Override
   protected void aP_() {
      if (this.D) {
         this.r.a(this.m, this.n - 64 - 32, 0, 32);
      } else {
         this.D = true;
         this.w = new fyy(this.l);
         this.w.a();
         this.B = new gts.b();

         try {
            this.C = new gts.a(this.B);
            this.C.start();
         } catch (Exception var8) {
            s.warn("Unable to start LAN server detection: {}", var8.getMessage());
         }

         this.r = new fqb(this, this.l, this.m, this.n - 64 - 32, 32, 36);
         this.r.a(this.w);
      }

      this.c(this.r);
      this.y = this.c(fhs.a(wu.c("selectServer.select"), $$0 -> this.m()).a(100).a());
      fhs $$1 = this.c(fhs.a(wu.c("selectServer.direct"), $$0 -> {
         this.A = new fyx(gqu.a("selectServer.defaultName"), "", fyx.c.c);
         this.l.a(new fmp(this, this::g, this.A));
      }).a(100).a());
      fhs $$2 = this.c(fhs.a(wu.c("selectServer.add"), $$0 -> {
         this.A = new fyx(gqu.a("selectServer.defaultName"), "", fyx.c.c);
         this.l.a(new fmr(this, this::f, this.A));
      }).a(100).a());
      this.x = this.c(fhs.a(wu.c("selectServer.edit"), $$0 -> {
         fqb.a $$1x = this.r.h();
         if ($$1x instanceof fqb.d) {
            fyx $$2x = ((fqb.d)$$1x).c();
            this.A = new fyx($$2x.a, $$2x.b, fyx.c.c);
            this.A.b($$2x);
            this.l.a(new fmr(this, this::e, this.A));
         }
      }).a(74).a());
      this.z = this.c(fhs.a(wu.c("selectServer.delete"), $$0 -> {
         fqb.a $$1x = this.r.h();
         if ($$1x instanceof fqb.d) {
            String $$2x = ((fqb.d)$$1x).c().a;
            if ($$2x != null) {
               wu $$3x = wu.c("selectServer.deleteQuestion");
               wu $$4x = wu.a("selectServer.deleteWarning", $$2x);
               wu $$5x = wu.c("selectServer.deleteButton");
               wu $$6x = wt.e;
               this.l.a(new fmh(this::c, $$3x, $$4x, $$5x, $$6x));
            }
         }
      }).a(74).a());
      fhs $$3 = this.c(fhs.a(wu.c("selectServer.refresh"), $$0 -> this.J()).a(74).a());
      fhs $$4 = this.c(fhs.a(wt.k, $$0 -> this.d()).a(74).a());
      flj $$5 = flj.d();
      flc $$6 = $$5.a(new flc(308, 20, flc.b.a));
      $$6.a(this.y);
      $$6.a($$1);
      $$6.a($$2);
      $$5.a(flk.b(4));
      flc $$7 = $$5.a(new flc(308, 20, flc.b.a));
      $$7.a(this.x);
      $$7.a(this.z);
      $$7.a($$3);
      $$7.a($$4);
      $$5.a();
      fld.a($$5, 0, this.n - 64, this.m, 64);
      this.E();
   }

   @Override
   public void d() {
      this.l.a(this.v);
   }

   @Override
   public void e() {
      super.e();
      List<gtr> $$0 = this.B.a();
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
      this.r.c();
   }

   private void J() {
      this.l.a(new fpy(this.v));
   }

   private void c(boolean $$0) {
      fqb.a $$1 = this.r.h();
      if ($$0 && $$1 instanceof fqb.d) {
         this.w.a(((fqb.d)$$1).c());
         this.w.b();
         this.r.a(null);
         this.r.a(this.w);
      }

      this.l.a(this);
   }

   private void e(boolean $$0) {
      fqb.a $$1 = this.r.h();
      if ($$0 && $$1 instanceof fqb.d) {
         fyx $$2 = ((fqb.d)$$1).c();
         $$2.a = this.A.a;
         $$2.b = this.A.b;
         $$2.b(this.A);
         this.w.b();
         this.r.a(this.w);
      }

      this.l.a(this);
   }

   private void f(boolean $$0) {
      if ($$0) {
         fyx $$1 = this.w.b(this.A.b);
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

      this.l.a(this);
   }

   private void g(boolean $$0) {
      if ($$0) {
         fyx $$1 = this.w.a(this.A.b);
         if ($$1 == null) {
            this.w.a(this.A, true);
            this.w.b();
            this.a(this.A);
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
         this.J();
         return true;
      } else if (this.r.h() != null) {
         if (flt.a($$0)) {
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
   public void a(fhf $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.o, this.k, this.m / 2, 20, 16777215);
   }

   public void m() {
      fqb.a $$0 = this.r.h();
      if ($$0 instanceof fqb.d) {
         this.a(((fqb.d)$$0).c());
      } else if ($$0 instanceof fqb.c) {
         gtr $$1 = ((fqb.c)$$0).b();
         this.a(new fyx($$1.a(), $$1.b(), fyx.c.a));
      }
   }

   private void a(fyx $$0) {
      fmi.a(this, this.l, gab.a($$0.b), $$0, false, null);
   }

   public void a(fqb.a $$0) {
      this.r.a($$0);
      this.E();
   }

   protected void E() {
      this.y.j = false;
      this.x.j = false;
      this.z.j = false;
      fqb.a $$0 = this.r.h();
      if ($$0 != null && !($$0 instanceof fqb.b)) {
         this.y.j = true;
         if ($$0 instanceof fqb.d) {
            this.x.j = true;
            this.z.j = true;
         }
      }
   }

   public fyz F() {
      return this.u;
   }

   public fyy G() {
      return this.w;
   }
}
