import java.util.EnumSet;

public class brc<T extends bzi & bzm & byv> extends bqb {
   public static final bgj a = asu.a(1, 2);
   private final T b;
   private brc.a c = brc.a.a;
   private final double d;
   private final float e;
   private int f;
   private int g;
   private int h;

   public brc(T $$0, double $$1, float $$2) {
      this.b = $$0;
      this.d = $$1;
      this.e = $$2 * $$2;
      this.a(EnumSet.of(bqb.a.a, bqb.a.b));
   }

   @Override
   public boolean a() {
      return this.i() && this.h();
   }

   private boolean h() {
      return this.b.b(cji.uZ);
   }

   @Override
   public boolean b() {
      return this.i() && (this.a() || !this.b.L().l()) && this.h();
   }

   private boolean i() {
      return this.b.q() != null && this.b.q().bw();
   }

   @Override
   public void d() {
      super.d();
      this.b.v(false);
      this.b.h(null);
      this.f = 0;
      if (this.b.fm()) {
         this.b.fs();
         this.b.b(false);
         chn.a(this.b.fo(), false);
      }
   }

   @Override
   public boolean Q_() {
      return true;
   }

   @Override
   public void e() {
      bjg $$0 = this.b.q();
      if ($$0 != null) {
         boolean $$1 = this.b.M().a($$0);
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
               this.b.L().a($$0, this.k() ? this.d : this.d * 0.5);
               this.h = a.a(this.b.ef());
            }
         } else {
            this.h = 0;
            this.b.L().n();
         }

         this.b.G().a($$0, 30.0F, 30.0F);
         if (this.c == brc.a.a) {
            if (!$$4) {
               this.b.c(ccn.a(this.b, cji.uZ));
               this.c = brc.a.b;
               this.b.b(true);
            }
         } else if (this.c == brc.a.b) {
            if (!this.b.fm()) {
               this.c = brc.a.a;
            }

            int $$5 = this.b.fq();
            cjf $$6 = this.b.fo();
            if ($$5 >= chn.k($$6)) {
               this.b.fr();
               this.c = brc.a.c;
               this.g = 20 + this.b.ef().a(20);
               this.b.b(false);
            }
         } else if (this.c == brc.a.c) {
            this.g--;
            if (this.g == 0) {
               this.c = brc.a.d;
            }
         } else if (this.c == brc.a.d && $$1) {
            this.b.a($$0, 1.0F);
            cjf $$7 = this.b.b(ccn.a(this.b, cji.uZ));
            chn.a($$7, false);
            this.c = brc.a.a;
         }
      }
   }

   private boolean k() {
      return this.c == brc.a.a;
   }

   static enum a {
      a,
      b,
      c,
      d;
   }
}
