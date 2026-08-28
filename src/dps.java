import java.util.Arrays;
import javax.annotation.Nullable;

public class dps extends dpj implements bqs {
   private static final int g = 3;
   private static final int h = 4;
   private static final int[] i = new int[]{3};
   private static final int[] j = new int[]{0, 1, 2, 3};
   private static final int[] k = new int[]{0, 1, 2, 4};
   public static final int b = 20;
   public static final int c = 0;
   public static final int d = 1;
   public static final int e = 2;
   private js<cuc> l = js.a(5, cuc.l);
   int m;
   private boolean[] q;
   private ctx r;
   int s;
   protected final cps f = new cps() {
      @Override
      public int a(int $$0) {
         return switch ($$0) {
            case 0 -> dps.this.m;
            case 1 -> dps.this.s;
            default -> 0;
         };
      }

      @Override
      public void a(int $$0, int $$1) {
         switch ($$0) {
            case 0:
               dps.this.m = $$1;
               break;
            case 1:
               dps.this.s = $$1;
         }
      }

      @Override
      public int a() {
         return 2;
      }
   };

   public dps(ja $$0, dsk $$1) {
      super(dpr.l, $$0, $$1);
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
   protected js<cuc> j() {
      return this.l;
   }

   @Override
   protected void a(js<cuc> $$0) {
      this.l = $$0;
   }

   public static void a(dcf $$0, ja $$1, dsk $$2, dps $$3) {
      cuc $$4 = $$3.l.get(4);
      if ($$3.s <= 0 && $$4.a(cuf.so)) {
         $$3.s = 20;
         $$4.h(1);
         a($$0, $$1, $$2);
      }

      boolean $$5 = a($$0.K(), $$3.l);
      boolean $$6 = $$3.m > 0;
      cuc $$7 = $$3.l.get(3);
      if ($$6) {
         $$3.m--;
         boolean $$8 = $$3.m == 0;
         if ($$8 && $$5) {
            a($$0, $$1, $$3.l);
         } else if (!$$5 || !$$7.a($$3.r)) {
            $$3.m = 0;
         }

         a($$0, $$1, $$2);
      } else if ($$5 && $$3.s > 0) {
         $$3.s--;
         $$3.m = 400;
         $$3.r = $$7.g();
         a($$0, $$1, $$2);
      }

      boolean[] $$9 = $$3.f();
      if (!Arrays.equals($$9, $$3.q)) {
         $$3.q = $$9;
         dsk $$10 = $$2;
         if (!($$2.b() instanceof dfl)) {
            return;
         }

         for (int $$11 = 0; $$11 < dfl.b.length; $$11++) {
            $$10 = $$10.a(dfl.b[$$11], Boolean.valueOf($$9[$$11]));
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

   private static boolean a(cwc $$0, js<cuc> $$1) {
      cuc $$2 = $$1.get(3);
      if ($$2.e()) {
         return false;
      } else if (!$$0.a($$2)) {
         return false;
      } else {
         for (int $$3 = 0; $$3 < 3; $$3++) {
            cuc $$4 = $$1.get($$3);
            if (!$$4.e() && $$0.a($$4, $$2)) {
               return true;
            }
         }

         return false;
      }
   }

   private static void a(dcf $$0, ja $$1, js<cuc> $$2) {
      cuc $$3 = $$2.get(3);
      cwc $$4 = $$0.K();

      for (int $$5 = 0; $$5 < 3; $$5++) {
         $$2.set($$5, $$4.d($$3, $$2.get($$5)));
      }

      $$3.h(1);
      if ($$3.g().v()) {
         cuc $$6 = new cuc($$3.g().u());
         if ($$3.e()) {
            $$3 = $$6;
         } else {
            bqc.a($$0, (double)$$1.u(), (double)$$1.v(), (double)$$1.w(), $$6);
         }
      }

      $$2.set(3, $$3);
      $$0.c(1035, $$1, 0);
   }

   @Override
   protected void a(tx $$0, jl.a $$1) {
      super.a($$0, $$1);
      this.l = js.a(this.b(), cuc.l);
      bqa.b($$0, this.l, $$1);
      this.m = $$0.g("BrewTime");
      if (this.m > 0) {
         this.r = this.l.get(3).g();
      }

      this.s = $$0.f("Fuel");
   }

   @Override
   protected void b(tx $$0, jl.a $$1) {
      super.b($$0, $$1);
      $$0.a("BrewTime", (short)this.m);
      bqa.a($$0, this.l, $$1);
      $$0.a("Fuel", (byte)this.s);
   }

   @Override
   public boolean b(int $$0, cuc $$1) {
      if ($$0 == 3) {
         cwc $$2 = this.n != null ? this.n.K() : cwc.b;
         return $$2.a($$1);
      } else {
         return $$0 == 4 ? $$1.a(cuf.so) : ($$1.a(cuf.sk) || $$1.a(cuf.vo) || $$1.a(cuf.vr) || $$1.a(cuf.sl)) && this.a($$0).e();
      }
   }

   @Override
   public int[] a(jf $$0) {
      if ($$0 == jf.b) {
         return i;
      } else {
         return $$0 == jf.a ? j : k;
      }
   }

   @Override
   public boolean a(int $$0, cuc $$1, @Nullable jf $$2) {
      return this.b($$0, $$1);
   }

   @Override
   public boolean b(int $$0, cuc $$1, jf $$2) {
      return $$0 == 3 ? $$1.a(cuf.sl) : true;
   }

   @Override
   protected cph a(int $$0, cmj $$1) {
      return new cpn($$0, $$1, this, this.f);
   }
}
