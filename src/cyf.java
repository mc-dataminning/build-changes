import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class cyf extends dat implements cxb {
   public static final MapCodec<cyf> a = b(cyf::new);
   public static final int b = 2;
   public static final dkp c = dkf.ar;
   protected static final int d = 4;
   protected static final int e = 5;
   protected static final int f = 2;
   protected static final int g = 6;
   protected static final int h = 7;
   protected static final int i = 3;
   protected static final int j = 8;
   protected static final int k = 9;
   protected static final int l = 4;
   protected static final emv[] m = new emv[]{
      cwy.a(11.0, 7.0, 6.0, 15.0, 12.0, 10.0), cwy.a(9.0, 5.0, 5.0, 15.0, 12.0, 11.0), cwy.a(7.0, 3.0, 4.0, 15.0, 12.0, 12.0)
   };
   protected static final emv[] n = new emv[]{
      cwy.a(1.0, 7.0, 6.0, 5.0, 12.0, 10.0), cwy.a(1.0, 5.0, 5.0, 7.0, 12.0, 11.0), cwy.a(1.0, 3.0, 4.0, 9.0, 12.0, 12.0)
   };
   protected static final emv[] o = new emv[]{
      cwy.a(6.0, 7.0, 1.0, 10.0, 12.0, 5.0), cwy.a(5.0, 5.0, 1.0, 11.0, 12.0, 7.0), cwy.a(4.0, 3.0, 1.0, 12.0, 12.0, 9.0)
   };
   protected static final emv[] F = new emv[]{
      cwy.a(6.0, 7.0, 11.0, 10.0, 12.0, 15.0), cwy.a(5.0, 5.0, 9.0, 11.0, 12.0, 15.0), cwy.a(4.0, 3.0, 7.0, 12.0, 12.0, 15.0)
   };

   @Override
   public MapCodec<cyf> a() {
      return a;
   }

   public cyf(djo.d $$0) {
      super($$0);
      this.k(this.E.b().a(aE, ic.c).a(c, Integer.valueOf(0)));
   }

   @Override
   public boolean e_(djp $$0) {
      return $$0.c(c) < 2;
   }

   @Override
   public void b(djp $$0, ane $$1, hx $$2, auw $$3) {
      if ($$1.z.a(5) == 0) {
         int $$4 = $$0.c(c);
         if ($$4 < 2) {
            $$1.a($$2, $$0.a(c, Integer.valueOf($$4 + 1)), 2);
         }
      }
   }

   @Override
   public boolean a(djp $$0, cua $$1, hx $$2) {
      djp $$3 = $$1.a_($$2.a($$0.c(aE)));
      return $$3.a(asi.z);
   }

   @Override
   public emv a(djp $$0, ctd $$1, hx $$2, emh $$3) {
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
   public djp a(cpp $$0) {
      djp $$1 = this.o();
      cua $$2 = $$0.q();
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
   public djp a(djp $$0, ic $$1, djp $$2, cty $$3, hx $$4, hx $$5) {
      return $$1 == $$0.c(aE) && !$$0.a($$3, $$4) ? cxa.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public boolean b(cua $$0, hx $$1, djp $$2) {
      return $$2.c(c) < 2;
   }

   @Override
   public boolean a(ctx $$0, auw $$1, hx $$2, djp $$3) {
      return true;
   }

   @Override
   public void a(ane $$0, auw $$1, hx $$2, djp $$3) {
      $$0.a($$2, $$3.a(c, Integer.valueOf($$3.c(c) + 1)), 2);
   }

   @Override
   protected void a(djq.a<cwy, djp> $$0) {
      $$0.a(aE, c);
   }

   @Override
   public boolean a(djp $$0, ctd $$1, hx $$2, efp $$3) {
      return false;
   }
}
