import java.util.List;

public abstract class csf extends cts {
   public static final int m = 0;
   public static final int n = 1;
   public static final int o = 2;
   public static final int p = 3;
   public static final int q = 4;
   private static final int s = 3;
   private static final int t = 30;
   private static final int u = 30;
   private static final int v = 39;
   final bse w;
   private final csp x;
   protected final dgj r;
   private final dbq<? extends dal> y;
   private final dbo z;
   private final ctt A;

   protected csf(ctm<?> $$0, dbq<? extends dal> $$1, aku<dbo> $$2, ctt $$3, int $$4, cox $$5) {
      this($$0, $$1, $$2, $$3, $$4, $$5, new bss(3), new ctz(4));
   }

   protected csf(ctm<?> $$0, dbq<? extends dal> $$1, aku<dbo> $$2, ctt $$3, int $$4, cox $$5, bse $$6, csp $$7) {
      super($$0, $$4);
      this.y = $$1;
      this.A = $$3;
      a($$6, 3);
      a($$7, 4);
      this.w = $$6;
      this.x = $$7;
      this.r = $$5.k.dV();
      this.z = this.r.Q().a($$2);
      this.a(new cua($$6, 0, 56, 17));
      this.a(new cta(this, $$6, 1, 56, 53));
      this.a(new ctc($$5.k, $$6, 2, 116, 35));
      this.c($$5, 8, 84);
      this.a($$7);
   }

   @Override
   public void a(cpd $$0) {
      if (this.w instanceof cuf) {
         ((cuf)this.w).fillStackedContents($$0);
      }
   }

   public cua l() {
      return this.k.get(2);
   }

   @Override
   public boolean b(coy $$0) {
      return this.w.a($$0);
   }

   @Override
   public cwq b(coy $$0, int $$1) {
      cwq $$2 = cwq.j;
      cua $$3 = this.k.get($$1);
      if ($$3 != null && $$3.h()) {
         cwq $$4 = $$3.g();
         $$2 = $$4.v();
         if ($$1 == 2) {
            if (!this.a($$4, 3, 39, true)) {
               return cwq.j;
            }

            $$3.b($$4, $$2);
         } else if ($$1 != 1 && $$1 != 0) {
            if (this.c($$4)) {
               if (!this.a($$4, 0, 1, false)) {
                  return cwq.j;
               }
            } else if (this.d($$4)) {
               if (!this.a($$4, 1, 2, false)) {
                  return cwq.j;
               }
            } else if ($$1 >= 3 && $$1 < 30) {
               if (!this.a($$4, 30, 39, false)) {
                  return cwq.j;
               }
            } else if ($$1 >= 30 && $$1 < 39 && !this.a($$4, 3, 30, false)) {
               return cwq.j;
            }
         } else if (!this.a($$4, 3, 39, false)) {
            return cwq.j;
         }

         if ($$4.f()) {
            $$3.e(cwq.j);
         } else {
            $$3.c();
         }

         if ($$4.M() == $$2.M()) {
            return cwq.j;
         }

         $$3.a($$0, $$4);
      }

      return $$2;
   }

   protected boolean c(cwq $$0) {
      return this.z.a($$0);
   }

   protected boolean d(cwq $$0) {
      return this.r.M().a($$0);
   }

   public float m() {
      int $$0 = this.x.a(2);
      int $$1 = this.x.a(3);
      return $$1 != 0 && $$0 != 0 ? ayz.a((float)$$0 / (float)$$1, 0.0F, 1.0F) : 0.0F;
   }

   public float n() {
      int $$0 = this.x.a(1);
      if ($$0 == 0) {
         $$0 = 200;
      }

      return ayz.a((float)this.x.a(0) / (float)$$0, 0.0F, 1.0F);
   }

   public boolean o() {
      return this.x.a(0) > 0;
   }

   @Override
   public ctt am_() {
      return this.A;
   }

   @Override
   public cts.a a(boolean $$0, boolean $$1, dbk<?> $$2, final ard $$3, cox $$4) {
      final List<cua> $$5 = List.of(this.b(0), this.b(2));
      return akh.a(new akh.a<dal>() {
         @Override
         public void a(cpd $$0) {
            csf.this.a($$0);
         }

         @Override
         public void a() {
            $$5.forEach($$0 -> $$0.f(cwq.j));
         }

         @Override
         public boolean a(dbk<dal> $$0) {
            return $$0.b().a(new dby(csf.this.w.a(0)), $$3);
         }
      }, 1, 1, List.of(this.b(0)), $$5, $$4, (dbk<dal>)$$2, $$0, $$1);
   }
}
