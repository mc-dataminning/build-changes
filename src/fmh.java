import javax.annotation.Nullable;
import org.apache.commons.lang3.StringUtils;

public class fmh extends fnl {
   public static final double a = 7.0;
   private static final wu c = wu.c("chat_screen.usage");
   private static final int q = 210;
   private String r = "";
   private int s = -1;
   protected fid b;
   private String u;
   fhx v;

   public fmh(String $$0) {
      super(wu.c("chat_screen.title"));
      this.u = $$0;
   }

   @Override
   protected void aP_() {
      this.s = this.l.l.d().c().size();
      this.b = new fid(this.l.i, 4, this.n - 12, this.m - 4, 12, wu.c("chat.editBox")) {
         @Override
         protected xi aM_() {
            return super.aM_().b(fmh.this.v.e());
         }
      };
      this.b.f(256);
      this.b.d(false);
      this.b.a(this.u);
      this.b.b(this::b);
      this.b.f(false);
      this.d(this.b);
      this.v = new fhx(this.l, this, this.b, this.o, false, false, 1, 10, true, -805306368);
      this.v.b(false);
      this.v.d();
   }

   @Override
   protected void aE_() {
      this.b(this.b);
   }

   @Override
   public void a(ffw $$0, int $$1, int $$2) {
      String $$3 = this.b.a();
      this.b($$0, $$1, $$2);
      this.c($$3);
      this.v.d();
   }

   @Override
   public void j() {
      this.l.l.d().d();
   }

   private void b(String $$0) {
      String $$1 = this.b.a();
      this.v.a(!$$1.equals(this.u));
      this.v.d();
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if (this.v.a($$0, $$1, $$2)) {
         return true;
      } else if (super.a($$0, $$1, $$2)) {
         return true;
      } else if ($$0 == 256) {
         this.l.a(null);
         return true;
      } else if ($$0 == 257 || $$0 == 335) {
         this.b(this.b.a(), true);
         this.l.a(null);
         return true;
      } else if ($$0 == 265) {
         this.a(-1);
         return true;
      } else if ($$0 == 264) {
         this.a(1);
         return true;
      } else if ($$0 == 266) {
         this.l.l.d().a(this.l.l.d().j() - 1);
         return true;
      } else if ($$0 == 267) {
         this.l.l.d().a(-this.l.l.d().j() + 1);
         return true;
      } else {
         return false;
      }
   }

   @Override
   public boolean a(double $$0, double $$1, double $$2, double $$3) {
      $$3 = ayg.a($$3, -1.0, 1.0);
      if (this.v.a($$3)) {
         return true;
      } else {
         if (!s()) {
            $$3 *= 7.0;
         }

         this.l.l.d().a((int)$$3);
         return true;
      }
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2) {
      if (this.v.a((double)((int)$$0), (double)((int)$$1), $$2)) {
         return true;
      } else {
         if ($$2 == 0) {
            fhv $$3 = this.l.l.d();
            if ($$3.a($$0, $$1)) {
               return true;
            }

            xr $$4 = this.b($$0, $$1);
            if ($$4 != null && this.a($$4)) {
               this.u = this.b.a();
               return true;
            }
         }

         return this.b.a($$0, $$1, $$2) ? true : super.a($$0, $$1, $$2);
      }
   }

   @Override
   protected void a_(String $$0, boolean $$1) {
      if ($$1) {
         this.b.a($$0);
      } else {
         this.b.b($$0);
      }
   }

   public void a(int $$0) {
      int $$1 = this.s + $$0;
      int $$2 = this.l.l.d().c().size();
      $$1 = ayg.a($$1, 0, $$2);
      if ($$1 != this.s) {
         if ($$1 == $$2) {
            this.s = $$2;
            this.b.a(this.r);
         } else {
            if (this.s == $$2) {
               this.r = this.b.a();
            }

            this.b.a(this.l.l.d().c().get($$1));
            this.v.a(false);
            this.s = $$1;
         }
      }
   }

   @Override
   public void a(fhh $$0, int $$1, int $$2, float $$3) {
      this.l.l.d().a($$0, this.l.l.e(), $$1, $$2, true);
      $$0.a(2, this.n - 14, this.m - 2, this.n - 2, this.l.m.a(Integer.MIN_VALUE));
      this.b.a($$0, $$1, $$2, $$3);
      super.a($$0, $$1, $$2, $$3);
      $$0.c().a();
      $$0.c().a(0.0F, 0.0F, 200.0F);
      this.v.a($$0, $$1, $$2);
      $$0.c().b();
      ffr $$4 = this.l.l.d().c((double)$$1, (double)$$2);
      if ($$4 != null && $$4.g() != null) {
         $$0.b(this.o, this.o.c($$4.g(), 210), $$1, $$2);
      } else {
         xr $$5 = this.b((double)$$1, (double)$$2);
         if ($$5 != null && $$5.i() != null) {
            $$0.a(this.o, $$5, $$1, $$2);
         }
      }
   }

   @Override
   public void b(fhh $$0, int $$1, int $$2, float $$3) {
   }

   @Override
   public boolean k() {
      return false;
   }

   private void c(String $$0) {
      this.b.a($$0);
   }

   @Override
   protected void a(flq $$0) {
      $$0.a(flp.a, this.n());
      $$0.a(flp.d, c);
      String $$1 = this.b.a();
      if (!$$1.isEmpty()) {
         $$0.a().a(flp.a, wu.a("chat_screen.message", $$1));
      }
   }

   @Nullable
   private xr b(double $$0, double $$1) {
      return this.l.l.d().b($$0, $$1);
   }

   public void b(String $$0, boolean $$1) {
      $$0 = this.a($$0);
      if (!$$0.isEmpty()) {
         if ($$1) {
            this.l.l.d().a($$0);
         }

         if ($$0.startsWith("/")) {
            this.l.s.h.c($$0.substring(1));
         } else {
            this.l.s.h.b($$0);
         }
      }
   }

   public String a(String $$0) {
      return azd.e(StringUtils.normalizeSpace($$0.trim()));
   }
}
