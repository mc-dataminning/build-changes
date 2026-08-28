import com.mojang.logging.LogUtils;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fsw extends fqh {
   public static final int a = 308;
   public static final int b = 100;
   public static final int c = 74;
   public static final int d = 64;
   private static final Logger u = LogUtils.getLogger();
   private final gcc v = new gcc();
   private final fqh w;
   protected fta s;
   private gcb x;
   private fko y;
   private fko z;
   private fko A;
   private gca B;
   private hbq.b C;
   @Nullable
   private hbq.a D;
   private boolean E;

   public fsw(fqh $$0) {
      super(xe.c("multiplayer.title"));
      this.w = $$0;
   }

   @Override
   protected void aS_() {
      if (this.E) {
         this.s.a(this.n, this.o - 64 - 32, 0, 32);
      } else {
         this.E = true;
         this.x = new gcb(this.m);
         this.x.a();
         this.C = new hbq.b();

         try {
            this.D = new hbq.a(this.C);
            this.D.start();
         } catch (Exception var8) {
            u.warn("Unable to start LAN server detection: {}", var8.getMessage());
         }

         this.s = new fta(this, this.m, this.n, this.o - 64 - 32, 32, 36);
         this.s.a(this.x);
      }

      this.c(this.s);
      this.z = this.c(fko.a(xe.c("selectServer.select"), $$0 -> this.m()).a(100).a());
      fko $$1 = this.c(fko.a(xe.c("selectServer.direct"), $$0 -> {
         this.B = new gca(gyn.a("selectServer.defaultName"), "", gca.c.c);
         this.m.a(new fpn(this, this::h, this.B));
      }).a(100).a());
      fko $$2 = this.c(fko.a(xe.c("selectServer.add"), $$0 -> {
         this.B = new gca(gyn.a("selectServer.defaultName"), "", gca.c.c);
         this.m.a(new fpp(this, this::g, this.B));
      }).a(100).a());
      this.y = this.c(fko.a(xe.c("selectServer.edit"), $$0 -> {
         fta.a $$1x = this.s.h();
         if ($$1x instanceof fta.d) {
            gca $$2x = ((fta.d)$$1x).c();
            this.B = new gca($$2x.a, $$2x.b, gca.c.c);
            this.B.b($$2x);
            this.m.a(new fpp(this, this::f, this.B));
         }
      }).a(74).a());
      this.A = this.c(fko.a(xe.c("selectServer.delete"), $$0 -> {
         fta.a $$1x = this.s.h();
         if ($$1x instanceof fta.d) {
            String $$2x = ((fta.d)$$1x).c().a;
            if ($$2x != null) {
               xe $$3x = xe.c("selectServer.deleteQuestion");
               xe $$4x = xe.a("selectServer.deleteWarning", $$2x);
               xe $$5x = xe.c("selectServer.deleteButton");
               xe $$6x = xd.e;
               this.m.a(new fpf(this::c, $$3x, $$4x, $$5x, $$6x));
            }
         }
      }).a(74).a());
      fko $$3 = this.c(fko.a(xe.c("selectServer.refresh"), $$0 -> this.G()).a(74).a());
      fko $$4 = this.c(fko.a(xd.k, $$0 -> this.d()).a(74).a());
      fog $$5 = fog.d();
      fnz $$6 = $$5.a(new fnz(308, 20, fnz.b.a));
      $$6.a(this.z);
      $$6.a($$1);
      $$6.a($$2);
      $$5.a(foh.b(4));
      fnz $$7 = $$5.a(new fnz(308, 20, fnz.b.a));
      $$7.a(this.y);
      $$7.a(this.A);
      $$7.a($$3);
      $$7.a($$4);
      $$5.a();
      foa.a($$5, 0, this.o - 64, this.n, 64);
      this.D();
   }

   @Override
   public void d() {
      this.m.a(this.w);
   }

   @Override
   public void e() {
      super.e();
      List<hbp> $$0 = this.C.a();
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
      this.m.a(new fsw(this.w));
   }

   private void c(boolean $$0) {
      fta.a $$1 = this.s.h();
      if ($$0 && $$1 instanceof fta.d) {
         this.x.a(((fta.d)$$1).c());
         this.x.b();
         this.s.a(null);
         this.s.a(this.x);
      }

      this.m.a(this);
   }

   private void f(boolean $$0) {
      fta.a $$1 = this.s.h();
      if ($$0 && $$1 instanceof fta.d) {
         gca $$2 = ((fta.d)$$1).c();
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
         gca $$1 = this.x.b(this.B.b);
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
         gca $$1 = this.x.a(this.B.b);
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
         if (foq.a($$0)) {
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
   public void a(fkb $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.p, this.l, this.n / 2, 20, 16777215);
   }

   public void m() {
      fta.a $$0 = this.s.h();
      if ($$0 instanceof fta.d) {
         this.a(((fta.d)$$0).c());
      } else if ($$0 instanceof fta.c) {
         hbp $$1 = ((fta.c)$$0).b();
         this.a(new gca($$1.a(), $$1.b(), gca.c.a));
      }
   }

   private void a(gca $$0) {
      fpg.a(this, this.m, gdd.a($$0.b), $$0, false, null);
   }

   public void a(fta.a $$0) {
      this.s.a($$0);
      this.D();
   }

   protected void D() {
      this.z.j = false;
      this.y.j = false;
      this.A.j = false;
      fta.a $$0 = this.s.h();
      if ($$0 != null && !($$0 instanceof fta.b)) {
         this.z.j = true;
         if ($$0 instanceof fta.d) {
            this.y.j = true;
            this.A.j = true;
         }
      }
   }

   public gcc E() {
      return this.v;
   }

   public gcb F() {
      return this.x;
   }
}
