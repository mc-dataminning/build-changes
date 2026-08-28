import java.util.Optional;

public class cpk extends cpe {
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
   private final bpw u;
   private final cpp v;
   private final cra w;

   public cpk(int $$0, cmg $$1) {
      this($$0, $$1, new bqm(5), new cqz(2));
   }

   public cpk(int $$0, cmg $$1, bpw $$2, cpp $$3) {
      super(cqm.l, $$0);
      a($$2, 5);
      a($$3, 2);
      this.u = $$2;
      this.v = $$3;
      cwa $$4 = $$1.l.dP().K();
      this.a(new cpk.c($$2, 0, 56, 51));
      this.a(new cpk.c($$2, 1, 79, 58));
      this.a(new cpk.c($$2, 2, 102, 51));
      this.w = this.a(new cpk.b($$4, $$2, 3, 79, 17));
      this.a(new cpk.a($$2, 4, 17, 17));
      this.a($$3);

      for (int $$5 = 0; $$5 < 3; $$5++) {
         for (int $$6 = 0; $$6 < 9; $$6++) {
            this.a(new cra($$1, $$6 + $$5 * 9 + 9, 8 + $$6 * 18, 84 + $$5 * 18));
         }
      }

      for (int $$7 = 0; $$7 < 9; $$7++) {
         this.a(new cra($$1, $$7, 8 + $$7 * 18, 142));
      }
   }

   @Override
   public boolean b(cmh $$0) {
      return this.u.a($$0);
   }

   @Override
   public cua b(cmh $$0, int $$1) {
      cua $$2 = cua.l;
      cra $$3 = this.i.get($$1);
      if ($$3 != null && $$3.h()) {
         cua $$4 = $$3.g();
         $$2 = $$4.s();
         if (($$1 < 0 || $$1 > 2) && $$1 != 3 && $$1 != 4) {
            if (cpk.a.b($$2)) {
               if (this.a($$4, 4, 5, false) || this.w.a($$4) && !this.a($$4, 3, 4, false)) {
                  return cua.l;
               }
            } else if (this.w.a($$4)) {
               if (!this.a($$4, 3, 4, false)) {
                  return cua.l;
               }
            } else if (cpk.c.b($$2)) {
               if (!this.a($$4, 0, 3, false)) {
                  return cua.l;
               }
            } else if ($$1 >= 5 && $$1 < 32) {
               if (!this.a($$4, 32, 41, false)) {
                  return cua.l;
               }
            } else if ($$1 >= 32 && $$1 < 41) {
               if (!this.a($$4, 5, 32, false)) {
                  return cua.l;
               }
            } else if (!this.a($$4, 5, 41, false)) {
               return cua.l;
            }
         } else {
            if (!this.a($$4, 5, 41, true)) {
               return cua.l;
            }

            $$3.b($$4, $$2);
         }

         if ($$4.e()) {
            $$3.e(cua.l);
         } else {
            $$3.c();
         }

         if ($$4.H() == $$2.H()) {
            return cua.l;
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

   static class a extends cra {
      public a(bpw $$0, int $$1, int $$2, int $$3) {
         super($$0, $$1, $$2, $$3);
      }

      @Override
      public boolean a(cua $$0) {
         return b($$0);
      }

      public static boolean b(cua $$0) {
         return $$0.a(cud.so);
      }
   }

   static class b extends cra {
      private final cwa a;

      public b(cwa $$0, bpw $$1, int $$2, int $$3, int $$4) {
         super($$1, $$2, $$3, $$4);
         this.a = $$0;
      }

      @Override
      public boolean a(cua $$0) {
         return this.a.a($$0);
      }
   }

   static class c extends cra {
      public c(bpw $$0, int $$1, int $$2, int $$3) {
         super($$0, $$1, $$2, $$3);
      }

      @Override
      public boolean a(cua $$0) {
         return b($$0);
      }

      @Override
      public int a() {
         return 1;
      }

      @Override
      public void a(cmh $$0, cua $$1) {
         Optional<jj<cvz>> $$2 = $$1.a(kn.G, cwb.a).e();
         if ($$2.isPresent() && $$0 instanceof aql $$3) {
            am.l.a($$3, $$2.get());
         }

         super.a($$0, $$1);
      }

      public static boolean b(cua $$0) {
         return $$0.a(cud.sk) || $$0.a(cud.vo) || $$0.a(cud.vr) || $$0.a(cud.sl);
      }
   }
}
