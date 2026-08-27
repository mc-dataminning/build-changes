import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class cwm extends cza implements cvi {
   public static final MapCodec<cwm> a = b(cwm::new);
   public static final int b = 2;
   public static final din c = did.ar;
   protected static final int d = 4;
   protected static final int e = 5;
   protected static final int f = 2;
   protected static final int g = 6;
   protected static final int h = 7;
   protected static final int i = 3;
   protected static final int j = 8;
   protected static final int k = 9;
   protected static final int l = 4;
   protected static final eks[] m = new eks[]{
      cvf.a(11.0, 7.0, 6.0, 15.0, 12.0, 10.0), cvf.a(9.0, 5.0, 5.0, 15.0, 12.0, 11.0), cvf.a(7.0, 3.0, 4.0, 15.0, 12.0, 12.0)
   };
   protected static final eks[] n = new eks[]{
      cvf.a(1.0, 7.0, 6.0, 5.0, 12.0, 10.0), cvf.a(1.0, 5.0, 5.0, 7.0, 12.0, 11.0), cvf.a(1.0, 3.0, 4.0, 9.0, 12.0, 12.0)
   };
   protected static final eks[] o = new eks[]{
      cvf.a(6.0, 7.0, 1.0, 10.0, 12.0, 5.0), cvf.a(5.0, 5.0, 1.0, 11.0, 12.0, 7.0), cvf.a(4.0, 3.0, 1.0, 12.0, 12.0, 9.0)
   };
   protected static final eks[] F = new eks[]{
      cvf.a(6.0, 7.0, 11.0, 10.0, 12.0, 15.0), cvf.a(5.0, 5.0, 9.0, 11.0, 12.0, 15.0), cvf.a(4.0, 3.0, 7.0, 12.0, 12.0, 15.0)
   };

   @Override
   public MapCodec<cwm> a() {
      return a;
   }

   public cwm(dhm.d $$0) {
      super($$0);
      this.k(this.E.b().a(aE, ib.c).a(c, Integer.valueOf(0)));
   }

   @Override
   public boolean e_(dhn $$0) {
      return $$0.c(c) < 2;
   }

   @Override
   public void b(dhn $$0, ami $$1, hx $$2, atw $$3) {
      if ($$1.z.a(5) == 0) {
         int $$4 = $$0.c(c);
         if ($$4 < 2) {
            $$1.a($$2, $$0.a(c, Integer.valueOf($$4 + 1)), 2);
         }
      }
   }

   @Override
   public boolean a(dhn $$0, csi $$1, hx $$2) {
      dhn $$3 = $$1.a_($$2.a($$0.c(aE)));
      return $$3.a(ark.z);
   }

   @Override
   public eks a(dhn $$0, crl $$1, hx $$2, eke $$3) {
      int $$4 = $$0.c(c);
      switch ((ib)$$0.c(aE)) {
         case d:
            return F[$$4];
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
   public dhn a(cnw $$0) {
      dhn $$1 = this.o();
      csi $$2 = $$0.q();
      hx $$3 = $$0.a();

      for (ib $$4 : $$0.f()) {
         if ($$4.o().d()) {
            $$1 = $$1.a(aE, $$4);
            if ($$1.a($$2, $$3)) {
               return $$1;
            }
         }
      }

      return null;
   }

   @Override
   public dhn a(dhn $$0, ib $$1, dhn $$2, csg $$3, hx $$4, hx $$5) {
      return $$1 == $$0.c(aE) && !$$0.a($$3, $$4) ? cvh.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public boolean b(csi $$0, hx $$1, dhn $$2) {
      return $$2.c(c) < 2;
   }

   @Override
   public boolean a(csf $$0, atw $$1, hx $$2, dhn $$3) {
      return true;
   }

   @Override
   public void a(ami $$0, atw $$1, hx $$2, dhn $$3) {
      $$0.a($$2, $$3.a(c, Integer.valueOf($$3.c(c) + 1)), 2);
   }

   @Override
   protected void a(dho.a<cvf, dhn> $$0) {
      $$0.a(aE, c);
   }

   @Override
   public boolean a(dhn $$0, crl $$1, hx $$2, edn $$3) {
      return false;
   }
}
