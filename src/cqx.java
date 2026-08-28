import java.util.Optional;

public class cqx extends cqq {
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
   private final brd w;
   private final crc x;
   private final csn y;

   public cqx(int $$0, cno $$1) {
      this($$0, $$1, new brr(5), new csm(2));
   }

   public cqx(int $$0, cno $$1, brd $$2, crc $$3) {
      super(crz.l, $$0);
      a($$2, 5);
      a($$3, 2);
      this.w = $$2;
      this.x = $$3;
      cxm $$4 = $$1.k.dS().K();
      this.a(new cqx.c($$2, 0, 56, 51));
      this.a(new cqx.c($$2, 1, 79, 58));
      this.a(new cqx.c($$2, 2, 102, 51));
      this.y = this.a(new cqx.b($$4, $$2, 3, 79, 17));
      this.a(new cqx.a($$2, 4, 17, 17));
      this.a($$3);
      this.c($$1, 8, 84);
   }

   @Override
   public boolean b(cnp $$0) {
      return this.w.a($$0);
   }

   @Override
   public cvl b(cnp $$0, int $$1) {
      cvl $$2 = cvl.k;
      csn $$3 = this.k.get($$1);
      if ($$3 != null && $$3.h()) {
         cvl $$4 = $$3.g();
         $$2 = $$4.u();
         if (($$1 < 0 || $$1 > 2) && $$1 != 3 && $$1 != 4) {
            if (cqx.a.b($$2)) {
               if (this.a($$4, 4, 5, false) || this.y.a($$4) && !this.a($$4, 3, 4, false)) {
                  return cvl.k;
               }
            } else if (this.y.a($$4)) {
               if (!this.a($$4, 3, 4, false)) {
                  return cvl.k;
               }
            } else if (cqx.c.b($$2)) {
               if (!this.a($$4, 0, 3, false)) {
                  return cvl.k;
               }
            } else if ($$1 >= 5 && $$1 < 32) {
               if (!this.a($$4, 32, 41, false)) {
                  return cvl.k;
               }
            } else if ($$1 >= 32 && $$1 < 41) {
               if (!this.a($$4, 5, 32, false)) {
                  return cvl.k;
               }
            } else if (!this.a($$4, 5, 41, false)) {
               return cvl.k;
            }
         } else {
            if (!this.a($$4, 5, 41, true)) {
               return cvl.k;
            }

            $$3.b($$4, $$2);
         }

         if ($$4.f()) {
            $$3.e(cvl.k);
         } else {
            $$3.c();
         }

         if ($$4.J() == $$2.J()) {
            return cvl.k;
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

   static class a extends csn {
      public a(brd $$0, int $$1, int $$2, int $$3) {
         super($$0, $$1, $$2, $$3);
      }

      @Override
      public boolean a(cvl $$0) {
         return b($$0);
      }

      public static boolean b(cvl $$0) {
         return $$0.a(cvo.sp);
      }
   }

   static class b extends csn {
      private final cxm a;

      public b(cxm $$0, brd $$1, int $$2, int $$3, int $$4) {
         super($$1, $$2, $$3, $$4);
         this.a = $$0;
      }

      @Override
      public boolean a(cvl $$0) {
         return this.a.a($$0);
      }
   }

   static class c extends csn {
      public c(brd $$0, int $$1, int $$2, int $$3) {
         super($$0, $$1, $$2, $$3);
      }

      @Override
      public boolean a(cvl $$0) {
         return b($$0);
      }

      @Override
      public int a() {
         return 1;
      }

      @Override
      public void a(cnp $$0, cvl $$1) {
         Optional<jn<cxl>> $$2 = $$1.a(kr.I, cxn.a).e();
         if ($$2.isPresent() && $$0 instanceof arh $$3) {
            an.l.a($$3, $$2.get());
         }

         super.a($$0, $$1);
      }

      public static boolean b(cvl $$0) {
         return $$0.a(cvo.sl) || $$0.a(cvo.vq) || $$0.a(cvo.vt) || $$0.a(cvo.sm);
      }
   }
}
