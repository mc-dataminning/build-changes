import javax.annotation.Nullable;
import org.apache.commons.lang3.StringUtils;

public class eti extends euq {
   public static final double a = 7.0;
   private static final sw c = sw.c("chat_screen.usage");
   private static final int k = 210;
   private String l = "";
   private int m = -1;
   protected epr b;
   private String n;
   epl o;

   public eti(String $$0) {
      super(sw.c("chat_screen.title"));
      this.n = $$0;
   }

   @Override
   protected void b() {
      this.m = this.f.l.d().c().size();
      this.b = new epr(this.f.i, 4, this.h - 12, this.g - 4, 12, sw.c("chat.editBox")) {
         @Override
         protected tj aE_() {
            return super.aE_().b(eti.this.o.c());
         }
      };
      this.b.m(256);
      this.b.b(false);
      this.b.a(this.n);
      this.b.b(this::b);
      this.b.d(false);
      this.e(this.b);
      this.o = new epl(this.f, this, this.b, this.i, false, false, 1, 10, true, -805306368);
      this.o.b();
      this.c(this.b);
   }

   @Override
   public void a(enn $$0, int $$1, int $$2) {
      String $$3 = this.b.b();
      this.b($$0, $$1, $$2);
      this.c($$3);
      this.o.b();
   }

   @Override
   public void ax_() {
      this.f.l.d().d();
   }

   @Override
   public void f() {
      this.b.a();
   }

   private void b(String $$0) {
      String $$1 = this.b.b();
      this.o.a(!$$1.equals(this.n));
      this.o.b();
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
         if (this.b(this.b.b(), true)) {
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
   public boolean a(double $$0, double $$1, double $$2) {
      $$2 = apa.a($$2, -1.0, 1.0);
      if (this.o.a($$2)) {
         return true;
      } else {
         if (!q()) {
            $$2 *= 7.0;
         }

         this.f.l.d().a((int)$$2);
         return true;
      }
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2) {
      if (this.o.a((double)((int)$$0), (double)((int)$$1), $$2)) {
         return true;
      } else {
         if ($$2 == 0) {
            epj $$3 = this.f.l.d();
            if ($$3.a($$0, $$1)) {
               return true;
            }

            ts $$4 = this.a($$0, $$1);
            if ($$4 != null && this.a($$4)) {
               this.n = this.b.b();
               return true;
            }
         }

         return this.b.a($$0, $$1, $$2) ? true : super.a($$0, $$1, $$2);
      }
   }

   @Override
   protected void a(String $$0, boolean $$1) {
      if ($$1) {
         this.b.a($$0);
      } else {
         this.b.b($$0);
      }
   }

   public void a(int $$0) {
      int $$1 = this.m + $$0;
      int $$2 = this.f.l.d().c().size();
      $$1 = apa.a($$1, 0, $$2);
      if ($$1 != this.m) {
         if ($$1 == $$2) {
            this.m = $$2;
            this.b.a(this.l);
         } else {
            if (this.m == $$2) {
               this.l = this.b.b();
            }

            this.b.a(this.f.l.d().c().get($$1));
            this.o.a(false);
            this.m = $$1;
         }
      }
   }

   @Override
   public void a(eox $$0, int $$1, int $$2, float $$3) {
      $$0.a(2, this.h - 14, this.g - 2, this.h - 2, this.f.m.a(Integer.MIN_VALUE));
      this.b.a($$0, $$1, $$2, $$3);
      super.a($$0, $$1, $$2, $$3);
      this.o.a($$0, $$1, $$2);
      eni $$4 = this.f.l.d().c((double)$$1, (double)$$2);
      if ($$4 != null && $$4.f() != null) {
         $$0.b(this.i, this.i.c($$4.f(), 210), $$1, $$2);
      } else {
         ts $$5 = this.a((double)$$1, (double)$$2);
         if ($$5 != null && $$5.i() != null) {
            $$0.a(this.i, $$5, $$1, $$2);
         }
      }
   }

   @Override
   public boolean az_() {
      return false;
   }

   private void c(String $$0) {
      this.b.a($$0);
   }

   @Override
   protected void a(esp $$0) {
      $$0.a(eso.a, this.m());
      $$0.a(eso.d, c);
      String $$1 = this.b.b();
      if (!$$1.isEmpty()) {
         $$0.a().a(eso.a, sw.a("chat_screen.message", $$1));
      }
   }

   @Nullable
   private ts a(double $$0, double $$1) {
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
            this.f.t.cl.c($$0.substring(1));
         } else {
            this.f.t.cl.b($$0);
         }

         return true;
      }
   }

   public String a(String $$0) {
      return aps.e(StringUtils.normalizeSpace($$0.trim()));
   }
}
