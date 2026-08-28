import java.util.Optional;

public class cpn extends cph {
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
   private final bpz u;
   private final cps v;
   private final crd w;

   public cpn(int $$0, cmj $$1) {
      this($$0, $$1, new bqp(5), new crc(2));
   }

   public cpn(int $$0, cmj $$1, bpz $$2, cps $$3) {
      super(cqp.l, $$0);
      a($$2, 5);
      a($$3, 2);
      this.u = $$2;
      this.v = $$3;
      cwc $$4 = $$1.l.dQ().K();
      this.a(new cpn.c($$2, 0, 56, 51));
      this.a(new cpn.c($$2, 1, 79, 58));
      this.a(new cpn.c($$2, 2, 102, 51));
      this.w = this.a(new cpn.b($$4, $$2, 3, 79, 17));
      this.a(new cpn.a($$2, 4, 17, 17));
      this.a($$3);

      for (int $$5 = 0; $$5 < 3; $$5++) {
         for (int $$6 = 0; $$6 < 9; $$6++) {
            this.a(new crd($$1, $$6 + $$5 * 9 + 9, 8 + $$6 * 18, 84 + $$5 * 18));
         }
      }

      for (int $$7 = 0; $$7 < 9; $$7++) {
         this.a(new crd($$1, $$7, 8 + $$7 * 18, 142));
      }
   }

   @Override
   public boolean b(cmk $$0) {
      return this.u.a($$0);
   }

   @Override
   public cuc b(cmk $$0, int $$1) {
      cuc $$2 = cuc.l;
      crd $$3 = this.i.get($$1);
      if ($$3 != null && $$3.h()) {
         cuc $$4 = $$3.g();
         $$2 = $$4.s();
         if (($$1 < 0 || $$1 > 2) && $$1 != 3 && $$1 != 4) {
            if (cpn.a.b($$2)) {
               if (this.a($$4, 4, 5, false) || this.w.a($$4) && !this.a($$4, 3, 4, false)) {
                  return cuc.l;
               }
            } else if (this.w.a($$4)) {
               if (!this.a($$4, 3, 4, false)) {
                  return cuc.l;
               }
            } else if (cpn.c.b($$2)) {
               if (!this.a($$4, 0, 3, false)) {
                  return cuc.l;
               }
            } else if ($$1 >= 5 && $$1 < 32) {
               if (!this.a($$4, 32, 41, false)) {
                  return cuc.l;
               }
            } else if ($$1 >= 32 && $$1 < 41) {
               if (!this.a($$4, 5, 32, false)) {
                  return cuc.l;
               }
            } else if (!this.a($$4, 5, 41, false)) {
               return cuc.l;
            }
         } else {
            if (!this.a($$4, 5, 41, true)) {
               return cuc.l;
            }

            $$3.b($$4, $$2);
         }

         if ($$4.e()) {
            $$3.e(cuc.l);
         } else {
            $$3.c();
         }

         if ($$4.H() == $$2.H()) {
            return cuc.l;
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

   static class a extends crd {
      public a(bpz $$0, int $$1, int $$2, int $$3) {
         super($$0, $$1, $$2, $$3);
      }

      @Override
      public boolean a(cuc $$0) {
         return b($$0);
      }

      public static boolean b(cuc $$0) {
         return $$0.a(cuf.so);
      }
   }

   static class b extends crd {
      private final cwc a;

      public b(cwc $$0, bpz $$1, int $$2, int $$3, int $$4) {
         super($$1, $$2, $$3, $$4);
         this.a = $$0;
      }

      @Override
      public boolean a(cuc $$0) {
         return this.a.a($$0);
      }
   }

   static class c extends crd {
      public c(bpz $$0, int $$1, int $$2, int $$3) {
         super($$0, $$1, $$2, $$3);
      }

      @Override
      public boolean a(cuc $$0) {
         return b($$0);
      }

      @Override
      public int a() {
         return 1;
      }

      @Override
      public void a(cmk $$0, cuc $$1) {
         Optional<jj<cwb>> $$2 = $$1.a(kn.G, cwd.a).e();
         if ($$2.isPresent() && $$0 instanceof aqn $$3) {
            am.l.a($$3, $$2.get());
         }

         super.a($$0, $$1);
      }

      public static boolean b(cuc $$0) {
         return $$0.a(cuf.sk) || $$0.a(cuf.vo) || $$0.a(cuf.vr) || $$0.a(cuf.sl);
      }
   }
}
