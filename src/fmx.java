import javax.annotation.Nullable;
import org.apache.commons.lang3.StringUtils;

public class fmx extends fob {
   public static final double a = 7.0;
   private static final wz c = wz.c("chat_screen.usage");
   private static final int r = 210;
   private String s = "";
   private int u = -1;
   protected fit b;
   private String v;
   fin w;

   public fmx(String $$0) {
      super(wz.c("chat_screen.title"));
      this.v = $$0;
   }

   @Override
   protected void aT_() {
      this.u = this.l.l.d().c().size();
      this.b = new fit(this.l.i, 4, this.n - 12, this.m - 4, 12, wz.c("chat.editBox")) {
         @Override
         protected xn aQ_() {
            return super.aQ_().b(fmx.this.w.e());
         }
      };
      this.b.f(256);
      this.b.d(false);
      this.b.a(this.v);
      this.b.b(this::b);
      this.b.f(false);
      this.d(this.b);
      this.w = new fin(this.l, this, this.b, this.o, false, false, 1, 10, true, -805306368);
      this.w.b(false);
      this.w.d();
   }

   @Override
   protected void aI_() {
      this.b(this.b);
   }

   @Override
   public void a(fgm $$0, int $$1, int $$2) {
      String $$3 = this.b.a();
      this.b($$0, $$1, $$2);
      this.c($$3);
      this.w.d();
   }

   @Override
   public void j() {
      this.l.l.d().d();
   }

   private void b(String $$0) {
      String $$1 = this.b.a();
      this.w.a(!$$1.equals(this.v));
      this.w.d();
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if (this.w.a($$0, $$1, $$2)) {
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
      $$3 = ayo.a($$3, -1.0, 1.0);
      if (this.w.a($$3)) {
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
      if (this.w.a((double)((int)$$0), (double)((int)$$1), $$2)) {
         return true;
      } else {
         if ($$2 == 0) {
            fil $$3 = this.l.l.d();
            if ($$3.a($$0, $$1)) {
               return true;
            }

            xw $$4 = this.b($$0, $$1);
            if ($$4 != null && this.a($$4)) {
               this.v = this.b.a();
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
      int $$1 = this.u + $$0;
      int $$2 = this.l.l.d().c().size();
      $$1 = ayo.a($$1, 0, $$2);
      if ($$1 != this.u) {
         if ($$1 == $$2) {
            this.u = $$2;
            this.b.a(this.s);
         } else {
            if (this.u == $$2) {
               this.s = this.b.a();
            }

            this.b.a(this.l.l.d().c().get($$1));
            this.w.a(false);
            this.u = $$1;
         }
      }
   }

   @Override
   public void a(fhx $$0, int $$1, int $$2, float $$3) {
      this.l.l.d().a($$0, this.l.l.e(), $$1, $$2, true);
      $$0.a(2, this.n - 14, this.m - 2, this.n - 2, this.l.m.a(Integer.MIN_VALUE));
      this.b.a($$0, $$1, $$2, $$3);
      super.a($$0, $$1, $$2, $$3);
      $$0.c().a();
      $$0.c().a(0.0F, 0.0F, 200.0F);
      this.w.a($$0, $$1, $$2);
      $$0.c().b();
      fgh $$4 = this.l.l.d().c((double)$$1, (double)$$2);
      if ($$4 != null && $$4.g() != null) {
         $$0.b(this.o, this.o.c($$4.g(), 210), $$1, $$2);
      } else {
         xw $$5 = this.b((double)$$1, (double)$$2);
         if ($$5 != null && $$5.i() != null) {
            $$0.a(this.o, $$5, $$1, $$2);
         }
      }
   }

   @Override
   public void b(fhx $$0, int $$1, int $$2, float $$3) {
   }

   @Override
   public boolean k() {
      return false;
   }

   private void c(String $$0) {
      this.b.a($$0);
   }

   @Override
   protected void a(fmg $$0) {
      $$0.a(fmf.a, this.n());
      $$0.a(fmf.d, c);
      String $$1 = this.b.a();
      if (!$$1.isEmpty()) {
         $$0.a().a(fmf.a, wz.a("chat_screen.message", $$1));
      }
   }

   @Nullable
   private xw b(double $$0, double $$1) {
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
      return azl.e(StringUtils.normalizeSpace($$0.trim()));
   }
}
