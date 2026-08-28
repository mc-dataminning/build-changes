import com.mojang.logging.LogUtils;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class ftp extends fra {
   public static final int a = 308;
   public static final int b = 100;
   public static final int c = 74;
   public static final int d = 64;
   private static final Logger u = LogUtils.getLogger();
   private final gcy v = new gcy();
   private final fra w;
   protected ftt s;
   private gcx x;
   private flh y;
   private flh z;
   private flh A;
   private gcw B;
   private hcq.b C;
   @Nullable
   private hcq.a D;
   private boolean E;

   public ftp(fra $$0) {
      super(xi.c("multiplayer.title"));
      this.w = $$0;
   }

   @Override
   protected void aR_() {
      if (this.E) {
         this.s.a(this.n, this.o - 64 - 32, 0, 32);
      } else {
         this.E = true;
         this.x = new gcx(this.m);
         this.x.a();
         this.C = new hcq.b();

         try {
            this.D = new hcq.a(this.C);
            this.D.start();
         } catch (Exception var8) {
            u.warn("Unable to start LAN server detection: {}", var8.getMessage());
         }

         this.s = new ftt(this, this.m, this.n, this.o - 64 - 32, 32, 36);
         this.s.a(this.x);
      }

      this.c(this.s);
      this.z = this.c(flh.a(xi.c("selectServer.select"), $$0 -> this.m()).a(100).a());
      flh $$1 = this.c(flh.a(xi.c("selectServer.direct"), $$0 -> {
         this.B = new gcw(gzk.a("selectServer.defaultName"), "", gcw.c.c);
         this.m.a(new fqg(this, this::h, this.B));
      }).a(100).a());
      flh $$2 = this.c(flh.a(xi.c("selectServer.add"), $$0 -> {
         this.B = new gcw(gzk.a("selectServer.defaultName"), "", gcw.c.c);
         this.m.a(new fqi(this, this::g, this.B));
      }).a(100).a());
      this.y = this.c(flh.a(xi.c("selectServer.edit"), $$0 -> {
         ftt.a $$1x = this.s.h();
         if ($$1x instanceof ftt.d) {
            gcw $$2x = ((ftt.d)$$1x).c();
            this.B = new gcw($$2x.a, $$2x.b, gcw.c.c);
            this.B.b($$2x);
            this.m.a(new fqi(this, this::f, this.B));
         }
      }).a(74).a());
      this.A = this.c(flh.a(xi.c("selectServer.delete"), $$0 -> {
         ftt.a $$1x = this.s.h();
         if ($$1x instanceof ftt.d) {
            String $$2x = ((ftt.d)$$1x).c().a;
            if ($$2x != null) {
               xi $$3x = xi.c("selectServer.deleteQuestion");
               xi $$4x = xi.a("selectServer.deleteWarning", $$2x);
               xi $$5x = xi.c("selectServer.deleteButton");
               xi $$6x = xh.e;
               this.m.a(new fpy(this::c, $$3x, $$4x, $$5x, $$6x));
            }
         }
      }).a(74).a());
      flh $$3 = this.c(flh.a(xi.c("selectServer.refresh"), $$0 -> this.G()).a(74).a());
      flh $$4 = this.c(flh.a(xh.k, $$0 -> this.d()).a(74).a());
      fpa $$5 = fpa.d();
      fot $$6 = $$5.a(new fot(308, 20, fot.b.a));
      $$6.a(this.z);
      $$6.a($$1);
      $$6.a($$2);
      $$5.a(fpb.b(4));
      fot $$7 = $$5.a(new fot(308, 20, fot.b.a));
      $$7.a(this.y);
      $$7.a(this.A);
      $$7.a($$3);
      $$7.a($$4);
      $$5.a();
      fou.a($$5, 0, this.o - 64, this.n, 64);
      this.D();
   }

   @Override
   public void d() {
      this.m.a(this.w);
   }

   @Override
   public void e() {
      super.e();
      List<hcp> $$0 = this.C.a();
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
      this.m.a(new ftp(this.w));
   }

   private void c(boolean $$0) {
      ftt.a $$1 = this.s.h();
      if ($$0 && $$1 instanceof ftt.d) {
         this.x.a(((ftt.d)$$1).c());
         this.x.b();
         this.s.a(null);
         this.s.a(this.x);
      }

      this.m.a(this);
   }

   private void f(boolean $$0) {
      ftt.a $$1 = this.s.h();
      if ($$0 && $$1 instanceof ftt.d) {
         gcw $$2 = ((ftt.d)$$1).c();
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
         gcw $$1 = this.x.b(this.B.b);
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
         gcw $$1 = this.x.a(this.B.b);
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
         if (fpk.a($$0)) {
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
   public void a(fku $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.p, this.l, this.n / 2, 20, 16777215);
   }

   public void m() {
      ftt.a $$0 = this.s.h();
      if ($$0 instanceof ftt.d) {
         this.a(((ftt.d)$$0).c());
      } else if ($$0 instanceof ftt.c) {
         hcp $$1 = ((ftt.c)$$0).b();
         this.a(new gcw($$1.a(), $$1.b(), gcw.c.a));
      }
   }

   private void a(gcw $$0) {
      fpz.a(this, this.m, gdz.a($$0.b), $$0, false, null);
   }

   public void a(ftt.a $$0) {
      this.s.a($$0);
      this.D();
   }

   protected void D() {
      this.z.j = false;
      this.y.j = false;
      this.A.j = false;
      ftt.a $$0 = this.s.h();
      if ($$0 != null && !($$0 instanceof ftt.b)) {
         this.z.j = true;
         if ($$0 instanceof ftt.d) {
            this.y.j = true;
            this.A.j = true;
         }
      }
   }

   public gcy E() {
      return this.v;
   }

   public gcx F() {
      return this.x;
   }
}
