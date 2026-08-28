import com.mojang.logging.LogUtils;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fqa extends fnc {
   public static final int a = 308;
   public static final int b = 100;
   public static final int c = 74;
   public static final int d = 64;
   private static final Logger s = LogUtils.getLogger();
   private final fyk u = new fyk();
   private final fnc v;
   protected fqd r;
   private fyj w;
   private fhd x;
   private fhd y;
   private fhd z;
   private fyi A;
   private gtf.b B;
   @Nullable
   private gtf.a C;
   private boolean D;

   public fqa(fnc $$0) {
      super(xo.c("multiplayer.title"));
      this.v = $$0;
   }

   @Override
   protected void aM_() {
      if (this.D) {
         this.r.a(this.n, this.o - 64 - 32, 0, 32);
      } else {
         this.D = true;
         this.w = new fyj(this.m);
         this.w.a();
         this.B = new gtf.b();

         try {
            this.C = new gtf.a(this.B);
            this.C.start();
         } catch (Exception var8) {
            s.warn("Unable to start LAN server detection: {}", var8.getMessage());
         }

         this.r = new fqd(this, this.m, this.n, this.o - 64 - 32, 32, 36);
         this.r.a(this.w);
      }

      this.c(this.r);
      this.y = this.c(fhd.a(xo.c("selectServer.select"), $$0 -> this.m()).a(100).a());
      fhd $$1 = this.c(fhd.a(xo.c("selectServer.direct"), $$0 -> {
         this.A = new fyi(gqe.a("selectServer.defaultName"), "", fyi.c.c);
         this.m.a(new fmc(this, this::g, this.A));
      }).a(100).a());
      fhd $$2 = this.c(fhd.a(xo.c("selectServer.add"), $$0 -> {
         this.A = new fyi(gqe.a("selectServer.defaultName"), "", fyi.c.c);
         this.m.a(new fme(this, this::f, this.A));
      }).a(100).a());
      this.x = this.c(fhd.a(xo.c("selectServer.edit"), $$0 -> {
         fqd.a $$1x = this.r.h();
         if ($$1x instanceof fqd.d) {
            fyi $$2x = ((fqd.d)$$1x).c();
            this.A = new fyi($$2x.a, $$2x.b, fyi.c.c);
            this.A.b($$2x);
            this.m.a(new fme(this, this::e, this.A));
         }
      }).a(74).a());
      this.z = this.c(fhd.a(xo.c("selectServer.delete"), $$0 -> {
         fqd.a $$1x = this.r.h();
         if ($$1x instanceof fqd.d) {
            String $$2x = ((fqd.d)$$1x).c().a;
            if ($$2x != null) {
               xo $$3x = xo.c("selectServer.deleteQuestion");
               xo $$4x = xo.a("selectServer.deleteWarning", $$2x);
               xo $$5x = xo.c("selectServer.deleteButton");
               xo $$6x = xn.e;
               this.m.a(new flu(this::c, $$3x, $$4x, $$5x, $$6x));
            }
         }
      }).a(74).a());
      fhd $$3 = this.c(fhd.a(xo.c("selectServer.refresh"), $$0 -> this.J()).a(74).a());
      fhd $$4 = this.c(fhd.a(xn.k, $$0 -> this.d()).a(74).a());
      fku $$5 = fku.d();
      fkn $$6 = $$5.a(new fkn(308, 20, fkn.b.a));
      $$6.a(this.y);
      $$6.a($$1);
      $$6.a($$2);
      $$5.a(fkv.b(4));
      fkn $$7 = $$5.a(new fkn(308, 20, fkn.b.a));
      $$7.a(this.x);
      $$7.a(this.z);
      $$7.a($$3);
      $$7.a($$4);
      $$5.a();
      fko.a($$5, 0, this.o - 64, this.n, 64);
      this.E();
   }

   @Override
   public void d() {
      this.m.a(this.v);
   }

   @Override
   public void e() {
      super.e();
      List<gte> $$0 = this.B.a();
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
      this.m.a(new fqa(this.v));
   }

   private void c(boolean $$0) {
      fqd.a $$1 = this.r.h();
      if ($$0 && $$1 instanceof fqd.d) {
         this.w.a(((fqd.d)$$1).c());
         this.w.b();
         this.r.a(null);
         this.r.a(this.w);
      }

      this.m.a(this);
   }

   private void e(boolean $$0) {
      fqd.a $$1 = this.r.h();
      if ($$0 && $$1 instanceof fqd.d) {
         fyi $$2 = ((fqd.d)$$1).c();
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
         fyi $$1 = this.w.b(this.A.b);
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
         fyi $$1 = this.w.a(this.A.b);
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
         if (fle.a($$0)) {
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
   public void a(fgq $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.p, this.l, this.n / 2, 20, 16777215);
   }

   public void m() {
      fqd.a $$0 = this.r.h();
      if ($$0 instanceof fqd.d) {
         this.a(((fqd.d)$$0).c());
      } else if ($$0 instanceof fqd.c) {
         gte $$1 = ((fqd.c)$$0).b();
         this.a(new fyi($$1.a(), $$1.b(), fyi.c.a));
      }
   }

   private void a(fyi $$0) {
      flv.a(this, this.m, fzl.a($$0.b), $$0, false, null);
   }

   public void a(fqd.a $$0) {
      this.r.a($$0);
      this.E();
   }

   protected void E() {
      this.y.j = false;
      this.x.j = false;
      this.z.j = false;
      fqd.a $$0 = this.r.h();
      if ($$0 != null && !($$0 instanceof fqd.b)) {
         this.y.j = true;
         if ($$0 instanceof fqd.d) {
            this.x.j = true;
            this.z.j = true;
         }
      }
   }

   public fyk F() {
      return this.u;
   }

   public fyj I() {
      return this.w;
   }
}
