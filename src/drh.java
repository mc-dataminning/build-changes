import java.util.Arrays;
import javax.annotation.Nullable;

public class drh extends dqy implements bru {
   private static final int g = 3;
   private static final int h = 4;
   private static final int[] i = new int[]{3};
   private static final int[] j = new int[]{0, 1, 2, 3};
   private static final int[] k = new int[]{0, 1, 2, 4};
   public static final int b = 20;
   public static final int c = 0;
   public static final int d = 1;
   public static final int e = 2;
   private jw<cvl> l = jw.a(5, cvl.k);
   int m;
   private boolean[] n;
   private cvg r;
   int s;
   protected final crc f = new crc() {
      @Override
      public int a(int $$0) {
         return switch ($$0) {
            case 0 -> drh.this.m;
            case 1 -> drh.this.s;
            default -> 0;
         };
      }

      @Override
      public void a(int $$0, int $$1) {
         switch ($$0) {
            case 0:
               drh.this.m = $$1;
               break;
            case 1:
               drh.this.s = $$1;
         }
      }

      @Override
      public int a() {
         return 2;
      }
   };

   public drh(je $$0, dua $$1) {
      super(drg.l, $$0, $$1);
   }

   @Override
   protected xd j() {
      return xd.c("container.brewing");
   }

   @Override
   public int b() {
      return this.l.size();
   }

   @Override
   protected jw<cvl> f() {
      return this.l;
   }

   @Override
   protected void a(jw<cvl> $$0) {
      this.l = $$0;
   }

   public static void a(dds $$0, je $$1, dua $$2, drh $$3) {
      cvl $$4 = $$3.l.get(4);
      if ($$3.s <= 0 && $$4.a(cvo.sp)) {
         $$3.s = 20;
         $$4.h(1);
         a($$0, $$1, $$2);
      }

      boolean $$5 = a($$0.K(), $$3.l);
      boolean $$6 = $$3.m > 0;
      cvl $$7 = $$3.l.get(3);
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
         $$3.r = $$7.h();
         a($$0, $$1, $$2);
      }

      boolean[] $$9 = $$3.k();
      if (!Arrays.equals($$9, $$3.n)) {
         $$3.n = $$9;
         dua $$10 = $$2;
         if (!($$2.b() instanceof dgz)) {
            return;
         }

         for (int $$11 = 0; $$11 < dgz.b.length; $$11++) {
            $$10 = $$10.b(dgz.b[$$11], Boolean.valueOf($$9[$$11]));
         }

         $$0.a($$1, $$10, 2);
      }
   }

   private boolean[] k() {
      boolean[] $$0 = new boolean[3];

      for (int $$1 = 0; $$1 < 3; $$1++) {
         if (!this.l.get($$1).f()) {
            $$0[$$1] = true;
         }
      }

      return $$0;
   }

   private static boolean a(cxm $$0, jw<cvl> $$1) {
      cvl $$2 = $$1.get(3);
      if ($$2.f()) {
         return false;
      } else if (!$$0.a($$2)) {
         return false;
      } else {
         for (int $$3 = 0; $$3 < 3; $$3++) {
            cvl $$4 = $$1.get($$3);
            if (!$$4.f() && $$0.a($$4, $$2)) {
               return true;
            }
         }

         return false;
      }
   }

   private static void a(dds $$0, je $$1, jw<cvl> $$2) {
      cvl $$3 = $$2.get(3);
      cxm $$4 = $$0.K();

      for (int $$5 = 0; $$5 < 3; $$5++) {
         $$2.set($$5, $$4.d($$3, $$2.get($$5)));
      }

      $$3.h(1);
      if ($$3.h().v()) {
         cvl $$6 = new cvl($$3.h().u());
         if ($$3.f()) {
            $$3 = $$6;
         } else {
            brg.a($$0, (double)$$1.u(), (double)$$1.v(), (double)$$1.w(), $$6);
         }
      }

      $$2.set(3, $$3);
      $$0.c(1035, $$1, 0);
   }

   @Override
   protected void a(uf $$0, jp.a $$1) {
      super.a($$0, $$1);
      this.l = jw.a(this.b(), cvl.k);
      bre.b($$0, this.l, $$1);
      this.m = $$0.g("BrewTime");
      if (this.m > 0) {
         this.r = this.l.get(3).h();
      }

      this.s = $$0.f("Fuel");
   }

   @Override
   protected void b(uf $$0, jp.a $$1) {
      super.b($$0, $$1);
      $$0.a("BrewTime", (short)this.m);
      bre.a($$0, this.l, $$1);
      $$0.a("Fuel", (byte)this.s);
   }

   @Override
   public boolean b(int $$0, cvl $$1) {
      if ($$0 == 3) {
         cxm $$2 = this.o != null ? this.o.K() : cxm.b;
         return $$2.a($$1);
      } else {
         return $$0 == 4 ? $$1.a(cvo.sp) : ($$1.a(cvo.sl) || $$1.a(cvo.vq) || $$1.a(cvo.vt) || $$1.a(cvo.sm)) && this.a($$0).f();
      }
   }

   @Override
   public int[] a(jj $$0) {
      if ($$0 == jj.b) {
         return i;
      } else {
         return $$0 == jj.a ? j : k;
      }
   }

   @Override
   public boolean a(int $$0, cvl $$1, @Nullable jj $$2) {
      return this.b($$0, $$1);
   }

   @Override
   public boolean b(int $$0, cvl $$1, jj $$2) {
      return $$0 == 3 ? $$1.a(cvo.sm) : true;
   }

   @Override
   protected cqq a(int $$0, cno $$1) {
      return new cqx($$0, $$1, this, this.f);
   }
}
