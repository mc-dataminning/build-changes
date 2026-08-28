import java.util.List;

public abstract class csb extends cto {
   public static final int m = 0;
   public static final int n = 1;
   public static final int o = 2;
   public static final int p = 3;
   public static final int q = 4;
   private static final int s = 3;
   private static final int t = 30;
   private static final int u = 30;
   private static final int v = 39;
   final bsd w;
   private final csl x;
   protected final dfm r;
   private final dbg<? extends dah> y;
   private final ctp z;

   protected csb(cti<?> $$0, dbg<? extends dah> $$1, ctp $$2, int $$3, cot $$4) {
      this($$0, $$1, $$2, $$3, $$4, new bsr(3), new ctv(4));
   }

   protected csb(cti<?> $$0, dbg<? extends dah> $$1, ctp $$2, int $$3, cot $$4, bsd $$5, csl $$6) {
      super($$0, $$3);
      this.y = $$1;
      this.z = $$2;
      a($$5, 3);
      a($$6, 4);
      this.w = $$5;
      this.x = $$6;
      this.r = $$4.k.dV();
      this.a(new ctw($$5, 0, 56, 17));
      this.a(new csw(this, $$5, 1, 56, 53));
      this.a(new csy($$4.k, $$5, 2, 116, 35));
      this.c($$4, 8, 84);
      this.a($$6);
   }

   @Override
   public void a(coz $$0) {
      if (this.w instanceof cub) {
         ((cub)this.w).fillStackedContents($$0);
      }
   }

   public ctw l() {
      return this.k.get(2);
   }

   @Override
   public boolean b(cou $$0) {
      return this.w.a($$0);
   }

   @Override
   public cwm b(cou $$0, int $$1) {
      cwm $$2 = cwm.k;
      ctw $$3 = this.k.get($$1);
      if ($$3 != null && $$3.h()) {
         cwm $$4 = $$3.g();
         $$2 = $$4.v();
         if ($$1 == 2) {
            if (!this.a($$4, 3, 39, true)) {
               return cwm.k;
            }

            $$3.b($$4, $$2);
         } else if ($$1 != 1 && $$1 != 0) {
            if (this.c($$4)) {
               if (!this.a($$4, 0, 1, false)) {
                  return cwm.k;
               }
            } else if (this.d($$4)) {
               if (!this.a($$4, 1, 2, false)) {
                  return cwm.k;
               }
            } else if ($$1 >= 3 && $$1 < 30) {
               if (!this.a($$4, 30, 39, false)) {
                  return cwm.k;
               }
            } else if ($$1 >= 30 && $$1 < 39 && !this.a($$4, 3, 30, false)) {
               return cwm.k;
            }
         } else if (!this.a($$4, 3, 39, false)) {
            return cwm.k;
         }

         if ($$4.f()) {
            $$3.e(cwm.k);
         } else {
            $$3.c();
         }

         if ($$4.L() == $$2.L()) {
            return cwm.k;
         }

         $$3.a($$0, $$4);
      }

      return $$2;
   }

   protected boolean c(cwm $$0) {
      return this.r.s().a(this.y, new dbp($$0), this.r).isPresent();
   }

   protected boolean d(cwm $$0) {
      return this.r.L().a($$0);
   }

   public float m() {
      int $$0 = this.x.a(2);
      int $$1 = this.x.a(3);
      return $$1 != 0 && $$0 != 0 ? azm.a((float)$$0 / (float)$$1, 0.0F, 1.0F) : 0.0F;
   }

   public float n() {
      int $$0 = this.x.a(1);
      if ($$0 == 0) {
         $$0 = 200;
      }

      return azm.a((float)this.x.a(0) / (float)$$0, 0.0F, 1.0F);
   }

   public boolean o() {
      return this.x.a(0) > 0;
   }

   @Override
   public ctp am_() {
      return this.z;
   }

   @Override
   public cto.a a(boolean $$0, boolean $$1, dbc<?> $$2, cot $$3) {
      final List<ctw> $$4 = List.of(this.b(0), this.b(2));
      return akv.a(new akv.a<dah>() {
         @Override
         public void a(coz $$0) {
            csb.this.a($$0);
         }

         @Override
         public void a() {
            $$4.forEach($$0 -> $$0.f(cwm.k));
         }

         @Override
         public boolean a(dbc<dah> $$0) {
            return $$0.b().a(new dbp(csb.this.w.a(0)), csb.this.r);
         }
      }, 1, 1, List.of(this.b(0)), $$4, $$3, (dbc<dah>)$$2, $$0, $$1);
   }
}
