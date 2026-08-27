import java.util.Arrays;
import javax.annotation.Nullable;

public class dja extends dir implements bmi {
   private static final int h = 3;
   private static final int i = 4;
   private static final int[] j = new int[]{3};
   private static final int[] k = new int[]{0, 1, 2, 3};
   private static final int[] l = new int[]{0, 1, 2, 4};
   public static final int c = 20;
   public static final int d = 0;
   public static final int e = 1;
   public static final int f = 2;
   private is<cpd> m = is.a(5, cpd.h);
   int n;
   private boolean[] r;
   private coy s;
   int t;
   protected final ckp g = new ckp() {
      @Override
      public int a(int $$0) {
         switch ($$0) {
            case 0:
               return dja.this.n;
            case 1:
               return dja.this.t;
            default:
               return 0;
         }
      }

      @Override
      public void a(int $$0, int $$1) {
         switch ($$0) {
            case 0:
               dja.this.n = $$1;
               break;
            case 1:
               dja.this.t = $$1;
         }
      }

      @Override
      public int a() {
         return 2;
      }
   };

   public dja(hz $$0, dlj $$1) {
      super(diz.l, $$0, $$1);
   }

   @Override
   protected vq l() {
      return vq.c("container.brewing");
   }

   @Override
   public int b() {
      return this.m.size();
   }

   @Override
   public boolean aj_() {
      for (cpd $$0 : this.m) {
         if (!$$0.b()) {
            return false;
         }
      }

      return true;
   }

   public static void a(cvr $$0, hz $$1, dlj $$2, dja $$3) {
      cpd $$4 = $$3.m.get(4);
      if ($$3.t <= 0 && $$4.a(cpg.sn)) {
         $$3.t = 20;
         $$4.h(1);
         a($$0, $$1, $$2);
      }

      boolean $$5 = a($$3.m);
      boolean $$6 = $$3.n > 0;
      cpd $$7 = $$3.m.get(3);
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
         dlj $$10 = $$2;
         if (!($$2.b() instanceof cyw)) {
            return;
         }

         for (int $$11 = 0; $$11 < cyw.b.length; $$11++) {
            $$10 = $$10.a(cyw.b[$$11], Boolean.valueOf($$9[$$11]));
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

   private static boolean a(is<cpd> $$0) {
      cpd $$1 = $$0.get(3);
      if ($$1.b()) {
         return false;
      } else if (!cra.a($$1)) {
         return false;
      } else {
         for (int $$2 = 0; $$2 < 3; $$2++) {
            cpd $$3 = $$0.get($$2);
            if (!$$3.b() && cra.a($$3, $$1)) {
               return true;
            }
         }

         return false;
      }
   }

   private static void a(cvr $$0, hz $$1, is<cpd> $$2) {
      cpd $$3 = $$2.get(3);

      for (int $$4 = 0; $$4 < 3; $$4++) {
         $$2.set($$4, cra.d($$3, $$2.get($$4)));
      }

      $$3.h(1);
      if ($$3.d().s()) {
         cpd $$5 = new cpd($$3.d().r());
         if ($$3.b()) {
            $$3 = $$5;
         } else {
            bls.a($$0, (double)$$1.u(), (double)$$1.v(), (double)$$1.w(), $$5);
         }
      }

      $$2.set(3, $$3);
      $$0.c(1035, $$1, 0);
   }

   @Override
   public void a(sw $$0) {
      super.a($$0);
      this.m = is.a(this.b(), cpd.h);
      blq.b($$0, this.m);
      this.n = $$0.g("BrewTime");
      this.t = $$0.f("Fuel");
   }

   @Override
   protected void b(sw $$0) {
      super.b($$0);
      $$0.a("BrewTime", (short)this.n);
      blq.a($$0, this.m);
      $$0.a("Fuel", (byte)this.t);
   }

   @Override
   public cpd a(int $$0) {
      return $$0 >= 0 && $$0 < this.m.size() ? this.m.get($$0) : cpd.h;
   }

   @Override
   public cpd a(int $$0, int $$1) {
      return blq.a(this.m, $$0, $$1);
   }

   @Override
   public cpd b(int $$0) {
      return blq.a(this.m, $$0);
   }

   @Override
   public void a(int $$0, cpd $$1) {
      if ($$0 >= 0 && $$0 < this.m.size()) {
         this.m.set($$0, $$1);
      }
   }

   @Override
   public boolean a(chl $$0) {
      return blp.a(this, $$0);
   }

   @Override
   public boolean b(int $$0, cpd $$1) {
      if ($$0 == 3) {
         return cra.a($$1);
      } else {
         return $$0 == 4 ? $$1.a(cpg.sn) : ($$1.a(cpg.sj) || $$1.a(cpg.vk) || $$1.a(cpg.vn) || $$1.a(cpg.sk)) && this.a($$0).b();
      }
   }

   @Override
   public int[] a(ie $$0) {
      if ($$0 == ie.b) {
         return j;
      } else {
         return $$0 == ie.a ? k : l;
      }
   }

   @Override
   public boolean a(int $$0, cpd $$1, @Nullable ie $$2) {
      return this.b($$0, $$1);
   }

   @Override
   public boolean b(int $$0, cpd $$1, ie $$2) {
      return $$0 == 3 ? $$1.a(cpg.sk) : true;
   }

   @Override
   public void a() {
      this.m.clear();
   }

   @Override
   protected ckf a(int $$0, chk $$1) {
      return new ckk($$0, $$1, this, this.g);
   }
}
