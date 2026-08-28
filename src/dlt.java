import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dlt extends doj implements dko {
   public static final MapCodec<dlt> a = b(dlt::new);
   public static final int b = 2;
   public static final dyt c = dyk.as;
   protected static final int d = 4;
   protected static final int e = 5;
   protected static final int f = 2;
   protected static final int g = 6;
   protected static final int h = 7;
   protected static final int i = 3;
   protected static final int j = 8;
   protected static final int k = 9;
   protected static final int l = 4;
   protected static final fcr[] m = new fcr[]{
      dkl.a(11.0, 7.0, 6.0, 15.0, 12.0, 10.0), dkl.a(9.0, 5.0, 5.0, 15.0, 12.0, 11.0), dkl.a(7.0, 3.0, 4.0, 15.0, 12.0, 12.0)
   };
   protected static final fcr[] n = new fcr[]{
      dkl.a(1.0, 7.0, 6.0, 5.0, 12.0, 10.0), dkl.a(1.0, 5.0, 5.0, 7.0, 12.0, 11.0), dkl.a(1.0, 3.0, 4.0, 9.0, 12.0, 12.0)
   };
   protected static final fcr[] o = new fcr[]{
      dkl.a(6.0, 7.0, 1.0, 10.0, 12.0, 5.0), dkl.a(5.0, 5.0, 1.0, 11.0, 12.0, 7.0), dkl.a(4.0, 3.0, 1.0, 12.0, 12.0, 9.0)
   };
   protected static final fcr[] G = new fcr[]{
      dkl.a(6.0, 7.0, 11.0, 10.0, 12.0, 15.0), dkl.a(5.0, 5.0, 9.0, 11.0, 12.0, 15.0), dkl.a(4.0, 3.0, 7.0, 12.0, 12.0, 15.0)
   };

   @Override
   public MapCodec<dlt> a() {
      return a;
   }

   public dlt(dxt.d $$0) {
      super($$0);
      this.l(this.F.b().b(aF, jm.c).b(c, Integer.valueOf(0)));
   }

   @Override
   protected boolean f(dxu $$0) {
      return $$0.c(c) < 2;
   }

   @Override
   protected void b(dxu $$0, ash $$1, jh $$2, bam $$3) {
      if ($$1.A.a(5) == 0) {
         int $$4 = $$0.c(c);
         if ($$4 < 2) {
            $$1.a($$2, $$0.b(c, Integer.valueOf($$4 + 1)), 2);
         }
      }
   }

   @Override
   protected boolean a(dxu $$0, dhk $$1, jh $$2) {
      dxu $$3 = $$1.a_($$2.a($$0.c(aF)));
      return $$3.a(axu.B);
   }

   @Override
   protected fcr a(dxu $$0, dgm $$1, jh $$2, fcc $$3) {
      int $$4 = $$0.c(c);
      switch ((jm)$$0.c(aF)) {
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
   public dxu a(dbf $$0) {
      dxu $$1 = this.m();
      dhk $$2 = $$0.q();
      jh $$3 = $$0.a();

      for (jm $$4 : $$0.f()) {
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
   protected dxu a(dxu $$0, dhk $$1, dhw $$2, jh $$3, jm $$4, jh $$5, dxu $$6, bam $$7) {
      return $$4 == $$0.c(aF) && !$$0.a($$1, $$3) ? dkn.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   public boolean b(dhk $$0, jh $$1, dxu $$2) {
      return $$2.c(c) < 2;
   }

   @Override
   public boolean a(dhh $$0, bam $$1, jh $$2, dxu $$3) {
      return true;
   }

   @Override
   public void a(ash $$0, bam $$1, jh $$2, dxu $$3) {
      $$0.a($$2, $$3.b(c, Integer.valueOf($$3.c(c) + 1)), 2);
   }

   @Override
   protected void a(dxv.a<dkl, dxu> $$0) {
      $$0.a(aF, c);
   }

   @Override
   protected boolean a(dxu $$0, eul $$1) {
      return false;
   }
}
