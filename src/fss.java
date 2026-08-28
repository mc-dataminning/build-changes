import com.mojang.logging.LogUtils;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fss extends fqd {
   public static final int a = 308;
   public static final int b = 100;
   public static final int c = 74;
   public static final int d = 64;
   private static final Logger u = LogUtils.getLogger();
   private final gbx v = new gbx();
   private final fqd w;
   protected fsw s;
   private gbw x;
   private fkk y;
   private fkk z;
   private fkk A;
   private gbv B;
   private hbl.b C;
   @Nullable
   private hbl.a D;
   private boolean E;

   public fss(fqd $$0) {
      super(xd.c("multiplayer.title"));
      this.w = $$0;
   }

   @Override
   protected void aR_() {
      if (this.E) {
         this.s.a(this.n, this.o - 64 - 32, 0, 32);
      } else {
         this.E = true;
         this.x = new gbw(this.m);
         this.x.a();
         this.C = new hbl.b();

         try {
            this.D = new hbl.a(this.C);
            this.D.start();
         } catch (Exception var8) {
            u.warn("Unable to start LAN server detection: {}", var8.getMessage());
         }

         this.s = new fsw(this, this.m, this.n, this.o - 64 - 32, 32, 36);
         this.s.a(this.x);
      }

      this.c(this.s);
      this.z = this.c(fkk.a(xd.c("selectServer.select"), $$0 -> this.m()).a(100).a());
      fkk $$1 = this.c(fkk.a(xd.c("selectServer.direct"), $$0 -> {
         this.B = new gbv(gyi.a("selectServer.defaultName"), "", gbv.c.c);
         this.m.a(new fpj(this, this::h, this.B));
      }).a(100).a());
      fkk $$2 = this.c(fkk.a(xd.c("selectServer.add"), $$0 -> {
         this.B = new gbv(gyi.a("selectServer.defaultName"), "", gbv.c.c);
         this.m.a(new fpl(this, this::g, this.B));
      }).a(100).a());
      this.y = this.c(fkk.a(xd.c("selectServer.edit"), $$0 -> {
         fsw.a $$1x = this.s.h();
         if ($$1x instanceof fsw.d) {
            gbv $$2x = ((fsw.d)$$1x).c();
            this.B = new gbv($$2x.a, $$2x.b, gbv.c.c);
            this.B.b($$2x);
            this.m.a(new fpl(this, this::f, this.B));
         }
      }).a(74).a());
      this.A = this.c(fkk.a(xd.c("selectServer.delete"), $$0 -> {
         fsw.a $$1x = this.s.h();
         if ($$1x instanceof fsw.d) {
            String $$2x = ((fsw.d)$$1x).c().a;
            if ($$2x != null) {
               xd $$3x = xd.c("selectServer.deleteQuestion");
               xd $$4x = xd.a("selectServer.deleteWarning", $$2x);
               xd $$5x = xd.c("selectServer.deleteButton");
               xd $$6x = xc.e;
               this.m.a(new fpb(this::c, $$3x, $$4x, $$5x, $$6x));
            }
         }
      }).a(74).a());
      fkk $$3 = this.c(fkk.a(xd.c("selectServer.refresh"), $$0 -> this.G()).a(74).a());
      fkk $$4 = this.c(fkk.a(xc.k, $$0 -> this.d()).a(74).a());
      foc $$5 = foc.d();
      fnv $$6 = $$5.a(new fnv(308, 20, fnv.b.a));
      $$6.a(this.z);
      $$6.a($$1);
      $$6.a($$2);
      $$5.a(fod.b(4));
      fnv $$7 = $$5.a(new fnv(308, 20, fnv.b.a));
      $$7.a(this.y);
      $$7.a(this.A);
      $$7.a($$3);
      $$7.a($$4);
      $$5.a();
      fnw.a($$5, 0, this.o - 64, this.n, 64);
      this.D();
   }

   @Override
   public void d() {
      this.m.a(this.w);
   }

   @Override
   public void e() {
      super.e();
      List<hbk> $$0 = this.C.a();
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
      this.m.a(new fss(this.w));
   }

   private void c(boolean $$0) {
      fsw.a $$1 = this.s.h();
      if ($$0 && $$1 instanceof fsw.d) {
         this.x.a(((fsw.d)$$1).c());
         this.x.b();
         this.s.a(null);
         this.s.a(this.x);
      }

      this.m.a(this);
   }

   private void f(boolean $$0) {
      fsw.a $$1 = this.s.h();
      if ($$0 && $$1 instanceof fsw.d) {
         gbv $$2 = ((fsw.d)$$1).c();
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
         gbv $$1 = this.x.b(this.B.b);
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
         gbv $$1 = this.x.a(this.B.b);
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
         if (fom.a($$0)) {
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
   public void a(fjx $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.p, this.l, this.n / 2, 20, 16777215);
   }

   public void m() {
      fsw.a $$0 = this.s.h();
      if ($$0 instanceof fsw.d) {
         this.a(((fsw.d)$$0).c());
      } else if ($$0 instanceof fsw.c) {
         hbk $$1 = ((fsw.c)$$0).b();
         this.a(new gbv($$1.a(), $$1.b(), gbv.c.a));
      }
   }

   private void a(gbv $$0) {
      fpc.a(this, this.m, gcy.a($$0.b), $$0, false, null);
   }

   public void a(fsw.a $$0) {
      this.s.a($$0);
      this.D();
   }

   protected void D() {
      this.z.j = false;
      this.y.j = false;
      this.A.j = false;
      fsw.a $$0 = this.s.h();
      if ($$0 != null && !($$0 instanceof fsw.b)) {
         this.z.j = true;
         if ($$0 instanceof fsw.d) {
            this.y.j = true;
            this.A.j = true;
         }
      }
   }

   public gbx E() {
      return this.v;
   }

   public gbw F() {
      return this.x;
   }
}
