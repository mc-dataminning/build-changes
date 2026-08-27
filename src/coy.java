import java.util.Optional;

public class coy extends cot {
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
   private final bpn u;
   private final cpd v;
   private final cqo w;

   public coy(int $$0, clv $$1) {
      this($$0, $$1, new bqd(5), new cqn(2));
   }

   public coy(int $$0, clv $$1, bpn $$2, cpd $$3) {
      super(cqa.l, $$0);
      a($$2, 5);
      a($$3, 2);
      this.u = $$2;
      this.v = $$3;
      this.a(new coy.c($$2, 0, 56, 51));
      this.a(new coy.c($$2, 1, 79, 58));
      this.a(new coy.c($$2, 2, 102, 51));
      this.w = this.a(new coy.b($$2, 3, 79, 17));
      this.a(new coy.a($$2, 4, 17, 17));
      this.a($$3);

      for (int $$4 = 0; $$4 < 3; $$4++) {
         for (int $$5 = 0; $$5 < 9; $$5++) {
            this.a(new cqo($$1, $$5 + $$4 * 9 + 9, 8 + $$5 * 18, 84 + $$4 * 18));
         }
      }

      for (int $$6 = 0; $$6 < 9; $$6++) {
         this.a(new cqo($$1, $$6, 8 + $$6 * 18, 142));
      }
   }

   @Override
   public boolean a(clw $$0) {
      return this.u.a($$0);
   }

   @Override
   public cto a(clw $$0, int $$1) {
      cto $$2 = cto.i;
      cqo $$3 = this.i.get($$1);
      if ($$3 != null && $$3.h()) {
         cto $$4 = $$3.g();
         $$2 = $$4.s();
         if (($$1 < 0 || $$1 > 2) && $$1 != 3 && $$1 != 4) {
            if (coy.a.b($$2)) {
               if (this.a($$4, 4, 5, false) || this.w.a($$4) && !this.a($$4, 3, 4, false)) {
                  return cto.i;
               }
            } else if (this.w.a($$4)) {
               if (!this.a($$4, 3, 4, false)) {
                  return cto.i;
               }
            } else if (coy.c.b($$2) && $$2.I() == 1) {
               if (!this.a($$4, 0, 3, false)) {
                  return cto.i;
               }
            } else if ($$1 >= 5 && $$1 < 32) {
               if (!this.a($$4, 32, 41, false)) {
                  return cto.i;
               }
            } else if ($$1 >= 32 && $$1 < 41) {
               if (!this.a($$4, 5, 32, false)) {
                  return cto.i;
               }
            } else if (!this.a($$4, 5, 41, false)) {
               return cto.i;
            }
         } else {
            if (!this.a($$4, 5, 41, true)) {
               return cto.i;
            }

            $$3.b($$4, $$2);
         }

         if ($$4.e()) {
            $$3.e(cto.i);
         } else {
            $$3.b();
         }

         if ($$4.I() == $$2.I()) {
            return cto.i;
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

   static class a extends cqo {
      public a(bpn $$0, int $$1, int $$2, int $$3) {
         super($$0, $$1, $$2, $$3);
      }

      @Override
      public boolean a(cto $$0) {
         return b($$0);
      }

      public static boolean b(cto $$0) {
         return $$0.a(ctr.so);
      }

      @Override
      public int a() {
         return 64;
      }
   }

   static class b extends cqo {
      public b(bpn $$0, int $$1, int $$2, int $$3) {
         super($$0, $$1, $$2, $$3);
      }

      @Override
      public boolean a(cto $$0) {
         return cvo.a($$0);
      }

      @Override
      public int a() {
         return 64;
      }
   }

   static class c extends cqo {
      public c(bpn $$0, int $$1, int $$2, int $$3) {
         super($$0, $$1, $$2, $$3);
      }

      @Override
      public boolean a(cto $$0) {
         return b($$0);
      }

      @Override
      public int a() {
         return 1;
      }

      @Override
      public void a(clw $$0, cto $$1) {
         Optional<ix<cvn>> $$2 = $$1.a(kb.F, cvp.a).f();
         if ($$2.isPresent() && $$0 instanceof aqn $$3) {
            am.l.a($$3, $$2.get());
         }

         super.a($$0, $$1);
      }

      public static boolean b(cto $$0) {
         return $$0.a(ctr.sk) || $$0.a(ctr.vo) || $$0.a(ctr.vr) || $$0.a(ctr.sl);
      }
   }
}
