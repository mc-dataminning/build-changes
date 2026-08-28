import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dit extends dli implements dhp {
   public static final MapCodec<dit> a = b(dit::new);
   public static final int b = 2;
   public static final dvs c = dvi.ar;
   protected static final int d = 4;
   protected static final int e = 5;
   protected static final int f = 2;
   protected static final int g = 6;
   protected static final int h = 7;
   protected static final int i = 3;
   protected static final int j = 8;
   protected static final int k = 9;
   protected static final int l = 4;
   protected static final ezq[] m = new ezq[]{
      dhm.a(11.0, 7.0, 6.0, 15.0, 12.0, 10.0), dhm.a(9.0, 5.0, 5.0, 15.0, 12.0, 11.0), dhm.a(7.0, 3.0, 4.0, 15.0, 12.0, 12.0)
   };
   protected static final ezq[] n = new ezq[]{
      dhm.a(1.0, 7.0, 6.0, 5.0, 12.0, 10.0), dhm.a(1.0, 5.0, 5.0, 7.0, 12.0, 11.0), dhm.a(1.0, 3.0, 4.0, 9.0, 12.0, 12.0)
   };
   protected static final ezq[] o = new ezq[]{
      dhm.a(6.0, 7.0, 1.0, 10.0, 12.0, 5.0), dhm.a(5.0, 5.0, 1.0, 11.0, 12.0, 7.0), dhm.a(4.0, 3.0, 1.0, 12.0, 12.0, 9.0)
   };
   protected static final ezq[] G = new ezq[]{
      dhm.a(6.0, 7.0, 11.0, 10.0, 12.0, 15.0), dhm.a(5.0, 5.0, 9.0, 11.0, 12.0, 15.0), dhm.a(4.0, 3.0, 7.0, 12.0, 12.0, 15.0)
   };

   @Override
   public MapCodec<dit> a() {
      return a;
   }

   public dit(dur.d $$0) {
      super($$0);
      this.l(this.F.b().b(aF, jk.c).b(c, Integer.valueOf(0)));
   }

   @Override
   protected boolean f(dus $$0) {
      return $$0.c(c) < 2;
   }

   @Override
   protected void b(dus $$0, arj $$1, jf $$2, azn $$3) {
      if ($$1.z.a(5) == 0) {
         int $$4 = $$0.c(c);
         if ($$4 < 2) {
            $$1.a($$2, $$0.b(c, Integer.valueOf($$4 + 1)), 2);
         }
      }
   }

   @Override
   protected boolean a(dus $$0, dem $$1, jf $$2) {
      dus $$3 = $$1.a_($$2.a($$0.c(aF)));
      return $$3.a(awv.A);
   }

   @Override
   protected ezq a(dus $$0, ddo $$1, jf $$2, ezb $$3) {
      int $$4 = $$0.c(c);
      switch ((jk)$$0.c(aF)) {
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
   public dus a(czn $$0) {
      dus $$1 = this.n();
      dem $$2 = $$0.q();
      jf $$3 = $$0.a();

      for (jk $$4 : $$0.f()) {
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
   protected dus a(dus $$0, jk $$1, dus $$2, dek $$3, jf $$4, jf $$5) {
      return $$1 == $$0.c(aF) && !$$0.a($$3, $$4) ? dho.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public boolean b(dem $$0, jf $$1, dus $$2) {
      return $$2.c(c) < 2;
   }

   @Override
   public boolean a(dej $$0, azn $$1, jf $$2, dus $$3) {
      return true;
   }

   @Override
   public void a(arj $$0, azn $$1, jf $$2, dus $$3) {
      $$0.a($$2, $$3.b(c, Integer.valueOf($$3.c(c) + 1)), 2);
   }

   @Override
   protected void a(dut.a<dhm, dus> $$0) {
      $$0.a(aF, c);
   }

   @Override
   protected boolean a(dus $$0, eri $$1) {
      return false;
   }
}
