import com.mojang.logging.LogUtils;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fqc extends fne {
   public static final int a = 308;
   public static final int b = 100;
   public static final int c = 74;
   public static final int d = 64;
   private static final Logger s = LogUtils.getLogger();
   private final fym u = new fym();
   private final fne v;
   protected fqf r;
   private fyl w;
   private fhf x;
   private fhf y;
   private fhf z;
   private fyk A;
   private gth.b B;
   @Nullable
   private gth.a C;
   private boolean D;

   public fqc(fne $$0) {
      super(xp.c("multiplayer.title"));
      this.v = $$0;
   }

   @Override
   protected void aM_() {
      if (this.D) {
         this.r.a(this.n, this.o - 64 - 32, 0, 32);
      } else {
         this.D = true;
         this.w = new fyl(this.m);
         this.w.a();
         this.B = new gth.b();

         try {
            this.C = new gth.a(this.B);
            this.C.start();
         } catch (Exception var8) {
            s.warn("Unable to start LAN server detection: {}", var8.getMessage());
         }

         this.r = new fqf(this, this.m, this.n, this.o - 64 - 32, 32, 36);
         this.r.a(this.w);
      }

      this.c(this.r);
      this.y = this.c(fhf.a(xp.c("selectServer.select"), $$0 -> this.m()).a(100).a());
      fhf $$1 = this.c(fhf.a(xp.c("selectServer.direct"), $$0 -> {
         this.A = new fyk(gqg.a("selectServer.defaultName"), "", fyk.c.c);
         this.m.a(new fme(this, this::g, this.A));
      }).a(100).a());
      fhf $$2 = this.c(fhf.a(xp.c("selectServer.add"), $$0 -> {
         this.A = new fyk(gqg.a("selectServer.defaultName"), "", fyk.c.c);
         this.m.a(new fmg(this, this::f, this.A));
      }).a(100).a());
      this.x = this.c(fhf.a(xp.c("selectServer.edit"), $$0 -> {
         fqf.a $$1x = this.r.h();
         if ($$1x instanceof fqf.d) {
            fyk $$2x = ((fqf.d)$$1x).c();
            this.A = new fyk($$2x.a, $$2x.b, fyk.c.c);
            this.A.b($$2x);
            this.m.a(new fmg(this, this::e, this.A));
         }
      }).a(74).a());
      this.z = this.c(fhf.a(xp.c("selectServer.delete"), $$0 -> {
         fqf.a $$1x = this.r.h();
         if ($$1x instanceof fqf.d) {
            String $$2x = ((fqf.d)$$1x).c().a;
            if ($$2x != null) {
               xp $$3x = xp.c("selectServer.deleteQuestion");
               xp $$4x = xp.a("selectServer.deleteWarning", $$2x);
               xp $$5x = xp.c("selectServer.deleteButton");
               xp $$6x = xo.e;
               this.m.a(new flw(this::c, $$3x, $$4x, $$5x, $$6x));
            }
         }
      }).a(74).a());
      fhf $$3 = this.c(fhf.a(xp.c("selectServer.refresh"), $$0 -> this.J()).a(74).a());
      fhf $$4 = this.c(fhf.a(xo.k, $$0 -> this.d()).a(74).a());
      fkw $$5 = fkw.d();
      fkp $$6 = $$5.a(new fkp(308, 20, fkp.b.a));
      $$6.a(this.y);
      $$6.a($$1);
      $$6.a($$2);
      $$5.a(fkx.b(4));
      fkp $$7 = $$5.a(new fkp(308, 20, fkp.b.a));
      $$7.a(this.x);
      $$7.a(this.z);
      $$7.a($$3);
      $$7.a($$4);
      $$5.a();
      fkq.a($$5, 0, this.o - 64, this.n, 64);
      this.E();
   }

   @Override
   public void d() {
      this.m.a(this.v);
   }

   @Override
   public void e() {
      super.e();
      List<gtg> $$0 = this.B.a();
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
      this.m.a(new fqc(this.v));
   }

   private void c(boolean $$0) {
      fqf.a $$1 = this.r.h();
      if ($$0 && $$1 instanceof fqf.d) {
         this.w.a(((fqf.d)$$1).c());
         this.w.b();
         this.r.a(null);
         this.r.a(this.w);
      }

      this.m.a(this);
   }

   private void e(boolean $$0) {
      fqf.a $$1 = this.r.h();
      if ($$0 && $$1 instanceof fqf.d) {
         fyk $$2 = ((fqf.d)$$1).c();
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
         fyk $$1 = this.w.b(this.A.b);
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
         fyk $$1 = this.w.a(this.A.b);
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
         if (flg.a($$0)) {
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
   public void a(fgs $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.p, this.l, this.n / 2, 20, 16777215);
   }

   public void m() {
      fqf.a $$0 = this.r.h();
      if ($$0 instanceof fqf.d) {
         this.a(((fqf.d)$$0).c());
      } else if ($$0 instanceof fqf.c) {
         gtg $$1 = ((fqf.c)$$0).b();
         this.a(new fyk($$1.a(), $$1.b(), fyk.c.a));
      }
   }

   private void a(fyk $$0) {
      flx.a(this, this.m, fzn.a($$0.b), $$0, false, null);
   }

   public void a(fqf.a $$0) {
      this.r.a($$0);
      this.E();
   }

   protected void E() {
      this.y.j = false;
      this.x.j = false;
      this.z.j = false;
      fqf.a $$0 = this.r.h();
      if ($$0 != null && !($$0 instanceof fqf.b)) {
         this.y.j = true;
         if ($$0 instanceof fqf.d) {
            this.x.j = true;
            this.z.j = true;
         }
      }
   }

   public fym F() {
      return this.u;
   }

   public fyl I() {
      return this.w;
   }
}
