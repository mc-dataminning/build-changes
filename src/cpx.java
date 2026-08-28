import java.util.Optional;

public class cpx extends cps {
   private static final int k = 0;
   private static final int l = 2;
   private static final int m = 3;
   private static final int n = 4;
   private static final int o = 5;
   private static final int p = 2;
   private static final int q = 5;
   private static final int r = 32;
   private static final int s = 32;
   private static final int t = 41;
   private final bql u;
   private final cqc v;
   private final crn w;

   public cpx(int $$0, cmu $$1) {
      this($$0, $$1, new brb(5), new crm(2));
   }

   public cpx(int $$0, cmu $$1, bql $$2, cqc $$3) {
      super(cqz.l, $$0);
      a($$2, 5);
      a($$3, 2);
      this.u = $$2;
      this.v = $$3;
      cwn $$4 = $$1.l.dP().K();
      this.a(new cpx.c($$2, 0, 56, 51));
      this.a(new cpx.c($$2, 1, 79, 58));
      this.a(new cpx.c($$2, 2, 102, 51));
      this.w = this.a(new cpx.b($$4, $$2, 3, 79, 17));
      this.a(new cpx.a($$2, 4, 17, 17));
      this.a($$3);

      for (int $$5 = 0; $$5 < 3; $$5++) {
         for (int $$6 = 0; $$6 < 9; $$6++) {
            this.a(new crn($$1, $$6 + $$5 * 9 + 9, 8 + $$6 * 18, 84 + $$5 * 18));
         }
      }

      for (int $$7 = 0; $$7 < 9; $$7++) {
         this.a(new crn($$1, $$7, 8 + $$7 * 18, 142));
      }
   }

   @Override
   public boolean a(cmv $$0) {
      return this.u.a($$0);
   }

   @Override
   public cun a(cmv $$0, int $$1) {
      cun $$2 = cun.l;
      crn $$3 = this.i.get($$1);
      if ($$3 != null && $$3.h()) {
         cun $$4 = $$3.g();
         $$2 = $$4.s();
         if (($$1 < 0 || $$1 > 2) && $$1 != 3 && $$1 != 4) {
            if (cpx.a.b($$2)) {
               if (this.a($$4, 4, 5, false) || this.w.a($$4) && !this.a($$4, 3, 4, false)) {
                  return cun.l;
               }
            } else if (this.w.a($$4)) {
               if (!this.a($$4, 3, 4, false)) {
                  return cun.l;
               }
            } else if (cpx.c.b($$2)) {
               if (!this.a($$4, 0, 3, false)) {
                  return cun.l;
               }
            } else if ($$1 >= 5 && $$1 < 32) {
               if (!this.a($$4, 32, 41, false)) {
                  return cun.l;
               }
            } else if ($$1 >= 32 && $$1 < 41) {
               if (!this.a($$4, 5, 32, false)) {
                  return cun.l;
               }
            } else if (!this.a($$4, 5, 41, false)) {
               return cun.l;
            }
         } else {
            if (!this.a($$4, 5, 41, true)) {
               return cun.l;
            }

            $$3.b($$4, $$2);
         }

         if ($$4.e()) {
            $$3.e(cun.l);
         } else {
            $$3.b();
         }

         if ($$4.I() == $$2.I()) {
            return cun.l;
         }

         $$3.a($$0, $$4);
      }

      return $$2;
   }

   public int l() {
      return this.v.a(1);
   }

   public int m() {
      return this.v.a(0);
   }

   static class a extends crn {
      public a(bql $$0, int $$1, int $$2, int $$3) {
         super($$0, $$1, $$2, $$3);
      }

      @Override
      public boolean a(cun $$0) {
         return b($$0);
      }

      public static boolean b(cun $$0) {
         return $$0.a(cuq.so);
      }
   }

   static class b extends crn {
      private final cwn a;

      public b(cwn $$0, bql $$1, int $$2, int $$3, int $$4) {
         super($$1, $$2, $$3, $$4);
         this.a = $$0;
      }

      @Override
      public boolean a(cun $$0) {
         return this.a.a($$0);
      }
   }

   static class c extends crn {
      public c(bql $$0, int $$1, int $$2, int $$3) {
         super($$0, $$1, $$2, $$3);
      }

      @Override
      public boolean a(cun $$0) {
         return b($$0);
      }

      @Override
      public int a() {
         return 1;
      }

      @Override
      public void a(cmv $$0, cun $$1) {
         Optional<ji<cwm>> $$2 = $$1.a(km.F, cwo.a).e();
         if ($$2.isPresent() && $$0 instanceof arf $$3) {
            am.l.a($$3, $$2.get());
         }

         super.a($$0, $$1);
      }

      public static boolean b(cun $$0) {
         return $$0.a(cuq.sk) || $$0.a(cuq.vo) || $$0.a(cuq.vr) || $$0.a(cuq.sl);
      }
   }
}
