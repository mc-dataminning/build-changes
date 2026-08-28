import java.util.EnumSet;

public class cdg<T extends cly & cmc & cll> extends ccf {
   public static final brv a = bao.a(1, 2);
   private final T b;
   private cdg.a c = cdg.a.a;
   private final double d;
   private final float e;
   private int f;
   private int g;
   private int h;

   public cdg(T $$0, double $$1, float $$2) {
      this.b = $$0;
      this.d = $$1;
      this.e = $$2 * $$2;
      this.a(EnumSet.of(ccf.a.a, ccf.a.b));
   }

   @Override
   public boolean b() {
      return this.i() && this.h();
   }

   private boolean h() {
      return this.b.b(cwq.wn);
   }

   @Override
   public boolean c() {
      return this.i() && (this.b() || !this.b.L().m()) && this.h();
   }

   private boolean i() {
      return this.b.aa_() != null && this.b.aa_().bL();
   }

   @Override
   public void e() {
      super.e();
      this.b.w(false);
      this.b.h(null);
      this.f = 0;
      if (this.b.fx()) {
         this.b.fD();
         this.b.b(false);
         this.b.fz().b(ku.O, cyr.a);
      }
   }

   @Override
   public boolean T_() {
      return true;
   }

   @Override
   public void a() {
      bvh $$0 = this.b.aa_();
      if ($$0 != null) {
         boolean $$1 = this.b.N().a($$0);
         boolean $$2 = this.f > 0;
         if ($$1 != $$2) {
            this.f = 0;
         }

         if ($$1) {
            this.f++;
         } else {
            this.f--;
         }

         double $$3 = this.b.g((bul)$$0);
         boolean $$4 = ($$3 > (double)this.e || this.f < 5) && this.g == 0;
         if ($$4) {
            this.h--;
            if (this.h <= 0) {
               this.b.L().a($$0, this.k() ? this.d : this.d * 0.5);
               this.h = a.a(this.b.dY());
            }
         } else {
            this.h = 0;
            this.b.L().o();
         }

         this.b.H().a($$0, 30.0F, 30.0F);
         if (this.c == cdg.a.a) {
            if (!$$4) {
               this.b.c(cpp.a(this.b, cwq.wn));
               this.c = cdg.a.b;
               this.b.b(true);
            }
         } else if (this.c == cdg.a.b) {
            if (!this.b.fx()) {
               this.c = cdg.a.a;
            }

            int $$5 = this.b.fB();
            cwm $$6 = this.b.fz();
            if ($$5 >= cvd.b($$6, this.b)) {
               this.b.fC();
               this.c = cdg.a.c;
               this.g = 20 + this.b.dY().a(20);
               this.b.b(false);
            }
         } else if (this.c == cdg.a.c) {
            this.g--;
            if (this.g == 0) {
               this.c = cdg.a.d;
            }
         } else if (this.c == cdg.a.d && $$1) {
            this.b.a($$0, 1.0F);
            this.c = cdg.a.a;
         }
      }
   }

   private boolean k() {
      return this.c == cdg.a.a;
   }

   static enum a {
      a,
      b,
      c,
      d;
   }
}
