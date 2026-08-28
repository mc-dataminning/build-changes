import com.mojang.logging.LogUtils;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fqb extends fnd {
   public static final int a = 308;
   public static final int b = 100;
   public static final int c = 74;
   public static final int d = 64;
   private static final Logger s = LogUtils.getLogger();
   private final fyl u = new fyl();
   private final fnd v;
   protected fqe r;
   private fyk w;
   private fhe x;
   private fhe y;
   private fhe z;
   private fyj A;
   private gtg.b B;
   @Nullable
   private gtg.a C;
   private boolean D;

   public fqb(fnd $$0) {
      super(xp.c("multiplayer.title"));
      this.v = $$0;
   }

   @Override
   protected void aM_() {
      if (this.D) {
         this.r.a(this.n, this.o - 64 - 32, 0, 32);
      } else {
         this.D = true;
         this.w = new fyk(this.m);
         this.w.a();
         this.B = new gtg.b();

         try {
            this.C = new gtg.a(this.B);
            this.C.start();
         } catch (Exception var8) {
            s.warn("Unable to start LAN server detection: {}", var8.getMessage());
         }

         this.r = new fqe(this, this.m, this.n, this.o - 64 - 32, 32, 36);
         this.r.a(this.w);
      }

      this.c(this.r);
      this.y = this.c(fhe.a(xp.c("selectServer.select"), $$0 -> this.m()).a(100).a());
      fhe $$1 = this.c(fhe.a(xp.c("selectServer.direct"), $$0 -> {
         this.A = new fyj(gqf.a("selectServer.defaultName"), "", fyj.c.c);
         this.m.a(new fmd(this, this::g, this.A));
      }).a(100).a());
      fhe $$2 = this.c(fhe.a(xp.c("selectServer.add"), $$0 -> {
         this.A = new fyj(gqf.a("selectServer.defaultName"), "", fyj.c.c);
         this.m.a(new fmf(this, this::f, this.A));
      }).a(100).a());
      this.x = this.c(fhe.a(xp.c("selectServer.edit"), $$0 -> {
         fqe.a $$1x = this.r.h();
         if ($$1x instanceof fqe.d) {
            fyj $$2x = ((fqe.d)$$1x).c();
            this.A = new fyj($$2x.a, $$2x.b, fyj.c.c);
            this.A.b($$2x);
            this.m.a(new fmf(this, this::e, this.A));
         }
      }).a(74).a());
      this.z = this.c(fhe.a(xp.c("selectServer.delete"), $$0 -> {
         fqe.a $$1x = this.r.h();
         if ($$1x instanceof fqe.d) {
            String $$2x = ((fqe.d)$$1x).c().a;
            if ($$2x != null) {
               xp $$3x = xp.c("selectServer.deleteQuestion");
               xp $$4x = xp.a("selectServer.deleteWarning", $$2x);
               xp $$5x = xp.c("selectServer.deleteButton");
               xp $$6x = xo.e;
               this.m.a(new flv(this::c, $$3x, $$4x, $$5x, $$6x));
            }
         }
      }).a(74).a());
      fhe $$3 = this.c(fhe.a(xp.c("selectServer.refresh"), $$0 -> this.J()).a(74).a());
      fhe $$4 = this.c(fhe.a(xo.k, $$0 -> this.d()).a(74).a());
      fkv $$5 = fkv.d();
      fko $$6 = $$5.a(new fko(308, 20, fko.b.a));
      $$6.a(this.y);
      $$6.a($$1);
      $$6.a($$2);
      $$5.a(fkw.b(4));
      fko $$7 = $$5.a(new fko(308, 20, fko.b.a));
      $$7.a(this.x);
      $$7.a(this.z);
      $$7.a($$3);
      $$7.a($$4);
      $$5.a();
      fkp.a($$5, 0, this.o - 64, this.n, 64);
      this.E();
   }

   @Override
   public void d() {
      this.m.a(this.v);
   }

   @Override
   public void e() {
      super.e();
      List<gtf> $$0 = this.B.a();
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
      this.m.a(new fqb(this.v));
   }

   private void c(boolean $$0) {
      fqe.a $$1 = this.r.h();
      if ($$0 && $$1 instanceof fqe.d) {
         this.w.a(((fqe.d)$$1).c());
         this.w.b();
         this.r.a(null);
         this.r.a(this.w);
      }

      this.m.a(this);
   }

   private void e(boolean $$0) {
      fqe.a $$1 = this.r.h();
      if ($$0 && $$1 instanceof fqe.d) {
         fyj $$2 = ((fqe.d)$$1).c();
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
         fyj $$1 = this.w.b(this.A.b);
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
         fyj $$1 = this.w.a(this.A.b);
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
         this.J();
         return true;
      } else if (this.r.h() != null) {
         if (flf.a($$0)) {
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
   public void a(fgr $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.p, this.l, this.n / 2, 20, 16777215);
   }

   public void m() {
      fqe.a $$0 = this.r.h();
      if ($$0 instanceof fqe.d) {
         this.a(((fqe.d)$$0).c());
      } else if ($$0 instanceof fqe.c) {
         gtf $$1 = ((fqe.c)$$0).b();
         this.a(new fyj($$1.a(), $$1.b(), fyj.c.a));
      }
   }

   private void a(fyj $$0) {
      flw.a(this, this.m, fzm.a($$0.b), $$0, false, null);
   }

   public void a(fqe.a $$0) {
      this.r.a($$0);
      this.E();
   }

   protected void E() {
      this.y.j = false;
      this.x.j = false;
      this.z.j = false;
      fqe.a $$0 = this.r.h();
      if ($$0 != null && !($$0 instanceof fqe.b)) {
         this.y.j = true;
         if ($$0 instanceof fqe.d) {
            this.x.j = true;
            this.z.j = true;
         }
      }
   }

   public fyl F() {
      return this.u;
   }

   public fyk I() {
      return this.w;
   }
}
