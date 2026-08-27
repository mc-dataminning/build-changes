import java.util.Arrays;
import javax.annotation.Nullable;

public class dng extends dmx implements bpc {
   private static final int h = 3;
   private static final int i = 4;
   private static final int[] j = new int[]{3};
   private static final int[] k = new int[]{0, 1, 2, 3};
   private static final int[] l = new int[]{0, 1, 2, 4};
   public static final int c = 20;
   public static final int d = 0;
   public static final int e = 1;
   public static final int f = 2;
   private je<csd> m = je.a(5, csd.i);
   int n;
   private boolean[] r;
   private cry s;
   int t;
   protected final cnr g = new cnr() {
      @Override
      public int a(int $$0) {
         return switch ($$0) {
            case 0 -> dng.this.n;
            case 1 -> dng.this.t;
            default -> 0;
         };
      }

      @Override
      public void a(int $$0, int $$1) {
         switch ($$0) {
            case 0:
               dng.this.n = $$1;
               break;
            case 1:
               dng.this.t = $$1;
         }
      }

      @Override
      public int a() {
         return 2;
      }
   };

   public dng(im $$0, dpy $$1) {
      super(dnf.l, $$0, $$1);
   }

   @Override
   protected ws k() {
      return ws.c("container.brewing");
   }

   @Override
   public int b() {
      return this.m.size();
   }

   @Override
   protected je<csd> j() {
      return this.m;
   }

   @Override
   protected void a(je<csd> $$0) {
      this.m = $$0;
   }

   public static void a(czu $$0, im $$1, dpy $$2, dng $$3) {
      csd $$4 = $$3.m.get(4);
      if ($$3.t <= 0 && $$4.a(csg.so)) {
         $$3.t = 20;
         $$4.g(1);
         a($$0, $$1, $$2);
      }

      boolean $$5 = b($$3.m);
      boolean $$6 = $$3.n > 0;
      csd $$7 = $$3.m.get(3);
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
         $$3.s = $$7.f();
         a($$0, $$1, $$2);
      }

      boolean[] $$9 = $$3.f();
      if (!Arrays.equals($$9, $$3.r)) {
         $$3.r = $$9;
         dpy $$10 = $$2;
         if (!($$2.b() instanceof dcz)) {
            return;
         }

         for (int $$11 = 0; $$11 < dcz.b.length; $$11++) {
            $$10 = $$10.a(dcz.b[$$11], Boolean.valueOf($$9[$$11]));
         }

         $$0.a($$1, $$10, 2);
      }
   }

   private boolean[] f() {
      boolean[] $$0 = new boolean[3];

      for (int $$1 = 0; $$1 < 3; $$1++) {
         if (!this.m.get($$1).d()) {
            $$0[$$1] = true;
         }
      }

      return $$0;
   }

   private static boolean b(je<csd> $$0) {
      csd $$1 = $$0.get(3);
      if ($$1.d()) {
         return false;
      } else if (!cub.a($$1)) {
         return false;
      } else {
         for (int $$2 = 0; $$2 < 3; $$2++) {
            csd $$3 = $$0.get($$2);
            if (!$$3.d() && cub.a($$3, $$1)) {
               return true;
            }
         }

         return false;
      }
   }

   private static void a(czu $$0, im $$1, je<csd> $$2) {
      csd $$3 = $$2.get(3);

      for (int $$4 = 0; $$4 < 3; $$4++) {
         $$2.set($$4, cub.d($$3, $$2.get($$4)));
      }

      $$3.g(1);
      if ($$3.f().w()) {
         csd $$5 = new csd($$3.f().v());
         if ($$3.d()) {
            $$3 = $$5;
         } else {
            bom.a($$0, (double)$$1.u(), (double)$$1.v(), (double)$$1.w(), $$5);
         }
      }

      $$2.set(3, $$3);
      $$0.c(1035, $$1, 0);
   }

   @Override
   public void a(ty $$0, ix.a $$1) {
      super.a($$0, $$1);
      this.m = je.a(this.b(), csd.i);
      bok.b($$0, this.m, $$1);
      this.n = $$0.g("BrewTime");
      this.t = $$0.f("Fuel");
   }

   @Override
   protected void b(ty $$0, ix.a $$1) {
      super.b($$0, $$1);
      $$0.a("BrewTime", (short)this.n);
      bok.a($$0, this.m, $$1);
      $$0.a("Fuel", (byte)this.t);
   }

   @Override
   public boolean b(int $$0, csd $$1) {
      if ($$0 == 3) {
         return cub.a($$1);
      } else {
         return $$0 == 4 ? $$1.a(csg.so) : ($$1.a(csg.sk) || $$1.a(csg.vo) || $$1.a(csg.vr) || $$1.a(csg.sl)) && this.a($$0).d();
      }
   }

   @Override
   public int[] a(ir $$0) {
      if ($$0 == ir.b) {
         return j;
      } else {
         return $$0 == ir.a ? k : l;
      }
   }

   @Override
   public boolean a(int $$0, csd $$1, @Nullable ir $$2) {
      return this.b($$0, $$1);
   }

   @Override
   public boolean b(int $$0, csd $$1, ir $$2) {
      return $$0 == 3 ? $$1.a(csg.sl) : true;
   }

   @Override
   protected cnh a(int $$0, ckk $$1) {
      return new cnm($$0, $$1, this, this.g);
   }
}
