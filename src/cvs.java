import java.util.List;

public abstract class cvs extends cxf {
   public static final int m = 0;
   public static final int n = 1;
   public static final int o = 2;
   public static final int p = 3;
   public static final int q = 4;
   private static final int s = 3;
   private static final int t = 30;
   private static final int u = 30;
   private static final int v = 39;
   final buk w;
   private final cwc x;
   protected final djx r;
   private final dfa<? extends ddv> y;
   private final dey z;
   private final cxg A;

   protected cvs(cwz<?> $$0, dfa<? extends ddv> $$1, alh<dey> $$2, cxg $$3, int $$4, crw $$5) {
      this($$0, $$1, $$2, $$3, $$4, $$5, new buy(3), new cxm(4));
   }

   protected cvs(cwz<?> $$0, dfa<? extends ddv> $$1, alh<dey> $$2, cxg $$3, int $$4, crw $$5, buk $$6, cwc $$7) {
      super($$0, $$4);
      this.y = $$1;
      this.A = $$3;
      a($$6, 3);
      a($$7, 4);
      this.w = $$6;
      this.x = $$7;
      this.r = $$5.h.dV();
      this.z = this.r.Q().a($$2);
      this.a(new cxn($$6, 0, 56, 17));
      this.a(new cwn(this, $$6, 1, 56, 53));
      this.a(new cwp($$5.h, $$6, 2, 116, 35));
      this.c($$5, 8, 84);
      this.a($$7);
   }

   @Override
   public void a(csd $$0) {
      if (this.w instanceof cxs) {
         ((cxs)this.w).fillStackedContents($$0);
      }
   }

   public cxn l() {
      return this.k.get(2);
   }

   @Override
   public boolean b(crx $$0) {
      return this.w.a($$0);
   }

   @Override
   public czy b(crx $$0, int $$1) {
      czy $$2 = czy.k;
      cxn $$3 = this.k.get($$1);
      if ($$3 != null && $$3.h()) {
         czy $$4 = $$3.g();
         $$2 = $$4.v();
         if ($$1 == 2) {
            if (!this.a($$4, 3, 39, true)) {
               return czy.k;
            }

            $$3.b($$4, $$2);
         } else if ($$1 != 1 && $$1 != 0) {
            if (this.c($$4)) {
               if (!this.a($$4, 0, 1, false)) {
                  return czy.k;
               }
            } else if (this.d($$4)) {
               if (!this.a($$4, 1, 2, false)) {
                  return czy.k;
               }
            } else if ($$1 >= 3 && $$1 < 30) {
               if (!this.a($$4, 30, 39, false)) {
                  return czy.k;
               }
            } else if ($$1 >= 30 && $$1 < 39 && !this.a($$4, 3, 30, false)) {
               return czy.k;
            }
         } else if (!this.a($$4, 3, 39, false)) {
            return czy.k;
         }

         if ($$4.f()) {
            $$3.e(czy.k);
         } else {
            $$3.d();
         }

         if ($$4.M() == $$2.M()) {
            return czy.k;
         }

         $$3.a($$0, $$4);
      }

      return $$2;
   }

   protected boolean c(czy $$0) {
      return this.z.a($$0);
   }

   protected boolean d(czy $$0) {
      return this.r.M().a($$0);
   }

   public float m() {
      int $$0 = this.x.a(2);
      int $$1 = this.x.a(3);
      return $$1 != 0 && $$0 != 0 ? azo.a((float)$$0 / (float)$$1, 0.0F, 1.0F) : 0.0F;
   }

   public float n() {
      int $$0 = this.x.a(1);
      if ($$0 == 0) {
         $$0 = 200;
      }

      return azo.a((float)this.x.a(0) / (float)$$0, 0.0F, 1.0F);
   }

   public boolean o() {
      return this.x.a(0) > 0;
   }

   @Override
   public cxg an_() {
      return this.A;
   }

   @Override
   public cxf.a a(boolean $$0, boolean $$1, deu<?> $$2, final ars $$3, crw $$4) {
      final List<cxn> $$5 = List.of(this.b(0), this.b(2));
      return aku.a(new aku.a<ddv>() {
         @Override
         public void a(csd $$0) {
            cvs.this.a($$0);
         }

         @Override
         public void a() {
            $$5.forEach($$0 -> $$0.f(czy.k));
         }

         @Override
         public boolean a(deu<ddv> $$0) {
            return $$0.b().a(new dfi(cvs.this.w.a(0)), $$3);
         }
      }, 1, 1, List.of(this.b(0)), $$5, $$4, (deu<ddv>)$$2, $$0, $$1);
   }
}
