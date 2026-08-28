import java.util.List;

public abstract class csv extends cui {
   public static final int m = 0;
   public static final int n = 1;
   public static final int o = 2;
   public static final int p = 3;
   public static final int q = 4;
   private static final int s = 3;
   private static final int t = 30;
   private static final int u = 30;
   private static final int v = 39;
   final bst w;
   private final ctf x;
   protected final dgz r;
   private final dcg<? extends dbb> y;
   private final dce z;
   private final cuj A;

   protected csv(cuc<?> $$0, dcg<? extends dbb> $$1, alo<dce> $$2, cuj $$3, int $$4, cpn $$5) {
      this($$0, $$1, $$2, $$3, $$4, $$5, new bth(3), new cup(4));
   }

   protected csv(cuc<?> $$0, dcg<? extends dbb> $$1, alo<dce> $$2, cuj $$3, int $$4, cpn $$5, bst $$6, ctf $$7) {
      super($$0, $$4);
      this.y = $$1;
      this.A = $$3;
      a($$6, 3);
      a($$7, 4);
      this.w = $$6;
      this.x = $$7;
      this.r = $$5.k.dW();
      this.z = this.r.Q().a($$2);
      this.a(new cuq($$6, 0, 56, 17));
      this.a(new ctq(this, $$6, 1, 56, 53));
      this.a(new cts($$5.k, $$6, 2, 116, 35));
      this.c($$5, 8, 84);
      this.a($$7);
   }

   @Override
   public void a(cpt $$0) {
      if (this.w instanceof cuv) {
         ((cuv)this.w).fillStackedContents($$0);
      }
   }

   public cuq l() {
      return this.k.get(2);
   }

   @Override
   public boolean b(cpo $$0) {
      return this.w.a($$0);
   }

   @Override
   public cxg b(cpo $$0, int $$1) {
      cxg $$2 = cxg.j;
      cuq $$3 = this.k.get($$1);
      if ($$3 != null && $$3.h()) {
         cxg $$4 = $$3.g();
         $$2 = $$4.v();
         if ($$1 == 2) {
            if (!this.a($$4, 3, 39, true)) {
               return cxg.j;
            }

            $$3.b($$4, $$2);
         } else if ($$1 != 1 && $$1 != 0) {
            if (this.c($$4)) {
               if (!this.a($$4, 0, 1, false)) {
                  return cxg.j;
               }
            } else if (this.d($$4)) {
               if (!this.a($$4, 1, 2, false)) {
                  return cxg.j;
               }
            } else if ($$1 >= 3 && $$1 < 30) {
               if (!this.a($$4, 30, 39, false)) {
                  return cxg.j;
               }
            } else if ($$1 >= 30 && $$1 < 39 && !this.a($$4, 3, 30, false)) {
               return cxg.j;
            }
         } else if (!this.a($$4, 3, 39, false)) {
            return cxg.j;
         }

         if ($$4.f()) {
            $$3.e(cxg.j);
         } else {
            $$3.c();
         }

         if ($$4.M() == $$2.M()) {
            return cxg.j;
         }

         $$3.a($$0, $$4);
      }

      return $$2;
   }

   protected boolean c(cxg $$0) {
      return this.z.a($$0);
   }

   protected boolean d(cxg $$0) {
      return this.r.M().a($$0);
   }

   public float m() {
      int $$0 = this.x.a(2);
      int $$1 = this.x.a(3);
      return $$1 != 0 && $$0 != 0 ? azu.a((float)$$0 / (float)$$1, 0.0F, 1.0F) : 0.0F;
   }

   public float n() {
      int $$0 = this.x.a(1);
      if ($$0 == 0) {
         $$0 = 200;
      }

      return azu.a((float)this.x.a(0) / (float)$$0, 0.0F, 1.0F);
   }

   public boolean o() {
      return this.x.a(0) > 0;
   }

   @Override
   public cuj an_() {
      return this.A;
   }

   @Override
   public cui.a a(boolean $$0, boolean $$1, dca<?> $$2, final arx $$3, cpn $$4) {
      final List<cuq> $$5 = List.of(this.b(0), this.b(2));
      return alb.a(new alb.a<dbb>() {
         @Override
         public void a(cpt $$0) {
            csv.this.a($$0);
         }

         @Override
         public void a() {
            $$5.forEach($$0 -> $$0.f(cxg.j));
         }

         @Override
         public boolean a(dca<dbb> $$0) {
            return $$0.b().a(new dco(csv.this.w.a(0)), $$3);
         }
      }, 1, 1, List.of(this.b(0)), $$5, $$4, (dca<dbb>)$$2, $$0, $$1);
   }
}
