import com.mojang.logging.LogUtils;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fpz extends fnb {
   public static final int a = 308;
   public static final int b = 100;
   public static final int c = 74;
   public static final int d = 64;
   private static final Logger s = LogUtils.getLogger();
   private final fyj u = new fyj();
   private final fnb v;
   protected fqc r;
   private fyi w;
   private fhc x;
   private fhc y;
   private fhc z;
   private fyh A;
   private gte.b B;
   @Nullable
   private gte.a C;
   private boolean D;

   public fpz(fnb $$0) {
      super(xo.c("multiplayer.title"));
      this.v = $$0;
   }

   @Override
   protected void aM_() {
      if (this.D) {
         this.r.a(this.n, this.o - 64 - 32, 0, 32);
      } else {
         this.D = true;
         this.w = new fyi(this.m);
         this.w.a();
         this.B = new gte.b();

         try {
            this.C = new gte.a(this.B);
            this.C.start();
         } catch (Exception var8) {
            s.warn("Unable to start LAN server detection: {}", var8.getMessage());
         }

         this.r = new fqc(this, this.m, this.n, this.o - 64 - 32, 32, 36);
         this.r.a(this.w);
      }

      this.c(this.r);
      this.y = this.c(fhc.a(xo.c("selectServer.select"), $$0 -> this.m()).a(100).a());
      fhc $$1 = this.c(fhc.a(xo.c("selectServer.direct"), $$0 -> {
         this.A = new fyh(gqd.a("selectServer.defaultName"), "", fyh.c.c);
         this.m.a(new fmb(this, this::g, this.A));
      }).a(100).a());
      fhc $$2 = this.c(fhc.a(xo.c("selectServer.add"), $$0 -> {
         this.A = new fyh(gqd.a("selectServer.defaultName"), "", fyh.c.c);
         this.m.a(new fmd(this, this::f, this.A));
      }).a(100).a());
      this.x = this.c(fhc.a(xo.c("selectServer.edit"), $$0 -> {
         fqc.a $$1x = this.r.h();
         if ($$1x instanceof fqc.d) {
            fyh $$2x = ((fqc.d)$$1x).c();
            this.A = new fyh($$2x.a, $$2x.b, fyh.c.c);
            this.A.b($$2x);
            this.m.a(new fmd(this, this::e, this.A));
         }
      }).a(74).a());
      this.z = this.c(fhc.a(xo.c("selectServer.delete"), $$0 -> {
         fqc.a $$1x = this.r.h();
         if ($$1x instanceof fqc.d) {
            String $$2x = ((fqc.d)$$1x).c().a;
            if ($$2x != null) {
               xo $$3x = xo.c("selectServer.deleteQuestion");
               xo $$4x = xo.a("selectServer.deleteWarning", $$2x);
               xo $$5x = xo.c("selectServer.deleteButton");
               xo $$6x = xn.e;
               this.m.a(new flt(this::c, $$3x, $$4x, $$5x, $$6x));
            }
         }
      }).a(74).a());
      fhc $$3 = this.c(fhc.a(xo.c("selectServer.refresh"), $$0 -> this.I()).a(74).a());
      fhc $$4 = this.c(fhc.a(xn.k, $$0 -> this.d()).a(74).a());
      fkt $$5 = fkt.d();
      fkm $$6 = $$5.a(new fkm(308, 20, fkm.b.a));
      $$6.a(this.y);
      $$6.a($$1);
      $$6.a($$2);
      $$5.a(fku.b(4));
      fkm $$7 = $$5.a(new fkm(308, 20, fkm.b.a));
      $$7.a(this.x);
      $$7.a(this.z);
      $$7.a($$3);
      $$7.a($$4);
      $$5.a();
      fkn.a($$5, 0, this.o - 64, this.n, 64);
      this.D();
   }

   @Override
   public void d() {
      this.m.a(this.v);
   }

   @Override
   public void e() {
      super.e();
      List<gtd> $$0 = this.B.a();
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

   private void I() {
      this.m.a(new fpz(this.v));
   }

   private void c(boolean $$0) {
      fqc.a $$1 = this.r.h();
      if ($$0 && $$1 instanceof fqc.d) {
         this.w.a(((fqc.d)$$1).c());
         this.w.b();
         this.r.a(null);
         this.r.a(this.w);
      }

      this.m.a(this);
   }

   private void e(boolean $$0) {
      fqc.a $$1 = this.r.h();
      if ($$0 && $$1 instanceof fqc.d) {
         fyh $$2 = ((fqc.d)$$1).c();
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
         fyh $$1 = this.w.b(this.A.b);
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
         fyh $$1 = this.w.a(this.A.b);
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
         this.I();
         return true;
      } else if (this.r.h() != null) {
         if (fld.a($$0)) {
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
   public void a(fgp $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.p, this.l, this.n / 2, 20, 16777215);
   }

   public void m() {
      fqc.a $$0 = this.r.h();
      if ($$0 instanceof fqc.d) {
         this.a(((fqc.d)$$0).c());
      } else if ($$0 instanceof fqc.c) {
         gtd $$1 = ((fqc.c)$$0).b();
         this.a(new fyh($$1.a(), $$1.b(), fyh.c.a));
      }
   }

   private void a(fyh $$0) {
      flu.a(this, this.m, fzk.a($$0.b), $$0, false, null);
   }

   public void a(fqc.a $$0) {
      this.r.a($$0);
      this.D();
   }

   protected void D() {
      this.y.j = false;
      this.x.j = false;
      this.z.j = false;
      fqc.a $$0 = this.r.h();
      if ($$0 != null && !($$0 instanceof fqc.b)) {
         this.y.j = true;
         if ($$0 instanceof fqc.d) {
            this.x.j = true;
            this.z.j = true;
         }
      }
   }

   public fyj E() {
      return this.u;
   }

   public fyi F() {
      return this.w;
   }
}
