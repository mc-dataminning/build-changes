import java.util.EnumSet;

public class bts<T extends cbz & ccd & cbm> extends bsr {
   public static final biw a = auz.a(1, 2);
   private final T b;
   private bts.a c = bts.a.a;
   private final double d;
   private final float e;
   private int f;
   private int g;
   private int h;

   public bts(T $$0, double $$1, float $$2) {
      this.b = $$0;
      this.d = $$1;
      this.e = $$2 * $$2;
      this.a(EnumSet.of(bsr.a.a, bsr.a.b));
   }

   @Override
   public boolean a() {
      return this.i() && this.h();
   }

   private boolean h() {
      return this.b.b(cmk.vM);
   }

   @Override
   public boolean b() {
      return this.i() && (this.a() || !this.b.N().l()) && this.h();
   }

   private boolean i() {
      return this.b.q() != null && this.b.q().bx();
   }

   @Override
   public void d() {
      super.d();
      this.b.v(false);
      this.b.h(null);
      this.f = 0;
      if (this.b.fn()) {
         this.b.ft();
         this.b.b(false);
         ckp.a(this.b.fp(), false);
      }
   }

   @Override
   public boolean T_() {
      return true;
   }

   @Override
   public void e() {
      blv $$0 = this.b.q();
      if ($$0 != null) {
         boolean $$1 = this.b.O().a($$0);
         boolean $$2 = this.f > 0;
         if ($$1 != $$2) {
            this.f = 0;
         }

         if ($$1) {
            this.f++;
         } else {
            this.f--;
         }

         double $$3 = this.b.f($$0);
         boolean $$4 = ($$3 > (double)this.e || this.f < 5) && this.g == 0;
         if ($$4) {
            this.h--;
            if (this.h <= 0) {
               this.b.N().a($$0, this.k() ? this.d : this.d * 0.5);
               this.h = a.a(this.b.eg());
            }
         } else {
            this.h = 0;
            this.b.N().n();
         }

         this.b.I().a($$0, 30.0F, 30.0F);
         if (this.c == bts.a.a) {
            if (!$$4) {
               this.b.c(cfk.a(this.b, cmk.vM));
               this.c = bts.a.b;
               this.b.b(true);
            }
         } else if (this.c == bts.a.b) {
            if (!this.b.fn()) {
               this.c = bts.a.a;
            }

            int $$5 = this.b.fr();
            cmh $$6 = this.b.fp();
            if ($$5 >= ckp.k($$6)) {
               this.b.fs();
               this.c = bts.a.c;
               this.g = 20 + this.b.eg().a(20);
               this.b.b(false);
            }
         } else if (this.c == bts.a.c) {
            this.g--;
            if (this.g == 0) {
               this.c = bts.a.d;
            }
         } else if (this.c == bts.a.d && $$1) {
            this.b.a($$0, 1.0F);
            cmh $$7 = this.b.b(cfk.a(this.b, cmk.vM));
            ckp.a($$7, false);
            this.c = bts.a.a;
         }
      }
   }

   private boolean k() {
      return this.c == bts.a.a;
   }

   static enum a {
      a,
      b,
      c,
      d;
   }
}
