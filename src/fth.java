import com.mojang.logging.LogUtils;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fth extends fqs {
   public static final int a = 308;
   public static final int b = 100;
   public static final int c = 74;
   public static final int d = 64;
   private static final Logger u = LogUtils.getLogger();
   private final gcn v = new gcn();
   private final fqs w;
   protected ftl s;
   private gcm x;
   private fkz y;
   private fkz z;
   private fkz A;
   private gcl B;
   private hcf.b C;
   @Nullable
   private hcf.a D;
   private boolean E;

   public fth(fqs $$0) {
      super(xh.c("multiplayer.title"));
      this.w = $$0;
   }

   @Override
   protected void aS_() {
      if (this.E) {
         this.s.a(this.n, this.o - 64 - 32, 0, 32);
      } else {
         this.E = true;
         this.x = new gcm(this.m);
         this.x.a();
         this.C = new hcf.b();

         try {
            this.D = new hcf.a(this.C);
            this.D.start();
         } catch (Exception var8) {
            u.warn("Unable to start LAN server detection: {}", var8.getMessage());
         }

         this.s = new ftl(this, this.m, this.n, this.o - 64 - 32, 32, 36);
         this.s.a(this.x);
      }

      this.c(this.s);
      this.z = this.c(fkz.a(xh.c("selectServer.select"), $$0 -> this.m()).a(100).a());
      fkz $$1 = this.c(fkz.a(xh.c("selectServer.direct"), $$0 -> {
         this.B = new gcl(gyz.a("selectServer.defaultName"), "", gcl.c.c);
         this.m.a(new fpy(this, this::h, this.B));
      }).a(100).a());
      fkz $$2 = this.c(fkz.a(xh.c("selectServer.add"), $$0 -> {
         this.B = new gcl(gyz.a("selectServer.defaultName"), "", gcl.c.c);
         this.m.a(new fqa(this, this::g, this.B));
      }).a(100).a());
      this.y = this.c(fkz.a(xh.c("selectServer.edit"), $$0 -> {
         ftl.a $$1x = this.s.h();
         if ($$1x instanceof ftl.d) {
            gcl $$2x = ((ftl.d)$$1x).c();
            this.B = new gcl($$2x.a, $$2x.b, gcl.c.c);
            this.B.b($$2x);
            this.m.a(new fqa(this, this::f, this.B));
         }
      }).a(74).a());
      this.A = this.c(fkz.a(xh.c("selectServer.delete"), $$0 -> {
         ftl.a $$1x = this.s.h();
         if ($$1x instanceof ftl.d) {
            String $$2x = ((ftl.d)$$1x).c().a;
            if ($$2x != null) {
               xh $$3x = xh.c("selectServer.deleteQuestion");
               xh $$4x = xh.a("selectServer.deleteWarning", $$2x);
               xh $$5x = xh.c("selectServer.deleteButton");
               xh $$6x = xg.e;
               this.m.a(new fpq(this::c, $$3x, $$4x, $$5x, $$6x));
            }
         }
      }).a(74).a());
      fkz $$3 = this.c(fkz.a(xh.c("selectServer.refresh"), $$0 -> this.G()).a(74).a());
      fkz $$4 = this.c(fkz.a(xg.k, $$0 -> this.d()).a(74).a());
      fos $$5 = fos.d();
      fok $$6 = $$5.a(new fok(308, 20, fok.b.a));
      $$6.a(this.z);
      $$6.a($$1);
      $$6.a($$2);
      $$5.a(fot.b(4));
      fok $$7 = $$5.a(new fok(308, 20, fok.b.a));
      $$7.a(this.y);
      $$7.a(this.A);
      $$7.a($$3);
      $$7.a($$4);
      $$5.a();
      fol.a($$5, 0, this.o - 64, this.n, 64);
      this.D();
   }

   @Override
   public void d() {
      this.m.a(this.w);
   }

   @Override
   public void e() {
      super.e();
      List<hce> $$0 = this.C.a();
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
      this.m.a(new fth(this.w));
   }

   private void c(boolean $$0) {
      ftl.a $$1 = this.s.h();
      if ($$0 && $$1 instanceof ftl.d) {
         this.x.a(((ftl.d)$$1).c());
         this.x.b();
         this.s.a(null);
         this.s.a(this.x);
      }

      this.m.a(this);
   }

   private void f(boolean $$0) {
      ftl.a $$1 = this.s.h();
      if ($$0 && $$1 instanceof ftl.d) {
         gcl $$2 = ((ftl.d)$$1).c();
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
         gcl $$1 = this.x.b(this.B.b);
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
         gcl $$1 = this.x.a(this.B.b);
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
         if (fpc.a($$0)) {
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
   public void a(fkm $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.p, this.l, this.n / 2, 20, 16777215);
   }

   public void m() {
      ftl.a $$0 = this.s.h();
      if ($$0 instanceof ftl.d) {
         this.a(((ftl.d)$$0).c());
      } else if ($$0 instanceof ftl.c) {
         hce $$1 = ((ftl.c)$$0).b();
         this.a(new gcl($$1.a(), $$1.b(), gcl.c.a));
      }
   }

   private void a(gcl $$0) {
      fpr.a(this, this.m, gdo.a($$0.b), $$0, false, null);
   }

   public void a(ftl.a $$0) {
      this.s.a($$0);
      this.D();
   }

   protected void D() {
      this.z.j = false;
      this.y.j = false;
      this.A.j = false;
      ftl.a $$0 = this.s.h();
      if ($$0 != null && !($$0 instanceof ftl.b)) {
         this.z.j = true;
         if ($$0 instanceof ftl.d) {
            this.y.j = true;
            this.A.j = true;
         }
      }
   }

   public gcn E() {
      return this.v;
   }

   public gcm F() {
      return this.x;
   }
}
