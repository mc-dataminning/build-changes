import java.util.Optional;

public class cmu extends cmp {
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
   private final bnt u;
   private final cmz v;
   private final cok w;

   public cmu(int $$0, cjs $$1) {
      this($$0, $$1, new boj(5), new coj(2));
   }

   public cmu(int $$0, cjs $$1, bnt $$2, cmz $$3) {
      super(cnw.l, $$0);
      a($$2, 5);
      a($$3, 2);
      this.u = $$2;
      this.v = $$3;
      this.a(new cmu.c($$2, 0, 56, 51));
      this.a(new cmu.c($$2, 1, 79, 58));
      this.a(new cmu.c($$2, 2, 102, 51));
      this.w = this.a(new cmu.b($$2, 3, 79, 17));
      this.a(new cmu.a($$2, 4, 17, 17));
      this.a($$3);

      for (int $$4 = 0; $$4 < 3; $$4++) {
         for (int $$5 = 0; $$5 < 9; $$5++) {
            this.a(new cok($$1, $$5 + $$4 * 9 + 9, 8 + $$5 * 18, 84 + $$4 * 18));
         }
      }

      for (int $$6 = 0; $$6 < 9; $$6++) {
         this.a(new cok($$1, $$6, 8 + $$6 * 18, 142));
      }
   }

   @Override
   public boolean a(cjt $$0) {
      return this.u.a($$0);
   }

   @Override
   public crj a(cjt $$0, int $$1) {
      crj $$2 = crj.i;
      cok $$3 = this.i.get($$1);
      if ($$3 != null && $$3.h()) {
         crj $$4 = $$3.g();
         $$2 = $$4.r();
         if (($$1 < 0 || $$1 > 2) && $$1 != 3 && $$1 != 4) {
            if (cmu.a.b($$2)) {
               if (this.a($$4, 4, 5, false) || this.w.a($$4) && !this.a($$4, 3, 4, false)) {
                  return crj.i;
               }
            } else if (this.w.a($$4)) {
               if (!this.a($$4, 3, 4, false)) {
                  return crj.i;
               }
            } else if (cmu.c.b($$2) && $$2.G() == 1) {
               if (!this.a($$4, 0, 3, false)) {
                  return crj.i;
               }
            } else if ($$1 >= 5 && $$1 < 32) {
               if (!this.a($$4, 32, 41, false)) {
                  return crj.i;
               }
            } else if ($$1 >= 32 && $$1 < 41) {
               if (!this.a($$4, 5, 32, false)) {
                  return crj.i;
               }
            } else if (!this.a($$4, 5, 41, false)) {
               return crj.i;
            }
         } else {
            if (!this.a($$4, 5, 41, true)) {
               return crj.i;
            }

            $$3.b($$4, $$2);
         }

         if ($$4.d()) {
            $$3.e(crj.i);
         } else {
            $$3.b();
         }

         if ($$4.G() == $$2.G()) {
            return crj.i;
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

   static class a extends cok {
      public a(bnt $$0, int $$1, int $$2, int $$3) {
         super($$0, $$1, $$2, $$3);
      }

      @Override
      public boolean a(crj $$0) {
         return b($$0);
      }

      public static boolean b(crj $$0) {
         return $$0.a(crm.sn);
      }

      @Override
      public int a() {
         return 64;
      }
   }

   static class b extends cok {
      public b(bnt $$0, int $$1, int $$2, int $$3) {
         super($$0, $$1, $$2, $$3);
      }

      @Override
      public boolean a(crj $$0) {
         return ctg.a($$0);
      }

      @Override
      public int a() {
         return 64;
      }
   }

   static class c extends cok {
      public c(bnt $$0, int $$1, int $$2, int $$3) {
         super($$0, $$1, $$2, $$3);
      }

      @Override
      public boolean a(crj $$0) {
         return b($$0);
      }

      @Override
      public int a() {
         return 1;
      }

      @Override
      public void a(cjt $$0, crj $$1) {
         Optional<il<ctf>> $$2 = $$1.a(jp.x, cth.a).f();
         if ($$2.isPresent() && $$0 instanceof apt $$3) {
            am.l.a($$3, $$2.get());
         }

         super.a($$0, $$1);
      }

      public static boolean b(crj $$0) {
         return $$0.a(crm.sj) || $$0.a(crm.vm) || $$0.a(crm.vp) || $$0.a(crm.sk);
      }
   }
}
