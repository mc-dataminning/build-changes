import java.util.Arrays;
import javax.annotation.Nullable;

public class czq extends czh implements beg {
   private static final int h = 3;
   private static final int i = 4;
   private static final int[] j = new int[]{3};
   private static final int[] k = new int[]{0, 1, 2, 3};
   private static final int[] l = new int[]{0, 1, 2, 4};
   public static final int c = 20;
   public static final int d = 0;
   public static final int e = 1;
   public static final int f = 2;
   private hn<cfz> m = hn.a(5, cfz.b);
   int n;
   private boolean[] r;
   private cfu s;
   int t;
   protected final cbp g = new cbp() {
      @Override
      public int a(int $$0) {
         switch ($$0) {
            case 0:
               return czq.this.n;
            case 1:
               return czq.this.t;
            default:
               return 0;
         }
      }

      @Override
      public void a(int $$0, int $$1) {
         switch ($$0) {
            case 0:
               czq.this.n = $$1;
               break;
            case 1:
               czq.this.t = $$1;
         }
      }

      @Override
      public int a() {
         return 2;
      }
   };

   public czq(gu $$0, dcb $$1) {
      super(czp.l, $$0, $$1);
   }

   @Override
   protected sw g() {
      return sw.c("container.brewing");
   }

   @Override
   public int b() {
      return this.m.size();
   }

   @Override
   public boolean ab_() {
      for (cfz $$0 : this.m) {
         if (!$$0.b()) {
            return false;
         }
      }

      return true;
   }

   public static void a(cmm $$0, gu $$1, dcb $$2, czq $$3) {
      cfz $$4 = $$3.m.get(4);
      if ($$3.t <= 0 && $$4.a(cgc.rz)) {
         $$3.t = 20;
         $$4.h(1);
         a($$0, $$1, $$2);
      }

      boolean $$5 = a($$3.m);
      boolean $$6 = $$3.n > 0;
      cfz $$7 = $$3.m.get(3);
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
         dcb $$10 = $$2;
         if (!($$2.b() instanceof cpq)) {
            return;
         }

         for (int $$11 = 0; $$11 < cpq.a.length; $$11++) {
            $$10 = $$10.a(cpq.a[$$11], Boolean.valueOf($$9[$$11]));
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

   private static boolean a(hn<cfz> $$0) {
      cfz $$1 = $$0.get(3);
      if ($$1.b()) {
         return false;
      } else if (!chx.a($$1)) {
         return false;
      } else {
         for (int $$2 = 0; $$2 < 3; $$2++) {
            cfz $$3 = $$0.get($$2);
            if (!$$3.b() && chx.a($$3, $$1)) {
               return true;
            }
         }

         return false;
      }
   }

   private static void a(cmm $$0, gu $$1, hn<cfz> $$2) {
      cfz $$3 = $$2.get(3);

      for (int $$4 = 0; $$4 < 3; $$4++) {
         $$2.set($$4, chx.d($$3, $$2.get($$4)));
      }

      $$3.h(1);
      if ($$3.d().t()) {
         cfz $$5 = new cfz($$3.d().s());
         if ($$3.b()) {
            $$3 = $$5;
         } else {
            bdt.a($$0, (double)$$1.u(), (double)$$1.v(), (double)$$1.w(), $$5);
         }
      }

      $$2.set(3, $$3);
      $$0.c(1035, $$1, 0);
   }

   @Override
   public void a(qr $$0) {
      super.a($$0);
      this.m = hn.a(this.b(), cfz.b);
      bdr.b($$0, this.m);
      this.n = $$0.g("BrewTime");
      this.t = $$0.f("Fuel");
   }

   @Override
   protected void b(qr $$0) {
      super.b($$0);
      $$0.a("BrewTime", (short)this.n);
      bdr.a($$0, this.m);
      $$0.a("Fuel", (byte)this.t);
   }

   @Override
   public cfz a(int $$0) {
      return $$0 >= 0 && $$0 < this.m.size() ? this.m.get($$0) : cfz.b;
   }

   @Override
   public cfz a(int $$0, int $$1) {
      return bdr.a(this.m, $$0, $$1);
   }

   @Override
   public cfz b(int $$0) {
      return bdr.a(this.m, $$0);
   }

   @Override
   public void a(int $$0, cfz $$1) {
      if ($$0 >= 0 && $$0 < this.m.size()) {
         this.m.set($$0, $$1);
      }
   }

   @Override
   public boolean a(byo $$0) {
      return bdq.a(this, $$0);
   }

   @Override
   public boolean b(int $$0, cfz $$1) {
      if ($$0 == 3) {
         return chx.a($$1);
      } else {
         return $$0 == 4 ? $$1.a(cgc.rz) : ($$1.a(cgc.rv) || $$1.a(cgc.uu) || $$1.a(cgc.ux) || $$1.a(cgc.rw)) && this.a($$0).b();
      }
   }

   @Override
   public int[] a(ha $$0) {
      if ($$0 == ha.b) {
         return j;
      } else {
         return $$0 == ha.a ? k : l;
      }
   }

   @Override
   public boolean a(int $$0, cfz $$1, @Nullable ha $$2) {
      return this.b($$0, $$1);
   }

   @Override
   public boolean b(int $$0, cfz $$1, ha $$2) {
      return $$0 == 3 ? $$1.a(cgc.rw) : true;
   }

   @Override
   public void a() {
      this.m.clear();
   }

   @Override
   protected cbf a(int $$0, byn $$1) {
      return new cbk($$0, $$1, this, this.g);
   }
}
