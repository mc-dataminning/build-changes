import java.util.Optional;

public class cnm extends cnh {
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
   private final boj u;
   private final cnr v;
   private final cpd w;

   public cnm(int $$0, ckk $$1) {
      this($$0, $$1, new boz(5), new cpc(2));
   }

   public cnm(int $$0, ckk $$1, boj $$2, cnr $$3) {
      super(cop.l, $$0);
      a($$2, 5);
      a($$3, 2);
      this.u = $$2;
      this.v = $$3;
      this.a(new cnm.c($$2, 0, 56, 51));
      this.a(new cnm.c($$2, 1, 79, 58));
      this.a(new cnm.c($$2, 2, 102, 51));
      this.w = this.a(new cnm.b($$2, 3, 79, 17));
      this.a(new cnm.a($$2, 4, 17, 17));
      this.a($$3);

      for (int $$4 = 0; $$4 < 3; $$4++) {
         for (int $$5 = 0; $$5 < 9; $$5++) {
            this.a(new cpd($$1, $$5 + $$4 * 9 + 9, 8 + $$5 * 18, 84 + $$4 * 18));
         }
      }

      for (int $$6 = 0; $$6 < 9; $$6++) {
         this.a(new cpd($$1, $$6, 8 + $$6 * 18, 142));
      }
   }

   @Override
   public boolean a(ckl $$0) {
      return this.u.a($$0);
   }

   @Override
   public csd a(ckl $$0, int $$1) {
      csd $$2 = csd.i;
      cpd $$3 = this.i.get($$1);
      if ($$3 != null && $$3.h()) {
         csd $$4 = $$3.g();
         $$2 = $$4.r();
         if (($$1 < 0 || $$1 > 2) && $$1 != 3 && $$1 != 4) {
            if (cnm.a.b($$2)) {
               if (this.a($$4, 4, 5, false) || this.w.a($$4) && !this.a($$4, 3, 4, false)) {
                  return csd.i;
               }
            } else if (this.w.a($$4)) {
               if (!this.a($$4, 3, 4, false)) {
                  return csd.i;
               }
            } else if (cnm.c.b($$2) && $$2.G() == 1) {
               if (!this.a($$4, 0, 3, false)) {
                  return csd.i;
               }
            } else if ($$1 >= 5 && $$1 < 32) {
               if (!this.a($$4, 32, 41, false)) {
                  return csd.i;
               }
            } else if ($$1 >= 32 && $$1 < 41) {
               if (!this.a($$4, 5, 32, false)) {
                  return csd.i;
               }
            } else if (!this.a($$4, 5, 41, false)) {
               return csd.i;
            }
         } else {
            if (!this.a($$4, 5, 41, true)) {
               return csd.i;
            }

            $$3.b($$4, $$2);
         }

         if ($$4.d()) {
            $$3.e(csd.i);
         } else {
            $$3.b();
         }

         if ($$4.G() == $$2.G()) {
            return csd.i;
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

   static class a extends cpd {
      public a(boj $$0, int $$1, int $$2, int $$3) {
         super($$0, $$1, $$2, $$3);
      }

      @Override
      public boolean a(csd $$0) {
         return b($$0);
      }

      public static boolean b(csd $$0) {
         return $$0.a(csg.so);
      }

      @Override
      public int a() {
         return 64;
      }
   }

   static class b extends cpd {
      public b(boj $$0, int $$1, int $$2, int $$3) {
         super($$0, $$1, $$2, $$3);
      }

      @Override
      public boolean a(csd $$0) {
         return cub.a($$0);
      }

      @Override
      public int a() {
         return 64;
      }
   }

   static class c extends cpd {
      public c(boj $$0, int $$1, int $$2, int $$3) {
         super($$0, $$1, $$2, $$3);
      }

      @Override
      public boolean a(csd $$0) {
         return b($$0);
      }

      @Override
      public int a() {
         return 1;
      }

      @Override
      public void a(ckl $$0, csd $$1) {
         Optional<iv<cua>> $$2 = $$1.a(jz.x, cuc.a).f();
         if ($$2.isPresent() && $$0 instanceof aqf $$3) {
            am.l.a($$3, $$2.get());
         }

         super.a($$0, $$1);
      }

      public static boolean b(csd $$0) {
         return $$0.a(csg.sk) || $$0.a(csg.vo) || $$0.a(csg.vr) || $$0.a(csg.sl);
      }
   }
}
