import java.util.Arrays;
import javax.annotation.Nullable;

public class dgr extends dgi implements bkg {
   private static final int h = 3;
   private static final int i = 4;
   private static final int[] j = new int[]{3};
   private static final int[] k = new int[]{0, 1, 2, 3};
   private static final int[] l = new int[]{0, 1, 2, 4};
   public static final int c = 20;
   public static final int d = 0;
   public static final int e = 1;
   public static final int f = 2;
   private iq<cmr> m = iq.a(5, cmr.f);
   int n;
   private boolean[] r;
   private cmm s;
   int t;
   protected final cie g = new cie() {
      @Override
      public int a(int $$0) {
         switch ($$0) {
            case 0:
               return dgr.this.n;
            case 1:
               return dgr.this.t;
            default:
               return 0;
         }
      }

      @Override
      public void a(int $$0, int $$1) {
         switch ($$0) {
            case 0:
               dgr.this.n = $$1;
               break;
            case 1:
               dgr.this.t = $$1;
         }
      }

      @Override
      public int a() {
         return 2;
      }
   };

   public dgr(hx $$0, dja $$1) {
      super(dgq.l, $$0, $$1);
   }

   @Override
   protected vd l() {
      return vd.c("container.brewing");
   }

   @Override
   public int b() {
      return this.m.size();
   }

   @Override
   public boolean ai_() {
      for (cmr $$0 : this.m) {
         if (!$$0.b()) {
            return false;
         }
      }

      return true;
   }

   public static void a(cti $$0, hx $$1, dja $$2, dgr $$3) {
      cmr $$4 = $$3.m.get(4);
      if ($$3.t <= 0 && $$4.a(cmu.sl)) {
         $$3.t = 20;
         $$4.h(1);
         a($$0, $$1, $$2);
      }

      boolean $$5 = a($$3.m);
      boolean $$6 = $$3.n > 0;
      cmr $$7 = $$3.m.get(3);
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
         dja $$10 = $$2;
         if (!($$2.b() instanceof cwn)) {
            return;
         }

         for (int $$11 = 0; $$11 < cwn.b.length; $$11++) {
            $$10 = $$10.a(cwn.b[$$11], Boolean.valueOf($$9[$$11]));
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

   private static boolean a(iq<cmr> $$0) {
      cmr $$1 = $$0.get(3);
      if ($$1.b()) {
         return false;
      } else if (!coq.a($$1)) {
         return false;
      } else {
         for (int $$2 = 0; $$2 < 3; $$2++) {
            cmr $$3 = $$0.get($$2);
            if (!$$3.b() && coq.a($$3, $$1)) {
               return true;
            }
         }

         return false;
      }
   }

   private static void a(cti $$0, hx $$1, iq<cmr> $$2) {
      cmr $$3 = $$2.get(3);

      for (int $$4 = 0; $$4 < 3; $$4++) {
         $$2.set($$4, coq.d($$3, $$2.get($$4)));
      }

      $$3.h(1);
      if ($$3.d().t()) {
         cmr $$5 = new cmr($$3.d().s());
         if ($$3.b()) {
            $$3 = $$5;
         } else {
            bjr.a($$0, (double)$$1.u(), (double)$$1.v(), (double)$$1.w(), $$5);
         }
      }

      $$2.set(3, $$3);
      $$0.c(1035, $$1, 0);
   }

   @Override
   public void a(sl $$0) {
      super.a($$0);
      this.m = iq.a(this.b(), cmr.f);
      bjp.b($$0, this.m);
      this.n = $$0.g("BrewTime");
      this.t = $$0.f("Fuel");
   }

   @Override
   protected void b(sl $$0) {
      super.b($$0);
      $$0.a("BrewTime", (short)this.n);
      bjp.a($$0, this.m);
      $$0.a("Fuel", (byte)this.t);
   }

   @Override
   public cmr a(int $$0) {
      return $$0 >= 0 && $$0 < this.m.size() ? this.m.get($$0) : cmr.f;
   }

   @Override
   public cmr a(int $$0, int $$1) {
      return bjp.a(this.m, $$0, $$1);
   }

   @Override
   public cmr b(int $$0) {
      return bjp.a(this.m, $$0);
   }

   @Override
   public void a(int $$0, cmr $$1) {
      if ($$0 >= 0 && $$0 < this.m.size()) {
         this.m.set($$0, $$1);
      }
   }

   @Override
   public boolean a(cfb $$0) {
      return bjo.a(this, $$0);
   }

   @Override
   public boolean b(int $$0, cmr $$1) {
      if ($$0 == 3) {
         return coq.a($$1);
      } else {
         return $$0 == 4 ? $$1.a(cmu.sl) : ($$1.a(cmu.sh) || $$1.a(cmu.vh) || $$1.a(cmu.vk) || $$1.a(cmu.si)) && this.a($$0).b();
      }
   }

   @Override
   public int[] a(ic $$0) {
      if ($$0 == ic.b) {
         return j;
      } else {
         return $$0 == ic.a ? k : l;
      }
   }

   @Override
   public boolean a(int $$0, cmr $$1, @Nullable ic $$2) {
      return this.b($$0, $$1);
   }

   @Override
   public boolean b(int $$0, cmr $$1, ic $$2) {
      return $$0 == 3 ? $$1.a(cmu.si) : true;
   }

   @Override
   public void a() {
      this.m.clear();
   }

   @Override
   protected chu a(int $$0, cfa $$1) {
      return new chz($$0, $$1, this, this.g);
   }
}
