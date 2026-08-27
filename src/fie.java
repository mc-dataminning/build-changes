import javax.annotation.Nullable;
import org.apache.commons.lang3.StringUtils;

public class fie extends fjo {
   public static final double a = 7.0;
   private static final wg c = wg.c("chat_screen.usage");
   private static final int d = 210;
   private String o = "";
   private int p = -1;
   protected fdy b;
   private String q;
   fds r;

   public fie(String $$0) {
      super(wg.c("chat_screen.title"));
      this.q = $$0;
   }

   @Override
   protected void aN_() {
      this.p = this.j.l.d().c().size();
      this.b = new fdy(this.j.i, 4, this.l - 12, this.k - 4, 12, wg.c("chat.editBox")) {
         @Override
         protected wu aL_() {
            return super.aL_().b(fie.this.r.e());
         }
      };
      this.b.f(256);
      this.b.d(false);
      this.b.a(this.q);
      this.b.b(this::b);
      this.b.f(false);
      this.d(this.b);
      this.r = new fds(this.j, this, this.b, this.m, false, false, 1, 10, true, -805306368);
      this.r.b(false);
      this.r.d();
   }

   @Override
   protected void aD_() {
      this.b(this.b);
   }

   @Override
   public void a(fbp $$0, int $$1, int $$2) {
      String $$3 = this.b.a();
      this.b($$0, $$1, $$2);
      this.c($$3);
      this.r.d();
   }

   @Override
   public void j() {
      this.j.l.d().d();
   }

   private void b(String $$0) {
      String $$1 = this.b.a();
      this.r.a(!$$1.equals(this.q));
      this.r.d();
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if (this.r.a($$0, $$1, $$2)) {
         return true;
      } else if (super.a($$0, $$1, $$2)) {
         return true;
      } else if ($$0 == 256) {
         this.j.a(null);
         return true;
      } else if ($$0 == 257 || $$0 == 335) {
         this.b(this.b.a(), true);
         this.j.a(null);
         return true;
      } else if ($$0 == 265) {
         this.a(-1);
         return true;
      } else if ($$0 == 264) {
         this.a(1);
         return true;
      } else if ($$0 == 266) {
         this.j.l.d().a(this.j.l.d().j() - 1);
         return true;
      } else if ($$0 == 267) {
         this.j.l.d().a(-this.j.l.d().j() + 1);
         return true;
      } else {
         return false;
      }
   }

   @Override
   public boolean a(double $$0, double $$1, double $$2, double $$3) {
      $$3 = axk.a($$3, -1.0, 1.0);
      if (this.r.a($$3)) {
         return true;
      } else {
         if (!s()) {
            $$3 *= 7.0;
         }

         this.j.l.d().a((int)$$3);
         return true;
      }
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2) {
      if (this.r.a((double)((int)$$0), (double)((int)$$1), $$2)) {
         return true;
      } else {
         if ($$2 == 0) {
            fdq $$3 = this.j.l.d();
            if ($$3.a($$0, $$1)) {
               return true;
            }

            xd $$4 = this.b($$0, $$1);
            if ($$4 != null && this.a($$4)) {
               this.q = this.b.a();
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
      int $$1 = this.p + $$0;
      int $$2 = this.j.l.d().c().size();
      $$1 = axk.a($$1, 0, $$2);
      if ($$1 != this.p) {
         if ($$1 == $$2) {
            this.p = $$2;
            this.b.a(this.o);
         } else {
            if (this.p == $$2) {
               this.o = this.b.a();
            }

            this.b.a(this.j.l.d().c().get($$1));
            this.r.a(false);
            this.p = $$1;
         }
      }
   }

   @Override
   public void a(fdc $$0, int $$1, int $$2, float $$3) {
      this.j.l.d().a($$0, this.j.l.e(), $$1, $$2, true);
      $$0.a(2, this.l - 14, this.k - 2, this.l - 2, this.j.m.a(Integer.MIN_VALUE));
      this.b.a($$0, $$1, $$2, $$3);
      super.a($$0, $$1, $$2, $$3);
      $$0.c().a();
      $$0.c().a(0.0F, 0.0F, 200.0F);
      this.r.a($$0, $$1, $$2);
      $$0.c().b();
      fbk $$4 = this.j.l.d().c((double)$$1, (double)$$2);
      if ($$4 != null && $$4.g() != null) {
         $$0.b(this.m, this.m.c($$4.g(), 210), $$1, $$2);
      } else {
         xd $$5 = this.b((double)$$1, (double)$$2);
         if ($$5 != null && $$5.i() != null) {
            $$0.a(this.m, $$5, $$1, $$2);
         }
      }
   }

   @Override
   public void b(fdc $$0, int $$1, int $$2, float $$3) {
   }

   @Override
   public boolean k() {
      return false;
   }

   private void c(String $$0) {
      this.b.a($$0);
   }

   @Override
   protected void a(fhl $$0) {
      $$0.a(fhk.a, this.n());
      $$0.a(fhk.d, c);
      String $$1 = this.b.a();
      if (!$$1.isEmpty()) {
         $$0.a().a(fhk.a, wg.a("chat_screen.message", $$1));
      }
   }

   @Nullable
   private xd b(double $$0, double $$1) {
      return this.j.l.d().b($$0, $$1);
   }

   public void b(String $$0, boolean $$1) {
      $$0 = this.a($$0);
      if (!$$0.isEmpty()) {
         if ($$1) {
            this.j.l.d().a($$0);
         }

         if ($$0.startsWith("/")) {
            this.j.s.ct.c($$0.substring(1));
         } else {
            this.j.s.ct.b($$0);
         }
      }
   }

   public String a(String $$0) {
      return ayf.e(StringUtils.normalizeSpace($$0.trim()));
   }
}
