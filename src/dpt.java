import java.util.Arrays;
import javax.annotation.Nullable;

public class dpt extends dpk implements bqt {
   private static final int g = 3;
   private static final int h = 4;
   private static final int[] i = new int[]{3};
   private static final int[] j = new int[]{0, 1, 2, 3};
   private static final int[] k = new int[]{0, 1, 2, 4};
   public static final int b = 20;
   public static final int c = 0;
   public static final int d = 1;
   public static final int e = 2;
   private js<cud> l = js.a(5, cud.l);
   int m;
   private boolean[] q;
   private cty r;
   int s;
   protected final cpt f = new cpt() {
      @Override
      public int a(int $$0) {
         return switch ($$0) {
            case 0 -> dpt.this.m;
            case 1 -> dpt.this.s;
            default -> 0;
         };
      }

      @Override
      public void a(int $$0, int $$1) {
         switch ($$0) {
            case 0:
               dpt.this.m = $$1;
               break;
            case 1:
               dpt.this.s = $$1;
         }
      }

      @Override
      public int a() {
         return 2;
      }
   };

   public dpt(ja $$0, dsl $$1) {
      super(dps.l, $$0, $$1);
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
   protected js<cud> j() {
      return this.l;
   }

   @Override
   protected void a(js<cud> $$0) {
      this.l = $$0;
   }

   public static void a(dcg $$0, ja $$1, dsl $$2, dpt $$3) {
      cud $$4 = $$3.l.get(4);
      if ($$3.s <= 0 && $$4.a(cug.so)) {
         $$3.s = 20;
         $$4.h(1);
         a($$0, $$1, $$2);
      }

      boolean $$5 = a($$0.K(), $$3.l);
      boolean $$6 = $$3.m > 0;
      cud $$7 = $$3.l.get(3);
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
         dsl $$10 = $$2;
         if (!($$2.b() instanceof dfm)) {
            return;
         }

         for (int $$11 = 0; $$11 < dfm.b.length; $$11++) {
            $$10 = $$10.a(dfm.b[$$11], Boolean.valueOf($$9[$$11]));
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

   private static boolean a(cwd $$0, js<cud> $$1) {
      cud $$2 = $$1.get(3);
      if ($$2.e()) {
         return false;
      } else if (!$$0.a($$2)) {
         return false;
      } else {
         for (int $$3 = 0; $$3 < 3; $$3++) {
            cud $$4 = $$1.get($$3);
            if (!$$4.e() && $$0.a($$4, $$2)) {
               return true;
            }
         }

         return false;
      }
   }

   private static void a(dcg $$0, ja $$1, js<cud> $$2) {
      cud $$3 = $$2.get(3);
      cwd $$4 = $$0.K();

      for (int $$5 = 0; $$5 < 3; $$5++) {
         $$2.set($$5, $$4.d($$3, $$2.get($$5)));
      }

      $$3.h(1);
      if ($$3.g().v()) {
         cud $$6 = new cud($$3.g().u());
         if ($$3.e()) {
            $$3 = $$6;
         } else {
            bqd.a($$0, (double)$$1.u(), (double)$$1.v(), (double)$$1.w(), $$6);
         }
      }

      $$2.set(3, $$3);
      $$0.c(1035, $$1, 0);
   }

   @Override
   protected void a(tx $$0, jl.a $$1) {
      super.a($$0, $$1);
      this.l = js.a(this.b(), cud.l);
      bqb.b($$0, this.l, $$1);
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
      bqb.a($$0, this.l, $$1);
      $$0.a("Fuel", (byte)this.s);
   }

   @Override
   public boolean b(int $$0, cud $$1) {
      if ($$0 == 3) {
         cwd $$2 = this.n != null ? this.n.K() : cwd.b;
         return $$2.a($$1);
      } else {
         return $$0 == 4 ? $$1.a(cug.so) : ($$1.a(cug.sk) || $$1.a(cug.vo) || $$1.a(cug.vr) || $$1.a(cug.sl)) && this.a($$0).e();
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
   public boolean a(int $$0, cud $$1, @Nullable jf $$2) {
      return this.b($$0, $$1);
   }

   @Override
   public boolean b(int $$0, cud $$1, jf $$2) {
      return $$0 == 3 ? $$1.a(cug.sl) : true;
   }

   @Override
   protected cpi a(int $$0, cmk $$1) {
      return new cpo($$0, $$1, this, this.f);
   }
}
