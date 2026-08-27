import javax.annotation.Nullable;
import org.apache.commons.lang3.StringUtils;

public class fbq extends fcz {
   public static final double a = 7.0;
   private static final vf c = vf.c("chat_screen.usage");
   private static final int k = 210;
   private String l = "";
   private int m = -1;
   protected exn b;
   private String n;
   exh o;

   public fbq(String $$0) {
      super(vf.c("chat_screen.title"));
      this.n = $$0;
   }

   @Override
   protected void aN_() {
      this.m = this.f.l.d().c().size();
      this.b = new exn(this.f.i, 4, this.h - 12, this.g - 4, 12, vf.c("chat.editBox")) {
         @Override
         protected vt aK_() {
            return super.aK_().b(fbq.this.o.e());
         }
      };
      this.b.f(256);
      this.b.d(false);
      this.b.a(this.n);
      this.b.b(this::b);
      this.b.f(false);
      this.e(this.b);
      this.o = new exh(this.f, this, this.b, this.i, false, false, 1, 10, true, -805306368);
      this.o.b(false);
      this.o.d();
      this.c(this.b);
   }

   @Override
   public void a(evg $$0, int $$1, int $$2) {
      String $$3 = this.b.a();
      this.b($$0, $$1, $$2);
      this.c($$3);
      this.o.d();
   }

   @Override
   public void j() {
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
         if (this.b(this.b.a(), true)) {
            this.f.a(null);
         }

         return true;
      } else if ($$0 == 265) {
         this.a(-1);
         return true;
      } else if ($$0 == 264) {
         this.a(1);
         return true;
      } else if ($$0 == 266) {
         this.f.l.d().a(this.f.l.d().i() - 1);
         return true;
      } else if ($$0 == 267) {
         this.f.l.d().a(-this.f.l.d().i() + 1);
         return true;
      } else {
         return false;
      }
   }

   @Override
   public boolean a(double $$0, double $$1, double $$2, double $$3) {
      $$3 = aun.a($$3, -1.0, 1.0);
      if (this.o.a($$3)) {
         return true;
      } else {
         if (!s()) {
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
            exf $$3 = this.f.l.d();
            if ($$3.a($$0, $$1)) {
               return true;
            }

            wc $$4 = this.b($$0, $$1);
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
      $$1 = aun.a($$1, 0, $$2);
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
   public void a(ews $$0, int $$1, int $$2, float $$3) {
      $$0.a(2, this.h - 14, this.g - 2, this.h - 2, this.f.m.a(Integer.MIN_VALUE));
      this.b.a($$0, $$1, $$2, $$3);
      super.a($$0, $$1, $$2, $$3);
      this.o.a($$0, $$1, $$2);
      evb $$4 = this.f.l.d().c((double)$$1, (double)$$2);
      if ($$4 != null && $$4.g() != null) {
         $$0.b(this.i, this.i.c($$4.g(), 210), $$1, $$2);
      } else {
         wc $$5 = this.b((double)$$1, (double)$$2);
         if ($$5 != null && $$5.i() != null) {
            $$0.a(this.i, $$5, $$1, $$2);
         }
      }
   }

   @Override
   public void b(ews $$0, int $$1, int $$2, float $$3) {
   }

   @Override
   public boolean k() {
      return false;
   }

   private void c(String $$0) {
      this.b.a($$0);
   }

   @Override
   protected void a(fax $$0) {
      $$0.a(faw.a, this.o());
      $$0.a(faw.d, c);
      String $$1 = this.b.a();
      if (!$$1.isEmpty()) {
         $$0.a().a(faw.a, vf.a("chat_screen.message", $$1));
      }
   }

   @Nullable
   private wc b(double $$0, double $$1) {
      return this.f.l.d().b($$0, $$1);
   }

   public boolean b(String $$0, boolean $$1) {
      $$0 = this.a($$0);
      if ($$0.isEmpty()) {
         return true;
      } else {
         if ($$1) {
            this.f.l.d().a($$0);
         }

         if ($$0.startsWith("/")) {
            this.f.s.cn.c($$0.substring(1));
         } else {
            this.f.s.cn.b($$0);
         }

         return true;
      }
   }

   public String a(String $$0) {
      return avk.e(StringUtils.normalizeSpace($$0.trim()));
   }
}
