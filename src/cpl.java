import java.util.Optional;

public class cpl extends cpg {
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
   private final bpt u;
   private final cpq v;
   private final cre w;

   public cpl(int $$0, clx $$1) {
      this($$0, $$1, new bqj(5), new crd(2));
   }

   public cpl(int $$0, clx $$1, bpt $$2, cpq $$3) {
      super(cqo.l, $$0);
      a($$2, 5);
      a($$3, 2);
      this.u = $$2;
      this.v = $$3;
      this.a(new cpl.c($$2, 0, 56, 51));
      this.a(new cpl.c($$2, 1, 79, 58));
      this.a(new cpl.c($$2, 2, 102, 51));
      this.w = this.a(new cpl.b($$2, 3, 79, 17));
      this.a(new cpl.a($$2, 4, 17, 17));
      this.a($$3);

      for (int $$4 = 0; $$4 < 3; $$4++) {
         for (int $$5 = 0; $$5 < 9; $$5++) {
            this.a(new cre($$1, $$5 + $$4 * 9 + 9, 8 + $$5 * 18, 84 + $$4 * 18));
         }
      }

      for (int $$6 = 0; $$6 < 9; $$6++) {
         this.a(new cre($$1, $$6, 8 + $$6 * 18, 142));
      }
   }

   @Override
   public boolean a(cly $$0) {
      return this.u.a($$0);
   }

   @Override
   public cuh a(cly $$0, int $$1) {
      cuh $$2 = cuh.i;
      cre $$3 = this.i.get($$1);
      if ($$3 != null && $$3.h()) {
         cuh $$4 = $$3.g();
         $$2 = $$4.r();
         if (($$1 < 0 || $$1 > 2) && $$1 != 3 && $$1 != 4) {
            if (cpl.a.b($$2)) {
               if (this.a($$4, 4, 5, false) || this.w.a($$4) && !this.a($$4, 3, 4, false)) {
                  return cuh.i;
               }
            } else if (this.w.a($$4)) {
               if (!this.a($$4, 3, 4, false)) {
                  return cuh.i;
               }
            } else if (cpl.c.b($$2) && $$2.G() == 1) {
               if (!this.a($$4, 0, 3, false)) {
                  return cuh.i;
               }
            } else if ($$1 >= 5 && $$1 < 32) {
               if (!this.a($$4, 32, 41, false)) {
                  return cuh.i;
               }
            } else if ($$1 >= 32 && $$1 < 41) {
               if (!this.a($$4, 5, 32, false)) {
                  return cuh.i;
               }
            } else if (!this.a($$4, 5, 41, false)) {
               return cuh.i;
            }
         } else {
            if (!this.a($$4, 5, 41, true)) {
               return cuh.i;
            }

            $$3.b($$4, $$2);
         }

         if ($$4.d()) {
            $$3.e(cuh.i);
         } else {
            $$3.b();
         }

         if ($$4.G() == $$2.G()) {
            return cuh.i;
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

   static class a extends cre {
      public a(bpt $$0, int $$1, int $$2, int $$3) {
         super($$0, $$1, $$2, $$3);
      }

      @Override
      public boolean a(cuh $$0) {
         return b($$0);
      }

      public static boolean b(cuh $$0) {
         return $$0.a(cuk.tL);
      }

      @Override
      public int a() {
         return 64;
      }
   }

   static class b extends cre {
      public b(bpt $$0, int $$1, int $$2, int $$3) {
         super($$0, $$1, $$2, $$3);
      }

      @Override
      public boolean a(cuh $$0) {
         return cwq.a($$0);
      }

      @Override
      public int a() {
         return 64;
      }
   }

   static class c extends cre {
      public c(bpt $$0, int $$1, int $$2, int $$3) {
         super($$0, $$1, $$2, $$3);
      }

      @Override
      public boolean a(cuh $$0) {
         return b($$0);
      }

      @Override
      public int a() {
         return 1;
      }

      @Override
      public void a(cly $$0, cuh $$1) {
         Optional<ja<cwp>> $$2 = $$1.a(ke.E, cwr.a).f();
         if ($$2.isPresent() && $$0 instanceof aqu $$3) {
            an.l.a($$3, $$2.get());
         }

         super.a($$0, $$1);
      }

      public static boolean b(cuh $$0) {
         return $$0.a(cuk.tH) || $$0.a(cuk.wZ) || $$0.a(cuk.xc) || $$0.a(cuk.tI);
      }
   }
}
