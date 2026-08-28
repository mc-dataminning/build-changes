import java.util.Optional;

public class cpz extends cpu {
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
   private final bqn u;
   private final cqe v;
   private final crp w;

   public cpz(int $$0, cmw $$1) {
      this($$0, $$1, new brd(5), new cro(2));
   }

   public cpz(int $$0, cmw $$1, bqn $$2, cqe $$3) {
      super(crb.l, $$0);
      a($$2, 5);
      a($$3, 2);
      this.u = $$2;
      this.v = $$3;
      cwp $$4 = $$1.l.dP().K();
      this.a(new cpz.c($$2, 0, 56, 51));
      this.a(new cpz.c($$2, 1, 79, 58));
      this.a(new cpz.c($$2, 2, 102, 51));
      this.w = this.a(new cpz.b($$4, $$2, 3, 79, 17));
      this.a(new cpz.a($$2, 4, 17, 17));
      this.a($$3);

      for (int $$5 = 0; $$5 < 3; $$5++) {
         for (int $$6 = 0; $$6 < 9; $$6++) {
            this.a(new crp($$1, $$6 + $$5 * 9 + 9, 8 + $$6 * 18, 84 + $$5 * 18));
         }
      }

      for (int $$7 = 0; $$7 < 9; $$7++) {
         this.a(new crp($$1, $$7, 8 + $$7 * 18, 142));
      }
   }

   @Override
   public boolean a(cmx $$0) {
      return this.u.a($$0);
   }

   @Override
   public cup a(cmx $$0, int $$1) {
      cup $$2 = cup.l;
      crp $$3 = this.i.get($$1);
      if ($$3 != null && $$3.h()) {
         cup $$4 = $$3.g();
         $$2 = $$4.s();
         if (($$1 < 0 || $$1 > 2) && $$1 != 3 && $$1 != 4) {
            if (cpz.a.b($$2)) {
               if (this.a($$4, 4, 5, false) || this.w.a($$4) && !this.a($$4, 3, 4, false)) {
                  return cup.l;
               }
            } else if (this.w.a($$4)) {
               if (!this.a($$4, 3, 4, false)) {
                  return cup.l;
               }
            } else if (cpz.c.b($$2)) {
               if (!this.a($$4, 0, 3, false)) {
                  return cup.l;
               }
            } else if ($$1 >= 5 && $$1 < 32) {
               if (!this.a($$4, 32, 41, false)) {
                  return cup.l;
               }
            } else if ($$1 >= 32 && $$1 < 41) {
               if (!this.a($$4, 5, 32, false)) {
                  return cup.l;
               }
            } else if (!this.a($$4, 5, 41, false)) {
               return cup.l;
            }
         } else {
            if (!this.a($$4, 5, 41, true)) {
               return cup.l;
            }

            $$3.b($$4, $$2);
         }

         if ($$4.e()) {
            $$3.e(cup.l);
         } else {
            $$3.b();
         }

         if ($$4.I() == $$2.I()) {
            return cup.l;
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

   static class a extends crp {
      public a(bqn $$0, int $$1, int $$2, int $$3) {
         super($$0, $$1, $$2, $$3);
      }

      @Override
      public boolean a(cup $$0) {
         return b($$0);
      }

      public static boolean b(cup $$0) {
         return $$0.a(cus.so);
      }
   }

   static class b extends crp {
      private final cwp a;

      public b(cwp $$0, bqn $$1, int $$2, int $$3, int $$4) {
         super($$1, $$2, $$3, $$4);
         this.a = $$0;
      }

      @Override
      public boolean a(cup $$0) {
         return this.a.a($$0);
      }
   }

   static class c extends crp {
      public c(bqn $$0, int $$1, int $$2, int $$3) {
         super($$0, $$1, $$2, $$3);
      }

      @Override
      public boolean a(cup $$0) {
         return b($$0);
      }

      @Override
      public int a() {
         return 1;
      }

      @Override
      public void a(cmx $$0, cup $$1) {
         Optional<ji<cwo>> $$2 = $$1.a(km.G, cwq.a).e();
         if ($$2.isPresent() && $$0 instanceof arg $$3) {
            am.l.a($$3, $$2.get());
         }

         super.a($$0, $$1);
      }

      public static boolean b(cup $$0) {
         return $$0.a(cus.sk) || $$0.a(cus.vo) || $$0.a(cus.vr) || $$0.a(cus.sl);
      }
   }
}
