import com.mojang.logging.LogUtils;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fqa extends fnl {
   public static final int a = 308;
   public static final int b = 100;
   public static final int c = 74;
   public static final int q = 64;
   private static final Logger s = LogUtils.getLogger();
   private final fzb u = new fzb();
   private final fnl v;
   protected fqd r;
   private fza w;
   private fhu x;
   private fhu y;
   private fhu z;
   private fyz A;
   private gtu.b B;
   @Nullable
   private gtu.a C;
   private boolean D;

   public fqa(fnl $$0) {
      super(wu.c("multiplayer.title"));
      this.v = $$0;
   }

   @Override
   protected void aP_() {
      if (this.D) {
         this.r.a(this.m, this.n - 64 - 32, 0, 32);
      } else {
         this.D = true;
         this.w = new fza(this.l);
         this.w.a();
         this.B = new gtu.b();

         try {
            this.C = new gtu.a(this.B);
            this.C.start();
         } catch (Exception var8) {
            s.warn("Unable to start LAN server detection: {}", var8.getMessage());
         }

         this.r = new fqd(this, this.l, this.m, this.n - 64 - 32, 32, 36);
         this.r.a(this.w);
      }

      this.c(this.r);
      this.y = this.c(fhu.a(wu.c("selectServer.select"), $$0 -> this.m()).a(100).a());
      fhu $$1 = this.c(fhu.a(wu.c("selectServer.direct"), $$0 -> {
         this.A = new fyz(gqw.a("selectServer.defaultName"), "", fyz.c.c);
         this.l.a(new fmr(this, this::g, this.A));
      }).a(100).a());
      fhu $$2 = this.c(fhu.a(wu.c("selectServer.add"), $$0 -> {
         this.A = new fyz(gqw.a("selectServer.defaultName"), "", fyz.c.c);
         this.l.a(new fmt(this, this::f, this.A));
      }).a(100).a());
      this.x = this.c(fhu.a(wu.c("selectServer.edit"), $$0 -> {
         fqd.a $$1x = this.r.h();
         if ($$1x instanceof fqd.d) {
            fyz $$2x = ((fqd.d)$$1x).c();
            this.A = new fyz($$2x.a, $$2x.b, fyz.c.c);
            this.A.b($$2x);
            this.l.a(new fmt(this, this::e, this.A));
         }
      }).a(74).a());
      this.z = this.c(fhu.a(wu.c("selectServer.delete"), $$0 -> {
         fqd.a $$1x = this.r.h();
         if ($$1x instanceof fqd.d) {
            String $$2x = ((fqd.d)$$1x).c().a;
            if ($$2x != null) {
               wu $$3x = wu.c("selectServer.deleteQuestion");
               wu $$4x = wu.a("selectServer.deleteWarning", $$2x);
               wu $$5x = wu.c("selectServer.deleteButton");
               wu $$6x = wt.e;
               this.l.a(new fmj(this::c, $$3x, $$4x, $$5x, $$6x));
            }
         }
      }).a(74).a());
      fhu $$3 = this.c(fhu.a(wu.c("selectServer.refresh"), $$0 -> this.G()).a(74).a());
      fhu $$4 = this.c(fhu.a(wt.k, $$0 -> this.d()).a(74).a());
      fll $$5 = fll.d();
      fle $$6 = $$5.a(new fle(308, 20, fle.b.a));
      $$6.a(this.y);
      $$6.a($$1);
      $$6.a($$2);
      $$5.a(flm.b(4));
      fle $$7 = $$5.a(new fle(308, 20, fle.b.a));
      $$7.a(this.x);
      $$7.a(this.z);
      $$7.a($$3);
      $$7.a($$4);
      $$5.a();
      flf.a($$5, 0, this.n - 64, this.m, 64);
      this.D();
   }

   @Override
   public void d() {
      this.l.a(this.v);
   }

   @Override
   public void e() {
      super.e();
      List<gtt> $$0 = this.B.a();
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

   private void G() {
      this.l.a(new fqa(this.v));
   }

   private void c(boolean $$0) {
      fqd.a $$1 = this.r.h();
      if ($$0 && $$1 instanceof fqd.d) {
         this.w.a(((fqd.d)$$1).c());
         this.w.b();
         this.r.a(null);
         this.r.a(this.w);
      }

      this.l.a(this);
   }

   private void e(boolean $$0) {
      fqd.a $$1 = this.r.h();
      if ($$0 && $$1 instanceof fqd.d) {
         fyz $$2 = ((fqd.d)$$1).c();
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
         fyz $$1 = this.w.b(this.A.b);
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
         fyz $$1 = this.w.a(this.A.b);
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
         this.G();
         return true;
      } else if (this.r.h() != null) {
         if (flv.a($$0)) {
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
   public void a(fhh $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.o, this.k, this.m / 2, 20, 16777215);
   }

   public void m() {
      fqd.a $$0 = this.r.h();
      if ($$0 instanceof fqd.d) {
         this.a(((fqd.d)$$0).c());
      } else if ($$0 instanceof fqd.c) {
         gtt $$1 = ((fqd.c)$$0).b();
         this.a(new fyz($$1.a(), $$1.b(), fyz.c.a));
      }
   }

   private void a(fyz $$0) {
      fmk.a(this, this.l, gad.a($$0.b), $$0, false, null);
   }

   public void a(fqd.a $$0) {
      this.r.a($$0);
      this.D();
   }

   protected void D() {
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

   public fzb E() {
      return this.u;
   }

   public fza F() {
      return this.w;
   }
}
