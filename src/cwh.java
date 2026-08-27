import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class cwh extends cyv implements cvd {
   public static final MapCodec<cwh> a = b(cwh::new);
   public static final int b = 2;
   public static final dii c = dhy.ar;
   protected static final int d = 4;
   protected static final int e = 5;
   protected static final int f = 2;
   protected static final int g = 6;
   protected static final int h = 7;
   protected static final int i = 3;
   protected static final int j = 8;
   protected static final int k = 9;
   protected static final int l = 4;
   protected static final ekn[] m = new ekn[]{
      cva.a(11.0, 7.0, 6.0, 15.0, 12.0, 10.0), cva.a(9.0, 5.0, 5.0, 15.0, 12.0, 11.0), cva.a(7.0, 3.0, 4.0, 15.0, 12.0, 12.0)
   };
   protected static final ekn[] n = new ekn[]{
      cva.a(1.0, 7.0, 6.0, 5.0, 12.0, 10.0), cva.a(1.0, 5.0, 5.0, 7.0, 12.0, 11.0), cva.a(1.0, 3.0, 4.0, 9.0, 12.0, 12.0)
   };
   protected static final ekn[] o = new ekn[]{
      cva.a(6.0, 7.0, 1.0, 10.0, 12.0, 5.0), cva.a(5.0, 5.0, 1.0, 11.0, 12.0, 7.0), cva.a(4.0, 3.0, 1.0, 12.0, 12.0, 9.0)
   };
   protected static final ekn[] F = new ekn[]{
      cva.a(6.0, 7.0, 11.0, 10.0, 12.0, 15.0), cva.a(5.0, 5.0, 9.0, 11.0, 12.0, 15.0), cva.a(4.0, 3.0, 7.0, 12.0, 12.0, 15.0)
   };

   @Override
   public MapCodec<cwh> a() {
      return a;
   }

   public cwh(dhh.d $$0) {
      super($$0);
      this.k(this.E.b().a(aE, hx.c).a(c, Integer.valueOf(0)));
   }

   @Override
   public boolean e_(dhi $$0) {
      return $$0.c(c) < 2;
   }

   @Override
   public void b(dhi $$0, ame $$1, ht $$2, ats $$3) {
      if ($$1.z.a(5) == 0) {
         int $$4 = $$0.c(c);
         if ($$4 < 2) {
            $$1.a($$2, $$0.a(c, Integer.valueOf($$4 + 1)), 2);
         }
      }
   }

   @Override
   public boolean a(dhi $$0, csd $$1, ht $$2) {
      dhi $$3 = $$1.a_($$2.a($$0.c(aE)));
      return $$3.a(arg.z);
   }

   @Override
   public ekn a(dhi $$0, crg $$1, ht $$2, ejz $$3) {
      int $$4 = $$0.c(c);
      switch ((hx)$$0.c(aE)) {
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
   public dhi a(cnr $$0) {
      dhi $$1 = this.o();
      csd $$2 = $$0.q();
      ht $$3 = $$0.a();

      for (hx $$4 : $$0.f()) {
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
   public dhi a(dhi $$0, hx $$1, dhi $$2, csb $$3, ht $$4, ht $$5) {
      return $$1 == $$0.c(aE) && !$$0.a($$3, $$4) ? cvc.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public boolean b(csd $$0, ht $$1, dhi $$2) {
      return $$2.c(c) < 2;
   }

   @Override
   public boolean a(csa $$0, ats $$1, ht $$2, dhi $$3) {
      return true;
   }

   @Override
   public void a(ame $$0, ats $$1, ht $$2, dhi $$3) {
      $$0.a($$2, $$3.a(c, Integer.valueOf($$3.c(c) + 1)), 2);
   }

   @Override
   protected void a(dhj.a<cva, dhi> $$0) {
      $$0.a(aE, c);
   }

   @Override
   public boolean a(dhi $$0, crg $$1, ht $$2, edi $$3) {
      return false;
   }
}
