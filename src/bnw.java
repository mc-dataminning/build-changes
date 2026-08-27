import java.util.EnumSet;

public class bnw<T extends bwc & bwg & bvp> extends bmv {
   public static final bdi a = apw.a(1, 2);
   private final T b;
   private bnw.a c = bnw.a.a;
   private final double d;
   private final float e;
   private int f;
   private int g;
   private int h;

   public bnw(T $$0, double $$1, float $$2) {
      this.b = $$0;
      this.d = $$1;
      this.e = $$2 * $$2;
      this.a(EnumSet.of(bmv.a.a, bmv.a.b));
   }

   @Override
   public boolean a() {
      return this.i() && this.h();
   }

   private boolean h() {
      return this.b.b(cgc.uZ);
   }

   @Override
   public boolean b() {
      return this.i() && (this.a() || !this.b.J().l()) && this.h();
   }

   private boolean i() {
      return this.b.j() != null && this.b.j().bs();
   }

   @Override
   public void d() {
      super.d();
      this.b.v(false);
      this.b.h(null);
      this.f = 0;
      if (this.b.fi()) {
         this.b.fo();
         this.b.b(false);
         ceh.a(this.b.fk(), false);
      }
   }

   @Override
   public boolean K_() {
      return true;
   }

   @Override
   public void e() {
      bfz $$0 = this.b.j();
      if ($$0 != null) {
         boolean $$1 = this.b.K().a($$0);
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
               this.b.J().a($$0, this.k() ? this.d : this.d * 0.5);
               this.h = a.a(this.b.ec());
            }
         } else {
            this.h = 0;
            this.b.J().n();
         }

         this.b.E().a($$0, 30.0F, 30.0F);
         if (this.c == bnw.a.a) {
            if (!$$4) {
               this.b.c(bzh.a(this.b, cgc.uZ));
               this.c = bnw.a.b;
               this.b.b(true);
            }
         } else if (this.c == bnw.a.b) {
            if (!this.b.fi()) {
               this.c = bnw.a.a;
            }

            int $$5 = this.b.fm();
            cfz $$6 = this.b.fk();
            if ($$5 >= ceh.k($$6)) {
               this.b.fn();
               this.c = bnw.a.c;
               this.g = 20 + this.b.ec().a(20);
               this.b.b(false);
            }
         } else if (this.c == bnw.a.c) {
            this.g--;
            if (this.g == 0) {
               this.c = bnw.a.d;
            }
         } else if (this.c == bnw.a.d && $$1) {
            this.b.a($$0, 1.0F);
            cfz $$7 = this.b.b(bzh.a(this.b, cgc.uZ));
            ceh.a($$7, false);
            this.c = bnw.a.a;
         }
      }
   }

   private boolean k() {
      return this.c == bnw.a.a;
   }

   static enum a {
      a,
      b,
      c,
      d;
   }
}
