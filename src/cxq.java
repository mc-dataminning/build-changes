import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class cxq extends dae implements cwm {
   public static final MapCodec<cxq> a = b(cxq::new);
   public static final int b = 2;
   public static final dka c = djq.ar;
   protected static final int d = 4;
   protected static final int e = 5;
   protected static final int f = 2;
   protected static final int g = 6;
   protected static final int h = 7;
   protected static final int i = 3;
   protected static final int j = 8;
   protected static final int k = 9;
   protected static final int l = 4;
   protected static final emf[] m = new emf[]{
      cwj.a(11.0, 7.0, 6.0, 15.0, 12.0, 10.0), cwj.a(9.0, 5.0, 5.0, 15.0, 12.0, 11.0), cwj.a(7.0, 3.0, 4.0, 15.0, 12.0, 12.0)
   };
   protected static final emf[] n = new emf[]{
      cwj.a(1.0, 7.0, 6.0, 5.0, 12.0, 10.0), cwj.a(1.0, 5.0, 5.0, 7.0, 12.0, 11.0), cwj.a(1.0, 3.0, 4.0, 9.0, 12.0, 12.0)
   };
   protected static final emf[] o = new emf[]{
      cwj.a(6.0, 7.0, 1.0, 10.0, 12.0, 5.0), cwj.a(5.0, 5.0, 1.0, 11.0, 12.0, 7.0), cwj.a(4.0, 3.0, 1.0, 12.0, 12.0, 9.0)
   };
   protected static final emf[] F = new emf[]{
      cwj.a(6.0, 7.0, 11.0, 10.0, 12.0, 15.0), cwj.a(5.0, 5.0, 9.0, 11.0, 12.0, 15.0), cwj.a(4.0, 3.0, 7.0, 12.0, 12.0, 15.0)
   };

   @Override
   public MapCodec<cxq> a() {
      return a;
   }

   public cxq(diz.d $$0) {
      super($$0);
      this.k(this.E.b().a(aE, ic.c).a(c, Integer.valueOf(0)));
   }

   @Override
   public boolean e_(dja $$0) {
      return $$0.c(c) < 2;
   }

   @Override
   public void b(dja $$0, amz $$1, hx $$2, aup $$3) {
      if ($$1.z.a(5) == 0) {
         int $$4 = $$0.c(c);
         if ($$4 < 2) {
            $$1.a($$2, $$0.a(c, Integer.valueOf($$4 + 1)), 2);
         }
      }
   }

   @Override
   public boolean a(dja $$0, ctl $$1, hx $$2) {
      dja $$3 = $$1.a_($$2.a($$0.c(aE)));
      return $$3.a(asb.z);
   }

   @Override
   public emf a(dja $$0, cso $$1, hx $$2, elr $$3) {
      int $$4 = $$0.c(c);
      switch ((ic)$$0.c(aE)) {
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
   public dja a(cpa $$0) {
      dja $$1 = this.o();
      ctl $$2 = $$0.q();
      hx $$3 = $$0.a();

      for (ic $$4 : $$0.f()) {
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
   public dja a(dja $$0, ic $$1, dja $$2, ctj $$3, hx $$4, hx $$5) {
      return $$1 == $$0.c(aE) && !$$0.a($$3, $$4) ? cwl.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public boolean b(ctl $$0, hx $$1, dja $$2) {
      return $$2.c(c) < 2;
   }

   @Override
   public boolean a(cti $$0, aup $$1, hx $$2, dja $$3) {
      return true;
   }

   @Override
   public void a(amz $$0, aup $$1, hx $$2, dja $$3) {
      $$0.a($$2, $$3.a(c, Integer.valueOf($$3.c(c) + 1)), 2);
   }

   @Override
   protected void a(djb.a<cwj, dja> $$0) {
      $$0.a(aE, c);
   }

   @Override
   public boolean a(dja $$0, cso $$1, hx $$2, efa $$3) {
      return false;
   }
}
