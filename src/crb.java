import java.util.List;

public abstract class crb extends cso {
   public static final int m = 0;
   public static final int n = 1;
   public static final int o = 2;
   public static final int p = 3;
   public static final int q = 4;
   private static final int s = 3;
   private static final int t = 30;
   private static final int u = 30;
   private static final int v = 39;
   final brl w;
   private final crl x;
   protected final dej r;
   private final daq<? extends czr> y;
   private final csp z;

   protected crb(csi<?> $$0, daq<? extends czr> $$1, csp $$2, int $$3, cnw $$4) {
      this($$0, $$1, $$2, $$3, $$4, new brz(3), new csv(4));
   }

   protected crb(csi<?> $$0, daq<? extends czr> $$1, csp $$2, int $$3, cnw $$4, brl $$5, crl $$6) {
      super($$0, $$3);
      this.y = $$1;
      this.z = $$2;
      a($$5, 3);
      a($$6, 4);
      this.w = $$5;
      this.x = $$6;
      this.r = $$4.k.dS();
      this.a(new csw($$5, 0, 56, 17));
      this.a(new crw(this, $$5, 1, 56, 53));
      this.a(new cry($$4.k, $$5, 2, 116, 35));
      this.c($$4, 8, 84);
      this.a($$6);
   }

   @Override
   public void a(coc $$0) {
      if (this.w instanceof ctb) {
         ((ctb)this.w).fillStackedContents($$0);
      }
   }

   public csw l() {
      return this.k.get(2);
   }

   @Override
   public boolean b(cnx $$0) {
      return this.w.a($$0);
   }

   @Override
   public cvs b(cnx $$0, int $$1) {
      cvs $$2 = cvs.k;
      csw $$3 = this.k.get($$1);
      if ($$3 != null && $$3.h()) {
         cvs $$4 = $$3.g();
         $$2 = $$4.u();
         if ($$1 == 2) {
            if (!this.a($$4, 3, 39, true)) {
               return cvs.k;
            }

            $$3.b($$4, $$2);
         } else if ($$1 != 1 && $$1 != 0) {
            if (this.c($$4)) {
               if (!this.a($$4, 0, 1, false)) {
                  return cvs.k;
               }
            } else if (this.d($$4)) {
               if (!this.a($$4, 1, 2, false)) {
                  return cvs.k;
               }
            } else if ($$1 >= 3 && $$1 < 30) {
               if (!this.a($$4, 30, 39, false)) {
                  return cvs.k;
               }
            } else if ($$1 >= 30 && $$1 < 39 && !this.a($$4, 3, 30, false)) {
               return cvs.k;
            }
         } else if (!this.a($$4, 3, 39, false)) {
            return cvs.k;
         }

         if ($$4.f()) {
            $$3.e(cvs.k);
         } else {
            $$3.c();
         }

         if ($$4.K() == $$2.K()) {
            return cvs.k;
         }

         $$3.a($$0, $$4);
      }

      return $$2;
   }

   protected boolean c(cvs $$0) {
      return this.r.r().a(this.y, new dba($$0), this.r).isPresent();
   }

   protected boolean d(cvs $$0) {
      return this.r.L().a($$0);
   }

   public float m() {
      int $$0 = this.x.a(2);
      int $$1 = this.x.a(3);
      return $$1 != 0 && $$0 != 0 ? azf.a((float)$$0 / (float)$$1, 0.0F, 1.0F) : 0.0F;
   }

   public float n() {
      int $$0 = this.x.a(1);
      if ($$0 == 0) {
         $$0 = 200;
      }

      return azf.a((float)this.x.a(0) / (float)$$0, 0.0F, 1.0F);
   }

   public boolean o() {
      return this.x.a(0) > 0;
   }

   @Override
   public csp an_() {
      return this.z;
   }

   @Override
   public cso.a a(boolean $$0, boolean $$1, dam<?> $$2, cnw $$3) {
      final List<csw> $$4 = List.of(this.b(0), this.b(2));
      return akq.a(new akq.a<czr>() {
         @Override
         public void a(coc $$0) {
            crb.this.a($$0);
         }

         @Override
         public void a() {
            $$4.forEach($$0 -> $$0.f(cvs.k));
         }

         @Override
         public boolean a(dam<czr> $$0) {
            return $$0.b().a(new dba(crb.this.w.a(0)), crb.this.r);
         }
      }, 1, 1, List.of(this.b(0)), $$4, $$3, (dam<czr>)$$2, $$0, $$1);
   }
}
