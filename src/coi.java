import java.util.Optional;

public class coi extends cod {
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
   private final bpf u;
   private final coo v;
   private final cpz w;

   public coi(int $$0, clg $$1) {
      this($$0, $$1, new bpv(5), new cpy(2));
   }

   public coi(int $$0, clg $$1, bpf $$2, coo $$3) {
      super(cpl.l, $$0);
      a($$2, 5);
      a($$3, 2);
      this.u = $$2;
      this.v = $$3;
      this.a(new coi.c($$2, 0, 56, 51));
      this.a(new coi.c($$2, 1, 79, 58));
      this.a(new coi.c($$2, 2, 102, 51));
      this.w = this.a(new coi.b($$2, 3, 79, 17));
      this.a(new coi.a($$2, 4, 17, 17));
      this.a($$3);

      for (int $$4 = 0; $$4 < 3; $$4++) {
         for (int $$5 = 0; $$5 < 9; $$5++) {
            this.a(new cpz($$1, $$5 + $$4 * 9 + 9, 8 + $$5 * 18, 84 + $$4 * 18));
         }
      }

      for (int $$6 = 0; $$6 < 9; $$6++) {
         this.a(new cpz($$1, $$6, 8 + $$6 * 18, 142));
      }
   }

   @Override
   public boolean a(clh $$0) {
      return this.u.a($$0);
   }

   @Override
   public csz a(clh $$0, int $$1) {
      csz $$2 = csz.i;
      cpz $$3 = this.i.get($$1);
      if ($$3 != null && $$3.h()) {
         csz $$4 = $$3.g();
         $$2 = $$4.r();
         if (($$1 < 0 || $$1 > 2) && $$1 != 3 && $$1 != 4) {
            if (coi.a.b($$2)) {
               if (this.a($$4, 4, 5, false) || this.w.a($$4) && !this.a($$4, 3, 4, false)) {
                  return csz.i;
               }
            } else if (this.w.a($$4)) {
               if (!this.a($$4, 3, 4, false)) {
                  return csz.i;
               }
            } else if (coi.c.b($$2) && $$2.G() == 1) {
               if (!this.a($$4, 0, 3, false)) {
                  return csz.i;
               }
            } else if ($$1 >= 5 && $$1 < 32) {
               if (!this.a($$4, 32, 41, false)) {
                  return csz.i;
               }
            } else if ($$1 >= 32 && $$1 < 41) {
               if (!this.a($$4, 5, 32, false)) {
                  return csz.i;
               }
            } else if (!this.a($$4, 5, 41, false)) {
               return csz.i;
            }
         } else {
            if (!this.a($$4, 5, 41, true)) {
               return csz.i;
            }

            $$3.b($$4, $$2);
         }

         if ($$4.d()) {
            $$3.e(csz.i);
         } else {
            $$3.b();
         }

         if ($$4.G() == $$2.G()) {
            return csz.i;
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

   static class a extends cpz {
      public a(bpf $$0, int $$1, int $$2, int $$3) {
         super($$0, $$1, $$2, $$3);
      }

      @Override
      public boolean a(csz $$0) {
         return b($$0);
      }

      public static boolean b(csz $$0) {
         return $$0.a(ctc.so);
      }

      @Override
      public int a() {
         return 64;
      }
   }

   static class b extends cpz {
      public b(bpf $$0, int $$1, int $$2, int $$3) {
         super($$0, $$1, $$2, $$3);
      }

      @Override
      public boolean a(csz $$0) {
         return cux.a($$0);
      }

      @Override
      public int a() {
         return 64;
      }
   }

   static class c extends cpz {
      public c(bpf $$0, int $$1, int $$2, int $$3) {
         super($$0, $$1, $$2, $$3);
      }

      @Override
      public boolean a(csz $$0) {
         return b($$0);
      }

      @Override
      public int a() {
         return 1;
      }

      @Override
      public void a(clh $$0, csz $$1) {
         Optional<iw<cuw>> $$2 = $$1.a(ka.E, cuy.a).f();
         if ($$2.isPresent() && $$0 instanceof aqi $$3) {
            am.l.a($$3, $$2.get());
         }

         super.a($$0, $$1);
      }

      public static boolean b(csz $$0) {
         return $$0.a(ctc.sk) || $$0.a(ctc.vo) || $$0.a(ctc.vr) || $$0.a(ctc.sl);
      }
   }
}
