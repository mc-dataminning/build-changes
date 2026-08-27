import java.util.Arrays;
import javax.annotation.Nullable;

public class dkj extends dka implements bno {
   private static final int h = 3;
   private static final int i = 4;
   private static final int[] j = new int[]{3};
   private static final int[] k = new int[]{0, 1, 2, 3};
   private static final int[] l = new int[]{0, 1, 2, 4};
   public static final int c = 20;
   public static final int d = 0;
   public static final int e = 1;
   public static final int f = 2;
   private iu<cqk> m = iu.a(5, cqk.h);
   int n;
   private boolean[] r;
   private cqf s;
   int t;
   protected final cly g = new cly() {
      @Override
      public int a(int $$0) {
         switch ($$0) {
            case 0:
               return dkj.this.n;
            case 1:
               return dkj.this.t;
            default:
               return 0;
         }
      }

      @Override
      public void a(int $$0, int $$1) {
         switch ($$0) {
            case 0:
               dkj.this.n = $$1;
               break;
            case 1:
               dkj.this.t = $$1;
         }
      }

      @Override
      public int a() {
         return 2;
      }
   };

   public dkj(ib $$0, dmz $$1) {
      super(dki.l, $$0, $$1);
   }

   @Override
   protected vu k() {
      return vu.c("container.brewing");
   }

   @Override
   public int b() {
      return this.m.size();
   }

   @Override
   public boolean ai_() {
      for (cqk $$0 : this.m) {
         if (!$$0.b()) {
            return false;
         }
      }

      return true;
   }

   public static void a(cwz $$0, ib $$1, dmz $$2, dkj $$3) {
      cqk $$4 = $$3.m.get(4);
      if ($$3.t <= 0 && $$4.a(cqn.sn)) {
         $$3.t = 20;
         $$4.h(1);
         a($$0, $$1, $$2);
      }

      boolean $$5 = a($$3.m);
      boolean $$6 = $$3.n > 0;
      cqk $$7 = $$3.m.get(3);
      if ($$6) {
         $$3.n--;
         boolean $$8 = $$3.n == 0;
         if ($$8 && $$5) {
            a($$0, $$1, $$3.m);
            a($$0, $$1, $$2);
         } else if (!$$5 || !$$7.a($$3.s)) {
            $$3.n = 0;
            a($$0, $$1, $$2);
         }
      } else if ($$5 && $$3.t > 0) {
         $$3.t--;
         $$3.n = 400;
         $$3.s = $$7.d();
         a($$0, $$1, $$2);
      }

      boolean[] $$9 = $$3.f();
      if (!Arrays.equals($$9, $$3.r)) {
         $$3.r = $$9;
         dmz $$10 = $$2;
         if (!($$2.b() instanceof dae)) {
            return;
         }

         for (int $$11 = 0; $$11 < dae.b.length; $$11++) {
            $$10 = $$10.a(dae.b[$$11], Boolean.valueOf($$9[$$11]));
         }

         $$0.a($$1, $$10, 2);
      }
   }

   private boolean[] f() {
      boolean[] $$0 = new boolean[3];

      for (int $$1 = 0; $$1 < 3; $$1++) {
         if (!this.m.get($$1).b()) {
            $$0[$$1] = true;
         }
      }

      return $$0;
   }

   private static boolean a(iu<cqk> $$0) {
      cqk $$1 = $$0.get(3);
      if ($$1.b()) {
         return false;
      } else if (!csi.a($$1)) {
         return false;
      } else {
         for (int $$2 = 0; $$2 < 3; $$2++) {
            cqk $$3 = $$0.get($$2);
            if (!$$3.b() && csi.a($$3, $$1)) {
               return true;
            }
         }

         return false;
      }
   }

   private static void a(cwz $$0, ib $$1, iu<cqk> $$2) {
      cqk $$3 = $$2.get(3);

      for (int $$4 = 0; $$4 < 3; $$4++) {
         $$2.set($$4, csi.d($$3, $$2.get($$4)));
      }

      $$3.h(1);
      if ($$3.d().u()) {
         cqk $$5 = new cqk($$3.d().t());
         if ($$3.b()) {
            $$3 = $$5;
         } else {
            bmy.a($$0, (double)$$1.u(), (double)$$1.v(), (double)$$1.w(), $$5);
         }
      }

      $$2.set(3, $$3);
      $$0.c(1035, $$1, 0);
   }

   @Override
   public void a(ta $$0, in.a $$1) {
      super.a($$0, $$1);
      this.m = iu.a(this.b(), cqk.h);
      bmw.b($$0, this.m);
      this.n = $$0.g("BrewTime");
      this.t = $$0.f("Fuel");
   }

   @Override
   protected void b(ta $$0, in.a $$1) {
      super.b($$0, $$1);
      $$0.a("BrewTime", (short)this.n);
      bmw.a($$0, this.m);
      $$0.a("Fuel", (byte)this.t);
   }

   @Override
   public cqk a(int $$0) {
      return $$0 >= 0 && $$0 < this.m.size() ? this.m.get($$0) : cqk.h;
   }

   @Override
   public cqk a(int $$0, int $$1) {
      return bmw.a(this.m, $$0, $$1);
   }

   @Override
   public cqk b(int $$0) {
      return bmw.a(this.m, $$0);
   }

   @Override
   public void a(int $$0, cqk $$1) {
      if ($$0 >= 0 && $$0 < this.m.size()) {
         this.m.set($$0, $$1);
      }
   }

   @Override
   public boolean a(cis $$0) {
      return bmv.a(this, $$0);
   }

   @Override
   public boolean b(int $$0, cqk $$1) {
      if ($$0 == 3) {
         return csi.a($$1);
      } else {
         return $$0 == 4 ? $$1.a(cqn.sn) : ($$1.a(cqn.sj) || $$1.a(cqn.vl) || $$1.a(cqn.vo) || $$1.a(cqn.sk)) && this.a($$0).b();
      }
   }

   @Override
   public int[] a(ih $$0) {
      if ($$0 == ih.b) {
         return j;
      } else {
         return $$0 == ih.a ? k : l;
      }
   }

   @Override
   public boolean a(int $$0, cqk $$1, @Nullable ih $$2) {
      return this.b($$0, $$1);
   }

   @Override
   public boolean b(int $$0, cqk $$1, ih $$2) {
      return $$0 == 3 ? $$1.a(cqn.sk) : true;
   }

   @Override
   public void a() {
      this.m.clear();
   }

   @Override
   protected clo a(int $$0, cir $$1) {
      return new clt($$0, $$1, this, this.g);
   }
}
