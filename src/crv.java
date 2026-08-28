import java.util.Optional;

public class crv extends cro {
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
   private final brw w;
   private final csa x;
   private final ctl y;

   public crv(int $$0, col $$1) {
      this($$0, $$1, new bsk(5), new ctk(2));
   }

   public crv(int $$0, col $$1, brw $$2, csa $$3) {
      super(csx.l, $$0);
      a($$2, 5);
      a($$3, 2);
      this.w = $$2;
      this.x = $$3;
      cxz $$4 = $$1.k.dX().K();
      this.a(new crv.c($$2, 0, 56, 51));
      this.a(new crv.c($$2, 1, 79, 58));
      this.a(new crv.c($$2, 2, 102, 51));
      this.y = this.a(new crv.b($$4, $$2, 3, 79, 17));
      this.a(new crv.a($$2, 4, 17, 17));
      this.a($$3);
      this.c($$1, 8, 84);
   }

   @Override
   public boolean b(com $$0) {
      return this.w.a($$0);
   }

   @Override
   public cwb b(com $$0, int $$1) {
      cwb $$2 = cwb.k;
      ctl $$3 = this.k.get($$1);
      if ($$3 != null && $$3.h()) {
         cwb $$4 = $$3.g();
         $$2 = $$4.v();
         if (($$1 < 0 || $$1 > 2) && $$1 != 3 && $$1 != 4) {
            if (crv.a.b($$2)) {
               if (this.a($$4, 4, 5, false) || this.y.a($$4) && !this.a($$4, 3, 4, false)) {
                  return cwb.k;
               }
            } else if (this.y.a($$4)) {
               if (!this.a($$4, 3, 4, false)) {
                  return cwb.k;
               }
            } else if (crv.c.b($$2)) {
               if (!this.a($$4, 0, 3, false)) {
                  return cwb.k;
               }
            } else if ($$1 >= 5 && $$1 < 32) {
               if (!this.a($$4, 32, 41, false)) {
                  return cwb.k;
               }
            } else if ($$1 >= 32 && $$1 < 41) {
               if (!this.a($$4, 5, 32, false)) {
                  return cwb.k;
               }
            } else if (!this.a($$4, 5, 41, false)) {
               return cwb.k;
            }
         } else {
            if (!this.a($$4, 5, 41, true)) {
               return cwb.k;
            }

            $$3.b($$4, $$2);
         }

         if ($$4.f()) {
            $$3.e(cwb.k);
         } else {
            $$3.c();
         }

         if ($$4.L() == $$2.L()) {
            return cwb.k;
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

   static class a extends ctl {
      public a(brw $$0, int $$1, int $$2, int $$3) {
         super($$0, $$1, $$2, $$3);
      }

      @Override
      public boolean a(cwb $$0) {
         return b($$0);
      }

      public static boolean b(cwb $$0) {
         return $$0.a(axj.Y);
      }
   }

   static class b extends ctl {
      private final cxz a;

      public b(cxz $$0, brw $$1, int $$2, int $$3, int $$4) {
         super($$1, $$2, $$3, $$4);
         this.a = $$0;
      }

      @Override
      public boolean a(cwb $$0) {
         return this.a.a($$0);
      }
   }

   static class c extends ctl {
      public c(brw $$0, int $$1, int $$2, int $$3) {
         super($$0, $$1, $$2, $$3);
      }

      @Override
      public boolean a(cwb $$0) {
         return b($$0);
      }

      @Override
      public int a() {
         return 1;
      }

      @Override
      public void a(com $$0, cwb $$1) {
         Optional<jq<cxy>> $$2 = $$1.a(ku.Q, cya.a).e();
         if ($$2.isPresent() && $$0 instanceof aro $$3) {
            ao.l.a($$3, $$2.get());
         }

         super.a($$0, $$1);
      }

      public static boolean b(cwb $$0) {
         return $$0.a(cwf.sm) || $$0.a(cwf.vq) || $$0.a(cwf.vt) || $$0.a(cwf.sl);
      }
   }
}
