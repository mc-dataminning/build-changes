import com.mojang.logging.LogUtils;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fow extends fly {
   public static final int a = 308;
   public static final int b = 100;
   public static final int c = 74;
   public static final int d = 64;
   private static final Logger s = LogUtils.getLogger();
   private final fxh u = new fxh();
   private final fly v;
   protected fpa r;
   private fxg w;
   private ffz x;
   private ffz y;
   private ffz z;
   private fxf A;
   private gsc.b B;
   @Nullable
   private gsc.a C;
   private boolean D;

   public fow(fly $$0) {
      super(wx.c("multiplayer.title"));
      this.v = $$0;
   }

   @Override
   protected void aM_() {
      if (this.D) {
         this.r.a(this.n, this.o - 64 - 32, 0, 32);
      } else {
         this.D = true;
         this.w = new fxg(this.m);
         this.w.a();
         this.B = new gsc.b();

         try {
            this.C = new gsc.a(this.B);
            this.C.start();
         } catch (Exception var8) {
            s.warn("Unable to start LAN server detection: {}", var8.getMessage());
         }

         this.r = new fpa(this, this.m, this.n, this.o - 64 - 32, 32, 36);
         this.r.a(this.w);
      }

      this.c(this.r);
      this.y = this.c(ffz.a(wx.c("selectServer.select"), $$0 -> this.m()).a(100).a());
      ffz $$1 = this.c(ffz.a(wx.c("selectServer.direct"), $$0 -> {
         this.A = new fxf(gpb.a("selectServer.defaultName"), "", fxf.c.c);
         this.m.a(new fky(this, this::g, this.A));
      }).a(100).a());
      ffz $$2 = this.c(ffz.a(wx.c("selectServer.add"), $$0 -> {
         this.A = new fxf(gpb.a("selectServer.defaultName"), "", fxf.c.c);
         this.m.a(new fla(this, this::f, this.A));
      }).a(100).a());
      this.x = this.c(ffz.a(wx.c("selectServer.edit"), $$0 -> {
         fpa.a $$1x = this.r.h();
         if ($$1x instanceof fpa.d) {
            fxf $$2x = ((fpa.d)$$1x).c();
            this.A = new fxf($$2x.a, $$2x.b, fxf.c.c);
            this.A.b($$2x);
            this.m.a(new fla(this, this::e, this.A));
         }
      }).a(74).a());
      this.z = this.c(ffz.a(wx.c("selectServer.delete"), $$0 -> {
         fpa.a $$1x = this.r.h();
         if ($$1x instanceof fpa.d) {
            String $$2x = ((fpa.d)$$1x).c().a;
            if ($$2x != null) {
               wx $$3x = wx.c("selectServer.deleteQuestion");
               wx $$4x = wx.a("selectServer.deleteWarning", $$2x);
               wx $$5x = wx.c("selectServer.deleteButton");
               wx $$6x = ww.e;
               this.m.a(new fkq(this::c, $$3x, $$4x, $$5x, $$6x));
            }
         }
      }).a(74).a());
      ffz $$3 = this.c(ffz.a(wx.c("selectServer.refresh"), $$0 -> this.F()).a(74).a());
      ffz $$4 = this.c(ffz.a(ww.k, $$0 -> this.d()).a(74).a());
      fjq $$5 = fjq.d();
      fjj $$6 = $$5.a(new fjj(308, 20, fjj.b.a));
      $$6.a(this.y);
      $$6.a($$1);
      $$6.a($$2);
      $$5.a(fjr.b(4));
      fjj $$7 = $$5.a(new fjj(308, 20, fjj.b.a));
      $$7.a(this.x);
      $$7.a(this.z);
      $$7.a($$3);
      $$7.a($$4);
      $$5.a();
      fjk.a($$5, 0, this.o - 64, this.n, 64);
      this.C();
   }

   @Override
   public void d() {
      this.m.a(this.v);
   }

   @Override
   public void e() {
      super.e();
      List<gsb> $$0 = this.B.a();
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
      this.m.a(new fow(this.v));
   }

   private void c(boolean $$0) {
      fpa.a $$1 = this.r.h();
      if ($$0 && $$1 instanceof fpa.d) {
         this.w.a(((fpa.d)$$1).c());
         this.w.b();
         this.r.a(null);
         this.r.a(this.w);
      }

      this.m.a(this);
   }

   private void e(boolean $$0) {
      fpa.a $$1 = this.r.h();
      if ($$0 && $$1 instanceof fpa.d) {
         fxf $$2 = ((fpa.d)$$1).c();
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
         fxf $$1 = this.w.b(this.A.b);
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
         fxf $$1 = this.w.a(this.A.b);
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
         if (fka.a($$0)) {
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
   public void a(ffm $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.p, this.l, this.n / 2, 20, 16777215);
   }

   public void m() {
      fpa.a $$0 = this.r.h();
      if ($$0 instanceof fpa.d) {
         this.a(((fpa.d)$$0).c());
      } else if ($$0 instanceof fpa.c) {
         gsb $$1 = ((fpa.c)$$0).b();
         this.a(new fxf($$1.a(), $$1.b(), fxf.c.a));
      }
   }

   private void a(fxf $$0) {
      fkr.a(this, this.m, fyi.a($$0.b), $$0, false, null);
   }

   public void a(fpa.a $$0) {
      this.r.a($$0);
      this.C();
   }

   protected void C() {
      this.y.j = false;
      this.x.j = false;
      this.z.j = false;
      fpa.a $$0 = this.r.h();
      if ($$0 != null && !($$0 instanceof fpa.b)) {
         this.y.j = true;
         if ($$0 instanceof fpa.d) {
            this.x.j = true;
            this.z.j = true;
         }
      }
   }

   public fxh D() {
      return this.u;
   }

   public fxg E() {
      return this.w;
   }
}
