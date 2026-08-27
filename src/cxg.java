import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class cxg extends czu implements cwc {
   public static final MapCodec<cxg> a = b(cxg::new);
   public static final int b = 2;
   public static final djp c = djf.ar;
   protected static final int d = 4;
   protected static final int e = 5;
   protected static final int f = 2;
   protected static final int g = 6;
   protected static final int h = 7;
   protected static final int i = 3;
   protected static final int j = 8;
   protected static final int k = 9;
   protected static final int l = 4;
   protected static final elu[] m = new elu[]{
      cvz.a(11.0, 7.0, 6.0, 15.0, 12.0, 10.0), cvz.a(9.0, 5.0, 5.0, 15.0, 12.0, 11.0), cvz.a(7.0, 3.0, 4.0, 15.0, 12.0, 12.0)
   };
   protected static final elu[] n = new elu[]{
      cvz.a(1.0, 7.0, 6.0, 5.0, 12.0, 10.0), cvz.a(1.0, 5.0, 5.0, 7.0, 12.0, 11.0), cvz.a(1.0, 3.0, 4.0, 9.0, 12.0, 12.0)
   };
   protected static final elu[] o = new elu[]{
      cvz.a(6.0, 7.0, 1.0, 10.0, 12.0, 5.0), cvz.a(5.0, 5.0, 1.0, 11.0, 12.0, 7.0), cvz.a(4.0, 3.0, 1.0, 12.0, 12.0, 9.0)
   };
   protected static final elu[] F = new elu[]{
      cvz.a(6.0, 7.0, 11.0, 10.0, 12.0, 15.0), cvz.a(5.0, 5.0, 9.0, 11.0, 12.0, 15.0), cvz.a(4.0, 3.0, 7.0, 12.0, 12.0, 15.0)
   };

   @Override
   public MapCodec<cxg> a() {
      return a;
   }

   public cxg(dio.d $$0) {
      super($$0);
      this.k(this.E.b().a(aE, ia.c).a(c, Integer.valueOf(0)));
   }

   @Override
   public boolean e_(dip $$0) {
      return $$0.c(c) < 2;
   }

   @Override
   public void b(dip $$0, amp $$1, hv $$2, auf $$3) {
      if ($$1.z.a(5) == 0) {
         int $$4 = $$0.c(c);
         if ($$4 < 2) {
            $$1.a($$2, $$0.a(c, Integer.valueOf($$4 + 1)), 2);
         }
      }
   }

   @Override
   public boolean a(dip $$0, ctb $$1, hv $$2) {
      dip $$3 = $$1.a_($$2.a($$0.c(aE)));
      return $$3.a(arr.z);
   }

   @Override
   public elu a(dip $$0, cse $$1, hv $$2, elg $$3) {
      int $$4 = $$0.c(c);
      switch ((ia)$$0.c(aE)) {
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
   public dip a(coq $$0) {
      dip $$1 = this.o();
      ctb $$2 = $$0.q();
      hv $$3 = $$0.a();

      for (ia $$4 : $$0.f()) {
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
   public dip a(dip $$0, ia $$1, dip $$2, csz $$3, hv $$4, hv $$5) {
      return $$1 == $$0.c(aE) && !$$0.a($$3, $$4) ? cwb.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public boolean b(ctb $$0, hv $$1, dip $$2) {
      return $$2.c(c) < 2;
   }

   @Override
   public boolean a(csy $$0, auf $$1, hv $$2, dip $$3) {
      return true;
   }

   @Override
   public void a(amp $$0, auf $$1, hv $$2, dip $$3) {
      $$0.a($$2, $$3.a(c, Integer.valueOf($$3.c(c) + 1)), 2);
   }

   @Override
   protected void a(diq.a<cvz, dip> $$0) {
      $$0.a(aE, c);
   }

   @Override
   public boolean a(dip $$0, cse $$1, hv $$2, eep $$3) {
      return false;
   }
}
