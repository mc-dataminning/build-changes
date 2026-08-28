import java.util.List;

public abstract class csz extends cum {
   public static final int m = 0;
   public static final int n = 1;
   public static final int o = 2;
   public static final int p = 3;
   public static final int q = 4;
   private static final int s = 3;
   private static final int t = 30;
   private static final int u = 30;
   private static final int v = 39;
   final bsx w;
   private final ctj x;
   protected final dha r;
   private final dcj<? extends dbf> y;
   private final dch z;
   private final cun A;

   protected csz(cug<?> $$0, dcj<? extends dbf> $$1, aly<dch> $$2, cun $$3, int $$4, cpr $$5) {
      this($$0, $$1, $$2, $$3, $$4, $$5, new btl(3), new cut(4));
   }

   protected csz(cug<?> $$0, dcj<? extends dbf> $$1, aly<dch> $$2, cun $$3, int $$4, cpr $$5, bsx $$6, ctj $$7) {
      super($$0, $$4);
      this.y = $$1;
      this.A = $$3;
      a($$6, 3);
      a($$7, 4);
      this.w = $$6;
      this.x = $$7;
      this.r = $$5.k.dV();
      this.z = this.r.P().a($$2);
      this.a(new cuu($$6, 0, 56, 17));
      this.a(new ctu(this, $$6, 1, 56, 53));
      this.a(new ctw($$5.k, $$6, 2, 116, 35));
      this.c($$5, 8, 84);
      this.a($$7);
   }

   @Override
   public void a(cpx $$0) {
      if (this.w instanceof cuz) {
         ((cuz)this.w).fillStackedContents($$0);
      }
   }

   public cuu l() {
      return this.k.get(2);
   }

   @Override
   public boolean b(cps $$0) {
      return this.w.a($$0);
   }

   @Override
   public cxk b(cps $$0, int $$1) {
      cxk $$2 = cxk.k;
      cuu $$3 = this.k.get($$1);
      if ($$3 != null && $$3.h()) {
         cxk $$4 = $$3.g();
         $$2 = $$4.v();
         if ($$1 == 2) {
            if (!this.a($$4, 3, 39, true)) {
               return cxk.k;
            }

            $$3.b($$4, $$2);
         } else if ($$1 != 1 && $$1 != 0) {
            if (this.c($$4)) {
               if (!this.a($$4, 0, 1, false)) {
                  return cxk.k;
               }
            } else if (this.d($$4)) {
               if (!this.a($$4, 1, 2, false)) {
                  return cxk.k;
               }
            } else if ($$1 >= 3 && $$1 < 30) {
               if (!this.a($$4, 30, 39, false)) {
                  return cxk.k;
               }
            } else if ($$1 >= 30 && $$1 < 39 && !this.a($$4, 3, 30, false)) {
               return cxk.k;
            }
         } else if (!this.a($$4, 3, 39, false)) {
            return cxk.k;
         }

         if ($$4.f()) {
            $$3.e(cxk.k);
         } else {
            $$3.c();
         }

         if ($$4.L() == $$2.L()) {
            return cxk.k;
         }

         $$3.a($$0, $$4);
      }

      return $$2;
   }

   protected boolean c(cxk $$0) {
      return this.z.a($$0);
   }

   protected boolean d(cxk $$0) {
      return this.r.L().a($$0);
   }

   public float m() {
      int $$0 = this.x.a(2);
      int $$1 = this.x.a(3);
      return $$1 != 0 && $$0 != 0 ? bae.a((float)$$0 / (float)$$1, 0.0F, 1.0F) : 0.0F;
   }

   public float n() {
      int $$0 = this.x.a(1);
      if ($$0 == 0) {
         $$0 = 200;
      }

      return bae.a((float)this.x.a(0) / (float)$$0, 0.0F, 1.0F);
   }

   public boolean o() {
      return this.x.a(0) > 0;
   }

   @Override
   public cun an_() {
      return this.A;
   }

   @Override
   public cum.a a(boolean $$0, boolean $$1, dcd<?> $$2, final ash $$3, cpr $$4) {
      final List<cuu> $$5 = List.of(this.b(0), this.b(2));
      return all.a(new all.a<dbf>() {
         @Override
         public void a(cpx $$0) {
            csz.this.a($$0);
         }

         @Override
         public void a() {
            $$5.forEach($$0 -> $$0.f(cxk.k));
         }

         @Override
         public boolean a(dcd<dbf> $$0) {
            return $$0.b().a(new dcr(csz.this.w.a(0)), $$3);
         }
      }, 1, 1, List.of(this.b(0)), $$5, $$4, (dcd<dbf>)$$2, $$0, $$1);
   }
}
