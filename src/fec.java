import javax.annotation.Nullable;
import org.apache.commons.lang3.StringUtils;

public class fec extends ffl {
   public static final double a = 7.0;
   private static final vq c = vq.c("chat_screen.usage");
   private static final int k = 210;
   private String l = "";
   private int m = -1;
   protected ezx b;
   private String n;
   ezr o;

   public fec(String $$0) {
      super(vq.c("chat_screen.title"));
      this.n = $$0;
   }

   @Override
   protected void aQ_() {
      this.m = this.f.l.d().c().size();
      this.b = new ezx(this.f.i, 4, this.h - 12, this.g - 4, 12, vq.c("chat.editBox")) {
         @Override
         protected we aN_() {
            return super.aN_().b(fec.this.o.e());
         }
      };
      this.b.f(256);
      this.b.d(false);
      this.b.a(this.n);
      this.b.b(this::b);
      this.b.f(false);
      this.d(this.b);
      this.o = new ezr(this.f, this, this.b, this.i, false, false, 1, 10, true, -805306368);
      this.o.b(false);
      this.o.d();
   }

   @Override
   protected void aH_() {
      this.b(this.b);
   }

   @Override
   public void a(exo $$0, int $$1, int $$2) {
      String $$3 = this.b.a();
      this.b($$0, $$1, $$2);
      this.c($$3);
      this.o.d();
   }

   @Override
   public void k() {
      this.f.l.d().d();
   }

   private void b(String $$0) {
      String $$1 = this.b.a();
      this.o.a(!$$1.equals(this.n));
      this.o.d();
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if (this.o.a($$0, $$1, $$2)) {
         return true;
      } else if (super.a($$0, $$1, $$2)) {
         return true;
      } else if ($$0 == 256) {
         this.f.a(null);
         return true;
      } else if ($$0 == 257 || $$0 == 335) {
         this.b(this.b.a(), true);
         this.f.a(null);
         return true;
      } else if ($$0 == 265) {
         this.a(-1);
         return true;
      } else if ($$0 == 264) {
         this.a(1);
         return true;
      } else if ($$0 == 266) {
         this.f.l.d().a(this.f.l.d().j() - 1);
         return true;
      } else if ($$0 == 267) {
         this.f.l.d().a(-this.f.l.d().j() + 1);
         return true;
      } else {
         return false;
      }
   }

   @Override
   public boolean a(double $$0, double $$1, double $$2, double $$3) {
      $$3 = awi.a($$3, -1.0, 1.0);
      if (this.o.a($$3)) {
         return true;
      } else {
         if (!v()) {
            $$3 *= 7.0;
         }

         this.f.l.d().a((int)$$3);
         return true;
      }
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2) {
      if (this.o.a((double)((int)$$0), (double)((int)$$1), $$2)) {
         return true;
      } else {
         if ($$2 == 0) {
            ezp $$3 = this.f.l.d();
            if ($$3.a($$0, $$1)) {
               return true;
            }

            wn $$4 = this.b($$0, $$1);
            if ($$4 != null && this.a($$4)) {
               this.n = this.b.a();
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
      int $$1 = this.m + $$0;
      int $$2 = this.f.l.d().c().size();
      $$1 = awi.a($$1, 0, $$2);
      if ($$1 != this.m) {
         if ($$1 == $$2) {
            this.m = $$2;
            this.b.a(this.l);
         } else {
            if (this.m == $$2) {
               this.l = this.b.a();
            }

            this.b.a(this.f.l.d().c().get($$1));
            this.o.a(false);
            this.m = $$1;
         }
      }
   }

   @Override
   public void a(ezb $$0, int $$1, int $$2, float $$3) {
      this.f.l.d().a($$0, this.f.l.e(), $$1, $$2, true);
      $$0.a(2, this.h - 14, this.g - 2, this.h - 2, this.f.m.a(Integer.MIN_VALUE));
      this.b.a($$0, $$1, $$2, $$3);
      super.a($$0, $$1, $$2, $$3);
      $$0.c().a();
      $$0.c().a(0.0F, 0.0F, 200.0F);
      this.o.a($$0, $$1, $$2);
      $$0.c().b();
      exj $$4 = this.f.l.d().c((double)$$1, (double)$$2);
      if ($$4 != null && $$4.g() != null) {
         $$0.b(this.i, this.i.c($$4.g(), 210), $$1, $$2);
      } else {
         wn $$5 = this.b((double)$$1, (double)$$2);
         if ($$5 != null && $$5.i() != null) {
            $$0.a(this.i, $$5, $$1, $$2);
         }
      }
   }

   @Override
   public void b(ezb $$0, int $$1, int $$2, float $$3) {
   }

   @Override
   public boolean m() {
      return false;
   }

   private void c(String $$0) {
      this.b.a($$0);
   }

   @Override
   protected void a(fdj $$0) {
      $$0.a(fdi.a, this.p());
      $$0.a(fdi.d, c);
      String $$1 = this.b.a();
      if (!$$1.isEmpty()) {
         $$0.a().a(fdi.a, vq.a("chat_screen.message", $$1));
      }
   }

   @Nullable
   private wn b(double $$0, double $$1) {
      return this.f.l.d().b($$0, $$1);
   }

   public void b(String $$0, boolean $$1) {
      $$0 = this.a($$0);
      if (!$$0.isEmpty()) {
         if ($$1) {
            this.f.l.d().a($$0);
         }

         if ($$0.startsWith("/")) {
            this.f.s.cq.c($$0.substring(1));
         } else {
            this.f.s.cq.b($$0);
         }
      }
   }

   public String a(String $$0) {
      return axd.e(StringUtils.normalizeSpace($$0.trim()));
   }
}
