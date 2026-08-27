import java.util.Arrays;
import javax.annotation.Nullable;

public class dol extends doc implements bqi {
   private static final int g = 3;
   private static final int h = 4;
   private static final int[] i = new int[]{3};
   private static final int[] j = new int[]{0, 1, 2, 3};
   private static final int[] k = new int[]{0, 1, 2, 4};
   public static final int b = 20;
   public static final int c = 0;
   public static final int d = 1;
   public static final int e = 2;
   private jg<ctq> l = jg.a(5, ctq.i);
   int m;
   private boolean[] q;
   private ctl r;
   int s;
   protected final cpf f = new cpf() {
      @Override
      public int a(int $$0) {
         return switch ($$0) {
            case 0 -> dol.this.m;
            case 1 -> dol.this.s;
            default -> 0;
         };
      }

      @Override
      public void a(int $$0, int $$1) {
         switch ($$0) {
            case 0:
               dol.this.m = $$1;
               break;
            case 1:
               dol.this.s = $$1;
         }
      }

      @Override
      public int a() {
         return 2;
      }
   };

   public dol(io $$0, drd $$1) {
      super(dok.l, $$0, $$1);
   }

   @Override
   protected wx k() {
      return wx.c("container.brewing");
   }

   @Override
   public int b() {
      return this.l.size();
   }

   @Override
   protected jg<ctq> j() {
      return this.l;
   }

   @Override
   protected void a(jg<ctq> $$0) {
      this.l = $$0;
   }

   public static void a(daz $$0, io $$1, drd $$2, dol $$3) {
      ctq $$4 = $$3.l.get(4);
      if ($$3.s <= 0 && $$4.a(ctt.so)) {
         $$3.s = 20;
         $$4.h(1);
         a($$0, $$1, $$2);
      }

      boolean $$5 = b($$3.l);
      boolean $$6 = $$3.m > 0;
      ctq $$7 = $$3.l.get(3);
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
         $$3.r = $$7.g();
         a($$0, $$1, $$2);
      }

      boolean[] $$9 = $$3.f();
      if (!Arrays.equals($$9, $$3.q)) {
         $$3.q = $$9;
         drd $$10 = $$2;
         if (!($$2.b() instanceof dee)) {
            return;
         }

         for (int $$11 = 0; $$11 < dee.b.length; $$11++) {
            $$10 = $$10.a(dee.b[$$11], Boolean.valueOf($$9[$$11]));
         }

         $$0.a($$1, $$10, 2);
      }
   }

   private boolean[] f() {
      boolean[] $$0 = new boolean[3];

      for (int $$1 = 0; $$1 < 3; $$1++) {
         if (!this.l.get($$1).e()) {
            $$0[$$1] = true;
         }
      }

      return $$0;
   }

   private static boolean b(jg<ctq> $$0) {
      ctq $$1 = $$0.get(3);
      if ($$1.e()) {
         return false;
      } else if (!cvq.a($$1)) {
         return false;
      } else {
         for (int $$2 = 0; $$2 < 3; $$2++) {
            ctq $$3 = $$0.get($$2);
            if (!$$3.e() && cvq.a($$3, $$1)) {
               return true;
            }
         }

         return false;
      }
   }

   private static void a(daz $$0, io $$1, jg<ctq> $$2) {
      ctq $$3 = $$2.get(3);

      for (int $$4 = 0; $$4 < 3; $$4++) {
         $$2.set($$4, cvq.d($$3, $$2.get($$4)));
      }

      $$3.h(1);
      if ($$3.g().v()) {
         ctq $$5 = new ctq($$3.g().u());
         if ($$3.e()) {
            $$3 = $$5;
         } else {
            bps.a($$0, (double)$$1.u(), (double)$$1.v(), (double)$$1.w(), $$5);
         }
      }

      $$2.set(3, $$3);
      $$0.c(1035, $$1, 0);
   }

   @Override
   protected void a(ud $$0, iz.a $$1) {
      super.a($$0, $$1);
      this.l = jg.a(this.b(), ctq.i);
      bpq.b($$0, this.l, $$1);
      this.m = $$0.g("BrewTime");
      this.s = $$0.f("Fuel");
   }

   @Override
   protected void b(ud $$0, iz.a $$1) {
      super.b($$0, $$1);
      $$0.a("BrewTime", (short)this.m);
      bpq.a($$0, this.l, $$1);
      $$0.a("Fuel", (byte)this.s);
   }

   @Override
   public boolean b(int $$0, ctq $$1) {
      if ($$0 == 3) {
         return cvq.a($$1);
      } else {
         return $$0 == 4 ? $$1.a(ctt.so) : ($$1.a(ctt.sk) || $$1.a(ctt.vo) || $$1.a(ctt.vr) || $$1.a(ctt.sl)) && this.a($$0).e();
      }
   }

   @Override
   public int[] a(it $$0) {
      if ($$0 == it.b) {
         return i;
      } else {
         return $$0 == it.a ? j : k;
      }
   }

   @Override
   public boolean a(int $$0, ctq $$1, @Nullable it $$2) {
      return this.b($$0, $$1);
   }

   @Override
   public boolean b(int $$0, ctq $$1, it $$2) {
      return $$0 == 3 ? $$1.a(ctt.sl) : true;
   }

   @Override
   protected cov a(int $$0, clx $$1) {
      return new cpa($$0, $$1, this, this.f);
   }
}
