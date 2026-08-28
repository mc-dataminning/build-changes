import com.mojang.logging.LogUtils;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fps extends fnd {
   public static final int a = 308;
   public static final int b = 100;
   public static final int c = 74;
   public static final int q = 64;
   private static final Logger s = LogUtils.getLogger();
   private final fyt u = new fyt();
   private final fnd v;
   protected fpv r;
   private fys w;
   private fhm x;
   private fhm y;
   private fhm z;
   private fyr A;
   private gtm.b B;
   @Nullable
   private gtm.a C;
   private boolean D;

   public fps(fnd $$0) {
      super(wu.c("multiplayer.title"));
      this.v = $$0;
   }

   @Override
   protected void aO_() {
      if (this.D) {
         this.r.a(this.m, this.n - 64 - 32, 0, 32);
      } else {
         this.D = true;
         this.w = new fys(this.l);
         this.w.a();
         this.B = new gtm.b();

         try {
            this.C = new gtm.a(this.B);
            this.C.start();
         } catch (Exception var8) {
            s.warn("Unable to start LAN server detection: {}", var8.getMessage());
         }

         this.r = new fpv(this, this.l, this.m, this.n - 64 - 32, 32, 36);
         this.r.a(this.w);
      }

      this.c(this.r);
      this.y = this.c(fhm.a(wu.c("selectServer.select"), $$0 -> this.m()).a(100).a());
      fhm $$1 = this.c(fhm.a(wu.c("selectServer.direct"), $$0 -> {
         this.A = new fyr(gqo.a("selectServer.defaultName"), "", fyr.c.c);
         this.l.a(new fmj(this, this::g, this.A));
      }).a(100).a());
      fhm $$2 = this.c(fhm.a(wu.c("selectServer.add"), $$0 -> {
         this.A = new fyr(gqo.a("selectServer.defaultName"), "", fyr.c.c);
         this.l.a(new fml(this, this::f, this.A));
      }).a(100).a());
      this.x = this.c(fhm.a(wu.c("selectServer.edit"), $$0 -> {
         fpv.a $$1x = this.r.h();
         if ($$1x instanceof fpv.d) {
            fyr $$2x = ((fpv.d)$$1x).c();
            this.A = new fyr($$2x.a, $$2x.b, fyr.c.c);
            this.A.b($$2x);
            this.l.a(new fml(this, this::e, this.A));
         }
      }).a(74).a());
      this.z = this.c(fhm.a(wu.c("selectServer.delete"), $$0 -> {
         fpv.a $$1x = this.r.h();
         if ($$1x instanceof fpv.d) {
            String $$2x = ((fpv.d)$$1x).c().a;
            if ($$2x != null) {
               wu $$3x = wu.c("selectServer.deleteQuestion");
               wu $$4x = wu.a("selectServer.deleteWarning", $$2x);
               wu $$5x = wu.c("selectServer.deleteButton");
               wu $$6x = wt.e;
               this.l.a(new fmb(this::c, $$3x, $$4x, $$5x, $$6x));
            }
         }
      }).a(74).a());
      fhm $$3 = this.c(fhm.a(wu.c("selectServer.refresh"), $$0 -> this.J()).a(74).a());
      fhm $$4 = this.c(fhm.a(wt.k, $$0 -> this.d()).a(74).a());
      fld $$5 = fld.d();
      fkw $$6 = $$5.a(new fkw(308, 20, fkw.b.a));
      $$6.a(this.y);
      $$6.a($$1);
      $$6.a($$2);
      $$5.a(fle.b(4));
      fkw $$7 = $$5.a(new fkw(308, 20, fkw.b.a));
      $$7.a(this.x);
      $$7.a(this.z);
      $$7.a($$3);
      $$7.a($$4);
      $$5.a();
      fkx.a($$5, 0, this.n - 64, this.m, 64);
      this.E();
   }

   @Override
   public void d() {
      this.l.a(this.v);
   }

   @Override
   public void e() {
      super.e();
      List<gtl> $$0 = this.B.a();
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
      this.l.a(new fps(this.v));
   }

   private void c(boolean $$0) {
      fpv.a $$1 = this.r.h();
      if ($$0 && $$1 instanceof fpv.d) {
         this.w.a(((fpv.d)$$1).c());
         this.w.b();
         this.r.a(null);
         this.r.a(this.w);
      }

      this.l.a(this);
   }

   private void e(boolean $$0) {
      fpv.a $$1 = this.r.h();
      if ($$0 && $$1 instanceof fpv.d) {
         fyr $$2 = ((fpv.d)$$1).c();
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
         fyr $$1 = this.w.b(this.A.b);
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
         fyr $$1 = this.w.a(this.A.b);
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
         if (fln.a($$0)) {
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
   public void a(fgz $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.o, this.k, this.m / 2, 20, 16777215);
   }

   public void m() {
      fpv.a $$0 = this.r.h();
      if ($$0 instanceof fpv.d) {
         this.a(((fpv.d)$$0).c());
      } else if ($$0 instanceof fpv.c) {
         gtl $$1 = ((fpv.c)$$0).b();
         this.a(new fyr($$1.a(), $$1.b(), fyr.c.a));
      }
   }

   private void a(fyr $$0) {
      fmc.a(this, this.l, fzv.a($$0.b), $$0, false, null);
   }

   public void a(fpv.a $$0) {
      this.r.a($$0);
      this.E();
   }

   protected void E() {
      this.y.j = false;
      this.x.j = false;
      this.z.j = false;
      fpv.a $$0 = this.r.h();
      if ($$0 != null && !($$0 instanceof fpv.b)) {
         this.y.j = true;
         if ($$0 instanceof fpv.d) {
            this.x.j = true;
            this.z.j = true;
         }
      }
   }

   public fyt F() {
      return this.u;
   }

   public fys G() {
      return this.w;
   }
}
