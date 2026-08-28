import java.util.Optional;

public class crg extends cqz {
   private static final int m = 0;
   private static final int n = 2;
   private static final int o = 3;
   private static final int p = 4;
   private static final int q = 5;
   private static final int r = 2;
   private static final int s = 5;
   private static final int t = 32;
   private static final int u = 32;
   private static final int v = 41;
   private final brl w;
   private final crl x;
   private final csw y;

   public crg(int $$0, cnw $$1) {
      this($$0, $$1, new brz(5), new csv(2));
   }

   public crg(int $$0, cnw $$1, brl $$2, crl $$3) {
      super(csi.l, $$0);
      a($$2, 5);
      a($$3, 2);
      this.w = $$2;
      this.x = $$3;
      cxq $$4 = $$1.k.dS().K();
      this.a(new crg.c($$2, 0, 56, 51));
      this.a(new crg.c($$2, 1, 79, 58));
      this.a(new crg.c($$2, 2, 102, 51));
      this.y = this.a(new crg.b($$4, $$2, 3, 79, 17));
      this.a(new crg.a($$2, 4, 17, 17));
      this.a($$3);
      this.c($$1, 8, 84);
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
         if (($$1 < 0 || $$1 > 2) && $$1 != 3 && $$1 != 4) {
            if (crg.a.b($$2)) {
               if (this.a($$4, 4, 5, false) || this.y.a($$4) && !this.a($$4, 3, 4, false)) {
                  return cvs.k;
               }
            } else if (this.y.a($$4)) {
               if (!this.a($$4, 3, 4, false)) {
                  return cvs.k;
               }
            } else if (crg.c.b($$2)) {
               if (!this.a($$4, 0, 3, false)) {
                  return cvs.k;
               }
            } else if ($$1 >= 5 && $$1 < 32) {
               if (!this.a($$4, 32, 41, false)) {
                  return cvs.k;
               }
            } else if ($$1 >= 32 && $$1 < 41) {
               if (!this.a($$4, 5, 32, false)) {
                  return cvs.k;
               }
            } else if (!this.a($$4, 5, 41, false)) {
               return cvs.k;
            }
         } else {
            if (!this.a($$4, 5, 41, true)) {
               return cvs.k;
            }

            $$3.b($$4, $$2);
         }

         if ($$4.f()) {
            $$3.e(cvs.k);
         } else {
            $$3.c();
         }

         if ($$4.K() == $$2.K()) {
            return cvs.k;
         }

         $$3.a($$0, $$2);
      }

      return $$2;
   }

   public int l() {
      return this.x.a(1);
   }

   public int m() {
      return this.x.a(0);
   }

   static class a extends csw {
      public a(brl $$0, int $$1, int $$2, int $$3) {
         super($$0, $$1, $$2, $$3);
      }

      @Override
      public boolean a(cvs $$0) {
         return b($$0);
      }

      public static boolean b(cvs $$0) {
         return $$0.a(cvw.sp);
      }
   }

   static class b extends csw {
      private final cxq a;

      public b(cxq $$0, brl $$1, int $$2, int $$3, int $$4) {
         super($$1, $$2, $$3, $$4);
         this.a = $$0;
      }

      @Override
      public boolean a(cvs $$0) {
         return this.a.a($$0);
      }
   }

   static class c extends csw {
      public c(brl $$0, int $$1, int $$2, int $$3) {
         super($$0, $$1, $$2, $$3);
      }

      @Override
      public boolean a(cvs $$0) {
         return b($$0);
      }

      @Override
      public int a() {
         return 1;
      }

      @Override
      public void a(cnx $$0, cvs $$1) {
         Optional<jo<cxp>> $$2 = $$1.a(ks.L, cxr.a).e();
         if ($$2.isPresent() && $$0 instanceof ark $$3) {
            an.l.a($$3, $$2.get());
         }

         super.a($$0, $$1);
      }

      public static boolean b(cvs $$0) {
         return $$0.a(cvw.sm) || $$0.a(cvw.vq) || $$0.a(cvw.vt) || $$0.a(cvw.sl);
      }
   }
}
