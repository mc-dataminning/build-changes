import java.util.EnumSet;

public class cbn<T extends ckd & ckh & cjq> extends cam {
   public static final bqc a = azp.a(1, 2);
   private final T b;
   private cbn.a c = cbn.a.a;
   private final double d;
   private final float e;
   private int f;
   private int g;
   private int h;

   public cbn(T $$0, double $$1, float $$2) {
      this.b = $$0;
      this.d = $$1;
      this.e = $$2 * $$2;
      this.a(EnumSet.of(cam.a.a, cam.a.b));
   }

   @Override
   public boolean b() {
      return this.i() && this.h();
   }

   private boolean h() {
      return this.b.b(cut.vW);
   }

   @Override
   public boolean c() {
      return this.i() && (this.b() || !this.b.N().l()) && this.h();
   }

   private boolean i() {
      return this.b.p() != null && this.b.p().bE();
   }

   @Override
   public void e() {
      super.e();
      this.b.w(false);
      this.b.h(null);
      this.f = 0;
      if (this.b.fr()) {
         this.b.fx();
         this.b.b(false);
         this.b.ft().b(kq.E, cxg.a);
      }
   }

   @Override
   public boolean V_() {
      return true;
   }

   @Override
   public void a() {
      btn $$0 = this.b.p();
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

         double $$3 = this.b.g($$0);
         boolean $$4 = ($$3 > (double)this.e || this.f < 5) && this.g == 0;
         if ($$4) {
            this.h--;
            if (this.h <= 0) {
               this.b.N().a($$0, this.k() ? this.d : this.d * 0.5);
               this.h = a.a(this.b.dR());
            }
         } else {
            this.h = 0;
            this.b.N().n();
         }

         this.b.I().a($$0, 30.0F, 30.0F);
         if (this.c == cbn.a.a) {
            if (!$$4) {
               this.b.c(cnr.a(this.b, cut.vW));
               this.c = cbn.a.b;
               this.b.b(true);
            }
         } else if (this.c == cbn.a.b) {
            if (!this.b.fr()) {
               this.c = cbn.a.a;
            }

            int $$5 = this.b.fv();
            cuq $$6 = this.b.ft();
            if ($$5 >= ctc.b($$6, this.b)) {
               this.b.fw();
               this.c = cbn.a.c;
               this.g = 20 + this.b.dR().a(20);
               this.b.b(false);
            }
         } else if (this.c == cbn.a.c) {
            this.g--;
            if (this.g == 0) {
               this.c = cbn.a.d;
            }
         } else if (this.c == cbn.a.d && $$1) {
            this.b.a($$0, 1.0F);
            this.c = cbn.a.a;
         }
      }
   }

   private boolean k() {
      return this.c == cbn.a.a;
   }

   static enum a {
      a,
      b,
      c,
      d;
   }
}
