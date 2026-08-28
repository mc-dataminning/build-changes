import java.util.Optional;

public class cpo extends cpi {
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
   private final bqa u;
   private final cpt v;
   private final cre w;

   public cpo(int $$0, cmk $$1) {
      this($$0, $$1, new bqq(5), new crd(2));
   }

   public cpo(int $$0, cmk $$1, bqa $$2, cpt $$3) {
      super(cqq.l, $$0);
      a($$2, 5);
      a($$3, 2);
      this.u = $$2;
      this.v = $$3;
      cwd $$4 = $$1.l.dR().K();
      this.a(new cpo.c($$2, 0, 56, 51));
      this.a(new cpo.c($$2, 1, 79, 58));
      this.a(new cpo.c($$2, 2, 102, 51));
      this.w = this.a(new cpo.b($$4, $$2, 3, 79, 17));
      this.a(new cpo.a($$2, 4, 17, 17));
      this.a($$3);

      for (int $$5 = 0; $$5 < 3; $$5++) {
         for (int $$6 = 0; $$6 < 9; $$6++) {
            this.a(new cre($$1, $$6 + $$5 * 9 + 9, 8 + $$6 * 18, 84 + $$5 * 18));
         }
      }

      for (int $$7 = 0; $$7 < 9; $$7++) {
         this.a(new cre($$1, $$7, 8 + $$7 * 18, 142));
      }
   }

   @Override
   public boolean b(cml $$0) {
      return this.u.a($$0);
   }

   @Override
   public cud b(cml $$0, int $$1) {
      cud $$2 = cud.l;
      cre $$3 = this.i.get($$1);
      if ($$3 != null && $$3.h()) {
         cud $$4 = $$3.g();
         $$2 = $$4.s();
         if (($$1 < 0 || $$1 > 2) && $$1 != 3 && $$1 != 4) {
            if (cpo.a.b($$2)) {
               if (this.a($$4, 4, 5, false) || this.w.a($$4) && !this.a($$4, 3, 4, false)) {
                  return cud.l;
               }
            } else if (this.w.a($$4)) {
               if (!this.a($$4, 3, 4, false)) {
                  return cud.l;
               }
            } else if (cpo.c.b($$2)) {
               if (!this.a($$4, 0, 3, false)) {
                  return cud.l;
               }
            } else if ($$1 >= 5 && $$1 < 32) {
               if (!this.a($$4, 32, 41, false)) {
                  return cud.l;
               }
            } else if ($$1 >= 32 && $$1 < 41) {
               if (!this.a($$4, 5, 32, false)) {
                  return cud.l;
               }
            } else if (!this.a($$4, 5, 41, false)) {
               return cud.l;
            }
         } else {
            if (!this.a($$4, 5, 41, true)) {
               return cud.l;
            }

            $$3.b($$4, $$2);
         }

         if ($$4.e()) {
            $$3.e(cud.l);
         } else {
            $$3.c();
         }

         if ($$4.H() == $$2.H()) {
            return cud.l;
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
      public a(bqa $$0, int $$1, int $$2, int $$3) {
         super($$0, $$1, $$2, $$3);
      }

      @Override
      public boolean a(cud $$0) {
         return b($$0);
      }

      public static boolean b(cud $$0) {
         return $$0.a(cug.so);
      }
   }

   static class b extends cre {
      private final cwd a;

      public b(cwd $$0, bqa $$1, int $$2, int $$3, int $$4) {
         super($$1, $$2, $$3, $$4);
         this.a = $$0;
      }

      @Override
      public boolean a(cud $$0) {
         return this.a.a($$0);
      }
   }

   static class c extends cre {
      public c(bqa $$0, int $$1, int $$2, int $$3) {
         super($$0, $$1, $$2, $$3);
      }

      @Override
      public boolean a(cud $$0) {
         return b($$0);
      }

      @Override
      public int a() {
         return 1;
      }

      @Override
      public void a(cml $$0, cud $$1) {
         Optional<jj<cwc>> $$2 = $$1.a(kn.G, cwe.a).e();
         if ($$2.isPresent() && $$0 instanceof aqn $$3) {
            am.l.a($$3, $$2.get());
         }

         super.a($$0, $$1);
      }

      public static boolean b(cud $$0) {
         return $$0.a(cug.sk) || $$0.a(cug.vo) || $$0.a(cug.vr) || $$0.a(cug.sl);
      }
   }
}
