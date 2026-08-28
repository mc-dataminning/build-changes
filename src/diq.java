import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class diq extends dlf implements dhm {
   public static final MapCodec<diq> a = b(diq::new);
   public static final int b = 2;
   public static final dvo c = dve.ar;
   protected static final int d = 4;
   protected static final int e = 5;
   protected static final int f = 2;
   protected static final int g = 6;
   protected static final int h = 7;
   protected static final int i = 3;
   protected static final int j = 8;
   protected static final int k = 9;
   protected static final int l = 4;
   protected static final ezm[] m = new ezm[]{
      dhj.a(11.0, 7.0, 6.0, 15.0, 12.0, 10.0), dhj.a(9.0, 5.0, 5.0, 15.0, 12.0, 11.0), dhj.a(7.0, 3.0, 4.0, 15.0, 12.0, 12.0)
   };
   protected static final ezm[] n = new ezm[]{
      dhj.a(1.0, 7.0, 6.0, 5.0, 12.0, 10.0), dhj.a(1.0, 5.0, 5.0, 7.0, 12.0, 11.0), dhj.a(1.0, 3.0, 4.0, 9.0, 12.0, 12.0)
   };
   protected static final ezm[] o = new ezm[]{
      dhj.a(6.0, 7.0, 1.0, 10.0, 12.0, 5.0), dhj.a(5.0, 5.0, 1.0, 11.0, 12.0, 7.0), dhj.a(4.0, 3.0, 1.0, 12.0, 12.0, 9.0)
   };
   protected static final ezm[] G = new ezm[]{
      dhj.a(6.0, 7.0, 11.0, 10.0, 12.0, 15.0), dhj.a(5.0, 5.0, 9.0, 11.0, 12.0, 15.0), dhj.a(4.0, 3.0, 7.0, 12.0, 12.0, 15.0)
   };

   @Override
   public MapCodec<diq> a() {
      return a;
   }

   public diq(dun.d $$0) {
      super($$0);
      this.l(this.F.b().b(aF, jj.c).b(c, Integer.valueOf(0)));
   }

   @Override
   protected boolean f(duo $$0) {
      return $$0.c(c) < 2;
   }

   @Override
   protected void b(duo $$0, arh $$1, je $$2, azl $$3) {
      if ($$1.z.a(5) == 0) {
         int $$4 = $$0.c(c);
         if ($$4 < 2) {
            $$1.a($$2, $$0.b(c, Integer.valueOf($$4 + 1)), 2);
         }
      }
   }

   @Override
   protected boolean a(duo $$0, dej $$1, je $$2) {
      duo $$3 = $$1.a_($$2.a($$0.c(aF)));
      return $$3.a(awt.A);
   }

   @Override
   protected ezm a(duo $$0, ddl $$1, je $$2, eyx $$3) {
      int $$4 = $$0.c(c);
      switch ((jj)$$0.c(aF)) {
         case d:
            return G[$$4];
         case c:
         default:
            return o[$$4];
         case e:
            return n[$$4];
         case f:
            return m[$$4];
      }
   }

   @Nullable
   @Override
   public duo a(czk $$0) {
      duo $$1 = this.o();
      dej $$2 = $$0.q();
      je $$3 = $$0.a();

      for (jj $$4 : $$0.f()) {
         if ($$4.o().d()) {
            $$1 = $$1.b(aF, $$4);
            if ($$1.a($$2, $$3)) {
               return $$1;
            }
         }
      }

      return null;
   }

   @Override
   protected duo a(duo $$0, jj $$1, duo $$2, deh $$3, je $$4, je $$5) {
      return $$1 == $$0.c(aF) && !$$0.a($$3, $$4) ? dhl.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public boolean b(dej $$0, je $$1, duo $$2) {
      return $$2.c(c) < 2;
   }

   @Override
   public boolean a(deg $$0, azl $$1, je $$2, duo $$3) {
      return true;
   }

   @Override
   public void a(arh $$0, azl $$1, je $$2, duo $$3) {
      $$0.a($$2, $$3.b(c, Integer.valueOf($$3.c(c) + 1)), 2);
   }

   @Override
   protected void a(dup.a<dhj, duo> $$0) {
      $$0.a(aF, c);
   }

   @Override
   protected boolean a(duo $$0, ere $$1) {
      return false;
   }
}
