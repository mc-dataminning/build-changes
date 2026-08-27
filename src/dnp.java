import java.util.Arrays;
import javax.annotation.Nullable;

public class dnp extends dng implements bpy {
   private static final int g = 3;
   private static final int h = 4;
   private static final int[] i = new int[]{3};
   private static final int[] j = new int[]{0, 1, 2, 3};
   private static final int[] k = new int[]{0, 1, 2, 4};
   public static final int b = 20;
   public static final int c = 0;
   public static final int d = 1;
   public static final int e = 2;
   private jf<csz> l = jf.a(5, csz.i);
   int m;
   private boolean[] q;
   private csu r;
   int s;
   protected final coo f = new coo() {
      @Override
      public int a(int $$0) {
         return switch ($$0) {
            case 0 -> dnp.this.m;
            case 1 -> dnp.this.s;
            default -> 0;
         };
      }

      @Override
      public void a(int $$0, int $$1) {
         switch ($$0) {
            case 0:
               dnp.this.m = $$1;
               break;
            case 1:
               dnp.this.s = $$1;
         }
      }

      @Override
      public int a() {
         return 2;
      }
   };

   public dnp(in $$0, dqh $$1) {
      super(dno.l, $$0, $$1);
   }

   @Override
   protected wu k() {
      return wu.c("container.brewing");
   }

   @Override
   public int b() {
      return this.l.size();
   }

   @Override
   protected jf<csz> j() {
      return this.l;
   }

   @Override
   protected void a(jf<csz> $$0) {
      this.l = $$0;
   }

   public static void a(dad $$0, in $$1, dqh $$2, dnp $$3) {
      csz $$4 = $$3.l.get(4);
      if ($$3.s <= 0 && $$4.a(ctc.so)) {
         $$3.s = 20;
         $$4.h(1);
         a($$0, $$1, $$2);
      }

      boolean $$5 = b($$3.l);
      boolean $$6 = $$3.m > 0;
      csz $$7 = $$3.l.get(3);
      if ($$6) {
         $$3.m--;
         boolean $$8 = $$3.m == 0;
         if ($$8 && $$5) {
            a($$0, $$1, $$3.l);
            a($$0, $$1, $$2);
         } else if (!$$5 || !$$7.a($$3.r)) {
            $$3.m = 0;
            a($$0, $$1, $$2);
         }
      } else if ($$5 && $$3.s > 0) {
         $$3.s--;
         $$3.m = 400;
         $$3.r = $$7.f();
         a($$0, $$1, $$2);
      }

      boolean[] $$9 = $$3.f();
      if (!Arrays.equals($$9, $$3.q)) {
         $$3.q = $$9;
         dqh $$10 = $$2;
         if (!($$2.b() instanceof ddi)) {
            return;
         }

         for (int $$11 = 0; $$11 < ddi.b.length; $$11++) {
            $$10 = $$10.a(ddi.b[$$11], Boolean.valueOf($$9[$$11]));
         }

         $$0.a($$1, $$10, 2);
      }
   }

   private boolean[] f() {
      boolean[] $$0 = new boolean[3];

      for (int $$1 = 0; $$1 < 3; $$1++) {
         if (!this.l.get($$1).d()) {
            $$0[$$1] = true;
         }
      }

      return $$0;
   }

   private static boolean b(jf<csz> $$0) {
      csz $$1 = $$0.get(3);
      if ($$1.d()) {
         return false;
      } else if (!cux.a($$1)) {
         return false;
      } else {
         for (int $$2 = 0; $$2 < 3; $$2++) {
            csz $$3 = $$0.get($$2);
            if (!$$3.d() && cux.a($$3, $$1)) {
               return true;
            }
         }

         return false;
      }
   }

   private static void a(dad $$0, in $$1, jf<csz> $$2) {
      csz $$3 = $$2.get(3);

      for (int $$4 = 0; $$4 < 3; $$4++) {
         $$2.set($$4, cux.d($$3, $$2.get($$4)));
      }

      $$3.h(1);
      if ($$3.f().u()) {
         csz $$5 = new csz($$3.f().t());
         if ($$3.d()) {
            $$3 = $$5;
         } else {
            bpi.a($$0, (double)$$1.u(), (double)$$1.v(), (double)$$1.w(), $$5);
         }
      }

      $$2.set(3, $$3);
      $$0.c(1035, $$1, 0);
   }

   @Override
   public void a(ua $$0, iy.a $$1) {
      super.a($$0, $$1);
      this.l = jf.a(this.b(), csz.i);
      bpg.b($$0, this.l, $$1);
      this.m = $$0.g("BrewTime");
      this.s = $$0.f("Fuel");
   }

   @Override
   protected void b(ua $$0, iy.a $$1) {
      super.b($$0, $$1);
      $$0.a("BrewTime", (short)this.m);
      bpg.a($$0, this.l, $$1);
      $$0.a("Fuel", (byte)this.s);
   }

   @Override
   public boolean b(int $$0, csz $$1) {
      if ($$0 == 3) {
         return cux.a($$1);
      } else {
         return $$0 == 4 ? $$1.a(ctc.so) : ($$1.a(ctc.sk) || $$1.a(ctc.vo) || $$1.a(ctc.vr) || $$1.a(ctc.sl)) && this.a($$0).d();
      }
   }

   @Override
   public int[] a(is $$0) {
      if ($$0 == is.b) {
         return i;
      } else {
         return $$0 == is.a ? j : k;
      }
   }

   @Override
   public boolean a(int $$0, csz $$1, @Nullable is $$2) {
      return this.b($$0, $$1);
   }

   @Override
   public boolean b(int $$0, csz $$1, is $$2) {
      return $$0 == 3 ? $$1.a(ctc.sl) : true;
   }

   @Override
   protected cod a(int $$0, clg $$1) {
      return new coi($$0, $$1, this, this.f);
   }
}
